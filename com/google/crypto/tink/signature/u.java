package com.google.crypto.tink.signature;

import com.google.crypto.tink.M;
import com.google.crypto.tink.O;
import com.google.crypto.tink.config.internal.c.b;
import com.google.crypto.tink.internal.r;
import com.google.crypto.tink.internal.t;
import com.google.crypto.tink.proto.J2;
import com.google.crypto.tink.proto.L2;
import com.google.crypto.tink.proto.N2;
import com.google.crypto.tink.proto.P2;
import com.google.crypto.tink.proto.Y0;
import com.google.crypto.tink.proto.k2.c;
import com.google.crypto.tink.shaded.protobuf.R0;
import com.google.crypto.tink.shaded.protobuf.V;
import com.google.crypto.tink.shaded.protobuf.y0;
import com.google.crypto.tink.subtle.N;
import com.google.crypto.tink.subtle.S;
import com.google.crypto.tink.subtle.b0;
import com.google.crypto.tink.subtle.y;
import j..util.DesugarCollections;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.RSAKeyGenParameterSpec;
import java.security.spec.RSAPrivateCrtKeySpec;
import java.security.spec.RSAPublicKeySpec;
import java.util.HashMap;
import java.util.Map;

public final class u extends t {
    u() {
        class a extends r {
            a(Class class0) {
            }

            @Override  // com.google.crypto.tink.internal.r
            public Object a(R0 r00) throws GeneralSecurityException {
                return this.c(((N2)r00));
            }

            public M c(N2 n20) throws GeneralSecurityException {
                KeyFactory keyFactory0 = (KeyFactory)y.h.a("RSA");
                RSAPrivateCrtKey rSAPrivateCrtKey0 = (RSAPrivateCrtKey)keyFactory0.generatePrivate(new RSAPrivateCrtKeySpec(new BigInteger(1, n20.e().v().a0()), new BigInteger(1, n20.e().k().a0()), new BigInteger(1, n20.m().a0()), new BigInteger(1, n20.w().a0()), new BigInteger(1, n20.x().a0()), new BigInteger(1, n20.r().a0()), new BigInteger(1, n20.s().a0()), new BigInteger(1, n20.q().a0())));
                L2 l20 = n20.e().a();
                S.b(rSAPrivateCrtKey0, ((RSAPublicKey)keyFactory0.generatePublic(new RSAPublicKeySpec(new BigInteger(1, n20.e().v().a0()), new BigInteger(1, n20.e().k().a0())))), com.google.crypto.tink.signature.internal.a.c(l20.F()));
                return new N(rSAPrivateCrtKey0, com.google.crypto.tink.signature.internal.a.c(l20.F()));
            }
        }

        r[] arr_r = {new a(M.class)};
        super(N2.class, P2.class, arr_r);
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
        class com.google.crypto.tink.signature.u.b extends com.google.crypto.tink.internal.h.a {
            final u b;

            com.google.crypto.tink.signature.u.b(Class class0) {
                super(class0);
            }

            @Override  // com.google.crypto.tink.internal.h$a
            public R0 a(R0 r00) throws GeneralSecurityException {
                return this.h(((J2)r00));
            }

            @Override  // com.google.crypto.tink.internal.h$a
            public Map d() throws GeneralSecurityException {
                HashMap hashMap0 = new HashMap();
                BigInteger bigInteger0 = RSAKeyGenParameterSpec.F4;
                hashMap0.put("RSA_SSA_PKCS1_3072_SHA256_F4", new com.google.crypto.tink.internal.h.a.a(u.o(Y0.e, 0xC00, bigInteger0), com.google.crypto.tink.t.b.a));
                hashMap0.put("RSA_SSA_PKCS1_3072_SHA256_F4_RAW", new com.google.crypto.tink.internal.h.a.a(u.o(Y0.e, 0xC00, bigInteger0), com.google.crypto.tink.t.b.c));
                hashMap0.put("RSA_SSA_PKCS1_3072_SHA256_F4_WITHOUT_PREFIX", new com.google.crypto.tink.internal.h.a.a(u.o(Y0.e, 0xC00, bigInteger0), com.google.crypto.tink.t.b.c));
                hashMap0.put("RSA_SSA_PKCS1_4096_SHA512_F4", new com.google.crypto.tink.internal.h.a.a(u.o(Y0.f, 0x1000, bigInteger0), com.google.crypto.tink.t.b.a));
                hashMap0.put("RSA_SSA_PKCS1_4096_SHA512_F4_RAW", new com.google.crypto.tink.internal.h.a.a(u.o(Y0.f, 0x1000, bigInteger0), com.google.crypto.tink.t.b.c));
                return DesugarCollections.unmodifiableMap(hashMap0);
            }

            @Override  // com.google.crypto.tink.internal.h$a
            public R0 e(com.google.crypto.tink.shaded.protobuf.u u0) throws y0 {
                return this.i(u0);
            }

            @Override  // com.google.crypto.tink.internal.h$a
            public void g(R0 r00) throws GeneralSecurityException {
                this.j(((J2)r00));
            }

            public N2 h(J2 j20) throws GeneralSecurityException {
                L2 l20 = j20.a();
                KeyPairGenerator keyPairGenerator0 = (KeyPairGenerator)y.g.a("RSA");
                keyPairGenerator0.initialize(new RSAKeyGenParameterSpec(j20.n(), new BigInteger(1, j20.p().a0())));
                KeyPair keyPair0 = keyPairGenerator0.generateKeyPair();
                RSAPublicKey rSAPublicKey0 = (RSAPublicKey)keyPair0.getPublic();
                RSAPrivateCrtKey rSAPrivateCrtKey0 = (RSAPrivateCrtKey)keyPair0.getPrivate();
                P2 p20 = (P2)P2.T2().Z1(0).Y1(l20).V1(com.google.crypto.tink.shaded.protobuf.u.p(rSAPublicKey0.getPublicExponent().toByteArray())).W1(com.google.crypto.tink.shaded.protobuf.u.p(rSAPublicKey0.getModulus().toByteArray())).B1();
                return (N2)N2.f3().h2(0).f2(p20).a2(com.google.crypto.tink.shaded.protobuf.u.p(rSAPrivateCrtKey0.getPrivateExponent().toByteArray())).d2(com.google.crypto.tink.shaded.protobuf.u.p(rSAPrivateCrtKey0.getPrimeP().toByteArray())).g2(com.google.crypto.tink.shaded.protobuf.u.p(rSAPrivateCrtKey0.getPrimeQ().toByteArray())).b2(com.google.crypto.tink.shaded.protobuf.u.p(rSAPrivateCrtKey0.getPrimeExponentP().toByteArray())).c2(com.google.crypto.tink.shaded.protobuf.u.p(rSAPrivateCrtKey0.getPrimeExponentQ().toByteArray())).Z1(com.google.crypto.tink.shaded.protobuf.u.p(rSAPrivateCrtKey0.getCrtCoefficient().toByteArray())).B1();
            }

            public J2 i(com.google.crypto.tink.shaded.protobuf.u u0) throws y0 {
                return J2.V2(u0, V.d());
            }

            public void j(J2 j20) throws GeneralSecurityException {
                com.google.crypto.tink.signature.internal.a.f(j20.a());
                b0.f(j20.n());
                b0.g(new BigInteger(1, j20.p().a0()));
            }
        }

        return new com.google.crypto.tink.signature.u.b(this, J2.class);
    }

