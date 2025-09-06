package com.google.crypto.tink.hybrid.internal;

import com.google.crypto.tink.internal.h;
import com.google.crypto.tink.internal.r;
import com.google.crypto.tink.k;
import com.google.crypto.tink.proto.E1;
import com.google.crypto.tink.proto.k2.c;
import com.google.crypto.tink.shaded.protobuf.R0;
import com.google.crypto.tink.shaded.protobuf.V;
import com.google.crypto.tink.shaded.protobuf.u;
import com.google.crypto.tink.shaded.protobuf.y0;
import com.google.crypto.tink.subtle.b0;
import java.security.GeneralSecurityException;

public final class o extends h {
    public o() {
        class a extends r {
            a(Class class0) {
            }

            @Override  // com.google.crypto.tink.internal.r
            public Object a(R0 r00) throws GeneralSecurityException {
                return this.c(((E1)r00));
            }

            public k c(E1 e10) throws GeneralSecurityException {
                return g.b(e10);
            }
        }

        r[] arr_r = {new a(k.class)};
        super(E1.class, arr_r);
    }

    @Override  // com.google.crypto.tink.internal.h
    public String d() {
        return "type.googleapis.com/google.crypto.tink.HpkePublicKey";
    }

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
        this.m(((E1)r00));
    }

    public E1 l(u u0) throws y0 {
        return E1.V2(u0, V.d());
    }

    public void m(E1 e10) throws GeneralSecurityException {
        b0.j(e10.getVersion(), 0);
        if(!e10.b()) {
            throw new GeneralSecurityException("Missing HPKE key params.");
        }
        p.g(e10.a());
    }
}

