package com.fasterxml.jackson.core.util;

public final class o {
    public static class a extends com.fasterxml.jackson.core.util.u.a {
        private static final long i = 1L;
        protected static final a j;

        static {
            a.j = new a(-1);
        }

        protected a(int v) {
            super(v);
        }

        @Override  // com.fasterxml.jackson.core.util.u$e
        public g b() {
            return this.f();
        }

        public static a e(int v) {
            if(v <= 0) {
                throw new IllegalArgumentException("capacity must be > 0, was: " + v);
            }
            return new a(v);
        }

        public com.fasterxml.jackson.core.util.a f() {
            return new com.fasterxml.jackson.core.util.a();
        }

        // 检测为 Lambda 实现
        private e g() [...]

        protected Object h() {
            return this.a(a.j).orElseGet(() -> a.e(this.a));
        }
    }

    public static class b extends com.fasterxml.jackson.core.util.u.b {
        private static final long g = 1L;
        protected static final b h;

        static {
            b.h = new b(-1);
        }

        protected b(int v) {
            super(v);
        }

        @Override  // com.fasterxml.jackson.core.util.u$e
        public g b() {
            return this.e();
        }

        // 检测为 Lambda 实现
        public static e c() [...]

        public static b d() {
            return new b(1);
        }

        public com.fasterxml.jackson.core.util.a e() {
            return new com.fasterxml.jackson.core.util.a();
        }

        protected Object g() {
            return this.a(b.h).orElseGet(() -> b.d());
        }
    }

    public static class c extends com.fasterxml.jackson.core.util.u.c {
        private static final long g = 1L;
        protected static final c h;

        static {
            c.h = new c(-1);
        }

        protected c(int v) {
            super(v);
        }

        @Override  // com.fasterxml.jackson.core.util.u$e
        public g b() {
            return this.e();
        }

        public static c d() {
            return new c(1);
        }

        public com.fasterxml.jackson.core.util.a e() {
            return new com.fasterxml.jackson.core.util.a();
        }

        protected Object g() {
            return this.a(c.h).orElseGet(() -> c.d());
        }
    }

    public static class d extends com.fasterxml.jackson.core.util.u.d {
        private static final long b = 1L;
        protected static final d c;

        static {
            d.c = new d();
        }

        public com.fasterxml.jackson.core.util.a a() {
            return new com.fasterxml.jackson.core.util.a();
        }

        protected Object b() {
            return d.c;
        }

        @Override  // com.fasterxml.jackson.core.util.u$d
        public g l0() {
            return this.a();
        }
    }

    public static class com.fasterxml.jackson.core.util.o.e extends f {
        private static final long b = 1L;
        protected static final com.fasterxml.jackson.core.util.o.e c;

        static {
            com.fasterxml.jackson.core.util.o.e.c = new com.fasterxml.jackson.core.util.o.e();
        }

        public com.fasterxml.jackson.core.util.a a() {
            return com.fasterxml.jackson.core.util.b.b();
        }

        protected Object b() {
            return com.fasterxml.jackson.core.util.o.e.c;
        }

        @Override  // com.fasterxml.jackson.core.util.u$f
        public g l0() {
            return this.a();
        }
    }

    public static u a() {
        return o.i();
    }

    public static u b(int v) {
        return a.e(v);
    }

    public static u c() {
        return b.d();
    }

    public static u d() {
        return c.d();
    }

    public static u e() {
        return d.c;
    }

    public static u f() {
        return a.j;
    }

    public static u g() {
        return b.h;
    }

    public static u h() {
        return c.h;
    }

    public static u i() {
        return com.fasterxml.jackson.core.util.o.e.c;
    }
}