    @Override  // com.google.crypto.tink.internal.h
    public c h() {
        return c.d;
    }

    @Override  // com.google.crypto.tink.internal.h
    public R0 i(com.google.crypto.tink.shaded.protobuf.u u0) throws y0 {
        return this.r(u0);
    }

    @Override  // com.google.crypto.tink.internal.h
    public void k(R0 r00) throws GeneralSecurityException {
        this.x(((N2)r00));
    }

    @Override  // com.google.crypto.tink.internal.t
    public R0 l(R0 r00) throws GeneralSecurityException {
        return this.q(((N2)r00));
    }

    private static J2 o(Y0 y00, int v, BigInteger bigInteger0) {
        L2 l20 = (L2)L2.J2().R1(y00).B1();
        return (J2)J2.Q2().W1(l20).U1(v).X1(com.google.crypto.tink.shaded.protobuf.u.p(bigInteger0.toByteArray())).B1();
    }

    // 去混淆评级： 低(20)
    private static com.google.crypto.tink.t p(Y0 y00, int v, BigInteger bigInteger0, com.google.crypto.tink.t.b t$b0) {
        return com.google.crypto.tink.t.a("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey", u.o(y00, v, bigInteger0).toByteArray(), t$b0);
    }

    public P2 q(N2 n20) throws GeneralSecurityException {
        return n20.e();
    }

    public N2 r(com.google.crypto.tink.shaded.protobuf.u u0) throws y0 {
        return N2.l3(u0, V.d());
    }

    public static final com.google.crypto.tink.t s() {
        return u.p(Y0.e, 0xC00, RSAKeyGenParameterSpec.F4, com.google.crypto.tink.t.b.c);
    }

    public static final com.google.crypto.tink.t t() {
        return u.p(Y0.f, 0x1000, RSAKeyGenParameterSpec.F4, com.google.crypto.tink.t.b.c);
    }

    public static void u(boolean z) throws GeneralSecurityException {
        O.A(new u(), new v(), z);
    }

    public static final com.google.crypto.tink.t v() {
        return u.p(Y0.e, 0xC00, RSAKeyGenParameterSpec.F4, com.google.crypto.tink.t.b.a);
    }

    public static final com.google.crypto.tink.t w() {
        return u.p(Y0.f, 0x1000, RSAKeyGenParameterSpec.F4, com.google.crypto.tink.t.b.a);
    }

    public void x(N2 n20) throws GeneralSecurityException {
        b0.j(n20.getVersion(), 0);
        b0.f(new BigInteger(1, n20.e().v().a0()).bitLength());
        b0.g(new BigInteger(1, n20.e().k().a0()));
        com.google.crypto.tink.signature.internal.a.f(n20.e().a());
    }
}

