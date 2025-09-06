package com.google.crypto.tink.daead;

import com.google.crypto.tink.O;
import com.google.crypto.tink.i;
import com.google.crypto.tink.internal.h;
import com.google.crypto.tink.internal.r;
import com.google.crypto.tink.proto.f0;
import com.google.crypto.tink.proto.g0;
import com.google.crypto.tink.proto.k2.c;
import com.google.crypto.tink.shaded.protobuf.R0;
import com.google.crypto.tink.shaded.protobuf.V;
import com.google.crypto.tink.shaded.protobuf.u;
import com.google.crypto.tink.shaded.protobuf.y0;
import com.google.crypto.tink.subtle.L;
import com.google.crypto.tink.subtle.b0;
import com.google.crypto.tink.subtle.f;
import com.google.crypto.tink.t;
import j..util.DesugarCollections;
import java.io.IOException;
import java.io.InputStream;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.util.HashMap;
import java.util.Map;

public final class a extends h {
    private static final int d = 0x40;

    a() {
        class com.google.crypto.tink.daead.a.a extends r {
            com.google.crypto.tink.daead.a.a(Class class0) {
            }

            @Override  // com.google.crypto.tink.internal.r
            public Object a(R0 r00) throws GeneralSecurityException {
                return this.c(((f0)r00));
            }

            public i c(f0 f00) throws GeneralSecurityException {
                return new f(f00.c().a0());
            }
        }

        r[] arr_r = {new com.google.crypto.tink.daead.a.a(i.class)};
        super(f0.class, arr_r);
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
                return this.h(((g0)r00));
            }

            @Override  // com.google.crypto.tink.internal.h$a
            public R0 b(R0 r00, InputStream inputStream0) throws GeneralSecurityException {
                return this.i(((g0)r00), inputStream0);
            }

            @Override  // com.google.crypto.tink.internal.h$a
            public Map d() throws GeneralSecurityException {
                HashMap hashMap0 = new HashMap();
                hashMap0.put("AES256_SIV", new com.google.crypto.tink.internal.h.a.a(((g0)g0.L2().S1(0x40).B1()), com.google.crypto.tink.t.b.a));
                hashMap0.put("AES256_SIV_RAW", new com.google.crypto.tink.internal.h.a.a(((g0)g0.L2().S1(0x40).B1()), com.google.crypto.tink.t.b.c));
                return DesugarCollections.unmodifiableMap(hashMap0);
            }

            @Override  // com.google.crypto.tink.internal.h$a
            public R0 e(u u0) throws y0 {
                return this.j(u0);
            }

            @Override  // com.google.crypto.tink.internal.h$a
            public void g(R0 r00) throws GeneralSecurityException {
                this.k(((g0)r00));
            }

            public f0 h(g0 g00) throws GeneralSecurityException {
                return (f0)f0.L2().S1(u.p(L.c(g00.d()))).T1(0).B1();
            }

            public f0 i(g0 g00, InputStream inputStream0) throws GeneralSecurityException {
                b0.j(g00.getVersion(), 0);
                byte[] arr_b = new byte[0x40];
                try {
                    com.google.crypto.tink.internal.h.a.f(inputStream0, arr_b);
                    return (f0)f0.L2().S1(u.p(arr_b)).T1(0).B1();
                }
                catch(IOException iOException0) {
                    throw new GeneralSecurityException("Reading pseudorandomness failed", iOException0);
                }
            }

            public g0 j(u u0) throws y0 {
                return g0.Q2(u0, V.d());
            }

            public void k(g0 g00) throws GeneralSecurityException {
                if(g00.d() != 0x40) {
                    throw new InvalidAlgorithmParameterException("invalid key size: " + g00.d() + ". Valid keys must have " + 0x40 + " bytes.");
                }
            }
        }

        return new b(this, g0.class);
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
        this.q(((f0)r00));
    }

    public static final t l() {
        return a.m(0x40, com.google.crypto.tink.t.b.a);
    }

    // 去混淆评级： 低(20)
    private static t m(int v, com.google.crypto.tink.t.b t$b0) {
        return t.a("type.googleapis.com/google.crypto.tink.AesSivKey", ((g0)g0.L2().S1(v).B1()).toByteArray(), t$b0);
    }

    public f0 n(u u0) throws y0 {
        return f0.Q2(u0, V.d());
    }

    public static final t o() {
        return a.m(0x40, com.google.crypto.tink.t.b.c);
    }

    public static void p(boolean z) throws GeneralSecurityException {
        O.D(new a(), z);
    }

    public void q(f0 f00) throws GeneralSecurityException {
        b0.j(f00.getVersion(), 0);
        if(f00.c().size() != 0x40) {
            throw new InvalidKeyException("invalid key size: " + f00.c().size() + ". Valid keys must have " + 0x40 + " bytes.");
        }
    }
}

