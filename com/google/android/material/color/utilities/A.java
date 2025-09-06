package com.google.android.material.color.utilities;

import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;

@RestrictTo({Scope.b})
public class a {
    public static int a(int v, int v1, double f) {
        b b0 = b.b(v);
        b b1 = b.b(v1);
        double f1 = b0.n();
        double f2 = b0.i();
        double f3 = b0.j();
        return b.f(f1 + (b1.n() - f1) * f, f2 + (b1.i() - f2) * f, f3 + (b1.j() - f3) * f).r();
    }

    public static int b(int v, int v1) {
        l l0 = l.b(v);
        l l1 = l.b(v1);
        return l.a(w2.g(l0.d() + Math.min(w2.c(l0.d(), l1.d()) * 0.5, 15.0) * w2.f(l0.d(), l1.d())), l0.c(), l0.e()).k();
    }

    public static int c(int v, int v1, double f) {
        return l.a(b.b(a.a(v, v1, f)).l(), b.b(v).k(), c.o(v)).k();
    }
}

