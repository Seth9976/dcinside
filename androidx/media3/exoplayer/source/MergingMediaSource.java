package androidx.media3.exoplayer.source;

import androidx.annotation.Nullable;
import androidx.media3.common.MediaItem.Builder;
import androidx.media3.common.MediaItem;
import androidx.media3.common.Timeline.Period;
import androidx.media3.common.Timeline.Window;
import androidx.media3.common.Timeline;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.datasource.TransferListener;
import androidx.media3.exoplayer.upstream.Allocator;
import com.google.common.collect.M3;
import com.google.common.collect.N3;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Map;

@UnstableApi
public final class MergingMediaSource extends CompositeMediaSource {
    static final class ClippedTimeline extends ForwardingTimeline {
        private final long[] f;
        private final long[] g;

        public ClippedTimeline(Timeline timeline0, Map map0) {
            super(timeline0);
            int v = timeline0.v();
            this.g = new long[timeline0.v()];
            Window timeline$Window0 = new Window();
            for(int v2 = 0; v2 < v; ++v2) {
                this.g[v2] = timeline0.t(v2, timeline$Window0).m;
            }
            int v3 = timeline0.m();
            this.f = new long[v3];
            Period timeline$Period0 = new Period();
            for(int v1 = 0; v1 < v3; ++v1) {
                timeline0.k(v1, timeline$Period0, true);
                long v4 = (long)(((Long)Assertions.g(((Long)map0.get(timeline$Period0.b)))));
                long[] arr_v = this.f;
                if(v4 == 0x8000000000000000L) {
                    v4 = timeline$Period0.d;
                }
                arr_v[v1] = v4;
                long v5 = timeline$Period0.d;
                if(v5 != 0x8000000000000001L) {
                    this.g[timeline$Period0.c] -= v5 - v4;
                }
            }
        }

        @Override  // androidx.media3.exoplayer.source.ForwardingTimeline
        public Period k(int v, Period timeline$Period0, boolean z) {
            super.k(v, timeline$Period0, z);
            timeline$Period0.d = this.f[v];
            return timeline$Period0;
        }

        @Override  // androidx.media3.exoplayer.source.ForwardingTimeline
        public Window u(int v, Window timeline$Window0, long v1) {
            long v4;
            super.u(v, timeline$Window0, v1);
            long v2 = this.g[v];
            timeline$Window0.m = v2;
            if(v2 == 0x8000000000000001L) {
                v4 = timeline$Window0.l;
            }
            else {
                long v3 = timeline$Window0.l;
                v4 = v3 == 0x8000000000000001L ? timeline$Window0.l : Math.min(v3, v2);
            }
            timeline$Window0.l = v4;
            return timeline$Window0;
        }
    }

    public static final class IllegalMergeException extends IOException {
        @Documented
        @Retention(RetentionPolicy.SOURCE)
        @Target({ElementType.TYPE_USE})
        public @interface Reason {
        }

        public final int a;
        public static final int b;

        public IllegalMergeException(int v) {
            this.a = v;
        }
    }

    private final boolean k;
    private final boolean l;
    private final MediaSource[] m;
    private final Timeline[] n;
    private final ArrayList o;
    private final CompositeSequenceableLoaderFactory p;
    private final Map q;
    private final M3 r;
    private int s;
    private long[][] t;
    @Nullable
    private IllegalMergeException u;
    private static final int v = -1;
    private static final MediaItem w;

    static {
        MergingMediaSource.w = new Builder().E("MergingMediaSource").a();
    }

    public MergingMediaSource(boolean z, boolean z1, CompositeSequenceableLoaderFactory compositeSequenceableLoaderFactory0, MediaSource[] arr_mediaSource) {
        this.k = z;
        this.l = z1;
        this.m = arr_mediaSource;
        this.p = compositeSequenceableLoaderFactory0;
        this.o = new ArrayList(Arrays.asList(arr_mediaSource));
        this.s = -1;
        this.n = new Timeline[arr_mediaSource.length];
        this.t = new long[0][];
        this.q = new HashMap();
        this.r = N3.d().a().j();
    }

    public MergingMediaSource(boolean z, boolean z1, MediaSource[] arr_mediaSource) {
        this(z, z1, new DefaultCompositeSequenceableLoaderFactory(), arr_mediaSource);
    }

    public MergingMediaSource(boolean z, MediaSource[] arr_mediaSource) {
        this(z, false, arr_mediaSource);
    }

    public MergingMediaSource(MediaSource[] arr_mediaSource) {
        this(false, arr_mediaSource);
    }

    @Override  // androidx.media3.exoplayer.source.CompositeMediaSource
    protected void B0(Object object0, MediaSource mediaSource0, Timeline timeline0) {
        this.G0(((Integer)object0), mediaSource0, timeline0);
    }

    @Override  // androidx.media3.exoplayer.source.MediaSource
    public MediaPeriod C(MediaPeriodId mediaSource$MediaPeriodId0, Allocator allocator0, long v) {
        MediaPeriod[] arr_mediaPeriod = new MediaPeriod[this.m.length];
        int v2 = this.n[0].f(mediaSource$MediaPeriodId0.a);
        for(int v1 = 0; v1 < this.m.length; ++v1) {
            MediaPeriodId mediaSource$MediaPeriodId1 = mediaSource$MediaPeriodId0.a(this.n[v1].s(v2));
            arr_mediaPeriod[v1] = this.m[v1].C(mediaSource$MediaPeriodId1, allocator0, v - this.t[v2][v1]);
        }
        MediaPeriod mediaPeriod0 = new MergingMediaPeriod(this.p, this.t[v2], arr_mediaPeriod);
        if(this.l) {
            ClippingMediaPeriod clippingMediaPeriod0 = new ClippingMediaPeriod(mediaPeriod0, true, 0L, ((long)(((Long)Assertions.g(((Long)this.q.get(mediaSource$MediaPeriodId0.a)))))));
            this.r.put(mediaSource$MediaPeriodId0.a, clippingMediaPeriod0);
            return clippingMediaPeriod0;
        }
        return mediaPeriod0;
    }

