package com.google.android.datatransport.runtime.firebase.transport;

import com.google.firebase.encoders.proto.d;

public final class b {
    public static final class a {
        private e a;

        a() {
            this.a = null;
        }

        public b a() {
            return new b(this.a);
        }

        public a b(e e0) {
            this.a = e0;
            return this;
        }
    }

    private final e a;
    private static final b b;

    static {
        b.b = new a().a();
    }

    b(e e0) {
        this.a = e0;
    }

    public static b a() {
        return b.b;
    }

    @c2.a.b
    public e b() {
        return this.a == null ? e.b() : this.a;
    }

    @c2.a.a(name = "storageMetrics")
    @d(tag = 1)
    public e c() {
        return this.a;
    }

    public static a d() {
        return new a();
    }
}

