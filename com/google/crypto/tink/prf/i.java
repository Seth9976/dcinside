package com.google.crypto.tink.prf;

import com.google.crypto.tink.P;
import com.google.crypto.tink.a;
import com.google.crypto.tink.internal.d;
import com.google.crypto.tink.internal.e;
import com.google.crypto.tink.internal.n;
import com.google.crypto.tink.internal.o;
import com.google.crypto.tink.internal.p;
import com.google.crypto.tink.internal.u;
import com.google.crypto.tink.internal.v;
import com.google.crypto.tink.internal.z;
import com.google.crypto.tink.proto.F2;
import com.google.crypto.tink.proto.Y0;
import com.google.crypto.tink.proto.a1;
import com.google.crypto.tink.proto.b1;
import com.google.crypto.tink.proto.e1;
import com.google.crypto.tink.proto.k2.c;
import com.google.crypto.tink.proto.n2;
import com.google.crypto.tink.shaded.protobuf.V;
import com.google.crypto.tink.shaded.protobuf.y0;
import java.security.GeneralSecurityException;
import o3.h;

@a
final class i {
    static class com.google.crypto.tink.prf.i.a {
        static final int[] a;

        static {
            int[] arr_v = new int[Y0.values().length];
            com.google.crypto.tink.prf.i.a.a = arr_v;
            try {
                arr_v[Y0.c.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                com.google.crypto.tink.prf.i.a.a[Y0.g.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                com.google.crypto.tink.prf.i.a.a[Y0.e.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                com.google.crypto.tink.prf.i.a.a[Y0.d.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                com.google.crypto.tink.prf.i.a.a[Y0.f.ordinal()] = 5;
            }
            catch(NoSuchFieldError unused_ex) {
            }
        }
    }

    private static final String a = "type.googleapis.com/google.crypto.tink.HkdfPrfKey";
    private static final com.google.crypto.tink.util.a b;
    private static final p c;
    private static final o d;
    private static final e e;
    private static final d f;

    static {
        com.google.crypto.tink.util.a a0 = z.e("type.googleapis.com/google.crypto.tink.HkdfPrfKey");
        i.b = a0;
        i.c = p.a((com.google.crypto.tink.prf.d d0) -> v.b(((n2)n2.Q2().V1("type.googleapis.com/google.crypto.tink.HkdfPrfKey").X1(((b1)b1.Q2().W1(i.e(d0)).U1(d0.d()).B1()).toByteString()).T1(F2.e).B1())), com.google.crypto.tink.prf.d.class, v.class);
        i.d = o.a((v v0) -> // 去混淆评级： 中等(80)
        throw new IllegalArgumentException("Wrong type URL in call to HkdfPrfProtoSerialization.parseParameters: "), a0, v.class);
        i.e = e.a((b b0, P p0) -> u.b("type.googleapis.com/google.crypto.tink.HkdfPrfKey", ((a1)a1.Q2().W1(i.e(b0.h())).U1(com.google.crypto.tink.shaded.protobuf.u.p(b0.g().e(P.b(p0)))).B1()).toByteString(), c.c, F2.e, null), b.class, u.class);
        i.f = d.a((u u0, P p0) -> {
            if(u0.f().equals("type.googleapis.com/google.crypto.tink.HkdfPrfKey")) {
                try {
                    a1 a10 = a1.V2(u0.g(), V.d());
                    if(a10.getVersion() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    if(u0.c() != null) {
                        throw new GeneralSecurityException("ID requirement must be null.");
                    }
                    com.google.crypto.tink.prf.d d0 = com.google.crypto.tink.prf.d.b().c(a10.c().size()).b(i.l(a10.a().j())).d(com.google.crypto.tink.util.a.a(a10.a().y0().a0())).a();
                    return b.f().c(d0).b(com.google.crypto.tink.util.d.a(a10.c().a0(), P.b(p0))).a();
                }
                catch(y0 | IllegalArgumentException unused_ex) {
                    throw new GeneralSecurityException("Parsing HkdfPrfKey failed");
                }
            }
            throw new IllegalArgumentException("Wrong type URL in call to HkdfPrfProtoSerialization.parseKey");
        }, a0, u.class);
    }

    private static e1 e(com.google.crypto.tink.prf.d d0) throws GeneralSecurityException {
        com.google.crypto.tink.proto.e1.b e1$b0 = e1.M2().S1(i.m(d0.c()));
        if(d0.e() != null && d0.e().c() > 0) {
            e1$b0.U1(com.google.crypto.tink.shaded.protobuf.u.p(d0.e().d()));
        }
        return (e1)e1$b0.B1();
    }

    // 检测为 Lambda 实现
    private static b f(u u0, @h P p0) throws GeneralSecurityException [...]

    // 去混淆评级： 中等(80)
    // 检测为 Lambda 实现
    private static com.google.crypto.tink.prf.d g(v v0) throws GeneralSecurityException [...]

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
    private static u j(b b0, @h P p0) throws GeneralSecurityException [...]

    // 检测为 Lambda 实现
    private static v k(com.google.crypto.tink.prf.d d0) throws GeneralSecurityException [...]

    private static com.google.crypto.tink.prf.d.c l(Y0 y00) throws GeneralSecurityException {
        switch(y00) {
            case 1: {
                return com.google.crypto.tink.prf.d.c.b;
            }
            case 2: {
                return com.google.crypto.tink.prf.d.c.c;
            }
            case 3: {
                return com.google.crypto.tink.prf.d.c.d;
            }
            case 4: {
                return com.google.crypto.tink.prf.d.c.e;
            }
            case 5: {
                return com.google.crypto.tink.prf.d.c.f;
            }
            default: {
                throw new GeneralSecurityException("Unable to parse HashType: " + y00.getNumber());
            }
        }
    }

    private static Y0 m(com.google.crypto.tink.prf.d.c d$c0) throws GeneralSecurityException {
        if(com.google.crypto.tink.prf.d.c.b.equals(d$c0)) {
            return Y0.c;
        }
        if(com.google.crypto.tink.prf.d.c.c.equals(d$c0)) {
            return Y0.g;
        }
        if(com.google.crypto.tink.prf.d.c.d.equals(d$c0)) {
            return Y0.e;
        }
        if(com.google.crypto.tink.prf.d.c.e.equals(d$c0)) {
            return Y0.d;
        }
        if(!com.google.crypto.tink.prf.d.c.f.equals(d$c0)) {
            throw new GeneralSecurityException("Unable to serialize HashType " + d$c0);
        }
        return Y0.f;
    }
}

