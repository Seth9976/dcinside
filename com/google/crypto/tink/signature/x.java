package com.google.crypto.tink.signature;

import com.google.crypto.tink.N;
import com.google.crypto.tink.internal.h;
import com.google.crypto.tink.internal.r;
import com.google.crypto.tink.proto.U2;
import com.google.crypto.tink.proto.Y2;
import com.google.crypto.tink.proto.k2.c;
import com.google.crypto.tink.shaded.protobuf.R0;
import com.google.crypto.tink.shaded.protobuf.V;
import com.google.crypto.tink.shaded.protobuf.u;
import com.google.crypto.tink.shaded.protobuf.y0;
import com.google.crypto.tink.subtle.Q;
import com.google.crypto.tink.subtle.b0;
import com.google.crypto.tink.subtle.y;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.RSAPublicKeySpec;

class x extends h {
    public x() {
        class a extends r {
            a(Class class0) {
            }

            @Override  // com.google.crypto.tink.internal.r
            public Object a(R0 r00) throws GeneralSecurityException {
                return this.c(((Y2)r00));
            }

            public N c(Y2 y20) throws GeneralSecurityException {
                RSAPublicKey rSAPublicKey0 = (RSAPublicKey)((KeyFactory)y.h.a("RSA")).generatePublic(new RSAPublicKeySpec(new BigInteger(1, y20.v().a0()), new BigInteger(1, y20.k().a0())));
                U2 u20 = y20.a();
                return new Q(rSAPublicKey0, com.google.crypto.tink.signature.internal.a.c(u20.G0()), com.google.crypto.tink.signature.internal.a.c(u20.B0()), u20.H0());
            }
        }

        r[] arr_r = {new a(N.class)};
        super(Y2.class, arr_r);
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
        this.m(((Y2)r00));
    }

    public Y2 l(u u0) throws y0 {
        return Y2.Y2(u0, V.d());
    }

    public void m(Y2 y20) throws GeneralSecurityException {
        b0.j(y20.getVersion(), 0);
        b0.f(new BigInteger(1, y20.v().a0()).bitLength());
        b0.g(new BigInteger(1, y20.k().a0()));
        com.google.crypto.tink.signature.internal.a.g(y20.a());
    }
}

