package com.facebook.drawee.controller;

import S0.r;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.MotionEvent;
import com.facebook.common.internal.j;
import com.facebook.common.internal.l;
import com.facebook.imagepipeline.systrace.b;
import java.util.Map;
import java.util.concurrent.Executor;
import jeb.synthetic.FIN;
import k1.n.a;
import k1.n;
import k1.v;
import o3.h;
import p3.c;

@n(a.a)
@c
public abstract class com.facebook.drawee.controller.a implements E0.a, com.facebook.drawee.components.a.a, com.facebook.drawee.gestures.a.a {
    static class com.facebook.drawee.controller.a.c extends f {
        public static com.facebook.drawee.controller.a.c o(d d0, d d1) {
            if(b.e()) {
                b.a("AbstractDraweeController#createInternal");
            }
            com.facebook.drawee.controller.a.c a$c0 = new com.facebook.drawee.controller.a.c();
            a$c0.g(d0);
            a$c0.g(d1);
            if(b.e()) {
                b.c();
            }
            return a$c0;
        }
    }

    private static final Class A;
    private final com.facebook.drawee.components.c a;
    private final com.facebook.drawee.components.a b;
    private final Executor c;
    @h
    private com.facebook.drawee.components.d d;
    @h
    private com.facebook.drawee.gestures.a e;
    @h
    private e f;
    @h
    protected d g;
    protected S0.d h;
    @h
    protected S0.n i;
    @h
    private E0.c j;
    @h
    private Drawable k;
    private String l;
    private Object m;
    private boolean n;
    private boolean o;
    private boolean p;
    private boolean q;
    private boolean r;
    @h
    private String s;
    @h
    private com.facebook.datasource.d t;
    @h
    private Object u;
    private boolean v;
    private boolean w;
    @h
    protected Drawable x;
    private static final Map y;
    private static final Map z;

    static {
        com.facebook.drawee.controller.a.y = j.of("component_tag", "drawee");
        com.facebook.drawee.controller.a.z = j.of("origin", "memory_bitmap", "origin_sub", "shortcut");
        com.facebook.drawee.controller.a.A = com.facebook.drawee.controller.a.class;
    }

    public com.facebook.drawee.controller.a(com.facebook.drawee.components.a a0, Executor executor0, String s, Object object0) {
        this.a = com.facebook.drawee.components.c.b();
        this.h = new S0.d();
        this.v = true;
        this.w = false;
        this.b = a0;
        this.c = executor0;
        this.G(s, object0);
    }

    protected int A(@h Object object0) {
        return System.identityHashCode(object0);
    }

    @h
    protected abstract Object B(Object arg1);

    @h
    protected S0.n C() {
        return this.i;
    }

    @h
    protected Uri D() {
        return null;
    }

    @v
    protected com.facebook.drawee.components.d E() {
        if(this.d == null) {
            this.d = new com.facebook.drawee.components.d();
        }
        return this.d;
    }

    private E0.c F() {
        E0.c c0 = this.j;
        if(c0 == null) {
            throw new IllegalStateException("mSettableDraweeHierarchy is null; Caller context: " + this.m);
        }
        return c0;
    }

    private void G(String s, Object object0) {
        synchronized(this) {
            if(b.e()) {
                b.a("AbstractDraweeController#init");
            }
            this.a.c(com.facebook.drawee.components.c.a.f);
            if(!this.v) {
                com.facebook.drawee.components.a a0 = this.b;
                if(a0 != null) {
                    a0.a(this);
                }
            }
            this.n = false;
            this.p = false;
            this.U();
            this.r = false;
            com.facebook.drawee.components.d d0 = this.d;
            if(d0 != null) {
                d0.a();
            }
            com.facebook.drawee.gestures.a a1 = this.e;
            if(a1 != null) {
                a1.a();
                this.e.f(this);
            }
            d d1 = this.g;
            if(d1 instanceof com.facebook.drawee.controller.a.c) {
                ((com.facebook.drawee.controller.a.c)d1).h();
            }
            else {
                this.g = null;
            }
            this.f = null;
            E0.c c0 = this.j;
            if(c0 != null) {
                c0.reset();
                this.j.c(null);
                this.j = null;
            }
            this.k = null;
            if(x0.a.R(2)) {
                x0.a.X(com.facebook.drawee.controller.a.A, "controller %x %s -> %s: initialize", System.identityHashCode(this), this.l, s);
            }
            this.l = s;
            this.m = object0;
            if(b.e()) {
                b.c();
            }
            if(this.i != null) {
                this.k0();
            }
        }
    }

