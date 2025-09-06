package com.google.crypto.tink.aead;

import com.google.crypto.tink.O;
import com.google.crypto.tink.aead.subtle.c;
import com.google.crypto.tink.b;
import com.google.crypto.tink.internal.h;
import com.google.crypto.tink.internal.r;
import com.google.crypto.tink.proto.a0;
import com.google.crypto.tink.proto.b0;
import com.google.crypto.tink.shaded.protobuf.R0;
import com.google.crypto.tink.shaded.protobuf.V;
import com.google.crypto.tink.shaded.protobuf.u;
import com.google.crypto.tink.shaded.protobuf.y0;
import com.google.crypto.tink.subtle.L;
import com.google.crypto.tink.t;
import j..util.DesugarCollections;
import java.io.IOException;
import java.io.InputStream;
import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;

public final class z extends h {
    z() {
        class a extends r {
            a(Class class0) {
            }

            @Override  // com.google.crypto.tink.internal.r
            public Object a(R0 r00) throws GeneralSecurityException {
                return this.c(((a0)r00));
            }

            public b c(a0 a00) throws GeneralSecurityException {
                return new c(a00.c().a0());
            }
        }

        r[] arr_r = {new a(b.class)};
        super(a0.class, arr_r);
    }

    @Override  // com.google.crypto.tink.internal.h
    public String d() [...] // 潜在的解密器

    @Override  // com.google.crypto.tink.internal.h
    public int f() [...] // Inlined contents

    @Override  // com.google.crypto.tink.internal.h
    public com.google.crypto.tink.internal.h.a g() {
        class com.google.crypto.tink.aead.z.b extends com.google.crypto.tink.internal.h.a {
            final z b;

            com.google.crypto.tink.aead.z.b(Class class0) {
                super(class0);
            }

            @Override  // com.google.crypto.tink.internal.h$a
            public R0 a(R0 r00) throws GeneralSecurityException {
                return this.h(((b0)r00));
            }

            @Override  // com.google.crypto.tink.internal.h$a
            public R0 b(R0 r00, InputStream inputStream0) throws GeneralSecurityException {
                return this.i(((b0)r00), inputStream0);
            }

            @Override  // com.google.crypto.tink.internal.h$a
            public Map d() throws GeneralSecurityException {
                HashMap hashMap0 = new HashMap();
                hashMap0.put("AES128_GCM_SIV", z.p(16, com.google.crypto.tink.t.b.a));
                hashMap0.put("AES128_GCM_SIV_RAW", z.p(16, com.google.crypto.tink.t.b.c));
                hashMap0.put("AES256_GCM_SIV", z.p(0x20, com.google.crypto.tink.t.b.a));
                hashMap0.put("AES256_GCM_SIV_RAW", z.p(0x20, com.google.crypto.tink.t.b.c));
                return DesugarCollections.unmodifiableMap(hashMap0);
            }

            @Override  // com.google.crypto.tink.internal.h$a
            public R0 e(u u0) throws y0 {
                return this.j(u0);
            }

            @Override  // com.google.crypto.tink.internal.h$a
            public void g(R0 r00) throws GeneralSecurityException {
                this.k(((b0)r00));
            }

            public a0 h(b0 b00) {
                return (a0)a0.L2().S1(u.p(L.c(b00.d()))).T1(0).B1();
            }

            public a0 i(b0 b00, InputStream inputStream0) throws GeneralSecurityException {
                com.google.crypto.tink.subtle.b0.j(b00.getVersion(), 0);
                byte[] arr_b = new byte[b00.d()];
                try {
                    com.google.crypto.tink.internal.h.a.f(inputStream0, arr_b);
                    return (a0)a0.L2().S1(u.p(arr_b)).T1(0).B1();
                }
                catch(IOException iOException0) {
                    throw new GeneralSecurityException("Reading pseudorandomness failed", iOException0);
                }
            }

            public b0 j(u u0) throws y0 {
                return b0.Q2(u0, V.d());
            }

            public void k(b0 b00) throws GeneralSecurityException {
                com.google.crypto.tink.subtle.b0.a(b00.d());
            }
        }

        return new com.google.crypto.tink.aead.z.b(this, b0.class);
    }

    @Override  // com.google.crypto.tink.internal.h
    public com.google.crypto.tink.proto.k2.c h() {
        return com.google.crypto.tink.proto.k2.c.c;
    }

    @Override  // com.google.crypto.tink.internal.h
    public R0 i(u u0) throws y0 {
        return this.r(u0);
    }

    @Override  // com.google.crypto.tink.internal.h
    public void k(R0 r00) throws GeneralSecurityException {
        this.v(((a0)r00));
    }

    public static final t m() {
        return z.q(16, com.google.crypto.tink.t.b.a);
    }

    public static final t n() {
        return z.q(0x20, com.google.crypto.tink.t.b.a);
    }

    private static boolean o() {
        try {
            Cipher.getInstance("AES/GCM-SIV/NoPadding");
            return true;
        }
        catch(NoSuchAlgorithmException | NoSuchPaddingException unused_ex) {
            return false;
        }
    }

    private static com.google.crypto.tink.internal.h.a.a p(int v, com.google.crypto.tink.t.b t$b0) {
        return new com.google.crypto.tink.internal.h.a.a(((b0)b0.L2().S1(v).B1()), t$b0);
    }

    // 去混淆评级： 低(20)
    private static t q(int v, com.google.crypto.tink.t.b t$b0) {
        return t.a("type.googleapis.com/google.crypto.tink.AesGcmSivKey", ((b0)b0.L2().S1(v).B1()).toByteArray(), t$b0);
    }

    public a0 r(u u0) throws y0 {
        return a0.Q2(u0, V.d());
    }

    public static final t s() {
        return z.q(16, com.google.crypto.tink.t.b.c);
    }

    public static final t t() {
        return z.q(0x20, com.google.crypto.tink.t.b.c);
    }

    public static void u(boolean z) throws GeneralSecurityException {
        if(z.o()) {
            O.D(new z(), z);
            F.g();
        }
    }

    public void v(a0 a00) throws GeneralSecurityException {
        com.google.crypto.tink.subtle.b0.j(a00.getVersion(), 0);
        com.google.crypto.tink.subtle.b0.a(a00.c().size());
    }
}

