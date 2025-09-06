package androidx.media3.exoplayer.source.ads;

import android.os.Handler;
import android.util.Pair;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import androidx.media3.common.AdPlaybackState.AdGroup;
import androidx.media3.common.AdPlaybackState;
import androidx.media3.common.Format;
import androidx.media3.common.MediaItem;
import androidx.media3.common.Timeline.Period;
import androidx.media3.common.Timeline.Window;
import androidx.media3.common.Timeline;
import androidx.media3.common.TrackGroup;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.TransferListener;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.FormatHolder;
import androidx.media3.exoplayer.LoadingInfo;
import androidx.media3.exoplayer.SeekParameters;
import androidx.media3.exoplayer.analytics.PlayerId;
import androidx.media3.exoplayer.drm.DrmSessionEventListener;
import androidx.media3.exoplayer.source.BaseMediaSource;
import androidx.media3.exoplayer.source.EmptySampleStream;
import androidx.media3.exoplayer.source.ForwardingTimeline;
import androidx.media3.exoplayer.source.LoadEventInfo;
import androidx.media3.exoplayer.source.MediaLoadData;
import androidx.media3.exoplayer.source.MediaPeriod.Callback;
import androidx.media3.exoplayer.source.MediaPeriod;
import androidx.media3.exoplayer.source.MediaSource.MediaPeriodId;
import androidx.media3.exoplayer.source.MediaSource.MediaSourceCaller;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.source.MediaSourceEventListener.EventDispatcher;
import androidx.media3.exoplayer.source.MediaSourceEventListener;
import androidx.media3.exoplayer.source.SampleStream;
import androidx.media3.exoplayer.source.SequenceableLoader;
import androidx.media3.exoplayer.source.TrackGroupArray;
import androidx.media3.exoplayer.trackselection.ExoTrackSelection;
import androidx.media3.exoplayer.upstream.Allocator;
import com.google.common.collect.Q2;
import com.google.common.collect.p3;
import com.google.common.collect.s;
import com.google.common.collect.u5;
import com.google.common.collect.y3;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;

@UnstableApi
public final class ServerSideAdInsertionMediaSource extends BaseMediaSource implements DrmSessionEventListener, MediaSourceCaller, MediaSourceEventListener {
    public interface AdPlaybackStateUpdater {
        boolean a(Timeline arg1);
    }

    static final class MediaPeriodImpl implements MediaPeriod {
        public final SharedMediaPeriod a;
        public final MediaPeriodId b;
        public final EventDispatcher c;
        public final androidx.media3.exoplayer.drm.DrmSessionEventListener.EventDispatcher d;
        public Callback e;
        public long f;
        public boolean[] g;
        public boolean h;

        public MediaPeriodImpl(SharedMediaPeriod serverSideAdInsertionMediaSource$SharedMediaPeriod0, MediaPeriodId mediaSource$MediaPeriodId0, EventDispatcher mediaSourceEventListener$EventDispatcher0, androidx.media3.exoplayer.drm.DrmSessionEventListener.EventDispatcher drmSessionEventListener$EventDispatcher0) {
            this.a = serverSideAdInsertionMediaSource$SharedMediaPeriod0;
            this.b = mediaSource$MediaPeriodId0;
            this.c = mediaSourceEventListener$EventDispatcher0;
            this.d = drmSessionEventListener$EventDispatcher0;
            this.g = new boolean[0];
        }

        @Override  // androidx.media3.exoplayer.source.MediaPeriod
        public boolean a() {
            return this.a.s(this);
        }

        public void b() {
            Callback mediaPeriod$Callback0 = this.e;
            if(mediaPeriod$Callback0 != null) {
                mediaPeriod$Callback0.h(this);
            }
            this.h = true;
        }

        @Override  // androidx.media3.exoplayer.source.MediaPeriod
        public long c(long v, SeekParameters seekParameters0) {
            return this.a.j(this, v, seekParameters0);
        }

        @Override  // androidx.media3.exoplayer.source.MediaPeriod
        public long d() {
            return this.a.k(this);
        }

        @Override  // androidx.media3.exoplayer.source.MediaPeriod
        public void e(long v) {
            this.a.F(this, v);
        }

        @Override  // androidx.media3.exoplayer.source.MediaPeriod
        public boolean f(LoadingInfo loadingInfo0) {
            return this.a.f(this, loadingInfo0);
        }

        @Override  // androidx.media3.exoplayer.source.MediaPeriod
        public long g() {
            return this.a.o(this);
        }

        @Override  // androidx.media3.exoplayer.source.MediaPeriod
        public List i(List list0) {
            return this.a.p(list0);
        }

        @Override  // androidx.media3.exoplayer.source.MediaPeriod
        public long j(long v) {
            return this.a.I(this, v);
        }

        @Override  // androidx.media3.exoplayer.source.MediaPeriod
        public long k() {
            return this.a.E(this);
        }

        @Override  // androidx.media3.exoplayer.source.MediaPeriod
        public TrackGroupArray n() {
            return this.a.r();
        }

        @Override  // androidx.media3.exoplayer.source.MediaPeriod
        public long q(ExoTrackSelection[] arr_exoTrackSelection, boolean[] arr_z, SampleStream[] arr_sampleStream, boolean[] arr_z1, long v) {
            if(this.g.length == 0) {
                this.g = new boolean[arr_sampleStream.length];
            }
            return this.a.J(this, arr_exoTrackSelection, arr_z, arr_sampleStream, arr_z1, v);
        }

        @Override  // androidx.media3.exoplayer.source.MediaPeriod
        public void s() throws IOException {
            this.a.x();
        }

        @Override  // androidx.media3.exoplayer.source.MediaPeriod
        public void t(Callback mediaPeriod$Callback0, long v) {
            this.e = mediaPeriod$Callback0;
            this.a.C(this, v);
        }

        @Override  // androidx.media3.exoplayer.source.MediaPeriod
        public void v(long v, boolean z) {
            this.a.g(this, v, z);
        }
    }

    static final class SampleStreamImpl implements SampleStream {
        private final MediaPeriodImpl a;
        private final int b;

        public SampleStreamImpl(MediaPeriodImpl serverSideAdInsertionMediaSource$MediaPeriodImpl0, int v) {
            this.a = serverSideAdInsertionMediaSource$MediaPeriodImpl0;
            this.b = v;
        }

        @Override  // androidx.media3.exoplayer.source.SampleStream
        public void b() throws IOException {
            this.a.a.w(this.b);
        }

        @Override  // androidx.media3.exoplayer.source.SampleStream
        public boolean isReady() {
            return this.a.a.t(this.b);
        }

