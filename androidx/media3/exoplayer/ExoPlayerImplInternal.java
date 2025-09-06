package androidx.media3.exoplayer;

import android.os.Handler.Callback;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.Pair;
import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import androidx.media3.common.Format;
import androidx.media3.common.Metadata.Entry;
import androidx.media3.common.Metadata;
import androidx.media3.common.ParserException;
import androidx.media3.common.PlaybackParameters;
import androidx.media3.common.Timeline.Period;
import androidx.media3.common.Timeline.Window;
import androidx.media3.common.Timeline;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Clock;
import androidx.media3.common.util.HandlerWrapper;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.TraceUtil;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.DataSourceException;
import androidx.media3.datasource.TransferListener;
import androidx.media3.exoplayer.analytics.AnalyticsCollector;
import androidx.media3.exoplayer.analytics.PlayerId;
import androidx.media3.exoplayer.drm.DrmSession.DrmSessionException;
import androidx.media3.exoplayer.metadata.MetadataRenderer;
import androidx.media3.exoplayer.source.BehindLiveWindowException;
import androidx.media3.exoplayer.source.MediaPeriod.Callback;
import androidx.media3.exoplayer.source.MediaPeriod;
import androidx.media3.exoplayer.source.MediaSource.MediaPeriodId;
import androidx.media3.exoplayer.source.SampleStream;
import androidx.media3.exoplayer.source.SequenceableLoader;
import androidx.media3.exoplayer.source.ShuffleOrder;
import androidx.media3.exoplayer.source.TrackGroupArray;
import androidx.media3.exoplayer.text.TextRenderer;
import androidx.media3.exoplayer.trackselection.ExoTrackSelection;
import androidx.media3.exoplayer.trackselection.TrackSelector.InvalidationListener;
import androidx.media3.exoplayer.trackselection.TrackSelector;
import androidx.media3.exoplayer.trackselection.TrackSelectorResult;
import androidx.media3.exoplayer.upstream.Allocator;
import androidx.media3.exoplayer.upstream.BandwidthMeter;
import com.google.common.base.Q;
import com.google.common.collect.D4;
import com.google.common.collect.O2.a;
import com.google.common.collect.O2;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

final class ExoPlayerImplInternal implements Handler.Callback, PlaybackParametersListener, MediaSourceListInfoRefreshListener, Sender, Callback, InvalidationListener {
    static final class MediaSourceListUpdateMessage {
        private final List a;
        private final ShuffleOrder b;
        private final int c;
        private final long d;

        private MediaSourceListUpdateMessage(List list0, ShuffleOrder shuffleOrder0, int v, long v1) {
            this.a = list0;
            this.b = shuffleOrder0;
            this.c = v;
            this.d = v1;
        }

        MediaSourceListUpdateMessage(List list0, ShuffleOrder shuffleOrder0, int v, long v1, androidx.media3.exoplayer.ExoPlayerImplInternal.1 exoPlayerImplInternal$10) {
            this(list0, shuffleOrder0, v, v1);
        }
    }

    static class MoveMediaItemsMessage {
        public final int a;
        public final int b;
        public final int c;
        public final ShuffleOrder d;

        public MoveMediaItemsMessage(int v, int v1, int v2, ShuffleOrder shuffleOrder0) {
            this.a = v;
            this.b = v1;
            this.c = v2;
            this.d = shuffleOrder0;
        }
    }

    static final class PendingMessageInfo implements Comparable {
        public final PlayerMessage a;
        public int b;
        public long c;
        @Nullable
        public Object d;

        public PendingMessageInfo(PlayerMessage playerMessage0) {
            this.a = playerMessage0;
        }

        public int a(PendingMessageInfo exoPlayerImplInternal$PendingMessageInfo0) {
            Object object0 = this.d;
            if((object0 == null ? 1 : 0) != (exoPlayerImplInternal$PendingMessageInfo0.d == null ? 1 : 0)) {
                return object0 == null ? 1 : -1;
            }
            if(object0 == null) {
                return 0;
            }
            int v = this.b - exoPlayerImplInternal$PendingMessageInfo0.b;
            return v == 0 ? Util.u(this.c, exoPlayerImplInternal$PendingMessageInfo0.c) : v;
        }

        public void b(int v, long v1, Object object0) {
            this.b = v;
            this.c = v1;
            this.d = object0;
        }

        @Override
        public int compareTo(Object object0) {
            return this.a(((PendingMessageInfo)object0));
        }
    }

    public static final class PlaybackInfoUpdate {
        private boolean a;
        public PlaybackInfo b;
        public int c;
        public boolean d;
        public int e;

        public PlaybackInfoUpdate(PlaybackInfo playbackInfo0) {
            this.b = playbackInfo0;
        }

        public void b(int v) {
            this.a |= v > 0;
            this.c += v;
        }

        public void c(PlaybackInfo playbackInfo0) {
            this.a |= this.b != playbackInfo0;
            this.b = playbackInfo0;
        }

        public void d(int v) {
            boolean z = true;
            if(this.d && this.e != 5) {
                if(v != 5) {
                    z = false;
                }
                Assertions.a(z);
                return;
            }
            this.a = true;
            this.d = true;
            this.e = v;
        }
    }

    public interface PlaybackInfoUpdateListener {
        void a(PlaybackInfoUpdate arg1);
    }

    static final class PositionUpdateForPlaylistChange {
        public final MediaPeriodId a;
        public final long b;
        public final long c;
        public final boolean d;
        public final boolean e;
        public final boolean f;

        public PositionUpdateForPlaylistChange(MediaPeriodId mediaSource$MediaPeriodId0, long v, long v1, boolean z, boolean z1, boolean z2) {
            this.a = mediaSource$MediaPeriodId0;
            this.b = v;
            this.c = v1;
            this.d = z;
            this.e = z1;
            this.f = z2;
        }
    }

    static final class SeekPosition {
        public final Timeline a;
        public final int b;
        public final long c;

        public SeekPosition(Timeline timeline0, int v, long v1) {
            this.a = timeline0;
            this.b = v;
            this.c = v1;
        }
    }

    private PlaybackInfoUpdate A;
    private boolean B;
    private boolean C;
    private boolean D;
    private boolean E;
    private long F;
    private boolean G;
    private int H;
    private boolean I;
    private boolean J;
    private boolean K;
    private boolean L;
    private int M;
    private long M8;
    @Nullable
    private SeekPosition N;
    private PreloadConfiguration N8;
    private long O;
    private Timeline O8;
    private long P;
    private static final String P8 = "ExoPlayerImplInternal";
    private int Q;
    private static final int Q8 = 1;
    private static final int R8 = 2;
    private static final int S8 = 3;
    private static final int T8 = 4;
    private static final int U8 = 5;
    private static final int V8 = 6;
    private static final int W8 = 7;
    private boolean X;
    private static final int X8 = 8;
    @Nullable
    private ExoPlaybackException Y;
    private static final int Y8 = 9;
    private long Z;
    private static final int Z8 = 10;
    private final Renderer[] a;
    private static final int a9 = 11;
    private final Set b;
    private static final int b9 = 12;
    private final RendererCapabilities[] c;
    private static final int c9 = 13;
    private final TrackSelector d;
    private static final int d9 = 14;
    private final TrackSelectorResult e;
    private static final int e9 = 15;
    private final LoadControl f;
    private static final int f9 = 16;
    private final BandwidthMeter g;
    private static final int g9 = 17;
    private final HandlerWrapper h;
    private static final int h9 = 18;
    @Nullable
    private final HandlerThread i;
    private static final int i9 = 19;
    private final Looper j;
    private static final int j9 = 20;
    private final Window k;
    private static final int k9 = 21;
    private final Period l;
    private static final int l9 = 22;
    private final long m;
    private static final int m9 = 23;
    private final boolean n;
    private static final int n9 = 25;
    private final DefaultMediaClock o;
    private static final int o9 = 26;
    private final ArrayList p;
    private static final int p9 = 27;
    private final Clock q;
    private static final int q9 = 28;
    private final PlaybackInfoUpdateListener r;
    private static final int r9 = 29;
    private final MediaPeriodQueue s;
    private static final long s9 = 0L;
    private final MediaSourceList t;
    private static final long t9 = 1000L;
    private final LivePlaybackSpeedControl u;
    private static final long u9 = 4000L;
    private final long v;
    private static final long v9 = 500000L;
    private final PlayerId w;
    private final boolean x;
    private SeekParameters y;
    private PlaybackInfo z;

    static {
        ExoPlayerImplInternal.s9 = Util.B2(10000L);
    }

    public ExoPlayerImplInternal(Renderer[] arr_renderer, TrackSelector trackSelector0, TrackSelectorResult trackSelectorResult0, LoadControl loadControl0, BandwidthMeter bandwidthMeter0, int v, boolean z, AnalyticsCollector analyticsCollector0, SeekParameters seekParameters0, LivePlaybackSpeedControl livePlaybackSpeedControl0, long v1, boolean z1, boolean z2, Looper looper0, Clock clock0, PlaybackInfoUpdateListener exoPlayerImplInternal$PlaybackInfoUpdateListener0, PlayerId playerId0, Looper looper1, PreloadConfiguration exoPlayer$PreloadConfiguration0) {
        this.r = exoPlayerImplInternal$PlaybackInfoUpdateListener0;
        this.a = arr_renderer;
        this.d = trackSelector0;
        this.e = trackSelectorResult0;
        this.f = loadControl0;
        this.g = bandwidthMeter0;
        this.H = v;
        this.I = z;
        this.y = seekParameters0;
        this.u = livePlaybackSpeedControl0;
        this.v = v1;
        this.Z = v1;
        this.C = z1;
        this.x = z2;
        this.q = clock0;
        this.w = playerId0;
        this.N8 = exoPlayer$PreloadConfiguration0;
        this.M8 = 0x8000000000000001L;
        this.F = 0x8000000000000001L;
        this.m = loadControl0.j(playerId0);
        this.n = loadControl0.s(playerId0);
        this.O8 = Timeline.a;
        PlaybackInfo playbackInfo0 = PlaybackInfo.k(trackSelectorResult0);
        this.z = playbackInfo0;
        this.A = new PlaybackInfoUpdate(playbackInfo0);
        this.c = new RendererCapabilities[arr_renderer.length];
        Listener rendererCapabilities$Listener0 = trackSelector0.d();
        for(int v2 = 0; v2 < arr_renderer.length; ++v2) {
            arr_renderer[v2].v(v2, playerId0, clock0);
            this.c[v2] = arr_renderer[v2].B();
            if(rendererCapabilities$Listener0 != null) {
                this.c[v2].C(rendererCapabilities$Listener0);
            }
        }
        this.o = new DefaultMediaClock(this, clock0);
        this.p = new ArrayList();
        this.b = D4.z();
        this.k = new Window();
        this.l = new Period();
        trackSelector0.e(this, bandwidthMeter0);
        this.X = true;
        HandlerWrapper handlerWrapper0 = clock0.c(looper0, null);
        this.s = new MediaPeriodQueue(analyticsCollector0, handlerWrapper0, (MediaPeriodInfo mediaPeriodInfo0, long v) -> {
            Allocator allocator0 = this.f.n();
            return new MediaPeriodHolder(this.c, v, this.d, allocator0, this.t, mediaPeriodInfo0, this.e);
        }, exoPlayer$PreloadConfiguration0);
        this.t = new MediaSourceList(this, analyticsCollector0, handlerWrapper0, playerId0);
        if(looper1 == null) {
            HandlerThread handlerThread0 = new HandlerThread("ExoPlayer:Playback", -16);
            this.i = handlerThread0;
            handlerThread0.start();
            this.j = handlerThread0.getLooper();
        }
        else {
            this.i = null;
            this.j = looper1;
        }
        this.h = clock0.c(this.j, this);
    }

    public void A(long v) {
        this.Z = v;
    }

    private void A0() throws ExoPlaybackException {
        this.z0();
        this.M0(true);
    }

    private void A1() throws ExoPlaybackException {
        this.o.f();
        Renderer[] arr_renderer = this.a;
        for(int v = 0; v < arr_renderer.length; ++v) {
            Renderer renderer0 = arr_renderer[v];
            if(ExoPlayerImplInternal.W(renderer0)) {
                this.z(renderer0);
            }
        }
    }

    private O2 B(ExoTrackSelection[] arr_exoTrackSelection) {
        a o2$a0 = new a();
        boolean z = false;
        for(int v = 0; v < arr_exoTrackSelection.length; ++v) {
            ExoTrackSelection exoTrackSelection0 = arr_exoTrackSelection[v];
            if(exoTrackSelection0 != null) {
                Metadata metadata0 = exoTrackSelection0.q(0).k;
                if(metadata0 == null) {
                    o2$a0.j(new Metadata(new Entry[0]));
                }
                else {
                    o2$a0.j(metadata0);
                    z = true;
                }
            }
        }
        return z ? o2$a0.n() : O2.A();
    }

