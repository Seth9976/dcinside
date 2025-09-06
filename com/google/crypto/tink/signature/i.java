package com.google.crypto.tink.signature;

import com.google.crypto.tink.P;
import com.google.crypto.tink.a;
import com.google.crypto.tink.internal.d;
import com.google.crypto.tink.internal.e;
import com.google.crypto.tink.internal.n;
import com.google.crypto.tink.internal.o;
import com.google.crypto.tink.internal.p;
import com.google.crypto.tink.internal.v;
import com.google.crypto.tink.internal.z;
import com.google.crypto.tink.proto.A0;
import com.google.crypto.tink.proto.F2;
import com.google.crypto.tink.proto.V0;
import com.google.crypto.tink.proto.Y0;
import com.google.crypto.tink.proto.k2.c;
import com.google.crypto.tink.proto.n2;
import com.google.crypto.tink.proto.s0;
import com.google.crypto.tink.proto.u0;
import com.google.crypto.tink.proto.w0;
import com.google.crypto.tink.proto.y0;
import com.google.crypto.tink.shaded.protobuf.V;
import com.google.crypto.tink.shaded.protobuf.u;
import java.security.GeneralSecurityException;
import java.security.spec.ECPoint;
import o3.h;

@a
final class i {
    static class com.google.crypto.tink.signature.i.a {
        static final int[] a;
        static final int[] b;
        static final int[] c;
        static final int[] d;

