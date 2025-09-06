package com.google.android.material.color.utilities;

import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;

@RestrictTo({Scope.b})
public final class y2 implements x2 {
    @Override  // com.google.android.material.color.utilities.x2
    public int a(double[] arr_f) {
        return c.b(arr_f[0], arr_f[1], arr_f[2]);
    }

    @Override  // com.google.android.material.color.utilities.x2
    public double b(double[] arr_f, double[] arr_f1) {
        double f = arr_f[0] - arr_f1[0];
        double f1 = arr_f[1] - arr_f1[1];
        double f2 = arr_f[2] - arr_f1[2];
        return f * f + f1 * f1 + f2 * f2;
    }

    @Override  // com.google.android.material.color.utilities.x2
    public double[] c(int v) {
        double[] arr_f = c.l(v);
        return new double[]{arr_f[0], arr_f[1], arr_f[2]};
    }
}