    private void B0(boolean z, boolean z1, boolean z2, boolean z3) {
        MediaPeriodId mediaSource$MediaPeriodId1;
        Timeline timeline1;
        long v5;
        long v4;
        this.h.o(2);
        ExoPlaybackException exoPlaybackException0 = null;
        this.Y = null;
        boolean z4 = true;
        this.I1(false, true);
        this.o.f();
        this.O = 1000000000000L;
        Renderer[] arr_renderer = this.a;
        for(int v = 0; v < arr_renderer.length; ++v) {
            Renderer renderer0 = arr_renderer[v];
            try {
                this.u(renderer0);
            }
            catch(ExoPlaybackException | RuntimeException exoPlaybackException1) {
                Log.e("ExoPlayerImplInternal", "Disable failed.", exoPlaybackException1);
            }
        }
        if(z) {
            Renderer[] arr_renderer1 = this.a;
            for(int v1 = 0; v1 < arr_renderer1.length; ++v1) {
                Renderer renderer1 = arr_renderer1[v1];
                if(this.b.remove(renderer1)) {
                    try {
                        renderer1.reset();
                    }
                    catch(RuntimeException runtimeException0) {
                        Log.e("ExoPlayerImplInternal", "Reset failed.", runtimeException0);
                    }
                }
            }
        }
        this.M = 0;
        MediaPeriodId mediaSource$MediaPeriodId0 = this.z.b;
        long v2 = this.z.s;
        long v3 = this.z.b.c() || ExoPlayerImplInternal.Y(this.z, this.l) ? this.z.c : this.z.s;
        if(z1) {
            this.N = null;
            Pair pair0 = this.G(this.z.a);
            mediaSource$MediaPeriodId0 = (MediaPeriodId)pair0.first;
            v2 = (long)(((Long)pair0.second));
            v3 = 0x8000000000000001L;
            if(!mediaSource$MediaPeriodId0.equals(this.z.b)) {
                v4 = v2;
                v5 = 0x8000000000000001L;
                goto label_46;
            }
            goto label_43;
        }
        else {
        label_43:
            v4 = v2;
            v5 = v3;
            z4 = false;
        }
    label_46:
        this.s.f();
        this.G = false;
        Timeline timeline0 = this.z.a;
        if(!z2 || !(timeline0 instanceof PlaylistTimeline)) {
            timeline1 = timeline0;
            mediaSource$MediaPeriodId1 = mediaSource$MediaPeriodId0;
        }
        else {
            timeline0 = ((PlaylistTimeline)timeline0).L(this.t.r());
            if(mediaSource$MediaPeriodId0.b == -1) {
                timeline1 = timeline0;
                mediaSource$MediaPeriodId1 = mediaSource$MediaPeriodId0;
            }
            else {
                timeline0.l(mediaSource$MediaPeriodId0.a, this.l);
                if(timeline0.t(this.l.c, this.k).i()) {
                    timeline1 = timeline0;
                    mediaSource$MediaPeriodId1 = new MediaPeriodId(mediaSource$MediaPeriodId0.a, mediaSource$MediaPeriodId0.d);
                }
                else {
                    timeline1 = timeline0;
                    mediaSource$MediaPeriodId1 = mediaSource$MediaPeriodId0;
                }
            }
        }
        PlaybackInfo playbackInfo0 = this.z;
        int v6 = playbackInfo0.e;
        if(!z3) {
            exoPlaybackException0 = playbackInfo0.f;
        }
        TrackGroupArray trackGroupArray0 = z4 ? TrackGroupArray.e : playbackInfo0.h;
        TrackSelectorResult trackSelectorResult0 = z4 ? this.e : playbackInfo0.i;
        List list0 = z4 ? O2.A() : playbackInfo0.j;
        this.z = new PlaybackInfo(timeline1, mediaSource$MediaPeriodId1, v5, v4, v6, exoPlaybackException0, false, trackGroupArray0, trackSelectorResult0, list0, mediaSource$MediaPeriodId1, this.z.l, this.z.m, this.z.n, this.z.o, v4, 0L, v4, 0L, false);
        if(z2) {
            this.s.H();
            this.t.B();
        }
    }

    private void B1() {
        MediaPeriodHolder mediaPeriodHolder0 = this.s.m();
        boolean z = this.G || mediaPeriodHolder0 != null && mediaPeriodHolder0.a.a();
        PlaybackInfo playbackInfo0 = this.z;
        if(z != playbackInfo0.g) {
            this.z = playbackInfo0.b(z);
        }
    }

    private long C() {
        return this.E(this.z.a, this.z.b.a, this.z.s);
    }

    private void C0() {
        MediaPeriodHolder mediaPeriodHolder0 = this.s.t();
        this.D = mediaPeriodHolder0 != null && mediaPeriodHolder0.f.h && this.C;
    }

    private void C1(MediaPeriodId mediaSource$MediaPeriodId0, TrackGroupArray trackGroupArray0, TrackSelectorResult trackSelectorResult0) {
        this.f.g(this.w, this.z.a, mediaSource$MediaPeriodId0, this.a, trackGroupArray0, trackSelectorResult0.c);
    }

    private static Format[] D(ExoTrackSelection exoTrackSelection0) {
        int v1 = exoTrackSelection0 == null ? 0 : exoTrackSelection0.length();
        Format[] arr_format = new Format[v1];
        for(int v = 0; v < v1; ++v) {
            arr_format[v] = exoTrackSelection0.q(v);
        }
        return arr_format;
    }

    private void D0(long v) throws ExoPlaybackException {
        MediaPeriodHolder mediaPeriodHolder0 = this.s.t();
        long v1 = mediaPeriodHolder0 == null ? v + 1000000000000L : mediaPeriodHolder0.B(v);
        this.O = v1;
        this.o.c(v1);
        Renderer[] arr_renderer = this.a;
        for(int v2 = 0; v2 < arr_renderer.length; ++v2) {
            Renderer renderer0 = arr_renderer[v2];
            if(ExoPlayerImplInternal.W(renderer0)) {
                renderer0.s(this.O);
            }
        }
        this.n0();
    }

    public void D1(int v, int v1, List list0) {
        this.h.i(27, v, v1, list0).a();
    }

    private long E(Timeline timeline0, Object object0, long v) {
        timeline0.t(timeline0.l(object0, this.l).c, this.k);
        if(this.k.f != 0x8000000000000001L && this.k.i()) {
            return this.k.i ? Util.F1(this.k.b() - this.k.f) - (v + this.l.r()) : 0x8000000000000001L;
        }
        return 0x8000000000000001L;
    }

    private static void E0(Timeline timeline0, PendingMessageInfo exoPlayerImplInternal$PendingMessageInfo0, Window timeline$Window0, Period timeline$Period0) {
        int v = timeline0.t(timeline0.l(exoPlayerImplInternal$PendingMessageInfo0.d, timeline$Period0).c, timeline$Window0).o;
        Object object0 = timeline0.k(v, timeline$Period0, true).b;
        exoPlayerImplInternal$PendingMessageInfo0.b(v, (timeline$Period0.d == 0x8000000000000001L ? 0x7FFFFFFFFFFFFFFFL : timeline$Period0.d - 1L), object0);
    }

    private void E1(int v, int v1, List list0) throws ExoPlaybackException {
        this.A.b(1);
        this.N(this.t.H(v, v1, list0), false);
    }

    private long F() {
        MediaPeriodHolder mediaPeriodHolder0 = this.s.u();
        if(mediaPeriodHolder0 == null) {
            return 0L;
        }
        long v = mediaPeriodHolder0.m();
        if(!mediaPeriodHolder0.d) {
            return v;
        }
        for(int v1 = 0; true; ++v1) {
            Renderer[] arr_renderer = this.a;
            if(v1 >= arr_renderer.length) {
                break;
            }
            if(ExoPlayerImplInternal.W(arr_renderer[v1]) && this.a[v1].e() == mediaPeriodHolder0.c[v1]) {
                long v2 = this.a[v1].r();
                if(v2 == 0x8000000000000000L) {
                    return 0x8000000000000000L;
                }
                v = Math.max(v2, v);
            }
        }
        return v;
    }

    private static boolean F0(PendingMessageInfo exoPlayerImplInternal$PendingMessageInfo0, Timeline timeline0, Timeline timeline1, int v, boolean z, Window timeline$Window0, Period timeline$Period0) {
        Object object0 = exoPlayerImplInternal$PendingMessageInfo0.d;
        if(object0 == null) {
            Pair pair0 = ExoPlayerImplInternal.I0(timeline0, new SeekPosition(exoPlayerImplInternal$PendingMessageInfo0.a.j(), exoPlayerImplInternal$PendingMessageInfo0.a.f(), (exoPlayerImplInternal$PendingMessageInfo0.a.h() == 0x8000000000000000L ? 0x8000000000000001L : Util.F1(exoPlayerImplInternal$PendingMessageInfo0.a.h()))), false, v, z, timeline$Window0, timeline$Period0);
            if(pair0 == null) {
                return false;
            }
            exoPlayerImplInternal$PendingMessageInfo0.b(timeline0.f(pair0.first), ((long)(((Long)pair0.second))), pair0.first);
            if(exoPlayerImplInternal$PendingMessageInfo0.a.h() == 0x8000000000000000L) {
                ExoPlayerImplInternal.E0(timeline0, exoPlayerImplInternal$PendingMessageInfo0, timeline$Window0, timeline$Period0);
            }
            return true;
        }
        int v1 = timeline0.f(object0);
        if(v1 == -1) {
            return false;
        }
        if(exoPlayerImplInternal$PendingMessageInfo0.a.h() == 0x8000000000000000L) {
            ExoPlayerImplInternal.E0(timeline0, exoPlayerImplInternal$PendingMessageInfo0, timeline$Window0, timeline$Period0);
            return true;
        }
        exoPlayerImplInternal$PendingMessageInfo0.b = v1;
        timeline1.l(exoPlayerImplInternal$PendingMessageInfo0.d, timeline$Period0);
        if(timeline$Period0.f && timeline1.t(timeline$Period0.c, timeline$Window0).n == timeline1.f(exoPlayerImplInternal$PendingMessageInfo0.d)) {
            long v2 = exoPlayerImplInternal$PendingMessageInfo0.c;
            Pair pair1 = timeline0.p(timeline$Window0, timeline$Period0, timeline0.l(exoPlayerImplInternal$PendingMessageInfo0.d, timeline$Period0).c, v2 + timeline$Period0.r());
            exoPlayerImplInternal$PendingMessageInfo0.b(timeline0.f(pair1.first), ((long)(((Long)pair1.second))), pair1.first);
        }
        return true;
    }

    private void F1() throws ExoPlaybackException {
        if(!this.z.a.w() && this.t.u()) {
            boolean z = this.e0();
            this.i0();
            this.j0();
            this.g0();
            this.h0(z);
        }
    }

    private Pair G(Timeline timeline0) {
        long v = 0L;
        if(timeline0.w()) {
            return Pair.create(PlaybackInfo.l(), 0L);
        }
        int v1 = timeline0.e(this.I);
        Pair pair0 = timeline0.p(this.k, this.l, v1, 0x8000000000000001L);
        MediaPeriodId mediaSource$MediaPeriodId0 = this.s.M(timeline0, pair0.first, 0L);
        long v2 = (long)(((Long)pair0.second));
        if(mediaSource$MediaPeriodId0.c()) {
            timeline0.l(mediaSource$MediaPeriodId0.a, this.l);
            int v3 = this.l.o(mediaSource$MediaPeriodId0.b);
            if(mediaSource$MediaPeriodId0.c == v3) {
                v = this.l.i();
            }
            v2 = v;
        }
        return Pair.create(mediaSource$MediaPeriodId0, v2);
    }

    private void G0(Timeline timeline0, Timeline timeline1) {
        if(timeline0.w() && timeline1.w()) {
            return;
        }
        for(int v = this.p.size() - 1; v >= 0; --v) {
            if(!ExoPlayerImplInternal.F0(((PendingMessageInfo)this.p.get(v)), timeline0, timeline1, this.H, this.I, this.k, this.l)) {
                ((PendingMessageInfo)this.p.get(v)).a.m(false);
                this.p.remove(v);
            }
        }
        Collections.sort(this.p);
    }

    private void G1() throws ExoPlaybackException {
        MediaPeriodHolder mediaPeriodHolder0 = this.s.t();
        if(mediaPeriodHolder0 == null) {
            return;
        }
        long v = mediaPeriodHolder0.d ? mediaPeriodHolder0.a.k() : 0x8000000000000001L;
        if(v == 0x8000000000000001L) {
            long v1 = this.o.g(mediaPeriodHolder0 != this.s.u());
            this.O = v1;
            long v2 = mediaPeriodHolder0.A(v1);
            this.d0(this.z.s, v2);
            if(this.o.j()) {
                this.z = this.R(this.z.b, v2, this.z.c, v2, !this.A.d, 6);
            }
            else {
                this.z.o(v2);
            }
        }
        else {
            if(!mediaPeriodHolder0.s()) {
                this.s.I(mediaPeriodHolder0);
                this.M(false);
                this.b0();
            }
            this.D0(v);
            if(v != this.z.s) {
                this.z = this.R(this.z.b, v, this.z.c, v, true, 5);
            }
        }
        PlaybackInfo playbackInfo0 = this.z;
        playbackInfo0.q = this.s.m().j();
        this.z.r = this.I();
        if(this.z.l && this.z.e == 3 && this.w1(this.z.a, this.z.b) && this.z.o.a == 1.0f) {
            long v3 = this.C();
            long v4 = this.I();
            float f = this.u.b(v3, v4);
            if(this.o.m().a != f) {
                this.X0(this.z.o.d(f));
                this.P(this.z.o, this.o.m().a, false, false);
            }
        }
    }

