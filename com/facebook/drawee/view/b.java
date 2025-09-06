package com.facebook.drawee.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import com.facebook.common.internal.l;
import com.facebook.drawee.components.c;
import com.facebook.drawee.drawable.w;
import com.facebook.drawee.drawable.x;
import k1.n.a;
import k1.n;
import o3.h;

@n(a.a)
public class b implements x {
    private boolean a;
    private boolean b;
    private boolean c;
    @h
    private E0.b d;
    @h
    private E0.a e;
    private final c f;

    public b(@h E0.b b0) {
        this.a = false;
        this.b = false;
        this.c = true;
        this.e = null;
        this.f = c.b();
        if(b0 != null) {
            this.s(b0);
        }
    }

    private void a() {
        if(this.a) {
            return;
        }
        this.f.c(com.facebook.drawee.components.c.a.g);
        this.a = true;
        if(this.e != null && this.e.e() != null) {
            this.e.a();
        }
    }

    private void b() {
        if(this.b && this.c) {
            this.a();
            return;
        }
        this.d();
    }

    public static b c(@h E0.b b0, Context context0) {
        return new b(b0);
    }

    private void d() {
        if(!this.a) {
            return;
        }
        this.f.c(com.facebook.drawee.components.c.a.h);
        this.a = false;
        if(this.l()) {
            this.e.c();
        }
    }

    @h
    public E0.a e() {
        return this.e;
    }

    protected c f() {
        return this.f;
    }

    public E0.b g() {
        return (E0.b)com.facebook.common.internal.n.i(this.d);
    }

    @h
    public Drawable h() {
        return this.d == null ? null : this.d.b();
    }

    @Override  // com.facebook.drawee.drawable.x
    public void i(boolean z) {
        if(this.c == z) {
            return;
        }
        this.f.c((z ? com.facebook.drawee.components.c.a.q : com.facebook.drawee.components.c.a.r));
        this.c = z;
        this.b();
    }

    public boolean j() {
        return this.d != null;
    }

    public boolean k() {
        return this.b;
    }

    public boolean l() {
        return this.e != null && this.e.e() == this.d;
    }

    public void m() {
        this.f.c(com.facebook.drawee.components.c.a.o);
        this.b = true;
        this.b();
    }

    public void n() {
        this.f.c(com.facebook.drawee.components.c.a.p);
        this.b = false;
        this.b();
    }

    public boolean o(MotionEvent motionEvent0) {
        return this.l() ? this.e.f(motionEvent0) : false;
    }

    @Override  // com.facebook.drawee.drawable.x
    public void onDraw() {
        if(this.a) {
            return;
        }
        x0.a.m0(c.class, "%x: Draw requested for a non-attached controller %x. %s", new Object[]{System.identityHashCode(this), System.identityHashCode(this.e), this.toString()});
        this.b = true;
        this.c = true;
        this.b();
    }

    public void p(Context context0) {
    }

    public void q() {
        this.r(null);
    }

    public void r(@h E0.a a0) {
        boolean z = this.a;
        if(z) {
            this.d();
        }
        if(this.l()) {
            this.f.c(com.facebook.drawee.components.c.a.d);
            this.e.d(null);
        }
        this.e = a0;
        if(a0 == null) {
            this.f.c(com.facebook.drawee.components.c.a.e);
        }
        else {
            this.f.c(com.facebook.drawee.components.c.a.c);
            this.e.d(this.d);
        }
        if(z) {
            this.a();
        }
    }

    public void s(E0.b b0) {
        this.f.c(com.facebook.drawee.components.c.a.a);
        boolean z = this.l();
        this.t(null);
        E0.b b1 = (E0.b)com.facebook.common.internal.n.i(b0);
        this.d = b1;
        Drawable drawable0 = b1.b();
        this.i(drawable0 == null || drawable0.isVisible());
        this.t(this);
        if(z) {
            this.e.d(b0);
        }
    }

    private void t(@h x x0) {
        Drawable drawable0 = this.h();
        if(drawable0 instanceof w) {
            ((w)drawable0).t(x0);
        }
    }

    // 去混淆评级： 低(20)
    @Override
    public String toString() {
        return l.e(this).g("controllerAttached", this.a).g("holderAttached", this.b).g("drawableVisible", this.c).f("events", "[]").toString();
    }
}

