package com.google.android.material.color.utilities;

import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;

@RestrictTo({Scope.b})
public final class f {
    public T2 a;
    public T2 b;
    public T2 c;
    public T2 d;
    public T2 e;
    public T2 f;

    private f(int v, boolean z) {
        l l0 = l.b(v);
        double f = l0.d();
        double f1 = l0.c();
        if(z) {
            this.a = T2.c(f, f1);
            this.b = T2.c(f, f1 / 3.0);
            this.c = T2.c(f + 60.0, f1 / 2.0);
            this.d = T2.c(f, Math.min(f1 / 12.0, 4.0));
            this.e = T2.c(f, Math.min(f1 / 6.0, 8.0));
        }
        else {
            this.a = T2.c(f, Math.max(48.0, f1));
            this.b = T2.c(f, 16.0);
            this.c = T2.c(f + 60.0, 24.0);
            this.d = T2.c(f, 4.0);
            this.e = T2.c(f, 8.0);
        }
        this.f = T2.c(25.0, 84.0);
    }

    public static f a(int v) {
        return new f(v, true);
    }

    public static f b(int v) {
        return new f(v, false);
    }
}

