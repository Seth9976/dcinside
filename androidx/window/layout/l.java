package androidx.window.layout;

import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.window.core.ExperimentalWindowApi;
import z3.n;

public final class l {
    static {
    }

    @y4.l
    @n
    public static WindowMetricsCalculator a() {
        return WindowMetricsCalculator.a.a();
    }

    @RestrictTo({Scope.e})
    @ExperimentalWindowApi
    @n
    public static void b(@y4.l WindowMetricsCalculatorDecorator windowMetricsCalculatorDecorator0) {
        WindowMetricsCalculator.a.b(windowMetricsCalculatorDecorator0);
    }

    @RestrictTo({Scope.e})
    @ExperimentalWindowApi
    @n
    public static void c() {
        WindowMetricsCalculator.a.c();
    }
}