    public Looper H() {
        return this.j;
    }

    private static PositionUpdateForPlaylistChange H0(Timeline timeline0, PlaybackInfo playbackInfo0, @Nullable SeekPosition exoPlayerImplInternal$SeekPosition0, MediaPeriodQueue mediaPeriodQueue0, int v, boolean z, Window timeline$Window0, Period timeline$Period0) {
        long v7;
        boolean z9;
        int v5;
        MediaPeriodId mediaSource$MediaPeriodId1;
        int v4;
        boolean z8;
        boolean z7;
        boolean z6;
        boolean z5;
        boolean z4;
        boolean z3;
        long v3;
        int v2;
        if(timeline0.w()) {
            return new PositionUpdateForPlaylistChange(PlaybackInfo.l(), 0L, 0x8000000000000001L, false, true, false);
        }
        MediaPeriodId mediaSource$MediaPeriodId0 = playbackInfo0.b;
        Object object0 = mediaSource$MediaPeriodId0.a;
        boolean z1 = ExoPlayerImplInternal.Y(playbackInfo0, timeline$Period0);
        long v1 = playbackInfo0.b.c() || z1 ? playbackInfo0.c : playbackInfo0.s;
        boolean z2 = true;
        if(exoPlayerImplInternal$SeekPosition0 != null) {
            Pair pair0 = ExoPlayerImplInternal.I0(timeline0, exoPlayerImplInternal$SeekPosition0, true, v, z, timeline$Window0, timeline$Period0);
            if(pair0 == null) {
                v2 = timeline0.e(z);
                v3 = v1;
                z3 = false;
                z4 = false;
                z5 = true;
            }
            else {
                if(exoPlayerImplInternal$SeekPosition0.c == 0x8000000000000001L) {
                    v2 = timeline0.l(pair0.first, timeline$Period0).c;
                    v3 = v1;
                    z3 = false;
                }
                else {
                    object0 = pair0.first;
                    v3 = (long)(((Long)pair0.second));
                    z3 = true;
                    v2 = -1;
                }
                z4 = playbackInfo0.e == 4;
                z5 = false;
            }
            z6 = z3;
            z7 = z4;
            z8 = z5;
            v4 = v2;
            mediaSource$MediaPeriodId1 = mediaSource$MediaPeriodId0;
        }
        else if(playbackInfo0.a.w()) {
            v5 = timeline0.e(z);
            goto label_51;
        }
        else if(timeline0.f(object0) == -1) {
            int v6 = ExoPlayerImplInternal.J0(timeline$Window0, timeline$Period0, v, z, object0, playbackInfo0.a, timeline0);
            if(v6 == -1) {
                v6 = timeline0.e(z);
                z9 = true;
            }
            else {
                z9 = false;
            }
            v4 = v6;
            z8 = z9;
            v3 = v1;
            mediaSource$MediaPeriodId1 = mediaSource$MediaPeriodId0;
            z7 = false;
            z6 = false;
        }
        else if(v1 == 0x8000000000000001L) {
            v5 = timeline0.l(object0, timeline$Period0).c;
        label_51:
            v4 = v5;
            v3 = v1;
            mediaSource$MediaPeriodId1 = mediaSource$MediaPeriodId0;
            z7 = false;
            z8 = false;
            z6 = false;
        }
        else if(z1) {
            mediaSource$MediaPeriodId1 = mediaSource$MediaPeriodId0;
            playbackInfo0.a.l(mediaSource$MediaPeriodId1.a, timeline$Period0);
            if(playbackInfo0.a.t(timeline$Period0.c, timeline$Window0).n == playbackInfo0.a.f(mediaSource$MediaPeriodId1.a)) {
                Pair pair1 = timeline0.p(timeline$Window0, timeline$Period0, timeline0.l(object0, timeline$Period0).c, v1 + timeline$Period0.r());
                object0 = pair1.first;
                v3 = (long)(((Long)pair1.second));
            }
            else {
                v3 = v1;
            }
            v4 = -1;
            z7 = false;
            z8 = false;
            z6 = true;
        }
        else {
            mediaSource$MediaPeriodId1 = mediaSource$MediaPeriodId0;
            v3 = v1;
            z7 = false;
            z8 = false;
            z6 = false;
            v4 = -1;
        }
        if(v4 == -1) {
            v7 = v3;
        }
        else {
            Pair pair2 = timeline0.p(timeline$Window0, timeline$Period0, v4, 0x8000000000000001L);
            object0 = pair2.first;
            v3 = (long)(((Long)pair2.second));
            v7 = 0x8000000000000001L;
        }
        MediaPeriodId mediaSource$MediaPeriodId2 = mediaPeriodQueue0.M(timeline0, object0, v3);
        if(!mediaSource$MediaPeriodId1.a.equals(object0) || mediaSource$MediaPeriodId1.c() || mediaSource$MediaPeriodId2.c() || mediaSource$MediaPeriodId2.e != -1 && (mediaSource$MediaPeriodId1.e == -1 || mediaSource$MediaPeriodId2.e < mediaSource$MediaPeriodId1.e)) {
            z2 = false;
        }
        if(z2 || ExoPlayerImplInternal.U(z1, mediaSource$MediaPeriodId1, v1, mediaSource$MediaPeriodId2, timeline0.l(object0, timeline$Period0), v7)) {
            mediaSource$MediaPeriodId2 = mediaSource$MediaPeriodId1;
        }
        if(mediaSource$MediaPeriodId2.c()) {
            if(mediaSource$MediaPeriodId2.equals(mediaSource$MediaPeriodId1)) {
                return new PositionUpdateForPlaylistChange(mediaSource$MediaPeriodId2, playbackInfo0.s, v7, z7, z8, z6);
            }
            timeline0.l(mediaSource$MediaPeriodId2.a, timeline$Period0);
            int v8 = timeline$Period0.o(mediaSource$MediaPeriodId2.b);
            return mediaSource$MediaPeriodId2.c == v8 ? new PositionUpdateForPlaylistChange(mediaSource$MediaPeriodId2, timeline$Period0.i(), v7, z7, z8, z6) : new PositionUpdateForPlaylistChange(mediaSource$MediaPeriodId2, 0L, v7, z7, z8, z6);
        }
        return new PositionUpdateForPlaylistChange(mediaSource$MediaPeriodId2, v3, v7, z7, z8, z6);
    }

    private void H1(Timeline timeline0, MediaPeriodId mediaSource$MediaPeriodId0, Timeline timeline1, MediaPeriodId mediaSource$MediaPeriodId1, long v, boolean z) throws ExoPlaybackException {
        if(!this.w1(timeline0, mediaSource$MediaPeriodId0)) {
            PlaybackParameters playbackParameters0 = mediaSource$MediaPeriodId0.c() ? PlaybackParameters.d : this.z.o;
            if(!this.o.m().equals(playbackParameters0)) {
                this.X0(playbackParameters0);
                this.P(this.z.o, playbackParameters0.a, false, false);
            }
            return;
        }
        timeline0.t(timeline0.l(mediaSource$MediaPeriodId0.a, this.l).c, this.k);
        this.u.a(this.k.j);
        if(v != 0x8000000000000001L) {
            long v1 = this.E(timeline0, mediaSource$MediaPeriodId0.a, v);
            this.u.e(v1);
            return;
        }
        Object object0 = this.k.a;
        if(!Util.g((timeline1.w() ? null : timeline1.t(timeline1.l(mediaSource$MediaPeriodId1.a, this.l).c, this.k).a), object0) || z) {
            this.u.e(0x8000000000000001L);
        }
    }

    private long I() {
        return this.J(this.z.q);
    }

    @Nullable
    private static Pair I0(Timeline timeline0, SeekPosition exoPlayerImplInternal$SeekPosition0, boolean z, int v, boolean z1, Window timeline$Window0, Period timeline$Period0) {
        Pair pair0;
        Timeline timeline1 = exoPlayerImplInternal$SeekPosition0.a;
        if(timeline0.w()) {
            return null;
        }
        Timeline timeline2 = timeline1.w() ? timeline0 : timeline1;
        try {
            pair0 = timeline2.p(timeline$Window0, timeline$Period0, exoPlayerImplInternal$SeekPosition0.b, exoPlayerImplInternal$SeekPosition0.c);
        }
        catch(IndexOutOfBoundsException unused_ex) {
            return null;
        }
        if(timeline0.equals(timeline2)) {
            return pair0;
        }
        if(timeline0.f(pair0.first) != -1) {
            return !timeline2.l(pair0.first, timeline$Period0).f || timeline2.t(timeline$Period0.c, timeline$Window0).n != timeline2.f(pair0.first) ? pair0 : timeline0.p(timeline$Window0, timeline$Period0, timeline0.l(pair0.first, timeline$Period0).c, exoPlayerImplInternal$SeekPosition0.c);
        }
        if(z) {
            int v1 = ExoPlayerImplInternal.J0(timeline$Window0, timeline$Period0, v, z1, pair0.first, timeline2, timeline0);
            return v1 == -1 ? null : timeline0.p(timeline$Window0, timeline$Period0, v1, 0x8000000000000001L);
        }
        return null;
    }

    private void I1(boolean z, boolean z1) {
        this.E = z;
        this.F = !z || z1 ? 0x8000000000000001L : this.q.elapsedRealtime();
    }

    private long J(long v) {
        MediaPeriodHolder mediaPeriodHolder0 = this.s.m();
        return mediaPeriodHolder0 == null ? 0L : Math.max(0L, v - mediaPeriodHolder0.A(this.O));
    }

    static int J0(Window timeline$Window0, Period timeline$Period0, int v, boolean z, Object object0, Timeline timeline0, Timeline timeline1) {
        Object object1 = timeline0.t(timeline0.l(object0, timeline$Period0).c, timeline$Window0).a;
        for(int v2 = 0; v2 < timeline1.v(); ++v2) {
            if(timeline1.t(v2, timeline$Window0).a.equals(object1)) {
                return v2;
            }
        }
        int v3 = timeline0.f(object0);
        int v4 = timeline0.m();
        int v5 = v3;
        int v6 = -1;
        for(int v1 = 0; v1 < v4 && v6 == -1; ++v1) {
            v5 = timeline0.h(v5, timeline$Period0, timeline$Window0, v, z);
            if(v5 == -1) {
                break;
            }
            v6 = timeline1.f(timeline0.s(v5));
        }
        return v6 == -1 ? -1 : timeline1.j(v6, timeline$Period0).c;
    }

    private void J1(float f) {
        for(MediaPeriodHolder mediaPeriodHolder0 = this.s.t(); mediaPeriodHolder0 != null; mediaPeriodHolder0 = mediaPeriodHolder0.k()) {
            ExoTrackSelection[] arr_exoTrackSelection = mediaPeriodHolder0.p().c;
            for(int v = 0; v < arr_exoTrackSelection.length; ++v) {
                ExoTrackSelection exoTrackSelection0 = arr_exoTrackSelection[v];
                if(exoTrackSelection0 != null) {
                    exoTrackSelection0.s(f);
                }
            }
        }
    }

    private void K(MediaPeriod mediaPeriod0) {
        if(!this.s.B(mediaPeriod0)) {
            return;
        }
        this.s.F(this.O);
        this.b0();
    }

    private void K0(long v) {
        long v1 = this.z.e != 3 || !this.x && this.u1() ? ExoPlayerImplInternal.s9 : 1000L;
        if(this.x && this.u1()) {
            Renderer[] arr_renderer = this.a;
            for(int v2 = 0; v2 < arr_renderer.length; ++v2) {
                Renderer renderer0 = arr_renderer[v2];
                if(ExoPlayerImplInternal.W(renderer0)) {
                    v1 = Math.min(v1, Util.B2(renderer0.z(this.O, this.P)));
                }
            }
        }
        this.h.n(2, v + v1);
    }

    private void K1(Q q0, long v) {
        synchronized(this) {
            long v2 = this.q.elapsedRealtime() + v;
            boolean z = false;
            while(!((Boolean)q0.get()).booleanValue() && v > 0L) {
                try {
                    this.q.b();
                    this.wait(v);
                }
                catch(InterruptedException unused_ex) {
                    z = true;
                }
                v = v2 - this.q.elapsedRealtime();
            }
            if(z) {
                Thread.currentThread().interrupt();
            }
        }
    }

    private void L(IOException iOException0, int v) {
        ExoPlaybackException exoPlaybackException0 = ExoPlaybackException.m(iOException0, v);
        MediaPeriodHolder mediaPeriodHolder0 = this.s.t();
        if(mediaPeriodHolder0 != null) {
            exoPlaybackException0 = exoPlaybackException0.j(mediaPeriodHolder0.f.a);
        }
        Log.e("ExoPlayerImplInternal", "Playback error", exoPlaybackException0);
        this.z1(false, false);
        this.z = this.z.f(exoPlaybackException0);
    }

