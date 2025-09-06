package com.google.android.datatransport.runtime.firebase.transport;

import com.google.firebase.encoders.proto.d;

public final class c {
    public static final class a {
        private long a;
        private b b;

        a() {
            this.a = 0L;
            this.b = b.b;
        }

        public c a() {
            return new c(this.a, this.b);
        }

        public a b(long v) {
            this.a = v;
            return this;
        }

        public a c(b c$b0) {
            this.b = c$b0;
            return this;
        }
    }

    public static enum b implements com.google.firebase.encoders.proto.c {
        REASON_UNKNOWN(0),
        MESSAGE_TOO_OLD(1),
        CACHE_FULL(2),
        PAYLOAD_TOO_BIG(3),
        MAX_RETRIES_REACHED(4),
        INVALID_PAYLOD(5),
        SERVER_ERROR(6);

        private final int a;

        private b(int v1) {
            this.a = v1;
        }

        @Override  // com.google.firebase.encoders.proto.c
        public int getNumber() {
            return this.a;
        }
    }

    private final long a;
    private final b b;
    private static final c c;

    static {
        c.c = new a().a();
    }

    c(long v, b c$b0) {
        this.a = v;
        this.b = c$b0;
    }

    public static c a() {
        return c.c;
    }

    @d(tag = 1)
    public long b() {
        return this.a;
    }

    @d(tag = 3)
    public b c() {
        return this.b;
    }

    public static a d() {
        return new a();
    }
}

