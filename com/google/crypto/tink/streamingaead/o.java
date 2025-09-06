package com.google.crypto.tink.streamingaead;

import com.google.crypto.tink.proto.F2;
import com.google.crypto.tink.proto.P;
import com.google.crypto.tink.proto.T;
import com.google.crypto.tink.proto.Y0;
import com.google.crypto.tink.proto.l1;
import com.google.crypto.tink.proto.n2;
import com.google.crypto.tink.proto.u;
import com.google.crypto.tink.proto.x;

public final class o {
    public static final n2 a;
    public static final n2 b;
    public static final n2 c;
    public static final n2 d;
    public static final n2 e;
    public static final n2 f;
    public static final n2 g;
    public static final n2 h;

    static {
        o.a = o.a(16, Y0.e, 16, Y0.e, 0x20, 0x1000);
        o.b = o.a(16, Y0.e, 16, Y0.e, 0x20, 0x100000);
        o.c = o.a(0x20, Y0.e, 0x20, Y0.e, 0x20, 0x1000);
        o.d = o.a(0x20, Y0.e, 0x20, Y0.e, 0x20, 0x100000);
        o.e = o.b(16, Y0.e, 16, 0x1000);
        o.f = o.b(16, Y0.e, 16, 0x100000);
        o.g = o.b(0x20, Y0.e, 0x20, 0x1000);
        o.h = o.b(0x20, Y0.e, 0x20, 0x100000);
    }

    public static n2 a(int v, Y0 y00, int v1, Y0 y01, int v2, int v3) {
        l1 l10 = (l1)l1.M2().S1(y01).U1(v2).B1();
        x x0 = (x)x.U2().V1(v3).W1(v1).X1(y00).a2(l10).B1();
        u u0 = (u)u.Q2().W1(x0).U1(v).B1();
        return (n2)n2.Q2().X1(u0.toByteString()).V1("type.googleapis.com/google.crypto.tink.AesCtrHmacStreamingKey").T1(F2.e).B1();
    }

    public static n2 b(int v, Y0 y00, int v1, int v2) {
        T t0 = (T)T.P2().T1(v2).U1(v1).V1(y00).B1();
        P p0 = (P)P.Q2().U1(v).W1(t0).B1();
        return (n2)n2.Q2().X1(p0.toByteString()).V1("type.googleapis.com/google.crypto.tink.AesGcmHkdfStreamingKey").T1(F2.e).B1();
    }
}