    protected void H(String s, Object object0) {
        this.G(s, object0);
        this.v = false;
        this.w = false;
    }

    // 去混淆评级： 低(20)
    private boolean I(String s, com.facebook.datasource.d d0) {
        return d0 != null || this.t != null ? s.equals(this.l) && d0 == this.t && this.o : true;
    }

    protected boolean J() {
        return this.w;
    }

    private void K(String s, Throwable throwable0) {
        if(x0.a.R(2)) {
            x0.a.Y(com.facebook.drawee.controller.a.A, "controller %x %s: %s: failure: %s", System.identityHashCode(this), this.l, s, throwable0);
        }
    }

    private void L(String s, Object object0) {
        if(x0.a.R(2)) {
            Object[] arr_object = {System.identityHashCode(this), this.l, s, this.z(object0), this.A(object0)};
            x0.a.a0(com.facebook.drawee.controller.a.A, "controller %x %s: %s: image: %s %x", arr_object);
        }
    }

    private S0.b.a M(@h com.facebook.datasource.d d0, @h Object object0, @h Uri uri0) {
        return d0 == null ? this.N(null, this.O(object0), uri0) : this.N(d0.getExtras(), this.O(object0), uri0);
    }

    private S0.b.a N(@h Map map0, @h Map map1, @h Uri uri0) {
        String s1;
        PointF pointF0;
        E0.c c0 = this.j;
        if(c0 instanceof com.facebook.drawee.generic.a) {
            String s = String.valueOf(((com.facebook.drawee.generic.a)c0).n());
            pointF0 = ((com.facebook.drawee.generic.a)c0).m();
            s1 = s;
        }
        else {
            s1 = null;
            pointF0 = null;
        }
        Rect rect0 = this.w();
        return com.facebook.fresco.middleware.c.a(com.facebook.drawee.controller.a.y, com.facebook.drawee.controller.a.z, map0, null, rect0, s1, pointF0, map1, this.r(), this.J(), uri0);
    }

    @h
    public abstract Map O(Object arg1);

    private void P(String s, com.facebook.datasource.d d0, Throwable throwable0, boolean z) {
        if(b.e()) {
            b.a("AbstractDraweeController#onFailureInternal");
        }
        if(!this.I(s, d0)) {
            this.K("ignore_old_datasource @ onFailure", throwable0);
            d0.close();
            if(b.e()) {
                b.c();
            }
            return;
        }
        this.a.c((z ? com.facebook.drawee.components.c.a.m : com.facebook.drawee.components.c.a.n));
        if(z) {
            this.K("final_failed @ onFailure", throwable0);
            this.t = null;
            this.q = true;
            E0.c c0 = this.j;
            if(c0 != null) {
                if(this.r) {
                    Drawable drawable0 = this.x;
                    if(drawable0 != null) {
                        c0.f(drawable0, 1.0f, true);
                        goto label_24;
                    }
                    goto label_20;
                }
                else {
                label_20:
                    if(this.m0()) {
                        c0.a(throwable0);
                    }
                    else {
                        c0.d(throwable0);
                    }
                }
            }
        label_24:
            this.Y(throwable0, d0);
        }
        else {
            this.K("intermediate_failed @ onFailure", throwable0);
            this.Z(throwable0);
        }
        if(b.e()) {
            b.c();
        }
    }

    protected void Q(String s, Object object0) {
    }

    private void R(String s, com.facebook.datasource.d d0, @h Object object0, float f, boolean z, boolean z1, boolean z2) {
        int v;
        Drawable drawable0;
        try {
            if(b.e()) {
                b.a("AbstractDraweeController#onNewResultInternal");
            }
            if(!this.I(s, d0)) {
                this.L("ignore_old_datasource @ onNewResult", object0);
                this.V(object0);
                d0.close();
                goto label_6;
            }
            goto label_9;
        }
        catch(Throwable throwable0) {
            goto label_46;
        }
    label_6:
        if(b.e()) {
            b.c();
        }
        return;
        try {
        label_9:
            this.a.c((z ? com.facebook.drawee.components.c.a.k : com.facebook.drawee.components.c.a.l));
            try {
                drawable0 = this.p(object0);
                goto label_19;
            }
            catch(Exception exception0) {
            }
            this.L("drawable_failed @ onNewResult", object0);
            this.V(object0);
            this.P(s, d0, exception0, z);
        }
        catch(Throwable throwable0) {
            goto label_46;
        }
        if(b.e()) {
            b.c();
        }
        return;
        try {
        label_19:
            v = FIN.finallyOpen$NT();
            Object object1 = this.u;
            Drawable drawable1 = this.x;
            this.u = object0;
            this.x = drawable0;
            if(z) {
                this.L("set_final_result @ onNewResult", object0);
                this.t = null;
                this.F().f(drawable0, 1.0f, z1);
                this.d0(s, object0, d0);
            }
            else if(z2) {
                this.L("set_temporary_result @ onNewResult", object0);
                this.F().f(drawable0, 1.0f, z1);
                this.d0(s, object0, d0);
            }
            else {
                this.L("set_intermediate_result @ onNewResult", object0);
                this.F().f(drawable0, f, z1);
                this.a0(s, object0);
            }
            FIN.finallyCodeBegin$NT(v);
            if(drawable1 != null && drawable1 != drawable0) {
                this.T(drawable1);
            }
            if(object1 != null && object1 != object0) {
                this.L("release_previous_result @ onNewResult", object1);
                this.V(object1);
            }
            goto label_49;
        }
        catch(Throwable throwable0) {
        }
    label_46:
        if(b.e()) {
            b.c();
        }
        throw throwable0;
    label_49:
        FIN.finallyCodeEnd$NT(v);
        if(b.e()) {
            b.c();
        }
    }

