package com.google.android.material.color.utilities;

import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;

@RestrictTo({Scope.b})
public final class d {
    public static final double a = 1.0;
    public static final double b = 21.0;
    public static final double c = 3.0;
    public static final double d = 4.5;
    public static final double e = 7.0;
    private static final double f = 0.04;
    private static final double g = 0.4;

    public static double a(double f, double f1) {
        if(f >= 0.0 && f <= 100.0) {
            double f2 = c.t(f);
            double f3 = (f2 + 5.0) / f1 - 5.0;
            if(f3 >= 0.0 && f3 <= 100.0) {
                double f4 = d.f(f2, f3);
                if(f4 < f1 && Math.abs(f4 - f1) > 0.04) {
                    return -1.0;
                }
                double f5 = c.p(f3);
                return f5 - 0.4 < 0.0 || f5 - 0.4 > 100.0 ? -1.0 : f5 - 0.4;
            }
        }
        return -1.0;
    }

    public static double b(double f, double f1) {
        return Math.max(0.0, d.a(f, f1));
    }

    public static double c(double f, double f1) {
        if(f >= 0.0 && f <= 100.0) {
            double f2 = c.t(f);
            double f3 = (f2 + 5.0) * f1 - 5.0;
            if(f3 >= 0.0 && f3 <= 100.0) {
                double f4 = d.f(f3, f2);
                if(f4 < f1 && Math.abs(f4 - f1) > 0.04) {
                    return -1.0;
                }
                double f5 = c.p(f3);
                return f5 + 0.4 < 0.0 || f5 + 0.4 > 100.0 ? -1.0 : f5 + 0.4;
            }
        }
        return -1.0;
    }

    public static double d(double f, double f1) {
        double f2 = d.c(f, f1);
        return f2 < 0.0 ? 100.0 : f2;
    }

    public static double e(double f, double f1) {
        return d.f(c.t(f), c.t(f1));
    }

    public static double f(double f, double f1) {
        double f2 = Math.max(f, f1);
        if(f2 != f1) {
            f = f1;
        }
        return (f2 + 5.0) / (f + 5.0);
    }
}

