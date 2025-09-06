package com.bumptech.glide.integration.webp.decoder;

public final class p {
    static class a {
    }

    public static final class b {
        private c a;
        private int b;

        public p c() {
            return new p(this, null);
        }

        public b d() {
            this.a = c.d;
            return this;
        }

        public b e() {
            this.a = c.c;
            return this;
        }

        public b f(c p$c0) {
            this.a = p$c0;
            return this;
        }

        public b g() {
            this.a = c.b;
            return this;
        }

        public b h(int v) {
            this.b = v;
            if(v == 0) {
                this.a = c.a;
                return this;
            }
            if(v == 0x7FFFFFFF) {
                this.a = c.d;
                return this;
            }
            this.a = c.b;
            return this;
        }

        public b i() {
            this.a = c.a;
            return this;
        }
    }

    public static enum c {
        CACHE_NONE,
        CACHE_LIMITED,
        CACHE_AUTO,
        CACHE_ALL;

    }

    private c a;
    private int b;
    public static final p c;
    public static final p d;
    public static final p e;

    static {
        p.c = new b().i().c();
        p.d = new b().e().c();
        p.e = new b().d().c();
    }

    private p(b p$b0) {
        this.a = p$b0.a;
        this.b = p$b0.b;
    }

    p(b p$b0, a p$a0) {
        this(p$b0);
    }

    public boolean a() {
        return this.a == c.d;
    }

    public boolean b() {
        return this.a == c.c;
    }

    public c c() {
        return this.a;
    }

    public int d() {
        return this.b;
    }

    public boolean e() {
        return this.a == c.a;
    }
}