    private void S(String s, com.facebook.datasource.d d0, float f, boolean z) {
        if(!this.I(s, d0)) {
            this.K("ignore_old_datasource @ onProgress", null);
            d0.close();
            return;
        }
        if(!z) {
            this.j.e(f, false);
        }
    }

    protected abstract void T(@h Drawable arg1);

    private void U() {
        Map map1;
        boolean z = this.o;
        this.o = false;
        this.q = false;
        com.facebook.datasource.d d0 = this.t;
        Map map0 = null;
        if(d0 == null) {
            map1 = null;
        }
        else {
            map1 = d0.getExtras();
            this.t.close();
            this.t = null;
        }
        Drawable drawable0 = this.x;
        if(drawable0 != null) {
            this.T(drawable0);
        }
        if(this.s != null) {
            this.s = null;
        }
        this.x = null;
        Object object0 = this.u;
        if(object0 != null) {
            Map map2 = this.O(this.B(object0));
            this.L("release", this.u);
            this.V(this.u);
            this.u = null;
            map0 = map2;
        }
        if(z) {
            this.b0(map1, map0);
        }
    }

    protected abstract void V(@h Object arg1);

    public void W(d d0) {
        com.facebook.common.internal.n.i(d0);
        d d1 = this.g;
        if(d1 instanceof com.facebook.drawee.controller.a.c) {
            ((com.facebook.drawee.controller.a.c)d1).n(d0);
            return;
        }
        if(d1 == d0) {
            this.g = null;
        }
    }

    public void X(S0.b b0) {
        this.h.x(b0);
    }

    private void Y(Throwable throwable0, @h com.facebook.datasource.d d0) {
        S0.b.a b$a0 = this.M(d0, null, null);
        this.s().d(this.l, throwable0);
        this.t().b(this.l, throwable0, b$a0);
    }

    private void Z(Throwable throwable0) {
        this.s().f(this.l, throwable0);
        this.t().f(this.l);
    }

    @Override  // E0.a
    public void a() {
        if(b.e()) {
            b.a("AbstractDraweeController#onAttach");
        }
        if(x0.a.R(2)) {
            x0.a.X(com.facebook.drawee.controller.a.A, "controller %x %s: onAttach: %s", System.identityHashCode(this), this.l, (this.o ? "request already submitted" : "request needs submit"));
        }
        this.a.c(com.facebook.drawee.components.c.a.g);
        com.facebook.common.internal.n.i(this.j);
        this.b.a(this);
        this.n = true;
        if(!this.o) {
            this.n0();
        }
        if(b.e()) {
            b.c();
        }
    }

    private void a0(String s, @h Object object0) {
        Object object1 = this.B(object0);
        this.s().a(s, object1);
        this.t().a(s, object1);
    }

    @Override  // E0.a
    public void b(@h String s) {
        this.s = s;
    }

    private void b0(@h Map map0, @h Map map1) {
        this.s().b(this.l);
        this.t().c(this.l, this.N(map0, map1, null));
    }

    @Override  // E0.a
    public void c() {
        if(b.e()) {
            b.a("AbstractDraweeController#onDetach");
        }
        if(x0.a.R(2)) {
            x0.a.W(com.facebook.drawee.controller.a.A, "controller %x %s: onDetach", System.identityHashCode(this), this.l);
        }
        this.a.c(com.facebook.drawee.components.c.a.h);
        this.n = false;
        this.b.d(this);
        if(b.e()) {
            b.c();
        }
    }

