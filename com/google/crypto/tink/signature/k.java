package com.google.crypto.tink.signature;

import com.google.crypto.tink.M;
import com.google.crypto.tink.O;
import com.google.crypto.tink.config.internal.c.b;
import com.google.crypto.tink.internal.r;
import com.google.crypto.tink.internal.t;
import com.google.crypto.tink.proto.A0;
import com.google.crypto.tink.proto.V0;
import com.google.crypto.tink.proto.Y0;
import com.google.crypto.tink.proto.k2.c;
import com.google.crypto.tink.proto.s0;
import com.google.crypto.tink.proto.u0;
import com.google.crypto.tink.proto.w0;
import com.google.crypto.tink.proto.y0;
import com.google.crypto.tink.shaded.protobuf.R0;
import com.google.crypto.tink.shaded.protobuf.V;
import com.google.crypto.tink.shaded.protobuf.u;
import com.google.crypto.tink.subtle.S;
import com.google.crypto.tink.subtle.b0;
import com.google.crypto.tink.subtle.l;
import com.google.crypto.tink.subtle.w;
import j..util.DesugarCollections;
import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECPoint;
import java.util.HashMap;
import java.util.Map;

public final class k extends t {
    k() {
        class a extends r {
            a(Class class0) {
            }

            @Override  // com.google.crypto.tink.internal.r
            public Object a(R0 r00) throws GeneralSecurityException {
                return this.c(((w0)r00));
            }

            public M c(w0 w00) throws GeneralSecurityException {
                ECPrivateKey eCPrivateKey0 = w.m(com.google.crypto.tink.signature.internal.a.a(w00.e().a().T0()), w00.c().a0());
                S.a(eCPrivateKey0, w.p(com.google.crypto.tink.signature.internal.a.a(w00.e().a().T0()), w00.e().t().a0(), w00.e().u().a0()), com.google.crypto.tink.signature.internal.a.c(w00.e().a().F()), com.google.crypto.tink.signature.internal.a.b(w00.e().a().a0()));
                return new l(eCPrivateKey0, com.google.crypto.tink.signature.internal.a.c(w00.e().a().F()), com.google.crypto.tink.signature.internal.a.b(w00.e().a().a0()));
            }
        }

        r[] arr_r = {new a(M.class)};
        super(w0.class, y0.class, arr_r);
    }

    @Override  // com.google.crypto.tink.internal.h
    public b a() {
        return b.b;
    }

    @Override  // com.google.crypto.tink.internal.h
    public String d() [...] // 潜在的解密器

    @Override  // com.google.crypto.tink.internal.h
    public int f() [...] // Inlined contents

