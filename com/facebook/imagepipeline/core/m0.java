package com.facebook.imagepipeline.core;

import android.content.ContentResolver;
import android.content.Context;
import android.os.Build.VERSION;
import com.facebook.common.internal.l;
import com.facebook.common.internal.q;
import com.facebook.common.memory.j;
import com.facebook.common.memory.m;
import com.facebook.imagepipeline.bitmaps.e;
import com.facebook.imagepipeline.cache.B;
import com.facebook.imagepipeline.cache.v;
import com.facebook.imagepipeline.cache.w;
import com.facebook.imagepipeline.cache.y;
import com.facebook.imagepipeline.producers.C;
import com.facebook.imagepipeline.producers.Z;
import com.facebook.imagepipeline.producers.u0;
import com.facebook.imagepipeline.producers.v0;
import com.facebook.imagepipeline.systrace.b;
import com.facebook.imagepipeline.transcoder.d;
import com.facebook.imagepipeline.transcoder.f;
import java.util.Set;
import k1.n.a;
import k1.n;
import o3.h;
import p3.c;

@n(a.a)
@c
public class m0 {
    private final u0 a;
    private final z b;
    private final com.facebook.imagepipeline.core.a c;
    private final q d;
    @h
    private com.facebook.imagepipeline.cache.q e;
    @h
    private y f;
    @h
    private com.facebook.imagepipeline.cache.q g;
    @h
    private y h;
    @h
    private com.facebook.imagepipeline.decoder.c i;
    @h
    private d j;
    @h
    private s0 k;
    @h
    private L0 l;
    @h
    private e m;
    @h
    private com.facebook.imagepipeline.platform.d n;
    @h
    private com.facebook.imagepipeline.animated.factory.a o;
    private static final Class p;
    @h
    private static m0 q;
    private static x r;
    private static boolean s;

    static {
        m0.p = m0.class;
    }

    public m0(z z0) {
        if(b.e()) {
            b.a("ImagePipelineConfig()");
        }
        z z1 = (z)com.facebook.common.internal.n.i(z0);
        this.b = z1;
        C c0 = z1.q().H() ? new C(z0.L().a()) : new v0(z0.L().a());
        this.a = c0;
        this.c = new com.facebook.imagepipeline.core.a(z0.l());
        if(b.e()) {
            b.c();
        }
        this.d = z1.D();
        if(z1.q().B()) {
            X0.e.g().i(true);
        }
    }

    private x a() {
        L0 l00 = this.r();
        Set set0 = this.b.t();
        Set set1 = this.b.a();
        q q0 = this.b.n();
        y y0 = this.f();
        y y1 = this.j();
        com.facebook.imagepipeline.cache.n n0 = this.b.F();
        q q1 = this.b.q().u();
        q q2 = this.b.q().J();
        s0.a a0 = this.b.K();
        return new x(l00, set0, set1, q0, y0, y1, this.d, n0, this.a, q1, q2, a0, this.b);
    }

    public static void b() {
        synchronized(m0.class) {
            m0.s = true;
        }
    }

    @h
    public c1.a c(@h Context context0) {
        com.facebook.imagepipeline.animated.factory.a a0 = this.d();
        return a0 == null ? null : a0.a(context0);
    }

    @h
    private com.facebook.imagepipeline.animated.factory.a d() {
        if(this.o == null) {
            this.o = com.facebook.imagepipeline.animated.factory.b.a(this.o(), this.b.L(), this.e(), this.b.q().j(), this.b.q().w(), this.b.q().c(), this.b.q().d(), this.b.x());
        }
        return this.o;
    }

    public com.facebook.imagepipeline.cache.q e() {
        if(this.e == null) {
            this.e = this.b.E().a(this.b.B(), this.b.p(), this.b.v(), this.b.q().s(), this.b.q().r(), this.b.g());
        }
        return this.e;
    }

    public y f() {
        if(this.f == null) {
            this.f = com.facebook.imagepipeline.cache.z.a(this.e(), this.b.m());
        }
        return this.f;
    }

    public com.facebook.imagepipeline.core.a g() {
        return this.c;
    }

    public q h() {
        return this.d;
    }

    public com.facebook.imagepipeline.cache.q i() {
        if(this.g == null) {
            this.g = v.a(this.b.j(), this.b.p(), this.b.u());
        }
        return this.g;
    }

    public y j() {
        if(this.h == null) {
            B b0 = this.b.c() == null ? this.i() : this.b.c();
            this.h = w.a(b0, this.b.m());
        }
        return this.h;
    }

    private com.facebook.imagepipeline.decoder.c k() {
        com.facebook.imagepipeline.decoder.c c2;
        com.facebook.imagepipeline.decoder.c c1;
        if(this.i == null) {
            if(this.b.i() != null) {
                this.i = this.b.i();
                return this.i;
            }
            com.facebook.imagepipeline.animated.factory.a a0 = this.d();
            if(a0 == null) {
                c2 = null;
                c1 = null;
            }
            else {
                com.facebook.imagepipeline.decoder.c c0 = a0.c();
                c1 = a0.b();
                c2 = c0;
            }
            com.facebook.imagepipeline.decoder.c c3 = this.t();
            if(this.b.A() == null) {
                this.i = new com.facebook.imagepipeline.decoder.b(c2, c1, c3, this.p());
                return this.i;
            }
            this.i = new com.facebook.imagepipeline.decoder.b(c2, c1, c3, this.p(), this.b.A().a());
            X0.e.g().j(this.b.A().b());
        }
        return this.i;
    }

