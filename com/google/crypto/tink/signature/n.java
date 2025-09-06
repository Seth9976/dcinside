package com.google.crypto.tink.signature;

import com.google.crypto.tink.N;
import com.google.crypto.tink.internal.h;
import com.google.crypto.tink.internal.r;
import com.google.crypto.tink.proto.T0;
import com.google.crypto.tink.proto.k2.c;
import com.google.crypto.tink.shaded.protobuf.R0;
import com.google.crypto.tink.shaded.protobuf.V;
import com.google.crypto.tink.shaded.protobuf.u;
import com.google.crypto.tink.shaded.protobuf.y0;
import com.google.crypto.tink.subtle.b0;
import com.google.crypto.tink.subtle.v;
import java.security.GeneralSecurityException;

class n extends h {
    public n() {
        class a extends r {
            a(Class class0) {
            }

            @Override  // com.google.crypto.tink.internal.r
            public Object a(R0 r00) throws GeneralSecurityException {
                return this.c(((T0)r00));
            }

            public N c(T0 t00) {
                return new v(t00.c().a0());
            }
        }

        r[] arr_r = {new a(N.class)};
        super(T0.class, arr_r);
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
        this.m(((T0)r00));
    }

    public T0 l(u u0) throws y0 {
        return T0.Q2(u0, V.d());
    }

    public void m(T0 t00) throws GeneralSecurityException {
        b0.j(t00.getVersion(), 0);
        if(t00.c().size() != 0x20) {
            throw new GeneralSecurityException("invalid Ed25519 public key: incorrect key length");
        }
    }
}

