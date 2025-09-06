package androidx.media3.exoplayer.analytics;

import android.os.SystemClock;
import android.util.Pair;
import androidx.annotation.Nullable;
import androidx.media3.common.AudioAttributes;
import androidx.media3.common.DeviceInfo;
import androidx.media3.common.Format;
import androidx.media3.common.MediaItem;
import androidx.media3.common.MediaMetadata;
import androidx.media3.common.Metadata;
import androidx.media3.common.PlaybackException;
import androidx.media3.common.PlaybackParameters;
import androidx.media3.common.Player.Commands;
import androidx.media3.common.Player.PositionInfo;
import androidx.media3.common.Player;
import androidx.media3.common.Timeline.Period;
import androidx.media3.common.TrackSelectionParameters;
import androidx.media3.common.Tracks;
import androidx.media3.common.VideoSize;
import androidx.media3.common.text.CueGroup;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.DecoderCounters;
import androidx.media3.exoplayer.DecoderReuseEvaluation;
import androidx.media3.exoplayer.audio.AudioSink.AudioTrackConfig;
import androidx.media3.exoplayer.source.LoadEventInfo;
import androidx.media3.exoplayer.source.MediaLoadData;
import androidx.media3.exoplayer.source.MediaSource.MediaPeriodId;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@UnstableApi
public final class PlaybackStatsListener implements AnalyticsListener, Listener {
    public interface Callback {
        void a(EventTime arg1, PlaybackStats arg2);
    }

    static final class PlaybackStatsTracker {
        private long A;
        private long B;
        private long C;
        private long D;
        private long E;
        private int F;
        private int G;
        private int H;
        private long I;
        private boolean J;
        private boolean K;
        private boolean L;
        private boolean M;
        private boolean N;
        private long O;
        @Nullable
        private Format P;
        @Nullable
        private Format Q;
        private long R;
        private long S;
        private float T;
        private final boolean a;
        private final long[] b;
        private final List c;
        private final List d;
        private final List e;
        private final List f;
        private final List g;
        private final List h;
        private final boolean i;
        private long j;
        private boolean k;
        private boolean l;
        private boolean m;
        private int n;
        private int o;
        private int p;
        private int q;
        private long r;
        private int s;
        private long t;
        private long u;
        private long v;
        private long w;
        private long x;
        private long y;
        private long z;

        public PlaybackStatsTracker(boolean z, EventTime analyticsListener$EventTime0) {
            this.a = z;
            this.b = new long[16];
            List list0 = z ? new ArrayList() : Collections.emptyList();
            this.c = list0;
            List list1 = z ? new ArrayList() : Collections.emptyList();
            this.d = list1;
            List list2 = z ? new ArrayList() : Collections.emptyList();
            this.e = list2;
            List list3 = z ? new ArrayList() : Collections.emptyList();
            this.f = list3;
            List list4 = z ? new ArrayList() : Collections.emptyList();
            this.g = list4;
            List list5 = z ? new ArrayList() : Collections.emptyList();
            this.h = list5;
            boolean z1 = false;
            this.H = 0;
            this.I = analyticsListener$EventTime0.a;
            this.j = 0x8000000000000001L;
            this.r = 0x8000000000000001L;
            if(analyticsListener$EventTime0.d != null && analyticsListener$EventTime0.d.c()) {
                z1 = true;
            }
            this.i = z1;
            this.u = -1L;
            this.t = -1L;
            this.s = -1;
            this.T = 1.0f;
        }