    public void L0(Timeline timeline0, int v, long v1) {
        SeekPosition exoPlayerImplInternal$SeekPosition0 = new SeekPosition(timeline0, v, v1);
        this.h.e(3, exoPlayerImplInternal$SeekPosition0).a();
    }

    private void M(boolean z) {
        MediaPeriodHolder mediaPeriodHolder0 = this.s.m();
        MediaPeriodId mediaSource$MediaPeriodId0 = mediaPeriodHolder0 == null ? this.z.b : mediaPeriodHolder0.f.a;
        boolean z1 = this.z.k.equals(mediaSource$MediaPeriodId0);
        if(!z1) {
            this.z = this.z.c(mediaSource$MediaPeriodId0);
        }
        PlaybackInfo playbackInfo0 = this.z;
        playbackInfo0.q = mediaPeriodHolder0 == null ? playbackInfo0.s : mediaPeriodHolder0.j();
        this.z.r = this.I();
        if((!z1 || z) && mediaPeriodHolder0 != null && mediaPeriodHolder0.d) {
            this.C1(mediaPeriodHolder0.f.a, mediaPeriodHolder0.o(), mediaPeriodHolder0.p());
        }
    }

    private void M0(boolean z) throws ExoPlaybackException {
        MediaPeriodId mediaSource$MediaPeriodId0 = this.s.t().f.a;
        long v = this.P0(mediaSource$MediaPeriodId0, this.z.s, true, false);
        if(v != this.z.s) {
            this.z = this.R(mediaSource$MediaPeriodId0, v, this.z.c, this.z.d, z, 5);
        }
    }

    private void N(Timeline timeline0, boolean z) throws ExoPlaybackException {
        long v6;
        long v = 0x8000000000000001L;
        PositionUpdateForPlaylistChange exoPlayerImplInternal$PositionUpdateForPlaylistChange0 = ExoPlayerImplInternal.H0(timeline0, this.z, this.N, this.s, this.H, this.I, this.k, this.l);
        MediaPeriodId mediaSource$MediaPeriodId0 = exoPlayerImplInternal$PositionUpdateForPlaylistChange0.a;
        long v1 = exoPlayerImplInternal$PositionUpdateForPlaylistChange0.c;
        boolean z1 = exoPlayerImplInternal$PositionUpdateForPlaylistChange0.d;
        long v2 = exoPlayerImplInternal$PositionUpdateForPlaylistChange0.b;
        boolean z2 = !this.z.b.equals(mediaSource$MediaPeriodId0) || v2 != this.z.s;
        try {
            if(exoPlayerImplInternal$PositionUpdateForPlaylistChange0.e) {
                if(this.z.e != 1) {
                    this.r1(4);
                }
                this.B0(false, false, false, true);
            }
            Renderer[] arr_renderer = this.a;
            for(int v3 = 0; v3 < arr_renderer.length; ++v3) {
                arr_renderer[v3].A(timeline0);
            }
            if(!z2) {
                long v4 = this.O;
                long v5 = this.F();
                if(!this.s.S(timeline0, v4, v5)) {
                    this.M0(false);
                }
                v6 = v2;
            }
            else if(timeline0.w()) {
                v6 = v2;
            }
            else {
                for(MediaPeriodHolder mediaPeriodHolder0 = this.s.t(); mediaPeriodHolder0 != null; mediaPeriodHolder0 = mediaPeriodHolder0.k()) {
                    if(mediaPeriodHolder0.f.a.equals(mediaSource$MediaPeriodId0)) {
                        mediaPeriodHolder0.f = this.s.v(timeline0, mediaPeriodHolder0.f);
                        mediaPeriodHolder0.C();
                    }
                }
                v6 = this.O0(mediaSource$MediaPeriodId0, v2, z1);
            }
        }
        catch(Throwable throwable0) {
            Timeline timeline1 = this.z.a;
            MediaPeriodId mediaSource$MediaPeriodId1 = this.z.b;
            if(exoPlayerImplInternal$PositionUpdateForPlaylistChange0.f) {
                v = v2;
            }
            this.H1(timeline0, mediaSource$MediaPeriodId0, timeline1, mediaSource$MediaPeriodId1, v, false);
            if(z2 || v1 != this.z.c) {
                Object object0 = this.z.b.a;
                Timeline timeline2 = this.z.a;
                boolean z3 = z2 && z && !timeline2.w() && !timeline2.l(object0, this.l).f;
                this.z = this.R(mediaSource$MediaPeriodId0, v2, v1, this.z.d, z3, (timeline0.f(object0) == -1 ? 4 : 3));
            }
            this.C0();
            this.G0(timeline0, this.z.a);
            this.z = this.z.j(timeline0);
            if(!timeline0.w()) {
                this.N = null;
            }
            this.M(false);
            this.h.m(2);
            throw throwable0;
        }
        this.H1(timeline0, mediaSource$MediaPeriodId0, this.z.a, this.z.b, (exoPlayerImplInternal$PositionUpdateForPlaylistChange0.f ? v6 : 0x8000000000000001L), false);
        if(z2 || v1 != this.z.c) {
            Object object1 = this.z.b.a;
            Timeline timeline3 = this.z.a;
            boolean z4 = z2 && z && !timeline3.w() && !timeline3.l(object1, this.l).f;
            this.z = this.R(mediaSource$MediaPeriodId0, v6, v1, this.z.d, z4, (timeline0.f(object1) == -1 ? 4 : 3));
        }
        this.C0();
        this.G0(timeline0, this.z.a);
        this.z = this.z.j(timeline0);
        if(!timeline0.w()) {
            this.N = null;
        }
        this.M(false);
        this.h.m(2);
    }

    private void N0(SeekPosition exoPlayerImplInternal$SeekPosition0) throws ExoPlaybackException {
        long v9;
        long v8;
        long v7;
        long v6;
        long v4;
        long v3;
        int v2;
        long v1;
        MediaPeriodId mediaSource$MediaPeriodId0;
        int v = 1;
        this.A.b(1);
        Pair pair0 = ExoPlayerImplInternal.I0(this.z.a, exoPlayerImplInternal$SeekPosition0, true, this.H, this.I, this.k, this.l);
        if(pair0 == null) {
            Pair pair1 = this.G(this.z.a);
            mediaSource$MediaPeriodId0 = (MediaPeriodId)pair1.first;
            v1 = (long)(((Long)pair1.second));
            v2 = !this.z.a.w();
            v3 = v1;
            v4 = 0x8000000000000001L;
        }
        else {
            Object object0 = pair0.first;
            v1 = (long)(((Long)pair0.second));
            long v5 = exoPlayerImplInternal$SeekPosition0.c == 0x8000000000000001L ? 0x8000000000000001L : v1;
            MediaPeriodId mediaSource$MediaPeriodId1 = this.s.M(this.z.a, object0, v1);
            if(mediaSource$MediaPeriodId1.c()) {
                this.z.a.l(mediaSource$MediaPeriodId1.a, this.l);
                v3 = this.l.o(mediaSource$MediaPeriodId1.b) == mediaSource$MediaPeriodId1.c ? this.l.i() : 0L;
                v4 = v5;
                v2 = 1;
                mediaSource$MediaPeriodId0 = mediaSource$MediaPeriodId1;
            }
            else {
                v2 = exoPlayerImplInternal$SeekPosition0.c == 0x8000000000000001L ? 1 : 0;
                mediaSource$MediaPeriodId0 = mediaSource$MediaPeriodId1;
                v3 = v1;
                v4 = v5;
            }
        }
        try {
            if(this.z.a.w()) {
                this.N = exoPlayerImplInternal$SeekPosition0;
                v8 = v3;
                this.z = this.R(mediaSource$MediaPeriodId0, v8, v4, v8, ((boolean)v2), 2);
                return;
            }
            else if(pair0 == null) {
                if(this.z.e != 1) {
                    this.r1(4);
                }
                this.B0(false, true, false, true);
                v8 = v3;
                this.z = this.R(mediaSource$MediaPeriodId0, v8, v4, v8, ((boolean)v2), 2);
                return;
            }
            else {
                if(mediaSource$MediaPeriodId0.equals(this.z.b)) {
                    MediaPeriodHolder mediaPeriodHolder0 = this.s.t();
                    v6 = mediaPeriodHolder0 == null || !mediaPeriodHolder0.d || v3 == 0L ? v3 : mediaPeriodHolder0.a.c(v3, this.y);
                    if(Util.B2(v6) == Util.B2(this.z.s)) {
                        goto label_38;
                    }
                }
                else {
                    v6 = v3;
                }
                goto label_42;
            }
            this.z = this.R(mediaSource$MediaPeriodId0, v8, v4, v8, ((boolean)v2), 2);
            return;
        }
        catch(Throwable throwable0) {
            v9 = v3;
            this.z = this.R(mediaSource$MediaPeriodId0, v9, v4, v9, ((boolean)v2), 2);
            throw throwable0;
        }
    label_38:
        PlaybackInfo playbackInfo0 = this.z;
        if(playbackInfo0.e == 2 || playbackInfo0.e == 3) {
            this.z = this.R(mediaSource$MediaPeriodId0, playbackInfo0.s, v4, playbackInfo0.s, ((boolean)v2), 2);
            return;
        }
        try {
        label_42:
            v7 = this.O0(mediaSource$MediaPeriodId0, v6, this.z.e == 4);
            if(v3 == v7) {
                goto label_44;
            }
            goto label_45;
        }
        catch(Throwable throwable0) {
            v9 = v3;
            this.z = this.R(mediaSource$MediaPeriodId0, v9, v4, v9, ((boolean)v2), 2);
            throw throwable0;
        }
    label_44:
        v = 0;
        try {
        label_45:
            v2 |= v;
            this.H1(this.z.a, mediaSource$MediaPeriodId0, this.z.a, this.z.b, v4, true);
            v8 = v7;
            this.z = this.R(mediaSource$MediaPeriodId0, v8, v4, v8, ((boolean)v2), 2);
            return;
        }
        catch(Throwable throwable0) {
            v9 = v7;
            this.z = this.R(mediaSource$MediaPeriodId0, v9, v4, v9, ((boolean)v2), 2);
            throw throwable0;
        }
        try {
            this.N = exoPlayerImplInternal$SeekPosition0;
            v8 = v3;
            this.z = this.R(mediaSource$MediaPeriodId0, v8, v4, v8, ((boolean)v2), 2);
            return;
        }
        catch(Throwable throwable0) {
            v9 = v3;
        }
        this.z = this.R(mediaSource$MediaPeriodId0, v9, v4, v9, ((boolean)v2), 2);
        throw throwable0;
    }

    private void O(MediaPeriod mediaPeriod0) throws ExoPlaybackException {
        if(!this.s.B(mediaPeriod0)) {
            return;
        }
        MediaPeriodHolder mediaPeriodHolder0 = this.s.m();
        mediaPeriodHolder0.q(this.o.m().a, this.z.a);
        this.C1(mediaPeriodHolder0.f.a, mediaPeriodHolder0.o(), mediaPeriodHolder0.p());
        if(mediaPeriodHolder0 == this.s.t()) {
            this.D0(mediaPeriodHolder0.f.b);
            this.x();
            this.z = this.R(this.z.b, mediaPeriodHolder0.f.b, this.z.c, mediaPeriodHolder0.f.b, false, 5);
        }
        this.b0();
    }

    private long O0(MediaPeriodId mediaSource$MediaPeriodId0, long v, boolean z) throws ExoPlaybackException {
        return this.s.t() == this.s.u() ? this.P0(mediaSource$MediaPeriodId0, v, false, z) : this.P0(mediaSource$MediaPeriodId0, v, true, z);
    }

    private void P(PlaybackParameters playbackParameters0, float f, boolean z, boolean z1) throws ExoPlaybackException {
        if(z) {
            if(z1) {
                this.A.b(1);
            }
            this.z = this.z.g(playbackParameters0);
        }
        this.J1(playbackParameters0.a);
        Renderer[] arr_renderer = this.a;
        for(int v = 0; v < arr_renderer.length; ++v) {
            Renderer renderer0 = arr_renderer[v];
            if(renderer0 != null) {
                renderer0.E(f, playbackParameters0.a);
            }
        }
    }

    private long P0(MediaPeriodId mediaSource$MediaPeriodId0, long v, boolean z, boolean z1) throws ExoPlaybackException {
        this.A1();
        this.I1(false, true);
        if(z1 || this.z.e == 3) {
            this.r1(2);
        }
        MediaPeriodHolder mediaPeriodHolder0 = this.s.t();
        MediaPeriodHolder mediaPeriodHolder1;
        for(mediaPeriodHolder1 = mediaPeriodHolder0; mediaPeriodHolder1 != null && !mediaSource$MediaPeriodId0.equals(mediaPeriodHolder1.f.a); mediaPeriodHolder1 = mediaPeriodHolder1.k()) {
        }
        if(z || mediaPeriodHolder0 != mediaPeriodHolder1 || mediaPeriodHolder1 != null && mediaPeriodHolder1.B(v) < 0L) {
            Renderer[] arr_renderer = this.a;
            for(int v1 = 0; v1 < arr_renderer.length; ++v1) {
                this.u(arr_renderer[v1]);
            }
            if(mediaPeriodHolder1 != null) {
                while(this.s.t() != mediaPeriodHolder1) {
                    this.s.b();
                }
                this.s.I(mediaPeriodHolder1);
                mediaPeriodHolder1.z(1000000000000L);
                this.x();
            }
        }
        if(mediaPeriodHolder1 == null) {
            this.s.f();
            this.D0(v);
        }
        else {
            this.s.I(mediaPeriodHolder1);
            if(!mediaPeriodHolder1.d) {
                mediaPeriodHolder1.f = mediaPeriodHolder1.f.b(v);
            }
            else if(mediaPeriodHolder1.e) {
                v = mediaPeriodHolder1.a.j(v);
                mediaPeriodHolder1.a.v(v - this.m, this.n);
            }
            this.D0(v);
            this.b0();
        }
        this.M(false);
        this.h.m(2);
        return v;
    }

