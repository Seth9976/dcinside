package M0;

import androidx.annotation.VisibleForTesting;
import com.facebook.fresco.animation.backend.d;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;

public final class a implements b {
    public static final class M0.a.a {
        private M0.a.a() {
        }

        public M0.a.a(w w0) {
        }
    }

    @l
    private final d c;
    private long d;
    @l
    public static final M0.a.a e = null;
    private static final int f = -1;

    static {
        a.e = new M0.a.a(null);
    }

    public a(@l d d0) {
        L.p(d0, "animationInformation");
        super();
        this.c = d0;
        this.d = -1L;
    }

    @VisibleForTesting
    public final int a(long v) {
        int v1 = 0;
        long v2 = 0L;
        while(true) {
            v2 += (long)this.c.k(v1);
            if(v < v2) {
                break;
            }
            ++v1;
        }
        return v1;
    }

    @Override  // M0.b
    public long c() {
        long v = this.d;
        if(v != -1L) {
            return v;
        }
        this.d = 0L;
        int v1 = this.c.b();
        for(int v2 = 0; v2 < v1; ++v2) {
            this.d += (long)this.c.k(v2);
        }
        return this.d;
    }

    @Override  // M0.b
    public long d(int v) {
        long v1 = 0L;
        for(int v2 = 0; v2 < v; ++v2) {
            v1 += (long)this.c.k(v);
        }
        return v1;
    }

    @Override  // M0.b
    public long e(long v) {
        long v1 = this.c();
        long v2 = 0L;
        if(v1 == 0L) {
            return -1L;
        }
        if(!this.g() && v / v1 >= ((long)this.c.a())) {
            return -1L;
        }
        long v3 = v % v1;
        int v4 = this.c.b();
        for(int v5 = 0; v5 < v4 && v2 <= v3; ++v5) {
            v2 += (long)this.c.k(v5);
        }
        return v + (v2 - v3);
    }

    @Override  // M0.b
    public int f(long v, long v1) {
        long v2 = this.c();
        if(v2 == 0L) {
            return this.a(0L);
        }
        return this.g() || v / v2 < ((long)this.c.a()) ? this.a(v % v2) : -1;
    }

    @Override  // M0.b
    public boolean g() {
        return this.c.a() == 0;
    }
}