        @Override  // androidx.media3.exoplayer.source.SampleStream
        public int m(FormatHolder formatHolder0, DecoderInputBuffer decoderInputBuffer0, int v) {
            return this.a.a.D(this.a, this.b, formatHolder0, decoderInputBuffer0, v);
        }

        @Override  // androidx.media3.exoplayer.source.SampleStream
        public int p(long v) {
            return this.a.a.K(this.a, this.b, v);
        }
    }

    static final class ServerSideAdInsertionTimeline extends ForwardingTimeline {
        private final Q2 f;

        public ServerSideAdInsertionTimeline(Timeline timeline0, Q2 q20) {
            super(timeline0);
            Assertions.i(timeline0.v() == 1);
            Period timeline$Period0 = new Period();
            for(int v = 0; v < timeline0.m(); ++v) {
                timeline0.k(v, timeline$Period0, true);
                Assertions.i(q20.containsKey(Assertions.g(timeline$Period0.b)));
            }
            this.f = q20;
        }

        @Override  // androidx.media3.exoplayer.source.ForwardingTimeline
        public Period k(int v, Period timeline$Period0, boolean z) {
            super.k(v, timeline$Period0, true);
            Object object0 = Assertions.g(((AdPlaybackState)this.f.get(timeline$Period0.b)));
            long v1 = timeline$Period0.d == 0x8000000000000001L ? ((AdPlaybackState)object0).d : ServerSideAdInsertionUtil.f(timeline$Period0.d, -1, ((AdPlaybackState)object0));
            Period timeline$Period1 = new Period();
            long v3 = 0L;
            for(int v2 = 0; v2 < v + 1; ++v2) {
                this.e.k(v2, timeline$Period1, true);
                AdPlaybackState adPlaybackState0 = (AdPlaybackState)Assertions.g(((AdPlaybackState)this.f.get(timeline$Period1.b)));
                if(v2 == 0) {
                    v3 = -ServerSideAdInsertionUtil.f(-timeline$Period1.r(), -1, adPlaybackState0);
                }
                if(v2 != v) {
                    v3 += ServerSideAdInsertionUtil.f(timeline$Period1.d, -1, adPlaybackState0);
                }
            }
            timeline$Period0.x(timeline$Period0.a, timeline$Period0.b, timeline$Period0.c, v1, v3, ((AdPlaybackState)object0), timeline$Period0.f);
            return timeline$Period0;
        }

        @Override  // androidx.media3.exoplayer.source.ForwardingTimeline
        public Window u(int v, Window timeline$Window0, long v1) {
            super.u(v, timeline$Window0, v1);
            Period timeline$Period0 = new Period();
            Object object0 = Assertions.g(this.k(timeline$Window0.n, timeline$Period0, true).b);
            AdPlaybackState adPlaybackState0 = (AdPlaybackState)Assertions.g(((AdPlaybackState)this.f.get(object0)));
            long v2 = ServerSideAdInsertionUtil.f(timeline$Window0.p, -1, adPlaybackState0);
            if(timeline$Window0.m == 0x8000000000000001L) {
                long v3 = adPlaybackState0.d;
                if(v3 != 0x8000000000000001L) {
                    timeline$Window0.m = v3 - v2;
                }
            }
            else {
                Period timeline$Period1 = super.k(timeline$Window0.o, timeline$Period0, true);
                long v4 = timeline$Period1.e;
                AdPlaybackState adPlaybackState1 = (AdPlaybackState)Assertions.g(((AdPlaybackState)this.f.get(timeline$Period1.b)));
                Period timeline$Period2 = this.j(timeline$Window0.o, timeline$Period0);
                long v5 = ServerSideAdInsertionUtil.f(timeline$Window0.m - v4, -1, adPlaybackState1);
                timeline$Window0.m = timeline$Period2.e + v5;
            }
            timeline$Window0.p = v2;
            return timeline$Window0;
        }
    }

    static final class SharedMediaPeriod implements Callback {
        private final MediaPeriod a;
        private final List b;
        private final Map c;
        private final Object d;
        private AdPlaybackState e;
        @Nullable
        private MediaPeriodImpl f;
        private boolean g;
        private boolean h;
        public ExoTrackSelection[] i;
        public SampleStream[] j;
        public MediaLoadData[] k;

        public SharedMediaPeriod(MediaPeriod mediaPeriod0, Object object0, AdPlaybackState adPlaybackState0) {
            this.a = mediaPeriod0;
            this.d = object0;
            this.e = adPlaybackState0;
            this.b = new ArrayList();
            this.c = new HashMap();
            this.i = new ExoTrackSelection[0];
            this.j = new SampleStream[0];
            this.k = new MediaLoadData[0];
        }

        public void A(LoadEventInfo loadEventInfo0) {
            this.c.remove(loadEventInfo0.a);
        }

        public void B(LoadEventInfo loadEventInfo0, MediaLoadData mediaLoadData0) {
            Pair pair0 = Pair.create(loadEventInfo0, mediaLoadData0);
            this.c.put(loadEventInfo0.a, pair0);
        }

        public void C(MediaPeriodImpl serverSideAdInsertionMediaSource$MediaPeriodImpl0, long v) {
            serverSideAdInsertionMediaSource$MediaPeriodImpl0.f = v;
            if(this.g) {
                if(this.h) {
                    serverSideAdInsertionMediaSource$MediaPeriodImpl0.b();
                }
                return;
            }
            this.g = true;
            long v1 = ServerSideAdInsertionUtil.g(v, serverSideAdInsertionMediaSource$MediaPeriodImpl0.b, this.e);
            this.a.t(this, v1);
        }

        public int D(MediaPeriodImpl serverSideAdInsertionMediaSource$MediaPeriodImpl0, int v, FormatHolder formatHolder0, DecoderInputBuffer decoderInputBuffer0, int v1) {
            long v2 = this.k(serverSideAdInsertionMediaSource$MediaPeriodImpl0);
            int v3 = ((SampleStream)Util.o(this.j[v])).m(formatHolder0, decoderInputBuffer0, v1 | 5);
            long v4 = this.n(serverSideAdInsertionMediaSource$MediaPeriodImpl0, decoderInputBuffer0.f);
            if(v3 == -4 && v4 == 0x8000000000000000L || v3 == -3 && v2 == 0x8000000000000000L && !decoderInputBuffer0.e) {
                this.v(serverSideAdInsertionMediaSource$MediaPeriodImpl0, v);
                decoderInputBuffer0.f();
                decoderInputBuffer0.e(4);
                return -4;
            }
            if(v3 == -4) {
                this.v(serverSideAdInsertionMediaSource$MediaPeriodImpl0, v);
                ((SampleStream)Util.o(this.j[v])).m(formatHolder0, decoderInputBuffer0, v1);
                decoderInputBuffer0.f = v4;
            }
            return v3;
        }

