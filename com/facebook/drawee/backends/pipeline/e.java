package com.facebook.drawee.backends.pipeline;

import S0.g;
import S0.o;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.facebook.common.internal.i;
import com.facebook.common.internal.l;
import com.facebook.common.internal.q;
import com.facebook.common.time.AwakeTimeSinceBootClock;
import com.facebook.drawee.backends.pipeline.info.d;
import com.facebook.drawee.drawable.s;
import com.facebook.imagepipeline.cache.B;
import com.facebook.imagepipeline.systrace.b;
import f1.f;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import k1.n.a;
import k1.n;
import o3.h;

@n(a.a)
public class e extends com.facebook.drawee.controller.a {
    private final Resources B;
    private final c1.a C;
    @h
    private final i D;
    @h
    private final B E;
    private com.facebook.cache.common.e F;
    private q G;
    private boolean H;
    @h
    private i I;
    @h
    private com.facebook.drawee.backends.pipeline.info.h J;
    @h
    @p3.a("this")
    private Set K;
    @h
    @p3.a("this")
    private d L;
    @h
    private com.facebook.imagepipeline.request.d M;
    @h
    private com.facebook.imagepipeline.request.d[] N;
    @h
    private com.facebook.imagepipeline.request.d O;
    private static final Class P;

    static {
        e.P = e.class;
    }

    public e(Resources resources0, com.facebook.drawee.components.a a0, @h c1.a a1, @h c1.a a2, Executor executor0, @h B b0, @h i i0) {
        super(a0, executor0, null, null);
        this.B = resources0;
        this.C = new com.facebook.drawee.backends.pipeline.a(resources0, a1, a2);
        this.D = i0;
        this.E = b0;
    }

    @Override  // com.facebook.drawee.controller.a
    protected int A(@h Object object0) {
        return this.v0(((com.facebook.common.references.a)object0));
    }

    public void A0(q q0, String s, com.facebook.cache.common.e e0, Object object0, @h i i0) {
        if(b.e()) {
            b.a("PipelineDraweeController#initialize");
        }
        super.H(s, object0);
        this.z0(q0);
        this.F = e0;
        this.J0(i0);
        this.D0(null);
        if(b.e()) {
            b.c();
        }
    }

    @Override  // com.facebook.drawee.controller.a
    protected Object B(Object object0) {
        return this.w0(((com.facebook.common.references.a)object0));
    }

    protected void B0(@h g g0, com.facebook.drawee.controller.b b0) {
        synchronized(this) {
            com.facebook.drawee.backends.pipeline.info.h h0 = this.J;
            if(h0 != null) {
                h0.g();
            }
            if(g0 != null) {
                if(this.J == null) {
                    this.J = new com.facebook.drawee.backends.pipeline.info.h(AwakeTimeSinceBootClock.get(), this);
                }
                this.J.c(g0);
                this.J.h(true);
            }
            this.M = (com.facebook.imagepipeline.request.d)b0.t();
            this.N = (com.facebook.imagepipeline.request.d[])b0.s();
            this.O = (com.facebook.imagepipeline.request.d)b0.v();
        }
    }

    @h
    private Drawable C0(@h i i0, com.facebook.imagepipeline.image.e e0) {
        if(i0 == null) {
            return null;
        }
        for(Object object0: i0) {
            c1.a a0 = (c1.a)object0;
            if(a0.c(e0)) {
                Drawable drawable0 = a0.b(e0);
                if(drawable0 != null) {
                    return drawable0;
                }
                if(false) {
                    break;
                }
            }
        }
        return null;
    }

    @Override  // com.facebook.drawee.controller.a
    @h
    protected Uri D() {
        return o.a(this.M, this.O, this.N, com.facebook.imagepipeline.request.d.A);
    }

    private void D0(@h com.facebook.imagepipeline.image.e e0) {
        if(!this.H) {
            return;
        }
        if(this.u() == null) {
            com.facebook.drawee.debug.a a0 = new com.facebook.drawee.debug.a();
            this.n(new D0.a(a0));
            this.e0(a0);
        }
        if(this.u() instanceof com.facebook.drawee.debug.a) {
            this.L0(e0, ((com.facebook.drawee.debug.a)this.u()));
        }
    }

