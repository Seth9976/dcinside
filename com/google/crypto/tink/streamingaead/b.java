package com.google.crypto.tink.streamingaead;

import com.google.crypto.tink.Q;
import com.google.crypto.tink.internal.h;
import com.google.crypto.tink.internal.r;
import com.google.crypto.tink.proto.O;
import com.google.crypto.tink.proto.P;
import com.google.crypto.tink.proto.T;
import com.google.crypto.tink.proto.Y0;
import com.google.crypto.tink.proto.k2.c;
import com.google.crypto.tink.shaded.protobuf.R0;
import com.google.crypto.tink.shaded.protobuf.V;
import com.google.crypto.tink.shaded.protobuf.u;
import com.google.crypto.tink.shaded.protobuf.y0;
import com.google.crypto.tink.subtle.L;
import com.google.crypto.tink.subtle.b0;
import com.google.crypto.tink.subtle.d;
import com.google.crypto.tink.t;
import j..util.DesugarCollections;
import java.io.IOException;
import java.io.InputStream;
import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

public final class b extends h {
    private static final int d = 7;
    private static final int e = 16;

    b() {
        class a extends r {
            a(Class class0) {
            }

            @Override  // com.google.crypto.tink.internal.r
            public Object a(R0 r00) throws GeneralSecurityException {
                return this.c(((O)r00));
            }

            public Q c(O o0) throws GeneralSecurityException {
                return new d(o0.c().a0(), p.a(o0.a().B()), o0.a().K(), o0.a().G(), 0);
            }
        }

        r[] arr_r = {new a(Q.class)};
        super(O.class, arr_r);
    }

    @Override  // com.google.crypto.tink.internal.h
    public String d() [...] // 潜在的解密器

    @Override  // com.google.crypto.tink.internal.h
    public int f() [...] // Inlined contents

    @Override  // com.google.crypto.tink.internal.h
    public com.google.crypto.tink.internal.h.a g() {
        class com.google.crypto.tink.streamingaead.b.b extends com.google.crypto.tink.internal.h.a {
            final b b;

            com.google.crypto.tink.streamingaead.b.b(Class class0) {
                super(class0);
            }

            @Override  // com.google.crypto.tink.internal.h$a
            public R0 a(R0 r00) throws GeneralSecurityException {
                return this.h(((P)r00));
            }

            @Override  // com.google.crypto.tink.internal.h$a
            public R0 b(R0 r00, InputStream inputStream0) throws GeneralSecurityException {
                return this.i(((P)r00), inputStream0);
            }

            @Override  // com.google.crypto.tink.internal.h$a
            public Map d() throws GeneralSecurityException {
                HashMap hashMap0 = new HashMap();
                hashMap0.put("AES128_GCM_HKDF_4KB", new com.google.crypto.tink.internal.h.a.a(b.r(16, Y0.e, 16, 0x1000), com.google.crypto.tink.t.b.c));
                hashMap0.put("AES128_GCM_HKDF_1MB", new com.google.crypto.tink.internal.h.a.a(b.r(16, Y0.e, 16, 0x100000), com.google.crypto.tink.t.b.c));
                hashMap0.put("AES256_GCM_HKDF_4KB", new com.google.crypto.tink.internal.h.a.a(b.r(0x20, Y0.e, 0x20, 0x1000), com.google.crypto.tink.t.b.c));
                hashMap0.put("AES256_GCM_HKDF_1MB", new com.google.crypto.tink.internal.h.a.a(b.r(0x20, Y0.e, 0x20, 0x100000), com.google.crypto.tink.t.b.c));
                return DesugarCollections.unmodifiableMap(hashMap0);
            }

            @Override  // com.google.crypto.tink.internal.h$a
            public R0 e(u u0) throws y0 {
                return this.j(u0);
            }

            @Override  // com.google.crypto.tink.internal.h$a
            public void g(R0 r00) throws GeneralSecurityException {
                this.k(((P)r00));
            }

            public O h(P p0) throws GeneralSecurityException {
                return (O)O.Q2().U1(u.p(L.c(p0.d()))).W1(p0.a()).X1(0).B1();
            }

            public O i(P p0, InputStream inputStream0) throws GeneralSecurityException {
                b0.j(p0.getVersion(), 0);
                byte[] arr_b = new byte[p0.d()];
                try {
                    com.google.crypto.tink.internal.h.a.f(inputStream0, arr_b);
                    return (O)O.Q2().U1(u.p(arr_b)).W1(p0.a()).X1(0).B1();
                }
                catch(IOException iOException0) {
                    throw new GeneralSecurityException("Reading pseudorandomness failed", iOException0);
                }
            }

            public P j(u u0) throws y0 {
                return P.V2(u0, V.d());
            }

            public void k(P p0) throws GeneralSecurityException {
                if(p0.d() < 16) {
                    throw new GeneralSecurityException("key_size must be at least 16 bytes");
                }
                b.w(p0.a());
            }
        }

        return new com.google.crypto.tink.streamingaead.b.b(this, P.class);
    }

    @Override  // com.google.crypto.tink.internal.h
    public c h() {
        return c.c;
    }

    @Override  // com.google.crypto.tink.internal.h
    public R0 i(u u0) throws y0 {
        return this.t(u0);
    }

    @Override  // com.google.crypto.tink.internal.h
    public void k(R0 r00) throws GeneralSecurityException {
        this.v(((O)r00));
    }

    public static final t n() {
        return b.s(16, Y0.e, 16, 0x100000);
    }

    public static final t o() {
        return b.s(16, Y0.e, 16, 0x1000);
    }

    public static final t p() {
        return b.s(0x20, Y0.e, 0x20, 0x100000);
    }

    public static final t q() {
        return b.s(0x20, Y0.e, 0x20, 0x1000);
    }

    private static P r(int v, Y0 y00, int v1, int v2) {
        T t0 = (T)T.P2().T1(v2).U1(v1).V1(y00).B1();
        return (P)P.Q2().U1(v).W1(t0).B1();
    }

    // 去混淆评级： 低(20)
    private static t s(int v, Y0 y00, int v1, int v2) {
        return t.a("type.googleapis.com/google.crypto.tink.AesGcmHkdfStreamingKey", b.r(v, y00, v1, v2).toByteArray(), com.google.crypto.tink.t.b.c);
    }

    public O t(u u0) throws y0 {
        return O.V2(u0, V.d());
    }

    public static void u(boolean z) throws GeneralSecurityException {
        com.google.crypto.tink.O.D(new b(), z);
    }

    public void v(O o0) throws GeneralSecurityException {
        b0.j(o0.getVersion(), 0);
        b.w(o0.a());
    }

    private static void w(T t0) throws GeneralSecurityException {
        b0.a(t0.K());
        if(t0.B() == Y0.b) {
            throw new GeneralSecurityException("unknown HKDF hash type");
        }
        if(t0.G() < t0.K() + 25) {
            throw new GeneralSecurityException("ciphertext_segment_size must be at least (derived_key_size + NONCE_PREFIX_IN_BYTES + TAG_SIZE_IN_BYTES + 2)");
        }
    }
}

