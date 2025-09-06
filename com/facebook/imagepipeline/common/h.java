package com.facebook.imagepipeline.common;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Arrays;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import s3.e;
import y4.l;
import y4.m;
import z3.n;

@s0({"SMAP\nRotationOptions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RotationOptions.kt\ncom/facebook/imagepipeline/common/RotationOptions\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,133:1\n1#2:134\n*E\n"})
public final class h {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }

        @l
        @n
        public final h a() {
            return h.j;
        }

        @l
        @n
        public final h b() {
            return h.l;
        }

        @l
        @n
        public final h c() {
            return h.k;
        }

        @l
        @n
        public final h d(int v) {
            return new h(v, false, null);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @e(s3.a.a)
    @interface b {
    }

    @Retention(RetentionPolicy.SOURCE)
    @e(s3.a.a)
    public @interface c {
    }

    private final int a;
    private final boolean b;
    @l
    public static final a c = null;
    public static final int d = 0;
    public static final int e = 90;
    public static final int f = 180;
    public static final int g = 270;
    private static final int h = -1;
    private static final int i = -2;
    @l
    private static final h j;
    @l
    private static final h k;
    @l
    private static final h l;

    static {
        h.c = new a(null);
        h.j = new h(-1, false);
        h.k = new h(-2, false);
        h.l = new h(-1, true);
    }

    private h(int v, boolean z) {
        this.a = v;
        this.b = z;
    }

    public h(int v, boolean z, w w0) {
        this(v, z);
    }

    @l
    @n
    public static final h d() {
        return h.c.a();
    }

    @l
    @n
    public static final h e() {
        return h.c.b();
    }

    @Override
    public boolean equals(@m Object object0) {
        if(object0 == this) {
            return true;
        }
        return object0 instanceof h ? this.a == ((h)object0).a && this.b == ((h)object0).b : false;
    }

    public final boolean f() {
        return this.b;
    }

    @l
    @n
    public static final h g() {
        return h.c.c();
    }

    @l
    @n
    public static final h h(int v) {
        return h.c.d(v);
    }

    @Override
    public int hashCode() {
        return com.facebook.common.util.c.h(this.a, Boolean.valueOf(this.b));
    }

    public final int i() {
        if(this.k()) {
            throw new IllegalStateException("Rotation is set to use EXIF");
        }
        return this.a;
    }

    public final boolean j() {
        return this.a != -2;
    }

    public final boolean k() {
        return this.a == -1;
    }

    @Override
    @l
    public String toString() {
        String s = String.format(null, "%d defer:%b", Arrays.copyOf(new Object[]{this.a, Boolean.valueOf(this.b)}, 2));
        L.o(s, "format(...)");
        return s;
    }
}