    private void Q(PlaybackParameters playbackParameters0, boolean z) throws ExoPlaybackException {
        this.P(playbackParameters0, playbackParameters0.a, true, z);
    }

    private void Q0(PlayerMessage playerMessage0) throws ExoPlaybackException {
        if(playerMessage0.h() == 0x8000000000000001L) {
            this.R0(playerMessage0);
            return;
        }
        if(this.z.a.w()) {
            PendingMessageInfo exoPlayerImplInternal$PendingMessageInfo0 = new PendingMessageInfo(playerMessage0);
            this.p.add(exoPlayerImplInternal$PendingMessageInfo0);
            return;
        }
        PendingMessageInfo exoPlayerImplInternal$PendingMessageInfo1 = new PendingMessageInfo(playerMessage0);
        if(ExoPlayerImplInternal.F0(exoPlayerImplInternal$PendingMessageInfo1, this.z.a, this.z.a, this.H, this.I, this.k, this.l)) {
            this.p.add(exoPlayerImplInternal$PendingMessageInfo1);
            Collections.sort(this.p);
            return;
        }
        playerMessage0.m(false);
    }

    @CheckResult
    private PlaybackInfo R(MediaPeriodId mediaSource$MediaPeriodId0, long v, long v1, long v2, boolean z, int v3) {
        List list1;
        TrackSelectorResult trackSelectorResult2;
        TrackGroupArray trackGroupArray2;
        this.X = this.X || v != this.z.s || !mediaSource$MediaPeriodId0.equals(this.z.b);
        this.C0();
        TrackGroupArray trackGroupArray0 = this.z.h;
        TrackSelectorResult trackSelectorResult0 = this.z.i;
        List list0 = this.z.j;
        if(this.t.u()) {
            MediaPeriodHolder mediaPeriodHolder0 = this.s.t();
            TrackGroupArray trackGroupArray1 = mediaPeriodHolder0 == null ? TrackGroupArray.e : mediaPeriodHolder0.o();
            TrackSelectorResult trackSelectorResult1 = mediaPeriodHolder0 == null ? this.e : mediaPeriodHolder0.p();
            O2 o20 = this.B(trackSelectorResult1.c);
            if(mediaPeriodHolder0 != null) {
                MediaPeriodInfo mediaPeriodInfo0 = mediaPeriodHolder0.f;
                if(mediaPeriodInfo0.c != v1) {
                    mediaPeriodHolder0.f = mediaPeriodInfo0.a(v1);
                }
            }
            this.f0();
            trackGroupArray2 = trackGroupArray1;
            trackSelectorResult2 = trackSelectorResult1;
            list1 = o20;
        }
        else if(mediaSource$MediaPeriodId0.equals(this.z.b)) {
            list1 = list0;
            trackGroupArray2 = trackGroupArray0;
            trackSelectorResult2 = trackSelectorResult0;
        }
        else {
            trackGroupArray2 = TrackGroupArray.e;
            trackSelectorResult2 = this.e;
            list1 = O2.A();
        }
        if(z) {
            this.A.d(v3);
        }
        return this.z.d(mediaSource$MediaPeriodId0, v, v1, v2, this.I(), trackGroupArray2, trackSelectorResult2, list1);
    }

    private void R0(PlayerMessage playerMessage0) throws ExoPlaybackException {
        if(playerMessage0.e() == this.j) {
            this.t(playerMessage0);
            if(this.z.e == 2 || this.z.e == 3) {
                this.h.m(2);
            }
        }
        else {
            this.h.e(15, playerMessage0).a();
        }
    }

    // 去混淆评级： 低(20)
    private boolean S(Renderer renderer0, MediaPeriodHolder mediaPeriodHolder0) {
        MediaPeriodHolder mediaPeriodHolder1 = mediaPeriodHolder0.k();
        return mediaPeriodHolder0.f.f && mediaPeriodHolder1.d && (renderer0 instanceof TextRenderer || renderer0 instanceof MetadataRenderer || renderer0.r() >= mediaPeriodHolder1.n());
    }

    private void S0(PlayerMessage playerMessage0) {
        Looper looper0 = playerMessage0.e();
        if(!looper0.getThread().isAlive()) {
            Log.n("TAG", "Trying to send message on a dead thread.");
            playerMessage0.m(false);
            return;
        }
        this.q.c(looper0, null).k(() -> try {
            this.t(playerMessage0);
        }
        catch(ExoPlaybackException exoPlaybackException0) {
            Log.e("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", exoPlaybackException0);
            throw new RuntimeException(exoPlaybackException0);
        });
    }

    private boolean T() {
        MediaPeriodHolder mediaPeriodHolder0 = this.s.u();
        if(!mediaPeriodHolder0.d) {
            return false;
        }
        int v = 0;
        while(true) {
            Renderer[] arr_renderer = this.a;
            if(v >= arr_renderer.length) {
                break;
            }
            Renderer renderer0 = arr_renderer[v];
            SampleStream sampleStream0 = mediaPeriodHolder0.c[v];
            if(renderer0.e() == sampleStream0 && (sampleStream0 == null || renderer0.h() || this.S(renderer0, mediaPeriodHolder0))) {
                ++v;
                continue;
            }
            return false;
        }
        return true;
    }

    private void T0(long v) {
        Renderer[] arr_renderer = this.a;
        for(int v1 = 0; v1 < arr_renderer.length; ++v1) {
            Renderer renderer0 = arr_renderer[v1];
            if(renderer0.e() != null) {
                this.U0(renderer0, v);
            }
        }
    }

    private static boolean U(boolean z, MediaPeriodId mediaSource$MediaPeriodId0, long v, MediaPeriodId mediaSource$MediaPeriodId1, Period timeline$Period0, long v1) {
        if(!z && v == v1 && mediaSource$MediaPeriodId0.a.equals(mediaSource$MediaPeriodId1.a)) {
            if(mediaSource$MediaPeriodId0.c() && timeline$Period0.v(mediaSource$MediaPeriodId0.b)) {
                switch(timeline$Period0.j(mediaSource$MediaPeriodId0.b, mediaSource$MediaPeriodId0.c)) {
                    case 2: 
                    case 4: {
                        return false;
                    }
                    default: {
                        return true;
                    }
                }
            }
            return mediaSource$MediaPeriodId1.c() && timeline$Period0.v(mediaSource$MediaPeriodId1.b);
        }
        return false;
    }

    private void U0(Renderer renderer0, long v) {
        renderer0.w();
        if(renderer0 instanceof TextRenderer) {
            ((TextRenderer)renderer0).v0(v);
        }
    }

    private boolean V() {
        MediaPeriodHolder mediaPeriodHolder0 = this.s.m();
        if(mediaPeriodHolder0 == null) {
            return false;
        }
        return mediaPeriodHolder0.r() ? false : mediaPeriodHolder0.l() != 0x8000000000000000L;
    }

    public boolean V0(boolean z) {
        synchronized(this) {
            if(!this.B && this.j.getThread().isAlive()) {
                if(z) {
                    this.h.g(13, 1, 0).a();
                    return true;
                }
                AtomicBoolean atomicBoolean0 = new AtomicBoolean();
                this.h.i(13, 0, 0, atomicBoolean0).a();
                this.K1(new E0(atomicBoolean0), this.Z);
                return atomicBoolean0.get();
            }
            return true;
        }
    }

    private static boolean W(Renderer renderer0) {
        return renderer0.getState() != 0;
    }

    private void W0(boolean z, @Nullable AtomicBoolean atomicBoolean0) {
        if(this.J != z) {
            this.J = z;
            if(!z) {
                Renderer[] arr_renderer = this.a;
                for(int v = 0; v < arr_renderer.length; ++v) {
                    Renderer renderer0 = arr_renderer[v];
                    if(!ExoPlayerImplInternal.W(renderer0) && this.b.remove(renderer0)) {
                        renderer0.reset();
                    }
                }
            }
        }
        if(atomicBoolean0 != null) {
            synchronized(this) {
                atomicBoolean0.set(true);
                this.notifyAll();
            }
        }
    }

    private boolean X() {
        MediaPeriodHolder mediaPeriodHolder0 = this.s.t();
        long v = mediaPeriodHolder0.f.e;
        return mediaPeriodHolder0.d && (v == 0x8000000000000001L || this.z.s < v || !this.u1());
    }

    private void X0(PlaybackParameters playbackParameters0) {
        this.h.o(16);
        this.o.l(playbackParameters0);
    }

    // 去混淆评级： 低(20)
    private static boolean Y(PlaybackInfo playbackInfo0, Period timeline$Period0) {
        return playbackInfo0.a.w() || playbackInfo0.a.l(playbackInfo0.b.a, timeline$Period0).f;
    }

    private void Y0(MediaSourceListUpdateMessage exoPlayerImplInternal$MediaSourceListUpdateMessage0) throws ExoPlaybackException {
        this.A.b(1);
        if(exoPlayerImplInternal$MediaSourceListUpdateMessage0.c != -1) {
            this.N = new SeekPosition(new PlaylistTimeline(exoPlayerImplInternal$MediaSourceListUpdateMessage0.a, exoPlayerImplInternal$MediaSourceListUpdateMessage0.b), exoPlayerImplInternal$MediaSourceListUpdateMessage0.c, exoPlayerImplInternal$MediaSourceListUpdateMessage0.d);
        }
        this.N(this.t.F(exoPlayerImplInternal$MediaSourceListUpdateMessage0.a, exoPlayerImplInternal$MediaSourceListUpdateMessage0.b), false);
    }

    // 检测为 Lambda 实现
    private Boolean Z() [...]

    public void Z0(List list0, int v, long v1, ShuffleOrder shuffleOrder0) {
        MediaSourceListUpdateMessage exoPlayerImplInternal$MediaSourceListUpdateMessage0 = new MediaSourceListUpdateMessage(list0, shuffleOrder0, v, v1, null);
        this.h.e(17, exoPlayerImplInternal$MediaSourceListUpdateMessage0).a();
    }

    @Override  // androidx.media3.exoplayer.trackselection.TrackSelector$InvalidationListener
    public void a(Renderer renderer0) {
        this.h.m(26);
    }

    // 检测为 Lambda 实现
    private void a0(PlayerMessage playerMessage0) [...]

    private void a1(boolean z) {
        if(z == this.L) {
            return;
        }
        this.L = z;
        if(!z && this.z.p) {
            this.h.m(2);
        }
    }

    @Override  // androidx.media3.exoplayer.trackselection.TrackSelector$InvalidationListener
    public void b() {
        this.h.m(10);
    }

    private void b0() {
        boolean z = this.t1();
        this.G = z;
        if(z) {
            long v = this.O;
            PlaybackParameters playbackParameters0 = this.o.m();
            this.s.m().e(v, playbackParameters0.a, this.F);
        }
        this.B1();
    }

    public void b1(boolean z) {
        this.h.g(23, ((int)z), 0).a();
    }

    @Override  // androidx.media3.exoplayer.MediaSourceList$MediaSourceListInfoRefreshListener
    public void c() {
        this.h.o(2);
        this.h.m(22);
    }

    private void c0() {
        this.A.c(this.z);
        if(this.A.a) {
            this.r.a(this.A);
            this.A = new PlaybackInfoUpdate(this.z);
        }
    }

    private void c1(boolean z) throws ExoPlaybackException {
        this.C = z;
        this.C0();
        if(this.D && this.s.u() != this.s.t()) {
            this.M0(true);
            this.M(false);
        }
    }

    @Override  // androidx.media3.exoplayer.PlayerMessage$Sender
    public void d(PlayerMessage playerMessage0) {
        synchronized(this) {
            if(!this.B && this.j.getThread().isAlive()) {
                this.h.e(14, playerMessage0).a();
                return;
            }
            Log.n("ExoPlayerImplInternal", "Ignoring messages sent after release.");
            playerMessage0.m(false);
        }
    }

