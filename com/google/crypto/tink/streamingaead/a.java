package com.google.crypto.tink.streamingaead;

import com.google.crypto.tink.O;
import com.google.crypto.tink.Q;
import com.google.crypto.tink.internal.h;
import com.google.crypto.tink.internal.r;
import com.google.crypto.tink.proto.Y0;
import com.google.crypto.tink.proto.l1;
import com.google.crypto.tink.proto.t;
import com.google.crypto.tink.proto.u;
import com.google.crypto.tink.proto.x;
import com.google.crypto.tink.shaded.protobuf.R0;
import com.google.crypto.tink.shaded.protobuf.V;
import com.google.crypto.tink.shaded.protobuf.y0;
import com.google.crypto.tink.subtle.L;
import com.google.crypto.tink.subtle.b0;
import j..util.DesugarCollections;
import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

public final class a extends h {
    static class c {
        static final int[] a;

        static {
            int[] arr_v = new int[Y0.values().length];
            c.a = arr_v;
            try {
                arr_v[Y0.c.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                c.a[Y0.e.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                c.a[Y0.f.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
        }
    }

    private static final int d = 10;
    private static final int e = 7;

    a() {
        class com.google.crypto.tink.streamingaead.a.a extends r {
            com.google.crypto.tink.streamingaead.a.a(Class class0) {
            }

            @Override  // com.google.crypto.tink.internal.r
            public Object a(R0 r00) throws GeneralSecurityException {
                return this.c(((t)r00));
            }

            public Q c(t t0) throws GeneralSecurityException {
                return new com.google.crypto.tink.subtle.a(t0.c().a0(), p.a(t0.a().B()), t0.a().K(), p.a(t0.a().M0().j()), t0.a().M0().E(), t0.a().G(), 0);
            }
        }

        r[] arr_r = {new com.google.crypto.tink.streamingaead.a.a(Q.class)};
        super(t.class, arr_r);
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
                return this.h(((u)r00));
            }

            @Override  // com.google.crypto.tink.internal.h$a
            public Map d() throws GeneralSecurityException {
                HashMap hashMap0 = new HashMap();
                hashMap0.put("AES128_CTR_HMAC_SHA256_4KB", new com.google.crypto.tink.internal.h.a.a(a.r(16, Y0.e, 16, Y0.e, 0x20, 0x1000), com.google.crypto.tink.t.b.c));
                hashMap0.put("AES128_CTR_HMAC_SHA256_1MB", new com.google.crypto.tink.internal.h.a.a(a.r(16, Y0.e, 16, Y0.e, 0x20, 0x100000), com.google.crypto.tink.t.b.c));
                hashMap0.put("AES256_CTR_HMAC_SHA256_4KB", new com.google.crypto.tink.internal.h.a.a(a.r(0x20, Y0.e, 0x20, Y0.e, 0x20, 0x1000), com.google.crypto.tink.t.b.c));
                hashMap0.put("AES256_CTR_HMAC_SHA256_1MB", new com.google.crypto.tink.internal.h.a.a(a.r(0x20, Y0.e, 0x20, Y0.e, 0x20, 0x100000), com.google.crypto.tink.t.b.c));
                return DesugarCollections.unmodifiableMap(hashMap0);
            }

            @Override  // com.google.crypto.tink.internal.h$a
            public R0 e(com.google.crypto.tink.shaded.protobuf.u u0) throws y0 {
                return this.i(u0);
            }

            @Override  // com.google.crypto.tink.internal.h$a
            public void g(R0 r00) throws GeneralSecurityException {
                this.j(((u)r00));
            }

            public t h(u u0) throws GeneralSecurityException {
                return (t)t.Q2().U1(com.google.crypto.tink.shaded.protobuf.u.p(L.c(u0.d()))).W1(u0.a()).X1(0).B1();
            }

            public u i(com.google.crypto.tink.shaded.protobuf.u u0) throws y0 {
                return u.V2(u0, V.d());
            }

            public void j(u u0) throws GeneralSecurityException {
                if(u0.d() < 16) {
                    throw new GeneralSecurityException("key_size must be at least 16 bytes");
                }
                a.x(u0.a());
            }
        }

        return new b(this, u.class);
    }

    @Override  // com.google.crypto.tink.internal.h
    public com.google.crypto.tink.proto.k2.c h() {
        return com.google.crypto.tink.proto.k2.c.c;
    }

    @Override  // com.google.crypto.tink.internal.h
    public R0 i(com.google.crypto.tink.shaded.protobuf.u u0) throws y0 {
        return this.t(u0);
    }

    @Override  // com.google.crypto.tink.internal.h
    public void k(R0 r00) throws GeneralSecurityException {
        this.w(((t)r00));
    }

    public static final com.google.crypto.tink.t n() {
        return a.s(16, Y0.e, 16, Y0.e, 0x20, 0x100000);
    }

    public static final com.google.crypto.tink.t o() {
        return a.s(16, Y0.e, 16, Y0.e, 0x20, 0x1000);
    }

    public static final com.google.crypto.tink.t p() {
        return a.s(0x20, Y0.e, 0x20, Y0.e, 0x20, 0x100000);
    }

    public static final com.google.crypto.tink.t q() {
        return a.s(0x20, Y0.e, 0x20, Y0.e, 0x20, 0x1000);
    }

    private static u r(int v, Y0 y00, int v1, Y0 y01, int v2, int v3) {
        l1 l10 = (l1)l1.M2().S1(y01).U1(v2).B1();
        x x0 = (x)x.U2().V1(v3).W1(v1).X1(y00).a2(l10).B1();
        return (u)u.Q2().W1(x0).U1(v).B1();
    }

    // 去混淆评级： 低(20)
    private static com.google.crypto.tink.t s(int v, Y0 y00, int v1, Y0 y01, int v2, int v3) {
        return com.google.crypto.tink.t.a("type.googleapis.com/google.crypto.tink.AesCtrHmacStreamingKey", a.r(v, y00, v1, y01, v2, v3).toByteArray(), com.google.crypto.tink.t.b.c);
    }

    public t t(com.google.crypto.tink.shaded.protobuf.u u0) throws y0 {
        return t.V2(u0, V.d());
    }

    public static void u(boolean z) throws GeneralSecurityException {
        O.D(new a(), z);
    }

    private static void v(l1 l10) throws GeneralSecurityException {
        if(l10.E() < 10) {
            throw new GeneralSecurityException("tag size too small");
        }
        switch(l10.j()) {
            case 1: {
                if(l10.E() > 20) {
                    throw new GeneralSecurityException("tag size too big");
                }
                break;
            }
            case 2: {
                if(l10.E() > 0x20) {
                    throw new GeneralSecurityException("tag size too big");
                }
                break;
            }
            case 3: {
                if(l10.E() > 0x40) {
                    throw new GeneralSecurityException("tag size too big");
                }
                break;
            }
            default: {
                throw new GeneralSecurityException("unknown hash type");
            }
        }
    }

    public void w(t t0) throws GeneralSecurityException {
        b0.j(t0.getVersion(), 0);
        if(t0.c().size() < 16) {
            throw new GeneralSecurityException("key_value must have at least 16 bytes");
        }
        int v = t0.a().K();
        if(t0.c().size() < v) {
            throw new GeneralSecurityException("key_value must have at least as many bits as derived keys");
        }
        a.x(t0.a());
    }

    private static void x(x x0) throws GeneralSecurityException {
        b0.a(x0.K());
        if(x0.B() != Y0.c && x0.B() != Y0.e && x0.B() != Y0.f) {
            throw new GeneralSecurityException("Invalid HKDF hash type: " + x0.B().getNumber());
        }
        if(x0.M0().j() == Y0.b) {
            throw new GeneralSecurityException("unknown HMAC hash type");
        }
        a.v(x0.M0());
        if(x0.G() < x0.K() + x0.M0().E() + 9) {
            throw new GeneralSecurityException("ciphertext_segment_size must be at least (derived_key_size + tag_size + NONCE_PREFIX_IN_BYTES + 2)");
        }
    }
}

