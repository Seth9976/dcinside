package com.google.crypto.tink.aead;

import com.google.crypto.tink.O;
import com.google.crypto.tink.b;
import com.google.crypto.tink.internal.h;
import com.google.crypto.tink.proto.V;
import com.google.crypto.tink.proto.W;
import com.google.crypto.tink.proto.k2.c;
import com.google.crypto.tink.shaded.protobuf.R0;
import com.google.crypto.tink.shaded.protobuf.u;
import com.google.crypto.tink.shaded.protobuf.y0;
import com.google.crypto.tink.subtle.L;
import com.google.crypto.tink.subtle.b0;
import com.google.crypto.tink.subtle.e;
import com.google.crypto.tink.t;
import j..util.DesugarCollections;
import java.io.IOException;
import java.io.InputStream;
import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

public final class r extends h {
    r() {
        class a extends com.google.crypto.tink.internal.r {
            a(Class class0) {
            }

            @Override  // com.google.crypto.tink.internal.r
            public Object a(R0 r00) throws GeneralSecurityException {
                return this.c(((V)r00));
            }

            public b c(V v0) throws GeneralSecurityException {
                return new e(v0.c().a0());
            }
        }

        com.google.crypto.tink.internal.r[] arr_r = {new a(b.class)};
        super(V.class, arr_r);
    }

    @Override  // com.google.crypto.tink.internal.h
    public com.google.crypto.tink.config.internal.c.b a() {
        return com.google.crypto.tink.config.internal.c.b.b;
    }

    @Override  // com.google.crypto.tink.internal.h
    public String d() [...] // 潜在的解密器

    @Override  // com.google.crypto.tink.internal.h
    public int f() [...] // Inlined contents

    @Override  // com.google.crypto.tink.internal.h
    public com.google.crypto.tink.internal.h.a g() {
        class com.google.crypto.tink.aead.r.b extends com.google.crypto.tink.internal.h.a {
            final r b;

            com.google.crypto.tink.aead.r.b(Class class0) {
                super(class0);
            }

            @Override  // com.google.crypto.tink.internal.h$a
            public R0 a(R0 r00) throws GeneralSecurityException {
                return this.h(((W)r00));
            }

            @Override  // com.google.crypto.tink.internal.h$a
            public R0 b(R0 r00, InputStream inputStream0) throws GeneralSecurityException {
                return this.i(((W)r00), inputStream0);
            }

            @Override  // com.google.crypto.tink.internal.h$a
            public Map d() throws GeneralSecurityException {
                HashMap hashMap0 = new HashMap();
                hashMap0.put("AES128_GCM", r.o(16, com.google.crypto.tink.t.b.a));
                hashMap0.put("AES128_GCM_RAW", r.o(16, com.google.crypto.tink.t.b.c));
                hashMap0.put("AES256_GCM", r.o(0x20, com.google.crypto.tink.t.b.a));
                hashMap0.put("AES256_GCM_RAW", r.o(0x20, com.google.crypto.tink.t.b.c));
                return DesugarCollections.unmodifiableMap(hashMap0);
            }

            @Override  // com.google.crypto.tink.internal.h$a
            public R0 e(u u0) throws y0 {
                return this.j(u0);
            }

            @Override  // com.google.crypto.tink.internal.h$a
            public void g(R0 r00) throws GeneralSecurityException {
                this.k(((W)r00));
            }

            public V h(W w0) throws GeneralSecurityException {
                return (V)V.L2().S1(u.p(L.c(w0.d()))).T1(0).B1();
            }

            public V i(W w0, InputStream inputStream0) throws GeneralSecurityException {
                b0.j(w0.getVersion(), 0);
                byte[] arr_b = new byte[w0.d()];
                try {
                    com.google.crypto.tink.internal.h.a.f(inputStream0, arr_b);
                    return (V)V.L2().S1(u.p(arr_b)).T1(0).B1();
                }
                catch(IOException iOException0) {
                    throw new GeneralSecurityException("Reading pseudorandomness failed", iOException0);
                }
            }

            public W j(u u0) throws y0 {
                return W.Q2(u0, com.google.crypto.tink.shaded.protobuf.V.d());
            }

            public void k(W w0) throws GeneralSecurityException {
                b0.a(w0.d());
            }
        }

        return new com.google.crypto.tink.aead.r.b(this, W.class);
    }

    @Override  // com.google.crypto.tink.internal.h
    public c h() {
        return c.c;
    }

    @Override  // com.google.crypto.tink.internal.h
    public R0 i(u u0) throws y0 {
        return this.q(u0);
    }

    @Override  // com.google.crypto.tink.internal.h
    public void k(R0 r00) throws GeneralSecurityException {
        this.u(((V)r00));
    }

    public static final t m() {
        return r.p(16, com.google.crypto.tink.t.b.a);
    }

    public static final t n() {
        return r.p(0x20, com.google.crypto.tink.t.b.a);
    }

    private static com.google.crypto.tink.internal.h.a.a o(int v, com.google.crypto.tink.t.b t$b0) {
        return new com.google.crypto.tink.internal.h.a.a(((W)W.L2().S1(v).B1()), t$b0);
    }

    // 去混淆评级： 低(20)
    private static t p(int v, com.google.crypto.tink.t.b t$b0) {
        return t.a("type.googleapis.com/google.crypto.tink.AesGcmKey", ((W)W.L2().S1(v).B1()).toByteArray(), t$b0);
    }

    public V q(u u0) throws y0 {
        return V.Q2(u0, com.google.crypto.tink.shaded.protobuf.V.d());
    }

    public static final t r() {
        return r.p(16, com.google.crypto.tink.t.b.c);
    }

    public static final t s() {
        return r.p(0x20, com.google.crypto.tink.t.b.c);
    }

    public static void t(boolean z) throws GeneralSecurityException {
        O.D(new r(), z);
        x.g();
    }

    public void u(V v0) throws GeneralSecurityException {
        b0.j(v0.getVersion(), 0);
        b0.a(v0.c().size());
    }
}