    private void d0(long v, long v1) throws ExoPlaybackException {
        PendingMessageInfo exoPlayerImplInternal$PendingMessageInfo1;
        if(!this.p.isEmpty() && !this.z.b.c()) {
            if(this.X) {
                --v;
                this.X = false;
            }
            int v2 = this.z.a.f(this.z.b.a);
            int v3 = Math.min(this.Q, this.p.size());
            PendingMessageInfo exoPlayerImplInternal$PendingMessageInfo0 = v3 <= 0 ? null : ((PendingMessageInfo)this.p.get(v3 - 1));
            while(exoPlayerImplInternal$PendingMessageInfo0 != null && (exoPlayerImplInternal$PendingMessageInfo0.b > v2 || exoPlayerImplInternal$PendingMessageInfo0.b == v2 && exoPlayerImplInternal$PendingMessageInfo0.c > v)) {
                exoPlayerImplInternal$PendingMessageInfo0 = v3 - 1 <= 0 ? null : ((PendingMessageInfo)this.p.get(v3 - 2));
                --v3;
            }
            if(v3 < this.p.size()) {
                exoPlayerImplInternal$PendingMessageInfo1 = (PendingMessageInfo)this.p.get(v3);
                goto label_15;
            }
            while(true) {
                exoPlayerImplInternal$PendingMessageInfo1 = null;
            label_15:
                if(exoPlayerImplInternal$PendingMessageInfo1 == null || exoPlayerImplInternal$PendingMessageInfo1.d == null || exoPlayerImplInternal$PendingMessageInfo1.b >= v2 && (exoPlayerImplInternal$PendingMessageInfo1.b != v2 || exoPlayerImplInternal$PendingMessageInfo1.c > v)) {
                    break;
                }
                ++v3;
                if(v3 >= this.p.size()) {
                    continue;
                }
                exoPlayerImplInternal$PendingMessageInfo1 = (PendingMessageInfo)this.p.get(v3);
                goto label_15;
            }
            while(exoPlayerImplInternal$PendingMessageInfo1 != null && exoPlayerImplInternal$PendingMessageInfo1.d != null && exoPlayerImplInternal$PendingMessageInfo1.b == v2 && (exoPlayerImplInternal$PendingMessageInfo1.c > v && exoPlayerImplInternal$PendingMessageInfo1.c <= v1)) {
                try {
                    this.R0(exoPlayerImplInternal$PendingMessageInfo1.a);
                }
                catch(Throwable throwable0) {
                    if(exoPlayerImplInternal$PendingMessageInfo1.a.d() || exoPlayerImplInternal$PendingMessageInfo1.a.l()) {
                        this.p.remove(v3);
                    }
                    throw throwable0;
                }
                if(exoPlayerImplInternal$PendingMessageInfo1.a.d() || exoPlayerImplInternal$PendingMessageInfo1.a.l()) {
                    this.p.remove(v3);
                }
                else {
                    ++v3;
                }
                exoPlayerImplInternal$PendingMessageInfo1 = v3 < this.p.size() ? ((PendingMessageInfo)this.p.get(v3)) : null;
            }
            this.Q = v3;
        }
    }

    public void d1(boolean z, int v, int v1) {
        this.h.g(1, ((int)z), v | v1 << 4).a();
    }

    private boolean e0() throws ExoPlaybackException {
        this.s.F(this.O);
        boolean z = false;
        if(this.s.P()) {
            MediaPeriodInfo mediaPeriodInfo0 = this.s.s(this.O, this.z);
            if(mediaPeriodInfo0 != null) {
                MediaPeriodHolder mediaPeriodHolder0 = this.s.g(mediaPeriodInfo0);
                mediaPeriodHolder0.a.t(this, mediaPeriodInfo0.b);
                if(this.s.t() == mediaPeriodHolder0) {
                    this.D0(mediaPeriodInfo0.b);
                }
                this.M(false);
                z = true;
            }
        }
        if(this.G) {
            this.G = this.V();
            this.B1();
            return z;
        }
        this.b0();
        return z;
    }

    private void e1(boolean z, int v, boolean z1, int v1) throws ExoPlaybackException {
        this.A.b(((int)z1));
        this.z = this.z.e(z, v1, v);
        this.I1(false, false);
        this.o0(z);
        if(!this.u1()) {
            this.A1();
            this.G1();
            return;
        }
        int v2 = this.z.e;
        if(v2 == 3) {
            this.o.e();
            this.x1();
            this.h.m(2);
            return;
        }
        if(v2 == 2) {
            this.h.m(2);
        }
    }

    private void f0() {
        MediaPeriodHolder mediaPeriodHolder0 = this.s.t();
        if(mediaPeriodHolder0 != null) {
            TrackSelectorResult trackSelectorResult0 = mediaPeriodHolder0.p();
            boolean z = false;
            boolean z1 = false;
            for(int v = 0; true; ++v) {
                boolean z2 = true;
                if(v >= this.a.length) {
                    break;
                }
                if(trackSelectorResult0.c(v)) {
                    if(this.a[v].g() != 1) {
                        z2 = false;
                        break;
                    }
                    if(trackSelectorResult0.b[v].a != 0) {
                        z1 = true;
                    }
                }
            }
            if(z1 && z2) {
                z = true;
            }
            this.a1(z);
        }
    }

    public void f1(PlaybackParameters playbackParameters0) {
        this.h.e(4, playbackParameters0).a();
    }

    private void g0() throws ExoPlaybackException {
        int v;
        for(boolean z = false; this.s1(); z = true) {
            if(z) {
                this.c0();
            }
            MediaPeriodHolder mediaPeriodHolder0 = (MediaPeriodHolder)Assertions.g(this.s.b());
            if(this.z.b.a.equals(mediaPeriodHolder0.f.a.a)) {
                MediaPeriodId mediaSource$MediaPeriodId0 = this.z.b;
                if(mediaSource$MediaPeriodId0.b == -1) {
                    MediaPeriodId mediaSource$MediaPeriodId1 = mediaPeriodHolder0.f.a;
                    if(mediaSource$MediaPeriodId1.b == -1 && mediaSource$MediaPeriodId0.e != mediaSource$MediaPeriodId1.e) {
                        v = 1;
                    }
                }
            }
            else {
                v = 0;
            }
            this.z = this.R(mediaPeriodHolder0.f.a, mediaPeriodHolder0.f.b, mediaPeriodHolder0.f.c, mediaPeriodHolder0.f.b, ((boolean)(v ^ 1)), 0);
            this.C0();
            this.G1();
            if(this.z.e == 3) {
                this.x1();
            }
            this.p();
        }
    }

    private void g1(PlaybackParameters playbackParameters0) throws ExoPlaybackException {
        this.X0(playbackParameters0);
        this.Q(this.o.m(), true);
    }

    @Override  // androidx.media3.exoplayer.source.MediaPeriod$Callback
    public void h(MediaPeriod mediaPeriod0) {
        this.h.e(8, mediaPeriod0).a();
    }

    private void h0(boolean z) {
        if(this.N8.a != 0x8000000000000001L && (z || !this.z.a.equals(this.O8))) {
            this.O8 = this.z.a;
            this.s.x(this.z.a);
        }
    }

    public void h1(PreloadConfiguration exoPlayer$PreloadConfiguration0) {
        this.h.e(28, exoPlayer$PreloadConfiguration0).a();
    }

    @Override  // android.os.Handler$Callback
    public boolean handleMessage(Message message0) {
        ExoPlaybackException exoPlaybackException1;
        DrmSessionException drmSession$DrmSessionException1;
        ParserException parserException1;
        DataSourceException dataSourceException1;
        BehindLiveWindowException behindLiveWindowException1;
        IOException iOException1;
        RuntimeException runtimeException1;
        int v = 1000;
        try {
            switch(message0.what) {
                case 1: {
                    this.e1(message0.arg1 != 0, message0.arg2 >> 4, true, message0.arg2 & 15);
                    goto label_134;
                }
                case 2: {
                    this.v();
                    goto label_134;
                }
                case 3: {
                    this.N0(((SeekPosition)message0.obj));
                    goto label_134;
                }
                case 4: {
                    this.g1(((PlaybackParameters)message0.obj));
                    goto label_134;
                }
                case 5: {
                    this.m1(((SeekParameters)message0.obj));
                    goto label_134;
                }
                case 6: {
                    this.z1(false, true);
                    goto label_134;
                }
                case 7: {
                    this.u0();
                    return true;
                }
                case 8: {
                    this.O(((MediaPeriod)message0.obj));
                    goto label_134;
                }
                case 9: {
                    this.K(((MediaPeriod)message0.obj));
                    goto label_134;
                }
                case 10: {
                    this.z0();
                    goto label_134;
                }
                case 11: {
                    this.k1(message0.arg1);
                    goto label_134;
                }
                case 12: {
                    this.o1(message0.arg1 != 0);
                    goto label_134;
                }
                case 13: {
                    this.W0(message0.arg1 != 0, ((AtomicBoolean)message0.obj));
                    goto label_134;
                }
                case 14: {
                    this.Q0(((PlayerMessage)message0.obj));
                    goto label_134;
                }
                case 15: {
                    this.S0(((PlayerMessage)message0.obj));
                    goto label_134;
                }
                case 16: {
                    this.Q(((PlaybackParameters)message0.obj), false);
                    goto label_134;
                }
                case 17: {
                    this.Y0(((MediaSourceListUpdateMessage)message0.obj));
                    goto label_134;
                }
                case 18: {
                    this.n(((MediaSourceListUpdateMessage)message0.obj), message0.arg1);
                    goto label_134;
                }
                case 19: {
                    this.l0(((MoveMediaItemsMessage)message0.obj));
                    goto label_134;
                }
                case 20: {
                    this.w0(message0.arg1, message0.arg2, ((ShuffleOrder)message0.obj));
                    goto label_134;
                }
                case 21: {
                    this.q1(((ShuffleOrder)message0.obj));
                    goto label_134;
                }
                case 22: {
                    this.k0();
                    goto label_134;
                }
                case 23: {
                    this.c1(message0.arg1 != 0);
                    goto label_134;
                }
                case 25: {
                    this.r();
                    goto label_134;
                }
                case 26: {
                    this.A0();
                    goto label_134;
                }
                case 27: {
                    this.E1(message0.arg1, message0.arg2, ((List)message0.obj));
                    goto label_134;
                }
                case 28: {
                    this.i1(((PreloadConfiguration)message0.obj));
                    goto label_134;
                }
                case 29: {
                    this.s0();
                    goto label_134;
                label_78:
                    exoPlaybackException1 = exoPlaybackException0;
                    if(exoPlaybackException1.e9 == 1) {
                        break;
                    }
                    goto label_83;
                }
                default: {
                    return false;
                }
            }
        }
        catch(ExoPlaybackException exoPlaybackException0) {
            goto label_78;
        }
        catch(DrmSessionException drmSession$DrmSessionException0) {
            drmSession$DrmSessionException1 = drmSession$DrmSessionException0;
            this.L(drmSession$DrmSessionException1, drmSession$DrmSessionException1.a);
            goto label_134;
        }
        catch(ParserException parserException0) {
            parserException1 = parserException0;
            goto label_111;
        }
        catch(DataSourceException dataSourceException0) {
            dataSourceException1 = dataSourceException0;
            this.L(dataSourceException1, dataSourceException1.a);
            goto label_134;
        }
        catch(BehindLiveWindowException behindLiveWindowException0) {
            behindLiveWindowException1 = behindLiveWindowException0;
            this.L(behindLiveWindowException1, 1002);
            goto label_134;
        }
        catch(IOException iOException0) {
            iOException1 = iOException0;
            this.L(iOException1, 2000);
            goto label_134;
        }
        catch(RuntimeException runtimeException0) {
            runtimeException1 = runtimeException0;
            goto label_128;
        }
        MediaPeriodHolder mediaPeriodHolder0 = this.s.u();
        if(mediaPeriodHolder0 != null) {
            exoPlaybackException1 = exoPlaybackException1.j(mediaPeriodHolder0.f.a);
        }
    label_83:
        if(!exoPlaybackException1.k9 || this.Y != null && (exoPlaybackException1.a != 5003 && exoPlaybackException1.a != 5004)) {
            ExoPlaybackException exoPlaybackException3 = this.Y;
            if(exoPlaybackException3 != null) {
                exoPlaybackException3.addSuppressed(exoPlaybackException1);
                exoPlaybackException1 = this.Y;
            }
            Log.e("ExoPlayerImplInternal", "Playback error", exoPlaybackException1);
            if(exoPlaybackException1.e9 == 1 && this.s.t() != this.s.u()) {
                while(this.s.t() != this.s.u()) {
                    this.s.b();
                }
                MediaPeriodHolder mediaPeriodHolder1 = (MediaPeriodHolder)Assertions.g(this.s.t());
                this.c0();
                this.z = this.R(mediaPeriodHolder1.f.a, mediaPeriodHolder1.f.b, mediaPeriodHolder1.f.c, mediaPeriodHolder1.f.b, true, 0);
            }
            this.z1(true, false);
            this.z = this.z.f(exoPlaybackException1);
            goto label_134;
        label_111:
            int v1 = parserException1.b;
            if(v1 != 1) {
                if(v1 == 4) {
                    v = parserException1.a ? 3002 : 3004;
                }
            }
            else if(parserException1.a) {
                v = 3001;
            }
            else {
                v = 3003;
            }
            this.L(parserException1, v);
            goto label_134;
        label_128:
            if(runtimeException1 instanceof IllegalStateException || runtimeException1 instanceof IllegalArgumentException) {
                v = 1004;
            }
            ExoPlaybackException exoPlaybackException4 = ExoPlaybackException.o(runtimeException1, v);
            Log.e("ExoPlayerImplInternal", "Playback error", exoPlaybackException4);
            this.z1(true, false);
            this.z = this.z.f(exoPlaybackException4);
        }
        else {
            Log.o("ExoPlayerImplInternal", "Recoverable renderer error", exoPlaybackException1);
            ExoPlaybackException exoPlaybackException2 = this.Y;
            if(exoPlaybackException2 == null) {
                this.Y = exoPlaybackException1;
            }
            else {
                exoPlaybackException2.addSuppressed(exoPlaybackException1);
                exoPlaybackException1 = this.Y;
            }
            androidx.media3.common.util.HandlerWrapper.Message handlerWrapper$Message0 = this.h.e(25, exoPlaybackException1);
            this.h.h(handlerWrapper$Message0);
        }
    label_134:
        this.c0();
        return true;
    }

