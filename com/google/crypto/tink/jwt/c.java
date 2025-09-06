package com.google.crypto.tink.jwt;

import com.google.crypto.tink.O;
import com.google.crypto.tink.internal.r;
import com.google.crypto.tink.internal.t;
import com.google.crypto.tink.proto.H1;
import com.google.crypto.tink.proto.I1;
import com.google.crypto.tink.proto.K1;
import com.google.crypto.tink.proto.M1;
import com.google.crypto.tink.shaded.protobuf.R0;
import com.google.crypto.tink.shaded.protobuf.V;
import com.google.crypto.tink.shaded.protobuf.u;
import com.google.crypto.tink.shaded.protobuf.y0;
import com.google.crypto.tink.subtle.S;
import com.google.crypto.tink.subtle.b0;
import com.google.crypto.tink.subtle.l;
import com.google.crypto.tink.subtle.w;
import j..util.DesugarCollections;
import j..util.Optional;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECPoint;
import java.util.HashMap;
import java.util.Map;

public final class c extends t {
    static class b extends r {
        public b() {
            super(n.class);
        }

        @Override  // com.google.crypto.tink.internal.r
        public Object a(R0 r00) throws GeneralSecurityException {
            return this.c(((K1)r00));
        }

        public n c(K1 k10) throws GeneralSecurityException {
            class a implements n {
                final Optional a;
                final String b;
                final l c;
                final b d;

                a(Optional optional0, String s, l l0) {
                    this.a = optional0;
                    this.b = s;
                    this.c = l0;
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

            ECPrivateKey eCPrivateKey0 = w.m(d.l(k10.e().g()), k10.c().a0());
            b.d(eCPrivateKey0, k10);
            H1 h10 = k10.e().g();
            l l0 = new l(eCPrivateKey0, d.m(h10), com.google.crypto.tink.subtle.w.c.a);
            String s = h10.name();
            return k10.e().o() ? new a(this, Optional.of(""), s, l0) : new a(this, Optional.empty(), s, l0);
        }

        private static final void d(ECPrivateKey eCPrivateKey0, K1 k10) throws GeneralSecurityException {
            com.google.crypto.tink.subtle.A.a a$a0 = d.m(k10.e().g());
            S.a(eCPrivateKey0, w.p(d.l(k10.e().g()), k10.e().t().a0(), k10.e().u().a0()), a$a0, com.google.crypto.tink.subtle.w.c.a);
        }
    }

    c() {
        r[] arr_r = {new b()};
        super(K1.class, M1.class, arr_r);
    }

    @Override  // com.google.crypto.tink.internal.h
    public String d() [...] // 潜在的解密器

    @Override  // com.google.crypto.tink.internal.h
    public int f() [...] // Inlined contents

    @Override  // com.google.crypto.tink.internal.h
    public com.google.crypto.tink.internal.h.a g() {
        class com.google.crypto.tink.jwt.c.a extends com.google.crypto.tink.internal.h.a {
            final c b;

            com.google.crypto.tink.jwt.c.a(Class class0) {
                super(class0);
            }

            @Override  // com.google.crypto.tink.internal.h$a
            public R0 a(R0 r00) throws GeneralSecurityException {
                return this.h(((I1)r00));
            }

            @Override  // com.google.crypto.tink.internal.h$a
            public R0 b(R0 r00, InputStream inputStream0) throws GeneralSecurityException {
                return this.i(((I1)r00), inputStream0);
            }

            @Override  // com.google.crypto.tink.internal.h$a
            public Map d() {
                HashMap hashMap0 = new HashMap();
                hashMap0.put("JWT_ES256_RAW", c.o(H1.c, com.google.crypto.tink.t.b.c));
                hashMap0.put("JWT_ES256", c.o(H1.c, com.google.crypto.tink.t.b.a));
                hashMap0.put("JWT_ES384_RAW", c.o(H1.d, com.google.crypto.tink.t.b.c));
                hashMap0.put("JWT_ES384", c.o(H1.d, com.google.crypto.tink.t.b.a));
                hashMap0.put("JWT_ES512_RAW", c.o(H1.e, com.google.crypto.tink.t.b.c));
                hashMap0.put("JWT_ES512", c.o(H1.e, com.google.crypto.tink.t.b.a));
                return DesugarCollections.unmodifiableMap(hashMap0);
            }

            @Override  // com.google.crypto.tink.internal.h$a
            public R0 e(u u0) throws y0 {
                return this.j(u0);
            }

            @Override  // com.google.crypto.tink.internal.h$a
            public void g(R0 r00) throws GeneralSecurityException {
                this.k(((I1)r00));
            }

            public K1 h(I1 i10) throws GeneralSecurityException {
                H1 h10 = i10.g();
                KeyPair keyPair0 = w.j(d.l(i10.g()));
                ECPublicKey eCPublicKey0 = (ECPublicKey)keyPair0.getPublic();
                ECPrivateKey eCPrivateKey0 = (ECPrivateKey)keyPair0.getPrivate();
                ECPoint eCPoint0 = eCPublicKey0.getW();
                M1 m10 = (M1)M1.X2().a2(0).W1(h10).b2(u.p(eCPoint0.getAffineX().toByteArray())).c2(u.p(eCPoint0.getAffineY().toByteArray())).B1();
                return (K1)K1.Q2().X1(0).W1(m10).U1(u.p(eCPrivateKey0.getS().toByteArray())).B1();
            }

            public K1 i(I1 i10, InputStream inputStream0) {
                throw new UnsupportedOperationException();
            }

            public I1 j(u u0) throws y0 {
                return I1.R2(u0, V.d());
            }

            public void k(I1 i10) throws GeneralSecurityException {
                d.o(i10.g());
            }
        }

        return new com.google.crypto.tink.jwt.c.a(this, I1.class);
    }

    @Override  // com.google.crypto.tink.internal.h
    public com.google.crypto.tink.proto.k2.c h() {
        return com.google.crypto.tink.proto.k2.c.d;
    }

    @Override  // com.google.crypto.tink.internal.h
    public R0 i(u u0) throws y0 {
        return this.q(u0);
    }

    @Override  // com.google.crypto.tink.internal.h
    public void k(R0 r00) throws GeneralSecurityException {
        this.s(((K1)r00));
    }

    @Override  // com.google.crypto.tink.internal.t
    public R0 l(R0 r00) throws GeneralSecurityException {
        return this.p(((K1)r00));
    }

    private static com.google.crypto.tink.internal.h.a.a o(H1 h10, com.google.crypto.tink.t.b t$b0) {
        return new com.google.crypto.tink.internal.h.a.a(((I1)I1.M2().S1(h10).B1()), t$b0);
    }

    public M1 p(K1 k10) {
        return k10.e();
    }

    public K1 q(u u0) throws y0 {
        return K1.V2(u0, V.d());
    }

    public static void r(boolean z) throws GeneralSecurityException {
        O.A(new c(), new d(), z);
    }

    public void s(K1 k10) throws GeneralSecurityException {
        b0.j(k10.getVersion(), 0);
        d.o(k10.e().g());
    }
}