    private void E0() {
        Period timeline$Period0 = new Period();
        for(int v = 0; v < this.s; ++v) {
            long v1 = -this.n[0].j(v, timeline$Period0).r();
            for(int v2 = 1; true; ++v2) {
                Timeline[] arr_timeline = this.n;
                if(v2 >= arr_timeline.length) {
                    break;
                }
                this.t[v][v2] = v1 - -arr_timeline[v2].j(v, timeline$Period0).r();
            }
        }
    }

    @Nullable
    protected MediaPeriodId F0(Integer integer0, MediaPeriodId mediaSource$MediaPeriodId0) {
        return ((int)integer0) == 0 ? mediaSource$MediaPeriodId0 : null;
    }

    protected void G0(Integer integer0, MediaSource mediaSource0, Timeline timeline0) {
        if(this.u != null) {
            return;
        }
        if(this.s == -1) {
            this.s = timeline0.m();
        }
        else if(timeline0.m() != this.s) {
            this.u = new IllegalMergeException(0);
            return;
        }
        if(this.t.length == 0) {
            this.t = new long[this.s][this.n.length];
        }
        this.o.remove(mediaSource0);
        this.n[((int)integer0)] = timeline0;
        if(this.o.isEmpty()) {
            if(this.k) {
                this.E0();
            }
            Timeline timeline1 = this.n[0];
            if(this.l) {
                this.H0();
                timeline1 = new ClippedTimeline(timeline1, this.q);
            }
            this.p0(timeline1);
        }
    }

    private void H0() {
        Timeline[] arr_timeline;
        Period timeline$Period0 = new Period();
        for(int v = 0; v < this.s; ++v) {
            long v1 = 0x8000000000000000L;
            for(int v2 = 0; true; ++v2) {
                arr_timeline = this.n;
                if(v2 >= arr_timeline.length) {
                    break;
                }
                long v3 = arr_timeline[v2].j(v, timeline$Period0).n();
                if(v3 != 0x8000000000000001L) {
                    long v4 = v3 + this.t[v][v2];
                    if(v1 == 0x8000000000000000L || v4 < v1) {
                        v1 = v4;
                    }
                }
            }
            Object object0 = arr_timeline[0].s(v);
            this.q.put(object0, v1);
            for(Object object1: this.r.get(object0)) {
                ((ClippingMediaPeriod)object1).u(0L, v1);
            }
        }
    }

    @Override  // androidx.media3.exoplayer.source.BaseMediaSource
    public void L(MediaItem mediaItem0) {
        this.m[0].L(mediaItem0);
    }

    @Override  // androidx.media3.exoplayer.source.BaseMediaSource
    public boolean S(MediaItem mediaItem0) {
        return this.m.length > 0 && this.m[0].S(mediaItem0);
    }

    @Override  // androidx.media3.exoplayer.source.MediaSource
    public MediaItem d() {
        return this.m.length <= 0 ? MergingMediaSource.w : this.m[0].d();
    }

    @Override  // androidx.media3.exoplayer.source.CompositeMediaSource
    protected void o0(@Nullable TransferListener transferListener0) {
        super.o0(transferListener0);
        for(int v = 0; v < this.m.length; ++v) {
            this.C0(v, this.m[v]);
        }
    }

    @Override  // androidx.media3.exoplayer.source.CompositeMediaSource
    protected void q0() {
        super.q0();
        Arrays.fill(this.n, null);
        this.s = -1;
        this.u = null;
        this.o.clear();
        Collections.addAll(this.o, this.m);
    }

    @Override  // androidx.media3.exoplayer.source.MediaSource
    public void r(MediaPeriod mediaPeriod0) {
        if(this.l) {
            ClippingMediaPeriod clippingMediaPeriod0 = (ClippingMediaPeriod)mediaPeriod0;
            for(Object object0: this.r.h()) {
                Map.Entry map$Entry0 = (Map.Entry)object0;
                if(((ClippingMediaPeriod)map$Entry0.getValue()).equals(clippingMediaPeriod0)) {
                    Object object1 = map$Entry0.getKey();
                    Object object2 = map$Entry0.getValue();
                    this.r.remove(object1, object2);
                    break;
                }
                if(false) {
                    break;
                }
            }
            mediaPeriod0 = clippingMediaPeriod0.a;
        }
        for(int v = 0; true; ++v) {
            MediaSource[] arr_mediaSource = this.m;
            if(v >= arr_mediaSource.length) {
                break;
            }
            arr_mediaSource[v].r(((MergingMediaPeriod)mediaPeriod0).m(v));
        }
    }

    @Override  // androidx.media3.exoplayer.source.CompositeMediaSource
    public void w() throws IOException {
        IllegalMergeException mergingMediaSource$IllegalMergeException0 = this.u;
        if(mergingMediaSource$IllegalMergeException0 != null) {
            throw mergingMediaSource$IllegalMergeException0;
        }
        super.w();
    }

    @Override  // androidx.media3.exoplayer.source.CompositeMediaSource
    @Nullable
    protected MediaPeriodId x0(Object object0, MediaPeriodId mediaSource$MediaPeriodId0) {
        return this.F0(((Integer)object0), mediaSource$MediaPeriodId0);
    }
}

