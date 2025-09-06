package com.google.crypto.tink.hybrid;

import com.google.crypto.tink.O;
import com.google.crypto.tink.aead.g;
import com.google.crypto.tink.internal.r;
import com.google.crypto.tink.internal.t;
import com.google.crypto.tink.j;
import com.google.crypto.tink.proto.B0;
import com.google.crypto.tink.proto.E0;
import com.google.crypto.tink.proto.F2;
import com.google.crypto.tink.proto.G0;
import com.google.crypto.tink.proto.I0;
import com.google.crypto.tink.proto.K0;
import com.google.crypto.tink.proto.M0;
import com.google.crypto.tink.proto.V0;
import com.google.crypto.tink.proto.Y0;
import com.google.crypto.tink.proto.n2;
import com.google.crypto.tink.proto.q0;
import com.google.crypto.tink.shaded.protobuf.R0;
import com.google.crypto.tink.shaded.protobuf.V;
import com.google.crypto.tink.shaded.protobuf.y0;
import com.google.crypto.tink.subtle.b0;
import com.google.crypto.tink.subtle.o;
import com.google.crypto.tink.subtle.w;
import com.google.crypto.tink.t.b;
import com.google.crypto.tink.u;
import j..util.DesugarCollections;
import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECPoint;
import java.util.HashMap;
import java.util.Map;

public final class a extends t {
    static class c {
        static final int[] a;

