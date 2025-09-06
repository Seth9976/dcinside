package com.google.common.math;

import J1.c;
import J1.d;
import com.google.common.base.H;

@c
@d
@e
public final class k {
    private final o a;
    private final o b;
    private double c;

    public k() {
        this.a = new o();
        this.b = new o();
        this.c = 0.0;
    }

    public void a(double f, double f1) {
        this.a.a(f);
        if(!com.google.common.primitives.d.n(f) || !com.google.common.primitives.d.n(f1)) {
            this.c = NaN;
        }
        else if(this.a.j() > 1L) {
            this.c += (f - this.a.l()) * (f1 - this.b.l());
        }
        this.b.a(f1);
    }

    public void b(j j0) {
        if(j0.a() == 0L) {
            return;
        }
        this.a.b(j0.k());
        if(this.b.j() == 0L) {
            this.c = j0.i();
        }
        else {
            this.c += j0.i() + (j0.k().d() - this.a.l()) * (j0.l().d() - this.b.l()) * ((double)j0.a());
        }
        this.b.b(j0.l());
    }

    public long c() {
        return this.a.j();
    }

    private static double d(double f) {
        return com.google.common.primitives.d.f(f, -1.0, 1.0);
    }

    private double e(double f) {
        return f > 0.0 ? f : 4.900000E-324;
    }

    public final g f() {
        boolean z = false;
        H.g0(this.c() > 1L);
        if(Double.isNaN(this.c)) {
            return g.a();
        }
        double f = this.a.u();
        if(f > 0.0) {
            return this.b.u() > 0.0 ? g.f(this.a.l(), this.b.l()).b(this.c / f) : g.b(this.b.l());
        }
        if(this.b.u() > 0.0) {
            z = true;
        }
        H.g0(z);
        return g.i(this.a.l());
    }

    public final double g() {
        boolean z = false;
        H.g0(this.c() > 1L);
        if(Double.isNaN(this.c)) {
            return NaN;
        }
        double f = this.a.u();
        double f1 = this.b.u();
        H.g0(f > 0.0);
        if(f1 > 0.0) {
            z = true;
        }
        H.g0(z);
        return k.d(this.c / Math.sqrt(this.e(f * f1)));
    }

    public double h() {
        H.g0(this.c() != 0L);
        return this.c / ((double)this.c());
    }

    public final double i() {
        H.g0(this.c() > 1L);
        return this.c / ((double)(this.c() - 1L));
    }

    public j j() {
        return new j(this.a.s(), this.b.s(), this.c);
    }

    public n k() {
        return this.a.s();
    }

    public n l() {
        return this.b.s();
    }
}

