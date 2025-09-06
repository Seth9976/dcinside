package com.facebook.fresco.vito.options;

import androidx.compose.foundation.c;
import java.util.Arrays;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;
import z3.j;
import z3.n;

public final class g {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }

        @l
        @n
        public final g a() {
            return this.i();
        }

        // 去混淆评级： 低(20)
        @l
        @n
        public final g b(boolean z) {
            return z ? this.j() : this.i();
        }

        @l
        @n
        public final g c(boolean z, boolean z1) {
            return new g(true, 0.0f, null, z, z1);
        }

        @l
        @n
        public final g d(float f, float f1, float f2, float f3) {
            return new g(false, 0.0f, new float[]{f, f, f1, f1, f2, f2, f3, f3}, false, false);
        }

        @l
        @j
        @n
        public final g e(@l float[] arr_f) {
            L.p(arr_f, "cornerRadii");
            return a.g(this, arr_f, false, 2, null);
        }

        @l
        @j
        @n
        public final g f(@l float[] arr_f, boolean z) {
            L.p(arr_f, "cornerRadii");
            return new g(false, 0.0f, arr_f, z, false);
        }

        public static g g(a g$a0, float[] arr_f, boolean z, int v, Object object0) {
            if((v & 2) != 0) {
                z = false;
            }
            return g$a0.f(arr_f, z);
        }

        @l
        @n
        public final g h(float f) {
            return new g(false, f, null, false, false);
        }

        @l
        public final g i() {
            return g.h;
        }

        @l
        public final g j() {
            return g.i;
        }
    }

    private final boolean a;
    private final float b;
    @m
    private final float[] c;
    private final boolean d;
    private final boolean e;
    @l
    public static final a f;
    public static final float g;
    @l
    private static final g h;
    @l
    private static final g i;

    static {
        g.f = new a(null);
        g.h = new g(true, 0.0f, null, false, false);
        g.i = new g(true, 0.0f, null, true, false);
    }

    public g(boolean z, float f, @m float[] arr_f, boolean z1, boolean z2) {
        this.a = z;
        this.b = f;
        this.c = arr_f;
        this.d = z1;
        this.e = z2;
    }

    @l
    @n
    public static final g c() {
        return g.f.a();
    }

    @l
    @n
    public static final g d(boolean z) {
        return g.f.b(z);
    }

    @l
    @n
    public static final g e(boolean z, boolean z1) {
        return g.f.c(z, z1);
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        Class class0 = object0 == null ? null : object0.getClass();
        if(!L.g(g.class, class0)) {
            return false;
        }
        L.n(object0, "null cannot be cast to non-null type com.facebook.fresco.vito.options.RoundingOptions");
        return this.a == ((g)object0).a && this.b == ((g)object0).b && Arrays.equals(this.c, ((g)object0).c) && this.d == ((g)object0).d && this.e == ((g)object0).e;
    }

    public final boolean f() {
        return this.a;
    }

    public final float g() {
        return this.b;
    }

    @m
    public final float[] h() {
        return this.c;
    }

    @Override
    public int hashCode() {
        int v = Arrays.hashCode(this.c);
        return (((c.a(this.a) * 0x1F + Float.floatToIntBits(this.b)) * 0x1F + v) * 0x1F + c.a(this.d)) * 0x1F + c.a(this.e);
    }

    public final boolean i() {
        return this.d;
    }

    public final boolean j() {
        return this.e;
    }

    @l
    public final g k(boolean z, float f, @m float[] arr_f, boolean z1, boolean z2) {
        return new g(z, f, arr_f, z1, z2);
    }

    public static g l(g g0, boolean z, float f, float[] arr_f, boolean z1, boolean z2, int v, Object object0) {
        if((v & 1) != 0) {
            z = g0.a;
        }
        if((v & 2) != 0) {
            f = g0.b;
        }
        if((v & 4) != 0) {
            arr_f = g0.c;
        }
        if((v & 8) != 0) {
            z1 = g0.d;
        }
        if((v & 16) != 0) {
            z2 = g0.e;
        }
        return g0.k(z, f, arr_f, z1, z2);
    }

    @l
    @n
    public static final g m(float f, float f1, float f2, float f3) {
        return g.f.d(f, f1, f2, f3);
    }

    @l
    @j
    @n
    public static final g n(@l float[] arr_f) {
        return g.f.e(arr_f);
    }

    @l
    @j
    @n
    public static final g o(@l float[] arr_f, boolean z) {
        return g.f.f(arr_f, z);
    }

    @l
    @n
    public static final g p(float f) {
        return g.f.h(f);
    }

    @m
    public final float[] q() {
        return this.c;
    }

    public final float r() {
        return this.b;
    }

    public final boolean s() {
        return this.b != 0.0f || this.c != null;
    }

    public final boolean t() {
        return this.d;
    }

    @Override
    @l
    public String toString() {
        String s = Arrays.toString(this.c);
        return "RoundingOptions(isCircular=" + this.a + ", cornerRadius=" + this.b + ", cornerRadii=" + s + ", isAntiAliased=" + this.d + ", isForceRoundAtDecode=" + this.e + ")";
    }

    public final boolean u() {
        return this.a;
    }

    public final boolean v() {
        return this.e;
    }
}