        static {
            int[] arr_v = new int[b.values().length];
            c.a = arr_v;
            try {
                arr_v[b.a.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                c.a[b.b.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                c.a[b.c.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                c.a[b.d.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
        }
    }

    private static final byte[] e;

    static {
        a.e = new byte[0];
    }

    a() {
        class com.google.crypto.tink.hybrid.a.a extends r {
            com.google.crypto.tink.hybrid.a.a(Class class0) {
            }

            @Override  // com.google.crypto.tink.internal.r
            public Object a(R0 r00) throws GeneralSecurityException {
                return this.c(((I0)r00));
            }

            public j c(I0 i00) throws GeneralSecurityException {
                G0 g00 = i00.e().a();
                M0 m00 = g00.F0();
                ECPrivateKey eCPrivateKey0 = w.m(k.a(m00.d1()), i00.c().a0());
                l l0 = new l(g00.o0().C0());
                return new o(eCPrivateKey0, m00.t0().a0(), k.b(m00.B()), k.c(g00.P0()), l0);
            }
        }

        r[] arr_r = {new com.google.crypto.tink.hybrid.a.a(j.class)};
        super(I0.class, K0.class, arr_r);
    }

    public void A(I0 i00) throws GeneralSecurityException {
        if(i00.c().isEmpty()) {
            throw new GeneralSecurityException("invalid ECIES private key");
        }
        b0.j(i00.getVersion(), 0);
        k.d(i00.e().a());
    }

    @Override  // com.google.crypto.tink.internal.h
    public String d() [...] // 潜在的解密器

    @Override  // com.google.crypto.tink.internal.h
    public int f() [...] // Inlined contents

    @Override  // com.google.crypto.tink.internal.h
    public com.google.crypto.tink.internal.h.a g() {
        class com.google.crypto.tink.hybrid.a.b extends com.google.crypto.tink.internal.h.a {
            final a b;

            com.google.crypto.tink.hybrid.a.b(Class class0) {
                super(class0);
            }

            @Override  // com.google.crypto.tink.internal.h$a
            public R0 a(R0 r00) throws GeneralSecurityException {
                return this.h(((E0)r00));
            }

            @Override  // com.google.crypto.tink.internal.h$a
            public Map d() throws GeneralSecurityException {
                HashMap hashMap0 = new HashMap();
                com.google.crypto.tink.t t0 = u.a("AES128_GCM");
                hashMap0.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM", a.p(V0.c, Y0.e, q0.c, t0, new byte[0], b.a));
                com.google.crypto.tink.t t1 = u.a("AES128_GCM");
                hashMap0.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM_RAW", a.p(V0.c, Y0.e, q0.c, t1, new byte[0], b.c));
                com.google.crypto.tink.t t2 = u.a("AES128_GCM");
                hashMap0.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_GCM", a.p(V0.c, Y0.e, q0.d, t2, new byte[0], b.a));
                com.google.crypto.tink.t t3 = u.a("AES128_GCM");
                hashMap0.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_GCM_RAW", a.p(V0.c, Y0.e, q0.d, t3, new byte[0], b.c));
                com.google.crypto.tink.t t4 = u.a("AES128_GCM");
                hashMap0.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM_COMPRESSED_WITHOUT_PREFIX", a.p(V0.c, Y0.e, q0.d, t4, new byte[0], b.c));
                com.google.crypto.tink.t t5 = u.a("AES128_CTR_HMAC_SHA256");
                hashMap0.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256", a.p(V0.c, Y0.e, q0.c, t5, new byte[0], b.a));
                com.google.crypto.tink.t t6 = u.a("AES128_CTR_HMAC_SHA256");
                hashMap0.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256_RAW", a.p(V0.c, Y0.e, q0.c, t6, new byte[0], b.c));
                com.google.crypto.tink.t t7 = u.a("AES128_CTR_HMAC_SHA256");
                hashMap0.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256", a.p(V0.c, Y0.e, q0.d, t7, new byte[0], b.a));
                com.google.crypto.tink.t t8 = u.a("AES128_CTR_HMAC_SHA256");
                hashMap0.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256_RAW", a.p(V0.c, Y0.e, q0.d, t8, new byte[0], b.c));
                return DesugarCollections.unmodifiableMap(hashMap0);
            }

            @Override  // com.google.crypto.tink.internal.h$a
            public R0 e(com.google.crypto.tink.shaded.protobuf.u u0) throws y0 {
                return this.i(u0);
            }

            @Override  // com.google.crypto.tink.internal.h$a
            public void g(R0 r00) throws GeneralSecurityException {
                this.j(((E0)r00));
            }

            public I0 h(E0 e00) throws GeneralSecurityException {
                KeyPair keyPair0 = w.j(k.a(e00.a().F0().d1()));
                ECPublicKey eCPublicKey0 = (ECPublicKey)keyPair0.getPublic();
                ECPrivateKey eCPrivateKey0 = (ECPrivateKey)keyPair0.getPrivate();
                ECPoint eCPoint0 = eCPublicKey0.getW();
                K0 k00 = (K0)K0.T2().X1(0).W1(e00.a()).Y1(com.google.crypto.tink.shaded.protobuf.u.p(eCPoint0.getAffineX().toByteArray())).Z1(com.google.crypto.tink.shaded.protobuf.u.p(eCPoint0.getAffineY().toByteArray())).B1();
                return (I0)I0.Q2().X1(0).W1(k00).U1(com.google.crypto.tink.shaded.protobuf.u.p(eCPrivateKey0.getS().toByteArray())).B1();
            }

            public E0 i(com.google.crypto.tink.shaded.protobuf.u u0) throws y0 {
                return E0.P2(u0, V.d());
            }

            public void j(E0 e00) throws GeneralSecurityException {
                k.d(e00.a());
            }
        }

        return new com.google.crypto.tink.hybrid.a.b(this, E0.class);
    }

    @Override  // com.google.crypto.tink.internal.h
    public com.google.crypto.tink.proto.k2.c h() {
        return com.google.crypto.tink.proto.k2.c.d;
    }

    @Override  // com.google.crypto.tink.internal.h
    public R0 i(com.google.crypto.tink.shaded.protobuf.u u0) throws y0 {
        return this.v(u0);
    }

    @Override  // com.google.crypto.tink.internal.h
    public void k(R0 r00) throws GeneralSecurityException {
        this.A(((I0)r00));
    }

    @Override  // com.google.crypto.tink.internal.t
    public R0 l(R0 r00) throws GeneralSecurityException {
        return this.u(((I0)r00));
    }

    static byte[] n() [...] // 潜在的解密器

    private static com.google.crypto.tink.internal.h.a.a p(V0 v00, Y0 y00, q0 q00, com.google.crypto.tink.t t0, byte[] arr_b, b t$b0) {
        return new com.google.crypto.tink.internal.h.a.a(((E0)E0.K2().T1(a.r(v00, y00, q00, t0, arr_b)).B1()), t$b0);
    }

    // 去混淆评级： 低(20)
    private static com.google.crypto.tink.t q(V0 v00, Y0 y00, q0 q00, com.google.crypto.tink.t t0, b t$b0, byte[] arr_b) {
        return com.google.crypto.tink.t.a("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey", ((E0)E0.K2().T1(a.r(v00, y00, q00, t0, arr_b)).B1()).toByteArray(), t$b0);
    }

    static G0 r(V0 v00, Y0 y00, q0 q00, com.google.crypto.tink.t t0, byte[] arr_b) {
        M0 m00 = (M0)M0.Q2().T1(v00).V1(y00).X1(com.google.crypto.tink.shaded.protobuf.u.p(arr_b)).B1();
        n2 n20 = (n2)n2.Q2().V1(t0.e()).X1(com.google.crypto.tink.shaded.protobuf.u.p(t0.f())).T1(a.z(t0.c())).B1();
        B0 b00 = (B0)B0.K2().T1(n20).B1();
        return (G0)G0.T2().a2(m00).W1(b00).X1(q00).B1();
    }

    public static final com.google.crypto.tink.t s() {
        com.google.crypto.tink.t t0 = g.m();
        return a.q(V0.c, Y0.e, q0.c, t0, b.a, a.e);
    }

    public static final com.google.crypto.tink.t t() {
        com.google.crypto.tink.t t0 = com.google.crypto.tink.aead.r.m();
        return a.q(V0.c, Y0.e, q0.c, t0, b.a, a.e);
    }

    public K0 u(I0 i00) throws GeneralSecurityException {
        return i00.e();
    }

    public I0 v(com.google.crypto.tink.shaded.protobuf.u u0) throws y0 {
        return I0.V2(u0, V.d());
    }

    public static final com.google.crypto.tink.t w() {
        com.google.crypto.tink.t t0 = g.m();
        return a.q(V0.c, Y0.e, q0.d, t0, b.c, a.e);
    }

    public static final com.google.crypto.tink.t x() {
        com.google.crypto.tink.t t0 = com.google.crypto.tink.aead.r.m();
        return a.q(V0.c, Y0.e, q0.d, t0, b.c, a.e);
    }

    public static void y(boolean z) throws GeneralSecurityException {
        O.A(new a(), new com.google.crypto.tink.hybrid.b(), z);
    }

    private static F2 z(b t$b0) {
        switch(t$b0) {
            case 1: {
                return F2.c;
            }
            case 2: {
                return F2.d;
            }
            case 3: {
                return F2.e;
            }
            case 4: {
                return F2.f;
            }
            default: {
                throw new IllegalArgumentException("Unknown output prefix type");
            }
        }
    }
}