        public PlaybackStats a(boolean z) {
            List list1;
            long[] arr_v2;
            long[] arr_v = this.b;
            List list0 = this.d;
            if(z) {
                arr_v2 = arr_v;
                list1 = list0;
            }
            else {
                long v = SystemClock.elapsedRealtime();
                long[] arr_v1 = Arrays.copyOf(this.b, 16);
                arr_v1[this.H] += Math.max(0L, v - this.I);
                this.j(v);
                this.h(v);
                this.g(v);
                ArrayList arrayList0 = new ArrayList(this.d);
                if(this.a && this.H == 3) {
                    arrayList0.add(this.b(v));
                }
                arr_v2 = arr_v1;
                list1 = arrayList0;
            }
            int v1 = this.m || !this.k ? 1 : 0;
            long v2 = v1 == 0 ? arr_v2[2] : 0x8000000000000001L;
            int v3 = arr_v2[1] <= 0L ? 0 : 1;
            List list2 = z ? this.e : new ArrayList(this.e);
            List list3 = z ? this.f : new ArrayList(this.f);
            List list4 = z ? this.c : new ArrayList(this.c);
            long v4 = this.j;
            boolean z1 = this.K;
            int v5 = !this.k;
            boolean z2 = this.l;
            int v6 = this.n;
            int v7 = this.p;
            int v8 = this.o;
            long v9 = this.r;
            int v10 = this.q;
            long v11 = this.v;
            long v12 = this.w;
            long v13 = this.x;
            long v14 = this.y;
            long v15 = this.z;
            long v16 = this.A;
            int v17 = this.s;
            int v18 = this.s == -1 ? 0 : 1;
            long v19 = this.t;
            int v20 = Long.compare(this.t, -1L) == 0 ? 0 : 1;
            long v21 = this.u;
            int v22 = Long.compare(this.u, -1L) == 0 ? 0 : 1;
            long v23 = this.B;
            long v24 = this.C;
            long v25 = this.D;
            long v26 = this.E;
            int v27 = this.F;
            return v27 <= 0 ? new PlaybackStats(1, arr_v2, list4, list1, v4, ((int)z1), v5, ((int)z2), v3, v2, v1 ^ 1, v6, v8, v7, v10, v9, ((int)this.i), list2, list3, v11, v12, v13, v14, v15, v16, v18, v20, v17, v19, v22, v21, v23, v24, v25, v26, 0, v27, this.G, this.g, this.h) : new PlaybackStats(1, arr_v2, list4, list1, v4, ((int)z1), v5, ((int)z2), v3, v2, v1 ^ 1, v6, v8, v7, v10, v9, ((int)this.i), list2, list3, v11, v12, v13, v14, v15, v16, v18, v20, v17, v19, v22, v21, v23, v24, v25, v26, 1, v27, this.G, this.g, this.h);
        }

        private long[] b(long v) {
            long[] arr_v = (long[])this.d.get(this.d.size() - 1);
            return new long[]{v, arr_v[1] + ((long)(((float)(v - arr_v[0])) * this.T))};
        }

        private static boolean c(int v, int v1) {
            return v == 1 || v == 2 || v == 14 ? v1 != 1 && v1 != 2 && v1 != 14 && (v1 != 3 && v1 != 4 && v1 != 9 && v1 != 11) : false;
        }

        private static boolean d(int v) {
            return v == 4 || v == 7;
        }

        private static boolean e(int v) {
            return v == 3 || v == 4 || v == 9;
        }

        private static boolean f(int v) {
            return v == 6 || v == 7 || v == 10;
        }

        private void g(long v) {
            if(this.H == 3) {
                Format format0 = this.Q;
                if(format0 != null) {
                    int v1 = format0.i;
                    if(v1 != -1) {
                        long v2 = (long)(((float)(v - this.S)) * this.T);
                        this.z += v2;
                        this.A += v2 * ((long)v1);
                    }
                }
            }
            this.S = v;
        }

        private void h(long v) {
            if(this.H == 3) {
                Format format0 = this.P;
                if(format0 != null) {
                    long v1 = (long)(((float)(v - this.R)) * this.T);
                    int v2 = format0.u;
                    if(v2 != -1) {
                        this.v += v1;
                        this.w += ((long)v2) * v1;
                    }
                    int v3 = format0.i;
                    if(v3 != -1) {
                        this.x += v1;
                        this.y += v1 * ((long)v3);
                    }
                }
            }
            this.R = v;
        }

        private void i(EventTime analyticsListener$EventTime0, @Nullable Format format0) {
            if(Util.g(this.Q, format0)) {
                return;
            }
            this.g(analyticsListener$EventTime0.a);
            if(format0 != null && this.u == -1L) {
                int v = format0.i;
                if(v != -1) {
                    this.u = (long)v;
                }
            }
            this.Q = format0;
            if(this.a) {
                EventTimeAndFormat playbackStats$EventTimeAndFormat0 = new EventTimeAndFormat(analyticsListener$EventTime0, format0);
                this.f.add(playbackStats$EventTimeAndFormat0);
            }
        }

