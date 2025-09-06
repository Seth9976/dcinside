package org.jsoup.nodes;

public class x {
    public static class a {
        private final x a;
        private final x b;
        static final a c;

        static {
            a.c = new a(x.d, x.d);
        }

        public a(x x0, x x1) {
            this.a = x0;
            this.b = x1;
        }

        public x a() {
            return this.a;
        }

        public x b() {
            return this.b;
        }

        @Override
        public boolean equals(Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 != null && this.getClass() == object0.getClass() && this.a.equals(((a)object0).a) ? this.b.equals(((a)object0).b) : false;
        }

        @Override
        public int hashCode() {
            return this.a.hashCode() * 0x1F + this.b.hashCode();
        }

        @Override
        public String toString() {
            return this.a().toString() + "=" + this.b().toString();
        }
    }

    public static class b {
        private final int a;
        private final int b;
        private final int c;

        public b(int v, int v1, int v2) {
            this.a = v;
            this.b = v1;
            this.c = v2;
        }

        public int b() {
            return this.c;
        }

        public boolean c() {
            return this != x.c;
        }

        public int d() {
            return this.b;
        }

        public int e() {
            return this.a;
        }

        @Override
        public boolean equals(Object object0) {
            if(this == object0) {
                return true;
            }
            if(object0 == null || this.getClass() != object0.getClass() || this.a != ((b)object0).a) {
                return false;
            }
            return this.b == ((b)object0).b ? this.c == ((b)object0).c : false;
        }

        @Override
        public int hashCode() {
            return (this.a * 0x1F + this.b) * 0x1F + this.c;
        }

        @Override
        public String toString() {
            return this.b + "," + this.c + ":" + this.a;
        }
    }

    private final b a;
    private final b b;
    private static final b c;
    static final x d;

    static {
        b x$b0 = new b(-1, -1, -1);
        x.c = x$b0;
        x.d = new x(x$b0, x$b0);
    }

    public x(b x$b0, b x$b1) {
        this.a = x$b0;
        this.b = x$b1;
    }

    public b b() {
        return this.b;
    }

    public int c() {
        return this.b.a;
    }

    // 去混淆评级： 低(30)
    public boolean d() {
        return this.a.equals(this.b);
    }

    public boolean e() [...] // 潜在的解密器

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 != null && this.getClass() == object0.getClass() && this.a.equals(((x)object0).a) ? this.b.equals(((x)object0).b) : false;
    }

    static x f(t t0, boolean z) {
        if(!t0.E()) {
            return x.d;
        }
        Object object0 = t0.j().Q((z ? "jsoup.start" : "jsoup.end"));
        return object0 == null ? x.d : ((x)object0);
    }

    public b g() {
        return this.a;
    }

    public int h() {
        return this.a.a;
    }

    @Override
    public int hashCode() {
        return this.a.hashCode() * 0x1F + this.b.hashCode();
    }

    @Override
    public String toString() {
        return this.a + "-" + this.b;
    }
}

