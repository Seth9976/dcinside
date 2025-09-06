package com.google.android.material.color.utilities;

import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;

@RestrictTo({Scope.b})
public final class b {
    private final double a;
    private final double b;
    private final double c;
    private final double d;
    private final double e;
    private final double f;
    private final double g;
    private final double h;
    private final double i;
    private final double[] j;
    static final double[][] k;
    static final double[][] l;

    static {
        b.k = new double[][]{new double[]{0.401288, 0.650173, -0.051461}, new double[]{-0.250268, 1.204414, 0.045854}, new double[]{-0.002079, 0.048952, 0.953127}};
        b.l = new double[][]{new double[]{1.862068, -1.011255, 0.149187}, new double[]{0.387527, 0.621447, -0.008974}, new double[]{-0.015842, -0.034123, 1.049964}};
    }

    private b(double f, double f1, double f2, double f3, double f4, double f5, double f6, double f7, double f8) {
        this.j = new double[]{0.0, 0.0, 0.0};
        this.a = f;
        this.b = f1;
        this.c = f2;
        this.d = f3;
        this.e = f4;
        this.f = f5;
        this.g = f6;
        this.h = f7;
        this.i = f8;
    }

    double a(b b0) {
        double f = this.n();
        double f1 = b0.n();
        double f2 = this.i();
        double f3 = b0.i();
        double f4 = this.j();
        double f5 = b0.j();
        return Math.pow(Math.sqrt((f - f1) * (f - f1) + (f2 - f3) * (f2 - f3) + (f4 - f5) * (f4 - f5)), 0.63) * 1.41;
    }

    public static b b(int v) {
        return b.c(v, X2.k);
    }

    static b c(int v, X2 x20) {
        double f = c.n((0xFF0000 & v) >> 16);
        double f1 = c.n((0xFF00 & v) >> 8);
        double f2 = c.n(v & 0xFF);
        return b.h(0.412339 * f + 0.357621 * f1 + 0.18051 * f2, 0.2126 * f + 0.7152 * f1 + 0.0722 * f2, f * 0.019321 + f1 * 0.119164 + f2 * 0.950345, x20);
    }

    static b d(double f, double f1, double f2) {
        return b.e(f, f1, f2, X2.k);
    }

    private static b e(double f, double f1, double f2, X2 x20) {
        double f3 = f1 * x20.e();
        double f4 = Math.toRadians(f2);
        double f5 = Math.log1p(f3 * 0.0228);
        return new b(f2, f1, f, 4.0 / x20.c() * Math.sqrt(f / 100.0) * (x20.b() + 4.0) * x20.e(), f3, Math.sqrt(f1 / Math.sqrt(f / 100.0) * x20.c() / (x20.b() + 4.0)) * 50.0, 1.7 * f / (0.007 * f + 1.0), Math.cos(f4) * (43.859649 * f5), Math.sin(f4) * (43.859649 * f5));
    }

    public static b f(double f, double f1, double f2) {
        return b.g(f, f1, f2, X2.k);
    }

    public static b g(double f, double f1, double f2, X2 x20) {
        double f3 = Math.atan2(f2, f1) * 57.29578;
        return b.e(f / (1.0 - (f - 100.0) * 0.007), Math.expm1(Math.hypot(f1, f2) * 0.0228) / 0.0228 / x20.e(), (f3 < 0.0 ? f3 + 360.0 : Math.atan2(f2, f1) * 57.29578), x20);
    }

