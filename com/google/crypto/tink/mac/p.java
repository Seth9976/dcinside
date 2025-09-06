package com.google.crypto.tink.mac;

import com.google.crypto.tink.C;
import com.google.crypto.tink.O;
import com.google.crypto.tink.config.internal.c.b;
import com.google.crypto.tink.internal.h;
import com.google.crypto.tink.internal.m;
import com.google.crypto.tink.internal.q;
import com.google.crypto.tink.internal.r;
import com.google.crypto.tink.proto.Y0;
import com.google.crypto.tink.proto.h1;
import com.google.crypto.tink.proto.i1;
import com.google.crypto.tink.proto.l1;
import com.google.crypto.tink.shaded.protobuf.R0;
import com.google.crypto.tink.shaded.protobuf.V;
import com.google.crypto.tink.shaded.protobuf.u;
import com.google.crypto.tink.shaded.protobuf.y0;
import com.google.crypto.tink.subtle.J;
import com.google.crypto.tink.subtle.K;
import com.google.crypto.tink.subtle.L;
import com.google.crypto.tink.subtle.b0;
import com.google.crypto.tink.t;
import j..util.DesugarCollections;
import java.io.IOException;
import java.io.InputStream;
import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.spec.SecretKeySpec;

public final class p extends h {
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
                c.a[Y0.g.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                c.a[Y0.e.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                c.a[Y0.d.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                c.a[Y0.f.ordinal()] = 5;
            }
            catch(NoSuchFieldError unused_ex) {
            }
        }
    }

    private static final int d = 16;
    private static final int e = 10;
    private static final q f;

    static {
        p.f = q.b(new o(), n.class, j.class);
    }

    public p() {
        class a extends r {
            a(Class class0) {
            }

            @Override  // com.google.crypto.tink.internal.r
            public Object a(R0 r00) throws GeneralSecurityException {
                return this.c(((h1)r00));
            }

            public C c(h1 h10) throws GeneralSecurityException {
                Y0 y00 = h10.a().j();
                SecretKeySpec secretKeySpec0 = new SecretKeySpec(h10.c().a0(), "HMAC");
                int v = h10.a().E();
                switch(y00) {
                    case 1: {
                        return new K(new J("HMACSHA1", secretKeySpec0), v);
                    }
                    case 2: {
                        return new K(new J("HMACSHA224", secretKeySpec0), v);
                    }
                    case 3: {
                        return new K(new J("HMACSHA256", secretKeySpec0), v);
                    }
                    case 4: {
                        return new K(new J("HMACSHA384", secretKeySpec0), v);
                    }
                    case 5: {
                        return new K(new J("HMACSHA512", secretKeySpec0), v);
                    }
                    default: {
                        throw new GeneralSecurityException("unknown hash");
                    }
                }
            }
        }

        r[] arr_r = {new a(C.class)};
        super(h1.class, arr_r);
    }

    @Override  // com.google.crypto.tink.internal.h
    public b a() {
        return b.b;
    }

    @Override  // com.google.crypto.tink.internal.h
    public String d() [...] // 潜在的解密器

    @Override  // com.google.crypto.tink.internal.h
    public int f() [...] // Inlined contents

