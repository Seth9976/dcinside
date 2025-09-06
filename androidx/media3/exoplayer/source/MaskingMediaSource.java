package androidx.media3.exoplayer.source;

import android.util.Pair;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.media3.common.AdPlaybackState;
import androidx.media3.common.MediaItem;
import androidx.media3.common.Timeline.Period;
import androidx.media3.common.Timeline.Window;
import androidx.media3.common.Timeline;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.upstream.Allocator;
import h4.m;

@UnstableApi
public final class MaskingMediaSource extends WrappingMediaSource {
    static final class MaskingTimeline extends ForwardingTimeline {
        @Nullable
        private final Object f;
        @Nullable
        private final Object g;
        public static final Object h;

        static {
            MaskingTimeline.h = new Object();
        }

        private MaskingTimeline(Timeline timeline0, @Nullable Object object0, @Nullable Object object1) {
            super(timeline0);
            this.f = object0;
            this.g = object1;
        }

        public MaskingTimeline A(Timeline timeline0) {
            return new MaskingTimeline(timeline0, this.f, this.g);
        }

        public static MaskingTimeline B(MediaItem mediaItem0) {
            return new MaskingTimeline(new PlaceholderTimeline(mediaItem0), Window.q, MaskingTimeline.h);
        }

        public static MaskingTimeline C(Timeline timeline0, @Nullable Object object0, @Nullable Object object1) {
            return new MaskingTimeline(timeline0, object0, object1);
        }

        @Override  // androidx.media3.exoplayer.source.ForwardingTimeline
        public int f(Object object0) {
            Timeline timeline0 = this.e;
            if(MaskingTimeline.h.equals(object0)) {
                Object object1 = this.g;
                if(object1 != null) {
                    object0 = object1;
                }
            }
            return timeline0.f(object0);
        }

        @Override  // androidx.media3.exoplayer.source.ForwardingTimeline
        public Period k(int v, Period timeline$Period0, boolean z) {
            this.e.k(v, timeline$Period0, z);
            if(Util.g(timeline$Period0.b, this.g) && z) {
                timeline$Period0.b = MaskingTimeline.h;
            }
            return timeline$Period0;
        }

        @Override  // androidx.media3.exoplayer.source.ForwardingTimeline
        public Object s(int v) {
            Object object0 = this.e.s(v);
            return Util.g(object0, this.g) ? MaskingTimeline.h : object0;
        }

        @Override  // androidx.media3.exoplayer.source.ForwardingTimeline
        public Window u(int v, Window timeline$Window0, long v1) {
            this.e.u(v, timeline$Window0, v1);
            if(Util.g(timeline$Window0.a, this.f)) {
                timeline$Window0.a = Window.q;
            }
            return timeline$Window0;
        }
    }

    @VisibleForTesting
    public static final class PlaceholderTimeline extends Timeline {
        private final MediaItem e;

        public PlaceholderTimeline(MediaItem mediaItem0) {
            this.e = mediaItem0;
        }

        @Override  // androidx.media3.common.Timeline
        public int f(Object object0) {
            return object0 == MaskingTimeline.h ? 0 : -1;
        }

        @Override  // androidx.media3.common.Timeline
        public Period k(int v, Period timeline$Period0, boolean z) {
            Object object0 = null;
            Integer integer0 = z ? 0 : null;
            if(z) {
                object0 = MaskingTimeline.h;
            }
            timeline$Period0.x(integer0, object0, 0, 0x8000000000000001L, 0L, AdPlaybackState.l, true);
            return timeline$Period0;
        }

        @Override  // androidx.media3.common.Timeline
        public int m() {
            return 1;
        }

        @Override  // androidx.media3.common.Timeline
        public Object s(int v) {
            return MaskingTimeline.h;
        }

        @Override  // androidx.media3.common.Timeline
        public Window u(int v, Window timeline$Window0, long v1) {
            timeline$Window0.j(Window.q, this.e, null, 0x8000000000000001L, 0x8000000000000001L, 0x8000000000000001L, false, true, null, 0L, 0x8000000000000001L, 0, 0, 0L);
            timeline$Window0.k = true;
            return timeline$Window0;
        }

        @Override  // androidx.media3.common.Timeline
        public int v() {
            return 1;
        }
    }

    private final boolean m;
    private final Window n;
    private final Period o;
    private MaskingTimeline p;
    @Nullable
    private MaskingMediaPeriod q;
    private boolean r;
    private boolean s;
    private boolean t;

    public MaskingMediaSource(MediaSource mediaSource0, boolean z) {
        super(mediaSource0);
        this.m = z && mediaSource0.R();
        this.n = new Window();
        this.o = new Period();
        Timeline timeline0 = mediaSource0.x();
        if(timeline0 != null) {
            this.p = MaskingTimeline.C(timeline0, null, null);
            this.t = true;
            return;
        }
        this.p = MaskingTimeline.B(mediaSource0.d());
    }

    @Override  // androidx.media3.exoplayer.source.WrappingMediaSource
    public MediaPeriod C(MediaPeriodId mediaSource$MediaPeriodId0, Allocator allocator0, long v) {
        return this.R0(mediaSource$MediaPeriodId0, allocator0, v);
    }