    protected void c0(com.facebook.datasource.d d0, @h Object object0) {
        this.s().c(this.l, this.m);
        this.t().p(this.l, this.m, this.M(d0, object0, this.D()));
    }

    @Override  // E0.a
    public void d(@h E0.b b0) {
        if(x0.a.R(2)) {
            x0.a.X(com.facebook.drawee.controller.a.A, "controller %x %s: setHierarchy: %s", System.identityHashCode(this), this.l, b0);
        }
        this.a.c((b0 == null ? com.facebook.drawee.components.c.a.b : com.facebook.drawee.components.c.a.a));
        if(this.o) {
            this.b.a(this);
            this.release();
        }
        E0.c c0 = this.j;
        if(c0 != null) {
            c0.c(null);
            this.j = null;
        }
        if(b0 != null) {
            com.facebook.common.internal.n.d(Boolean.valueOf(b0 instanceof E0.c));
            this.j = (E0.c)b0;
            ((E0.c)b0).c(this.k);
        }
        if(this.i != null) {
            this.k0();
        }
    }

    private void d0(String s, @h Object object0, @h com.facebook.datasource.d d0) {
        Object object1 = this.B(object0);
        this.s().e(s, object1, this.g());
        this.t().e(s, object1, this.M(d0, object1, null));
    }

    @Override  // E0.a
    @h
    public E0.b e() {
        return this.j;
    }

    protected void e0(@h Drawable drawable0) {
        this.k = drawable0;
        E0.c c0 = this.j;
        if(c0 != null) {
            c0.c(drawable0);
        }
    }

    @Override  // E0.a
    public boolean f(MotionEvent motionEvent0) {
        if(x0.a.R(2)) {
            x0.a.X(com.facebook.drawee.controller.a.A, "controller %x %s: onTouchEvent %s", System.identityHashCode(this), this.l, motionEvent0);
        }
        com.facebook.drawee.gestures.a a0 = this.e;
        if(a0 == null) {
            return false;
        }
        if(!a0.b() && !this.l0()) {
            return false;
        }
        this.e.d(motionEvent0);
        return true;
    }

    public void f0(@h e e0) {
        this.f = e0;
    }

    // 去混淆评级： 低(20)
    @Override  // E0.a
    @h
    public Animatable g() {
        return this.x instanceof Animatable ? ((Animatable)this.x) : null;
    }

    protected void g0(@h com.facebook.drawee.gestures.a a0) {
        this.e = a0;
        if(a0 != null) {
            a0.f(this);
        }
    }

    @Override  // E0.a
    @h
    public String getContentDescription() {
        return this.s;
    }

    @Override  // E0.a
    public void h(boolean z) {
        e e0 = this.f;
        if(e0 != null) {
            if(z && !this.p) {
                e0.a(this.l);
            }
            else if(!z && this.p) {
                e0.b(this.l);
            }
        }
        this.p = z;
    }

    protected void h0(boolean z) {
        this.w = z;
    }

    public void i0(S0.n n0) {
        this.i = n0;
    }

    protected void j0(boolean z) {
        this.r = z;
    }

    private void k0() {
        class com.facebook.drawee.controller.a.a implements r {
            final com.facebook.drawee.controller.a a;

            @Override  // S0.r
            public void a() {
                com.facebook.drawee.controller.a a0 = com.facebook.drawee.controller.a.this;
                S0.n n0 = a0.i;
                if(n0 != null) {
                    n0.a(a0.l);
                }
            }

            @Override  // S0.r
            public void b() {
                com.facebook.drawee.controller.a a0 = com.facebook.drawee.controller.a.this;
                S0.n n0 = a0.i;
                if(n0 != null) {
                    n0.b(a0.l);
                }
            }

            @Override  // S0.r
            public void c() {
            }
        }

        E0.c c0 = this.j;
        if(c0 instanceof com.facebook.drawee.generic.a) {
            ((com.facebook.drawee.generic.a)c0).H(new com.facebook.drawee.controller.a.a(this));
        }
    }

    protected boolean l0() {
        return this.m0();
    }

    // 去混淆评级： 低(20)
    private boolean m0() {
        return this.q && (this.d != null && this.d.h());
    }

    public void n(d d0) {
        com.facebook.common.internal.n.i(d0);
        d d1 = this.g;
        if(d1 instanceof com.facebook.drawee.controller.a.c) {
            ((com.facebook.drawee.controller.a.c)d1).g(d0);
            return;
        }
        if(d1 != null) {
            this.g = com.facebook.drawee.controller.a.c.o(d1, d0);
            return;
        }
        this.g = d0;
    }

