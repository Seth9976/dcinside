package com.google.crypto.tink.prf;

import com.google.crypto.tink.O;
import com.google.crypto.tink.config.internal.c.b;
import com.google.crypto.tink.internal.h;
import com.google.crypto.tink.internal.r;
import com.google.crypto.tink.proto.Y0;
import com.google.crypto.tink.proto.o1;
import com.google.crypto.tink.proto.p1;
import com.google.crypto.tink.proto.s1;
import com.google.crypto.tink.shaded.protobuf.R0;
import com.google.crypto.tink.shaded.protobuf.V;
import com.google.crypto.tink.shaded.protobuf.u;
import com.google.crypto.tink.shaded.protobuf.y0;
import com.google.crypto.tink.subtle.J;
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

public final class j extends h {
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

    public j() {
        class a extends r {
            a(Class class0) {
            }

            @Override  // com.google.crypto.tink.internal.r
            public Object a(R0 r00) throws GeneralSecurityException {
                return this.c(((o1)r00));
            }

            public k c(o1 o10) throws GeneralSecurityException {
                Y0 y00 = o10.a().j();
                SecretKeySpec secretKeySpec0 = new SecretKeySpec(o10.c().a0(), "HMAC");
                switch(y00) {
                    case 1: {
                        return new J("HMACSHA1", secretKeySpec0);
                    }
                    case 2: {
                        return new J("HMACSHA224", secretKeySpec0);
                    }
                    case 3: {
                        return new J("HMACSHA256", secretKeySpec0);
                    }
                    case 4: {
                        return new J("HMACSHA384", secretKeySpec0);
                    }
                    case 5: {
                        return new J("HMACSHA512", secretKeySpec0);
                    }
                    default: {
                        throw new GeneralSecurityException("unknown hash");
                    }
                }
            }
        }

        r[] arr_r = {new a(k.class)};
        super(o1.class, arr_r);
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
        class com.google.crypto.tink.prf.j.b extends com.google.crypto.tink.internal.h.a {
            final j b;

            com.google.crypto.tink.prf.j.b(Class class0) {
                super(class0);
            }

            @Override  // com.google.crypto.tink.internal.h$a
            public R0 a(R0 r00) throws GeneralSecurityException {
                return this.h(((p1)r00));
            }

            @Override  // com.google.crypto.tink.internal.h$a
            public R0 b(R0 r00, InputStream inputStream0) throws GeneralSecurityException {
                return this.i(((p1)r00), inputStream0);
            }

            @Override  // com.google.crypto.tink.internal.h$a
            public Map d() throws GeneralSecurityException {
                HashMap hashMap0 = new HashMap();
                hashMap0.put("HMAC_SHA256_PRF", new com.google.crypto.tink.internal.h.a.a(((p1)p1.Q2().W1(((s1)s1.J2().R1(Y0.e).B1())).U1(0x20).B1()), com.google.crypto.tink.t.b.c));
                hashMap0.put("HMAC_SHA512_PRF", new com.google.crypto.tink.internal.h.a.a(((p1)p1.Q2().W1(((s1)s1.J2().R1(Y0.f).B1())).U1(0x40).B1()), com.google.crypto.tink.t.b.c));
                return DesugarCollections.unmodifiableMap(hashMap0);
            }

            @Override  // com.google.crypto.tink.internal.h$a
            public R0 e(u u0) throws y0 {
                return this.j(u0);
            }

            @Override  // com.google.crypto.tink.internal.h$a
            public void g(R0 r00) throws GeneralSecurityException {
                this.k(((p1)r00));
            }

            public o1 h(p1 p10) {
                return (o1)o1.Q2().X1(0).W1(p10.a()).U1(u.p(L.c(p10.d()))).B1();
            }

            public o1 i(p1 p10, InputStream inputStream0) throws GeneralSecurityException {
                b0.j(p10.getVersion(), 0);
                byte[] arr_b = new byte[p10.d()];
                try {
                    com.google.crypto.tink.internal.h.a.f(inputStream0, arr_b);
                    return (o1)o1.Q2().X1(0).W1(p10.a()).U1(u.p(arr_b)).B1();
                }
                catch(IOException iOException0) {
                    throw new GeneralSecurityException("Reading pseudorandomness failed", iOException0);
                }
            }

            public p1 j(u u0) throws y0 {
                return p1.V2(u0, V.d());
            }

            public void k(p1 p10) throws GeneralSecurityException {
                if(p10.d() < 16) {
                    throw new GeneralSecurityException("key too short");
                }
                j.s(p10.a());
            }
        }

        return new com.google.crypto.tink.prf.j.b(this, p1.class);
    }

    @Override  // com.google.crypto.tink.internal.h
    public com.google.crypto.tink.proto.k2.c h() {
        return com.google.crypto.tink.proto.k2.c.c;
    }

    @Override  // com.google.crypto.tink.internal.h
    public R0 i(u u0) throws y0 {
        return this.p(u0);
    }

    @Override  // com.google.crypto.tink.internal.h
    public void k(R0 r00) throws GeneralSecurityException {
        this.r(((o1)r00));
    }

    private static t m(int v, Y0 y00) {
        s1 s10 = (s1)s1.J2().R1(y00).B1();
        return t.a("type.googleapis.com/google.crypto.tink.HmacPrfKey", ((p1)p1.Q2().W1(s10).U1(v).B1()).toByteArray(), com.google.crypto.tink.t.b.c);
    }

    public static final t n() {
        return j.m(0x20, Y0.e);
    }

    public static final t o() {
        return j.m(0x40, Y0.f);
    }

    public o1 p(u u0) throws y0 {
        return o1.V2(u0, V.d());
    }

    public static void q(boolean z) throws GeneralSecurityException {
        O.D(new j(), z);
    }

    public void r(o1 o10) throws GeneralSecurityException {
        b0.j(o10.getVersion(), 0);
        if(o10.c().size() < 16) {
            throw new GeneralSecurityException("key too short");
        }
        j.s(o10.a());
    }

    private static void s(s1 s10) throws GeneralSecurityException {
        if(s10.j() != Y0.c && s10.j() != Y0.g && s10.j() != Y0.e && s10.j() != Y0.d && s10.j() != Y0.f) {
            throw new GeneralSecurityException("unknown hash type");
        }
    }
}

