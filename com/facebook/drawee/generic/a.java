package com.facebook.drawee.generic;

import E0.c;
import S0.r;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import androidx.annotation.VisibleForTesting;
import com.facebook.common.internal.n;
import com.facebook.drawee.drawable.g;
import com.facebook.drawee.drawable.j;
import com.facebook.drawee.drawable.s;
import o3.h;

public class a implements c {
    private final Drawable a;
    private final Resources b;
    @h
    private e c;
    private final d d;
    private final g e;
    private final com.facebook.drawee.drawable.h f;
    private static final int g = 0;
    private static final int h = 1;
    private static final int i = 2;
    private static final int j = 3;
    private static final int k = 4;
    private static final int l = 5;
    private static final int m = 6;

    a(b b0) {
        ColorDrawable colorDrawable0 = new ColorDrawable(0);
        this.a = colorDrawable0;
        if(com.facebook.imagepipeline.systrace.b.e()) {
            com.facebook.imagepipeline.systrace.b.a("GenericDraweeHierarchy()");
        }
        this.b = b0.p();
        this.c = b0.s();
        com.facebook.drawee.drawable.h h0 = new com.facebook.drawee.drawable.h(colorDrawable0);
        this.f = h0;
        int v = 1;
        int v1 = b0.j() == null ? 1 : b0.j().size();
        if(v1 == 0) {
            v1 = 1;
        }
        int v2 = v1 + (b0.m() == null ? 0 : 1);
        Drawable[] arr_drawable = new Drawable[v2 + 6];
        arr_drawable[0] = this.h(b0.e(), null);
        arr_drawable[1] = this.h(b0.k(), b0.l());
        arr_drawable[2] = this.g(h0, b0.d(), b0.c(), b0.b());
        arr_drawable[3] = this.h(b0.n(), b0.o());
        arr_drawable[4] = this.h(b0.q(), b0.r());
        arr_drawable[5] = this.h(b0.h(), b0.i());
        if(v2 > 0) {
            if(b0.j() != null) {
                v = 0;
                for(Object object0: b0.j()) {
                    arr_drawable[v + 6] = this.h(((Drawable)object0), null);
                    ++v;
                }
            }
            if(b0.m() != null) {
                arr_drawable[v + 6] = this.h(b0.m(), null);
            }
        }
        g g0 = new g(arr_drawable, false, 2);
        this.e = g0;
        g0.F(b0.g());
        d d0 = new d(f.f(g0, this.c));
        this.d = d0;
        d0.mutate();
        this.w();
        if(com.facebook.imagepipeline.systrace.b.e()) {
            com.facebook.imagepipeline.systrace.b.c();
        }
    }

    public void A(@h Drawable drawable0) {
        this.B(0, drawable0);
    }

    private void B(int v, @h Drawable drawable0) {
        if(drawable0 == null) {
            this.e.e(v, null);
            return;
        }
        Drawable drawable1 = f.d(drawable0, this.c, this.b);
        this.p(v).a(drawable1);
    }

    public void C(int v) {
        this.e.F(v);
    }

    public void D(int v) {
        this.F(this.b.getDrawable(v));
    }

    public void E(int v, com.facebook.drawee.drawable.t.d t$d0) {
        this.G(this.b.getDrawable(v), t$d0);
    }

    public void F(@h Drawable drawable0) {
        this.B(5, drawable0);
    }

    public void G(Drawable drawable0, com.facebook.drawee.drawable.t.d t$d0) {
        this.B(5, drawable0);
        this.r(5).N(t$d0);
    }

    public void H(r r0) {
        this.e.E(r0);
    }

    public void I(int v, @h Drawable drawable0) {
        n.e(v >= 0 && v + 6 < this.e.d(), "The given index does not correspond to an overlay image.");
        this.B(v + 6, drawable0);
    }

    public void J(@h Drawable drawable0) {
        this.I(0, drawable0);
    }

    public void K(int v) {
        this.M(this.b.getDrawable(v));
    }

    public void L(int v, com.facebook.drawee.drawable.t.d t$d0) {
        this.N(this.b.getDrawable(v), t$d0);
    }

    public void M(@h Drawable drawable0) {
        this.B(1, drawable0);
    }

    public void N(Drawable drawable0, com.facebook.drawee.drawable.t.d t$d0) {
        this.B(1, drawable0);
        this.r(1).N(t$d0);
    }

    public void O(PointF pointF0) {
        n.i(pointF0);
        this.r(1).L(pointF0);
    }

    private void P(float f) {
        Drawable drawable0 = this.e.b(3);
        if(drawable0 == null) {
            return;
        }
        if(f >= 0.999f) {
            if(drawable0 instanceof Animatable) {
                ((Animatable)drawable0).stop();
            }
            this.k(3);
        }
        else {
            if(drawable0 instanceof Animatable) {
                ((Animatable)drawable0).start();
            }
            this.i(3);
        }
        drawable0.setLevel(Math.round(f * 10000.0f));
    }

    public void Q(int v) {
        this.S(this.b.getDrawable(v));
    }

