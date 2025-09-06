package androidx.media3.exoplayer.video;

import android.content.Context;
import android.view.Surface;
import androidx.annotation.Nullable;
import androidx.media3.common.util.Clock;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.ExoPlaybackException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@UnstableApi
public final class VideoFrameReleaseControl {
    @UnstableApi
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    @Target({ElementType.TYPE_USE})
    public @interface FrameReleaseAction {
    }

    public static class FrameReleaseInfo {
        private long a;
        private long b;

        public FrameReleaseInfo() {
            this.a = 0x8000000000000001L;
            this.b = 0x8000000000000001L;
        }

        public long f() {
            return this.a;
        }

        public long g() {
            return this.b;
        }

        private void h() {
            this.a = 0x8000000000000001L;
            this.b = 0x8000000000000001L;
        }
    }

    public interface FrameTimingEvaluator {
        boolean o(long arg1, long arg2);

        boolean q(long arg1, long arg2, boolean arg3);

        boolean y(long arg1, long arg2, long arg3, boolean arg4, boolean arg5) throws ExoPlaybackException;
    }

    private final FrameTimingEvaluator a;
    private final VideoFrameReleaseHelper b;
    private final long c;
    private boolean d;
    private int e;
    private long f;
    private long g;
    private long h;
    private long i;
    private boolean j;
    private float k;
    private Clock l;
    public static final int m = 0;
    public static final int n = 1;
    public static final int o = 2;
    public static final int p = 3;
    public static final int q = 4;
    public static final int r = 5;
    private static final long s = 50000L;

    public VideoFrameReleaseControl(Context context0, FrameTimingEvaluator videoFrameReleaseControl$FrameTimingEvaluator0, long v) {
        this.a = videoFrameReleaseControl$FrameTimingEvaluator0;
        this.c = v;
        this.b = new VideoFrameReleaseHelper(context0);
        this.e = 0;
        this.f = 0x8000000000000001L;
        this.h = 0x8000000000000001L;
        this.i = 0x8000000000000001L;
        this.k = 1.0f;
        this.l = Clock.a;
    }

    public void a() {
        if(this.e == 0) {
            this.e = 1;
        }
    }

    private long b(long v, long v1, long v2) {
        long v3 = (long)(((double)(v2 - v)) / ((double)this.k));
        return this.d ? v3 - (Util.F1(this.l.elapsedRealtime()) - v1) : v3;
    }

    public int c(long v, long v1, long v2, long v3, boolean z, FrameReleaseInfo videoFrameReleaseControl$FrameReleaseInfo0) throws ExoPlaybackException {
        videoFrameReleaseControl$FrameReleaseInfo0.h();
        if(this.f == 0x8000000000000001L) {
            this.f = v1;
        }
        if(this.h != v) {
            this.b.h(v);
            this.h = v;
        }
        videoFrameReleaseControl$FrameReleaseInfo0.a = this.b(v1, v2, v);
        boolean z1 = false;
        if(this.s(v1, videoFrameReleaseControl$FrameReleaseInfo0.a, v3)) {
            return 0;
        }
        if(this.d && v1 != this.f) {
            long v4 = this.l.nanoTime();
            videoFrameReleaseControl$FrameReleaseInfo0.b = this.b.b(videoFrameReleaseControl$FrameReleaseInfo0.a * 1000L + v4);
            videoFrameReleaseControl$FrameReleaseInfo0.a = (videoFrameReleaseControl$FrameReleaseInfo0.b - v4) / 1000L;
            if(this.i != 0x8000000000000001L && !this.j) {
                z1 = true;
            }
            if(this.a.y(videoFrameReleaseControl$FrameReleaseInfo0.a, v1, v2, z, z1)) {
                return 4;
            }
            if(this.a.q(videoFrameReleaseControl$FrameReleaseInfo0.a, v2, z)) {
                return z1 ? 3 : 2;
            }
            return videoFrameReleaseControl$FrameReleaseInfo0.a <= 50000L ? 1 : 5;
        }
        return 5;
    }

    public boolean d(boolean z) {
        if(z && this.e == 3) {
            this.i = 0x8000000000000001L;
            return true;
        }
        if(this.i == 0x8000000000000001L) {
            return false;
        }
        if(this.l.elapsedRealtime() < this.i) {
            return true;
        }
        this.i = 0x8000000000000001L;
        return false;
    }

    public void e(boolean z) {
        this.j = z;
        this.i = this.c <= 0L ? 0x8000000000000001L : this.l.elapsedRealtime() + this.c;
    }

    private void f(int v) {
        this.e = Math.min(this.e, v);
    }

    public void g() {
        this.f(0);
    }

    public void h(boolean z) {
        this.e = z;
    }

    public boolean i() {
        boolean z = this.e != 3;
        this.e = 3;
        this.g = Util.F1(this.l.elapsedRealtime());
        return z;
    }

    public void j() {
        this.f(2);
    }

    public void k() {
        this.d = true;
        this.g = Util.F1(this.l.elapsedRealtime());
        this.b.k();
    }

    public void l() {
        this.d = false;
        this.i = 0x8000000000000001L;
        this.b.l();
    }

    public void m() {
        this.b.j();
        this.h = 0x8000000000000001L;
        this.f = 0x8000000000000001L;
        this.f(1);
        this.i = 0x8000000000000001L;
    }

    public void n(int v) {
        this.b.o(v);
    }

    public void o(Clock clock0) {
        this.l = clock0;
    }

    public void p(float f) {
        this.b.g(f);
    }

    public void q(@Nullable Surface surface0) {
        this.b.m(surface0);
        this.f(1);
    }

    public void r(float f) {
        if(f == this.k) {
            return;
        }
        this.k = f;
        this.b.i(f);
    }

    private boolean s(long v, long v1, long v2) {
        if(this.i != 0x8000000000000001L && !this.j) {
            return false;
        }
        switch(this.e) {
            case 0: {
                return this.d;
            }
            case 1: {
                return true;
            }
            case 2: {
                return v >= v2;
            }
            case 3: {
                long v3 = Util.F1(this.l.elapsedRealtime()) - this.g;
                return this.d && this.a.o(v1, v3);
            }
            default: {
                throw new IllegalStateException();
            }
        }
    }
}

