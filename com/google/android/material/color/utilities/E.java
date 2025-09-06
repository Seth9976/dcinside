package com.google.android.material.color.utilities;

import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;

@RestrictTo({Scope.b})
public final class e {
    private final double a;
    private final double b;
    private final double c;
    private final double d;

    public e(double f, double f1, double f2, double f3) {
        this.a = f;
        this.b = f1;
        this.c = f2;
        this.d = f3;
    }

    public double a(double f) {
        if(f <= -1.0) {
            return this.a;
        }
        if(f < 0.0) {
            return (1.0 - (f + 1.0) / 1.0) * this.a + (f + 1.0) / 1.0 * this.b;
        }
        if(f < 0.5) {
            return (1.0 - (f - 0.0) / 0.5) * this.b + (f - 0.0) / 0.5 * this.c;
        }
        return f < 1.0 ? (1.0 - (f - 0.5) / 0.5) * this.c + (f - 0.5) / 0.5 * this.d : this.d;
    }
}