    public void R(int v, com.facebook.drawee.drawable.t.d t$d0) {
        this.T(this.b.getDrawable(v), t$d0);
    }

    public void S(@h Drawable drawable0) {
        this.B(3, drawable0);
    }

    public void T(Drawable drawable0, com.facebook.drawee.drawable.t.d t$d0) {
        this.B(3, drawable0);
        this.r(3).N(t$d0);
    }

    public void U(int v) {
        this.W(this.b.getDrawable(v));
    }

    public void V(int v, com.facebook.drawee.drawable.t.d t$d0) {
        this.X(this.b.getDrawable(v), t$d0);
    }

    public void W(@h Drawable drawable0) {
        this.B(4, drawable0);
    }

    public void X(Drawable drawable0, com.facebook.drawee.drawable.t.d t$d0) {
        this.B(4, drawable0);
        this.r(4).N(t$d0);
    }

    public void Y(@h e e0) {
        this.c = e0;
        f.k(this.d, e0);
        for(int v = 0; v < this.e.d(); ++v) {
            f.j(this.p(v), this.c, this.b);
        }
    }

    @Override  // E0.c
    public void a(Throwable throwable0) {
        this.e.f();
        this.j();
        if(this.e.b(4) == null) {
            this.i(1);
        }
        else {
            this.i(4);
        }
        this.e.i();
    }

    @Override  // E0.b
    public Drawable b() {
        return this.d;
    }

    @Override  // E0.c
    public void c(@h Drawable drawable0) {
        this.d.A(drawable0);
    }

    @Override  // E0.c
    public void d(Throwable throwable0) {
        this.e.f();
        this.j();
        if(this.e.b(5) == null) {
            this.i(1);
        }
        else {
            this.i(5);
        }
        this.e.i();
    }

    @Override  // E0.c
    public void e(float f, boolean z) {
        if(this.e.b(3) == null) {
            return;
        }
        this.e.f();
        this.P(f);
        if(z) {
            this.e.r();
        }
        this.e.i();
    }

    @Override  // E0.c
    public void f(Drawable drawable0, float f, boolean z) {
        Drawable drawable1 = f.d(drawable0, this.c, this.b);
        drawable1.mutate();
        this.f.a(drawable1);
        this.e.f();
        this.j();
        this.i(2);
        this.P(f);
        if(z) {
            this.e.r();
        }
        this.e.i();
    }

    @h
    private Drawable g(Drawable drawable0, @h com.facebook.drawee.drawable.t.d t$d0, @h PointF pointF0, @h ColorFilter colorFilter0) {
        drawable0.setColorFilter(colorFilter0);
        return f.h(drawable0, t$d0, pointF0);
    }

    @Override  // E0.b
    public Rect getBounds() {
        return this.d.getBounds();
    }

    @h
    private Drawable h(@h Drawable drawable0, @h com.facebook.drawee.drawable.t.d t$d0) {
        return f.g(f.d(drawable0, this.c, this.b), t$d0);
    }

    private void i(int v) {
        if(v >= 0) {
            this.e.k(v);
        }
    }

    private void j() {
        this.k(1);
        this.k(2);
        this.k(3);
        this.k(4);
        this.k(5);
    }

    private void k(int v) {
        if(v >= 0) {
            this.e.m(v);
        }
    }

    public void l(RectF rectF0) {
        this.f.x(rectF0);
    }

    @h
    public PointF m() {
        return this.u(2) ? this.r(2).C() : null;
    }

    @h
    public com.facebook.drawee.drawable.t.d n() {
        return this.u(2) ? this.r(2).K() : null;
    }

    public int o() {
        return this.e.t();
    }

    private com.facebook.drawee.drawable.d p(int v) {
        com.facebook.drawee.drawable.d d0 = this.e.c(v);
        if(d0.o() instanceof j) {
            d0 = (j)d0.o();
        }
        return d0.o() instanceof s ? ((s)d0.o()) : d0;
    }

    @h
    public e q() {
        return this.c;
    }

    private s r(int v) {
        com.facebook.drawee.drawable.d d0 = this.p(v);
        return d0 instanceof s ? ((s)d0) : f.l(d0, com.facebook.drawee.drawable.t.d.a);
    }

    @Override  // E0.c
    public void reset() {
        this.v();
        this.w();
    }

    @VisibleForTesting
    public boolean s() {
        return this.f.o() != this.a;
    }

    public boolean t() {
        return this.e.b(1) != null;
    }

    private boolean u(int v) {
        return this.p(v) instanceof s;
    }

    private void v() {
        this.f.a(this.a);
    }

    private void w() {
        g g0 = this.e;
        if(g0 != null) {
            g0.f();
            this.e.j();
            this.j();
            this.i(1);
            this.e.r();
            this.e.i();
        }
    }

    public void x(@h ColorFilter colorFilter0) {
        this.f.setColorFilter(colorFilter0);
    }

    public void y(PointF pointF0) {
        n.i(pointF0);
        this.r(2).L(pointF0);
    }

    public void z(com.facebook.drawee.drawable.t.d t$d0) {
        n.i(t$d0);
        this.r(2).N(t$d0);
    }
}