    public x l() {
        if(m0.r == null) {
            m0.r = this.a();
        }
        return m0.r;
    }

    private d m() {
        if(this.j == null) {
            if(this.b.z() == null && this.b.y() == null && this.b.q().K()) {
                this.j = new com.facebook.imagepipeline.transcoder.h(this.b.q().m());
                return this.j;
            }
            this.j = new f(this.b.q().m(), this.b.q().y(), this.b.z(), this.b.y(), this.b.q().G());
        }
        return this.j;
    }

    public static m0 n() {
        return (m0)com.facebook.common.internal.n.j(m0.q, "ImagePipelineFactory was not initialized!");
    }

    public e o() {
        if(this.m == null) {
            this.m = com.facebook.imagepipeline.bitmaps.f.a(this.b.k(), this.p(), this.g());
        }
        return this.m;
    }

    public com.facebook.imagepipeline.platform.d p() {
        if(this.n == null) {
            this.n = com.facebook.imagepipeline.platform.e.b(this.b.k(), this.b.q().I(), this.b.q().t(), this.b.q().o());
        }
        return this.n;
    }

    private s0 q() {
        if(this.k == null) {
            com.facebook.imagepipeline.core.l0.d l0$d0 = this.b.q().q();
            Context context0 = this.b.getContext();
            com.facebook.common.memory.a a0 = this.b.k().l();
            com.facebook.imagepipeline.decoder.c c0 = this.k();
            com.facebook.imagepipeline.decoder.f f0 = this.b.e();
            com.facebook.imagepipeline.core.n n0 = this.b.J();
            boolean z = this.b.G();
            boolean z1 = this.b.q().C();
            p p0 = this.b.L();
            j j0 = this.b.k().i(this.b.C());
            m m0 = this.b.k().j();
            y y0 = this.f();
            y y1 = this.j();
            com.facebook.imagepipeline.cache.n n1 = this.b.F();
            e e0 = this.o();
            int v = this.b.q().g();
            int v1 = this.b.q().f();
            boolean z2 = this.b.q().e();
            int v2 = this.b.q().m();
            boolean z3 = this.b.q().l();
            int v3 = this.b.q().v();
            this.k = l0$d0.a(context0, a0, c0, f0, n0, z, z1, p0, j0, m0, y0, y1, this.d, n1, e0, v, v1, z2, v2, this.g(), z3, v3);
        }
        return this.k;
    }

    private L0 r() {
        boolean z = Build.VERSION.SDK_INT >= 24 && this.b.q().x();
        if(this.l == null) {
            ContentResolver contentResolver0 = this.b.getContext().getApplicationContext().getContentResolver();
            s0 s00 = this.q();
            Z z1 = this.b.r();
            boolean z2 = this.b.G();
            boolean z3 = this.b.q().M();
            com.facebook.imagepipeline.core.n n0 = this.b.J();
            boolean z4 = this.b.q().L();
            boolean z5 = this.b.h();
            d d0 = this.m();
            boolean z6 = this.b.q().F();
            boolean z7 = this.b.q().D();
            boolean z8 = this.b.q().a();
            Set set0 = this.b.H();
            this.l = new L0(contentResolver0, s00, z1, z2, z3, this.a, n0, z, z4, z5, d0, z6, z7, z8, set0);
        }
        return this.l;
    }

    @h
    public c1.a s() {
        return this.b.q().B() ? new i1.a() : null;
    }

    @h
    public com.facebook.imagepipeline.decoder.c t() {
        return this.b.q().B() ? new i1.b(this.b.getContext().getApplicationContext().getResources()) : null;
    }

    public static boolean u() {
        synchronized(m0.class) {
        }
        return m0.q != null;
    }

    public static void v(Context context0) {
        synchronized(m0.class) {
            if(b.e()) {
                b.a("ImagePipelineFactory#initialize");
            }
            m0.w(com.facebook.imagepipeline.core.y.R(context0).a());
            if(b.e()) {
                b.c();
            }
        }
    }

    public static void w(z z0) {
        synchronized(m0.class) {
            if(m0.q != null) {
                x0.a.k0(m0.p, "ImagePipelineFactory has already been initialized! `ImagePipelineFactory.initialize(...)` should only be called once to avoid unexpected behavior.");
                if(m0.s) {
                    return;
                }
            }
            m0.q = new m0(z0);
        }
    }

    @h
    public String x() {
        com.facebook.common.internal.l.a l$a0 = l.f("ImagePipelineFactory");
        com.facebook.imagepipeline.cache.q q0 = this.e;
        if(q0 != null) {
            l$a0.f("bitmapCountingMemoryCache", q0.g());
        }
        com.facebook.imagepipeline.cache.q q1 = this.g;
        if(q1 != null) {
            l$a0.f("encodedCountingMemoryCache", q1.g());
        }
        return l$a0.toString();
    }

    public static void y(m0 m00) {
        m0.q = m00;
    }

    public static void z() {
        synchronized(m0.class) {
            m0 m00 = m0.q;
            if(m00 != null) {
                m00.f().i(com.facebook.common.internal.a.b());
                m0.q.j().i(com.facebook.common.internal.a.b());
                m0.q = null;
            }
        }
    }
}