    protected void n0() {
        class com.facebook.drawee.controller.a.b extends com.facebook.datasource.c {
            final String a;
            final boolean b;
            final com.facebook.drawee.controller.a c;

            com.facebook.drawee.controller.a.b(String s, boolean z) {
                this.a = s;
                this.b = z;
                super();
            }

            @Override  // com.facebook.datasource.c
            public void b(com.facebook.datasource.d d0) {
                boolean z = d0.g();
                float f = d0.getProgress();
                com.facebook.drawee.controller.a.this.S(this.a, d0, f, z);
            }

            @Override  // com.facebook.datasource.c
            public void e(com.facebook.datasource.d d0) {
                Throwable throwable0 = d0.c();
                com.facebook.drawee.controller.a.this.P(this.a, d0, throwable0, true);
            }

            @Override  // com.facebook.datasource.c
            public void f(com.facebook.datasource.d d0) {
                boolean z = d0.g();
                boolean z1 = d0.e();
                float f = d0.getProgress();
                Object object0 = d0.getResult();
                if(object0 != null) {
                    com.facebook.drawee.controller.a.this.R(this.a, d0, object0, f, z, this.b, z1);
                    return;
                }
                if(z) {
                    com.facebook.drawee.controller.a.this.P(this.a, d0, new NullPointerException(), true);
                }
            }
        }

        if(b.e()) {
            b.a("AbstractDraweeController#submitRequest");
        }
        Object object0 = this.q();
        if(object0 != null) {
            if(b.e()) {
                b.a("AbstractDraweeController#submitRequest->cache");
            }
            this.t = null;
            this.o = true;
            this.q = false;
            this.a.c(com.facebook.drawee.components.c.a.x);
            this.c0(this.t, this.B(object0));
            this.Q(this.l, object0);
            this.R(this.l, this.t, object0, 1.0f, true, true, true);
            if(b.e()) {
                b.c();
            }
            if(b.e()) {
                b.c();
            }
            return;
        }
        this.a.c(com.facebook.drawee.components.c.a.j);
        this.j.e(0.0f, true);
        this.o = true;
        this.q = false;
        com.facebook.datasource.d d0 = this.v();
        this.t = d0;
        this.c0(d0, null);
        if(x0.a.R(2)) {
            x0.a.X(com.facebook.drawee.controller.a.A, "controller %x %s: submitRequest: dataSource: %x", System.identityHashCode(this), this.l, System.identityHashCode(this.t));
        }
        com.facebook.drawee.controller.a.b a$b0 = new com.facebook.drawee.controller.a.b(this, this.l, this.t.a());
        this.t.d(a$b0, this.c);
        if(b.e()) {
            b.c();
        }
    }

    public void o(S0.b b0) {
        this.h.t(b0);
    }

    @Override  // com.facebook.drawee.gestures.a$a
    public boolean onClick() {
        if(x0.a.R(2)) {
            x0.a.W(com.facebook.drawee.controller.a.A, "controller %x %s: onClick", System.identityHashCode(this), this.l);
        }
        if(this.m0()) {
            this.d.d();
            this.j.reset();
            this.n0();
            return true;
        }
        return false;
    }

    protected abstract Drawable p(Object arg1);

    @h
    protected Object q() {
        return null;
    }

    public Object r() {
        return this.m;
    }

    @Override  // com.facebook.drawee.components.a$a
    public void release() {
        this.a.c(com.facebook.drawee.components.c.a.i);
        com.facebook.drawee.components.d d0 = this.d;
        if(d0 != null) {
            d0.e();
        }
        com.facebook.drawee.gestures.a a0 = this.e;
        if(a0 != null) {
            a0.e();
        }
        E0.c c0 = this.j;
        if(c0 != null) {
            c0.reset();
        }
        this.U();
    }

    protected d s() {
        return this.g == null ? com.facebook.drawee.controller.c.g() : this.g;
    }

    protected S0.b t() {
        return this.h;
    }

    // 去混淆评级： 低(20)
    @Override
    public String toString() {
        return l.e(this).g("isAttached", this.n).g("isRequestSubmitted", this.o).g("hasFetchFailed", this.q).d("fetchedImage", this.A(this.u)).f("events", "[]").toString();
    }

    @h
    protected Drawable u() {
        return this.k;
    }

    protected abstract com.facebook.datasource.d v();

    @h
    private Rect w() {
        return this.j == null ? null : this.j.getBounds();
    }

    @h
    protected com.facebook.drawee.gestures.a x() {
        return this.e;
    }

    public String y() {
        return this.l;
    }

    protected String z(@h Object object0) {
        return object0 == null ? "<null>" : object0.getClass().getSimpleName();
    }
}