        public long E(MediaPeriodImpl serverSideAdInsertionMediaSource$MediaPeriodImpl0) {
            if(!serverSideAdInsertionMediaSource$MediaPeriodImpl0.equals(this.b.get(0))) {
                return 0x8000000000000001L;
            }
            long v = this.a.k();
            return v == 0x8000000000000001L ? 0x8000000000000001L : ServerSideAdInsertionUtil.d(v, serverSideAdInsertionMediaSource$MediaPeriodImpl0.b, this.e);
        }

        public void F(MediaPeriodImpl serverSideAdInsertionMediaSource$MediaPeriodImpl0, long v) {
            long v1 = this.q(serverSideAdInsertionMediaSource$MediaPeriodImpl0, v);
            this.a.e(v1);
        }

        public void G(MediaSource mediaSource0) {
            mediaSource0.r(this.a);
        }

        public void H(MediaPeriodImpl serverSideAdInsertionMediaSource$MediaPeriodImpl0) {
            if(serverSideAdInsertionMediaSource$MediaPeriodImpl0.equals(this.f)) {
                this.f = null;
                this.c.clear();
            }
            this.b.remove(serverSideAdInsertionMediaSource$MediaPeriodImpl0);
        }

        public long I(MediaPeriodImpl serverSideAdInsertionMediaSource$MediaPeriodImpl0, long v) {
            long v1 = ServerSideAdInsertionUtil.g(v, serverSideAdInsertionMediaSource$MediaPeriodImpl0.b, this.e);
            return ServerSideAdInsertionUtil.d(this.a.j(v1), serverSideAdInsertionMediaSource$MediaPeriodImpl0.b, this.e);
        }

        public long J(MediaPeriodImpl serverSideAdInsertionMediaSource$MediaPeriodImpl0, ExoTrackSelection[] arr_exoTrackSelection, boolean[] arr_z, SampleStream[] arr_sampleStream, boolean[] arr_z1, long v) {
            serverSideAdInsertionMediaSource$MediaPeriodImpl0.f = v;
            if(serverSideAdInsertionMediaSource$MediaPeriodImpl0.equals(this.b.get(0))) {
                this.i = (ExoTrackSelection[])Arrays.copyOf(arr_exoTrackSelection, arr_exoTrackSelection.length);
                long v2 = ServerSideAdInsertionUtil.g(v, serverSideAdInsertionMediaSource$MediaPeriodImpl0.b, this.e);
                SampleStream[] arr_sampleStream1 = this.j.length == 0 ? new SampleStream[arr_exoTrackSelection.length] : ((SampleStream[])Arrays.copyOf(this.j, this.j.length));
                long v3 = this.a.q(arr_exoTrackSelection, arr_z, arr_sampleStream1, arr_z1, v2);
                this.j = (SampleStream[])Arrays.copyOf(arr_sampleStream1, arr_sampleStream1.length);
                this.k = (MediaLoadData[])Arrays.copyOf(this.k, arr_sampleStream1.length);
                for(int v1 = 0; v1 < arr_sampleStream1.length; ++v1) {
                    if(arr_sampleStream1[v1] == null) {
                        arr_sampleStream[v1] = null;
                        this.k[v1] = null;
                    }
                    else if(arr_sampleStream[v1] == null || arr_z1[v1]) {
                        arr_sampleStream[v1] = new SampleStreamImpl(serverSideAdInsertionMediaSource$MediaPeriodImpl0, v1);
                        this.k[v1] = null;
                    }
                }
                return ServerSideAdInsertionUtil.d(v3, serverSideAdInsertionMediaSource$MediaPeriodImpl0.b, this.e);
            }
            for(int v4 = 0; v4 < arr_exoTrackSelection.length; ++v4) {
                ExoTrackSelection exoTrackSelection0 = arr_exoTrackSelection[v4];
                boolean z = true;
                if(exoTrackSelection0 == null) {
                    arr_sampleStream[v4] = null;
                    arr_z1[v4] = true;
                }
                else {
                    if(arr_z[v4] && arr_sampleStream[v4] != null) {
                        z = false;
                    }
                    arr_z1[v4] = z;
                    if(z) {
                        SampleStreamImpl serverSideAdInsertionMediaSource$SampleStreamImpl0 = Util.g(this.i[v4], exoTrackSelection0) ? new SampleStreamImpl(serverSideAdInsertionMediaSource$MediaPeriodImpl0, v4) : new EmptySampleStream();
                        arr_sampleStream[v4] = serverSideAdInsertionMediaSource$SampleStreamImpl0;
                    }
                }
            }
            return v;
        }

        public int K(MediaPeriodImpl serverSideAdInsertionMediaSource$MediaPeriodImpl0, int v, long v1) {
            long v2 = ServerSideAdInsertionUtil.g(v1, serverSideAdInsertionMediaSource$MediaPeriodImpl0.b, this.e);
            return ((SampleStream)Util.o(this.j[v])).p(v2);
        }

        public void L(AdPlaybackState adPlaybackState0) {
            this.e = adPlaybackState0;
        }

        public void d(MediaPeriodImpl serverSideAdInsertionMediaSource$MediaPeriodImpl0) {
            this.b.add(serverSideAdInsertionMediaSource$MediaPeriodImpl0);
        }

        public boolean e(MediaPeriodId mediaSource$MediaPeriodId0, long v) {
            MediaPeriodImpl serverSideAdInsertionMediaSource$MediaPeriodImpl0 = (MediaPeriodImpl)p3.w(this.b);
            long v1 = ServerSideAdInsertionUtil.g(ServerSideAdInsertionMediaSource.z0(serverSideAdInsertionMediaSource$MediaPeriodImpl0, this.e), serverSideAdInsertionMediaSource$MediaPeriodImpl0.b, this.e);
            return ServerSideAdInsertionUtil.g(v, mediaSource$MediaPeriodId0, this.e) == v1;
        }

