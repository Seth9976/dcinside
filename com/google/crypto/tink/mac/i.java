package com.google.crypto.tink.mac;

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
import com.google.crypto.tink.proto.b;
import com.google.crypto.tink.proto.c;
import com.google.crypto.tink.proto.f;
import com.google.crypto.tink.proto.n2;
import com.google.crypto.tink.shaded.protobuf.V;
import com.google.crypto.tink.shaded.protobuf.u;
import com.google.crypto.tink.shaded.protobuf.y0;
import java.security.GeneralSecurityException;
import o3.h;

@a
final class i {
    static class com.google.crypto.tink.mac.i.a {
        static final int[] a;

        static {
            int[] arr_v = new int[F2.values().length];
            com.google.crypto.tink.mac.i.a.a = arr_v;
            try {
                arr_v[F2.c.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                com.google.crypto.tink.mac.i.a.a[F2.f.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                com.google.crypto.tink.mac.i.a.a[F2.d.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                com.google.crypto.tink.mac.i.a.a[F2.e.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
        }
    }

    private static final String a = "type.googleapis.com/google.crypto.tink.AesCmacKey";
    private static final com.google.crypto.tink.util.a b;
    private static final p c;
    private static final o d;
    private static final e e;
    private static final d f;

    static {
        com.google.crypto.tink.util.a a0 = z.e("type.googleapis.com/google.crypto.tink.AesCmacKey");
        i.b = a0;
        i.c = p.a((com.google.crypto.tink.mac.d d0) -> v.b(((n2)n2.Q2().V1("type.googleapis.com/google.crypto.tink.AesCmacKey").X1(((c)c.N2().V1(i.e(d0)).T1(d0.d()).B1()).toByteString()).T1(i.l(d0.f())).B1())), com.google.crypto.tink.mac.d.class, v.class);
        i.d = o.a((v v0) -> // 去混淆评级： 中等(80)
        throw new IllegalArgumentException("Wrong type URL in call to AesCmacParameters.parseParameters: "), a0, v.class);
        i.e = e.a((com.google.crypto.tink.mac.a a0, P p0) -> {
            u u0 = ((b)b.Q2().W1(i.e(a0.i())).U1(u.p(a0.h().e(P.b(p0)))).B1()).toByteString();
            F2 f20 = i.l(a0.i().f());
            return com.google.crypto.tink.internal.u.b("type.googleapis.com/google.crypto.tink.AesCmacKey", u0, com.google.crypto.tink.proto.k2.c.c, f20, a0.b());
        }, com.google.crypto.tink.mac.a.class, com.google.crypto.tink.internal.u.class);
        i.f = d.a((com.google.crypto.tink.internal.u u0, P p0) -> {
            if(u0.f().equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
                try {
                    b b0 = b.V2(u0.g(), V.d());
                    if(b0.getVersion() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    com.google.crypto.tink.mac.d d0 = com.google.crypto.tink.mac.d.b().b(b0.c().size()).c(b0.a().E()).d(i.m(u0.e())).a();
                    return com.google.crypto.tink.mac.a.g().e(d0).c(com.google.crypto.tink.util.d.a(b0.c().a0(), P.b(p0))).d(u0.c()).a();
                }
                catch(y0 | IllegalArgumentException unused_ex) {
                    throw new GeneralSecurityException("Parsing AesCmacKey failed");
                }
            }
            throw new IllegalArgumentException("Wrong type URL in call to AesCmacParameters.parseParameters");
        }, a0, com.google.crypto.tink.internal.u.class);
    }

    private static f e(com.google.crypto.tink.mac.d d0) {
        return (f)f.I2().R1(d0.c()).B1();
    }

    // 检测为 Lambda 实现
    private static com.google.crypto.tink.mac.a f(com.google.crypto.tink.internal.u u0, @h P p0) throws GeneralSecurityException [...]

    // 去混淆评级： 中等(80)
    // 检测为 Lambda 实现
    private static com.google.crypto.tink.mac.d g(v v0) throws GeneralSecurityException [...]

    public static void h() throws GeneralSecurityException {
        i.i(n.a());
    }

    public static void i(n n0) throws GeneralSecurityException {
        n0.m(i.c);
        n0.l(i.d);
        n0.k(i.e);
        n0.j(i.f);
    }

    // 检测为 Lambda 实现
    private static com.google.crypto.tink.internal.u j(com.google.crypto.tink.mac.a a0, @h P p0) throws GeneralSecurityException [...]

    // 检测为 Lambda 实现
    private static v k(com.google.crypto.tink.mac.d d0) throws GeneralSecurityException [...]

    private static F2 l(com.google.crypto.tink.mac.d.c d$c0) throws GeneralSecurityException {
        if(com.google.crypto.tink.mac.d.c.b.equals(d$c0)) {
            return F2.c;
        }
        if(com.google.crypto.tink.mac.d.c.c.equals(d$c0)) {
            return F2.f;
        }
        if(com.google.crypto.tink.mac.d.c.e.equals(d$c0)) {
            return F2.e;
        }
        if(!com.google.crypto.tink.mac.d.c.d.equals(d$c0)) {
            throw new GeneralSecurityException("Unable to serialize variant: " + d$c0);
        }
        return F2.d;
    }

    private static com.google.crypto.tink.mac.d.c m(F2 f20) throws GeneralSecurityException {
        switch(f20) {
            case 1: {
                return com.google.crypto.tink.mac.d.c.b;
            }
            case 2: {
                return com.google.crypto.tink.mac.d.c.c;
            }
            case 3: {
                return com.google.crypto.tink.mac.d.c.d;
            }
            case 4: {
                return com.google.crypto.tink.mac.d.c.e;
            }
            default: {
                throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + f20.getNumber());
            }
        }
    }
}

