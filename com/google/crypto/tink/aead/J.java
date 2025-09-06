package com.google.crypto.tink.aead;

import com.google.crypto.tink.O;
import com.google.crypto.tink.b;
import com.google.crypto.tink.internal.h;
import com.google.crypto.tink.internal.r;
import com.google.crypto.tink.proto.G;
import com.google.crypto.tink.proto.H;
import com.google.crypto.tink.proto.K;
import com.google.crypto.tink.shaded.protobuf.R0;
import com.google.crypto.tink.shaded.protobuf.V;
import com.google.crypto.tink.shaded.protobuf.u;
import com.google.crypto.tink.shaded.protobuf.y0;
import com.google.crypto.tink.subtle.L;
import com.google.crypto.tink.subtle.b0;
import com.google.crypto.tink.subtle.c;
import com.google.crypto.tink.t;
import j..util.DesugarCollections;
import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

public final class j extends h {
    j() {
        class a extends r {
            a(Class class0) {
            }

            @Override  // com.google.crypto.tink.internal.r
            public Object a(R0 r00) throws GeneralSecurityException {
                return this.c(((G)r00));
            }

            public b c(G g0) throws GeneralSecurityException {
                return new c(g0.c().a0(), g0.a().J());
            }
        }

        r[] arr_r = {new a(b.class)};
        super(G.class, arr_r);
    }

    @Override  // com.google.crypto.tink.internal.h
    public String d() [...] // 潜在的解密器

    @Override  // com.google.crypto.tink.internal.h
    public int f() [...] // Inlined contents

    @Override  // com.google.crypto.tink.internal.h
    public com.google.crypto.tink.internal.h.a g() {
        class com.google.crypto.tink.aead.j.b extends com.google.crypto.tink.internal.h.a {
            final j b;

            com.google.crypto.tink.aead.j.b(Class class0) {
                super(class0);
            }

            @Override  // com.google.crypto.tink.internal.h$a
            public R0 a(R0 r00) throws GeneralSecurityException {
                return this.h(((H)r00));
            }

            @Override  // com.google.crypto.tink.internal.h$a
            public Map d() throws GeneralSecurityException {
                HashMap hashMap0 = new HashMap();
                hashMap0.put("AES128_EAX", j.o(16, 16, com.google.crypto.tink.t.b.a));
                hashMap0.put("AES128_EAX_RAW", j.o(16, 16, com.google.crypto.tink.t.b.c));
                hashMap0.put("AES256_EAX", j.o(0x20, 16, com.google.crypto.tink.t.b.a));
                hashMap0.put("AES256_EAX_RAW", j.o(0x20, 16, com.google.crypto.tink.t.b.c));
                return DesugarCollections.unmodifiableMap(hashMap0);
            }

            @Override  // com.google.crypto.tink.internal.h$a
            public R0 e(u u0) throws y0 {
                return this.i(u0);
            }

            @Override  // com.google.crypto.tink.internal.h$a
            public void g(R0 r00) throws GeneralSecurityException {
                this.j(((H)r00));
            }

            public G h(H h0) throws GeneralSecurityException {
                return (G)G.Q2().U1(u.p(L.c(h0.d()))).W1(h0.a()).X1(0).B1();
            }

            public H i(u u0) throws y0 {
                return H.S2(u0, V.d());
            }

            public void j(H h0) throws GeneralSecurityException {
                b0.a(h0.d());
                switch(h0.a().J()) {
                    case 12: 
                    case 16: {
                        return;
                    }
                    default: {
                        throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
                    }
                }
            }
        }

        return new com.google.crypto.tink.aead.j.b(this, H.class);
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
        this.u(((G)r00));
    }

    public static final t m() {
        return j.p(16, 16, com.google.crypto.tink.t.b.a);
    }

    public static final t n() {
        return j.p(0x20, 16, com.google.crypto.tink.t.b.a);
    }

    private static com.google.crypto.tink.internal.h.a.a o(int v, int v1, com.google.crypto.tink.t.b t$b0) {
        return new com.google.crypto.tink.internal.h.a.a(((H)H.N2().T1(v).V1(((K)K.I2().R1(v1).B1())).B1()), t$b0);
    }

    // 去混淆评级： 低(20)
    private static t p(int v, int v1, com.google.crypto.tink.t.b t$b0) {
        return t.a("type.googleapis.com/google.crypto.tink.AesEaxKey", ((H)H.N2().T1(v).V1(((K)K.I2().R1(v1).B1())).B1()).toByteArray(), t$b0);
    }

    public G q(u u0) throws y0 {
        return G.V2(u0, V.d());
    }

    public static final t r() {
        return j.p(16, 16, com.google.crypto.tink.t.b.c);
    }

    public static final t s() {
        return j.p(0x20, 16, com.google.crypto.tink.t.b.c);
    }

    public static void t(boolean z) throws GeneralSecurityException {
        O.D(new j(), z);
        p.h();
    }

    public void u(G g0) throws GeneralSecurityException {
        b0.j(g0.getVersion(), 0);
        b0.a(g0.c().size());
        switch(g0.a().J()) {
            case 12: 
            case 16: {
                return;
            }
            default: {
                throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
            }
        }
    }
}