        public boolean f(MediaPeriodImpl serverSideAdInsertionMediaSource$MediaPeriodImpl0, LoadingInfo loadingInfo0) {
            MediaPeriodImpl serverSideAdInsertionMediaSource$MediaPeriodImpl1 = this.f;
            if(serverSideAdInsertionMediaSource$MediaPeriodImpl1 != null && !serverSideAdInsertionMediaSource$MediaPeriodImpl0.equals(serverSideAdInsertionMediaSource$MediaPeriodImpl1)) {
                for(Object object0: this.c.values()) {
                    LoadEventInfo loadEventInfo0 = (LoadEventInfo)((Pair)object0).first;
                    MediaLoadData mediaLoadData0 = ServerSideAdInsertionMediaSource.x0(serverSideAdInsertionMediaSource$MediaPeriodImpl1, ((MediaLoadData)((Pair)object0).second), this.e);
                    serverSideAdInsertionMediaSource$MediaPeriodImpl1.c.u(loadEventInfo0, mediaLoadData0);
                    LoadEventInfo loadEventInfo1 = (LoadEventInfo)((Pair)object0).first;
                    MediaLoadData mediaLoadData1 = ServerSideAdInsertionMediaSource.x0(serverSideAdInsertionMediaSource$MediaPeriodImpl0, ((MediaLoadData)((Pair)object0).second), this.e);
                    serverSideAdInsertionMediaSource$MediaPeriodImpl0.c.A(loadEventInfo1, mediaLoadData1);
                }
            }
            this.f = serverSideAdInsertionMediaSource$MediaPeriodImpl0;
            long v = this.q(serverSideAdInsertionMediaSource$MediaPeriodImpl0, loadingInfo0.a);
            LoadingInfo loadingInfo1 = loadingInfo0.a().f(v).d();
            return this.a.f(loadingInfo1);
        }

        public void g(MediaPeriodImpl serverSideAdInsertionMediaSource$MediaPeriodImpl0, long v, boolean z) {
            long v1 = ServerSideAdInsertionUtil.g(v, serverSideAdInsertionMediaSource$MediaPeriodImpl0.b, this.e);
            this.a.v(v1, z);
        }

        @Override  // androidx.media3.exoplayer.source.MediaPeriod$Callback
        public void h(MediaPeriod mediaPeriod0) {
            this.h = true;
            for(int v = 0; v < this.b.size(); ++v) {
                ((MediaPeriodImpl)this.b.get(v)).b();
            }
        }

        private int i(MediaLoadData mediaLoadData0) {
            if(mediaLoadData0.c == null) {
                return -1;
            }
            int v = 0;
            while(true) {
                ExoTrackSelection[] arr_exoTrackSelection = this.i;
                if(v >= arr_exoTrackSelection.length) {
                    break;
                }
                ExoTrackSelection exoTrackSelection0 = arr_exoTrackSelection[v];
                if(exoTrackSelection0 != null) {
                    TrackGroup trackGroup0 = exoTrackSelection0.i();
                    boolean z = mediaLoadData0.b == 0 && trackGroup0.equals(this.r().c(0));
                    int v1 = 0;
                    while(v1 < trackGroup0.a) {
                        Format format0 = trackGroup0.c(v1);
                        if(!format0.equals(mediaLoadData0.c) && (!z || (format0.a == null || !format0.a.equals(mediaLoadData0.c.a)))) {
                            ++v1;
                            continue;
                        }
                        return v;
                    }
                }
                ++v;
            }
            return -1;
        }

        public long j(MediaPeriodImpl serverSideAdInsertionMediaSource$MediaPeriodImpl0, long v, SeekParameters seekParameters0) {
            long v1 = ServerSideAdInsertionUtil.g(v, serverSideAdInsertionMediaSource$MediaPeriodImpl0.b, this.e);
            return ServerSideAdInsertionUtil.d(this.a.c(v1, seekParameters0), serverSideAdInsertionMediaSource$MediaPeriodImpl0.b, this.e);
        }

        public long k(MediaPeriodImpl serverSideAdInsertionMediaSource$MediaPeriodImpl0) {
            return this.n(serverSideAdInsertionMediaSource$MediaPeriodImpl0, this.a.d());
        }

        @Override  // androidx.media3.exoplayer.source.SequenceableLoader$Callback
        public void l(SequenceableLoader sequenceableLoader0) {
            this.y(((MediaPeriod)sequenceableLoader0));
        }

        @Nullable
        public MediaPeriodImpl m(@Nullable MediaLoadData mediaLoadData0) {
            if(mediaLoadData0 != null && mediaLoadData0.f != 0x8000000000000001L) {
                for(int v = 0; v < this.b.size(); ++v) {
                    MediaPeriodImpl serverSideAdInsertionMediaSource$MediaPeriodImpl0 = (MediaPeriodImpl)this.b.get(v);
                    if(serverSideAdInsertionMediaSource$MediaPeriodImpl0.h) {
                        long v1 = ServerSideAdInsertionUtil.d(Util.F1(mediaLoadData0.f), serverSideAdInsertionMediaSource$MediaPeriodImpl0.b, this.e);
                        if(v1 >= 0L && v1 < ServerSideAdInsertionMediaSource.z0(serverSideAdInsertionMediaSource$MediaPeriodImpl0, this.e)) {
                            return serverSideAdInsertionMediaSource$MediaPeriodImpl0;
                        }
                    }
                }
            }
            return null;
        }

        private long n(MediaPeriodImpl serverSideAdInsertionMediaSource$MediaPeriodImpl0, long v) {
            if(v == 0x8000000000000000L) {
                return 0x8000000000000000L;
            }
            long v1 = ServerSideAdInsertionUtil.d(v, serverSideAdInsertionMediaSource$MediaPeriodImpl0.b, this.e);
            return v1 >= ServerSideAdInsertionMediaSource.z0(serverSideAdInsertionMediaSource$MediaPeriodImpl0, this.e) ? 0x8000000000000000L : v1;
        }

        public long o(MediaPeriodImpl serverSideAdInsertionMediaSource$MediaPeriodImpl0) {
            return this.n(serverSideAdInsertionMediaSource$MediaPeriodImpl0, this.a.g());
        }

        public List p(List list0) {
            return this.a.i(list0);
        }

        private long q(MediaPeriodImpl serverSideAdInsertionMediaSource$MediaPeriodImpl0, long v) {
            return v >= serverSideAdInsertionMediaSource$MediaPeriodImpl0.f ? ServerSideAdInsertionUtil.g(v, serverSideAdInsertionMediaSource$MediaPeriodImpl0.b, this.e) : ServerSideAdInsertionUtil.g(serverSideAdInsertionMediaSource$MediaPeriodImpl0.f, serverSideAdInsertionMediaSource$MediaPeriodImpl0.b, this.e) - (serverSideAdInsertionMediaSource$MediaPeriodImpl0.f - v);
        }

        public TrackGroupArray r() {
            return this.a.n();
        }

        // 去混淆评级： 低(20)
        public boolean s(MediaPeriodImpl serverSideAdInsertionMediaSource$MediaPeriodImpl0) {
            return serverSideAdInsertionMediaSource$MediaPeriodImpl0.equals(this.f) && this.a.a();
        }

        public boolean t(int v) {
            return ((SampleStream)Util.o(this.j[v])).isReady();
        }

        public boolean u() {
            return this.b.isEmpty();
        }