        private void j(long v) {
            if(PlaybackStatsTracker.f(this.H)) {
                long v1 = v - this.O;
                if(this.r == 0x8000000000000001L || v1 > this.r) {
                    this.r = v1;
                }
            }
        }

        private void k(long v, long v1) {
            if(!this.a) {
                return;
            }
            if(this.H != 3) {
                if(v1 == 0x8000000000000001L) {
                    return;
                }
                if(!this.d.isEmpty()) {
                    long v2 = ((long[])this.d.get(this.d.size() - 1))[1];
                    if(v2 != v1) {
                        this.d.add(new long[]{v, v2});
                    }
                }
            }
            if(v1 != 0x8000000000000001L) {
                this.d.add(new long[]{v, v1});
                return;
            }
            if(!this.d.isEmpty()) {
                long[] arr_v = this.b(v);
                this.d.add(arr_v);
            }
        }

        private void l(EventTime analyticsListener$EventTime0, @Nullable Format format0) {
            if(Util.g(this.P, format0)) {
                return;
            }
            this.h(analyticsListener$EventTime0.a);
            if(format0 != null) {
                if(this.s == -1) {
                    int v = format0.u;
                    if(v != -1) {
                        this.s = v;
                    }
                }
                if(this.t == -1L) {
                    int v1 = format0.i;
                    if(v1 != -1) {
                        this.t = (long)v1;
                    }
                }
            }
            this.P = format0;
            if(this.a) {
                EventTimeAndFormat playbackStats$EventTimeAndFormat0 = new EventTimeAndFormat(analyticsListener$EventTime0, format0);
                this.e.add(playbackStats$EventTimeAndFormat0);
            }
        }

        public void m(Player player0, EventTime analyticsListener$EventTime0, boolean z, long v, boolean z1, int v1, boolean z2, boolean z3, @Nullable PlaybackException playbackException0, @Nullable Exception exception0, long v2, long v3, @Nullable Format format0, @Nullable Format format1, @Nullable VideoSize videoSize0) {
            long v4 = 0x8000000000000001L;
            if(v != 0x8000000000000001L) {
                this.k(analyticsListener$EventTime0.a, v);
                this.J = true;
            }
            if(player0.b() != 2) {
                this.J = false;
            }
            switch(player0.b()) {
                case 1: 
                case 4: {
                    this.L = false;
                    break;
                }
                default: {
                    if(z1) {
                        this.L = false;
                    }
                }
            }
            if(playbackException0 != null) {
                this.M = true;
                ++this.F;
                if(this.a) {
                    EventTimeAndException playbackStats$EventTimeAndException0 = new EventTimeAndException(analyticsListener$EventTime0, playbackException0);
                    this.g.add(playbackStats$EventTimeAndException0);
                }
            }
            else if(player0.f() == null) {
                this.M = false;
            }
            if(this.K && !this.L) {
                Tracks tracks0 = player0.r0();
                if(!tracks0.e(2)) {
                    this.l(analyticsListener$EventTime0, null);
                }
                if(!tracks0.e(1)) {
                    this.i(analyticsListener$EventTime0, null);
                }
            }
            if(format0 != null) {
                this.l(analyticsListener$EventTime0, format0);
            }
            if(format1 != null) {
                this.i(analyticsListener$EventTime0, format1);
            }
            Format format2 = this.P;
            if(format2 != null && format2.u == -1 && videoSize0 != null) {
                this.l(analyticsListener$EventTime0, format2.a().v0(videoSize0.a).Y(videoSize0.b).K());
            }
            if(z3) {
                this.N = true;
            }
            if(z2) {
                ++this.E;
            }
            this.D += (long)v1;
            this.B += v2;
            this.C += v3;
            if(exception0 != null) {
                ++this.G;
                if(this.a) {
                    EventTimeAndException playbackStats$EventTimeAndException1 = new EventTimeAndException(analyticsListener$EventTime0, exception0);
                    this.h.add(playbackStats$EventTimeAndException1);
                }
            }
            int v5 = this.q(player0);
            float f = player0.m().a;
            if(this.H != v5 || this.T != f) {
                long v6 = analyticsListener$EventTime0.a;
                if(z) {
                    v4 = analyticsListener$EventTime0.e;
                }
                this.k(v6, v4);
                this.h(analyticsListener$EventTime0.a);
                this.g(analyticsListener$EventTime0.a);
            }
            this.T = f;
            if(this.H != v5) {
                this.r(v5, analyticsListener$EventTime0);
            }
        }

