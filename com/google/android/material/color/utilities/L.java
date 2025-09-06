package com.google.android.material.color.utilities;

import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;

@RestrictTo({Scope.b})
public final class l {
    private double a;
    private double b;
    private double c;
    private int d;

    private l(int v) {
        this.i(v);
    }

    public static l a(double f, double f1, double f2) {
        return new l(m.r(f, f1, f2));
    }

    public static l b(int v) {
        return new l(v);
    }

    public double c() {
        return this.b;
    }

    public double d() {
        return this.a;
    }

    public double e() {
        return this.c;
    }

    public l f(X2 x20) {
        double[] arr_f = b.b(this.k()).t(x20, null);
        b b0 = b.h(arr_f[0], arr_f[1], arr_f[2], X2.k);
        return l.a(b0.l(), b0.k(), c.p(arr_f[1]));
    }

    public void g(double f) {
        this.i(m.r(this.a, f, this.c));
    }

    public void h(double f) {
        this.i(m.r(f, this.b, this.c));
    }

    private void i(int v) {
        this.d = v;
        b b0 = b.b(v);
        this.a = b0.l();
        this.b = b0.k();
        this.c = c.o(v);
    }

    public void j(double f) {
        this.i(m.r(this.a, this.b, f));
    }

    public int k() {
        return this.d;
    }
}

