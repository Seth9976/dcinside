package com.google.crypto.tink.signature;

import com.google.crypto.tink.N;
import com.google.crypto.tink.config.internal.c.b;
import com.google.crypto.tink.internal.h;
import com.google.crypto.tink.internal.r;
import com.google.crypto.tink.proto.P2;
import com.google.crypto.tink.proto.k2.c;
import com.google.crypto.tink.shaded.protobuf.R0;
import com.google.crypto.tink.shaded.protobuf.V;
import com.google.crypto.tink.shaded.protobuf.u;
import com.google.crypto.tink.shaded.protobuf.y0;
import com.google.crypto.tink.subtle.O;
import com.google.crypto.tink.subtle.b0;
import com.google.crypto.tink.subtle.y;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.RSAPublicKeySpec;

class v extends h {
    public v() {
        class a extends r {
            a(Class class0) {
            }

            @Override  // com.google.crypto.tink.internal.r
            public Object a(R0 r00) throws GeneralSecurityException {
                return this.c(((P2)r00));
            }

            public N c(P2 p20) throws GeneralSecurityException {
                return new O(((RSAPublicKey)((KeyFactory)y.h.a("RSA")).generatePublic(new RSAPublicKeySpec(new BigInteger(1, p20.v().a0()), new BigInteger(1, p20.k().a0())))), com.google.crypto.tink.signature.internal.a.c(p20.a().F()));
            }
        }

        r[] arr_r = {new a(N.class)};
        super(P2.class, arr_r);
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
    public c h() {
        return c.e;
    }

    @Override  // com.google.crypto.tink.internal.h
    public R0 i(u u0) throws y0 {
        return this.l(u0);
    }

    @Override  // com.google.crypto.tink.internal.h
    public void k(R0 r00) throws GeneralSecurityException {
        this.m(((P2)r00));
    }

    public P2 l(u u0) throws y0 {
        return P2.Y2(u0, V.d());
    }

    public void m(P2 p20) throws GeneralSecurityException {
        b0.j(p20.getVersion(), 0);
        b0.f(new BigInteger(1, p20.v().a0()).bitLength());
        b0.g(new BigInteger(1, p20.k().a0()));
        com.google.crypto.tink.signature.internal.a.f(p20.a());
    }
}

