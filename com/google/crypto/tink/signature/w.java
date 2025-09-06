package com.google.crypto.tink.signature;

import com.google.crypto.tink.M;
import com.google.crypto.tink.O;
import com.google.crypto.tink.internal.r;
import com.google.crypto.tink.internal.t;
import com.google.crypto.tink.proto.S2;
import com.google.crypto.tink.proto.U2;
import com.google.crypto.tink.proto.W2;
import com.google.crypto.tink.proto.Y0;
import com.google.crypto.tink.proto.Y2;
import com.google.crypto.tink.proto.k2.c;
import com.google.crypto.tink.shaded.protobuf.R0;
import com.google.crypto.tink.shaded.protobuf.V;
import com.google.crypto.tink.shaded.protobuf.u;
import com.google.crypto.tink.shaded.protobuf.y0;
import com.google.crypto.tink.subtle.P;
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

public final class w extends t {
    w() {
        class a extends r {
            a(Class class0) {
            }

            @Override  // com.google.crypto.tink.internal.r
            public Object a(R0 r00) throws GeneralSecurityException {
                return this.c(((W2)r00));
            }

            public M c(W2 w20) throws GeneralSecurityException {
                KeyFactory keyFactory0 = (KeyFactory)y.h.a("RSA");
                RSAPrivateCrtKey rSAPrivateCrtKey0 = (RSAPrivateCrtKey)keyFactory0.generatePrivate(new RSAPrivateCrtKeySpec(new BigInteger(1, w20.e().v().a0()), new BigInteger(1, w20.e().k().a0()), new BigInteger(1, w20.m().a0()), new BigInteger(1, w20.w().a0()), new BigInteger(1, w20.x().a0()), new BigInteger(1, w20.r().a0()), new BigInteger(1, w20.s().a0()), new BigInteger(1, w20.q().a0())));
                U2 u20 = w20.e().a();
                S.c(rSAPrivateCrtKey0, ((RSAPublicKey)keyFactory0.generatePublic(new RSAPublicKeySpec(new BigInteger(1, w20.e().v().a0()), new BigInteger(1, w20.e().k().a0())))), com.google.crypto.tink.signature.internal.a.c(u20.G0()), com.google.crypto.tink.signature.internal.a.c(u20.B0()), u20.H0());
                return new P(rSAPrivateCrtKey0, com.google.crypto.tink.signature.internal.a.c(u20.G0()), com.google.crypto.tink.signature.internal.a.c(u20.B0()), u20.H0());
            }
        }

        r[] arr_r = {new a(M.class)};
        super(W2.class, Y2.class, arr_r);
    }

    @Override  // com.google.crypto.tink.internal.h
    public String d() [...] // 潜在的解密器

    @Override  // com.google.crypto.tink.internal.h
    public int f() [...] // Inlined contents