        private void v(MediaPeriodImpl serverSideAdInsertionMediaSource$MediaPeriodImpl0, int v) {
            boolean[] arr_z = serverSideAdInsertionMediaSource$MediaPeriodImpl0.g;
            if(!arr_z[v]) {
                MediaLoadData mediaLoadData0 = this.k[v];
                if(mediaLoadData0 != null) {
                    arr_z[v] = true;
                    MediaLoadData mediaLoadData1 = ServerSideAdInsertionMediaSource.x0(serverSideAdInsertionMediaSource$MediaPeriodImpl0, mediaLoadData0, this.e);
                    serverSideAdInsertionMediaSource$MediaPeriodImpl0.c.i(mediaLoadData1);
                }
            }
        }

        public void w(int v) throws IOException {
            ((SampleStream)Util.o(this.j[v])).b();
        }

        public void x() throws IOException {
            this.a.s();
        }

        public void y(MediaPeriod mediaPeriod0) {
            MediaPeriodImpl serverSideAdInsertionMediaSource$MediaPeriodImpl0 = this.f;
            if(serverSideAdInsertionMediaSource$MediaPeriodImpl0 == null) {
                return;
            }
            ((Callback)Assertions.g(serverSideAdInsertionMediaSource$MediaPeriodImpl0.e)).l(this.f);
        }

        public void z(MediaPeriodImpl serverSideAdInsertionMediaSource$MediaPeriodImpl0, MediaLoadData mediaLoadData0) {
            int v = this.i(mediaLoadData0);
            if(v != -1) {
                this.k[v] = mediaLoadData0;
                serverSideAdInsertionMediaSource$MediaPeriodImpl0.g[v] = true;
            }
        }
    }

    private final MediaSource h;
    private final y3 i;
    private final EventDispatcher j;
    private final androidx.media3.exoplayer.drm.DrmSessionEventListener.EventDispatcher k;
    @Nullable
    private final AdPlaybackStateUpdater l;
    @GuardedBy("this")
    @Nullable
    private Handler m;
    @Nullable
    private SharedMediaPeriod n;
    private Q2 o;

    public ServerSideAdInsertionMediaSource(MediaSource mediaSource0, @Nullable AdPlaybackStateUpdater serverSideAdInsertionMediaSource$AdPlaybackStateUpdater0) {
        this.h = mediaSource0;
        this.l = serverSideAdInsertionMediaSource$AdPlaybackStateUpdater0;
        this.i = s.Q();
        this.o = Q2.u();
        this.j = this.a0(null);
        this.k = this.V(null);
    }

    @Nullable
    private MediaPeriodImpl A0(@Nullable MediaPeriodId mediaSource$MediaPeriodId0, @Nullable MediaLoadData mediaLoadData0, boolean z) {
        if(mediaSource$MediaPeriodId0 == null) {
            return null;
        }
        Pair pair0 = new Pair(mediaSource$MediaPeriodId0.d, mediaSource$MediaPeriodId0.a);
        List list0 = this.i.get(pair0);
        if(list0.isEmpty()) {
            return null;
        }
        if(z) {
            SharedMediaPeriod serverSideAdInsertionMediaSource$SharedMediaPeriod0 = (SharedMediaPeriod)p3.w(list0);
            return serverSideAdInsertionMediaSource$SharedMediaPeriod0.f == null ? ((MediaPeriodImpl)p3.w(serverSideAdInsertionMediaSource$SharedMediaPeriod0.b)) : serverSideAdInsertionMediaSource$SharedMediaPeriod0.f;
        }
        for(int v = 0; v < list0.size(); ++v) {
            MediaPeriodImpl serverSideAdInsertionMediaSource$MediaPeriodImpl0 = ((SharedMediaPeriod)list0.get(v)).m(mediaLoadData0);
            if(serverSideAdInsertionMediaSource$MediaPeriodImpl0 != null) {
                return serverSideAdInsertionMediaSource$MediaPeriodImpl0;
            }
        }
        return (MediaPeriodImpl)((SharedMediaPeriod)list0.get(0)).b.get(0);
    }

    // 检测为 Lambda 实现
    private void B0(Q2 q20, Timeline timeline0) [...]

    @Override  // androidx.media3.exoplayer.source.MediaSource
    public MediaPeriod C(MediaPeriodId mediaSource$MediaPeriodId0, Allocator allocator0, long v) {
        SharedMediaPeriod serverSideAdInsertionMediaSource$SharedMediaPeriod1;
        Pair pair0 = new Pair(mediaSource$MediaPeriodId0.d, mediaSource$MediaPeriodId0.a);
        SharedMediaPeriod serverSideAdInsertionMediaSource$SharedMediaPeriod0 = this.n;
        boolean z = false;
        if(serverSideAdInsertionMediaSource$SharedMediaPeriod0 == null) {
            serverSideAdInsertionMediaSource$SharedMediaPeriod1 = null;
        }
        else {
            if(serverSideAdInsertionMediaSource$SharedMediaPeriod0.d.equals(mediaSource$MediaPeriodId0.a)) {
                serverSideAdInsertionMediaSource$SharedMediaPeriod1 = this.n;
                this.i.put(pair0, serverSideAdInsertionMediaSource$SharedMediaPeriod1);
                z = true;
            }
            else {
                this.n.G(this.h);
                serverSideAdInsertionMediaSource$SharedMediaPeriod1 = null;
            }
            this.n = null;
        }
        if(serverSideAdInsertionMediaSource$SharedMediaPeriod1 == null) {
            serverSideAdInsertionMediaSource$SharedMediaPeriod1 = (SharedMediaPeriod)p3.x(this.i.get(pair0), null);
            if(serverSideAdInsertionMediaSource$SharedMediaPeriod1 == null || !serverSideAdInsertionMediaSource$SharedMediaPeriod1.e(mediaSource$MediaPeriodId0, v)) {
                AdPlaybackState adPlaybackState0 = (AdPlaybackState)Assertions.g(((AdPlaybackState)this.o.get(mediaSource$MediaPeriodId0.a)));
                long v1 = ServerSideAdInsertionUtil.g(v, mediaSource$MediaPeriodId0, adPlaybackState0);
                MediaPeriodId mediaSource$MediaPeriodId1 = new MediaPeriodId(mediaSource$MediaPeriodId0.a, mediaSource$MediaPeriodId0.d);
                SharedMediaPeriod serverSideAdInsertionMediaSource$SharedMediaPeriod2 = new SharedMediaPeriod(this.h.C(mediaSource$MediaPeriodId1, allocator0, v1), mediaSource$MediaPeriodId0.a, adPlaybackState0);
                this.i.put(pair0, serverSideAdInsertionMediaSource$SharedMediaPeriod2);
                serverSideAdInsertionMediaSource$SharedMediaPeriod1 = serverSideAdInsertionMediaSource$SharedMediaPeriod2;
            }
        }
        MediaPeriod mediaPeriod0 = new MediaPeriodImpl(serverSideAdInsertionMediaSource$SharedMediaPeriod1, mediaSource$MediaPeriodId0, this.a0(mediaSource$MediaPeriodId0), this.V(mediaSource$MediaPeriodId0));
        serverSideAdInsertionMediaSource$SharedMediaPeriod1.d(((MediaPeriodImpl)mediaPeriod0));
        if(z && serverSideAdInsertionMediaSource$SharedMediaPeriod1.i.length > 0) {
            ((MediaPeriodImpl)mediaPeriod0).j(v);
        }
        return mediaPeriod0;
    }

