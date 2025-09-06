package com.google.crypto.tink.prf;

import com.google.crypto.tink.O;
import com.google.crypto.tink.internal.h;
import com.google.crypto.tink.internal.r;
import com.google.crypto.tink.proto.Y0;
import com.google.crypto.tink.proto.a1;
import com.google.crypto.tink.proto.b1;
import com.google.crypto.tink.proto.e1;
import com.google.crypto.tink.shaded.protobuf.R0;
import com.google.crypto.tink.shaded.protobuf.V;
import com.google.crypto.tink.shaded.protobuf.u;
import com.google.crypto.tink.shaded.protobuf.y0;
import com.google.crypto.tink.subtle.L;
import com.google.crypto.tink.subtle.b0;
import com.google.crypto.tink.t;
import j..util.DesugarCollections;
import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

public class c extends h {
    static class d {
        static final int[] a;

        static {
            int[] arr_v = new int[Y0.values().length];
            d.a = arr_v;
            try {
                arr_v[Y0.c.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                d.a[Y0.e.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                d.a[Y0.d.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                d.a[Y0.f.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
        }
    }

    private static final int d = 0x20;

    c() {
        class a extends r {
            a(Class class0) {
            }

            @Override  // com.google.crypto.tink.internal.r
            public Object a(R0 r00) throws GeneralSecurityException {
                return this.c(((a1)r00));
            }

            public com.google.crypto.tink.subtle.prf.c c(a1 a10) throws GeneralSecurityException {
                return new com.google.crypto.tink.subtle.prf.a(c.o(a10.a().j()), a10.c().a0(), a10.a().y0().a0());
            }
        }


        class b extends r {
            b(Class class0) {
            }

            @Override  // com.google.crypto.tink.internal.r
            public Object a(R0 r00) throws GeneralSecurityException {
                return this.c(((a1)r00));
            }

            public k c(a1 a10) throws GeneralSecurityException {
                return com.google.crypto.tink.subtle.prf.b.c(new com.google.crypto.tink.subtle.prf.a(c.o(a10.a().j()), a10.c().a0(), a10.a().y0().a0()));
            }
        }

        r[] arr_r = {new a(com.google.crypto.tink.subtle.prf.c.class), new b(k.class)};
        super(a1.class, arr_r);
    }

    @Override  // com.google.crypto.tink.internal.h
    public String d() [...] // 潜在的解密器

    @Override  // com.google.crypto.tink.internal.h
    public int f() [...] // Inlined contents

    @Override  // com.google.crypto.tink.internal.h
    public com.google.crypto.tink.internal.h.a g() {
        class com.google.crypto.tink.prf.c.c extends com.google.crypto.tink.internal.h.a {
            final c b;

            com.google.crypto.tink.prf.c.c(Class class0) {
                super(class0);
            }

            @Override  // com.google.crypto.tink.internal.h$a
            public R0 a(R0 r00) throws GeneralSecurityException {
                return this.h(((b1)r00));
            }

            @Override  // com.google.crypto.tink.internal.h$a
            public Map d() throws GeneralSecurityException {
                HashMap hashMap0 = new HashMap();
                hashMap0.put("HKDF_SHA256", new com.google.crypto.tink.internal.h.a.a(((b1)b1.Q2().U1(0x20).V1(e1.M2().S1(Y0.e)).B1()), com.google.crypto.tink.t.b.c));
                return DesugarCollections.unmodifiableMap(hashMap0);
            }

            @Override  // com.google.crypto.tink.internal.h$a
            public R0 e(u u0) throws y0 {
                return this.i(u0);
            }

            @Override  // com.google.crypto.tink.internal.h$a
            public void g(R0 r00) throws GeneralSecurityException {
                this.j(((b1)r00));
            }

            public a1 h(b1 b10) throws GeneralSecurityException {
                return (a1)a1.Q2().U1(u.p(L.c(b10.d()))).X1(0).W1(b10.a()).B1();
            }

            public b1 i(u u0) throws y0 {
                return b1.V2(u0, V.d());
            }

            public void j(b1 b10) throws GeneralSecurityException {
                c.u(b10.d());
                c.v(b10.a());
            }
        }

        return new com.google.crypto.tink.prf.c.c(this, b1.class);
    }

    @Override  // com.google.crypto.tink.internal.h
    public com.google.crypto.tink.proto.k2.c h() {
        return com.google.crypto.tink.proto.k2.c.c;
    }

    @Override  // com.google.crypto.tink.internal.h
    public R0 i(u u0) throws y0 {
        return this.q(u0);
    }

    @Override  // com.google.crypto.tink.internal.h
    public void k(R0 r00) throws GeneralSecurityException {
        this.t(((a1)r00));
    }

    private static com.google.crypto.tink.subtle.A.a o(Y0 y00) throws GeneralSecurityException {
        switch(y00) {
            case 1: {
                return com.google.crypto.tink.subtle.A.a.a;
            }
            case 2: {
                return com.google.crypto.tink.subtle.A.a.c;
            }
            case 3: {
                return com.google.crypto.tink.subtle.A.a.d;
            }
            case 4: {
                return com.google.crypto.tink.subtle.A.a.e;
            }
            default: {
                throw new GeneralSecurityException("HashType " + y00.name() + " not known in");
            }
        }
    }

    // 去混淆评级： 低(20)
    public static final t p() {
        return t.a("type.googleapis.com/google.crypto.tink.HkdfPrfKey", ((b1)b1.Q2().U1(0x20).V1(e1.M2().S1(Y0.e)).B1()).toByteArray(), com.google.crypto.tink.t.b.c);
    }

    public a1 q(u u0) throws y0 {
        return a1.V2(u0, V.d());
    }

    public static void r(boolean z) throws GeneralSecurityException {
        O.D(new c(), z);
        i.h();
    }

    // 去混淆评级： 低(20)
    public static String s() [...] // 潜在的解密器

    public void t(a1 a10) throws GeneralSecurityException {
        b0.j(a10.getVersion(), 0);
        c.u(a10.c().size());
        c.v(a10.a());
    }

    private static void u(int v) throws GeneralSecurityException {
        if(v < 0x20) {
            throw new GeneralSecurityException("Invalid HkdfPrfKey/HkdfPrfKeyFormat: Key size too short");
        }
    }

    private static void v(e1 e10) throws GeneralSecurityException {
        if(e10.j() != Y0.e && e10.j() != Y0.f) {
            throw new GeneralSecurityException("Invalid HkdfPrfKey/HkdfPrfKeyFormat: Unsupported hash");
        }
    }
}

