package com.google.crypto.tink.signature;

import com.google.crypto.tink.M;
import com.google.crypto.tink.O;
import com.google.crypto.tink.internal.r;
import com.google.crypto.tink.internal.t;
import com.google.crypto.tink.proto.P0;
import com.google.crypto.tink.proto.T0;
import com.google.crypto.tink.proto.k2.c;
import com.google.crypto.tink.shaded.protobuf.R0;
import com.google.crypto.tink.shaded.protobuf.V;
import com.google.crypto.tink.shaded.protobuf.y0;
import com.google.crypto.tink.subtle.b0;
import com.google.crypto.tink.subtle.u;
import j..util.DesugarCollections;
import java.io.IOException;
import java.io.InputStream;
import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

public final class m extends t {
    m() {
        class a extends r {
            a(Class class0) {
            }

            @Override  // com.google.crypto.tink.internal.r
            public Object a(R0 r00) throws GeneralSecurityException {
                return this.c(((com.google.crypto.tink.proto.R0)r00));
            }

            public M c(com.google.crypto.tink.proto.R0 r00) throws GeneralSecurityException {
                return new u(r00.c().a0());
            }
        }

        r[] arr_r = {new a(M.class)};
        super(com.google.crypto.tink.proto.R0.class, T0.class, arr_r);
    }

    @Override  // com.google.crypto.tink.internal.h
    public String d() [...] // 潜在的解密器

    @Override  // com.google.crypto.tink.internal.h
    public int f() [...] // Inlined contents

    @Override  // com.google.crypto.tink.internal.h
    public com.google.crypto.tink.internal.h.a g() {
        class b extends com.google.crypto.tink.internal.h.a {
            final m b;

            b(Class class0) {
                super(class0);
            }

            @Override  // com.google.crypto.tink.internal.h$a
            public R0 a(R0 r00) throws GeneralSecurityException {
                return this.h(((P0)r00));
            }

            @Override  // com.google.crypto.tink.internal.h$a
            public R0 b(R0 r00, InputStream inputStream0) throws GeneralSecurityException {
                return this.i(((P0)r00), inputStream0);
            }

            @Override  // com.google.crypto.tink.internal.h$a
            public Map d() throws GeneralSecurityException {
                HashMap hashMap0 = new HashMap();
                hashMap0.put("ED25519", new com.google.crypto.tink.internal.h.a.a(P0.H2(), com.google.crypto.tink.t.b.a));
                hashMap0.put("ED25519_RAW", new com.google.crypto.tink.internal.h.a.a(P0.H2(), com.google.crypto.tink.t.b.c));
                hashMap0.put("ED25519WithRawOutput", new com.google.crypto.tink.internal.h.a.a(P0.H2(), com.google.crypto.tink.t.b.c));
                return DesugarCollections.unmodifiableMap(hashMap0);
            }

            @Override  // com.google.crypto.tink.internal.h$a
            public R0 e(com.google.crypto.tink.shaded.protobuf.u u0) throws y0 {
                return this.j(u0);
            }

            @Override  // com.google.crypto.tink.internal.h$a
            public void g(R0 r00) throws GeneralSecurityException {
            }

            public com.google.crypto.tink.proto.R0 h(P0 p00) throws GeneralSecurityException {
                com.google.crypto.tink.subtle.u.a u$a0 = com.google.crypto.tink.subtle.u.a.c();
                T0 t00 = (T0)T0.L2().T1(0).S1(com.google.crypto.tink.shaded.protobuf.u.p(u$a0.b())).B1();
                return (com.google.crypto.tink.proto.R0)com.google.crypto.tink.proto.R0.Q2().X1(0).U1(com.google.crypto.tink.shaded.protobuf.u.p(u$a0.a())).W1(t00).B1();
            }

            public com.google.crypto.tink.proto.R0 i(P0 p00, InputStream inputStream0) throws GeneralSecurityException {
                b0.j(p00.getVersion(), 0);
                byte[] arr_b = new byte[0x20];
                try {
                    com.google.crypto.tink.internal.h.a.f(inputStream0, arr_b);
                    com.google.crypto.tink.subtle.u.a u$a0 = com.google.crypto.tink.subtle.u.a.d(arr_b);
                    T0 t00 = (T0)T0.L2().T1(0).S1(com.google.crypto.tink.shaded.protobuf.u.p(u$a0.b())).B1();
                    return (com.google.crypto.tink.proto.R0)com.google.crypto.tink.proto.R0.Q2().X1(0).U1(com.google.crypto.tink.shaded.protobuf.u.p(u$a0.a())).W1(t00).B1();
                }
                catch(IOException iOException0) {
                    throw new GeneralSecurityException("Reading pseudorandomness failed", iOException0);
                }
            }

            public P0 j(com.google.crypto.tink.shaded.protobuf.u u0) throws y0 {
                return P0.N2(u0, V.d());
            }

            public void k(P0 p00) throws GeneralSecurityException {
            }
        }

        return new b(this, P0.class);
    }

    @Override  // com.google.crypto.tink.internal.h
    public c h() {
        return c.d;
    }

    @Override  // com.google.crypto.tink.internal.h
    public R0 i(com.google.crypto.tink.shaded.protobuf.u u0) throws y0 {
        return this.p(u0);
    }

    @Override  // com.google.crypto.tink.internal.h
    public void k(R0 r00) throws GeneralSecurityException {
        this.s(((com.google.crypto.tink.proto.R0)r00));
    }

    @Override  // com.google.crypto.tink.internal.t
    public R0 l(R0 r00) throws GeneralSecurityException {
        return this.o(((com.google.crypto.tink.proto.R0)r00));
    }

    // 去混淆评级： 低(20)
    public static final com.google.crypto.tink.t n() {
        return com.google.crypto.tink.t.a("type.googleapis.com/google.crypto.tink.Ed25519PrivateKey", new byte[0], com.google.crypto.tink.t.b.a);
    }

    public T0 o(com.google.crypto.tink.proto.R0 r00) throws GeneralSecurityException {
        return r00.e();
    }

    public com.google.crypto.tink.proto.R0 p(com.google.crypto.tink.shaded.protobuf.u u0) throws y0 {
        return com.google.crypto.tink.proto.R0.V2(u0, V.d());
    }

    // 去混淆评级： 低(20)
    public static final com.google.crypto.tink.t q() {
        return com.google.crypto.tink.t.a("type.googleapis.com/google.crypto.tink.Ed25519PrivateKey", new byte[0], com.google.crypto.tink.t.b.c);
    }

    public static void r(boolean z) throws GeneralSecurityException {
        O.A(new m(), new n(), z);
    }

    public void s(com.google.crypto.tink.proto.R0 r00) throws GeneralSecurityException {
        b0.j(r00.getVersion(), 0);
        new n().m(r00.e());
        if(r00.c().size() != 0x20) {
            throw new GeneralSecurityException("invalid Ed25519 private key: incorrect key length");
        }
    }
}

