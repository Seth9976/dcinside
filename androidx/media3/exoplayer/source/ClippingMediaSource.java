package androidx.media3.exoplayer.source;

import androidx.annotation.Nullable;
import androidx.media3.common.MediaItem;
import androidx.media3.common.Timeline.Period;
import androidx.media3.common.Timeline.Window;
import androidx.media3.common.Timeline;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.upstream.Allocator;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;

@UnstableApi
public final class ClippingMediaSource extends WrappingMediaSource {
    static final class ClippingTimeline extends ForwardingTimeline {
        private final long f;
        private final long g;
        private final long h;
        private final boolean i;

        public ClippingTimeline(Timeline timeline0, long v, long v1) throws IllegalClippingException {
            super(timeline0);
            boolean z = false;
            if(timeline0.m() != 1) {
                throw new IllegalClippingException(0);
            }
            Window timeline$Window0 = timeline0.t(0, new Window());
            long v2 = Math.max(0L, v);
            if(!timeline$Window0.k && v2 != 0L && !timeline$Window0.h) {
                throw new IllegalClippingException(1);
            }
            long v3 = v1 == 0x8000000000000000L ? timeline$Window0.m : Math.max(0L, v1);
            long v4 = timeline$Window0.m;
            if(v4 != 0x8000000000000001L) {
                if(v3 > v4) {
                    v3 = v4;
                }
                if(v2 > v3) {
                    throw new IllegalClippingException(2);
                }
            }
            this.f = v2;
            this.g = v3;
            int v5 = Long.compare(v3, 0x8000000000000001L);
            this.h = v5 == 0 ? 0x8000000000000001L : v3 - v2;
            if(timeline$Window0.i && (v5 == 0 || v4 != 0x8000000000000001L && v3 == v4)) {
                z = true;
            }
            this.i = z;
        }

        @Override  // androidx.media3.exoplayer.source.ForwardingTimeline
        public Period k(int v, Period timeline$Period0, boolean z) {
            this.e.k(0, timeline$Period0, z);
            long v1 = timeline$Period0.r() - this.f;
            return this.h == 0x8000000000000001L ? timeline$Period0.w(timeline$Period0.a, timeline$Period0.b, 0, 0x8000000000000001L, v1) : timeline$Period0.w(timeline$Period0.a, timeline$Period0.b, 0, this.h - v1, v1);
        }

        @Override  // androidx.media3.exoplayer.source.ForwardingTimeline
        public Window u(int v, Window timeline$Window0, long v1) {
            this.e.u(0, timeline$Window0, 0L);
            long v2 = this.f;
            timeline$Window0.p += v2;
            timeline$Window0.m = this.h;
            timeline$Window0.i = this.i;
            long v3 = timeline$Window0.l;
            if(v3 != 0x8000000000000001L) {
                long v4 = Math.max(v3, v2);
                timeline$Window0.l = v4;
                long v5 = this.g;
                if(v5 != 0x8000000000000001L) {
                    v4 = Math.min(v4, v5);
                }
                timeline$Window0.l = v4 - this.f;
            }
            long v6 = Util.B2(this.f);
            long v7 = timeline$Window0.e;
            if(v7 != 0x8000000000000001L) {
                timeline$Window0.e = v7 + v6;
            }
            long v8 = timeline$Window0.f;
            if(v8 != 0x8000000000000001L) {
                timeline$Window0.f = v8 + v6;
            }
            return timeline$Window0;
        }
    }

    public static final class IllegalClippingException extends IOException {
        @Documented
        @Retention(RetentionPolicy.SOURCE)
        @Target({ElementType.TYPE_USE})
        public @interface Reason {
        }

        public final int a;
        public static final int b = 0;
        public static final int c = 1;
        public static final int d = 2;

        public IllegalClippingException(int v) {
            super("Illegal clipping: " + IllegalClippingException.a(v));
            this.a = v;
        }

        private static String a(int v) {
            switch(v) {
                case 0: {
                    return "invalid period count";
                }
                case 1: {
                    return "not seekable to start";
                }
                case 2: {
                    return "start exceeds end";
                }
                default: {
                    return "unknown";
                }
            }
        }
    }

    private final long m;
    private final long n;
    private final boolean o;
    private final boolean p;
    private final boolean q;
    private final ArrayList r;
    private final Window s;
    @Nullable
    private ClippingTimeline t;
    @Nullable
    private IllegalClippingException u;
    private long v;
    private long w;