    private void C0() {
        SharedMediaPeriod serverSideAdInsertionMediaSource$SharedMediaPeriod0 = this.n;
        if(serverSideAdInsertionMediaSource$SharedMediaPeriod0 != null) {
            serverSideAdInsertionMediaSource$SharedMediaPeriod0.G(this.h);
            this.n = null;
        }
    }

    public void D0(Q2 q20, Timeline timeline0) {
        Assertions.a(!q20.isEmpty());
        Object object0 = Assertions.g(((AdPlaybackState)q20.K().a().get(0)).a);
        u5 u50 = q20.m().i();
        while(u50.hasNext()) {
            Object object1 = u50.next();
            Object object2 = ((Map.Entry)object1).getKey();
            AdPlaybackState adPlaybackState0 = (AdPlaybackState)((Map.Entry)object1).getValue();
            Assertions.a(Util.g(object0, adPlaybackState0.a));
            AdPlaybackState adPlaybackState1 = (AdPlaybackState)this.o.get(object2);
            if(adPlaybackState1 != null) {
                for(int v = adPlaybackState0.e; v < adPlaybackState0.b; ++v) {
                    AdGroup adPlaybackState$AdGroup0 = adPlaybackState0.e(v);
                    Assertions.a(adPlaybackState$AdGroup0.i);
                    if(v < adPlaybackState1.b && ServerSideAdInsertionUtil.c(adPlaybackState0, v) < ServerSideAdInsertionUtil.c(adPlaybackState1, v)) {
                        AdGroup adPlaybackState$AdGroup1 = adPlaybackState0.e(v + 1);
                        AdGroup adPlaybackState$AdGroup2 = adPlaybackState1.e(v);
                        Assertions.a(adPlaybackState$AdGroup0.h + adPlaybackState$AdGroup1.h == adPlaybackState$AdGroup2.h);
                        Assertions.a(adPlaybackState$AdGroup0.a + adPlaybackState$AdGroup0.h == adPlaybackState$AdGroup1.a);
                    }
                    if(adPlaybackState$AdGroup0.a == 0x8000000000000000L) {
                        Assertions.a(ServerSideAdInsertionUtil.c(adPlaybackState0, v) == 0);
                    }
                }
            }
        }
        synchronized(this) {
            Handler handler0 = this.m;
            if(handler0 == null) {
                this.o = q20;
            }
            else {
                handler0.post(() -> {
                    for(Object object0: this.i.values()) {
                        SharedMediaPeriod serverSideAdInsertionMediaSource$SharedMediaPeriod0 = (SharedMediaPeriod)object0;
                        AdPlaybackState adPlaybackState0 = (AdPlaybackState)q20.get(serverSideAdInsertionMediaSource$SharedMediaPeriod0.d);
                        if(adPlaybackState0 != null) {
                            serverSideAdInsertionMediaSource$SharedMediaPeriod0.L(adPlaybackState0);
                        }
                    }
                    SharedMediaPeriod serverSideAdInsertionMediaSource$SharedMediaPeriod1 = this.n;
                    if(serverSideAdInsertionMediaSource$SharedMediaPeriod1 != null) {
                        AdPlaybackState adPlaybackState1 = (AdPlaybackState)q20.get(serverSideAdInsertionMediaSource$SharedMediaPeriod1.d);
                        if(adPlaybackState1 != null) {
                            this.n.L(adPlaybackState1);
                        }
                    }
                    this.o = q20;
                    this.p0(new ServerSideAdInsertionTimeline(timeline0, q20));
                });
            }
        }
    }

    @Override  // androidx.media3.exoplayer.drm.DrmSessionEventListener
    public void G(int v, @Nullable MediaPeriodId mediaSource$MediaPeriodId0) {
        MediaPeriodImpl serverSideAdInsertionMediaSource$MediaPeriodImpl0 = this.A0(mediaSource$MediaPeriodId0, null, false);
        if(serverSideAdInsertionMediaSource$MediaPeriodImpl0 == null) {
            this.k.h();
            return;
        }
        serverSideAdInsertionMediaSource$MediaPeriodImpl0.d.h();
    }

    @Override  // androidx.media3.exoplayer.source.MediaSource$MediaSourceCaller
    public void H(MediaSource mediaSource0, Timeline timeline0) {
        if((this.l == null || !this.l.a(timeline0)) && !this.o.isEmpty()) {
            this.p0(new ServerSideAdInsertionTimeline(timeline0, this.o));
        }
    }

    @Override  // androidx.media3.exoplayer.source.MediaSourceEventListener
    public void K(int v, @Nullable MediaPeriodId mediaSource$MediaPeriodId0, LoadEventInfo loadEventInfo0, MediaLoadData mediaLoadData0, IOException iOException0, boolean z) {
        MediaPeriodImpl serverSideAdInsertionMediaSource$MediaPeriodImpl0 = this.A0(mediaSource$MediaPeriodId0, mediaLoadData0, true);
        if(serverSideAdInsertionMediaSource$MediaPeriodImpl0 == null) {
            this.j.x(loadEventInfo0, mediaLoadData0, iOException0, z);
            return;
        }
        if(z) {
            serverSideAdInsertionMediaSource$MediaPeriodImpl0.a.A(loadEventInfo0);
        }
        MediaLoadData mediaLoadData1 = ServerSideAdInsertionMediaSource.x0(serverSideAdInsertionMediaSource$MediaPeriodImpl0, mediaLoadData0, ((AdPlaybackState)Assertions.g(((AdPlaybackState)this.o.get(serverSideAdInsertionMediaSource$MediaPeriodImpl0.b.a)))));
        serverSideAdInsertionMediaSource$MediaPeriodImpl0.c.x(loadEventInfo0, mediaLoadData1, iOException0, z);
    }

    @Override  // androidx.media3.exoplayer.source.BaseMediaSource
    public void L(MediaItem mediaItem0) {
        this.h.L(mediaItem0);
    }

