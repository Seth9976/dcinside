package com.google.crypto.tink.daead;

import com.google.crypto.tink.proto.F2;
import com.google.crypto.tink.proto.g0;
import com.google.crypto.tink.proto.n2;

public final class d {
    public static final n2 a;

    static {
        d.a = d.a(0x40);
    }

    public static n2 a(int v) {
        g0 g00 = (g0)g0.L2().S1(v).B1();
        return (n2)n2.Q2().X1(g00.toByteString()).V1("type.googleapis.com/google.crypto.tink.AesSivKey").T1(F2.c).B1();
    }
}

