package com.google.android.datatransport.runtime.firebase.transport;

import com.google.android.datatransport.runtime.n;
import j..util.DesugarCollections;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

public final class a {
    public static final class com.google.android.datatransport.runtime.firebase.transport.a.a {
        private f a;
        private List b;
        private b c;
        private String d;

        com.google.android.datatransport.runtime.firebase.transport.a.a() {
            this.a = null;
            this.b = new ArrayList();
            this.c = null;
            this.d = "";
        }

        public com.google.android.datatransport.runtime.firebase.transport.a.a a(d d0) {
            this.b.add(d0);
            return this;
        }

        public a b() {
            return new a(this.a, DesugarCollections.unmodifiableList(this.b), this.c, this.d);
        }

        public com.google.android.datatransport.runtime.firebase.transport.a.a c(String s) {
            this.d = s;
            return this;
        }

        public com.google.android.datatransport.runtime.firebase.transport.a.a d(b b0) {
            this.c = b0;
            return this;
        }

        public com.google.android.datatransport.runtime.firebase.transport.a.a e(List list0) {
            this.b = list0;
            return this;
        }

        public com.google.android.datatransport.runtime.firebase.transport.a.a f(f f0) {
            this.a = f0;
            return this;
        }
    }

    private final f a;
    private final List b;
    private final b c;
    private final String d;
    private static final a e;

    static {
        a.e = new com.google.android.datatransport.runtime.firebase.transport.a.a().b();
    }

    a(f f0, List list0, b b0, String s) {
        this.a = f0;
        this.b = list0;
        this.c = b0;
        this.d = s;
    }

    @com.google.firebase.encoders.proto.d(tag = 4)
    public String a() {
        return this.d;
    }

    public static a b() {
        return a.e;
    }

    @c2.a.b
    public b c() {
        return this.c == null ? b.a() : this.c;
    }

    @c2.a.a(name = "globalMetrics")
    @com.google.firebase.encoders.proto.d(tag = 3)
    public b d() {
        return this.c;
    }

    @c2.a.a(name = "logSourceMetrics")
    @com.google.firebase.encoders.proto.d(tag = 2)
    public List e() {
        return this.b;
    }

    @c2.a.b
    public f f() {
        return this.a == null ? f.a() : this.a;
    }

    @c2.a.a(name = "window")
    @com.google.firebase.encoders.proto.d(tag = 1)
    public f g() {
        return this.a;
    }

    public static com.google.android.datatransport.runtime.firebase.transport.a.a h() {
        return new com.google.android.datatransport.runtime.firebase.transport.a.a();
    }

    public byte[] i() [...] // 潜在的解密器

    public void j(OutputStream outputStream0) throws IOException {
        n.a(this, outputStream0);
    }
}

