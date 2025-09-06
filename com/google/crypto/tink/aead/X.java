package com.google.crypto.tink.aead;

import com.google.crypto.tink.P;
import com.google.crypto.tink.a;
import com.google.crypto.tink.internal.d;
import com.google.crypto.tink.internal.e;
import com.google.crypto.tink.internal.n;
import com.google.crypto.tink.internal.o;
import com.google.crypto.tink.internal.p;
import com.google.crypto.tink.internal.v;
import com.google.crypto.tink.internal.z;
import com.google.crypto.tink.proto.F2;
import com.google.crypto.tink.proto.V;
import com.google.crypto.tink.proto.W;
import com.google.crypto.tink.proto.k2.c;
import com.google.crypto.tink.proto.n2;
import com.google.crypto.tink.shaded.protobuf.u;
import com.google.crypto.tink.shaded.protobuf.y0;
import java.security.GeneralSecurityException;
import o3.h;

@a
final class x {
    static class com.google.crypto.tink.aead.x.a {
        static final int[] a;

        static {
            int[] arr_v = new int[F2.values().length];
            com.google.crypto.tink.aead.x.a.a = arr_v;
            try {
                arr_v[F2.c.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                com.google.crypto.tink.aead.x.a.a[F2.f.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                com.google.crypto.tink.aead.x.a.a[F2.d.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                com.google.crypto.tink.aead.x.a.a[F2.e.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
        }
    }

    private static final String a = "type.googleapis.com/google.crypto.tink.AesGcmKey";
    private static final com.google.crypto.tink.util.a b;
    private static final p c;
    private static final o d;
    private static final e e;
    private static final d f;

    static {
        com.google.crypto.tink.util.a a0 = z.e("type.googleapis.com/google.crypto.tink.AesGcmKey");
        x.b = a0;
        x.c = p.a((s s0) -> {
            x.m(s0);
            return v.b(((n2)n2.Q2().V1("type.googleapis.com/google.crypto.tink.AesGcmKey").X1(((W)W.L2().S1(s0.d()).B1()).toByteString()).T1(x.k(s0.f())).B1()));
        }, s.class, v.class);
        x.d = o.a((v v0) -> // 去混淆评级： 中等(80)
        throw new IllegalArgumentException("Wrong type URL in call to AesGcmParameters.parseParameters: "), a0, v.class);
        x.e = e.a((q q0, P p0) -> {
            x.m(q0.i());
            u u0 = ((V)V.L2().S1(u.p(q0.h().e(P.b(p0)))).B1()).toByteString();
            F2 f20 = x.k(q0.i().f());
            return com.google.crypto.tink.internal.u.b("type.googleapis.com/google.crypto.tink.AesGcmKey", u0, c.c, f20, q0.b());
        }, q.class, com.google.crypto.tink.internal.u.class);
        x.f = d.a((com.google.crypto.tink.internal.u u0, P p0) -> {
            if(u0.f().equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
                try {
                    V v0 = V.Q2(u0.g(), com.google.crypto.tink.shaded.protobuf.V.d());
                    if(v0.getVersion() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    s s0 = s.b().c(v0.c().size()).b(12).d(16).e(x.l(u0.e())).a();
                    return q.g().e(s0).d(com.google.crypto.tink.util.d.a(v0.c().a0(), P.b(p0))).c(u0.c()).a();
                }
                catch(y0 unused_ex) {
                    throw new GeneralSecurityException("Parsing AesGcmKey failed");
                }
            }
            throw new IllegalArgumentException("Wrong type URL in call to AesGcmParameters.parseParameters");
        }, a0, com.google.crypto.tink.internal.u.class);
    }

    // 检测为 Lambda 实现
    private static q e(com.google.crypto.tink.internal.u u0, @h P p0) throws GeneralSecurityException [...]

    // 去混淆评级： 中等(80)
    // 检测为 Lambda 实现
    private static s f(v v0) throws GeneralSecurityException [...]

    public static void g() throws GeneralSecurityException {
        x.h(n.a());
    }

    public static void h(n n0) throws GeneralSecurityException {
        n0.m(x.c);
        n0.l(x.d);
        n0.k(x.e);
        n0.j(x.f);
    }

    // 检测为 Lambda 实现
    private static com.google.crypto.tink.internal.u i(q q0, @h P p0) throws GeneralSecurityException [...]

    // 检测为 Lambda 实现
    private static v j(s s0) throws GeneralSecurityException [...]

    private static F2 k(com.google.crypto.tink.aead.s.c s$c0) throws GeneralSecurityException {
        if(com.google.crypto.tink.aead.s.c.b.equals(s$c0)) {
            return F2.c;
        }
        if(com.google.crypto.tink.aead.s.c.c.equals(s$c0)) {
            return F2.f;
        }
        if(!com.google.crypto.tink.aead.s.c.d.equals(s$c0)) {
            throw new GeneralSecurityException("Unable to serialize variant: " + s$c0);
        }
        return F2.e;
    }

    private static com.google.crypto.tink.aead.s.c l(F2 f20) throws GeneralSecurityException {
        switch(f20) {
            case 1: {
                return com.google.crypto.tink.aead.s.c.b;
            }
            case 2: 
            case 3: {
                return com.google.crypto.tink.aead.s.c.c;
            }
            case 4: {
                return com.google.crypto.tink.aead.s.c.d;
            }
            default: {
                throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + f20.getNumber());
            }
        }
    }

    private static void m(s s0) throws GeneralSecurityException {
        if(s0.e() != 16) {
            throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d. Currently Tink only supports serialization of AES GCM keys with tag size equal to 16 bytes.", s0.e()));
        }
        if(s0.c() != 12) {
            throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d. Currently Tink only supports serialization of AES GCM keys with IV size equal to 12 bytes.", s0.c()));
        }
    }
}

