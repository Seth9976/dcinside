package com.google.common.math;

import J1.c;
import J1.d;
import com.google.common.base.H;
import java.util.Iterator;

@c
@d
@e
public final class o {
    private long a;
    private double b;
    private double c;
    private double d;
    private double e;

    public o() {
        this.a = 0L;
        this.b = 0.0;
        this.c = 0.0;
        this.d = NaN;
        this.e = NaN;
    }

    public void a(double f) {
        long v = this.a;
        if(v == 0L) {
            this.a = 1L;
            this.b = f;
            this.d = f;
            this.e = f;
            if(!com.google.common.primitives.d.n(f)) {
                this.c = NaN;
            }
        }
        else {
            this.a = v + 1L;
            if(!com.google.common.primitives.d.n(f) || !com.google.common.primitives.d.n(this.b)) {
                this.b = o.i(this.b, f);
                this.c = NaN;
            }
            else {
                double f1 = f - this.b;
                double f2 = this.b + f1 / ((double)this.a);
                this.b = f2;
                this.c += f1 * (f - f2);
            }
            this.d = Math.min(this.d, f);
            this.e = Math.max(this.e, f);
        }
    }

    public void b(n n0) {
        if(n0.a() == 0L) {
            return;
        }
        this.m(n0.a(), n0.d(), n0.x(), n0.j(), n0.c());
    }

    public void c(o o0) {
        if(o0.j() == 0L) {
            return;
        }
        this.m(o0.j(), o0.l(), o0.u(), o0.n(), o0.k());
    }

    public void d(Iterable iterable0) {
        for(Object object0: iterable0) {
            this.a(((Number)object0).doubleValue());
        }
    }

    public void e(Iterator iterator0) {
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            this.a(((Number)object0).doubleValue());
        }
    }

    public void f(double[] arr_f) {
        for(int v = 0; v < arr_f.length; ++v) {
            this.a(arr_f[v]);
        }
    }

    public void g(int[] arr_v) {
        for(int v = 0; v < arr_v.length; ++v) {
            this.a(((double)arr_v[v]));
        }
    }

    public void h(long[] arr_v) {
        for(int v = 0; v < arr_v.length; ++v) {
            this.a(((double)arr_v[v]));
        }
    }

    static double i(double f, double f1) {
        if(com.google.common.primitives.d.n(f)) {
            return f1;
        }
        return com.google.common.primitives.d.n(f1) || f == f1 ? f : NaN;
    }

    public long j() {
        return this.a;
    }

    public double k() {
        H.g0(this.a != 0L);
        return this.e;
    }

    public double l() {
        H.g0(this.a != 0L);
        return this.b;
    }

    private void m(long v, double f, double f1, double f2, double f3) {
        long v1 = this.a;
        if(v1 == 0L) {
            this.a = v;
            this.b = f;
            this.c = f1;
            this.d = f2;
            this.e = f3;
            return;
        }
        this.a = v1 + v;
        if(!com.google.common.primitives.d.n(this.b) || !com.google.common.primitives.d.n(f)) {
            this.b = o.i(this.b, f);
            this.c = NaN;
        }
        else {
            double f4 = f - this.b;
            double f5 = this.b + f4 * ((double)v) / ((double)this.a);
            this.b = f5;
            this.c += f1 + f4 * (f - f5) * ((double)v);
        }
        this.d = Math.min(this.d, f2);
        this.e = Math.max(this.e, f3);
    }

    public double n() {
        H.g0(this.a != 0L);
        return this.d;
    }

    public final double o() {
        return Math.sqrt(this.p());
    }

    public final double p() {
        H.g0(this.a != 0L);
        if(Double.isNaN(this.c)) {
            return NaN;
        }
        return this.a == 1L ? 0.0 : com.google.common.math.d.b(this.c) / ((double)this.a);
    }

    public final double q() {
        return Math.sqrt(this.r());
    }

    public final double r() {
        H.g0(this.a > 1L);
        return Double.isNaN(this.c) ? NaN : com.google.common.math.d.b(this.c) / ((double)(this.a - 1L));
    }

    public n s() {
        return new n(this.a, this.b, this.c, this.d, this.e);
    }

    public final double t() {
        return this.b * ((double)this.a);
    }

    double u() {
        return this.c;
    }
}

