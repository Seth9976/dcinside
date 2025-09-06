package com.facebook.imagepipeline.common;

import java.util.Arrays;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;
import z3.f;
import z3.j;
import z3.n;

public final class g {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }

        @m
        @n
        public final g a(int v, int v1) {
            return v <= 0 || v1 <= 0 ? null : new g(v, v1, 0.0f, 0.0f, 12, null);
        }

        @m
        @n
        public final g b(int v) {
            return v > 0 ? new g(v, v, 0.0f, 0.0f, 12, null) : null;
        }
    }

    @f
    public final int a;
    @f
    public final int b;
    @f
    public final float c;
    @f
    public final float d;
    @l
    public static final a e = null;
    public static final float f = 0.666667f;

    static {
        g.e = new a(null);
    }

    @j
    public g(int v, int v1) {
        this(v, v1, 0.0f, 0.0f, 12, null);
    }

    @j
    public g(int v, int v1, float f) {
        this(v, v1, f, 0.0f, 8, null);
    }

    @j
    public g(int v, int v1, float f, float f1) {
        this.a = v;
        this.b = v1;
        this.c = f;
        this.d = f1;
        if(v <= 0 || v1 <= 0) {
            throw new IllegalStateException("Check failed.");
        }
    }

    public g(int v, int v1, float f, float f1, int v2, w w0) {
        if((v2 & 4) != 0) {
            f = 2048.0f;
        }
        if((v2 & 8) != 0) {
            f1 = 0.666667f;
        }
        this(v, v1, f, f1);
    }

    @m
    @n
    public static final g a(int v, int v1) {
        return g.e.a(v, v1);
    }

    @m
    @n
    public static final g b(int v) {
        return g.e.b(v);
    }

    // 去混淆评级： 低(20)
    @Override
    public boolean equals(@m Object object0) {
        return object0 == this ? true : object0 instanceof g && this.a == ((g)object0).a && this.b == ((g)object0).b;
    }

    @Override
    public int hashCode() {
        return (this.a + 0x1F) * 0x1F + this.b;
    }

    @Override
    @l
    public String toString() {
        String s = String.format(null, "%dx%d", Arrays.copyOf(new Object[]{this.a, this.b}, 2));
        L.o(s, "format(...)");
        return s;
    }
}