    @Override  // androidx.media3.exoplayer.source.WrappingMediaSource
    @Nullable
    protected MediaPeriodId G0(MediaPeriodId mediaSource$MediaPeriodId0) {
        return mediaSource$MediaPeriodId0.a(this.S0(mediaSource$MediaPeriodId0.a));
    }

    @Override  // androidx.media3.exoplayer.source.WrappingMediaSource
    public void L(MediaItem mediaItem0) {
        this.p = this.t ? this.p.A(new TimelineWithUpdatedMediaItem(this.p.e, mediaItem0)) : MaskingTimeline.B(mediaItem0);
        this.k.L(mediaItem0);
    }

    @Override  // androidx.media3.exoplayer.source.WrappingMediaSource
    protected void M0(Timeline timeline0) {
        long v2;
        MediaPeriodId mediaSource$MediaPeriodId0;
        if(this.s) {
            this.p = this.p.A(timeline0);
            MaskingMediaPeriod maskingMediaPeriod0 = this.q;
            if(maskingMediaPeriod0 != null) {
                this.V0(maskingMediaPeriod0.m());
            }
            mediaSource$MediaPeriodId0 = null;
        }
        else if(timeline0.w()) {
            this.p = this.t ? this.p.A(timeline0) : MaskingTimeline.C(timeline0, Window.q, MaskingTimeline.h);
            mediaSource$MediaPeriodId0 = null;
        }
        else {
            timeline0.t(0, this.n);
            long v = this.n.d();
            Object object0 = this.n.a;
            MaskingMediaPeriod maskingMediaPeriod1 = this.q;
            if(maskingMediaPeriod1 == null) {
                v2 = v;
            }
            else {
                this.p.l(this.q.a.a, this.o);
                long v1 = this.o.r() + maskingMediaPeriod1.o();
                v2 = v1 == this.p.t(0, this.n).d() ? v : v1;
            }
            Pair pair0 = timeline0.p(this.n, this.o, 0, v2);
            Object object1 = pair0.first;
            long v3 = (long)(((Long)pair0.second));
            this.p = this.t ? this.p.A(timeline0) : MaskingTimeline.C(timeline0, object0, object1);
            MaskingMediaPeriod maskingMediaPeriod2 = this.q;
            if(maskingMediaPeriod2 == null || !this.V0(v3)) {
                mediaSource$MediaPeriodId0 = null;
            }
            else {
                Object object2 = this.T0(maskingMediaPeriod2.a.a);
                mediaSource$MediaPeriodId0 = maskingMediaPeriod2.a.a(object2);
            }
        }
        this.t = true;
        this.s = true;
        this.p0(this.p);
        if(mediaSource$MediaPeriodId0 != null) {
            ((MaskingMediaPeriod)Assertions.g(this.q)).b(mediaSource$MediaPeriodId0);
        }
    }

    @Override  // androidx.media3.exoplayer.source.WrappingMediaSource
    public void P0() {
        if(!this.m) {
            this.r = true;
            this.O0();
        }
    }

    public MaskingMediaPeriod R0(MediaPeriodId mediaSource$MediaPeriodId0, Allocator allocator0, long v) {
        MaskingMediaPeriod maskingMediaPeriod0 = new MaskingMediaPeriod(mediaSource$MediaPeriodId0, allocator0, v);
        maskingMediaPeriod0.x(this.k);
        if(this.s) {
            maskingMediaPeriod0.b(mediaSource$MediaPeriodId0.a(this.T0(mediaSource$MediaPeriodId0.a)));
            return maskingMediaPeriod0;
        }
        this.q = maskingMediaPeriod0;
        if(!this.r) {
            this.r = true;
            this.O0();
        }
        return maskingMediaPeriod0;
    }

    @Override  // androidx.media3.exoplayer.source.WrappingMediaSource
    public boolean S(MediaItem mediaItem0) {
        return this.k.S(mediaItem0);
    }

    private Object S0(Object object0) {
        return this.p.g == null || !this.p.g.equals(object0) ? object0 : MaskingTimeline.h;
    }

    private Object T0(Object object0) {
        return this.p.g == null || !object0.equals(MaskingTimeline.h) ? object0 : this.p.g;
    }

    public Timeline U0() {
        return this.p;
    }

    @m({"unpreparedMaskingMediaPeriod"})
    private boolean V0(long v) {
        MaskingMediaPeriod maskingMediaPeriod0 = this.q;
        int v1 = this.p.f(maskingMediaPeriod0.a.a);
        if(v1 == -1) {
            return false;
        }
        long v2 = this.p.j(v1, this.o).d;
        if(v2 != 0x8000000000000001L && v >= v2) {
            v = Math.max(0L, v2 - 1L);
        }
        maskingMediaPeriod0.u(v);
        return true;
    }

    @Override  // androidx.media3.exoplayer.source.CompositeMediaSource
    public void q0() {
        this.s = false;
        this.r = false;
        super.q0();
    }

    @Override  // androidx.media3.exoplayer.source.WrappingMediaSource
    public void r(MediaPeriod mediaPeriod0) {
        ((MaskingMediaPeriod)mediaPeriod0).w();
        if(mediaPeriod0 == this.q) {
            this.q = null;
        }
    }

    @Override  // androidx.media3.exoplayer.source.CompositeMediaSource
    public void w() {
    }
}

