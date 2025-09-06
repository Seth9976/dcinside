package com.google.crypto.tink.prf;

import com.google.crypto.tink.proto.F2;
import com.google.crypto.tink.proto.Y0;
import com.google.crypto.tink.proto.b1;
import com.google.crypto.tink.proto.e1;
import com.google.crypto.tink.proto.j;
import com.google.crypto.tink.proto.n2;
import com.google.crypto.tink.proto.p1;
import com.google.crypto.tink.proto.s1;

public final class n {
    public static final n2 a;
    public static final n2 b;
    public static final n2 c;
    public static final n2 d;

    static {
        n.a = n.b();
        n.b = n.c(0x20, Y0.e);
        n.c = n.c(0x40, Y0.f);
        n.d = n.a();
    }

    private static n2 a() {
        j j0 = (j)j.L2().S1(0x20).B1();
        return (n2)n2.Q2().V1("type.googleapis.com/google.crypto.tink.AesCmacPrfKey").X1(j0.toByteString()).T1(F2.e).B1();
    }

    private static n2 b() {
        b1 b10 = (b1)b1.Q2().U1(0x20).V1(e1.M2().S1(Y0.e)).B1();
        return (n2)n2.Q2().X1(b10.toByteString()).V1("type.googleapis.com/google.crypto.tink.HkdfPrfKey").T1(F2.e).B1();
    }

    private static n2 c(int v, Y0 y00) {
        s1 s10 = (s1)s1.J2().R1(y00).B1();
        p1 p10 = (p1)p1.Q2().W1(s10).U1(v).B1();
        return (n2)n2.Q2().V1("type.googleapis.com/google.crypto.tink.HmacPrfKey").X1(p10.toByteString()).T1(F2.e).B1();
    }
}

