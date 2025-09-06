package androidx.media3.exoplayer;

import O1.a;
import android.os.SystemClock;
import androidx.media3.common.MediaItem.LiveConfiguration;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import com.google.common.primitives.n;

@UnstableApi
public final class DefaultLivePlaybackSpeedControl implements LivePlaybackSpeedControl {
    public static final class Builder {
        private float a;
        private float b;
        private long c;
        private float d;
        private long e;
        private long f;
        private float g;

        public Builder() {
            this.a = 0.97f;
            this.b = 1.03f;
            this.c = 1000L;
            this.d = 1.000000E-07f;
            this.e = 20000L;
            this.f = 500000L;
            this.g = 0.999f;
        }

        public DefaultLivePlaybackSpeedControl a() {
            return new DefaultLivePlaybackSpeedControl(this.a, this.b, this.c, this.d, this.e, this.f, this.g, null);
        }

        @a
        public Builder b(float f) {
            Assertions.a(f >= 1.0f);
            this.b = f;
            return this;
        }

        @a
        public Builder c(float f) {
            Assertions.a(0.0f < f && f <= 1.0f);
            this.a = f;
            return this;
        }

        @a
        public Builder d(long v) {
            Assertions.a(v > 0L);
            this.e = Util.F1(v);
            return this;
        }

        @a
        public Builder e(float f) {
            Assertions.a(f >= 0.0f && f < 1.0f);
            this.g = f;
            return this;
        }

        @a
        public Builder f(long v) {
            Assertions.a(v > 0L);
            this.c = v;
            return this;
        }

        @a
        public Builder g(float f) {
            Assertions.a(f > 0.0f);
            this.d = f / 1000000.0f;
            return this;
        }

        @a
        public Builder h(long v) {
            Assertions.a(v >= 0L);
            this.f = Util.F1(v);
            return this;
        }
    }

    private final float a;
    private final float b;
    private final long c;
    private final float d;
    private final long e;
    private final long f;
    private final float g;
    private long h;
    private long i;
    private long j;
    private long k;
    private long l;
    private long m;
    private float n;
    private float o;
    private float p;
    private long q;
    private long r;
    private long s;
    public static final float t = 0.97f;
    public static final float u = 1.03f;
    public static final long v = 1000L;
    public static final float w = 0.1f;
    public static final long x = 500L;
    public static final float y = 0.999f;
    public static final long z = 20L;

    private DefaultLivePlaybackSpeedControl(float f, float f1, long v, float f2, long v1, long v2, float f3) {
        this.a = f;
        this.b = f1;
        this.c = v;
        this.d = f2;
        this.e = v1;
        this.f = v2;
        this.g = f3;
        this.h = 0x8000000000000001L;
        this.i = 0x8000000000000001L;
        this.k = 0x8000000000000001L;
        this.l = 0x8000000000000001L;
        this.o = f;
        this.n = f1;
        this.p = 1.0f;
        this.q = 0x8000000000000001L;
        this.j = 0x8000000000000001L;
        this.m = 0x8000000000000001L;
        this.r = 0x8000000000000001L;
        this.s = 0x8000000000000001L;
    }

    DefaultLivePlaybackSpeedControl(float f, float f1, long v, float f2, long v1, long v2, float f3, androidx.media3.exoplayer.DefaultLivePlaybackSpeedControl.1 defaultLivePlaybackSpeedControl$10) {
        this(f, f1, v, f2, v1, v2, f3);
    }

    @Override  // androidx.media3.exoplayer.LivePlaybackSpeedControl
    public void a(LiveConfiguration mediaItem$LiveConfiguration0) {
        this.h = Util.F1(mediaItem$LiveConfiguration0.a);
        this.k = Util.F1(mediaItem$LiveConfiguration0.b);
        this.l = Util.F1(mediaItem$LiveConfiguration0.c);
        float f = mediaItem$LiveConfiguration0.d == -3.402823E+38f ? this.a : mediaItem$LiveConfiguration0.d;
        this.o = f;
        float f1 = mediaItem$LiveConfiguration0.e == -3.402823E+38f ? this.b : mediaItem$LiveConfiguration0.e;
        this.n = f1;
        if(f == 1.0f && f1 == 1.0f) {
            this.h = 0x8000000000000001L;
        }
        this.g();
    }

    @Override  // androidx.media3.exoplayer.LivePlaybackSpeedControl
    public float b(long v, long v1) {
        if(this.h == 0x8000000000000001L) {
            return 1.0f;
        }
        this.i(v, v1);
        if(this.q != 0x8000000000000001L && SystemClock.elapsedRealtime() - this.q < this.c) {
            return this.p;
        }
        this.q = SystemClock.elapsedRealtime();
        this.f(v);
        long v2 = v - this.m;
        if(Math.abs(v2) < this.e) {
            this.p = 1.0f;
            return 1.0f;
        }
        this.p = Util.v(this.d * ((float)v2) + 1.0f, this.o, this.n);
        return this.p;
    }

    @Override  // androidx.media3.exoplayer.LivePlaybackSpeedControl
    public long c() {
        return this.m;
    }

    @Override  // androidx.media3.exoplayer.LivePlaybackSpeedControl
    public void d() {
        long v = this.m;
        if(v == 0x8000000000000001L) {
            return;
        }
        long v1 = v + this.f;
        this.m = v1;
        long v2 = this.l;
        if(v2 != 0x8000000000000001L && v1 > v2) {
            this.m = v2;
        }
        this.q = 0x8000000000000001L;
    }

    @Override  // androidx.media3.exoplayer.LivePlaybackSpeedControl
    public void e(long v) {
        this.i = v;
        this.g();
    }

    private void f(long v) {
        long v1 = this.r + this.s * 3L;
        if(this.m > v1) {
            float f = (float)Util.F1(this.c);
            this.m = n.t(new long[]{v1, this.j, this.m - (((long)((this.p - 1.0f) * f)) + ((long)((this.n - 1.0f) * f)))});
            return;
        }
        long v2 = Util.x(v - ((long)(Math.max(0.0f, this.p - 1.0f) / this.d)), this.m, v1);
        this.m = v2;
        long v3 = this.l;
        if(v3 != 0x8000000000000001L && v2 > v3) {
            this.m = v3;
        }
    }

    private void g() {
        long v1;
        long v = this.h;
        if(v == 0x8000000000000001L) {
            v1 = 0x8000000000000001L;
        }
        else {
            v1 = this.i;
            if(v1 == 0x8000000000000001L) {
                long v2 = this.k;
                if(v2 != 0x8000000000000001L && v < v2) {
                    v = v2;
                }
                v1 = this.l;
                if(v1 == 0x8000000000000001L || v <= v1) {
                    v1 = v;
                }
            }
        }
        if(this.j == v1) {
            return;
        }
        this.j = v1;
        this.m = v1;
        this.r = 0x8000000000000001L;
        this.s = 0x8000000000000001L;
        this.q = 0x8000000000000001L;
    }

    private static long h(long v, long v1, float f) {
        return (long)(((float)v) * f + (1.0f - f) * ((float)v1));
    }

    private void i(long v, long v1) {
        long v2 = v - v1;
        long v3 = this.r;
        if(v3 == 0x8000000000000001L) {
            this.r = v2;
            this.s = 0L;
            return;
        }
        long v4 = Math.max(v2, DefaultLivePlaybackSpeedControl.h(v3, v2, this.g));
        this.r = v4;
        this.s = DefaultLivePlaybackSpeedControl.h(this.s, Math.abs(v2 - v4), this.g);
    }

    class androidx.media3.exoplayer.DefaultLivePlaybackSpeedControl.1 {
    }

}