    @h
    public Map E0(com.facebook.imagepipeline.image.o o0) {
        return o0 == null ? null : o0.getExtras();
    }

    protected void F0(String s, com.facebook.common.references.a a0) {
        super.Q(s, a0);
        synchronized(this) {
            d d0 = this.L;
            if(d0 != null) {
                d0.a(s, 6, true, "PipelineDraweeController");
            }
        }
    }

    protected void G0(@h com.facebook.common.references.a a0) {
        com.facebook.common.references.a.j(a0);
    }

    public void H0(d d0) {
        synchronized(this) {
            d d1 = this.L;
            if(d1 instanceof com.facebook.drawee.backends.pipeline.info.a) {
                ((com.facebook.drawee.backends.pipeline.info.a)d1).c(d0);
                return;
            }
            if(d1 == d0) {
                this.L = null;
            }
        }
    }

    public void I0(f f0) {
        synchronized(this) {
            Set set0 = this.K;
            if(set0 == null) {
                return;
            }
            set0.remove(f0);
        }
    }

    public void J0(@h i i0) {
        this.I = i0;
    }

    public void K0(boolean z) {
        this.H = z;
    }

    protected void L0(@h com.facebook.imagepipeline.image.e e0, com.facebook.drawee.debug.a a0) {
        a0.k(this.y());
        E0.b b0 = this.e();
        com.facebook.drawee.drawable.t.d t$d0 = null;
        if(b0 != null) {
            s s0 = e.q0(b0.b());
            if(s0 != null) {
                t$d0 = s0.K();
            }
        }
        a0.s(t$d0);
        String s1 = this.t0();
        if(s1 != null) {
            a0.b("cc", s1);
        }
        if(e0 != null) {
            a0.l(e0.getWidth(), e0.getHeight());
            a0.p(e0.z());
            return;
        }
        a0.i();
    }

    @Override  // com.facebook.drawee.controller.a
    @h
    public Map O(Object object0) {
        return this.E0(((com.facebook.imagepipeline.image.o)object0));
    }

    @Override  // com.facebook.drawee.controller.a
    protected void Q(String s, Object object0) {
        this.F0(s, ((com.facebook.common.references.a)object0));
    }

    @Override  // com.facebook.drawee.controller.a
    protected void T(@h Drawable drawable0) {
        if(drawable0 instanceof B0.a) {
            ((B0.a)drawable0).c();
        }
    }

    @Override  // com.facebook.drawee.controller.a
    protected void V(@h Object object0) {
        this.G0(((com.facebook.common.references.a)object0));
    }

    @Override  // com.facebook.drawee.controller.a
    public void d(@h E0.b b0) {
        super.d(b0);
        this.D0(null);
    }

    @Override  // E0.a
    public boolean i(@h E0.a a0) {
        return this.F == null || !(a0 instanceof e) ? false : l.a(this.F, ((e)a0).r0());
    }

    public void o0(f f0) {
        synchronized(this) {
            if(this.K == null) {
                this.K = new HashSet();
            }
            this.K.add(f0);
        }
    }

    @Override  // com.facebook.drawee.controller.a
    protected Drawable p(Object object0) {
        return this.p0(((com.facebook.common.references.a)object0));
    }

    protected Drawable p0(com.facebook.common.references.a a0) {
        Drawable drawable2;
        Drawable drawable1;
        Drawable drawable0;
        try {
            if(b.e()) {
                b.a("PipelineDraweeController#createDrawable");
            }
            com.facebook.common.internal.n.o(com.facebook.common.references.a.s(a0));
            com.facebook.imagepipeline.image.e e0 = (com.facebook.imagepipeline.image.e)a0.n();
            this.D0(e0);
            drawable0 = this.C0(this.I, e0);
            if(drawable0 == null) {
                drawable1 = this.C0(this.D, e0);
                if(drawable1 == null) {
                    drawable2 = this.C.b(e0);
                    if(drawable2 == null) {
                        throw new UnsupportedOperationException("Unrecognized image class: " + e0);
                    }
                    goto label_16;
                }
                goto label_19;
            }
            goto label_22;
        }
        catch(Throwable throwable0) {
        }
        if(b.e()) {
            b.c();
        }
        throw throwable0;
    label_16:
        if(b.e()) {
            b.c();
        }
        return drawable2;
    label_19:
        if(b.e()) {
            b.c();
        }
        return drawable1;
    label_22:
        if(b.e()) {
            b.c();
        }
        return drawable0;
    }

