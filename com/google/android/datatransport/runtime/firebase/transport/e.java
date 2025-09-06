package com.google.android.datatransport.runtime.firebase.transport;

import com.google.firebase.encoders.proto.d;

public final class e {
    public static final class a {
        private long a;
        private long b;

        a() {
            this.a = 0L;
            this.b = 0L;
        }

        public e a() {
            return new e(this.a, this.b);
        }

        public a b(long v) {
            this.a = v;
            return this;
        }

        public a c(long v) {
            this.b = v;
            return this;
        }
    }

    private final long a;
    private final long b;
    private static final e c;

    static {
        e.c = new a().a();
    }

    e(long v, long v1) {
        this.a = v;
        this.b = v1;
    }

    @d(tag = 1)
    public long a() {
        return this.a;
    }

    public static e b() {
        return e.c;
    }

    @d(tag = 2)
    public long c() {
        return this.b;
    }

    public static a d() {
        return new a();
    }
}