    @Override  // androidx.media3.exoplayer.source.MediaSourceEventListener
    public void M(int v, @Nullable MediaPeriodId mediaSource$MediaPeriodId0, LoadEventInfo loadEventInfo0, MediaLoadData mediaLoadData0) {
        MediaPeriodImpl serverSideAdInsertionMediaSource$MediaPeriodImpl0 = this.A0(mediaSource$MediaPeriodId0, mediaLoadData0, true);
        if(serverSideAdInsertionMediaSource$MediaPeriodImpl0 == null) {
            this.j.r(loadEventInfo0, mediaLoadData0);
            return;
        }
        serverSideAdInsertionMediaSource$MediaPeriodImpl0.a.A(loadEventInfo0);
        MediaLoadData mediaLoadData1 = ServerSideAdInsertionMediaSource.x0(serverSideAdInsertionMediaSource$MediaPeriodImpl0, mediaLoadData0, ((AdPlaybackState)Assertions.g(((AdPlaybackState)this.o.get(serverSideAdInsertionMediaSource$MediaPeriodImpl0.b.a)))));
        serverSideAdInsertionMediaSource$MediaPeriodImpl0.c.r(loadEventInfo0, mediaLoadData1);
    }

    @Override  // androidx.media3.exoplayer.source.MediaSourceEventListener
    public void P(int v, @Nullable MediaPeriodId mediaSource$MediaPeriodId0, MediaLoadData mediaLoadData0) {
        MediaPeriodImpl serverSideAdInsertionMediaSource$MediaPeriodImpl0 = this.A0(mediaSource$MediaPeriodId0, mediaLoadData0, false);
        if(serverSideAdInsertionMediaSource$MediaPeriodImpl0 == null) {
            this.j.i(mediaLoadData0);
            return;
        }
        serverSideAdInsertionMediaSource$MediaPeriodImpl0.a.z(serverSideAdInsertionMediaSource$MediaPeriodImpl0, mediaLoadData0);
        MediaLoadData mediaLoadData1 = ServerSideAdInsertionMediaSource.x0(serverSideAdInsertionMediaSource$MediaPeriodImpl0, mediaLoadData0, ((AdPlaybackState)Assertions.g(((AdPlaybackState)this.o.get(serverSideAdInsertionMediaSource$MediaPeriodImpl0.b.a)))));
        serverSideAdInsertionMediaSource$MediaPeriodImpl0.c.i(mediaLoadData1);
    }

    @Override  // androidx.media3.exoplayer.source.BaseMediaSource
    public boolean S(MediaItem mediaItem0) {
        return this.h.S(mediaItem0);
    }

    @Override  // androidx.media3.exoplayer.drm.DrmSessionEventListener
    public void W(int v, @Nullable MediaPeriodId mediaSource$MediaPeriodId0) {
        MediaPeriodImpl serverSideAdInsertionMediaSource$MediaPeriodImpl0 = this.A0(mediaSource$MediaPeriodId0, null, false);
        if(serverSideAdInsertionMediaSource$MediaPeriodImpl0 == null) {
            this.k.m();
            return;
        }
        serverSideAdInsertionMediaSource$MediaPeriodImpl0.d.m();
    }

    @Override  // androidx.media3.exoplayer.source.MediaSourceEventListener
    public void b0(int v, MediaPeriodId mediaSource$MediaPeriodId0, MediaLoadData mediaLoadData0) {
        MediaPeriodImpl serverSideAdInsertionMediaSource$MediaPeriodImpl0 = this.A0(mediaSource$MediaPeriodId0, mediaLoadData0, false);
        if(serverSideAdInsertionMediaSource$MediaPeriodImpl0 == null) {
            this.j.D(mediaLoadData0);
            return;
        }
        MediaLoadData mediaLoadData1 = ServerSideAdInsertionMediaSource.x0(serverSideAdInsertionMediaSource$MediaPeriodImpl0, mediaLoadData0, ((AdPlaybackState)Assertions.g(((AdPlaybackState)this.o.get(serverSideAdInsertionMediaSource$MediaPeriodImpl0.b.a)))));
        serverSideAdInsertionMediaSource$MediaPeriodImpl0.c.D(mediaLoadData1);
    }

    @Override  // androidx.media3.exoplayer.source.MediaSource
    public MediaItem d() {
        return this.h.d();
    }

    @Override  // androidx.media3.exoplayer.source.MediaSourceEventListener
    public void e0(int v, @Nullable MediaPeriodId mediaSource$MediaPeriodId0, LoadEventInfo loadEventInfo0, MediaLoadData mediaLoadData0) {
        MediaPeriodImpl serverSideAdInsertionMediaSource$MediaPeriodImpl0 = this.A0(mediaSource$MediaPeriodId0, mediaLoadData0, true);
        if(serverSideAdInsertionMediaSource$MediaPeriodImpl0 == null) {
            this.j.A(loadEventInfo0, mediaLoadData0);
            return;
        }
        serverSideAdInsertionMediaSource$MediaPeriodImpl0.a.B(loadEventInfo0, mediaLoadData0);
        MediaLoadData mediaLoadData1 = ServerSideAdInsertionMediaSource.x0(serverSideAdInsertionMediaSource$MediaPeriodImpl0, mediaLoadData0, ((AdPlaybackState)Assertions.g(((AdPlaybackState)this.o.get(serverSideAdInsertionMediaSource$MediaPeriodImpl0.b.a)))));
        serverSideAdInsertionMediaSource$MediaPeriodImpl0.c.A(loadEventInfo0, mediaLoadData1);
    }

    @Override  // androidx.media3.exoplayer.source.BaseMediaSource
    protected void f0() {
        this.C0();
        this.h.N(this);
    }

    @Override  // androidx.media3.exoplayer.source.BaseMediaSource
    protected void g0() {
        this.h.J(this);
    }

    @Override  // androidx.media3.exoplayer.drm.DrmSessionEventListener
    public void j0(int v, @Nullable MediaPeriodId mediaSource$MediaPeriodId0, int v1) {
        MediaPeriodImpl serverSideAdInsertionMediaSource$MediaPeriodImpl0 = this.A0(mediaSource$MediaPeriodId0, null, true);
        if(serverSideAdInsertionMediaSource$MediaPeriodImpl0 == null) {
            this.k.k(v1);
            return;
        }
        serverSideAdInsertionMediaSource$MediaPeriodImpl0.d.k(v1);
    }

    @Override  // androidx.media3.exoplayer.drm.DrmSessionEventListener
    public void k0(int v, MediaPeriodId mediaSource$MediaPeriodId0) {
    }

    @Override  // androidx.media3.exoplayer.drm.DrmSessionEventListener
    public void m0(int v, @Nullable MediaPeriodId mediaSource$MediaPeriodId0) {
        MediaPeriodImpl serverSideAdInsertionMediaSource$MediaPeriodImpl0 = this.A0(mediaSource$MediaPeriodId0, null, false);
        if(serverSideAdInsertionMediaSource$MediaPeriodImpl0 == null) {
            this.k.i();
            return;
        }
        serverSideAdInsertionMediaSource$MediaPeriodImpl0.d.i();
    }

