package com.google.android.datatransport.runtime.firebase.transport;

import com.google.firebase.encoders.proto.d;

public final class f {
    public static final class a {
        private long a;
        private long b;

        a() {
            this.a = 0L;
            this.b = 0L;
        }

        public f a() {
            return new f(this.a, this.b);
        }

        public a b(long v) {
            this.b = v;
            return this;
        }

        public a c(long v) {
            this.a = v;
            return this;
        }
    }

    private final long a;
    private final long b;
    private static final f c;

    static {
        f.c = new a().a();
    }

    f(long v, long v1) {
        this.a = v;
        this.b = v1;
    }

    public static f a() {
        return f.c;
    }

    @d(tag = 2)
    public long b() {
        return this.b;
    }

    @d(tag = 1)
    public long c() {
        return this.a;
    }

    public static a d() {
        return new a();
    }
}

