package com.google.crypto.tink.jwt;

import com.google.crypto.tink.internal.h;
import com.google.crypto.tink.internal.r;
import com.google.crypto.tink.proto.V1;
import com.google.crypto.tink.proto.a2;
import com.google.crypto.tink.proto.k2.c;
import com.google.crypto.tink.shaded.protobuf.R0;
import com.google.crypto.tink.shaded.protobuf.V;
import com.google.crypto.tink.shaded.protobuf.u;
import com.google.crypto.tink.shaded.protobuf.y0;
import com.google.crypto.tink.subtle.O;
import com.google.crypto.tink.subtle.b0;
import com.google.gson.m;
import j..util.Optional;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.RSAPublicKeySpec;

class t extends h {
    static class b {
        static final int[] a;

        static {
            int[] arr_v = new int[V1.values().length];
            b.a = arr_v;
            try {
                arr_v[V1.c.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                b.a[V1.d.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                b.a[V1.e.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
        }
    }

    public t() {
        class a extends r {
            a(Class class0) {
            }

            @Override  // com.google.crypto.tink.internal.r
            public Object a(R0 r00) throws GeneralSecurityException {
                return this.c(((a2)r00));
            }

            public q c(a2 a20) throws GeneralSecurityException {
                class com.google.crypto.tink.jwt.t.a.a implements q {
                    final O a;
                    final String b;
                    final Optional c;
                    final a d;

                    com.google.crypto.tink.jwt.t.a.a(O o0, String s, Optional optional0) {
                        this.a = o0;
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

                O o0 = new O(t.m(a20), t.n(a20.g()));
                String s = a20.g().name();
                return a20.o() ? new com.google.crypto.tink.jwt.t.a.a(this, o0, s, Optional.of("")) : new com.google.crypto.tink.jwt.t.a.a(this, o0, s, Optional.empty());
            }
        }

        r[] arr_r = {new a(q.class)};
        super(a2.class, arr_r);
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
        this.p(((a2)r00));
    }

    private static final RSAPublicKey m(a2 a20) throws GeneralSecurityException {
        return (RSAPublicKey)((KeyFactory)com.google.crypto.tink.subtle.y.h.a("RSA")).generatePublic(new RSAPublicKeySpec(new BigInteger(1, a20.v().a0()), new BigInteger(1, a20.k().a0())));
    }

    public static com.google.crypto.tink.subtle.A.a n(V1 v10) throws GeneralSecurityException {
        switch(v10) {
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
                throw new GeneralSecurityException("unknown algorithm " + v10.name());
            }
        }
    }

    public a2 o(u u0) throws y0 {
        return a2.c3(u0, V.d());
    }

    public void p(a2 a20) throws GeneralSecurityException {
        b0.j(a20.getVersion(), 0);
        b0.f(new BigInteger(1, a20.v().a0()).bitLength());
        b0.g(new BigInteger(1, a20.k().a0()));
    }
}