        static {
            int[] arr_v = new int[A0.values().length];
            com.google.crypto.tink.signature.i.a.d = arr_v;
            try {
                arr_v[A0.c.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                com.google.crypto.tink.signature.i.a.d[A0.d.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            int[] arr_v1 = new int[V0.values().length];
            com.google.crypto.tink.signature.i.a.c = arr_v1;
            try {
                arr_v1[V0.c.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                com.google.crypto.tink.signature.i.a.c[V0.d.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                com.google.crypto.tink.signature.i.a.c[V0.e.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            int[] arr_v2 = new int[F2.values().length];
            com.google.crypto.tink.signature.i.a.b = arr_v2;
            try {
                arr_v2[F2.c.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                com.google.crypto.tink.signature.i.a.b[F2.f.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                com.google.crypto.tink.signature.i.a.b[F2.d.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                com.google.crypto.tink.signature.i.a.b[F2.e.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            int[] arr_v3 = new int[Y0.values().length];
            com.google.crypto.tink.signature.i.a.a = arr_v3;
            try {
                arr_v3[Y0.e.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                com.google.crypto.tink.signature.i.a.a[Y0.d.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                com.google.crypto.tink.signature.i.a.a[Y0.f.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
        }
    }

    private static final String a = "type.googleapis.com/google.crypto.tink.EcdsaPrivateKey";
    private static final com.google.crypto.tink.util.a b = null;
    private static final String c = "type.googleapis.com/google.crypto.tink.EcdsaPublicKey";
    private static final com.google.crypto.tink.util.a d;
    private static final p e;
    private static final o f;
    private static final e g;
    private static final d h;
    private static final e i;
    private static final d j;

    static {
        com.google.crypto.tink.util.a a0 = z.e("type.googleapis.com/google.crypto.tink.EcdsaPrivateKey");
        i.b = a0;
        com.google.crypto.tink.util.a a1 = z.e("type.googleapis.com/google.crypto.tink.EcdsaPublicKey");
        i.d = a1;
        i.e = p.a((com.google.crypto.tink.signature.a a0) -> v.b(((n2)n2.Q2().V1("type.googleapis.com/google.crypto.tink.EcdsaPrivateKey").X1(((s0)s0.N2().U1(i.h(a0)).B1()).toByteString()).T1(i.v(a0.f())).B1())), com.google.crypto.tink.signature.a.class, v.class);
        i.f = o.a((v v0) -> // 去混淆评级： 中等(80)
        throw new IllegalArgumentException("Wrong type URL in call to EcdsaProtoSerialization.parseParameters: "), a0, v.class);
        i.g = e.a((j j0, P p0) -> {
            u u0 = i.i(j0).toByteString();
            F2 f20 = i.v(j0.h().f());
            return com.google.crypto.tink.internal.u.b("type.googleapis.com/google.crypto.tink.EcdsaPublicKey", u0, c.e, f20, j0.b());
        }, j.class, com.google.crypto.tink.internal.u.class);
        i.h = d.a((com.google.crypto.tink.internal.u u0, P p0) -> {
            if(u0.f().equals("type.googleapis.com/google.crypto.tink.EcdsaPublicKey")) {
                try {
                    y0 y00 = y0.Y2(u0.g(), V.d());
                    if(y00.getVersion() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    com.google.crypto.tink.signature.a a0 = com.google.crypto.tink.signature.a.b().c(i.s(y00.a().F())).d(i.x(y00.a().a0())).b(i.r(y00.a().T0())).e(i.y(u0.e())).a();
                    return j.g().d(a0).e(new ECPoint(com.google.crypto.tink.internal.a.a(y00.t().a0()), com.google.crypto.tink.internal.a.a(y00.u().a0()))).c(u0.c()).a();
                }
                catch(com.google.crypto.tink.shaded.protobuf.y0 | IllegalArgumentException unused_ex) {
                    throw new GeneralSecurityException("Parsing EcdsaPublicKey failed");
                }
            }
            throw new IllegalArgumentException("Wrong type URL in call to EcdsaProtoSerialization.parsePublicKey: " + u0.f());
        }, a1, com.google.crypto.tink.internal.u.class);
        i.i = e.a((b b0, P p0) -> {
            int v = i.g(b0.i().c());
            u u0 = ((w0)w0.Q2().W1(i.i(b0.k())).U1(u.p(com.google.crypto.tink.internal.a.c(b0.j().c(P.b(p0)), v))).B1()).toByteString();
            F2 f20 = i.v(b0.i().f());
            Integer integer0 = b0.b();
            return com.google.crypto.tink.internal.u.b("type.googleapis.com/google.crypto.tink.EcdsaPrivateKey", u0, c.d, f20, integer0);
        }, b.class, com.google.crypto.tink.internal.u.class);
        i.j = d.a((com.google.crypto.tink.internal.u u0, P p0) -> {
            if(u0.f().equals("type.googleapis.com/google.crypto.tink.EcdsaPrivateKey")) {
                try {
                    w0 w00 = w0.V2(u0.g(), V.d());
                    if(w00.getVersion() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    y0 y00 = w00.e();
                    com.google.crypto.tink.signature.a a0 = com.google.crypto.tink.signature.a.b().c(i.s(y00.a().F())).d(i.x(y00.a().a0())).b(i.r(y00.a().T0())).e(i.y(u0.e())).a();
                    j j0 = j.g().d(a0).e(new ECPoint(com.google.crypto.tink.internal.a.a(y00.t().a0()), com.google.crypto.tink.internal.a.a(y00.u().a0()))).c(u0.c()).a();
                    return b.h().c(j0).b(com.google.crypto.tink.util.c.b(com.google.crypto.tink.internal.a.a(w00.c().a0()), P.b(p0))).a();
                }
                catch(com.google.crypto.tink.shaded.protobuf.y0 | IllegalArgumentException unused_ex) {
                    throw new GeneralSecurityException("Parsing EcdsaPrivateKey failed");
                }
            }
            throw new IllegalArgumentException("Wrong type URL in call to EcdsaProtoSerialization.parsePrivateKey: " + u0.f());
        }, a0, com.google.crypto.tink.internal.u.class);
    }

    private static int g(com.google.crypto.tink.signature.a.c a$c0) throws GeneralSecurityException {
        if(com.google.crypto.tink.signature.a.c.c.equals(a$c0)) {
            return 33;
        }
        if(com.google.crypto.tink.signature.a.c.d.equals(a$c0)) {
            return 49;
        }
        if(!com.google.crypto.tink.signature.a.c.e.equals(a$c0)) {
            throw new GeneralSecurityException("Unable to serialize CurveType " + a$c0);
        }
        return 67;
    }

    private static u0 h(com.google.crypto.tink.signature.a a0) throws GeneralSecurityException {
        return (u0)u0.R2().X1(i.u(a0.d())).T1(i.t(a0.c())).V1(i.w(a0.e())).B1();
    }

    private static y0 i(j j0) throws GeneralSecurityException {
        int v = i.g(j0.h().c());
        ECPoint eCPoint0 = j0.i();
        return (y0)y0.T2().W1(i.h(j0.h())).Y1(u.p(com.google.crypto.tink.internal.a.c(eCPoint0.getAffineX(), v))).Z1(u.p(com.google.crypto.tink.internal.a.c(eCPoint0.getAffineY(), v))).B1();
    }

    // 去混淆评级： 中等(80)
    // 检测为 Lambda 实现
    private static com.google.crypto.tink.signature.a j(v v0) throws GeneralSecurityException [...]

    // 检测为 Lambda 实现
    private static b k(com.google.crypto.tink.internal.u u0, @h P p0) throws GeneralSecurityException [...]

    // 检测为 Lambda 实现
    private static j l(com.google.crypto.tink.internal.u u0, @h P p0) throws GeneralSecurityException [...]

    public static void m() throws GeneralSecurityException {
        i.n(n.a());
    }

    public static void n(n n0) throws GeneralSecurityException {
        n0.m(i.e);
        n0.l(i.f);
        n0.k(i.g);
        n0.j(i.h);
        n0.k(i.i);
        n0.j(i.j);
    }

    // 检测为 Lambda 实现
    private static v o(com.google.crypto.tink.signature.a a0) throws GeneralSecurityException [...]

    // 检测为 Lambda 实现
    private static com.google.crypto.tink.internal.u p(b b0, @h P p0) throws GeneralSecurityException [...]

    // 检测为 Lambda 实现
    private static com.google.crypto.tink.internal.u q(j j0, @h P p0) throws GeneralSecurityException [...]

    private static com.google.crypto.tink.signature.a.c r(V0 v00) throws GeneralSecurityException {
        switch(v00) {
            case 1: {
                return com.google.crypto.tink.signature.a.c.c;
            }
            case 2: {
                return com.google.crypto.tink.signature.a.c.d;
            }
            case 3: {
                return com.google.crypto.tink.signature.a.c.e;
            }
            default: {
                throw new GeneralSecurityException("Unable to parse EllipticCurveType: " + v00.getNumber());
            }
        }
    }

    private static com.google.crypto.tink.signature.a.d s(Y0 y00) throws GeneralSecurityException {
        switch(y00) {
            case 1: {
                return com.google.crypto.tink.signature.a.d.b;
            }
            case 2: {
                return com.google.crypto.tink.signature.a.d.c;
            }
            case 3: {
                return com.google.crypto.tink.signature.a.d.d;
            }
            default: {
                throw new GeneralSecurityException("Unable to parse HashType: " + y00.getNumber());
            }
        }
    }

    private static V0 t(com.google.crypto.tink.signature.a.c a$c0) throws GeneralSecurityException {
        if(com.google.crypto.tink.signature.a.c.c.equals(a$c0)) {
            return V0.c;
        }
        if(com.google.crypto.tink.signature.a.c.d.equals(a$c0)) {
            return V0.d;
        }
        if(!com.google.crypto.tink.signature.a.c.e.equals(a$c0)) {
            throw new GeneralSecurityException("Unable to serialize CurveType " + a$c0);
        }
        return V0.e;
    }

    private static Y0 u(com.google.crypto.tink.signature.a.d a$d0) throws GeneralSecurityException {
        if(com.google.crypto.tink.signature.a.d.b.equals(a$d0)) {
            return Y0.e;
        }
        if(com.google.crypto.tink.signature.a.d.c.equals(a$d0)) {
            return Y0.d;
        }
        if(!com.google.crypto.tink.signature.a.d.d.equals(a$d0)) {
            throw new GeneralSecurityException("Unable to serialize HashType " + a$d0);
        }
        return Y0.f;
    }

    private static F2 v(f a$f0) throws GeneralSecurityException {
        if(f.b.equals(a$f0)) {
            return F2.c;
        }
        if(f.c.equals(a$f0)) {
            return F2.f;
        }
        if(f.e.equals(a$f0)) {
            return F2.e;
        }
        if(!f.d.equals(a$f0)) {
            throw new GeneralSecurityException("Unable to serialize variant: " + a$f0);
        }
        return F2.d;
    }

    private static A0 w(com.google.crypto.tink.signature.a.e a$e0) throws GeneralSecurityException {
        if(com.google.crypto.tink.signature.a.e.b.equals(a$e0)) {
            return A0.c;
        }
        if(!com.google.crypto.tink.signature.a.e.c.equals(a$e0)) {
            throw new GeneralSecurityException("Unable to serialize SignatureEncoding " + a$e0);
        }
        return A0.d;
    }

    private static com.google.crypto.tink.signature.a.e x(A0 a00) throws GeneralSecurityException {
        switch(a00) {
            case 1: {
                return com.google.crypto.tink.signature.a.e.b;
            }
            case 2: {
                return com.google.crypto.tink.signature.a.e.c;
            }
            default: {
                throw new GeneralSecurityException("Unable to parse EcdsaSignatureEncoding: " + a00.getNumber());
            }
        }
    }

    private static f y(F2 f20) throws GeneralSecurityException {
        switch(f20) {
            case 1: {
                return f.b;
            }
            case 2: {
                return f.c;
            }
            case 3: {
                return f.d;
            }
            case 4: {
                return f.e;
            }
            default: {
                throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + f20.getNumber());
            }
        }
    }
}

