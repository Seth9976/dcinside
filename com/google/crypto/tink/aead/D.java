package com.google.crypto.tink.aead;

import com.google.crypto.tink.proto.A;
import com.google.crypto.tink.proto.C2;
import com.google.crypto.tink.proto.D;
import com.google.crypto.tink.proto.F2;
import com.google.crypto.tink.proto.H;
import com.google.crypto.tink.proto.K;
import com.google.crypto.tink.proto.W;
import com.google.crypto.tink.proto.Y0;
import com.google.crypto.tink.proto.i1;
import com.google.crypto.tink.proto.l1;
import com.google.crypto.tink.proto.n2;
import com.google.crypto.tink.proto.p;
import com.google.crypto.tink.proto.x2;

public final class d {
    public static final n2 a;
    public static final n2 b;
    public static final n2 c;
    public static final n2 d;
    public static final n2 e;
    public static final n2 f;
    public static final n2 g;
    public static final n2 h;

    static {
        d.a = d.c(16);
        d.b = d.c(0x20);
        d.c = d.b(16, 16);
        d.d = d.b(0x20, 16);
        d.e = d.a(16, 16, 0x20, 16, Y0.e);
        d.f = d.a(0x20, 16, 0x20, 0x20, Y0.e);
        d.g = (n2)n2.Q2().V1("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key").T1(F2.c).B1();
        d.h = (n2)n2.Q2().V1("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key").T1(F2.c).B1();
    }

    public static n2 a(int v, int v1, int v2, int v3, Y0 y00) {
        A a0 = (A)A.N2().V1(((D)D.I2().R1(v1).B1())).T1(v).B1();
        i1 i10 = (i1)i1.Q2().W1(((l1)l1.M2().S1(y00).U1(v3).B1())).U1(v2).B1();
        p p0 = (p)p.P2().V1(a0).X1(i10).B1();
        return (n2)n2.Q2().X1(p0.toByteString()).V1("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey").T1(F2.c).B1();
    }

    public static n2 b(int v, int v1) {
        H h0 = (H)H.N2().T1(v).V1(((K)K.I2().R1(v1).B1())).B1();
        return (n2)n2.Q2().X1(h0.toByteString()).V1("type.googleapis.com/google.crypto.tink.AesEaxKey").T1(F2.c).B1();
    }

    public static n2 c(int v) {
        W w0 = (W)W.L2().S1(v).B1();
        return (n2)n2.Q2().X1(w0.toByteString()).V1("type.googleapis.com/google.crypto.tink.AesGcmKey").T1(F2.c).B1();
    }

    public static n2 d(String s) {
        x2 x20 = (x2)x2.J2().R1(s).B1();
        return (n2)n2.Q2().X1(x20.toByteString()).V1("type.googleapis.com/google.crypto.tink.KmsAeadKey").T1(F2.c).B1();
    }

    public static n2 e(String s, n2 n20) {
        C2 c20 = (C2)C2.O2().U1(n20).V1(s).B1();
        return (n2)n2.Q2().X1(c20.toByteString()).V1("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey").T1(F2.e).B1();
    }
}

