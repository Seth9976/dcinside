package com.google.crypto.tink.aead;

import com.google.crypto.tink.C;
import com.google.crypto.tink.O;
import com.google.crypto.tink.b;
import com.google.crypto.tink.internal.h;
import com.google.crypto.tink.internal.r;
import com.google.crypto.tink.mac.p;
import com.google.crypto.tink.proto.A;
import com.google.crypto.tink.proto.D;
import com.google.crypto.tink.proto.Y0;
import com.google.crypto.tink.proto.h1;
import com.google.crypto.tink.proto.i1;
import com.google.crypto.tink.proto.k2.c;
import com.google.crypto.tink.proto.l1;
import com.google.crypto.tink.proto.o;
import com.google.crypto.tink.proto.z;
import com.google.crypto.tink.shaded.protobuf.R0;
import com.google.crypto.tink.shaded.protobuf.V;
import com.google.crypto.tink.shaded.protobuf.u;
import com.google.crypto.tink.shaded.protobuf.y0;
import com.google.crypto.tink.subtle.E;
import com.google.crypto.tink.subtle.b0;
import com.google.crypto.tink.subtle.x;
import com.google.crypto.tink.t;
import j..util.DesugarCollections;
import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

public final class g extends h {
    g() {
        class a extends r {
            a(Class class0) {
            }

            @Override  // com.google.crypto.tink.internal.r
            public Object a(R0 r00) throws GeneralSecurityException {
                return this.c(((o)r00));
            }

            public b c(o o0) throws GeneralSecurityException {
                return new x(((E)new com.google.crypto.tink.aead.h().e(o0.d0(), E.class)), ((C)new p().e(o0.Q0(), C.class)), o0.Q0().a().E());
            }
        }

        r[] arr_r = {new a(b.class)};
        super(o.class, arr_r);
    }

    @Override  // com.google.crypto.tink.internal.h
    public com.google.crypto.tink.config.internal.c.b a() {
        return com.google.crypto.tink.config.internal.c.b.b;
    }

    @Override  // com.google.crypto.tink.internal.h
    public String d() [...] // 潜在的解密器

    @Override  // com.google.crypto.tink.internal.h
    public int f() [...] // Inlined contents

    @Override  // com.google.crypto.tink.internal.h
    public com.google.crypto.tink.internal.h.a g() {
        class com.google.crypto.tink.aead.g.b extends com.google.crypto.tink.internal.h.a {
            final g b;

            com.google.crypto.tink.aead.g.b(Class class0) {
                super(class0);
            }

            @Override  // com.google.crypto.tink.internal.h$a
            public R0 a(R0 r00) throws GeneralSecurityException {
                return this.h(((com.google.crypto.tink.proto.p)r00));
            }

            @Override  // com.google.crypto.tink.internal.h$a
            public Map d() throws GeneralSecurityException {
                HashMap hashMap0 = new HashMap();
                hashMap0.put("AES128_CTR_HMAC_SHA256", g.o(16, 16, 0x20, 16, Y0.e, com.google.crypto.tink.t.b.a));
                hashMap0.put("AES128_CTR_HMAC_SHA256_RAW", g.o(16, 16, 0x20, 16, Y0.e, com.google.crypto.tink.t.b.c));
                hashMap0.put("AES256_CTR_HMAC_SHA256", g.o(0x20, 16, 0x20, 0x20, Y0.e, com.google.crypto.tink.t.b.a));
                hashMap0.put("AES256_CTR_HMAC_SHA256_RAW", g.o(0x20, 16, 0x20, 0x20, Y0.e, com.google.crypto.tink.t.b.c));
                return DesugarCollections.unmodifiableMap(hashMap0);
            }

            @Override  // com.google.crypto.tink.internal.h$a
            public R0 e(u u0) throws y0 {
                return this.i(u0);
            }

            @Override  // com.google.crypto.tink.internal.h$a
            public void g(R0 r00) throws GeneralSecurityException {
                this.j(((com.google.crypto.tink.proto.p)r00));
            }

            public o h(com.google.crypto.tink.proto.p p0) throws GeneralSecurityException {
                z z0 = (z)new com.google.crypto.tink.aead.h().g().a(p0.W0());
                h1 h10 = (h1)new p().g().a(p0.V());
                return (o)o.S2().W1(z0).Y1(h10).Z1(0).B1();
            }

            public com.google.crypto.tink.proto.p i(u u0) throws y0 {
                return com.google.crypto.tink.proto.p.U2(u0, V.d());
            }

            public void j(com.google.crypto.tink.proto.p p0) throws GeneralSecurityException {
                new com.google.crypto.tink.aead.h().g().g(p0.W0());
                new p().g().g(p0.V());
                b0.a(p0.W0().d());
            }
        }

        return new com.google.crypto.tink.aead.g.b(this, com.google.crypto.tink.proto.p.class);
    }

    @Override  // com.google.crypto.tink.internal.h
    public c h() {
        return c.c;
    }

    @Override  // com.google.crypto.tink.internal.h
    public R0 i(u u0) throws y0 {
        return this.r(u0);
    }

    @Override  // com.google.crypto.tink.internal.h
    public void k(R0 r00) throws GeneralSecurityException {
        this.t(((o)r00));
    }

    public static final t m() {
        return g.q(16, 16, 0x20, 16, Y0.e);
    }

    public static final t n() {
        return g.q(0x20, 16, 0x20, 0x20, Y0.e);
    }

    private static com.google.crypto.tink.internal.h.a.a o(int v, int v1, int v2, int v3, Y0 y00, com.google.crypto.tink.t.b t$b0) {
        return new com.google.crypto.tink.internal.h.a.a(g.p(v, v1, v2, v3, y00), t$b0);
    }

    private static com.google.crypto.tink.proto.p p(int v, int v1, int v2, int v3, Y0 y00) {
        A a0 = (A)A.N2().V1(((D)D.I2().R1(v1).B1())).T1(v).B1();
        i1 i10 = (i1)i1.Q2().W1(((l1)l1.M2().S1(y00).U1(v3).B1())).U1(v2).B1();
        return (com.google.crypto.tink.proto.p)com.google.crypto.tink.proto.p.P2().V1(a0).X1(i10).B1();
    }

    // 去混淆评级： 低(20)
    private static t q(int v, int v1, int v2, int v3, Y0 y00) {
        return t.a("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey", g.p(v, v1, v2, v3, y00).toByteArray(), com.google.crypto.tink.t.b.a);
    }

    public o r(u u0) throws y0 {
        return o.X2(u0, V.d());
    }

    public static void s(boolean z) throws GeneralSecurityException {
        O.D(new g(), z);
    }

    public void t(o o0) throws GeneralSecurityException {
        b0.j(o0.getVersion(), 0);
        new com.google.crypto.tink.aead.h().o(o0.d0());
        new p().v(o0.Q0());
    }
}