    @Override  // androidx.media3.exoplayer.drm.DrmSessionEventListener
    public void n0(int v, @Nullable MediaPeriodId mediaSource$MediaPeriodId0, Exception exception0) {
        MediaPeriodImpl serverSideAdInsertionMediaSource$MediaPeriodImpl0 = this.A0(mediaSource$MediaPeriodId0, null, false);
        if(serverSideAdInsertionMediaSource$MediaPeriodImpl0 == null) {
            this.k.l(exception0);
            return;
        }
        serverSideAdInsertionMediaSource$MediaPeriodImpl0.d.l(exception0);
    }

    @Override  // androidx.media3.exoplayer.source.BaseMediaSource
    protected void o0(@Nullable TransferListener transferListener0) {
        Handler handler0 = Util.H();
        synchronized(this) {
            this.m = handler0;
        }
        this.h.a(handler0, this);
        this.h.q(handler0, this);
        PlayerId playerId0 = this.h0();
        this.h.I(this, transferListener0, playerId0);
    }

    @Override  // androidx.media3.exoplayer.source.BaseMediaSource
    protected void q0() {
        this.C0();
        synchronized(this) {
            this.m = null;
        }
        this.h.u(this);
        this.h.A(this);
        this.h.F(this);
    }

    @Override  // androidx.media3.exoplayer.source.MediaSource
    public void r(MediaPeriod mediaPeriod0) {
        ((MediaPeriodImpl)mediaPeriod0).a.H(((MediaPeriodImpl)mediaPeriod0));
        if(((MediaPeriodImpl)mediaPeriod0).a.u()) {
            Pair pair0 = new Pair(((MediaPeriodImpl)mediaPeriod0).b.d, ((MediaPeriodImpl)mediaPeriod0).b.a);
            this.i.remove(pair0, ((MediaPeriodImpl)mediaPeriod0).a);
            if(this.i.isEmpty()) {
                this.n = ((MediaPeriodImpl)mediaPeriod0).a;
                return;
            }
            ((MediaPeriodImpl)mediaPeriod0).a.G(this.h);
        }
    }

    @Override  // androidx.media3.exoplayer.source.MediaSourceEventListener
    public void s0(int v, @Nullable MediaPeriodId mediaSource$MediaPeriodId0, LoadEventInfo loadEventInfo0, MediaLoadData mediaLoadData0) {
        MediaPeriodImpl serverSideAdInsertionMediaSource$MediaPeriodImpl0 = this.A0(mediaSource$MediaPeriodId0, mediaLoadData0, true);
        if(serverSideAdInsertionMediaSource$MediaPeriodImpl0 == null) {
            this.j.u(loadEventInfo0, mediaLoadData0);
            return;
        }
        serverSideAdInsertionMediaSource$MediaPeriodImpl0.a.A(loadEventInfo0);
        MediaLoadData mediaLoadData1 = ServerSideAdInsertionMediaSource.x0(serverSideAdInsertionMediaSource$MediaPeriodImpl0, mediaLoadData0, ((AdPlaybackState)Assertions.g(((AdPlaybackState)this.o.get(serverSideAdInsertionMediaSource$MediaPeriodImpl0.b.a)))));
        serverSideAdInsertionMediaSource$MediaPeriodImpl0.c.u(loadEventInfo0, mediaLoadData1);
    }

    @Override  // androidx.media3.exoplayer.drm.DrmSessionEventListener
    public void t0(int v, @Nullable MediaPeriodId mediaSource$MediaPeriodId0) {
        MediaPeriodImpl serverSideAdInsertionMediaSource$MediaPeriodImpl0 = this.A0(mediaSource$MediaPeriodId0, null, false);
        if(serverSideAdInsertionMediaSource$MediaPeriodImpl0 == null) {
            this.k.j();
            return;
        }
        serverSideAdInsertionMediaSource$MediaPeriodImpl0.d.j();
    }

    @Override  // androidx.media3.exoplayer.source.MediaSource
    public void w() throws IOException {
        this.h.w();
    }

    private static MediaLoadData x0(MediaPeriodImpl serverSideAdInsertionMediaSource$MediaPeriodImpl0, MediaLoadData mediaLoadData0, AdPlaybackState adPlaybackState0) {
        long v = ServerSideAdInsertionMediaSource.y0(mediaLoadData0.f, serverSideAdInsertionMediaSource$MediaPeriodImpl0, adPlaybackState0);
        long v1 = ServerSideAdInsertionMediaSource.y0(mediaLoadData0.g, serverSideAdInsertionMediaSource$MediaPeriodImpl0, adPlaybackState0);
        return new MediaLoadData(mediaLoadData0.a, mediaLoadData0.b, mediaLoadData0.c, mediaLoadData0.d, mediaLoadData0.e, v, v1);
    }

    private static long y0(long v, MediaPeriodImpl serverSideAdInsertionMediaSource$MediaPeriodImpl0, AdPlaybackState adPlaybackState0) {
        if(v == 0x8000000000000001L) {
            return 0x8000000000000001L;
        }
        long v1 = Util.F1(v);
        return serverSideAdInsertionMediaSource$MediaPeriodImpl0.b.c() ? Util.B2(ServerSideAdInsertionUtil.e(v1, serverSideAdInsertionMediaSource$MediaPeriodImpl0.b.b, serverSideAdInsertionMediaSource$MediaPeriodImpl0.b.c, adPlaybackState0)) : Util.B2(ServerSideAdInsertionUtil.f(v1, -1, adPlaybackState0));
    }

    private static long z0(MediaPeriodImpl serverSideAdInsertionMediaSource$MediaPeriodImpl0, AdPlaybackState adPlaybackState0) {
        MediaPeriodId mediaSource$MediaPeriodId0 = serverSideAdInsertionMediaSource$MediaPeriodImpl0.b;
        if(mediaSource$MediaPeriodId0.c()) {
            AdGroup adPlaybackState$AdGroup0 = adPlaybackState0.e(mediaSource$MediaPeriodId0.b);
            return adPlaybackState$AdGroup0.b == -1 ? 0L : adPlaybackState$AdGroup0.g[mediaSource$MediaPeriodId0.c];
        }
        int v = mediaSource$MediaPeriodId0.e;
        if(v == -1) {
            return 0x7FFFFFFFFFFFFFFFL;
        }
        long v1 = adPlaybackState0.e(v).a;
        return v1 == 0x8000000000000000L ? 0x7FFFFFFFFFFFFFFFL : v1;
    }
}

