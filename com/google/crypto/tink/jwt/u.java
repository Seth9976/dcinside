package com.google.crypto.tink.jwt;

import com.google.crypto.tink.O;
import com.google.crypto.tink.internal.r;
import com.google.crypto.tink.internal.t;
import com.google.crypto.tink.proto.d2;
import com.google.crypto.tink.proto.e2;
import com.google.crypto.tink.proto.g2;
import com.google.crypto.tink.proto.i2;
import com.google.crypto.tink.proto.k2.c;
import com.google.crypto.tink.shaded.protobuf.R0;
import com.google.crypto.tink.shaded.protobuf.V;
import com.google.crypto.tink.shaded.protobuf.y0;
import com.google.crypto.tink.subtle.P;
import com.google.crypto.tink.subtle.S;
import com.google.crypto.tink.subtle.b0;
import j..util.DesugarCollections;
import j..util.Optional;
import java.io.InputStream;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
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
    static class b extends r {
        public b() {
            super(n.class);
        }

        @Override  // com.google.crypto.tink.internal.r
        public Object a(R0 r00) throws GeneralSecurityException {
            return this.c(((g2)r00));
        }

        public n c(g2 g20) throws GeneralSecurityException {
            class a implements n {
                final Optional a;
                final String b;
                final P c;
                final b d;

                a(Optional optional0, String s, P p0) {
                    this.a = optional0;
                    this.b = s;
                    this.c = p0;
                    super();
                }

                @Override  // com.google.crypto.tink.jwt.n
                public String a(y y0, Optional optional0) throws GeneralSecurityException {
                    if(this.a.isPresent()) {
                        if(optional0.isPresent()) {
                            throw new g("custom_kid can only be set for RAW keys.");
                        }
                        optional0 = this.a;
                    }
                    String s = e.c(this.b, optional0, y0);
                    return e.b(s, this.c.a(s.getBytes(StandardCharsets.US_ASCII)));
                }
            }

            RSAPrivateCrtKey rSAPrivateCrtKey0 = u.r(g20);
            u.v(rSAPrivateCrtKey0, g20);
            d2 d20 = g20.e().g();
            com.google.crypto.tink.subtle.A.a a$a0 = v.n(d20);
            P p0 = new P(rSAPrivateCrtKey0, a$a0, a$a0, v.p(d20));
            String s = d20.name();
            return g20.e().o() ? new a(this, Optional.of(""), s, p0) : new a(this, Optional.empty(), s, p0);
        }
    }

    u() {
        r[] arr_r = {new b()};
        super(g2.class, i2.class, arr_r);
    }

    @Override  // com.google.crypto.tink.internal.h
    public String d() [...] // 潜在的解密器

    @Override  // com.google.crypto.tink.internal.h
    public int f() [...] // Inlined contents

    @Override  // com.google.crypto.tink.internal.h
    public com.google.crypto.tink.internal.h.a g() {
        class com.google.crypto.tink.jwt.u.a extends com.google.crypto.tink.internal.h.a {
            final u b;

            com.google.crypto.tink.jwt.u.a(Class class0) {
                super(class0);
            }

            @Override  // com.google.crypto.tink.internal.h$a
            public R0 a(R0 r00) throws GeneralSecurityException {
                return this.h(((e2)r00));
            }

            @Override  // com.google.crypto.tink.internal.h$a
            public R0 b(R0 r00, InputStream inputStream0) throws GeneralSecurityException {
                return this.i(((e2)r00), inputStream0);
            }

            @Override  // com.google.crypto.tink.internal.h$a
            public Map d() {
                HashMap hashMap0 = new HashMap();
                BigInteger bigInteger0 = RSAKeyGenParameterSpec.F4;
                hashMap0.put("JWT_PS256_2048_F4_RAW", u.q(d2.c, 0x800, bigInteger0, com.google.crypto.tink.t.b.c));
                hashMap0.put("JWT_PS256_2048_F4", u.q(d2.c, 0x800, bigInteger0, com.google.crypto.tink.t.b.a));
                hashMap0.put("JWT_PS256_3072_F4_RAW", u.q(d2.c, 0xC00, bigInteger0, com.google.crypto.tink.t.b.c));
                hashMap0.put("JWT_PS256_3072_F4", u.q(d2.c, 0xC00, bigInteger0, com.google.crypto.tink.t.b.a));
                hashMap0.put("JWT_PS384_3072_F4_RAW", u.q(d2.d, 0xC00, bigInteger0, com.google.crypto.tink.t.b.c));
                hashMap0.put("JWT_PS384_3072_F4", u.q(d2.d, 0xC00, bigInteger0, com.google.crypto.tink.t.b.a));
                hashMap0.put("JWT_PS512_4096_F4_RAW", u.q(d2.e, 0x1000, bigInteger0, com.google.crypto.tink.t.b.c));
                hashMap0.put("JWT_PS512_4096_F4", u.q(d2.e, 0x1000, bigInteger0, com.google.crypto.tink.t.b.a));
                return DesugarCollections.unmodifiableMap(hashMap0);
            }

            @Override  // com.google.crypto.tink.internal.h$a
            public R0 e(com.google.crypto.tink.shaded.protobuf.u u0) throws y0 {
                return this.j(u0);
            }

            @Override  // com.google.crypto.tink.internal.h$a
            public void g(R0 r00) throws GeneralSecurityException {
                this.k(((e2)r00));
            }

            public g2 h(e2 e20) throws GeneralSecurityException {
                d2 d20 = e20.g();
                KeyPairGenerator keyPairGenerator0 = (KeyPairGenerator)com.google.crypto.tink.subtle.y.g.a("RSA");
                keyPairGenerator0.initialize(new RSAKeyGenParameterSpec(e20.n(), new BigInteger(1, e20.p().a0())));
                KeyPair keyPair0 = keyPairGenerator0.generateKeyPair();
                RSAPublicKey rSAPublicKey0 = (RSAPublicKey)keyPair0.getPublic();
                RSAPrivateCrtKey rSAPrivateCrtKey0 = (RSAPrivateCrtKey)keyPair0.getPrivate();
                i2 i20 = (i2)i2.X2().c2(0).W1(d20).a2(com.google.crypto.tink.shaded.protobuf.u.p(rSAPublicKey0.getPublicExponent().toByteArray())).b2(com.google.crypto.tink.shaded.protobuf.u.p(rSAPublicKey0.getModulus().toByteArray())).B1();
                return (g2)g2.f3().h2(0).f2(i20).a2(com.google.crypto.tink.shaded.protobuf.u.p(rSAPrivateCrtKey0.getPrivateExponent().toByteArray())).d2(com.google.crypto.tink.shaded.protobuf.u.p(rSAPrivateCrtKey0.getPrimeP().toByteArray())).g2(com.google.crypto.tink.shaded.protobuf.u.p(rSAPrivateCrtKey0.getPrimeQ().toByteArray())).b2(com.google.crypto.tink.shaded.protobuf.u.p(rSAPrivateCrtKey0.getPrimeExponentP().toByteArray())).c2(com.google.crypto.tink.shaded.protobuf.u.p(rSAPrivateCrtKey0.getPrimeExponentQ().toByteArray())).Z1(com.google.crypto.tink.shaded.protobuf.u.p(rSAPrivateCrtKey0.getCrtCoefficient().toByteArray())).B1();
            }

            public g2 i(e2 e20, InputStream inputStream0) {
                throw new UnsupportedOperationException();
            }

            public e2 j(com.google.crypto.tink.shaded.protobuf.u u0) throws y0 {
                return e2.X2(u0, V.d());
            }

            public void k(e2 e20) throws GeneralSecurityException {
                b0.f(e20.n());
                b0.g(new BigInteger(1, e20.p().a0()));
            }
        }

        return new com.google.crypto.tink.jwt.u.a(this, e2.class);
    }

    @Override  // com.google.crypto.tink.internal.h
    public c h() {
        return c.d;
    }

    @Override  // com.google.crypto.tink.internal.h
    public R0 i(com.google.crypto.tink.shaded.protobuf.u u0) throws y0 {
        return this.t(u0);
    }

    @Override  // com.google.crypto.tink.internal.h
    public void k(R0 r00) throws GeneralSecurityException {
        this.w(((g2)r00));
    }

    @Override  // com.google.crypto.tink.internal.t
    public R0 l(R0 r00) throws GeneralSecurityException {
        return this.s(((g2)r00));
    }

    private static com.google.crypto.tink.internal.h.a.a q(d2 d20, int v, BigInteger bigInteger0, com.google.crypto.tink.t.b t$b0) {
        return new com.google.crypto.tink.internal.h.a.a(((e2)e2.S2().U1(d20).W1(v).X1(com.google.crypto.tink.shaded.protobuf.u.p(bigInteger0.toByteArray())).B1()), t$b0);
    }

    private static final RSAPrivateCrtKey r(g2 g20) throws GeneralSecurityException {
        return (RSAPrivateCrtKey)((KeyFactory)com.google.crypto.tink.subtle.y.h.a("RSA")).generatePrivate(new RSAPrivateCrtKeySpec(new BigInteger(1, g20.e().v().a0()), new BigInteger(1, g20.e().k().a0()), new BigInteger(1, g20.m().a0()), new BigInteger(1, g20.w().a0()), new BigInteger(1, g20.x().a0()), new BigInteger(1, g20.r().a0()), new BigInteger(1, g20.s().a0()), new BigInteger(1, g20.q().a0())));
    }

    public i2 s(g2 g20) {
        return g20.e();
    }

    public g2 t(com.google.crypto.tink.shaded.protobuf.u u0) throws y0 {
        return g2.l3(u0, V.d());
    }

    public static void u(boolean z) throws GeneralSecurityException {
        O.A(new u(), new v(), z);
    }

    private static final void v(RSAPrivateCrtKey rSAPrivateCrtKey0, g2 g20) throws GeneralSecurityException {
        RSAPublicKey rSAPublicKey0 = (RSAPublicKey)((KeyFactory)com.google.crypto.tink.subtle.y.h.a("RSA")).generatePublic(new RSAPublicKeySpec(new BigInteger(1, g20.e().v().a0()), new BigInteger(1, g20.e().k().a0())));
        d2 d20 = g20.e().g();
        com.google.crypto.tink.subtle.A.a a$a0 = v.n(d20);
        S.c(rSAPrivateCrtKey0, rSAPublicKey0, a$a0, a$a0, v.p(d20));
    }

    public void w(g2 g20) throws GeneralSecurityException {
        b0.j(g20.getVersion(), 0);
        b0.f(new BigInteger(1, g20.e().v().a0()).bitLength());
        b0.g(new BigInteger(1, g20.e().k().a0()));
    }
}