    private void i0() throws ExoPlaybackException {
        MediaPeriodHolder mediaPeriodHolder0 = this.s.u();
        if(mediaPeriodHolder0 == null) {
            return;
        }
        if(mediaPeriodHolder0.k() != null && !this.D) {
            if(!this.T()) {
                return;
            }
            if(!mediaPeriodHolder0.k().d && this.O < mediaPeriodHolder0.k().n()) {
                return;
            }
            TrackSelectorResult trackSelectorResult0 = mediaPeriodHolder0.p();
            MediaPeriodHolder mediaPeriodHolder1 = this.s.c();
            TrackSelectorResult trackSelectorResult1 = mediaPeriodHolder1.p();
            this.H1(this.z.a, mediaPeriodHolder1.f.a, this.z.a, mediaPeriodHolder0.f.a, 0x8000000000000001L, false);
            if(mediaPeriodHolder1.d && mediaPeriodHolder1.a.k() != 0x8000000000000001L) {
                this.T0(mediaPeriodHolder1.n());
                if(!mediaPeriodHolder1.s()) {
                    this.s.I(mediaPeriodHolder1);
                    this.M(false);
                    this.b0();
                }
                return;
            }
            for(int v1 = 0; v1 < this.a.length; ++v1) {
                boolean z = trackSelectorResult0.c(v1);
                boolean z1 = trackSelectorResult1.c(v1);
                if(z && !this.a[v1].p()) {
                    boolean z2 = this.c[v1].g() == -2;
                    if(!z1 || !trackSelectorResult1.b[v1].equals(trackSelectorResult0.b[v1]) || z2) {
                        this.U0(this.a[v1], mediaPeriodHolder1.n());
                    }
                }
            }
            return;
        }
        if(mediaPeriodHolder0.f.i || this.D) {
            for(int v = 0; true; ++v) {
                Renderer[] arr_renderer = this.a;
                if(v >= arr_renderer.length) {
                    break;
                }
                Renderer renderer0 = arr_renderer[v];
                SampleStream sampleStream0 = mediaPeriodHolder0.c[v];
                if(sampleStream0 != null && renderer0.e() == sampleStream0 && renderer0.h()) {
                    long v2 = mediaPeriodHolder0.f.e;
                    this.U0(renderer0, (v2 == 0x8000000000000001L || v2 == 0x8000000000000000L ? 0x8000000000000001L : mediaPeriodHolder0.m() + mediaPeriodHolder0.f.e));
                }
            }
        }
    }

    private void i1(PreloadConfiguration exoPlayer$PreloadConfiguration0) {
        this.N8 = exoPlayer$PreloadConfiguration0;
        this.s.R(this.z.a, exoPlayer$PreloadConfiguration0);
    }

    private void j0() throws ExoPlaybackException {
        MediaPeriodHolder mediaPeriodHolder0 = this.s.u();
        if(mediaPeriodHolder0 != null && this.s.t() != mediaPeriodHolder0 && !mediaPeriodHolder0.g && this.y0()) {
            this.x();
        }
    }

    public void j1(int v) {
        this.h.g(11, v, 0).a();
    }

    private void k0() throws ExoPlaybackException {
        this.N(this.t.j(), true);
    }

    private void k1(int v) throws ExoPlaybackException {
        this.H = v;
        if(!this.s.T(this.z.a, v)) {
            this.M0(true);
        }
        this.M(false);
    }

    @Override  // androidx.media3.exoplayer.source.SequenceableLoader$Callback
    public void l(SequenceableLoader sequenceableLoader0) {
        this.q0(((MediaPeriod)sequenceableLoader0));
    }

    private void l0(MoveMediaItemsMessage exoPlayerImplInternal$MoveMediaItemsMessage0) throws ExoPlaybackException {
        this.A.b(1);
        this.N(this.t.y(exoPlayerImplInternal$MoveMediaItemsMessage0.a, exoPlayerImplInternal$MoveMediaItemsMessage0.b, exoPlayerImplInternal$MoveMediaItemsMessage0.c, exoPlayerImplInternal$MoveMediaItemsMessage0.d), false);
    }

    public void l1(SeekParameters seekParameters0) {
        this.h.e(5, seekParameters0).a();
    }

    public void m0(int v, int v1, int v2, ShuffleOrder shuffleOrder0) {
        MoveMediaItemsMessage exoPlayerImplInternal$MoveMediaItemsMessage0 = new MoveMediaItemsMessage(v, v1, v2, shuffleOrder0);
        this.h.e(19, exoPlayerImplInternal$MoveMediaItemsMessage0).a();
    }

    private void m1(SeekParameters seekParameters0) {
        this.y = seekParameters0;
    }

    private void n(MediaSourceListUpdateMessage exoPlayerImplInternal$MediaSourceListUpdateMessage0, int v) throws ExoPlaybackException {
        this.A.b(1);
        MediaSourceList mediaSourceList0 = this.t;
        if(v == -1) {
            v = mediaSourceList0.s();
        }
        this.N(mediaSourceList0.f(v, exoPlayerImplInternal$MediaSourceListUpdateMessage0.a, exoPlayerImplInternal$MediaSourceListUpdateMessage0.b), false);
    }

    private void n0() {
        for(MediaPeriodHolder mediaPeriodHolder0 = this.s.t(); mediaPeriodHolder0 != null; mediaPeriodHolder0 = mediaPeriodHolder0.k()) {
            ExoTrackSelection[] arr_exoTrackSelection = mediaPeriodHolder0.p().c;
            for(int v = 0; v < arr_exoTrackSelection.length; ++v) {
                ExoTrackSelection exoTrackSelection0 = arr_exoTrackSelection[v];
                if(exoTrackSelection0 != null) {
                    exoTrackSelection0.g();
                }
            }
        }
    }

    public void n1(boolean z) {
        this.h.g(12, ((int)z), 0).a();
    }

    public void o(int v, List list0, ShuffleOrder shuffleOrder0) {
        MediaSourceListUpdateMessage exoPlayerImplInternal$MediaSourceListUpdateMessage0 = new MediaSourceListUpdateMessage(list0, shuffleOrder0, -1, 0x8000000000000001L, null);
        this.h.i(18, v, 0, exoPlayerImplInternal$MediaSourceListUpdateMessage0).a();
    }

    private void o0(boolean z) {
        for(MediaPeriodHolder mediaPeriodHolder0 = this.s.t(); mediaPeriodHolder0 != null; mediaPeriodHolder0 = mediaPeriodHolder0.k()) {
            ExoTrackSelection[] arr_exoTrackSelection = mediaPeriodHolder0.p().c;
            for(int v = 0; v < arr_exoTrackSelection.length; ++v) {
                ExoTrackSelection exoTrackSelection0 = arr_exoTrackSelection[v];
                if(exoTrackSelection0 != null) {
                    exoTrackSelection0.u(z);
                }
            }
        }
    }

    private void o1(boolean z) throws ExoPlaybackException {
        this.I = z;
        if(!this.s.U(this.z.a, z)) {
            this.M0(true);
        }
        this.M(false);
    }

    private void p() {
        TrackSelectorResult trackSelectorResult0 = this.s.t().p();
        for(int v = 0; v < this.a.length; ++v) {
            if(trackSelectorResult0.c(v)) {
                this.a[v].f();
            }
        }
    }

    private void p0() {
        for(MediaPeriodHolder mediaPeriodHolder0 = this.s.t(); mediaPeriodHolder0 != null; mediaPeriodHolder0 = mediaPeriodHolder0.k()) {
            ExoTrackSelection[] arr_exoTrackSelection = mediaPeriodHolder0.p().c;
            for(int v = 0; v < arr_exoTrackSelection.length; ++v) {
                ExoTrackSelection exoTrackSelection0 = arr_exoTrackSelection[v];
                if(exoTrackSelection0 != null) {
                    exoTrackSelection0.o();
                }
            }
        }
    }

    public void p1(ShuffleOrder shuffleOrder0) {
        this.h.e(21, shuffleOrder0).a();
    }

    @Override  // androidx.media3.exoplayer.DefaultMediaClock$PlaybackParametersListener
    public void q(PlaybackParameters playbackParameters0) {
        this.h.e(16, playbackParameters0).a();
    }

    public void q0(MediaPeriod mediaPeriod0) {
        this.h.e(9, mediaPeriod0).a();
    }

    private void q1(ShuffleOrder shuffleOrder0) throws ExoPlaybackException {
        this.A.b(1);
        this.N(this.t.G(shuffleOrder0), false);
    }

    private void r() throws ExoPlaybackException {
        this.A0();
    }

    public void r0() {
        this.h.c(29).a();
    }

    private void r1(int v) {
        PlaybackInfo playbackInfo0 = this.z;
        if(playbackInfo0.e != v) {
            if(v != 2) {
                this.M8 = 0x8000000000000001L;
            }
            this.z = playbackInfo0.h(v);
        }
    }

    // 检测为 Lambda 实现
    private MediaPeriodHolder s(MediaPeriodInfo mediaPeriodInfo0, long v) [...]

    private void s0() {
        this.A.b(1);
        this.B0(false, false, false, true);
        this.f.d(this.w);
        this.r1((this.z.a.w() ? 4 : 2));
        TransferListener transferListener0 = this.g.g();
        this.t.z(transferListener0);
        this.h.m(2);
    }

    private boolean s1() {
        if(!this.u1()) {
            return false;
        }
        if(this.D) {
            return false;
        }
        MediaPeriodHolder mediaPeriodHolder0 = this.s.t();
        if(mediaPeriodHolder0 == null) {
            return false;
        }
        MediaPeriodHolder mediaPeriodHolder1 = mediaPeriodHolder0.k();
        return mediaPeriodHolder1 != null && this.O >= mediaPeriodHolder1.n() && mediaPeriodHolder1.g;
    }

    private void t(PlayerMessage playerMessage0) throws ExoPlaybackException {
        if(playerMessage0.l()) {
            return;
        }
        try {
            playerMessage0.i().k(playerMessage0.k(), playerMessage0.g());
        }
        finally {
            playerMessage0.m(true);
        }
    }

    public boolean t0() {
        synchronized(this) {
            if(!this.B && this.j.getThread().isAlive()) {
                this.h.m(7);
                this.K1(() -> Boolean.valueOf(this.B), this.v);
                return this.B;
            }
            return true;
        }
    }

    private boolean t1() {
        if(!this.V()) {
            return false;
        }
        MediaPeriodHolder mediaPeriodHolder0 = this.s.m();
        long v = this.J(mediaPeriodHolder0.l());
        long v1 = mediaPeriodHolder0 == this.s.t() ? mediaPeriodHolder0.A(this.O) : mediaPeriodHolder0.A(this.O) - mediaPeriodHolder0.f.b;
        long v2 = this.w1(this.z.a, mediaPeriodHolder0.f.a) ? this.u.c() : 0x8000000000000001L;
        Timeline timeline0 = this.z.a;
        MediaPeriodId mediaSource$MediaPeriodId0 = mediaPeriodHolder0.f.a;
        PlaybackParameters playbackParameters0 = this.o.m();
        Parameters loadControl$Parameters0 = new Parameters(this.w, timeline0, mediaSource$MediaPeriodId0, v1, v, playbackParameters0.a, this.z.l, this.E, v2);
        boolean z = this.f.f(loadControl$Parameters0);
        MediaPeriodHolder mediaPeriodHolder1 = this.s.t();
        if(!z && mediaPeriodHolder1.d && v < 500000L && (this.m > 0L || this.n)) {
            mediaPeriodHolder1.a.v(this.z.s, false);
            return this.f.f(loadControl$Parameters0);
        }
        return z;
    }

    private void u(Renderer renderer0) throws ExoPlaybackException {
        if(!ExoPlayerImplInternal.W(renderer0)) {
            return;
        }
        this.o.a(renderer0);
        this.z(renderer0);
        renderer0.c();
        --this.M;
    }

    private void u0() {
        HandlerThread handlerThread0;
        try {
            this.B0(true, false, true, false);
            this.v0();
            this.f.p(this.w);
            this.r1(1);
            handlerThread0 = this.i;
        }
        catch(Throwable throwable0) {
            HandlerThread handlerThread1 = this.i;
            if(handlerThread1 != null) {
                handlerThread1.quit();
            }
            synchronized(this) {
                this.B = true;
                this.notifyAll();
            }
            throw throwable0;
        }
        if(handlerThread0 != null) {
            handlerThread0.quit();
        }
        synchronized(this) {
            this.B = true;
            this.notifyAll();
        }
    }

