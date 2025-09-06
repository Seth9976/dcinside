package com.google.firebase.messaging.reporting;

import com.google.firebase.encoders.proto.d;
import com.google.firebase.messaging.T;
import java.io.IOException;
import java.io.OutputStream;

public final class b {
    public static final class a {
        private com.google.firebase.messaging.reporting.a a;

        a() {
            this.a = null;
        }

        public b a() {
            return new b(this.a);
        }

        public a b(com.google.firebase.messaging.reporting.a a0) {
            this.a = a0;
            return this;
        }
    }

    private final com.google.firebase.messaging.reporting.a a;
    private static final b b;

    static {
        b.b = new a().a();
    }

    b(com.google.firebase.messaging.reporting.a a0) {
        this.a = a0;
    }

    public static b a() {
        return b.b;
    }

    @c2.a.b
    public com.google.firebase.messaging.reporting.a b() {
        return this.a == null ? com.google.firebase.messaging.reporting.a.f() : this.a;
    }

    @c2.a.a(name = "messagingClientEvent")
    @d(tag = 1)
    public com.google.firebase.messaging.reporting.a c() {
        return this.a;
    }

    public static a d() {
        return new a();
    }

    public byte[] e() [...] // 潜在的解密器

    public void f(OutputStream outputStream0) throws IOException {
        T.a(this, outputStream0);
    }
}