        public void n(EventTime analyticsListener$EventTime0, boolean z, long v) {
            int v1 = this.H == 11 || z ? 11 : 15;
            this.k(analyticsListener$EventTime0.a, v);
            this.h(analyticsListener$EventTime0.a);
            this.g(analyticsListener$EventTime0.a);
            this.r(v1, analyticsListener$EventTime0);
        }

        public void o() {
            this.K = true;
        }

        public void p() {
            this.L = true;
            this.J = false;
        }

        private int q(Player player0) {
            int v = player0.b();
            if(this.J && this.K) {
                return 5;
            }
            if(this.M) {
                return 13;
            }
            if(!this.K) {
                return this.N;
            }
            if(this.L) {
                return 14;
            }
            switch(v) {
                case 1: {
                    return this.H == 0 ? this.H : 12;
                }
                case 2: {
                    if(this.H != 0 && this.H != 1 && this.H != 2 && this.H != 14) {
                        if(!player0.D0()) {
                            return 7;
                        }
                        return player0.N1() == 0 ? 6 : 10;
                    }
                    return 2;
                }
                case 3: {
                    if(!player0.D0()) {
                        return 4;
                    }
                    return player0.N1() == 0 ? 3 : 9;
                }
                case 4: {
                    return 11;
                }
                default: {
                    return this.H;
                }
            }
        }

        private void r(int v, EventTime analyticsListener$EventTime0) {
            boolean z = false;
            Assertions.a(analyticsListener$EventTime0.a >= this.I);
            long v1 = analyticsListener$EventTime0.a;
            int v2 = this.H;
            this.b[v2] += v1 - this.I;
            if(this.j == 0x8000000000000001L) {
                this.j = v1;
            }
            this.m |= PlaybackStatsTracker.c(v2, v);
            this.k |= PlaybackStatsTracker.e(v);
            boolean z1 = this.l;
            if(v == 11) {
                z = true;
            }
            this.l = z1 | z;
            if(!PlaybackStatsTracker.d(this.H) && PlaybackStatsTracker.d(v)) {
                ++this.n;
            }
            if(v == 5) {
                ++this.p;
            }
            if(!PlaybackStatsTracker.f(this.H) && PlaybackStatsTracker.f(v)) {
                ++this.q;
                this.O = analyticsListener$EventTime0.a;
            }
            if(PlaybackStatsTracker.f(this.H) && this.H != 7 && v == 7) {
                ++this.o;
            }
            this.j(analyticsListener$EventTime0.a);
            this.H = v;
            this.I = analyticsListener$EventTime0.a;
            if(this.a) {
                EventTimeAndPlaybackState playbackStats$EventTimeAndPlaybackState0 = new EventTimeAndPlaybackState(analyticsListener$EventTime0, v);
                this.c.add(playbackStats$EventTimeAndPlaybackState0);
            }
        }
    }

    @Nullable
    private Format A0;
    @Nullable
    private Format B0;
    private VideoSize C0;
    private final PlaybackSessionManager m0;
    private final Map n0;
    private final Map o0;
    @Nullable
    private final Callback p0;
    private final boolean q0;
    private final Period r0;
    private PlaybackStats s0;
    @Nullable
    private String t0;
    private long u0;
    private int v0;
    private int w0;
    @Nullable
    private Exception x0;
    private long y0;
    private long z0;

    public PlaybackStatsListener(boolean z, @Nullable Callback playbackStatsListener$Callback0) {
        this.p0 = playbackStatsListener$Callback0;
        this.q0 = z;
        DefaultPlaybackSessionManager defaultPlaybackSessionManager0 = new DefaultPlaybackSessionManager();
        this.m0 = defaultPlaybackSessionManager0;
        this.n0 = new HashMap();
        this.o0 = new HashMap();
        this.s0 = PlaybackStats.e0;
        this.r0 = new Period();
        this.C0 = VideoSize.i;
        defaultPlaybackSessionManager0.b(this);
    }

