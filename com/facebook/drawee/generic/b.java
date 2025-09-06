package com.facebook.drawee.generic;

import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import com.facebook.drawee.drawable.t.d;
import java.util.Arrays;
import java.util.List;
import k1.n.a;
import k1.n;
import o3.h;

@n(a.a)
public class b {
    private Resources a;
    private int b;
    private float c;
    @h
    private Drawable d;
    @h
    private d e;
    @h
    private Drawable f;
    @h
    private d g;
    @h
    private Drawable h;
    @h
    private d i;
    @h
    private Drawable j;
    @h
    private d k;
    @h
    private d l;
    @h
    private Matrix m;
    @h
    private PointF n;
    @h
    private ColorFilter o;
    @h
    private Drawable p;
    @h
    private List q;
    @h
    private Drawable r;
    @h
    private e s;
    public static final int t = 300;
    public static final d u;
    public static final d v;

    static {
        b.u = d.h;
        b.v = d.i;
    }

    public b(Resources resources0) {
        this.a = resources0;
        this.t();
    }

    public b A(float f) {
        this.c = f;
        return this;
    }

    public b B(int v) {
        this.b = v;
        return this;
    }

    public b C(int v) {
        this.h = this.a.getDrawable(v);
        return this;
    }

    public b D(int v, @h d t$d0) {
        this.h = this.a.getDrawable(v);
        this.i = t$d0;
        return this;
    }

    public b E(@h Drawable drawable0) {
        this.h = drawable0;
        return this;
    }

    public b F(Drawable drawable0, @h d t$d0) {
        this.h = drawable0;
        this.i = t$d0;
        return this;
    }

    public b G(@h d t$d0) {
        this.i = t$d0;
        return this;
    }

    public b H(@h Drawable drawable0) {
        if(drawable0 == null) {
            this.q = null;
            return this;
        }
        this.q = Arrays.asList(new Drawable[]{drawable0});
        return this;
    }

    public b I(@h List list0) {
        this.q = list0;
        return this;
    }

    public b J(int v) {
        this.d = this.a.getDrawable(v);
        return this;
    }

    public b K(int v, @h d t$d0) {
        this.d = this.a.getDrawable(v);
        this.e = t$d0;
        return this;
    }

    public b L(@h Drawable drawable0) {
        this.d = drawable0;
        return this;
    }

    public b M(Drawable drawable0, @h d t$d0) {
        this.d = drawable0;
        this.e = t$d0;
        return this;
    }

    public b N(@h d t$d0) {
        this.e = t$d0;
        return this;
    }

    public b O(@h Drawable drawable0) {
        if(drawable0 == null) {
            this.r = null;
            return this;
        }
        StateListDrawable stateListDrawable0 = new StateListDrawable();
        stateListDrawable0.addState(new int[]{0x10100A7}, drawable0);
        this.r = stateListDrawable0;
        return this;
    }

    public b P(int v) {
        this.j = this.a.getDrawable(v);
        return this;
    }

    public b Q(int v, @h d t$d0) {
        this.j = this.a.getDrawable(v);
        this.k = t$d0;
        return this;
    }

    public b R(@h Drawable drawable0) {
        this.j = drawable0;
        return this;
    }

    public b S(Drawable drawable0, @h d t$d0) {
        this.j = drawable0;
        this.k = t$d0;
        return this;
    }

    public b T(@h d t$d0) {
        this.k = t$d0;
        return this;
    }

    public b U(int v) {
        this.f = this.a.getDrawable(v);
        return this;
    }

    public b V(int v, @h d t$d0) {
        this.f = this.a.getDrawable(v);
        this.g = t$d0;
        return this;
    }

    public b W(@h Drawable drawable0) {
        this.f = drawable0;
        return this;
    }

    public b X(Drawable drawable0, @h d t$d0) {
        this.f = drawable0;
        this.g = t$d0;
        return this;
    }

    public b Y(@h d t$d0) {
        this.g = t$d0;
        return this;
    }

    public b Z(@h e e0) {
        this.s = e0;
        return this;
    }

    public com.facebook.drawee.generic.a a() {
        this.a0();
        return new com.facebook.drawee.generic.a(this);
    }

    private void a0() {
        List list0 = this.q;
        if(list0 != null) {
            for(Object object0: list0) {
                com.facebook.common.internal.n.i(((Drawable)object0));
            }
        }
    }

    @h
    public ColorFilter b() {
        return this.o;
    }

    @h
    public PointF c() {
        return this.n;
    }

    @h
    public d d() {
        return this.l;
    }

    @h
    public Drawable e() {
        return this.p;
    }

    public float f() {
        return this.c;
    }

    public int g() {
        return this.b;
    }

    @h
    public Drawable h() {
        return this.h;
    }

    @h
    public d i() {
        return this.i;
    }

    @h
    public List j() {
        return this.q;
    }

    @h
    public Drawable k() {
        return this.d;
    }

    @h
    public d l() {
        return this.e;
    }

    @h
    public Drawable m() {
        return this.r;
    }

    @h
    public Drawable n() {
        return this.j;
    }

    @h
    public d o() {
        return this.k;
    }

    public Resources p() {
        return this.a;
    }

    @h
    public Drawable q() {
        return this.f;
    }

    @h
    public d r() {
        return this.g;
    }

    @h
    public e s() {
        return this.s;
    }

    private void t() {
        this.b = 300;
        this.c = 0.0f;
        this.d = null;
        this.e = b.u;
        this.f = null;
        this.g = b.u;
        this.h = null;
        this.i = b.u;
        this.j = null;
        this.k = b.u;
        this.l = b.v;
        this.m = null;
        this.n = null;
        this.o = null;
        this.p = null;
        this.q = null;
        this.r = null;
        this.s = null;
    }

    public static b u(Resources resources0) {
        return new b(resources0);
    }

    public b v() {
        this.t();
        return this;
    }

    public b w(@h ColorFilter colorFilter0) {
        this.o = colorFilter0;
        return this;
    }

    public b x(@h PointF pointF0) {
        this.n = pointF0;
        return this;
    }

    public b y(@h d t$d0) {
        this.l = t$d0;
        this.m = null;
        return this;
    }

    public b z(@h Drawable drawable0) {
        this.p = drawable0;
        return this;
    }
}