    private boolean u1() {
        return this.z.l && this.z.n == 0;
    }

    private void v() throws ExoPlaybackException, IOException {
        boolean z2;
        boolean z1;
        long v = this.q.a();
        this.h.o(2);
        this.F1();
        boolean z = true;
        if(this.z.e != 1 && this.z.e != 4) {
            MediaPeriodHolder mediaPeriodHolder0 = this.s.t();
            if(mediaPeriodHolder0 == null) {
                this.K0(v);
                return;
            }
            TraceUtil.a("doSomeWork");
            this.G1();
            if(mediaPeriodHolder0.d) {
                this.P = Util.F1(this.q.elapsedRealtime());
                mediaPeriodHolder0.a.v(this.z.s - this.m, this.n);
                z1 = true;
                z2 = true;
                for(int v1 = 0; true; ++v1) {
                    Renderer[] arr_renderer = this.a;
                    if(v1 >= arr_renderer.length) {
                        break;
                    }
                    Renderer renderer0 = arr_renderer[v1];
                    if(ExoPlayerImplInternal.W(renderer0)) {
                        renderer0.d(this.O, this.P);
                        z1 = z1 && renderer0.b();
                        boolean z3 = mediaPeriodHolder0.c[v1] != renderer0.e();
                        boolean z4 = z3 || !z3 && renderer0.h() || renderer0.isReady() || renderer0.b();
                        z2 = z2 && z4;
                        if(!z4) {
                            renderer0.x();
                        }
                    }
                }
            }
            else {
                mediaPeriodHolder0.a.s();
                z1 = true;
                z2 = true;
            }
            long v2 = mediaPeriodHolder0.f.e;
            boolean z5 = z1 && mediaPeriodHolder0.d && (v2 == 0x8000000000000001L || v2 <= this.z.s);
            if(z5 && this.D) {
                this.D = false;
                this.e1(false, this.z.n, false, 5);
            }
            if(z5 && mediaPeriodHolder0.f.i) {
                this.r1(4);
                this.A1();
            }
            else if(this.z.e == 2 && this.v1(z2)) {
                this.r1(3);
                this.Y = null;
                if(this.u1()) {
                    this.I1(false, false);
                    this.o.e();
                    this.x1();
                }
            }
            else if(this.z.e == 3) {
                if(this.M != 0) {
                    if(!z2) {
                    label_55:
                        this.I1(this.u1(), false);
                        this.r1(2);
                        if(this.E) {
                            this.p0();
                            this.u.d();
                        }
                        this.A1();
                    }
                }
                else if(this.X()) {
                }
                else {
                    goto label_55;
                }
            }
            if(this.z.e == 2) {
                for(int v3 = 0; true; ++v3) {
                    Renderer[] arr_renderer1 = this.a;
                    if(v3 >= arr_renderer1.length) {
                        break;
                    }
                    if(ExoPlayerImplInternal.W(arr_renderer1[v3]) && this.a[v3].e() == mediaPeriodHolder0.c[v3]) {
                        this.a[v3].x();
                    }
                }
                if(this.z.g || this.z.r >= 500000L || !this.V()) {
                    this.M8 = 0x8000000000000001L;
                }
                else if(this.M8 == 0x8000000000000001L) {
                    this.M8 = this.q.elapsedRealtime();
                }
                else if(this.q.elapsedRealtime() - this.M8 >= 4000L) {
                    throw new IllegalStateException("Playback stuck buffering and not loading");
                }
            }
            else {
                this.M8 = 0x8000000000000001L;
            }
            boolean z6 = this.u1() && this.z.e == 3;
            if(!this.L || !this.K || !z6) {
                z = false;
            }
            PlaybackInfo playbackInfo0 = this.z;
            if(playbackInfo0.p != z) {
                this.z = playbackInfo0.i(z);
            }
            this.K = false;
            if(!z) {
                int v4 = this.z.e;
                if(v4 != 4 && (z6 || v4 == 2 || v4 == 3 && this.M != 0)) {
                    this.K0(v);
                }
            }
            TraceUtil.b();
        }
    }

    private void v0() {
        for(int v = 0; v < this.a.length; ++v) {
            this.c[v].u();
            this.a[v].release();
        }
    }

    private boolean v1(boolean z) {
        if(this.M == 0) {
            return this.X();
        }
        if(!z) {
            return false;
        }
        if(!this.z.g) {
            return true;
        }
        MediaPeriodHolder mediaPeriodHolder0 = this.s.t();
        long v = this.w1(this.z.a, mediaPeriodHolder0.f.a) ? this.u.c() : 0x8000000000000001L;
        MediaPeriodHolder mediaPeriodHolder1 = this.s.m();
        if((!mediaPeriodHolder1.s() || !mediaPeriodHolder1.f.i) && (!mediaPeriodHolder1.f.a.c() || mediaPeriodHolder1.d)) {
            Timeline timeline0 = this.z.a;
            MediaPeriodId mediaSource$MediaPeriodId0 = mediaPeriodHolder0.f.a;
            long v1 = mediaPeriodHolder0.A(this.O);
            long v2 = this.I();
            PlaybackParameters playbackParameters0 = this.o.m();
            Parameters loadControl$Parameters0 = new Parameters(this.w, timeline0, mediaSource$MediaPeriodId0, v1, v2, playbackParameters0.a, this.z.l, this.E, v);
            return this.f.k(loadControl$Parameters0);
        }
        return true;
    }

    private void w(int v, boolean z, long v1) throws ExoPlaybackException {
        Renderer renderer0 = this.a[v];
        if(ExoPlayerImplInternal.W(renderer0)) {
            return;
        }
        MediaPeriodHolder mediaPeriodHolder0 = this.s.u();
        boolean z1 = mediaPeriodHolder0 == this.s.t();
        TrackSelectorResult trackSelectorResult0 = mediaPeriodHolder0.p();
        RendererConfiguration rendererConfiguration0 = trackSelectorResult0.b[v];
        Format[] arr_format = ExoPlayerImplInternal.D(trackSelectorResult0.c[v]);
        boolean z2 = this.u1() && this.z.e == 3;
        ++this.M;
        this.b.add(renderer0);
        renderer0.i(rendererConfiguration0, arr_format, mediaPeriodHolder0.c[v], this.O, !z && z2, z1, v1, mediaPeriodHolder0.m(), mediaPeriodHolder0.f.a);
        renderer0.k(11, new WakeupListener() {
            final ExoPlayerImplInternal a;

            @Override  // androidx.media3.exoplayer.Renderer$WakeupListener
            public void a() {
                ExoPlayerImplInternal.this.K = true;
            }

            @Override  // androidx.media3.exoplayer.Renderer$WakeupListener
            public void b() {
                if(ExoPlayerImplInternal.this.x || ExoPlayerImplInternal.this.L) {
                    ExoPlayerImplInternal.this.h.m(2);
                }
            }
        });
        this.o.b(renderer0);
        if(z2 && z1) {
            renderer0.start();
        }
    }

    private void w0(int v, int v1, ShuffleOrder shuffleOrder0) throws ExoPlaybackException {
        this.A.b(1);
        this.N(this.t.D(v, v1, shuffleOrder0), false);
    }

    private boolean w1(Timeline timeline0, MediaPeriodId mediaSource$MediaPeriodId0) {
        if(!mediaSource$MediaPeriodId0.c() && !timeline0.w()) {
            timeline0.t(timeline0.l(mediaSource$MediaPeriodId0.a, this.l).c, this.k);
            return this.k.i() && (this.k.i && this.k.f != 0x8000000000000001L);
        }
        return false;
    }

    private void x() throws ExoPlaybackException {
        this.y(new boolean[this.a.length], this.s.u().n());
    }

    public void x0(int v, int v1, ShuffleOrder shuffleOrder0) {
        this.h.i(20, v, v1, shuffleOrder0).a();
    }

    private void x1() throws ExoPlaybackException {
        MediaPeriodHolder mediaPeriodHolder0 = this.s.t();
        if(mediaPeriodHolder0 == null) {
            return;
        }
        TrackSelectorResult trackSelectorResult0 = mediaPeriodHolder0.p();
        for(int v = 0; v < this.a.length; ++v) {
            if(trackSelectorResult0.c(v) && this.a[v].getState() == 1) {
                this.a[v].start();
            }
        }
    }

    private void y(boolean[] arr_z, long v) throws ExoPlaybackException {
        MediaPeriodHolder mediaPeriodHolder0 = this.s.u();
        TrackSelectorResult trackSelectorResult0 = mediaPeriodHolder0.p();
        for(int v2 = 0; v2 < this.a.length; ++v2) {
            if(!trackSelectorResult0.c(v2) && this.b.remove(this.a[v2])) {
                this.a[v2].reset();
            }
        }
        for(int v1 = 0; v1 < this.a.length; ++v1) {
            if(trackSelectorResult0.c(v1)) {
                this.w(v1, arr_z[v1], v);
            }
        }
        mediaPeriodHolder0.g = true;
    }

    private boolean y0() throws ExoPlaybackException {
        MediaPeriodHolder mediaPeriodHolder0 = this.s.u();
        TrackSelectorResult trackSelectorResult0 = mediaPeriodHolder0.p();
        int v1 = 0;
        for(int v = 0; true; ++v) {
            Renderer[] arr_renderer = this.a;
            if(v >= arr_renderer.length) {
                break;
            }
            Renderer renderer0 = arr_renderer[v];
            if(ExoPlayerImplInternal.W(renderer0) && (!trackSelectorResult0.c(v) || renderer0.e() != mediaPeriodHolder0.c[v])) {
                if(!renderer0.p()) {
                    renderer0.n(ExoPlayerImplInternal.D(trackSelectorResult0.c[v]), mediaPeriodHolder0.c[v], mediaPeriodHolder0.n(), mediaPeriodHolder0.m(), mediaPeriodHolder0.f.a);
                    if(this.L) {
                        this.a1(false);
                    }
                }
                else if(renderer0.b()) {
                    this.u(renderer0);
                }
                else {
                    v1 = 1;
                }
            }
        }
        return v1 ^ 1;
    }

    public void y1() {
        this.h.c(6).a();
    }

    private void z(Renderer renderer0) {
        if(renderer0.getState() == 2) {
            renderer0.stop();
        }
    }

    private void z0() throws ExoPlaybackException {
        float f = this.o.m().a;
        MediaPeriodHolder mediaPeriodHolder0 = this.s.t();
        MediaPeriodHolder mediaPeriodHolder1 = this.s.u();
        TrackSelectorResult trackSelectorResult0 = null;
        boolean z = true;
        while(mediaPeriodHolder0 != null && mediaPeriodHolder0.d) {
            TrackSelectorResult trackSelectorResult1 = mediaPeriodHolder0.x(f, this.z.a);
            if(mediaPeriodHolder0 == this.s.t()) {
                trackSelectorResult0 = trackSelectorResult1;
            }
            if(!trackSelectorResult1.a(mediaPeriodHolder0.p())) {
                if(z) {
                    MediaPeriodHolder mediaPeriodHolder2 = this.s.t();
                    boolean z1 = this.s.I(mediaPeriodHolder2);
                    boolean[] arr_z = new boolean[this.a.length];
                    long v = mediaPeriodHolder2.b(((TrackSelectorResult)Assertions.g(trackSelectorResult0)), this.z.s, z1, arr_z);
                    boolean z2 = this.z.e != 4 && v != this.z.s;
                    this.z = this.R(this.z.b, v, this.z.c, this.z.d, z2, 5);
                    if(z2) {
                        this.D0(v);
                    }
                    boolean[] arr_z1 = new boolean[this.a.length];
                    for(int v1 = 0; true; ++v1) {
                        Renderer[] arr_renderer = this.a;
                        if(v1 >= arr_renderer.length) {
                            break;
                        }
                        Renderer renderer0 = arr_renderer[v1];
                        boolean z3 = ExoPlayerImplInternal.W(renderer0);
                        arr_z1[v1] = z3;
                        SampleStream sampleStream0 = mediaPeriodHolder2.c[v1];
                        if(z3) {
                            if(sampleStream0 != renderer0.e()) {
                                this.u(renderer0);
                            }
                            else if(arr_z[v1]) {
                                renderer0.s(this.O);
                            }
                        }
                    }
                    this.y(arr_z1, this.O);
                }
                else {
                    this.s.I(mediaPeriodHolder0);
                    if(mediaPeriodHolder0.d) {
                        mediaPeriodHolder0.a(trackSelectorResult1, Math.max(mediaPeriodHolder0.f.b, mediaPeriodHolder0.A(this.O)), false);
                    }
                }
                this.M(true);
                if(this.z.e != 4) {
                    this.b0();
                    this.G1();
                    this.h.m(2);
                }
                return;
            }
            if(mediaPeriodHolder0 == mediaPeriodHolder1) {
                z = false;
            }
            mediaPeriodHolder0 = mediaPeriodHolder0.k();
        }
    }

    private void z1(boolean z, boolean z1) {
        this.B0(z || !this.J, false, true, false);
        this.A.b(((int)z1));
        this.f.q(this.w);
        this.r1(1);
    }
}

