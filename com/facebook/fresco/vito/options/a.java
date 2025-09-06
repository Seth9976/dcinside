package com.facebook.fresco.vito.options;

import androidx.annotation.ColorInt;
import androidx.compose.foundation.c;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;
import z3.f;
import z3.j;
import z3.n;

public final class a {
    public static final class com.facebook.fresco.vito.options.a.a {
        private com.facebook.fresco.vito.options.a.a() {
        }

        public com.facebook.fresco.vito.options.a.a(w w0) {
        }

        @l
        @j
        @n
        public final a a(@ColorInt int v, float f) {
            return com.facebook.fresco.vito.options.a.a.d(this, v, f, 0.0f, false, 12, null);
        }

        @l
        @j
        @n
        public final a b(@ColorInt int v, float f, float f1) {
            return com.facebook.fresco.vito.options.a.a.d(this, v, f, f1, false, 8, null);
        }

        @l
        @j
        @n
        public final a c(@ColorInt int v, float f, float f1, boolean z) {
            return new a(v, f, f1, z);
        }

        public static a d(com.facebook.fresco.vito.options.a.a a$a0, int v, float f, float f1, boolean z, int v1, Object object0) {
            if((v1 & 4) != 0) {
                f1 = 0.0f;
            }
            if((v1 & 8) != 0) {
                z = false;
            }
            return a$a0.c(v, f, f1, z);
        }
    }

    @ColorInt
    @f
    public final int a;
    @f
    public final float b;
    @f
    public final float c;
    @f
    public final boolean d;
    @l
    public static final com.facebook.fresco.vito.options.a.a e;

    static {
        a.e = new com.facebook.fresco.vito.options.a.a(null);
    }

    public a(@ColorInt int v, float f, float f1, boolean z) {
        this.a = v;
        this.b = f;
        this.c = f1;
        this.d = z;
    }

    public a(int v, float f, float f1, boolean z, int v1, w w0) {
        if((v1 & 4) != 0) {
            f1 = 0.0f;
        }
        if((v1 & 8) != 0) {
            z = false;
        }
        this(v, f, f1, z);
    }

    public final int a() {
        return this.a;
    }

    public final float b() {
        return this.b;
    }

    public final float c() {
        return this.c;
    }

    public final boolean d() {
        return this.d;
    }

    @l
    public final a e(@ColorInt int v, float f, float f1, boolean z) {
        return new a(v, f, f1, z);
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        Class class0 = object0 == null ? null : object0.getClass();
        if(!L.g(a.class, class0)) {
            return false;
        }
        L.n(object0, "null cannot be cast to non-null type com.facebook.fresco.vito.options.BorderOptions");
        return this.a == ((a)object0).a && this.b == ((a)object0).b && this.c == ((a)object0).c && this.d == ((a)object0).d;
    }

    public static a f(a a0, int v, float f, float f1, boolean z, int v1, Object object0) {
        if((v1 & 1) != 0) {
            v = a0.a;
        }
        if((v1 & 2) != 0) {
            f = a0.b;
        }
        if((v1 & 4) != 0) {
            f1 = a0.c;
        }
        if((v1 & 8) != 0) {
            z = a0.d;
        }
        return a0.e(v, f, f1, z);
    }

    @l
    @j
    @n
    public static final a g(@ColorInt int v, float f) {
        return a.e.a(v, f);
    }

    @l
    @j
    @n
    public static final a h(@ColorInt int v, float f, float f1) {
        return a.e.b(v, f, f1);
    }

    @Override
    public int hashCode() {
        return ((this.a * 0x1F + Float.floatToIntBits(this.b)) * 0x1F + Float.floatToIntBits(this.c)) * 0x1F + c.a(this.d);
    }

    @l
    @j
    @n
    public static final a i(@ColorInt int v, float f, float f1, boolean z) {
        return a.e.c(v, f, f1, z);
    }

    @Override
    @l
    public String toString() {
        return "BorderOptions(color=" + this.a + ", width=" + this.b + ", padding=" + this.c + ", scaleDownInsideBorders=" + this.d + ")";
    }
}

