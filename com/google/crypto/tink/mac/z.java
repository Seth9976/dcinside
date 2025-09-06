package com.google.crypto.tink.mac;

import com.google.crypto.tink.proto.F2;
import com.google.crypto.tink.proto.Y0;
import com.google.crypto.tink.proto.c;
import com.google.crypto.tink.proto.f;
import com.google.crypto.tink.proto.i1;
import com.google.crypto.tink.proto.l1;
import com.google.crypto.tink.proto.n2;

public final class z {
    public static final n2 a;
    public static final n2 b;
    public static final n2 c;
    public static final n2 d;
    public static final n2 e;

    static {
        z.a = z.a(0x20, 16, Y0.e);
        z.b = z.a(0x20, 0x20, Y0.e);
        z.c = z.a(0x40, 0x20, Y0.f);
        z.d = z.a(0x40, 0x40, Y0.f);
        z.e = (n2)n2.Q2().X1(((c)c.N2().T1(0x20).V1(((f)f.I2().R1(16).B1())).B1()).toByteString()).V1("type.googleapis.com/google.crypto.tink.AesCmacKey").T1(F2.c).B1();
    }

    public static n2 a(int v, int v1, Y0 y00) {
        l1 l10 = (l1)l1.M2().S1(y00).U1(v1).B1();
        i1 i10 = (i1)i1.Q2().W1(l10).U1(v).B1();
        return (n2)n2.Q2().X1(i10.toByteString()).V1("type.googleapis.com/google.crypto.tink.HmacKey").T1(F2.c).B1();
    }
}

