package com.fasterxml.jackson.databind.cfg;

import com.fasterxml.jackson.databind.G;
import com.fasterxml.jackson.databind.g;
import com.fasterxml.jackson.databind.util.t;
import com.fasterxml.jackson.databind.util.w;

public class n implements b {
    public static class a {
        private int a;
        private int b;
        private int c;

        public n a() {
            return new n(this.a, this.b, this.c);
        }

        public a b(int v) {
            if(v < 0) {
                throw new IllegalArgumentException("Cannot set maxDeserializerCacheSize to a negative value");
            }
            this.a = v;
            return this;
        }

        public a c(int v) {
            if(v < 0) {
                throw new IllegalArgumentException("Cannot set maxSerializerCacheSize to a negative value");
            }
            this.b = v;
            return this;
        }

        public a d(int v) {
            if(v < 0) {
                throw new IllegalArgumentException("Cannot set maxTypeFactoryCacheSize to a negative value");
            }
            this.c = v;
            return this;
        }
    }

    protected final int a;
    protected final int b;
    protected final int c;
    private static final long d = 1L;
    private static final n e;

    static {
        n.e = new n(2000, 4000, 200);
    }

    protected n(int v, int v1, int v2) {
        this.a = v;
        this.b = v1;
        this.c = v2;
    }

    protected w a(int v) {
        return new t(Math.min(0x40, v >> 2), v);
    }

    public static a b() {
        return new a();
    }

    public static b c() {
        return n.e;
    }

    @Override  // com.fasterxml.jackson.databind.cfg.b
    public w g2(G g0) {
        return this.a(this.b);
    }

    @Override  // com.fasterxml.jackson.databind.cfg.b
    public w s3(g g0) {
        return this.a(this.a);
    }

    @Override  // com.fasterxml.jackson.databind.cfg.b
    public w t2() {
        return this.a(this.c);
    }
}