    public ClippingMediaSource(MediaSource mediaSource0, long v) {
        this(mediaSource0, 0L, v, true, false, true);
    }

    public ClippingMediaSource(MediaSource mediaSource0, long v, long v1) {
        this(mediaSource0, v, v1, true, false, false);
    }

    public ClippingMediaSource(MediaSource mediaSource0, long v, long v1, boolean z, boolean z1, boolean z2) {
        super(((MediaSource)Assertions.g(mediaSource0)));
        Assertions.a(v >= 0L);
        this.m = v;
        this.n = v1;
        this.o = z;
        this.p = z1;
        this.q = z2;
        this.r = new ArrayList();
        this.s = new Window();
    }

    @Override  // androidx.media3.exoplayer.source.WrappingMediaSource
    public MediaPeriod C(MediaPeriodId mediaSource$MediaPeriodId0, Allocator allocator0, long v) {
        MediaPeriod mediaPeriod0 = new ClippingMediaPeriod(this.k.C(mediaSource$MediaPeriodId0, allocator0, v), this.o, this.v, this.w);
        this.r.add(mediaPeriod0);
        return mediaPeriod0;
    }

    @Override  // androidx.media3.exoplayer.source.WrappingMediaSource
    protected void M0(Timeline timeline0) {
        if(this.u != null) {
            return;
        }
        this.R0(timeline0);
    }

    private void R0(Timeline timeline0) {
        ClippingTimeline clippingMediaSource$ClippingTimeline0;
        long v4;
        timeline0.t(0, this.s);
        long v1 = this.s.h();
        long v2 = 0x8000000000000000L;
        if(this.t == null || this.r.isEmpty() || this.p) {
            long v5 = this.m;
            long v6 = this.n;
            if(this.q) {
                long v7 = this.s.d();
                v5 += v7;
                v6 += v7;
            }
            this.v = v1 + v5;
            if(this.n != 0x8000000000000000L) {
                v2 = v1 + v6;
            }
            this.w = v2;
            int v8 = this.r.size();
            for(int v9 = 0; v9 < v8; ++v9) {
                ((ClippingMediaPeriod)this.r.get(v9)).u(this.v, this.w);
            }
            v4 = v5;
            v2 = v6;
        }
        else {
            long v3 = this.v - v1;
            if(this.n != 0x8000000000000000L) {
                v2 = this.w - v1;
            }
            v4 = v3;
        }
        try {
            clippingMediaSource$ClippingTimeline0 = new ClippingTimeline(timeline0, v4, v2);
            this.t = clippingMediaSource$ClippingTimeline0;
        }
        catch(IllegalClippingException clippingMediaSource$IllegalClippingException0) {
            this.u = clippingMediaSource$IllegalClippingException0;
            for(int v = 0; v < this.r.size(); ++v) {
                ((ClippingMediaPeriod)this.r.get(v)).p(this.u);
            }
            return;
        }
        this.p0(clippingMediaSource$ClippingTimeline0);
    }

    // 去混淆评级： 低(20)
    @Override  // androidx.media3.exoplayer.source.WrappingMediaSource
    public boolean S(MediaItem mediaItem0) {
        return this.d().f.equals(mediaItem0.f) && this.k.S(mediaItem0);
    }

    @Override  // androidx.media3.exoplayer.source.CompositeMediaSource
    protected void q0() {
        super.q0();
        this.u = null;
        this.t = null;
    }

    @Override  // androidx.media3.exoplayer.source.WrappingMediaSource
    public void r(MediaPeriod mediaPeriod0) {
        Assertions.i(this.r.remove(mediaPeriod0));
        this.k.r(((ClippingMediaPeriod)mediaPeriod0).a);
        if(this.r.isEmpty() && !this.p) {
            this.R0(((ClippingTimeline)Assertions.g(this.t)).e);
        }
    }

    @Override  // androidx.media3.exoplayer.source.CompositeMediaSource
    public void w() throws IOException {
        IllegalClippingException clippingMediaSource$IllegalClippingException0 = this.u;
        if(clippingMediaSource$IllegalClippingException0 != null) {
            throw clippingMediaSource$IllegalClippingException0;
        }
        super.w();
    }
}

