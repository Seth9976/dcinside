package com.google.crypto.tink.signature;

import com.google.crypto.tink.N;
import com.google.crypto.tink.config.internal.c.b;
import com.google.crypto.tink.internal.h;
import com.google.crypto.tink.internal.r;
import com.google.crypto.tink.proto.k2.c;
import com.google.crypto.tink.proto.y0;
import com.google.crypto.tink.shaded.protobuf.R0;
import com.google.crypto.tink.shaded.protobuf.V;
import com.google.crypto.tink.shaded.protobuf.u;
import com.google.crypto.tink.subtle.b0;
import com.google.crypto.tink.subtle.m;
import com.google.crypto.tink.subtle.w;
import java.security.GeneralSecurityException;

class l extends h {
    public l() {
        class a extends r {
            a(Class class0) {
            }

            @Override  // com.google.crypto.tink.internal.r
            public Object a(R0 r00) throws GeneralSecurityException {
                return this.c(((y0)r00));
            }

            public N c(y0 y00) throws GeneralSecurityException {
                return new m(w.p(com.google.crypto.tink.signature.internal.a.a(y00.a().T0()), y00.t().a0(), y00.u().a0()), com.google.crypto.tink.signature.internal.a.c(y00.a().F()), com.google.crypto.tink.signature.internal.a.b(y00.a().a0()));
            }
        }

        r[] arr_r = {new a(N.class)};
        super(y0.class, arr_r);
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
    public R0 i(u u0) throws com.google.crypto.tink.shaded.protobuf.y0 {
        return this.l(u0);
    }

    @Override  // com.google.crypto.tink.internal.h
    public void k(R0 r00) throws GeneralSecurityException {
        this.m(((y0)r00));
    }

    public y0 l(u u0) throws com.google.crypto.tink.shaded.protobuf.y0 {
        return y0.Y2(u0, V.d());
    }

    public void m(y0 y00) throws GeneralSecurityException {
        b0.j(y00.getVersion(), 0);
        com.google.crypto.tink.signature.internal.a.e(y00.a());
    }
}

