package com.google.crypto.tink.aead;

import com.google.crypto.tink.P;
import com.google.crypto.tink.a;
import com.google.crypto.tink.internal.d;
import com.google.crypto.tink.internal.e;
import com.google.crypto.tink.internal.n;
import com.google.crypto.tink.internal.o;
import com.google.crypto.tink.internal.v;
import com.google.crypto.tink.internal.z;
import com.google.crypto.tink.proto.F2;
import com.google.crypto.tink.proto.G;
import com.google.crypto.tink.proto.H;
import com.google.crypto.tink.proto.K;
import com.google.crypto.tink.proto.k2.c;
import com.google.crypto.tink.proto.n2;
import com.google.crypto.tink.shaded.protobuf.V;
import com.google.crypto.tink.shaded.protobuf.u;
import com.google.crypto.tink.shaded.protobuf.y0;
import java.security.GeneralSecurityException;
import o3.h;

@a
final class p {
    static class com.google.crypto.tink.aead.p.a {
        static final int[] a;

        static {
            int[] arr_v = new int[F2.values().length];
            com.google.crypto.tink.aead.p.a.a = arr_v;
            try {
                arr_v[F2.c.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                com.google.crypto.tink.aead.p.a.a[F2.f.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                com.google.crypto.tink.aead.p.a.a[F2.d.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                com.google.crypto.tink.aead.p.a.a[F2.e.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
        }
    }

    private static final String a = "type.googleapis.com/google.crypto.tink.AesEaxKey";
    private static final com.google.crypto.tink.util.a b;
    private static final com.google.crypto.tink.internal.p c;
    private static final o d;
    private static final e e;
    private static final d f;

    static {
        com.google.crypto.tink.util.a a0 = z.e("type.googleapis.com/google.crypto.tink.AesEaxKey");
        p.b = a0;
        p.c = com.google.crypto.tink.internal.p.a((k k0) -> v.b(((n2)n2.Q2().V1("type.googleapis.com/google.crypto.tink.AesEaxKey").X1(((H)H.N2().V1(p.e(k0)).T1(k0.d()).B1()).toByteString()).T1(p.l(k0.f())).B1())), k.class, v.class);
        p.d = o.a((v v0) -> // 去混淆评级： 中等(80)
        throw new IllegalArgumentException("Wrong type URL in call to AesEaxParameters.parseParameters: "), a0, v.class);
        p.e = e.a((i i0, P p0) -> {
            u u0 = ((G)G.Q2().W1(p.e(i0.i())).U1(u.p(i0.h().e(P.b(p0)))).B1()).toByteString();
            F2 f20 = p.l(i0.i().f());
            return com.google.crypto.tink.internal.u.b("type.googleapis.com/google.crypto.tink.AesEaxKey", u0, c.c, f20, i0.b());
        }, i.class, com.google.crypto.tink.internal.u.class);
        p.f = d.a((com.google.crypto.tink.internal.u u0, P p0) -> {
            if(u0.f().equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
                try {
                    G g0 = G.V2(u0.g(), V.d());
                    if(g0.getVersion() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    k k0 = k.b().c(g0.c().size()).b(g0.a().J()).d(16).e(p.m(u0.e())).a();
                    return i.g().e(k0).d(com.google.crypto.tink.util.d.a(g0.c().a0(), P.b(p0))).c(u0.c()).a();
                }
                catch(y0 unused_ex) {
                    throw new GeneralSecurityException("Parsing AesEaxcKey failed");
                }
            }
            throw new IllegalArgumentException("Wrong type URL in call to AesEaxParameters.parseParameters");
        }, a0, com.google.crypto.tink.internal.u.class);
    }

    private static K e(k k0) throws GeneralSecurityException {
        if(k0.e() != 16) {
            throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d. Currently Tink only supports aes eax keys with tag size equal to 16 bytes.", k0.e()));
        }
        return (K)K.I2().R1(k0.c()).B1();
    }

    // 检测为 Lambda 实现
    private static i f(com.google.crypto.tink.internal.u u0, @h P p0) throws GeneralSecurityException [...]

    // 去混淆评级： 中等(80)
    // 检测为 Lambda 实现
    private static k g(v v0) throws GeneralSecurityException [...]

    public static void h() throws GeneralSecurityException {
        p.i(n.a());
    }

    public static void i(n n0) throws GeneralSecurityException {
        n0.m(p.c);
        n0.l(p.d);
        n0.k(p.e);
        n0.j(p.f);
    }

    // 检测为 Lambda 实现
    private static com.google.crypto.tink.internal.u j(i i0, @h P p0) throws GeneralSecurityException [...]

    // 检测为 Lambda 实现
    private static v k(k k0) throws GeneralSecurityException [...]

    private static F2 l(com.google.crypto.tink.aead.k.c k$c0) throws GeneralSecurityException {
        if(com.google.crypto.tink.aead.k.c.b.equals(k$c0)) {
            return F2.c;
        }
        if(com.google.crypto.tink.aead.k.c.c.equals(k$c0)) {
            return F2.f;
        }
        if(!com.google.crypto.tink.aead.k.c.d.equals(k$c0)) {
            throw new GeneralSecurityException("Unable to serialize variant: " + k$c0);
        }
        return F2.e;
    }

    private static com.google.crypto.tink.aead.k.c m(F2 f20) throws GeneralSecurityException {
        switch(f20) {
            case 1: {
                return com.google.crypto.tink.aead.k.c.b;
            }
            case 2: 
            case 3: {
                return com.google.crypto.tink.aead.k.c.c;
            }
            case 4: {
                return com.google.crypto.tink.aead.k.c.d;
            }
            default: {
                throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + f20.getNumber());
            }
        }
    }
}

