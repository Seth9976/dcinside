package com.google.crypto.tink.mac;

import com.google.crypto.tink.P;
import com.google.crypto.tink.a;
import com.google.crypto.tink.internal.d;
import com.google.crypto.tink.internal.e;
import com.google.crypto.tink.internal.o;
import com.google.crypto.tink.internal.p;
import com.google.crypto.tink.internal.z;
import com.google.crypto.tink.proto.F2;
import com.google.crypto.tink.proto.Y0;
import com.google.crypto.tink.proto.h1;
import com.google.crypto.tink.proto.i1;
import com.google.crypto.tink.proto.k2.c;
import com.google.crypto.tink.proto.l1;
import com.google.crypto.tink.proto.n2;
import com.google.crypto.tink.shaded.protobuf.V;
import com.google.crypto.tink.shaded.protobuf.u;
import com.google.crypto.tink.shaded.protobuf.y0;
import java.security.GeneralSecurityException;
import o3.h;

@a
final class v {
    static class com.google.crypto.tink.mac.v.a {
        static final int[] a;
        static final int[] b;

        static {
            int[] arr_v = new int[F2.values().length];
            com.google.crypto.tink.mac.v.a.b = arr_v;
            try {
                arr_v[F2.c.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                com.google.crypto.tink.mac.v.a.b[F2.f.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                com.google.crypto.tink.mac.v.a.b[F2.d.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                com.google.crypto.tink.mac.v.a.b[F2.e.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            int[] arr_v1 = new int[Y0.values().length];
            com.google.crypto.tink.mac.v.a.a = arr_v1;
            try {
                arr_v1[Y0.c.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                com.google.crypto.tink.mac.v.a.a[Y0.g.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                com.google.crypto.tink.mac.v.a.a[Y0.e.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                com.google.crypto.tink.mac.v.a.a[Y0.d.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                com.google.crypto.tink.mac.v.a.a[Y0.f.ordinal()] = 5;
            }
            catch(NoSuchFieldError unused_ex) {
            }
        }
    }

    private static final String a = "type.googleapis.com/google.crypto.tink.HmacKey";
    private static final com.google.crypto.tink.util.a b;
    private static final p c;
    private static final o d;
    private static final e e;
    private static final d f;

    static {
        com.google.crypto.tink.util.a a0 = z.e("type.googleapis.com/google.crypto.tink.HmacKey");
        v.b = a0;
        v.c = p.a((q q0) -> com.google.crypto.tink.internal.v.b(((n2)n2.Q2().V1("type.googleapis.com/google.crypto.tink.HmacKey").X1(((i1)i1.Q2().W1(v.e(q0)).U1(q0.e()).B1()).toByteString()).T1(v.n(q0.g())).B1())), q.class, com.google.crypto.tink.internal.v.class);
        v.d = o.a((com.google.crypto.tink.internal.v v0) -> // 去混淆评级： 中等(80)
        throw new IllegalArgumentException("Wrong type URL in call to HmacProtoSerialization.parseParameters: "), a0, com.google.crypto.tink.internal.v.class);
        v.e = e.a((n n0, P p0) -> {
            u u0 = ((h1)h1.Q2().W1(v.e(n0.i())).U1(u.p(n0.h().e(P.b(p0)))).B1()).toByteString();
            F2 f20 = v.n(n0.i().g());
            return com.google.crypto.tink.internal.u.b("type.googleapis.com/google.crypto.tink.HmacKey", u0, c.c, f20, n0.b());
        }, n.class, com.google.crypto.tink.internal.u.class);
        v.f = d.a((com.google.crypto.tink.internal.u u0, P p0) -> {
            if(u0.f().equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
                try {
                    h1 h10 = h1.V2(u0.g(), V.d());
                    if(h10.getVersion() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    q q0 = q.b().c(h10.c().size()).d(h10.a().E()).b(v.l(h10.a().j())).e(v.o(u0.e())).a();
                    return n.g().e(q0).d(com.google.crypto.tink.util.d.a(h10.c().a0(), P.b(p0))).c(u0.c()).a();
                }
                catch(y0 | IllegalArgumentException unused_ex) {
                    throw new GeneralSecurityException("Parsing HmacKey failed");
                }
            }
            throw new IllegalArgumentException("Wrong type URL in call to HmacProtoSerialization.parseKey");
        }, a0, com.google.crypto.tink.internal.u.class);
    }

    private static l1 e(q q0) throws GeneralSecurityException {
        return (l1)l1.M2().U1(q0.c()).S1(v.m(q0.d())).B1();
    }

    // 检测为 Lambda 实现
    private static n f(com.google.crypto.tink.internal.u u0, @h P p0) throws GeneralSecurityException [...]

    // 去混淆评级： 中等(80)
    // 检测为 Lambda 实现
    private static q g(com.google.crypto.tink.internal.v v0) throws GeneralSecurityException [...]

    public static void h() throws GeneralSecurityException {
        v.i(com.google.crypto.tink.internal.n.a());
    }

    public static void i(com.google.crypto.tink.internal.n n0) throws GeneralSecurityException {
        n0.m(v.c);
        n0.l(v.d);
        n0.k(v.e);
        n0.j(v.f);
    }

    // 检测为 Lambda 实现
    private static com.google.crypto.tink.internal.u j(n n0, @h P p0) throws GeneralSecurityException [...]

    // 检测为 Lambda 实现
    private static com.google.crypto.tink.internal.v k(q q0) throws GeneralSecurityException [...]

    private static com.google.crypto.tink.mac.q.c l(Y0 y00) throws GeneralSecurityException {
        switch(y00) {
            case 1: {
                return com.google.crypto.tink.mac.q.c.b;
            }
            case 2: {
                return com.google.crypto.tink.mac.q.c.c;
            }
            case 3: {
                return com.google.crypto.tink.mac.q.c.d;
            }
            case 4: {
                return com.google.crypto.tink.mac.q.c.e;
            }
            case 5: {
                return com.google.crypto.tink.mac.q.c.f;
            }
            default: {
                throw new GeneralSecurityException("Unable to parse HashType: " + y00.getNumber());
            }
        }
    }

    private static Y0 m(com.google.crypto.tink.mac.q.c q$c0) throws GeneralSecurityException {
        if(com.google.crypto.tink.mac.q.c.b.equals(q$c0)) {
            return Y0.c;
        }
        if(com.google.crypto.tink.mac.q.c.c.equals(q$c0)) {
            return Y0.g;
        }
        if(com.google.crypto.tink.mac.q.c.d.equals(q$c0)) {
            return Y0.e;
        }
        if(com.google.crypto.tink.mac.q.c.e.equals(q$c0)) {
            return Y0.d;
        }
        if(!com.google.crypto.tink.mac.q.c.f.equals(q$c0)) {
            throw new GeneralSecurityException("Unable to serialize HashType " + q$c0);
        }
        return Y0.f;
    }

    private static F2 n(com.google.crypto.tink.mac.q.d q$d0) throws GeneralSecurityException {
        if(com.google.crypto.tink.mac.q.d.b.equals(q$d0)) {
            return F2.c;
        }
        if(com.google.crypto.tink.mac.q.d.c.equals(q$d0)) {
            return F2.f;
        }
        if(com.google.crypto.tink.mac.q.d.e.equals(q$d0)) {
            return F2.e;
        }
        if(!com.google.crypto.tink.mac.q.d.d.equals(q$d0)) {
            throw new GeneralSecurityException("Unable to serialize variant: " + q$d0);
        }
        return F2.d;
    }

    private static com.google.crypto.tink.mac.q.d o(F2 f20) throws GeneralSecurityException {
        switch(f20) {
            case 1: {
                return com.google.crypto.tink.mac.q.d.b;
            }
            case 2: {
                return com.google.crypto.tink.mac.q.d.c;
            }
            case 3: {
                return com.google.crypto.tink.mac.q.d.d;
            }
            case 4: {
                return com.google.crypto.tink.mac.q.d.e;
            }
            default: {
                throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + f20.getNumber());
            }
        }
    }
}

