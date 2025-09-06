package com.google.crypto.tink.prf;

import com.google.crypto.tink.O;
import com.google.crypto.tink.internal.h;
import com.google.crypto.tink.internal.r;
import com.google.crypto.tink.proto.i;
import com.google.crypto.tink.proto.j;
import com.google.crypto.tink.proto.k2.c;
import com.google.crypto.tink.shaded.protobuf.R0;
import com.google.crypto.tink.shaded.protobuf.V;
import com.google.crypto.tink.shaded.protobuf.u;
import com.google.crypto.tink.shaded.protobuf.y0;
import com.google.crypto.tink.subtle.I;
import com.google.crypto.tink.subtle.L;
import com.google.crypto.tink.subtle.b0;
import com.google.crypto.tink.t;
import j..util.DesugarCollections;
import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

public final class a extends h {
    private static final int d = 0;
    private static final int e = 0x20;

    a() {
        class com.google.crypto.tink.prf.a.a extends r {
            com.google.crypto.tink.prf.a.a(Class class0) {
            }

            @Override  // com.google.crypto.tink.internal.r
            public Object a(R0 r00) throws GeneralSecurityException {
                return this.c(((i)r00));
            }

            public k c(i i0) throws GeneralSecurityException {
                return new I(i0.c().a0());
            }
        }

        r[] arr_r = {new com.google.crypto.tink.prf.a.a(k.class)};
        super(i.class, arr_r);
    }

    @Override  // com.google.crypto.tink.internal.h
    public String d() [...] // 潜在的解密器

    @Override  // com.google.crypto.tink.internal.h
    public int f() [...] // Inlined contents

    @Override  // com.google.crypto.tink.internal.h
    public com.google.crypto.tink.internal.h.a g() {
        class b extends com.google.crypto.tink.internal.h.a {
            final a b;

            b(Class class0) {
                super(class0);
            }

            @Override  // com.google.crypto.tink.internal.h$a
            public R0 a(R0 r00) throws GeneralSecurityException {
                return this.h(((j)r00));
            }

            @Override  // com.google.crypto.tink.internal.h$a
            public Map d() throws GeneralSecurityException {
                HashMap hashMap0 = new HashMap();
                hashMap0.put("AES256_CMAC_PRF", new com.google.crypto.tink.internal.h.a.a(((j)j.L2().S1(0x20).B1()), com.google.crypto.tink.t.b.c));
                hashMap0.put("AES_CMAC_PRF", new com.google.crypto.tink.internal.h.a.a(((j)j.L2().S1(0x20).B1()), com.google.crypto.tink.t.b.c));
                return DesugarCollections.unmodifiableMap(hashMap0);
            }

            @Override  // com.google.crypto.tink.internal.h$a
            public R0 e(u u0) throws y0 {
                return this.i(u0);
            }

            @Override  // com.google.crypto.tink.internal.h$a
            public void g(R0 r00) throws GeneralSecurityException {
                this.j(((j)r00));
            }

            public i h(j j0) {
                return (i)i.L2().T1(0).S1(u.p(L.c(j0.d()))).B1();
            }

            public j i(u u0) throws y0 {
                return j.Q2(u0, V.d());
            }

            public void j(j j0) throws GeneralSecurityException {
                a.q(j0.d());
            }
        }

        return new b(this, j.class);
    }

    @Override  // com.google.crypto.tink.internal.h
    public c h() {
        return c.c;
    }

    @Override  // com.google.crypto.tink.internal.h
    public R0 i(u u0) throws y0 {
        return this.n(u0);
    }

    @Override  // com.google.crypto.tink.internal.h
    public void k(R0 r00) throws GeneralSecurityException {
        this.p(((i)r00));
    }

    // 去混淆评级： 低(20)
    public static final t m() {
        return t.a("type.googleapis.com/google.crypto.tink.AesCmacPrfKey", ((j)j.L2().S1(0x20).B1()).toByteArray(), com.google.crypto.tink.t.b.c);
    }

    public i n(u u0) throws y0 {
        return i.Q2(u0, V.d());
    }

    public static void o(boolean z) throws GeneralSecurityException {
        O.D(new a(), z);
    }

    public void p(i i0) throws GeneralSecurityException {
        b0.j(i0.getVersion(), 0);
        a.q(i0.c().size());
    }

    private static void q(int v) throws GeneralSecurityException {
        if(v != 0x20) {
            throw new GeneralSecurityException("AesCmacPrfKey size wrong, must be 32 bytes");
        }
    }
}

