package com.google.firebase.remoteconfig.internal;

import com.google.firebase.remoteconfig.t;
import com.google.firebase.remoteconfig.v;

public class x implements t {
    static class a {
    }

    public static class b {
        private long a;
        private int b;
        private v c;

        private b() {
        }

        b(a x$a0) {
        }

        public x a() {
            return new x(this.a, this.b, this.c, null);
        }

        b b(v v0) {
            this.c = v0;
            return this;
        }

        b c(int v) {
            this.b = v;
            return this;
        }

        public b d(long v) {
            this.a = v;
            return this;
        }
    }

    private final long a;
    private final int b;
    private final v c;

    private x(long v, int v1, v v2) {
        this.a = v;
        this.b = v1;
        this.c = v2;
    }

    x(long v, int v1, v v2, a x$a0) {
        this(v, v1, v2);
    }

    @Override  // com.google.firebase.remoteconfig.t
    public long a() {
        return this.a;
    }

    @Override  // com.google.firebase.remoteconfig.t
    public v b() {
        return this.c;
    }

    @Override  // com.google.firebase.remoteconfig.t
    public int c() {
        return this.b;
    }

    static b d() {
        return new b(null);
    }
}

