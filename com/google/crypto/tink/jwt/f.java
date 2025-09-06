package com.google.crypto.tink.jwt;

import O1.j;
import com.google.crypto.tink.O;
import com.google.crypto.tink.internal.h;
import com.google.crypto.tink.internal.r;
import com.google.crypto.tink.proto.P1;
import com.google.crypto.tink.proto.Q1;
import com.google.crypto.tink.proto.R1;
import com.google.crypto.tink.shaded.protobuf.R0;
import com.google.crypto.tink.shaded.protobuf.V;
import com.google.crypto.tink.shaded.protobuf.u;
import com.google.crypto.tink.shaded.protobuf.y0;
import com.google.crypto.tink.subtle.J;
import com.google.crypto.tink.subtle.K;
import com.google.crypto.tink.subtle.L;
import com.google.crypto.tink.subtle.b0;
import com.google.crypto.tink.t;
import com.google.gson.m;
import j..util.DesugarCollections;
import j..util.Optional;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.spec.SecretKeySpec;

public final class f extends h {
    static class c {
        static final int[] a;

        static {
            int[] arr_v = new int[P1.values().length];
            c.a = arr_v;
            try {
                arr_v[P1.c.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                c.a[P1.d.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                c.a[P1.e.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
        }
    }

    @j
    static final class d implements com.google.crypto.tink.jwt.j {
        private final K a;
        private final String b;
        private final Optional c;

        public d(String s, Optional optional0, K k0) {
            this.b = s;
            this.c = optional0;
            this.a = k0;
        }

        @Override  // com.google.crypto.tink.jwt.j
        public z a(String s, x x0, Optional optional0) throws GeneralSecurityException {
            a e$a0 = e.n(s);
            this.a.a(e$a0.b, e$a0.a.getBytes(StandardCharsets.US_ASCII));
            m m0 = com.google.crypto.tink.jwt.a.b(e$a0.c);
            e.r(this.b, optional0, this.c, m0);
            return x0.c(y.b(e.l(m0), e$a0.d));
        }

        @Override  // com.google.crypto.tink.jwt.j
        public String b(y y0, Optional optional0) throws GeneralSecurityException {
            if(this.c.isPresent()) {
                if(optional0.isPresent()) {
                    throw new g("custom_kid can only be set for RAW keys.");
                }
                optional0 = this.c;
            }
            String s = e.c(this.b, optional0, y0);
            return e.b(s, this.a.b(s.getBytes(StandardCharsets.US_ASCII)));
        }
    }

    public f() {
        class com.google.crypto.tink.jwt.f.a extends r {
            com.google.crypto.tink.jwt.f.a(Class class0) {
            }

            @Override  // com.google.crypto.tink.internal.r
            public Object a(R0 r00) throws GeneralSecurityException {
                return this.c(((Q1)r00));
            }

            public com.google.crypto.tink.jwt.j c(Q1 q10) throws GeneralSecurityException {
                P1 p10 = q10.g();
                SecretKeySpec secretKeySpec0 = new SecretKeySpec(q10.c().a0(), "HMAC");
                J j0 = new J(f.s(p10), secretKeySpec0);
                K k0 = new K(j0, j0.d());
                if(q10.o()) {
                    Optional optional0 = Optional.of(q10.l().getValue());
                    return new d(f.r(p10), optional0, k0);
                }
                return new d(f.r(p10), Optional.empty(), k0);
            }
        }

        r[] arr_r = {new com.google.crypto.tink.jwt.f.a(com.google.crypto.tink.jwt.j.class)};
        super(Q1.class, arr_r);
    }

    @Override  // com.google.crypto.tink.internal.h
    public String d() [...] // 潜在的解密器

    @Override  // com.google.crypto.tink.internal.h
    public int f() [...] // Inlined contents

    @Override  // com.google.crypto.tink.internal.h
    public com.google.crypto.tink.internal.h.a g() {
        class b extends com.google.crypto.tink.internal.h.a {
            final f b;

            b(Class class0) {
                super(class0);
            }

            @Override  // com.google.crypto.tink.internal.h$a
            public R0 a(R0 r00) throws GeneralSecurityException {
                return this.h(((R1)r00));
            }

            @Override  // com.google.crypto.tink.internal.h$a
            public R0 b(R0 r00, InputStream inputStream0) throws GeneralSecurityException {
                return this.i(((R1)r00), inputStream0);
            }

            @Override  // com.google.crypto.tink.internal.h$a
            public Map d() {
                HashMap hashMap0 = new HashMap();
                hashMap0.put("JWT_HS256_RAW", f.p(P1.c, 0x20, com.google.crypto.tink.t.b.c));
                hashMap0.put("JWT_HS256", f.p(P1.c, 0x20, com.google.crypto.tink.t.b.a));
                hashMap0.put("JWT_HS384_RAW", f.p(P1.d, 0x30, com.google.crypto.tink.t.b.c));
                hashMap0.put("JWT_HS384", f.p(P1.d, 0x30, com.google.crypto.tink.t.b.a));
                hashMap0.put("JWT_HS512_RAW", f.p(P1.e, 0x40, com.google.crypto.tink.t.b.c));
                hashMap0.put("JWT_HS512", f.p(P1.e, 0x40, com.google.crypto.tink.t.b.a));
                return DesugarCollections.unmodifiableMap(hashMap0);
            }

            @Override  // com.google.crypto.tink.internal.h$a
            public R0 e(u u0) throws y0 {
                return this.j(u0);
            }

            @Override  // com.google.crypto.tink.internal.h$a
            public void g(R0 r00) throws GeneralSecurityException {
                this.k(((R1)r00));
            }

            public Q1 h(R1 r10) {
                return (Q1)Q1.U2().a2(0).V1(r10.g()).Z1(u.p(L.c(r10.d()))).B1();
            }

            public Q1 i(R1 r10, InputStream inputStream0) throws GeneralSecurityException {
                throw new UnsupportedOperationException();
            }

            public R1 j(u u0) throws y0 {
                return R1.U2(u0, V.d());
            }

            public void k(R1 r10) throws GeneralSecurityException {
                if(r10.d() < f.t(r10.g())) {
                    throw new GeneralSecurityException("key too short");
                }
            }
        }

        return new b(this, R1.class);
    }

    @Override  // com.google.crypto.tink.internal.h
    public com.google.crypto.tink.proto.k2.c h() {
        return com.google.crypto.tink.proto.k2.c.c;
    }

    @Override  // com.google.crypto.tink.internal.h
    public R0 i(u u0) throws y0 {
        return this.x(u0);
    }

    @Override  // com.google.crypto.tink.internal.h
    public void k(R0 r00) throws GeneralSecurityException {
        this.z(((Q1)r00));
    }

    private static com.google.crypto.tink.internal.h.a.a p(P1 p10, int v, com.google.crypto.tink.t.b t$b0) {
        return new com.google.crypto.tink.internal.h.a.a(((R1)R1.P2().T1(p10).V1(v).B1()), t$b0);
    }

    // 去混淆评级： 低(20)
    private static t q(P1 p10, int v) {
        return t.a("type.googleapis.com/google.crypto.tink.JwtHmacKey", ((R1)R1.P2().T1(p10).V1(v).B1()).toByteArray(), com.google.crypto.tink.t.b.c);
    }

    private static final String r(P1 p10) throws GeneralSecurityException {
        switch(p10) {
            case 1: {
                return "HS256";
            }
            case 2: {
                return "HS384";
            }
            case 3: {
                return "HS512";
            }
            default: {
                throw new GeneralSecurityException("unknown algorithm");
            }
        }
    }

    private static final String s(P1 p10) throws GeneralSecurityException {
        switch(c.a[p10.ordinal()]) {
            case 1: {
                return "HMACSHA256";
            }
            case 2: {
                return "HMACSHA384";
            }
            case 3: {
                return "HMACSHA512";
            }
            default: {
                throw new GeneralSecurityException("unknown algorithm");
            }
        }
    }

    private static final int t(P1 p10) throws GeneralSecurityException {
        switch(c.a[p10.ordinal()]) {
            case 1: {
                return 0x20;
            }
            case 2: {
                return 0x30;
            }
            case 3: {
                return 0x40;
            }
            default: {
                throw new GeneralSecurityException("unknown algorithm");
            }
        }
    }

    public static final t u() {
        return f.q(P1.c, 0x20);
    }

    public static final t v() {
        return f.q(P1.d, 0x30);
    }

    public static final t w() {
        return f.q(P1.e, 0x40);
    }

    public Q1 x(u u0) throws y0 {
        return Q1.Z2(u0, V.d());
    }

    public static void y(boolean z) throws GeneralSecurityException {
        O.D(new f(), z);
    }

    public void z(Q1 q10) throws GeneralSecurityException {
        b0.j(q10.getVersion(), 0);
        int v = f.t(q10.g());
        if(q10.c().size() < v) {
            throw new GeneralSecurityException("key too short");
        }
    }
}