    @Override  // com.facebook.drawee.controller.a
    @h
    protected Object q() {
        return this.s0();
    }

    @h
    public static s q0(@h Drawable drawable0) {
        if(drawable0 == null) {
            return null;
        }
        if(drawable0 instanceof s) {
            return (s)drawable0;
        }
        if(drawable0 instanceof com.facebook.drawee.drawable.d) {
            return e.q0(((com.facebook.drawee.drawable.d)drawable0).o());
        }
        if(drawable0 instanceof com.facebook.drawee.drawable.a) {
            int v = ((com.facebook.drawee.drawable.a)drawable0).d();
            for(int v1 = 0; v1 < v; ++v1) {
                s s0 = e.q0(((com.facebook.drawee.drawable.a)drawable0).b(v1));
                if(s0 != null) {
                    return s0;
                }
            }
        }
        return null;
    }

    protected com.facebook.cache.common.e r0() {
        return this.F;
    }

    @h
    protected com.facebook.common.references.a s0() {
        com.facebook.common.references.a a0;
        if(b.e()) {
            b.a("PipelineDraweeController#getCachedImage");
        }
        B b0 = this.E;
        if(b0 != null) {
            com.facebook.cache.common.e e0 = this.F;
            if(e0 != null) {
                try {
                    a0 = b0.get(e0);
                    if(a0 != null && !((com.facebook.imagepipeline.image.e)a0.n()).I().a()) {
                        a0.close();
                        goto label_14;
                    }
                    goto label_17;
                }
                catch(Throwable throwable0) {
                    if(b.e()) {
                        b.c();
                    }
                    throw throwable0;
                }
            label_14:
                if(b.e()) {
                    b.c();
                }
                return null;
            label_17:
                if(b.e()) {
                    b.c();
                }
                return a0;
            }
        }
        if(b.e()) {
            b.c();
        }
        return null;
    }

    @h
    protected String t0() {
        Object object0 = this.r();
        return object0 == null ? null : object0.toString();
    }

    @Override  // com.facebook.drawee.controller.a
    public String toString() {
        return l.e(this).f("super", super.toString()).f("dataSourceSupplier", this.G).toString();
    }

    protected q u0() {
        return this.G;
    }

    @Override  // com.facebook.drawee.controller.a
    protected com.facebook.datasource.d v() {
        if(b.e()) {
            b.a("PipelineDraweeController#getDataSource");
        }
        if(x0.a.R(2)) {
            x0.a.V(e.P, "controller %x: getDataSource", System.identityHashCode(this));
        }
        com.facebook.datasource.d d0 = (com.facebook.datasource.d)this.G.get();
        if(b.e()) {
            b.c();
        }
        return d0;
    }

    protected int v0(@h com.facebook.common.references.a a0) {
        return a0 == null ? 0 : a0.p();
    }

    protected com.facebook.imagepipeline.image.o w0(com.facebook.common.references.a a0) {
        com.facebook.common.internal.n.o(com.facebook.common.references.a.s(a0));
        return ((com.facebook.imagepipeline.image.e)a0.n()).D1();
    }

    @h
    public f x0() {
        synchronized(this) {
            f f0 = this.L == null ? null : new com.facebook.drawee.backends.pipeline.info.e(this.y(), this.L);
            Set set0 = this.K;
            if(set0 != null) {
                f f1 = new f1.d(set0);
                if(f0 != null) {
                    ((f1.d)f1).l(f0);
                }
                return f1;
            }
            return f0;
        }
    }

    protected Resources y0() {
        return this.B;
    }

    private void z0(q q0) {
        this.G = q0;
        this.D0(null);
    }
}