    @Override  // com.google.crypto.tink.internal.h
    public com.google.crypto.tink.internal.h.a g() {
        class b extends com.google.crypto.tink.internal.h.a {
            final w b;

            b(Class class0) {
                super(class0);
            }

            @Override  // com.google.crypto.tink.internal.h$a
            public R0 a(R0 r00) throws GeneralSecurityException {
                return this.h(((S2)r00));
            }

            @Override  // com.google.crypto.tink.internal.h$a
            public Map d() throws GeneralSecurityException {
                HashMap hashMap0 = new HashMap();
                BigInteger bigInteger0 = RSAKeyGenParameterSpec.F4;
                hashMap0.put("RSA_SSA_PSS_3072_SHA256_F4", new com.google.crypto.tink.internal.h.a.a(w.o(Y0.e, Y0.e, 0x20, 0xC00, bigInteger0), com.google.crypto.tink.t.b.a));
                hashMap0.put("RSA_SSA_PSS_3072_SHA256_F4_RAW", new com.google.crypto.tink.internal.h.a.a(w.o(Y0.e, Y0.e, 0x20, 0xC00, bigInteger0), com.google.crypto.tink.t.b.c));
                hashMap0.put("RSA_SSA_PSS_3072_SHA256_SHA256_32_F4", new com.google.crypto.tink.internal.h.a.a(w.o(Y0.e, Y0.e, 0x20, 0xC00, bigInteger0), com.google.crypto.tink.t.b.a));
                hashMap0.put("RSA_SSA_PSS_4096_SHA512_F4", new com.google.crypto.tink.internal.h.a.a(w.o(Y0.f, Y0.f, 0x40, 0x1000, bigInteger0), com.google.crypto.tink.t.b.a));
                hashMap0.put("RSA_SSA_PSS_4096_SHA512_F4_RAW", new com.google.crypto.tink.internal.h.a.a(w.o(Y0.f, Y0.f, 0x40, 0x1000, bigInteger0), com.google.crypto.tink.t.b.c));
                hashMap0.put("RSA_SSA_PSS_4096_SHA512_SHA512_64_F4", new com.google.crypto.tink.internal.h.a.a(w.o(Y0.f, Y0.f, 0x40, 0x1000, bigInteger0), com.google.crypto.tink.t.b.a));
                return DesugarCollections.unmodifiableMap(hashMap0);
            }

            @Override  // com.google.crypto.tink.internal.h$a
            public R0 e(u u0) throws y0 {
                return this.i(u0);
            }

            @Override  // com.google.crypto.tink.internal.h$a
            public void g(R0 r00) throws GeneralSecurityException {
                this.j(((S2)r00));
            }

            public W2 h(S2 s20) throws GeneralSecurityException {
                U2 u20 = s20.a();
                b0.f(s20.n());
                b0.h(com.google.crypto.tink.signature.internal.a.c(u20.G0()));
                KeyPairGenerator keyPairGenerator0 = (KeyPairGenerator)y.g.a("RSA");
                keyPairGenerator0.initialize(new RSAKeyGenParameterSpec(s20.n(), new BigInteger(1, s20.p().a0())));
                KeyPair keyPair0 = keyPairGenerator0.generateKeyPair();
                RSAPublicKey rSAPublicKey0 = (RSAPublicKey)keyPair0.getPublic();
                RSAPrivateCrtKey rSAPrivateCrtKey0 = (RSAPrivateCrtKey)keyPair0.getPrivate();
                Y2 y20 = (Y2)Y2.T2().Z1(0).Y1(u20).V1(u.p(rSAPublicKey0.getPublicExponent().toByteArray())).W1(u.p(rSAPublicKey0.getModulus().toByteArray())).B1();
                return (W2)W2.f3().h2(0).f2(y20).a2(u.p(rSAPrivateCrtKey0.getPrivateExponent().toByteArray())).d2(u.p(rSAPrivateCrtKey0.getPrimeP().toByteArray())).g2(u.p(rSAPrivateCrtKey0.getPrimeQ().toByteArray())).b2(u.p(rSAPrivateCrtKey0.getPrimeExponentP().toByteArray())).c2(u.p(rSAPrivateCrtKey0.getPrimeExponentQ().toByteArray())).Z1(u.p(rSAPrivateCrtKey0.getCrtCoefficient().toByteArray())).B1();
            }

            public S2 i(u u0) throws y0 {
                return S2.V2(u0, V.d());
            }

            public void j(S2 s20) throws GeneralSecurityException {
                com.google.crypto.tink.signature.internal.a.g(s20.a());
                b0.f(s20.n());
                b0.g(new BigInteger(1, s20.p().a0()));
            }
        }

        return new b(this, S2.class);
    }

    @Override  // com.google.crypto.tink.internal.h
    public c h() {
        return c.d;
    }

    @Override  // com.google.crypto.tink.internal.h
    public R0 i(u u0) throws y0 {
        return this.r(u0);
    }

    @Override  // com.google.crypto.tink.internal.h
    public void k(R0 r00) throws GeneralSecurityException {
        this.x(((W2)r00));
    }

    @Override  // com.google.crypto.tink.internal.t
    public R0 l(R0 r00) throws GeneralSecurityException {
        return this.q(((W2)r00));
    }

    private static S2 o(Y0 y00, Y0 y01, int v, int v1, BigInteger bigInteger0) {
        U2 u20 = (U2)U2.Q2().W1(y00).T1(y01).V1(v).B1();
        return (S2)S2.Q2().W1(u20).U1(v1).X1(u.p(bigInteger0.toByteArray())).B1();
    }

    // 去混淆评级： 低(20)
    private static com.google.crypto.tink.t p(Y0 y00, Y0 y01, int v, int v1, BigInteger bigInteger0, com.google.crypto.tink.t.b t$b0) {
        return com.google.crypto.tink.t.a("type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey", w.o(y00, y01, v, v1, bigInteger0).toByteArray(), t$b0);
    }

    public Y2 q(W2 w20) throws GeneralSecurityException {
        return w20.e();
    }

    public W2 r(u u0) throws y0 {
        return W2.l3(u0, V.d());
    }

    public static final com.google.crypto.tink.t s() {
        return w.p(Y0.e, Y0.e, 0x20, 0xC00, RSAKeyGenParameterSpec.F4, com.google.crypto.tink.t.b.c);
    }

    public static final com.google.crypto.tink.t t() {
        return w.p(Y0.f, Y0.f, 0x40, 0x1000, RSAKeyGenParameterSpec.F4, com.google.crypto.tink.t.b.c);
    }

    public static void u(boolean z) throws GeneralSecurityException {
        O.A(new w(), new x(), z);
    }

    public static final com.google.crypto.tink.t v() {
        return w.p(Y0.e, Y0.e, 0x20, 0xC00, RSAKeyGenParameterSpec.F4, com.google.crypto.tink.t.b.a);
    }

    public static final com.google.crypto.tink.t w() {
        return w.p(Y0.f, Y0.f, 0x40, 0x1000, RSAKeyGenParameterSpec.F4, com.google.crypto.tink.t.b.a);
    }

    public void x(W2 w20) throws GeneralSecurityException {
        b0.j(w20.getVersion(), 0);
        b0.f(new BigInteger(1, w20.e().v().a0()).bitLength());
        b0.g(new BigInteger(1, w20.e().k().a0()));
        com.google.crypto.tink.signature.internal.a.g(w20.e().a());
    }
}

