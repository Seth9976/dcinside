package com.facebook.imagepipeline.systrace;

import kotlin.jvm.internal.L;
import y4.l;
import y4.m;
import z3.f;
import z3.n;

public final class b {
    public interface a {
        @l
        a a(@l String arg1, long arg2);

        @l
        a b(@l String arg1, int arg2);

        @l
        a c(@l String arg1, double arg2);

        @l
        a d(@l String arg1, @l Object arg2);

        void flush();
    }

    static final class com.facebook.imagepipeline.systrace.b.b implements a {
        @Override  // com.facebook.imagepipeline.systrace.b$a
        @l
        public a a(@l String s, long v) {
            L.p(s, "key");
            return this;
        }

        @Override  // com.facebook.imagepipeline.systrace.b$a
        @l
        public a b(@l String s, int v) {
            L.p(s, "key");
            return this;
        }

        @Override  // com.facebook.imagepipeline.systrace.b$a
        @l
        public a c(@l String s, double f) {
            L.p(s, "key");
            return this;
        }

        @Override  // com.facebook.imagepipeline.systrace.b$a
        @l
        public a d(@l String s, @l Object object0) {
            L.p(s, "key");
            L.p(object0, "value");
            return this;
        }

        @Override  // com.facebook.imagepipeline.systrace.b$a
        public void flush() {
        }
    }

    public interface c {
        void a(@l String arg1);

        void b();

        @l
        a c(@l String arg1);

        boolean isTracing();
    }

    @l
    public static final b a;
    @l
    @f
    public static final a b;
    @m
    private static c c;

    static {
        b.a = new b();
        b.b = new com.facebook.imagepipeline.systrace.b.b();
    }

    @n
    public static final void a(@l String s) {
        L.p(s, "name");
        b.a.d().a(s);
    }

    @l
    @n
    public static final a b(@l String s) {
        L.p(s, "name");
        return b.a.d().c(s);
    }

    @n
    public static final void c() {
        b.a.d().b();
    }

    private final c d() {
        c b$c0 = b.c;
        if(b$c0 == null) {
            synchronized(b.class) {
                com.facebook.imagepipeline.systrace.a a0 = new com.facebook.imagepipeline.systrace.a();
                b.c = a0;
                return a0;
            }
        }
        return b$c0;
    }

    @n
    public static final boolean e() {
        return b.a.d().isTracing();
    }

    @n
    public static final void f(@m c b$c0) {
        b.c = b$c0;
    }

    public final Object g(@l String s, @l A3.a a0) {
        L.p(s, "name");
        L.p(a0, "block");
        if(!b.e()) {
            return a0.invoke();
        }
        b.a(s);
        try {
            return a0.invoke();
        }
        finally {
            b.c();
        }
    }
}

