package com.facebook.imagepipeline.common;

import java.util.Arrays;
import java.util.regex.Pattern;
import kotlin.D;
import kotlin.E;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import p3.b;
import y4.l;
import y4.m;
import z3.f;
import z3.n;

@b
public final class com.facebook.imagepipeline.common.b {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }

        @l
        @n
        public final com.facebook.imagepipeline.common.b b(int v) {
            com.facebook.common.internal.n.d(Boolean.valueOf(v >= 0));
            return new com.facebook.imagepipeline.common.b(v, 0x7FFFFFFF);
        }

        @m
        @n
        public final com.facebook.imagepipeline.common.b c(@m String s) throws IllegalArgumentException {
            if(s == null) {
                return null;
            }
            try {
                String[] arr_s = this.d().split(s);
                com.facebook.common.internal.n.d(Boolean.valueOf(arr_s.length == 4));
                com.facebook.common.internal.n.d(Boolean.valueOf(L.g(arr_s[0], "bytes")));
                String s1 = arr_s[1];
                L.o(s1, "get(...)");
                int v = Integer.parseInt(s1);
                String s2 = arr_s[2];
                L.o(s2, "get(...)");
                int v1 = Integer.parseInt(s2);
                String s3 = arr_s[3];
                L.o(s3, "get(...)");
                int v2 = Integer.parseInt(s3);
                com.facebook.common.internal.n.d(Boolean.valueOf(v1 > v));
                com.facebook.common.internal.n.d(Boolean.valueOf(v2 > v1));
                return v1 >= v2 - 1 ? new com.facebook.imagepipeline.common.b(v, 0x7FFFFFFF) : new com.facebook.imagepipeline.common.b(v, v1);
            }
            catch(IllegalArgumentException illegalArgumentException0) {
            }
            String s4 = String.format(null, "Invalid Content-Range header value: \"%s\"", Arrays.copyOf(new Object[]{s}, 1));
            L.o(s4, "format(...)");
            throw new IllegalArgumentException(s4, illegalArgumentException0);
        }

        private final Pattern d() {
            Object object0 = com.facebook.imagepipeline.common.b.e.getValue();
            L.o(object0, "getValue(...)");
            return (Pattern)object0;
        }

        @l
        @n
        public final com.facebook.imagepipeline.common.b e(int v) {
            com.facebook.common.internal.n.d(Boolean.valueOf(v > 0));
            return new com.facebook.imagepipeline.common.b(0, v);
        }

        private final String f(int v) {
            return v == 0x7FFFFFFF ? "" : String.valueOf(v);
        }
    }

    @f
    public final int a;
    @f
    public final int b;
    @l
    public static final a c = null;
    public static final int d = 0x7FFFFFFF;
    @l
    private static final D e;

    static {
        com.facebook.imagepipeline.common.b.c = new a(null);
        com.facebook.imagepipeline.common.b.e = E.a(() -> Pattern.compile("[-/ ]"));
    }

    public com.facebook.imagepipeline.common.b(int v, int v1) {
        this.a = v;
        this.b = v1;
    }

    public final int c() {
        return this.a;
    }

    public final int d() {
        return this.b;
    }

    public final boolean e(@m com.facebook.imagepipeline.common.b b0) {
        return b0 != null && this.a <= b0.a && b0.b <= this.b;
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        Class class0 = object0 == null ? null : object0.getClass();
        if(!L.g(com.facebook.imagepipeline.common.b.class, class0)) {
            return false;
        }
        L.n(object0, "null cannot be cast to non-null type com.facebook.imagepipeline.common.BytesRange");
        return this.a == ((com.facebook.imagepipeline.common.b)object0).a && this.b == ((com.facebook.imagepipeline.common.b)object0).b;
    }

    @l
    public final com.facebook.imagepipeline.common.b f(int v, int v1) {
        return new com.facebook.imagepipeline.common.b(v, v1);
    }

    public static com.facebook.imagepipeline.common.b g(com.facebook.imagepipeline.common.b b0, int v, int v1, int v2, Object object0) {
        if((v2 & 1) != 0) {
            v = b0.a;
        }
        if((v2 & 2) != 0) {
            v1 = b0.b;
        }
        return b0.f(v, v1);
    }

    @l
    @n
    public static final com.facebook.imagepipeline.common.b h(int v) {
        return com.facebook.imagepipeline.common.b.c.b(v);
    }

    @Override
    public int hashCode() {
        return this.a * 0x1F + this.b;
    }

    @m
    @n
    public static final com.facebook.imagepipeline.common.b i(@m String s) throws IllegalArgumentException {
        return com.facebook.imagepipeline.common.b.c.c(s);
    }

    // 检测为 Lambda 实现
    private static final Pattern j() [...]

    @l
    public final String k() {
        String s = String.format(null, "bytes=%s-%s", Arrays.copyOf(new Object[]{com.facebook.imagepipeline.common.b.c.f(this.a), com.facebook.imagepipeline.common.b.c.f(this.b)}, 2));
        L.o(s, "format(...)");
        return s;
    }

    @l
    @n
    public static final com.facebook.imagepipeline.common.b l(int v) {
        return com.facebook.imagepipeline.common.b.c.e(v);
    }

    @Override
    @l
    public String toString() {
        String s = String.format(null, "%s-%s", Arrays.copyOf(new Object[]{com.facebook.imagepipeline.common.b.c.f(this.a), com.facebook.imagepipeline.common.b.c.f(this.b)}, 2));
        L.o(s, "format(...)");
        return s;
    }
}

