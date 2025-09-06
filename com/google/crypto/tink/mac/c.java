package com.google.crypto.tink.mac;

import com.google.crypto.tink.C;
import com.google.crypto.tink.O;
import com.google.crypto.tink.internal.h;
import com.google.crypto.tink.internal.m;
import com.google.crypto.tink.internal.q;
import com.google.crypto.tink.internal.r;
import com.google.crypto.tink.proto.f;
import com.google.crypto.tink.shaded.protobuf.R0;
import com.google.crypto.tink.shaded.protobuf.V;
import com.google.crypto.tink.shaded.protobuf.u;
import com.google.crypto.tink.shaded.protobuf.y0;
import com.google.crypto.tink.subtle.I;
import com.google.crypto.tink.subtle.K;
import com.google.crypto.tink.subtle.L;
import com.google.crypto.tink.subtle.b0;
import com.google.crypto.tink.t;
import j..util.DesugarCollections;
import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

public final class c extends h {
    private static final int d = 0;
    private static final int e = 0x20;
    private static final int f = 10;
    private static final int g = 16;
    private static final q h;

    static {
        c.h = q.b(new b(), a.class, j.class);
    }

    c() {
        class com.google.crypto.tink.mac.c.a extends r {
            com.google.crypto.tink.mac.c.a(Class class0) {
            }

            @Override  // com.google.crypto.tink.internal.r
            public Object a(R0 r00) throws GeneralSecurityException {
                return this.c(((com.google.crypto.tink.proto.b)r00));
            }

            public C c(com.google.crypto.tink.proto.b b0) throws GeneralSecurityException {
                return new K(new I(b0.c().a0()), b0.a().E());
            }
        }

        r[] arr_r = {new com.google.crypto.tink.mac.c.a(C.class)};
        super(com.google.crypto.tink.proto.b.class, arr_r);
    }

    @Override  // com.google.crypto.tink.internal.h
    public String d() [...] // 潜在的解密器

    @Override  // com.google.crypto.tink.internal.h
    public int f() [...] // Inlined contents

    @Override  // com.google.crypto.tink.internal.h
    public com.google.crypto.tink.internal.h.a g() {
        class com.google.crypto.tink.mac.c.b extends com.google.crypto.tink.internal.h.a {
            final c b;

            com.google.crypto.tink.mac.c.b(Class class0) {
                super(class0);
            }

            @Override  // com.google.crypto.tink.internal.h$a
            public R0 a(R0 r00) throws GeneralSecurityException {
                return this.h(((com.google.crypto.tink.proto.c)r00));
            }

            @Override  // com.google.crypto.tink.internal.h$a
            public Map d() throws GeneralSecurityException {
                HashMap hashMap0 = new HashMap();
                hashMap0.put("AES_CMAC", new com.google.crypto.tink.internal.h.a.a(((com.google.crypto.tink.proto.c)com.google.crypto.tink.proto.c.N2().T1(0x20).V1(((f)f.I2().R1(16).B1())).B1()), com.google.crypto.tink.t.b.a));
                hashMap0.put("AES256_CMAC", new com.google.crypto.tink.internal.h.a.a(((com.google.crypto.tink.proto.c)com.google.crypto.tink.proto.c.N2().T1(0x20).V1(((f)f.I2().R1(16).B1())).B1()), com.google.crypto.tink.t.b.a));
                hashMap0.put("AES256_CMAC_RAW", new com.google.crypto.tink.internal.h.a.a(((com.google.crypto.tink.proto.c)com.google.crypto.tink.proto.c.N2().T1(0x20).V1(((f)f.I2().R1(16).B1())).B1()), com.google.crypto.tink.t.b.c));
                return DesugarCollections.unmodifiableMap(hashMap0);
            }

            @Override  // com.google.crypto.tink.internal.h$a
            public R0 e(u u0) throws y0 {
                return this.i(u0);
            }

            @Override  // com.google.crypto.tink.internal.h$a
            public void g(R0 r00) throws GeneralSecurityException {
                this.j(((com.google.crypto.tink.proto.c)r00));
            }

            public com.google.crypto.tink.proto.b h(com.google.crypto.tink.proto.c c0) throws GeneralSecurityException {
                return (com.google.crypto.tink.proto.b)com.google.crypto.tink.proto.b.Q2().X1(0).U1(u.p(L.c(c0.d()))).W1(c0.a()).B1();
            }

            public com.google.crypto.tink.proto.c i(u u0) throws y0 {
                return com.google.crypto.tink.proto.c.S2(u0, V.d());
            }

            public void j(com.google.crypto.tink.proto.c c0) throws GeneralSecurityException {
                c.s(c0.a());
                c.t(c0.d());
            }
        }

        return new com.google.crypto.tink.mac.c.b(this, com.google.crypto.tink.proto.c.class);
    }

    @Override  // com.google.crypto.tink.internal.h
    public com.google.crypto.tink.proto.k2.c h() {
        return com.google.crypto.tink.proto.k2.c.c;
    }

    @Override  // com.google.crypto.tink.internal.h
    public R0 i(u u0) throws y0 {
        return this.o(u0);
    }

    @Override  // com.google.crypto.tink.internal.h
    public void k(R0 r00) throws GeneralSecurityException {
        this.r(((com.google.crypto.tink.proto.b)r00));
    }

    // 去混淆评级： 低(20)
    public static final t n() {
        return t.a("type.googleapis.com/google.crypto.tink.AesCmacKey", ((com.google.crypto.tink.proto.c)com.google.crypto.tink.proto.c.N2().T1(0x20).V1(((f)f.I2().R1(16).B1())).B1()).toByteArray(), com.google.crypto.tink.t.b.a);
    }

    public com.google.crypto.tink.proto.b o(u u0) throws y0 {
        return com.google.crypto.tink.proto.b.V2(u0, V.d());
    }

    // 去混淆评级： 低(20)
    public static final t p() {
        return t.a("type.googleapis.com/google.crypto.tink.AesCmacKey", ((com.google.crypto.tink.proto.c)com.google.crypto.tink.proto.c.N2().T1(0x20).V1(((f)f.I2().R1(16).B1())).B1()).toByteArray(), com.google.crypto.tink.t.b.c);
    }

    public static void q(boolean z) throws GeneralSecurityException {
        O.D(new c(), z);
        i.h();
        m.c().d(c.h);
    }

    public void r(com.google.crypto.tink.proto.b b0) throws GeneralSecurityException {
        b0.j(b0.getVersion(), 0);
        c.t(b0.c().size());
        c.s(b0.a());
    }

    private static void s(f f0) throws GeneralSecurityException {
        if(f0.E() < 10) {
            throw new GeneralSecurityException("tag size too short");
        }
        if(f0.E() > 16) {
            throw new GeneralSecurityException("tag size too long");
        }
    }

    private static void t(int v) throws GeneralSecurityException {
        if(v != 0x20) {
            throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
        }
    }
}