    @Override  // com.google.crypto.tink.internal.h
    public com.google.crypto.tink.internal.h.a g() {
        class com.google.crypto.tink.mac.p.b extends com.google.crypto.tink.internal.h.a {
            final p b;

            com.google.crypto.tink.mac.p.b(Class class0) {
                super(class0);
            }

            @Override  // com.google.crypto.tink.internal.h$a
            public R0 a(R0 r00) throws GeneralSecurityException {
                return this.h(((i1)r00));
            }

            @Override  // com.google.crypto.tink.internal.h$a
            public R0 b(R0 r00, InputStream inputStream0) throws GeneralSecurityException {
                return this.i(((i1)r00), inputStream0);
            }

            @Override  // com.google.crypto.tink.internal.h$a
            public Map d() throws GeneralSecurityException {
                HashMap hashMap0 = new HashMap();
                hashMap0.put("HMAC_SHA256_128BITTAG", p.n(0x20, 16, Y0.e, com.google.crypto.tink.t.b.a));
                hashMap0.put("HMAC_SHA256_128BITTAG_RAW", p.n(0x20, 16, Y0.e, com.google.crypto.tink.t.b.c));
                hashMap0.put("HMAC_SHA256_256BITTAG", p.n(0x20, 0x20, Y0.e, com.google.crypto.tink.t.b.a));
                hashMap0.put("HMAC_SHA256_256BITTAG_RAW", p.n(0x20, 0x20, Y0.e, com.google.crypto.tink.t.b.c));
                hashMap0.put("HMAC_SHA512_128BITTAG", p.n(0x40, 16, Y0.f, com.google.crypto.tink.t.b.a));
                hashMap0.put("HMAC_SHA512_128BITTAG_RAW", p.n(0x40, 16, Y0.f, com.google.crypto.tink.t.b.c));
                hashMap0.put("HMAC_SHA512_256BITTAG", p.n(0x40, 0x20, Y0.f, com.google.crypto.tink.t.b.a));
                hashMap0.put("HMAC_SHA512_256BITTAG_RAW", p.n(0x40, 0x20, Y0.f, com.google.crypto.tink.t.b.c));
                hashMap0.put("HMAC_SHA512_512BITTAG", p.n(0x40, 0x40, Y0.f, com.google.crypto.tink.t.b.a));
                hashMap0.put("HMAC_SHA512_512BITTAG_RAW", p.n(0x40, 0x40, Y0.f, com.google.crypto.tink.t.b.c));
                return DesugarCollections.unmodifiableMap(hashMap0);
            }

            @Override  // com.google.crypto.tink.internal.h$a
            public R0 e(u u0) throws y0 {
                return this.j(u0);
            }

            @Override  // com.google.crypto.tink.internal.h$a
            public void g(R0 r00) throws GeneralSecurityException {
                this.k(((i1)r00));
            }

            public h1 h(i1 i10) throws GeneralSecurityException {
                return (h1)h1.Q2().X1(0).W1(i10.a()).U1(u.p(L.c(i10.d()))).B1();
            }

            public h1 i(i1 i10, InputStream inputStream0) throws GeneralSecurityException {
                b0.j(i10.getVersion(), 0);
                byte[] arr_b = new byte[i10.d()];
                try {
                    com.google.crypto.tink.internal.h.a.f(inputStream0, arr_b);
                    return (h1)h1.Q2().X1(0).W1(i10.a()).U1(u.p(arr_b)).B1();
                }
                catch(IOException iOException0) {
                    throw new GeneralSecurityException("Reading pseudorandomness failed", iOException0);
                }
            }

            public i1 j(u u0) throws y0 {
                return i1.V2(u0, V.d());
            }

            public void k(i1 i10) throws GeneralSecurityException {
                if(i10.d() < 16) {
                    throw new GeneralSecurityException("key too short");
                }
                p.w(i10.a());
            }
        }

        return new com.google.crypto.tink.mac.p.b(this, i1.class);
    }

    @Override  // com.google.crypto.tink.internal.h
    public com.google.crypto.tink.proto.k2.c h() {
        return com.google.crypto.tink.proto.k2.c.c;
    }

    @Override  // com.google.crypto.tink.internal.h
    public R0 i(u u0) throws y0 {
        return this.t(u0);
    }

    @Override  // com.google.crypto.tink.internal.h
    public void k(R0 r00) throws GeneralSecurityException {
        this.v(((h1)r00));
    }

    private static com.google.crypto.tink.internal.h.a.a n(int v, int v1, Y0 y00, com.google.crypto.tink.t.b t$b0) {
        return new com.google.crypto.tink.internal.h.a.a(((i1)i1.Q2().W1(((l1)l1.M2().S1(y00).U1(v1).B1())).U1(v).B1()), t$b0);
    }

    private static t o(int v, int v1, Y0 y00) {
        l1 l10 = (l1)l1.M2().S1(y00).U1(v1).B1();
        return t.a("type.googleapis.com/google.crypto.tink.HmacKey", ((i1)i1.Q2().W1(l10).U1(v).B1()).toByteArray(), com.google.crypto.tink.t.b.a);
    }

    public static final t p() {
        return p.o(0x20, 16, Y0.e);
    }

    public static final t q() {
        return p.o(0x20, 0x20, Y0.e);
    }

    public static final t r() {
        return p.o(0x40, 0x20, Y0.f);
    }

    public static final t s() {
        return p.o(0x40, 0x40, Y0.f);
    }

    public h1 t(u u0) throws y0 {
        return h1.V2(u0, V.d());
    }

    public static void u(boolean z) throws GeneralSecurityException {
        O.D(new p(), z);
        v.h();
        m.c().d(p.f);
    }

    public void v(h1 h10) throws GeneralSecurityException {
        b0.j(h10.getVersion(), 0);
        if(h10.c().size() < 16) {
            throw new GeneralSecurityException("key too short");
        }
        p.w(h10.a());
    }

    private static void w(l1 l10) throws GeneralSecurityException {
        if(l10.E() >= 10) {
            switch(c.a[l10.j().ordinal()]) {
                case 1: {
                    if(l10.E() > 20) {
                        throw new GeneralSecurityException("tag size too big");
                    }
                    return;
                }
                case 2: {
                    if(l10.E() > 28) {
                        throw new GeneralSecurityException("tag size too big");
                    }
                    return;
                }
                case 3: {
                    if(l10.E() > 0x20) {
                        throw new GeneralSecurityException("tag size too big");
                    }
                    return;
                }
                case 4: {
                    if(l10.E() > 0x30) {
                        throw new GeneralSecurityException("tag size too big");
                    }
                    return;
                }
                case 5: {
                    if(l10.E() > 0x40) {
                        throw new GeneralSecurityException("tag size too big");
                    }
                    return;
                }
                default: {
                    throw new GeneralSecurityException("unknown hash type");
                }
            }
        }
        throw new GeneralSecurityException("tag size too small");
    }
}

