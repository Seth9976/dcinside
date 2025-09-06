package com.google.android.material.color.utilities;

import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;

@RestrictTo({Scope.b})
public class w2 {
    public static double a(double f, double f1, double f2) {
        if(f2 < f) {
            return f;
        }
        return f2 > f1 ? f1 : f2;
    }

    public static int b(int v, int v1, int v2) {
        if(v2 < v) {
            return v;
        }
        return v2 <= v1 ? v2 : v1;
    }

    public static double c(double f, double f1) {
        return 180.0 - Math.abs(Math.abs(f - f1) - 180.0);
    }

    public static double d(double f, double f1, double f2) [...] // Inlined contents

    public static double[] e(double[] arr_f, double[][] arr2_f) {
        double f = arr_f[0];
        double[] arr_f1 = arr2_f[0];
        double f1 = arr_f1[0] * f;
        double f2 = arr_f[1];
        double f3 = f1 + arr_f1[1] * f2;
        double f4 = arr_f[2];
        double f5 = f3 + arr_f1[2] * f4;
        double[] arr_f2 = arr2_f[1];
        double f6 = arr_f2[0] * f + arr_f2[1] * f2 + arr_f2[2] * f4;
        double[] arr_f3 = arr2_f[2];
        return new double[]{f5, f6, f * arr_f3[0] + f2 * arr_f3[1] + f4 * arr_f3[2]};
    }

    public static double f(double f, double f1) {
        return w2.g(f1 - f) <= 180.0 ? 1.0 : -1.0;
    }

    public static double g(double f) {
        return f % 360.0 < 0.0 ? f % 360.0 + 360.0 : f % 360.0;
    }

    public static int h(int v) {
        return v % 360 >= 0 ? v % 360 : v % 360 + 360;
    }

    public static int i(double f) {
        if(((long)f) < 0L) {
            return -1;
        }
        return ((long)f) == 0L ? 0 : 1;
    }
}

