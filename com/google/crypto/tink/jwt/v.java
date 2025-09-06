package com.google.crypto.tink.jwt;

import com.google.crypto.tink.internal.h;
import com.google.crypto.tink.internal.r;
import com.google.crypto.tink.proto.d2;
import com.google.crypto.tink.proto.i2;
import com.google.crypto.tink.proto.k2.c;
import com.google.crypto.tink.shaded.protobuf.R0;
import com.google.crypto.tink.shaded.protobuf.V;
import com.google.crypto.tink.shaded.protobuf.u;
import com.google.crypto.tink.shaded.protobuf.y0;
import com.google.crypto.tink.subtle.Q;
import com.google.crypto.tink.subtle.b0;
import com.google.gson.m;
import j..util.Optional;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.RSAPublicKeySpec;

class v extends h {
    static class b {
        static final int[] a;

        static {
            int[] arr_v = new int[d2.values().length];
            b.a = arr_v;
            try {
                arr_v[d2.c.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                b.a[d2.d.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                b.a[d2.e.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
        }
    }

    public v() {
        class a extends r {
            a(Class class0) {
            }

            @Override  // com.google.crypto.tink.internal.r
            public Object a(R0 r00) throws GeneralSecurityException {
                return this.c(((i2)r00));
            }

            public q c(i2 i20) throws GeneralSecurityException {
                class com.google.crypto.tink.jwt.v.a.a implements q {
                    final Q a;
                    final String b;
                    final Optional c;
                    final a d;

                    com.google.crypto.tink.jwt.v.a.a(Q q0, String s, Optional optional0) {
                        this.a = q0;
                        this.b = s;
                        this.c = optional0;
                        super();
                    }

                    @Override  // com.google.crypto.tink.jwt.q
                    public z a(String s, x x0, Optional optional0) throws GeneralSecurityException {
                        com.google.crypto.tink.jwt.e.a e$a0 = e.n(s);
                        this.a.a(e$a0.b, e$a0.a.getBytes(StandardCharsets.US_ASCII));
                        m m0 = com.google.crypto.tink.jwt.a.b(e$a0.c);
                        e.r(this.b, optional0, this.c, m0);
                        return x0.c(y.b(e.l(m0), e$a0.d));
                    }
                }

                RSAPublicKey rSAPublicKey0 = v.m(i20);
                com.google.crypto.tink.subtle.A.a a$a0 = v.n(i20.g());
                Q q0 = new Q(rSAPublicKey0, a$a0, a$a0, v.p(i20.g()));
                String s = i20.g().name();
                return i20.o() ? new com.google.crypto.tink.jwt.v.a.a(this, q0, s, Optional.of("")) : new com.google.crypto.tink.jwt.v.a.a(this, q0, s, Optional.empty());
            }
        }

        r[] arr_r = {new a(q.class)};
        super(i2.class, arr_r);
    }

    @Override  // com.google.crypto.tink.internal.h
    public String d() [...] // 潜在的解密器

    @Override  // com.google.crypto.tink.internal.h
    public int f() [...] // Inlined contents

    @Override  // com.google.crypto.tink.internal.h
    public c h() {
        return c.e;
    }

    @Override  // com.google.crypto.tink.internal.h
    public R0 i(u u0) throws y0 {
        return this.o(u0);
    }

    @Override  // com.google.crypto.tink.internal.h
    public void k(R0 r00) throws GeneralSecurityException {
        this.q(((i2)r00));
    }

    private static final RSAPublicKey m(i2 i20) throws GeneralSecurityException {
        return (RSAPublicKey)((KeyFactory)com.google.crypto.tink.subtle.y.h.a("RSA")).generatePublic(new RSAPublicKeySpec(new BigInteger(1, i20.v().a0()), new BigInteger(1, i20.k().a0())));
    }

    static final com.google.crypto.tink.subtle.A.a n(d2 d20) throws GeneralSecurityException {
        switch(d20) {
            case 1: {
                return com.google.crypto.tink.subtle.A.a.c;
            }
            case 2: {
                return com.google.crypto.tink.subtle.A.a.d;
            }
            case 3: {
                return com.google.crypto.tink.subtle.A.a.e;
            }
            default: {
                throw new GeneralSecurityException("unknown algorithm " + d20.name());
            }
        }
    }

    public i2 o(u u0) throws y0 {
        return i2.c3(u0, V.d());
    }

    static final int p(d2 d20) throws GeneralSecurityException {
        switch(d20) {
            case 1: {
                return 0x20;
            }
            case 2: {
                return 0x30;
            }
            case 3: {
                return 0x40;
            }
            default: {
                throw new GeneralSecurityException("unknown algorithm " + d20.name());
            }
        }
    }

    public void q(i2 i20) throws GeneralSecurityException {
        b0.j(i20.getVersion(), 0);
        b0.f(new BigInteger(1, i20.v().a0()).bitLength());
        b0.g(new BigInteger(1, i20.k().a0()));
    }
}

