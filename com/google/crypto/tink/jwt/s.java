package com.google.crypto.tink.jwt;

import com.google.crypto.tink.O;
import com.google.crypto.tink.internal.r;
import com.google.crypto.tink.internal.t;
import com.google.crypto.tink.proto.V1;
import com.google.crypto.tink.proto.W1;
import com.google.crypto.tink.proto.Y1;
import com.google.crypto.tink.proto.a2;
import com.google.crypto.tink.proto.k2.c;
import com.google.crypto.tink.shaded.protobuf.R0;
import com.google.crypto.tink.shaded.protobuf.V;
import com.google.crypto.tink.shaded.protobuf.u;
import com.google.crypto.tink.shaded.protobuf.y0;
import com.google.crypto.tink.subtle.N;
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

public final class s extends t {
    static class b extends r {
        public b() {
            super(n.class);
        }

        @Override  // com.google.crypto.tink.internal.r
        public Object a(R0 r00) throws GeneralSecurityException {
            return this.c(((Y1)r00));
        }

        public n c(Y1 y10) throws GeneralSecurityException {
            class a implements n {
                final Optional a;
                final String b;
                final N c;
                final b d;

                a(Optional optional0, String s, N n0) {
                    this.a = optional0;
                    this.b = s;
                    this.c = n0;
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

            RSAPrivateCrtKey rSAPrivateCrtKey0 = s.r(y10);
            s.v(rSAPrivateCrtKey0, y10);
            V1 v10 = y10.e().g();
            N n0 = new N(rSAPrivateCrtKey0, com.google.crypto.tink.jwt.t.n(v10));
            String s = v10.name();
            return y10.e().o() ? new a(this, Optional.of(""), s, n0) : new a(this, Optional.empty(), s, n0);
        }
    }

    s() {
        r[] arr_r = {new b()};
        super(Y1.class, a2.class, arr_r);
    }

    @Override  // com.google.crypto.tink.internal.h
    public String d() [...] // 潜在的解密器

    @Override  // com.google.crypto.tink.internal.h
    public int f() [...] // Inlined contents

    @Override  // com.google.crypto.tink.internal.h
    public com.google.crypto.tink.internal.h.a g() {
        class com.google.crypto.tink.jwt.s.a extends com.google.crypto.tink.internal.h.a {
            final s b;

            com.google.crypto.tink.jwt.s.a(Class class0) {
                super(class0);
            }

            @Override  // com.google.crypto.tink.internal.h$a
            public R0 a(R0 r00) throws GeneralSecurityException {
                return this.h(((W1)r00));
            }

            @Override  // com.google.crypto.tink.internal.h$a
            public R0 b(R0 r00, InputStream inputStream0) throws GeneralSecurityException {
                return this.i(((W1)r00), inputStream0);
            }

            @Override  // com.google.crypto.tink.internal.h$a
            public Map d() {
                HashMap hashMap0 = new HashMap();
                BigInteger bigInteger0 = RSAKeyGenParameterSpec.F4;
                hashMap0.put("JWT_RS256_2048_F4_RAW", s.q(V1.c, 0x800, bigInteger0, com.google.crypto.tink.t.b.c));
                hashMap0.put("JWT_RS256_2048_F4", s.q(V1.c, 0x800, bigInteger0, com.google.crypto.tink.t.b.a));
                hashMap0.put("JWT_RS256_3072_F4_RAW", s.q(V1.c, 0xC00, bigInteger0, com.google.crypto.tink.t.b.c));
                hashMap0.put("JWT_RS256_3072_F4", s.q(V1.c, 0xC00, bigInteger0, com.google.crypto.tink.t.b.a));
                hashMap0.put("JWT_RS384_3072_F4_RAW", s.q(V1.d, 0xC00, bigInteger0, com.google.crypto.tink.t.b.c));
                hashMap0.put("JWT_RS384_3072_F4", s.q(V1.d, 0xC00, bigInteger0, com.google.crypto.tink.t.b.a));
                hashMap0.put("JWT_RS512_4096_F4_RAW", s.q(V1.e, 0x1000, bigInteger0, com.google.crypto.tink.t.b.c));
                hashMap0.put("JWT_RS512_4096_F4", s.q(V1.e, 0x1000, bigInteger0, com.google.crypto.tink.t.b.a));
                return DesugarCollections.unmodifiableMap(hashMap0);
            }

            @Override  // com.google.crypto.tink.internal.h$a
            public R0 e(u u0) throws y0 {
                return this.j(u0);
            }

            @Override  // com.google.crypto.tink.internal.h$a
            public void g(R0 r00) throws GeneralSecurityException {
                this.k(((W1)r00));
            }

            public Y1 h(W1 w10) throws GeneralSecurityException {
                V1 v10 = w10.g();
                KeyPairGenerator keyPairGenerator0 = (KeyPairGenerator)com.google.crypto.tink.subtle.y.g.a("RSA");
                keyPairGenerator0.initialize(new RSAKeyGenParameterSpec(w10.n(), new BigInteger(1, w10.p().a0())));
                KeyPair keyPair0 = keyPairGenerator0.generateKeyPair();
                RSAPublicKey rSAPublicKey0 = (RSAPublicKey)keyPair0.getPublic();
                RSAPrivateCrtKey rSAPrivateCrtKey0 = (RSAPrivateCrtKey)keyPair0.getPrivate();
                a2 a20 = (a2)a2.X2().c2(0).W1(v10).a2(u.p(rSAPublicKey0.getPublicExponent().toByteArray())).b2(u.p(rSAPublicKey0.getModulus().toByteArray())).B1();
                return (Y1)Y1.f3().h2(0).f2(a20).a2(u.p(rSAPrivateCrtKey0.getPrivateExponent().toByteArray())).d2(u.p(rSAPrivateCrtKey0.getPrimeP().toByteArray())).g2(u.p(rSAPrivateCrtKey0.getPrimeQ().toByteArray())).b2(u.p(rSAPrivateCrtKey0.getPrimeExponentP().toByteArray())).c2(u.p(rSAPrivateCrtKey0.getPrimeExponentQ().toByteArray())).Z1(u.p(rSAPrivateCrtKey0.getCrtCoefficient().toByteArray())).B1();
            }

            public Y1 i(W1 w10, InputStream inputStream0) {
                throw new UnsupportedOperationException();
            }

            public W1 j(u u0) throws y0 {
                return W1.X2(u0, V.d());
            }

            public void k(W1 w10) throws GeneralSecurityException {
                b0.f(w10.n());
                b0.g(new BigInteger(1, w10.p().a0()));
            }
        }

        return new com.google.crypto.tink.jwt.s.a(this, W1.class);
    }

    @Override  // com.google.crypto.tink.internal.h
    public c h() {
        return c.d;
    }

    @Override  // com.google.crypto.tink.internal.h
    public R0 i(u u0) throws y0 {
        return this.t(u0);
    }

    @Override  // com.google.crypto.tink.internal.h
    public void k(R0 r00) throws GeneralSecurityException {
        this.w(((Y1)r00));
    }

    @Override  // com.google.crypto.tink.internal.t
    public R0 l(R0 r00) throws GeneralSecurityException {
        return this.s(((Y1)r00));
    }

    private static com.google.crypto.tink.internal.h.a.a q(V1 v10, int v, BigInteger bigInteger0, com.google.crypto.tink.t.b t$b0) {
        return new com.google.crypto.tink.internal.h.a.a(((W1)W1.S2().U1(v10).W1(v).X1(u.p(bigInteger0.toByteArray())).B1()), t$b0);
    }

    private static final RSAPrivateCrtKey r(Y1 y10) throws GeneralSecurityException {
        return (RSAPrivateCrtKey)((KeyFactory)com.google.crypto.tink.subtle.y.h.a("RSA")).generatePrivate(new RSAPrivateCrtKeySpec(new BigInteger(1, y10.e().v().a0()), new BigInteger(1, y10.e().k().a0()), new BigInteger(1, y10.m().a0()), new BigInteger(1, y10.w().a0()), new BigInteger(1, y10.x().a0()), new BigInteger(1, y10.r().a0()), new BigInteger(1, y10.s().a0()), new BigInteger(1, y10.q().a0())));
    }

    public a2 s(Y1 y10) {
        return y10.e();
    }

    public Y1 t(u u0) throws y0 {
        return Y1.l3(u0, V.d());
    }

    public static void u(boolean z) throws GeneralSecurityException {
        O.A(new s(), new com.google.crypto.tink.jwt.t(), z);
    }

    private static final void v(RSAPrivateCrtKey rSAPrivateCrtKey0, Y1 y10) throws GeneralSecurityException {
        S.b(rSAPrivateCrtKey0, ((RSAPublicKey)((KeyFactory)com.google.crypto.tink.subtle.y.h.a("RSA")).generatePublic(new RSAPublicKeySpec(new BigInteger(1, y10.e().v().a0()), new BigInteger(1, y10.e().k().a0())))), com.google.crypto.tink.jwt.t.n(y10.e().g()));
    }

    public void w(Y1 y10) throws GeneralSecurityException {
        b0.j(y10.getVersion(), 0);
        b0.f(new BigInteger(1, y10.e().v().a0()).bitLength());
        b0.g(new BigInteger(1, y10.e().k().a0()));
    }
}

