package com.google.crypto.tink.hybrid;

import com.google.crypto.tink.internal.h;
import com.google.crypto.tink.internal.r;
import com.google.crypto.tink.k;
import com.google.crypto.tink.proto.G0;
import com.google.crypto.tink.proto.K0;
import com.google.crypto.tink.proto.M0;
import com.google.crypto.tink.proto.k2.c;
import com.google.crypto.tink.shaded.protobuf.R0;
import com.google.crypto.tink.shaded.protobuf.V;
import com.google.crypto.tink.shaded.protobuf.u;
import com.google.crypto.tink.shaded.protobuf.y0;
import com.google.crypto.tink.subtle.b0;
import com.google.crypto.tink.subtle.p;
import com.google.crypto.tink.subtle.w;
import java.security.GeneralSecurityException;
import java.security.interfaces.ECPublicKey;

class b extends h {
    public b() {
        class a extends r {
            a(Class class0) {
            }

            @Override  // com.google.crypto.tink.internal.r
            public Object a(R0 r00) throws GeneralSecurityException {
                return this.c(((K0)r00));
            }

            public k c(K0 k00) throws GeneralSecurityException {
                G0 g00 = k00.a();
                M0 m00 = g00.F0();
                ECPublicKey eCPublicKey0 = w.p(com.google.crypto.tink.hybrid.k.a(m00.d1()), k00.t().a0(), k00.u().a0());
                l l0 = new l(g00.o0().C0());
                return new p(eCPublicKey0, m00.t0().a0(), com.google.crypto.tink.hybrid.k.b(m00.B()), com.google.crypto.tink.hybrid.k.c(g00.P0()), l0);
            }
        }

        r[] arr_r = {new a(k.class)};
        super(K0.class, arr_r);
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
        this.m(((K0)r00));
    }

    public K0 l(u u0) throws y0 {
        return K0.Y2(u0, V.d());
    }

    public void m(K0 k00) throws GeneralSecurityException {
        b0.j(k00.getVersion(), 0);
        com.google.crypto.tink.hybrid.k.d(k00.a());
    }
}