    static b h(double f, double f1, double f2, X2 x20) {
        double[] arr_f = b.k[0];
        double f3 = arr_f[0] * f + arr_f[1] * f1 + arr_f[2] * f2;
        double[] arr_f1 = b.k[1];
        double f4 = arr_f1[0] * f + arr_f1[1] * f1 + arr_f1[2] * f2;
        double[] arr_f2 = b.k[2];
        double f5 = arr_f2[0] * f + arr_f2[1] * f1 + arr_f2[2] * f2;
        double f6 = x20.j()[0] * f3;
        double f7 = x20.j()[1] * f4;
        double f8 = x20.j()[2] * f5;
        double f9 = Math.pow(x20.d() * Math.abs(f6) / 100.0, 0.42);
        double f10 = Math.pow(x20.d() * Math.abs(f7) / 100.0, 0.42);
        double f11 = Math.pow(x20.d() * Math.abs(f8) / 100.0, 0.42);
        double f12 = Math.signum(f6) * 400.0 * f9 / (f9 + 27.13);
        double f13 = Math.signum(f7) * 400.0 * f10 / (f10 + 27.13);
        double f14 = Math.signum(f8) * 400.0 * f11 / (f11 + 27.13);
        double f15 = (f12 * 11.0 + -12.0 * f13 + f14) / 11.0;
        double f16 = (f12 + f13 - f14 * 2.0) / 9.0;
        double f17 = Math.toDegrees(Math.atan2(f16, f15));
        if(f17 < 0.0) {
            f17 += 360.0;
        }
        else if(f17 >= 360.0) {
            f17 -= 360.0;
        }
        double f18 = Math.toRadians(f17);
        double f19 = Math.pow((f12 * 40.0 + f13 * 20.0 + f14) / 20.0 * x20.g() / x20.b(), x20.c() * x20.k());
        double f20 = f19 * 100.0 / 100.0;
        double f21 = Math.pow(1.64 - Math.pow(0.29, x20.f()), 0.73) * Math.pow((Math.cos(Math.toRadians((f17 < 20.14 ? f17 + 360.0 : f17)) + 2.0) + 3.8) * 961.538462 * x20.h() * x20.i() * Math.hypot(f15, f16) / ((f12 * 20.0 + f13 * 20.0 + 21.0 * f14) / 20.0 + 0.305), 0.9);
        double f22 = Math.sqrt(f20) * f21;
        double f23 = f22 * x20.e();
        double f24 = Math.log1p(f23 * 0.0228);
        return new b(f17, f22, f19 * 100.0, 4.0 / x20.c() * Math.sqrt(f20) * (x20.b() + 4.0) * x20.e(), f23, Math.sqrt(f21 * x20.c() / (x20.b() + 4.0)) * 50.0, 1.7 * (f19 * 100.0) / (0.007 * (f19 * 100.0) + 1.0), f24 * 43.859649 * Math.cos(f18), f24 * 43.859649 * Math.sin(f18));
    }

    public double i() {
        return this.h;
    }

    public double j() {
        return this.i;
    }

    public double k() {
        return this.b;
    }

    public double l() {
        return this.a;
    }

    public double m() {
        return this.c;
    }

    public double n() {
        return this.g;
    }

    public double o() {
        return this.e;
    }

    public double p() {
        return this.d;
    }

    public double q() {
        return this.f;
    }

    public int r() {
        return this.s(X2.k);
    }

    int s(X2 x20) {
        double[] arr_f = this.t(x20, this.j);
        return c.f(arr_f[0], arr_f[1], arr_f[2]);
    }

    double[] t(X2 x20, double[] arr_f) {
        double f = Math.pow((this.k() == 0.0 || this.m() == 0.0 ? 0.0 : this.k() / Math.sqrt(this.m() / 100.0)) / Math.pow(1.64 - Math.pow(0.29, x20.f()), 0.73), 1.111111);
        double f1 = Math.toRadians(this.l());
        double f2 = x20.b() * Math.pow(this.m() / 100.0, 1.0 / x20.c() / x20.k()) / x20.g();
        double f3 = Math.sin(f1);
        double f4 = Math.cos(f1);
        double f5 = (f2 + 0.305) * 23.0 * f / ((Math.cos(f1 + 2.0) + 3.8) * 961.538462 * x20.h() * x20.i() * 23.0 + 11.0 * f * f4 + f * 108.0 * f3);
        double f6 = f4 * f5;
        double f7 = f5 * f3;
        double f8 = (451.0 * f6 + f2 * 460.0 + 288.0 * f7) / 1403.0;
        double f9 = (f2 * 460.0 - 891.0 * f6 - 261.0 * f7) / 1403.0;
        double f10 = (f2 * 460.0 - f6 * 220.0 - f7 * 6300.0) / 1403.0;
        double f11 = Math.signum(f8) * (100.0 / x20.d()) * Math.pow(Math.max(0.0, Math.abs(f8) * 27.13 / (400.0 - Math.abs(f8))), 2.380952) / x20.j()[0];
        double f12 = Math.signum(f9) * (100.0 / x20.d()) * Math.pow(Math.max(0.0, Math.abs(f9) * 27.13 / (400.0 - Math.abs(f9))), 2.380952) / x20.j()[1];
        double f13 = Math.signum(f10) * (100.0 / x20.d()) * Math.pow(Math.max(0.0, Math.abs(f10) * 27.13 / (400.0 - Math.abs(f10))), 2.380952) / x20.j()[2];
        double[] arr_f1 = b.l[0];
        double f14 = arr_f1[0] * f11 + arr_f1[1] * f12 + arr_f1[2] * f13;
        double[] arr_f2 = b.l[1];
        double f15 = arr_f2[0] * f11 + arr_f2[1] * f12 + arr_f2[2] * f13;
        double[] arr_f3 = b.l[2];
        double f16 = f11 * arr_f3[0] + f12 * arr_f3[1] + f13 * arr_f3[2];
        if(arr_f != null) {
            arr_f[0] = f14;
            arr_f[1] = f15;
            arr_f[2] = f16;
            return arr_f;
        }
        return new double[]{f14, f15, f16};
    }
}

