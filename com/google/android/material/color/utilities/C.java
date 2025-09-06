package com.google.android.material.color.utilities;

import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;

@RestrictTo({Scope.b})
public class c {
    static final double[][] a;
    static final double[][] b;
    static final double[] c;

    static {
        c.a = new double[][]{new double[]{0.412339, 0.357621, 0.18051}, new double[]{0.2126, 0.7152, 0.0722}, new double[]{0.019321, 0.119164, 0.950345}};
        c.b = new double[][]{new double[]{3.241377, -1.537665, -0.498854}, new double[]{-0.969145, 1.875885, 0.041566}, new double[]{0.055621, -0.203955, 1.05718}};
        c.c = new double[]{95.047, 100.0, 108.883};
    }

    public static int a(int v) [...] // Inlined contents

    public static int b(double f, double f1, double f2) {
        double f3 = (((long)f) + 0x4030000000000000L) / 116.0;
        return c.f(c.m(((long)f1) / 0x407F400000000000L + f3) * c.c[0], c.m(f3) * c.c[1], c.m(f3 - f2 / 200.0) * c.c[2]);
    }

    public static int c(double[] arr_f) {
        return c.e(c.h(arr_f[0]), c.h(arr_f[1]), c.h(arr_f[2]));
    }

    public static int d(double f) {
        int v = c.h(c.t(f));
        return (v & 0xFF) << 16 | 0xFF000000 | (v & 0xFF) << 8 | v & 0xFF;
    }

    public static int e(int v, int v1, int v2) [...] // Inlined contents

    public static int f(double f, double f1, double f2) {
        double[] arr_f = c.b[0];
        double f3 = arr_f[0] * f + arr_f[1] * f1 + arr_f[2] * f2;
        double[] arr_f1 = c.b[1];
        double f4 = arr_f1[0] * f + arr_f1[1] * f1 + arr_f1[2] * f2;
        double[] arr_f2 = c.b[2];
        return c.e(c.h(f3), c.h(f4), c.h(arr_f2[0] * f + arr_f2[1] * f1 + arr_f2[2] * f2));
    }

    public static int g(int v) [...] // Inlined contents

    public static int h(double f) {
        return ((long)f) / 0x4059000000000000L <= 0.003131 ? w2.b(0, 0xFF, ((int)Math.round(((long)f) / 0x4059000000000000L * 3294.6))) : w2.b(0, 0xFF, ((int)Math.round((Math.pow(((long)f) / 0x4059000000000000L, 0.416667) * 1.055 - 0.055) * 255.0)));
    }

    public static int i(int v) [...] // Inlined contents

    public static boolean j(int v) {
        return (v >> 24 & 0xFF) >= 0xFF;
    }

    static double k(double f) {
        return f > 0.008856 ? Math.pow(f, 0.333333) : (f * 903.296296 + 16.0) / 116.0;
    }

    public static double[] l(int v) {
        double f = c.n(v >> 16 & 0xFF);
        double f1 = c.n(v >> 8 & 0xFF);
        double f2 = c.n(v & 0xFF);
        double[] arr_f = c.a[0];
        double f3 = arr_f[0] * f + arr_f[1] * f1 + arr_f[2] * f2;
        double[] arr_f1 = c.a[1];
        double f4 = arr_f1[0] * f + arr_f1[1] * f1 + arr_f1[2] * f2;
        double[] arr_f2 = c.a[2];
        double f5 = arr_f2[0] * f + arr_f2[1] * f1 + arr_f2[2] * f2;
        double f6 = c.k(f3 / c.c[0]);
        double f7 = c.k(f4 / c.c[1]);
        return new double[]{116.0 * f7 - 16.0, (f6 - f7) * 500.0, (f7 - c.k(f5 / c.c[2])) * 200.0};
    }

    static double m(double f) {
        double f1 = f * f * f;
        return f1 > 0.008856 ? f1 : (f * 116.0 - 16.0) / 903.296296;
    }

    public static double n(int v) {
        return ((double)v) / 255.0 <= 0.04045 ? ((double)v) / 255.0 / 12.92 * 100.0 : Math.pow((((double)v) / 255.0 + 0.055) / 1.055, 2.4) * 100.0;
    }

    public static double o(int v) {
        return c.k(c.s(v)[1] / 100.0) * 116.0 - 16.0;
    }

    public static double p(double f) {
        return c.k(f / 100.0) * 116.0 - 16.0;
    }

    public static int q(int v) [...] // Inlined contents

    public static double[] r() {
        return c.c;
    }

    public static double[] s(int v) {
        return w2.e(new double[]{c.n(v >> 16 & 0xFF), c.n(v >> 8 & 0xFF), c.n(v & 0xFF)}, c.a);
    }

    public static double t(double f) [...] // 潜在的解密器
}

