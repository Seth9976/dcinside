package androidx.core.graphics;

import android.graphics.Rect;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;

public final class Insets {
    @RequiresApi(29)
    static class Api29Impl {
        static android.graphics.Insets a(int v, int v1, int v2, int v3) {
            return android.graphics.Insets.of(v, v1, v2, v3);
        }
    }

    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public static final Insets e;

    static {
        Insets.e = new Insets(0, 0, 0, 0);
    }

    private Insets(int v, int v1, int v2, int v3) {
        this.a = v;
        this.b = v1;
        this.c = v2;
        this.d = v3;
    }

    public static Insets a(Insets insets0, Insets insets1) {
        return Insets.d(insets0.a + insets1.a, insets0.b + insets1.b, insets0.c + insets1.c, insets0.d + insets1.d);
    }

    public static Insets b(Insets insets0, Insets insets1) {
        return Insets.d(Math.max(insets0.a, insets1.a), Math.max(insets0.b, insets1.b), Math.max(insets0.c, insets1.c), Math.max(insets0.d, insets1.d));
    }

    public static Insets c(Insets insets0, Insets insets1) {
        return Insets.d(Math.min(insets0.a, insets1.a), Math.min(insets0.b, insets1.b), Math.min(insets0.c, insets1.c), Math.min(insets0.d, insets1.d));
    }

    public static Insets d(int v, int v1, int v2, int v3) {
        return v != 0 || v1 != 0 || v2 != 0 || v3 != 0 ? new Insets(v, v1, v2, v3) : Insets.e;
    }

    public static Insets e(Rect rect0) {
        return Insets.d(rect0.left, rect0.top, rect0.right, rect0.bottom);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null) {
            Class class0 = object0.getClass();
            if(Insets.class != class0 || this.d != ((Insets)object0).d) {
                return false;
            }
            if(this.a != ((Insets)object0).a) {
                return false;
            }
            return this.c == ((Insets)object0).c ? this.b == ((Insets)object0).b : false;
        }
        return false;
    }

    public static Insets f(Insets insets0, Insets insets1) {
        return Insets.d(insets0.a - insets1.a, insets0.b - insets1.b, insets0.c - insets1.c, insets0.d - insets1.d);
    }

    @RequiresApi(api = 29)
    public static Insets g(android.graphics.Insets insets0) {
        return Insets.d(insets0.left, insets0.top, insets0.right, insets0.bottom);
    }

    @RequiresApi(29)
    public android.graphics.Insets h() {
        return Api29Impl.a(this.a, this.b, this.c, this.d);
    }

    @Override
    public int hashCode() {
        return ((this.a * 0x1F + this.b) * 0x1F + this.c) * 0x1F + this.d;
    }

    @RequiresApi(api = 29)
    @RestrictTo({Scope.c})
    @Deprecated
    public static Insets i(android.graphics.Insets insets0) {
        return Insets.g(insets0);
    }

    @Override
    public String toString() {
        return "Insets{left=" + this.a + ", top=" + this.b + ", right=" + this.c + ", bottom=" + this.d + '}';
    }
}