    @Override  // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void A(EventTime analyticsListener$EventTime0, int v, long v1) {
        this.w0 = v;
    }

    @Override  // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void A0(EventTime analyticsListener$EventTime0, Format format0, DecoderReuseEvaluation decoderReuseEvaluation0) {
    }

    @Override  // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void B(EventTime analyticsListener$EventTime0, String s, long v) {
    }

    private Pair B0(Events analyticsListener$Events0, String s) {
        EventTime analyticsListener$EventTime0 = null;
        boolean z = false;
        for(int v = 0; v < analyticsListener$Events0.e(); ++v) {
            EventTime analyticsListener$EventTime1 = analyticsListener$Events0.d(analyticsListener$Events0.c(v));
            boolean z1 = this.m0.f(analyticsListener$EventTime1, s);
            if(analyticsListener$EventTime0 == null || z1 && !z || z1 == z && analyticsListener$EventTime1.a > analyticsListener$EventTime0.a) {
                analyticsListener$EventTime0 = analyticsListener$EventTime1;
                z = z1;
            }
        }
        Assertions.g(analyticsListener$EventTime0);
        if(!z && (analyticsListener$EventTime0.d != null && analyticsListener$EventTime0.d.c())) {
            long v1 = analyticsListener$EventTime0.b.l(analyticsListener$EventTime0.d.a, this.r0).h(analyticsListener$EventTime0.d.b);
            if(v1 == 0x8000000000000000L) {
                v1 = this.r0.d;
            }
            MediaPeriodId mediaSource$MediaPeriodId0 = new MediaPeriodId(analyticsListener$EventTime0.d.a, analyticsListener$EventTime0.d.d, analyticsListener$EventTime0.d.b);
            long v2 = Util.B2(v1 + this.r0.r());
            EventTime analyticsListener$EventTime2 = new EventTime(analyticsListener$EventTime0.a, analyticsListener$EventTime0.b, analyticsListener$EventTime0.c, mediaSource$MediaPeriodId0, v2, analyticsListener$EventTime0.b, analyticsListener$EventTime0.g, analyticsListener$EventTime0.h, analyticsListener$EventTime0.i, analyticsListener$EventTime0.j);
            z = this.m0.f(analyticsListener$EventTime2, s);
            analyticsListener$EventTime0 = analyticsListener$EventTime2;
        }
        return Pair.create(analyticsListener$EventTime0, Boolean.valueOf(z));
    }

    @Override  // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void C(EventTime analyticsListener$EventTime0) {
    }

    public PlaybackStats C0() {
        int v = 1;
        PlaybackStats[] arr_playbackStats = new PlaybackStats[this.n0.size() + 1];
        arr_playbackStats[0] = this.s0;
        for(Object object0: this.n0.values()) {
            arr_playbackStats[v] = ((PlaybackStatsTracker)object0).a(false);
            ++v;
        }
        return PlaybackStats.W(arr_playbackStats);
    }

    @Override  // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void D(EventTime analyticsListener$EventTime0, Tracks tracks0) {
    }

    @Nullable
    public PlaybackStats D0() {
        String s = this.m0.d();
        PlaybackStatsTracker playbackStatsListener$PlaybackStatsTracker0 = s == null ? null : ((PlaybackStatsTracker)this.n0.get(s));
        return playbackStatsListener$PlaybackStatsTracker0 == null ? null : playbackStatsListener$PlaybackStatsTracker0.a(false);
    }

    @Override  // androidx.media3.exoplayer.analytics.PlaybackSessionManager$Listener
    public void E(EventTime analyticsListener$EventTime0, String s, boolean z) {
        PlaybackStatsTracker playbackStatsListener$PlaybackStatsTracker0 = (PlaybackStatsTracker)Assertions.g(((PlaybackStatsTracker)this.n0.remove(s)));
        EventTime analyticsListener$EventTime1 = (EventTime)Assertions.g(((EventTime)this.o0.remove(s)));
        playbackStatsListener$PlaybackStatsTracker0.n(analyticsListener$EventTime0, z, (s.equals(this.t0) ? this.u0 : 0x8000000000000001L));
        PlaybackStats playbackStats0 = playbackStatsListener$PlaybackStatsTracker0.a(true);
        this.s0 = PlaybackStats.W(new PlaybackStats[]{this.s0, playbackStats0});
        Callback playbackStatsListener$Callback0 = this.p0;
        if(playbackStatsListener$Callback0 != null) {
            playbackStatsListener$Callback0.a(analyticsListener$EventTime1, playbackStats0);
        }
    }

    private boolean E0(Events analyticsListener$Events0, String s, int v) {
        if(analyticsListener$Events0.a(v)) {
            EventTime analyticsListener$EventTime0 = analyticsListener$Events0.d(v);
            return this.m0.f(analyticsListener$EventTime0, s);
        }
        return false;
    }

    @Override  // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void F(EventTime analyticsListener$EventTime0, VideoSize videoSize0) {
        this.C0 = videoSize0;
    }

    private void F0(Events analyticsListener$Events0) {
        for(int v = 0; v < analyticsListener$Events0.e(); ++v) {
            int v1 = analyticsListener$Events0.c(v);
            EventTime analyticsListener$EventTime0 = analyticsListener$Events0.d(v1);
            if(v1 == 0) {
                this.m0.g(analyticsListener$EventTime0);
            }
            else if(v1 == 11) {
                this.m0.c(analyticsListener$EventTime0, this.v0);
            }
            else {
                this.m0.a(analyticsListener$EventTime0);
            }
        }
    }

    @Override  // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void G(EventTime analyticsListener$EventTime0, long v) {
    }

    @Override  // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void H(EventTime analyticsListener$EventTime0, long v, int v1) {
    }

    @Override  // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void I(EventTime analyticsListener$EventTime0, MediaLoadData mediaLoadData0) {
        int v = mediaLoadData0.b;
        if(v == 0 || v == 2) {
            this.A0 = mediaLoadData0.c;
        }
        else if(v == 1) {
            this.B0 = mediaLoadData0.c;
        }
    }

    @Override  // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void J(Player player0, Events analyticsListener$Events0) {
        if(analyticsListener$Events0.e() == 0) {
            return;
        }
        this.F0(analyticsListener$Events0);
        for(Object object0: this.n0.keySet()) {
            Pair pair0 = this.B0(analyticsListener$Events0, ((String)object0));
            Object object1 = this.n0.get(((String)object0));
            boolean z = this.E0(analyticsListener$Events0, ((String)object0), 11);
            boolean z1 = this.E0(analyticsListener$Events0, ((String)object0), 0x3FA);
            boolean z2 = this.E0(analyticsListener$Events0, ((String)object0), 0x3F3);
            boolean z3 = this.E0(analyticsListener$Events0, ((String)object0), 1000);
            boolean z4 = this.E0(analyticsListener$Events0, ((String)object0), 10);
            boolean z5 = this.E0(analyticsListener$Events0, ((String)object0), 1003) || this.E0(analyticsListener$Events0, ((String)object0), 0x400);
            boolean z6 = this.E0(analyticsListener$Events0, ((String)object0), 1006);
            boolean z7 = this.E0(analyticsListener$Events0, ((String)object0), 1004);
            boolean z8 = this.E0(analyticsListener$Events0, ((String)object0), 25);
            ((PlaybackStatsTracker)object1).m(player0, ((EventTime)pair0.first), ((Boolean)pair0.second).booleanValue(), (((String)object0).equals(this.t0) ? this.u0 : 0x8000000000000001L), z, (z1 ? this.w0 : 0), z2, z3, (z4 ? player0.f() : null), (z5 ? this.x0 : null), (z6 ? this.y0 : 0L), (z6 ? this.z0 : 0L), (z7 ? this.A0 : null), (z7 ? this.B0 : null), (z8 ? this.C0 : null));
        }
        this.A0 = null;
        this.B0 = null;
        this.t0 = null;
        if(analyticsListener$Events0.a(0x404)) {
            EventTime analyticsListener$EventTime0 = analyticsListener$Events0.d(0x404);
            this.m0.h(analyticsListener$EventTime0);
        }
    }

    @Override  // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void K(EventTime analyticsListener$EventTime0, DeviceInfo deviceInfo0) {
    }

    @Override  // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void L(EventTime analyticsListener$EventTime0) {
    }

    @Override  // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void M(EventTime analyticsListener$EventTime0, Object object0, long v) {
    }

    @Override  // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void N(EventTime analyticsListener$EventTime0, boolean z) {
    }

    @Override  // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void O(EventTime analyticsListener$EventTime0, int v, boolean z) {
    }

    @Override  // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void P(EventTime analyticsListener$EventTime0, Metadata metadata0) {
    }

    @Override  // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void Q(EventTime analyticsListener$EventTime0, List list0) {
    }

    @Override  // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void R(EventTime analyticsListener$EventTime0, boolean z) {
    }

    @Override  // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void S(EventTime analyticsListener$EventTime0, PlaybackException playbackException0) {
    }

    @Override  // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void T(EventTime analyticsListener$EventTime0, long v) {
    }

    @Override  // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void U(EventTime analyticsListener$EventTime0, DecoderCounters decoderCounters0) {
    }

    @Override  // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void V(EventTime analyticsListener$EventTime0, MediaMetadata mediaMetadata0) {
    }

    @Override  // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void W(EventTime analyticsListener$EventTime0, AudioAttributes audioAttributes0) {
    }

    @Override  // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void X(EventTime analyticsListener$EventTime0, int v) {
    }

    @Override  // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void Y(EventTime analyticsListener$EventTime0, DecoderCounters decoderCounters0) {
    }

    @Override  // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void Z(EventTime analyticsListener$EventTime0) {
    }

    @Override  // androidx.media3.exoplayer.analytics.PlaybackSessionManager$Listener
    public void a(EventTime analyticsListener$EventTime0, String s, String s1) {
        ((PlaybackStatsTracker)Assertions.g(((PlaybackStatsTracker)this.n0.get(s)))).p();
    }

    @Override  // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void a0(EventTime analyticsListener$EventTime0, PositionInfo player$PositionInfo0, PositionInfo player$PositionInfo1, int v) {
        if(this.t0 == null) {
            this.t0 = this.m0.d();
            this.u0 = player$PositionInfo0.g;
        }
        this.v0 = v;
    }

    @Override  // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void b(EventTime analyticsListener$EventTime0, boolean z) {
    }

    @Override  // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void b0(EventTime analyticsListener$EventTime0, DecoderCounters decoderCounters0) {
    }

    @Override  // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void c(EventTime analyticsListener$EventTime0, int v) {
    }

    @Override  // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void c0(EventTime analyticsListener$EventTime0, Exception exception0) {
    }

    @Override  // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void d(EventTime analyticsListener$EventTime0, boolean z, int v) {
    }

    @Override  // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void d0(EventTime analyticsListener$EventTime0, float f) {
    }

    @Override  // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void e(EventTime analyticsListener$EventTime0) {
    }

    @Override  // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void e0(EventTime analyticsListener$EventTime0, LoadEventInfo loadEventInfo0, MediaLoadData mediaLoadData0, IOException iOException0, boolean z) {
        this.x0 = iOException0;
    }

    @Override  // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void f(EventTime analyticsListener$EventTime0, int v, long v1, long v2) {
        this.y0 = (long)v;
        this.z0 = v1;
    }

    @Override  // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void f0(EventTime analyticsListener$EventTime0, long v) {
    }

    @Override  // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void g(EventTime analyticsListener$EventTime0, Exception exception0) {
    }

    @Override  // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void g0(EventTime analyticsListener$EventTime0, int v, long v1, long v2) {
    }

    @Override  // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void h(EventTime analyticsListener$EventTime0, LoadEventInfo loadEventInfo0, MediaLoadData mediaLoadData0) {
    }

    @Override  // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void h0(EventTime analyticsListener$EventTime0, String s, long v) {
    }

    @Override  // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void i(EventTime analyticsListener$EventTime0, String s, long v, long v1) {
    }

    @Override  // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void i0(EventTime analyticsListener$EventTime0, AudioTrackConfig audioSink$AudioTrackConfig0) {
    }

    @Override  // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void j(EventTime analyticsListener$EventTime0, TrackSelectionParameters trackSelectionParameters0) {
    }

    @Override  // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void j0(EventTime analyticsListener$EventTime0, String s) {
    }

    @Override  // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void k(EventTime analyticsListener$EventTime0, Exception exception0) {
        this.x0 = exception0;
    }

    @Override  // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void k0(EventTime analyticsListener$EventTime0, String s) {
    }

    @Override  // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void l(EventTime analyticsListener$EventTime0, MediaItem mediaItem0, int v) {
    }

    @Override  // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void l0(EventTime analyticsListener$EventTime0) {
    }

    @Override  // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void m(EventTime analyticsListener$EventTime0, DecoderCounters decoderCounters0) {
    }

    @Override  // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void m0(EventTime analyticsListener$EventTime0, int v, int v1, int v2, float f) {
    }

    @Override  // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void n(EventTime analyticsListener$EventTime0, int v, int v1) {
    }

    @Override  // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void n0(EventTime analyticsListener$EventTime0) {
    }

    @Override  // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void o(EventTime analyticsListener$EventTime0, int v) {
    }

    @Override  // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void o0(EventTime analyticsListener$EventTime0, LoadEventInfo loadEventInfo0, MediaLoadData mediaLoadData0) {
    }

    @Override  // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void p(EventTime analyticsListener$EventTime0, Commands player$Commands0) {
    }

    @Override  // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void p0(EventTime analyticsListener$EventTime0, boolean z, int v) {
    }

    @Override  // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void q(EventTime analyticsListener$EventTime0, Exception exception0) {
    }

    @Override  // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void q0(EventTime analyticsListener$EventTime0, PlaybackException playbackException0) {
    }

    @Override  // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void r(EventTime analyticsListener$EventTime0, boolean z) {
    }

    @Override  // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void r0(EventTime analyticsListener$EventTime0) {
    }

    @Override  // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void s(EventTime analyticsListener$EventTime0, int v) {
    }

    @Override  // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void s0(EventTime analyticsListener$EventTime0, long v) {
    }

    @Override  // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void t(EventTime analyticsListener$EventTime0, int v) {
    }

    @Override  // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void t0(EventTime analyticsListener$EventTime0, int v) {
    }

    @Override  // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void u(EventTime analyticsListener$EventTime0, Format format0, DecoderReuseEvaluation decoderReuseEvaluation0) {
    }

    @Override  // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void u0(EventTime analyticsListener$EventTime0, CueGroup cueGroup0) {
    }

    @Override  // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void v(EventTime analyticsListener$EventTime0, PlaybackParameters playbackParameters0) {
    }

    @Override  // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void v0(EventTime analyticsListener$EventTime0, String s, long v, long v1) {
    }

    @Override  // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void w(EventTime analyticsListener$EventTime0, AudioTrackConfig audioSink$AudioTrackConfig0) {
    }

    @Override  // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void w0(EventTime analyticsListener$EventTime0, MediaMetadata mediaMetadata0) {
    }

    @Override  // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void x(EventTime analyticsListener$EventTime0, int v) {
    }

    @Override  // androidx.media3.exoplayer.analytics.PlaybackSessionManager$Listener
    public void x0(EventTime analyticsListener$EventTime0, String s) {
        PlaybackStatsTracker playbackStatsListener$PlaybackStatsTracker0 = new PlaybackStatsTracker(this.q0, analyticsListener$EventTime0);
        this.n0.put(s, playbackStatsListener$PlaybackStatsTracker0);
        this.o0.put(s, analyticsListener$EventTime0);
    }

    @Override  // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void y(EventTime analyticsListener$EventTime0, MediaLoadData mediaLoadData0) {
    }

    @Override  // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void y0(EventTime analyticsListener$EventTime0, LoadEventInfo loadEventInfo0, MediaLoadData mediaLoadData0) {
    }

    @Override  // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void z(EventTime analyticsListener$EventTime0, boolean z) {
    }

    @Override  // androidx.media3.exoplayer.analytics.PlaybackSessionManager$Listener
    public void z0(EventTime analyticsListener$EventTime0, String s) {
        ((PlaybackStatsTracker)Assertions.g(((PlaybackStatsTracker)this.n0.get(s)))).o();
    }
}

