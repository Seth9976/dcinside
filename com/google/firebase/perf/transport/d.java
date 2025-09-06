package com.google.firebase.perf.transport;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.google.firebase.perf.util.Timer;
import com.google.firebase.perf.util.h;
import com.google.firebase.perf.util.m;
import com.google.firebase.perf.v1.s;
import com.google.firebase.perf.v1.u;
import com.google.firebase.perf.v1.w;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

final class d {
    static class a {
        private final com.google.firebase.perf.util.a a;
        private final boolean b;
        private Timer c;
        private h d;
        private long e;
        private double f;
        private h g;
        private h h;
        private long i;
        private long j;
        private static final com.google.firebase.perf.logging.a k;
        private static final long l;

        static {
            a.k = com.google.firebase.perf.logging.a.e();
            a.l = TimeUnit.SECONDS.toMicros(1L);
        }

        a(h h0, long v, com.google.firebase.perf.util.a a0, com.google.firebase.perf.config.a a1, @s2.a String s, boolean z) {
            this.a = a0;
            this.e = v;
            this.d = h0;
            this.f = (double)v;
            this.c = a0.a();
            this.m(a1, s, z);
            this.b = z;
        }

        void a(boolean z) {
            synchronized(this) {
                this.d = z ? this.g : this.h;
                this.e = z ? this.i : this.j;
            }
        }

        boolean b(@NonNull s s0) {
            synchronized(this) {
                Timer timer0 = this.a.a();
                double f = ((double)this.c.e(timer0)) * this.d.a() / ((double)a.l);
                if(f > 0.0) {
                    this.f = Math.min(this.f + f, this.e);
                    this.c = timer0;
                }
                double f1 = this.f;
                if(f1 >= 1.0) {
                    this.f = f1 - 1.0;
                    return true;
                }
                if(this.b) {
                    a.k.l("Exceeded log rate limit, dropping the log.");
                }
                return false;
            }
        }

        @VisibleForTesting
        long c() {
            return this.j;
        }

        @VisibleForTesting
        h d() {
            return this.h;
        }

        private static long e(com.google.firebase.perf.config.a a0, @s2.a String s) {
            return s == "Trace" ? a0.G() : a0.r();
        }

        private static long f(com.google.firebase.perf.config.a a0, @s2.a String s) {
            return a0.u();
        }

        private static long g(com.google.firebase.perf.config.a a0, @s2.a String s) {
            return s == "Trace" ? a0.H() : a0.s();
        }

        private static long h(com.google.firebase.perf.config.a a0, @s2.a String s) {
            return a0.u();
        }

        @VisibleForTesting
        long i() {
            return this.i;
        }

        @VisibleForTesting
        h j() {
            return this.g;
        }

        @VisibleForTesting
        h k() {
            return this.d;
        }

        @VisibleForTesting
        void l(h h0) {
            this.d = h0;
        }

        private void m(com.google.firebase.perf.config.a a0, @s2.a String s, boolean z) {
            long v = a.h(a0, s);
            long v1 = a.g(a0, s);
            TimeUnit timeUnit0 = TimeUnit.SECONDS;
            h h0 = new h(v1, v, timeUnit0);
            this.g = h0;
            this.i = v1;
            if(z) {
                a.k.b("Foreground %s logging rate:%f, burst capacity:%d", new Object[]{s, h0, v1});
            }
            long v2 = a.f(a0, s);
            long v3 = a.e(a0, s);
            h h1 = new h(v3, v2, timeUnit0);
            this.h = h1;
            this.j = v3;
            if(z) {
                a.k.b("Background %s logging rate:%f, capacity:%d", new Object[]{s, h1, v3});
            }
        }
    }

    private final com.google.firebase.perf.config.a a;
    private final double b;
    private final double c;
    private a d;
    private a e;
    private boolean f;

    public d(@NonNull Context context0, h h0, long v) {
        this(h0, v, new com.google.firebase.perf.util.a(), d.e(), d.e(), com.google.firebase.perf.config.a.h());
        this.f = m.c(context0);
    }

    d(h h0, long v, com.google.firebase.perf.util.a a0, double f, double f1, com.google.firebase.perf.config.a a1) {
        this.d = null;
        this.e = null;
        boolean z = false;
        this.f = false;
        m.b(0.0 <= f && f < 1.0, "Sampling bucket ID should be in range [0.0, 1.0).");
        if(0.0 <= f1 && f1 < 1.0) {
            z = true;
        }
        m.b(z, "Fragment sampling bucket ID should be in range [0.0, 1.0).");
        this.b = f;
        this.c = f1;
        this.a = a1;
        this.d = new a(h0, v, a0, a1, "Trace", false);
        this.e = new a(h0, v, a0, a1, "Network", false);
    }

    void a(boolean z) {
        this.d.a(z);
        this.e.a(z);
    }

    @VisibleForTesting
    boolean b() {
        return this.g();
    }

    @VisibleForTesting
    boolean c() {
        return this.h();
    }

    @VisibleForTesting
    boolean d() {
        return this.i();
    }

    @VisibleForTesting
    static double e() {
        return new Random().nextDouble();
    }

    private boolean f(List list0) {
        return list0.size() > 0 && ((u)list0.get(0)).ra() > 0 && ((u)list0.get(0)).Ha(0) == w.c;
    }

    private boolean g() {
        double f = this.a.g();
        return this.c < f;
    }

    private boolean h() {
        double f = this.a.t();
        return this.b < f;
    }

    private boolean i() {
        double f = this.a.I();
        return this.b < f;
    }

    boolean j(s s0) {
        if(!this.m(s0)) {
            return false;
        }
        if(s0.s7()) {
            return !this.e.b(s0);
        }
        return s0.t9() ? !this.d.b(s0) : true;
    }

    // 去混淆评级： 低(30)
    boolean k(s s0) {
        if(s0.t9() && !this.i() && !this.f(s0.y9().Z0())) {
            return false;
        }
        return !this.l(s0) || this.g() || this.f(s0.y9().Z0()) ? !s0.s7() || this.h() || this.f(s0.s2().Z0()) : false;
    }

    // 去混淆评级： 中等(60)
    protected boolean l(s s0) {
        return s0.t9() && false && s0.y9().K("Hosting_activity");
    }

    // 去混淆评级： 中等(140)
    boolean m(@NonNull s s0) {
        return !s0.t9() || true || s0.y9().U4() <= 0 ? !s0.e6() : false;
    }
}