    @Override  // com.google.crypto.tink.internal.h
    public com.google.crypto.tink.internal.h.a g() {
        class com.google.crypto.tink.signature.k.b extends com.google.crypto.tink.internal.h.a {
            final k b;

            com.google.crypto.tink.signature.k.b(Class class0) {
                super(class0);
            }

            @Override  // com.google.crypto.tink.internal.h$a
            public R0 a(R0 r00) throws GeneralSecurityException {
                return this.h(((s0)r00));
            }

            @Override  // com.google.crypto.tink.internal.h$a
            public Map d() throws GeneralSecurityException {
                HashMap hashMap0 = new HashMap();
                hashMap0.put("ECDSA_P256", k.o(Y0.e, V0.c, A0.d, com.google.crypto.tink.t.b.a));
                hashMap0.put("ECDSA_P256_IEEE_P1363", k.o(Y0.e, V0.c, A0.c, com.google.crypto.tink.t.b.a));
                hashMap0.put("ECDSA_P256_RAW", k.o(Y0.e, V0.c, A0.c, com.google.crypto.tink.t.b.c));
                hashMap0.put("ECDSA_P256_IEEE_P1363_WITHOUT_PREFIX", k.o(Y0.e, V0.c, A0.c, com.google.crypto.tink.t.b.c));
                hashMap0.put("ECDSA_P384", k.o(Y0.f, V0.d, A0.d, com.google.crypto.tink.t.b.a));
                hashMap0.put("ECDSA_P384_IEEE_P1363", k.o(Y0.f, V0.d, A0.c, com.google.crypto.tink.t.b.a));
                hashMap0.put("ECDSA_P384_SHA512", k.o(Y0.f, V0.d, A0.d, com.google.crypto.tink.t.b.a));
                hashMap0.put("ECDSA_P384_SHA384", k.o(Y0.d, V0.d, A0.d, com.google.crypto.tink.t.b.a));
                hashMap0.put("ECDSA_P521", k.o(Y0.f, V0.e, A0.d, com.google.crypto.tink.t.b.a));
                hashMap0.put("ECDSA_P521_IEEE_P1363", k.o(Y0.f, V0.e, A0.c, com.google.crypto.tink.t.b.a));
                return DesugarCollections.unmodifiableMap(hashMap0);
            }

            @Override  // com.google.crypto.tink.internal.h$a
            public R0 e(u u0) throws com.google.crypto.tink.shaded.protobuf.y0 {
                return this.i(u0);
            }

            @Override  // com.google.crypto.tink.internal.h$a
            public void g(R0 r00) throws GeneralSecurityException {
                this.j(((s0)r00));
            }

            public w0 h(s0 s00) throws GeneralSecurityException {
                u0 u00 = s00.a();
                KeyPair keyPair0 = w.j(com.google.crypto.tink.signature.internal.a.a(u00.T0()));
                ECPublicKey eCPublicKey0 = (ECPublicKey)keyPair0.getPublic();
                ECPrivateKey eCPrivateKey0 = (ECPrivateKey)keyPair0.getPrivate();
                ECPoint eCPoint0 = eCPublicKey0.getW();
                y0 y00 = (y0)y0.T2().X1(0).W1(u00).Y1(u.p(eCPoint0.getAffineX().toByteArray())).Z1(u.p(eCPoint0.getAffineY().toByteArray())).B1();
                return (w0)w0.Q2().X1(0).W1(y00).U1(u.p(eCPrivateKey0.getS().toByteArray())).B1();
            }

            public s0 i(u u0) throws com.google.crypto.tink.shaded.protobuf.y0 {
                return s0.S2(u0, V.d());
            }

            public void j(s0 s00) throws GeneralSecurityException {
                com.google.crypto.tink.signature.internal.a.e(s00.a());
            }
        }

        return new com.google.crypto.tink.signature.k.b(this, s0.class);
    }

    @Override  // com.google.crypto.tink.internal.h
    public c h() {
        return c.d;
    }

    @Override  // com.google.crypto.tink.internal.h
    public R0 i(u u0) throws com.google.crypto.tink.shaded.protobuf.y0 {
        return this.s(u0);
    }

    @Override  // com.google.crypto.tink.internal.h
    public void k(R0 r00) throws GeneralSecurityException {
        this.v(((w0)r00));
    }

    @Override  // com.google.crypto.tink.internal.t
    public R0 l(R0 r00) throws GeneralSecurityException {
        return this.r(((w0)r00));
    }

    private static com.google.crypto.tink.internal.h.a.a o(Y0 y00, V0 v00, A0 a00, com.google.crypto.tink.t.b t$b0) {
        u0 u00 = (u0)u0.R2().X1(y00).T1(v00).V1(a00).B1();
        return new com.google.crypto.tink.internal.h.a.a(((s0)s0.N2().U1(u00).B1()), t$b0);
    }

    public static com.google.crypto.tink.t p(Y0 y00, V0 v00, A0 a00, com.google.crypto.tink.t.b t$b0) {
        u0 u00 = (u0)u0.R2().X1(y00).T1(v00).V1(a00).B1();
        return com.google.crypto.tink.t.a("type.googleapis.com/google.crypto.tink.EcdsaPrivateKey", ((s0)s0.N2().U1(u00).B1()).toByteArray(), t$b0);
    }

    public static final com.google.crypto.tink.t q() {
        return k.p(Y0.e, V0.c, A0.d, com.google.crypto.tink.t.b.a);
    }

    public y0 r(w0 w00) throws GeneralSecurityException {
        return w00.e();
    }

    public w0 s(u u0) throws com.google.crypto.tink.shaded.protobuf.y0 {
        return w0.V2(u0, V.d());
    }

    public static final com.google.crypto.tink.t t() {
        return k.p(Y0.e, V0.c, A0.c, com.google.crypto.tink.t.b.c);
    }

    public static void u(boolean z) throws GeneralSecurityException {
        O.A(new k(), new com.google.crypto.tink.signature.l(), z);
        i.m();
    }

    public void v(w0 w00) throws GeneralSecurityException {
        b0.j(w00.getVersion(), 0);
        com.google.crypto.tink.signature.internal.a.e(w00.e().a());
    }
}

