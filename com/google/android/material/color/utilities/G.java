package com.google.android.material.color.utilities;

import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;

@RestrictTo({Scope.b})
public final class g {
    private g() {
        throw new UnsupportedOperationException();
    }

    // 去混淆评级： 低(20)
    public static l a(l l0) {
        return g.b(l0) ? l.a(l0.d(), l0.c(), 70.0) : l0;
    }

    // 去混淆评级： 低(30)
    public static boolean b(l l0) {
        return ((double)Math.round(l0.d())) >= 90.0 && ((double)Math.round(l0.d())) <= 111.0 && ((double)Math.round(l0.c())) > 16.0 && ((double)Math.round(l0.e())) < 65.0;
    }
}

