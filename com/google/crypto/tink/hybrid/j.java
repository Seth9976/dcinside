package com.google.crypto.tink.hybrid;

import com.google.crypto.tink.aead.d;
import com.google.crypto.tink.proto.B0;
import com.google.crypto.tink.proto.E0;
import com.google.crypto.tink.proto.F2;
import com.google.crypto.tink.proto.G0;
import com.google.crypto.tink.proto.M0;
import com.google.crypto.tink.proto.V0;
import com.google.crypto.tink.proto.Y0;
import com.google.crypto.tink.proto.n2;
import com.google.crypto.tink.proto.q0;
import com.google.crypto.tink.shaded.protobuf.u;

public final class j {
    private static final byte[] a;
    public static final n2 b;
    public static final n2 c;
    public static final n2 d;

    static {
        byte[] arr_b = new byte[0];
        j.a = arr_b;
        j.b = j.a(V0.c, Y0.e, q0.c, d.a, F2.c, arr_b);
        j.c = j.a(V0.c, Y0.e, q0.d, d.a, F2.e, arr_b);
        j.d = j.a(V0.c, Y0.e, q0.c, d.e, F2.c, arr_b);
    }

    public static n2 a(V0 v00, Y0 y00, q0 q00, n2 n20, F2 f20, byte[] arr_b) {
        E0 e00 = (E0)E0.K2().T1(j.b(v00, y00, q00, n20, arr_b)).B1();
        return (n2)n2.Q2().V1("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey").T1(f20).X1(e00.toByteString()).B1();
    }

    public static G0 b(V0 v00, Y0 y00, q0 q00, n2 n20, byte[] arr_b) {
        M0 m00 = (M0)M0.Q2().T1(v00).V1(y00).X1(u.p(arr_b)).B1();
        B0 b00 = (B0)B0.K2().T1(n20).B1();
        return (G0)G0.T2().a2(m00).W1(b00).X1(q00).B1();
    }
}

