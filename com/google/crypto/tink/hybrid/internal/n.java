package com.google.crypto.tink.hybrid.internal;

import com.google.crypto.tink.O;
import com.google.crypto.tink.internal.r;
import com.google.crypto.tink.internal.t;
import com.google.crypto.tink.j;
import com.google.crypto.tink.proto.A1;
import com.google.crypto.tink.proto.C1;
import com.google.crypto.tink.proto.E1;
import com.google.crypto.tink.proto.v1;
import com.google.crypto.tink.proto.w1;
import com.google.crypto.tink.proto.x1;
import com.google.crypto.tink.proto.y1;
import com.google.crypto.tink.shaded.protobuf.R0;
import com.google.crypto.tink.shaded.protobuf.V;
import com.google.crypto.tink.shaded.protobuf.u;
import com.google.crypto.tink.shaded.protobuf.y0;
import com.google.crypto.tink.subtle.b0;
import com.google.crypto.tink.subtle.c0;
import com.google.crypto.tink.subtle.w.d;
import com.google.crypto.tink.subtle.w;
import j..util.DesugarCollections;
import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECPoint;
import java.util.HashMap;
import java.util.Map;

public final class n extends t {
    static class c {
        static final int[] a;

        static {
            int[] arr_v = new int[x1.values().length];
            c.a = arr_v;
            try {
                arr_v[x1.c.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                c.a[x1.d.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                c.a[x1.e.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                c.a[x1.f.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
        }
    }

    public n() {
        class a extends r {
            a(Class class0) {
            }

            @Override  // com.google.crypto.tink.internal.r
            public Object a(R0 r00) throws GeneralSecurityException {
                return this.c(((C1)r00));
            }

            public j c(C1 c10) throws GeneralSecurityException {
                return f.a(c10);
            }
        }

        r[] arr_r = {new a(j.class)};
        super(C1.class, E1.class, arr_r);
    }

    @Override  // com.google.crypto.tink.internal.h
    public String d() {
        return "type.googleapis.com/google.crypto.tink.HpkePrivateKey";
    }

    @Override  // com.google.crypto.tink.internal.h
    public int f() [...] // Inlined contents

    @Override  // com.google.crypto.tink.internal.h
    public com.google.crypto.tink.internal.h.a g() {
        class b extends com.google.crypto.tink.internal.h.a {
            final n b;

            b(Class class0) {
                super(class0);
            }

            @Override  // com.google.crypto.tink.internal.h$a
            public R0 a(R0 r00) throws GeneralSecurityException {
                return this.h(((y1)r00));
            }

            @Override  // com.google.crypto.tink.internal.h$a
            public Map d() {
                HashMap hashMap0 = new HashMap();
                hashMap0.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_AES_128_GCM", n.o(x1.c, w1.c, v1.c, com.google.crypto.tink.t.b.a));
                hashMap0.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_AES_128_GCM_RAW", n.o(x1.c, w1.c, v1.c, com.google.crypto.tink.t.b.c));
                hashMap0.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_AES_256_GCM", n.o(x1.c, w1.c, v1.d, com.google.crypto.tink.t.b.a));
                hashMap0.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_AES_256_GCM_RAW", n.o(x1.c, w1.c, v1.d, com.google.crypto.tink.t.b.c));
                hashMap0.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_CHACHA20_POLY1305", n.o(x1.c, w1.c, v1.e, com.google.crypto.tink.t.b.a));
                hashMap0.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_CHACHA20_POLY1305_RAW", n.o(x1.c, w1.c, v1.e, com.google.crypto.tink.t.b.c));
                hashMap0.put("DHKEM_P256_HKDF_SHA256_HKDF_SHA256_AES_128_GCM", n.o(x1.d, w1.c, v1.c, com.google.crypto.tink.t.b.a));
                hashMap0.put("DHKEM_P256_HKDF_SHA256_HKDF_SHA256_AES_128_GCM_RAW", n.o(x1.d, w1.c, v1.c, com.google.crypto.tink.t.b.c));
                hashMap0.put("DHKEM_P256_HKDF_SHA256_HKDF_SHA256_AES_256_GCM", n.o(x1.d, w1.c, v1.d, com.google.crypto.tink.t.b.a));
                hashMap0.put("DHKEM_P256_HKDF_SHA256_HKDF_SHA256_AES_256_GCM_RAW", n.o(x1.d, w1.c, v1.d, com.google.crypto.tink.t.b.c));
                hashMap0.put("DHKEM_P384_HKDF_SHA384_HKDF_SHA384_AES_128_GCM", n.o(x1.e, w1.d, v1.c, com.google.crypto.tink.t.b.a));
                hashMap0.put("DHKEM_P384_HKDF_SHA384_HKDF_SHA384_AES_128_GCM_RAW", n.o(x1.e, w1.d, v1.c, com.google.crypto.tink.t.b.c));
                hashMap0.put("DHKEM_P384_HKDF_SHA384_HKDF_SHA384_AES_256_GCM", n.o(x1.e, w1.d, v1.d, com.google.crypto.tink.t.b.a));
                hashMap0.put("DHKEM_P384_HKDF_SHA384_HKDF_SHA384_AES_256_GCM_RAW", n.o(x1.e, w1.d, v1.d, com.google.crypto.tink.t.b.c));
                hashMap0.put("DHKEM_P521_HKDF_SHA512_HKDF_SHA512_AES_128_GCM", n.o(x1.f, w1.e, v1.c, com.google.crypto.tink.t.b.a));
                hashMap0.put("DHKEM_P521_HKDF_SHA512_HKDF_SHA512_AES_128_GCM_RAW", n.o(x1.f, w1.e, v1.c, com.google.crypto.tink.t.b.c));
                hashMap0.put("DHKEM_P521_HKDF_SHA512_HKDF_SHA512_AES_256_GCM", n.o(x1.f, w1.e, v1.d, com.google.crypto.tink.t.b.a));
                hashMap0.put("DHKEM_P521_HKDF_SHA512_HKDF_SHA512_AES_256_GCM_RAW", n.o(x1.f, w1.e, v1.d, com.google.crypto.tink.t.b.c));
                return DesugarCollections.unmodifiableMap(hashMap0);
            }

            @Override  // com.google.crypto.tink.internal.h$a
            public R0 e(u u0) throws y0 {
                return this.i(u0);
            }

            @Override  // com.google.crypto.tink.internal.h$a
            public void g(R0 r00) throws GeneralSecurityException {
                this.j(((y1)r00));
            }

            public C1 h(y1 y10) throws GeneralSecurityException {
                byte[] arr_b1;
                byte[] arr_b;
                switch(y10.a().Y0()) {
                    case 1: {
                        arr_b = new byte[]{-17, 0x73, 62, 87, (byte)0x81, -71, (byte)0x8B, 98, 54, -98, (byte)0x80, 77, -80, (byte)0x89, 101, 56, 36, 42, 7, 46, -73, -56, 16, 14, -54, (byte)0x83, -94, 0x7E, 90, 62, 75, (byte)0x81};
                        arr_b1 = c0.c(arr_b);
                        break;
                    }
                    case 2: 
                    case 3: 
                    case 4: {
                        com.google.crypto.tink.subtle.w.b w$b0 = p.f(y10.a().Y0());
                        KeyPair keyPair0 = w.j(w$b0);
                        ECPoint eCPoint0 = ((ECPublicKey)keyPair0.getPublic()).getW();
                        arr_b1 = w.D(w$b0, d.a, eCPoint0);
                        arr_b = ((ECPrivateKey)keyPair0.getPrivate()).getS().toByteArray();
                        break;
                    }
                    default: {
                        throw new GeneralSecurityException("Invalid KEM");
                    }
                }
                E1 e10 = (E1)E1.Q2().X1(0).V1(y10.a()).W1(u.p(arr_b1)).B1();
                return (C1)C1.Q2().X1(0).W1(e10).U1(u.p(arr_b)).B1();
            }

            public y1 i(u u0) throws y0 {
                return y1.P2(u0, V.d());
            }

            public void j(y1 y10) throws GeneralSecurityException {
                p.g(y10.a());
            }
        }

        return new b(this, y1.class);
    }

    @Override  // com.google.crypto.tink.internal.h
    public com.google.crypto.tink.proto.k2.c h() {
        return com.google.crypto.tink.proto.k2.c.d;
    }

    @Override  // com.google.crypto.tink.internal.h
    public R0 i(u u0) throws y0 {
        return this.q(u0);
    }

    @Override  // com.google.crypto.tink.internal.h
    public void k(R0 r00) throws GeneralSecurityException {
        this.s(((C1)r00));
    }

    @Override  // com.google.crypto.tink.internal.t
    public R0 l(R0 r00) throws GeneralSecurityException {
        return this.p(((C1)r00));
    }

    private static com.google.crypto.tink.internal.h.a.a o(x1 x10, w1 w10, v1 v10, com.google.crypto.tink.t.b t$b0) {
        A1 a10 = (A1)A1.R2().X1(x10).V1(w10).T1(v10).B1();
        return new com.google.crypto.tink.internal.h.a.a(((y1)y1.K2().T1(a10).B1()), t$b0);
    }

    public E1 p(C1 c10) {
        return c10.e();
    }

    public C1 q(u u0) throws y0 {
        return C1.V2(u0, V.d());
    }

    public static void r(boolean z) throws GeneralSecurityException {
        O.A(new n(), new o(), z);
    }

    public void s(C1 c10) throws GeneralSecurityException {
        if(c10.e0().isEmpty()) {
            throw new GeneralSecurityException("Private key is empty.");
        }
        if(!c10.f()) {
            throw new GeneralSecurityException("Missing public key.");
        }
        b0.j(c10.getVersion(), 0);
        p.g(c10.e().a());
    }
}

