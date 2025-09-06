package com.google.crypto.tink.signature;

import com.google.crypto.tink.proto.A0;
import com.google.crypto.tink.proto.F2;
import com.google.crypto.tink.proto.J2;
import com.google.crypto.tink.proto.L2;
import com.google.crypto.tink.proto.S2;
import com.google.crypto.tink.proto.U2;
import com.google.crypto.tink.proto.V0;
import com.google.crypto.tink.proto.Y0;
import com.google.crypto.tink.proto.n2;
import com.google.crypto.tink.proto.s0;
import com.google.crypto.tink.proto.u0;
import com.google.crypto.tink.shaded.protobuf.u;
import java.math.BigInteger;
import java.security.spec.RSAKeyGenParameterSpec;

public final class z {
    public static final n2 a;
    public static final n2 b;
    public static final n2 c;
    public static final n2 d;
    public static final n2 e;
    public static final n2 f;
    public static final n2 g;
    public static final n2 h;
    public static final n2 i;
    public static final n2 j;
    public static final n2 k;
    public static final n2 l;
    public static final n2 m;
    public static final n2 n;

    static {
        z.a = z.a(Y0.e, V0.c, A0.d, F2.c);
        z.b = z.a(Y0.f, V0.d, A0.d, F2.c);
        z.c = z.a(Y0.f, V0.e, A0.d, F2.c);
        z.d = z.a(Y0.e, V0.c, A0.c, F2.c);
        z.e = z.a(Y0.f, V0.d, A0.c, F2.c);
        z.f = z.a(Y0.e, V0.c, A0.c, F2.e);
        z.g = z.a(Y0.f, V0.e, A0.c, F2.c);
        z.h = (n2)n2.Q2().V1("type.googleapis.com/google.crypto.tink.Ed25519PrivateKey").T1(F2.c).B1();
        z.i = (n2)n2.Q2().V1("type.googleapis.com/google.crypto.tink.Ed25519PrivateKey").T1(F2.e).B1();
        BigInteger bigInteger0 = RSAKeyGenParameterSpec.F4;
        z.j = z.b(Y0.e, 0xC00, bigInteger0, F2.c);
        z.k = z.b(Y0.e, 0xC00, bigInteger0, F2.e);
        z.l = z.b(Y0.f, 0x1000, bigInteger0, F2.c);
        z.m = z.c(Y0.e, Y0.e, 0x20, 0xC00, bigInteger0);
        z.n = z.c(Y0.f, Y0.f, 0x40, 0x1000, bigInteger0);
    }

    public static n2 a(Y0 y00, V0 v00, A0 a00, F2 f20) {
        u0 u00 = (u0)u0.R2().X1(y00).T1(v00).V1(a00).B1();
        s0 s00 = (s0)s0.N2().U1(u00).B1();
        return (n2)n2.Q2().X1(s00.toByteString()).V1("type.googleapis.com/google.crypto.tink.EcdsaPrivateKey").T1(f20).B1();
    }

    public static n2 b(Y0 y00, int v, BigInteger bigInteger0, F2 f20) {
        L2 l20 = (L2)L2.J2().R1(y00).B1();
        J2 j20 = (J2)J2.Q2().W1(l20).U1(v).X1(u.p(bigInteger0.toByteArray())).B1();
        return (n2)n2.Q2().X1(j20.toByteString()).V1("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey").T1(f20).B1();
    }

    public static n2 c(Y0 y00, Y0 y01, int v, int v1, BigInteger bigInteger0) {
        U2 u20 = (U2)U2.Q2().W1(y00).T1(y01).V1(v).B1();
        S2 s20 = (S2)S2.Q2().W1(u20).U1(v1).X1(u.p(bigInteger0.toByteArray())).B1();
        return (n2)n2.Q2().X1(s20.toByteString()).V1("type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey").T1(F2.c).B1();
    }
}

