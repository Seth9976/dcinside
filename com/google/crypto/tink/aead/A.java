package com.google.crypto.tink.aead;

import M1.b;
import com.google.crypto.tink.mac.w;
import com.google.crypto.tink.proto.G2;
import java.security.GeneralSecurityException;

public final class a {
    public static final String a;
    public static final String b;
    public static final String c;
    public static final String d;
    public static final String e;
    public static final String f;
    public static final String g;
    public static final String h;
    @Deprecated
    public static final G2 i;
    @Deprecated
    public static final G2 j;
    @Deprecated
    public static final G2 k;

    static {
        try {
            a.a = "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey";
            a.b = "type.googleapis.com/google.crypto.tink.AesGcmKey";
            a.c = "type.googleapis.com/google.crypto.tink.AesGcmSivKey";
            a.d = "type.googleapis.com/google.crypto.tink.AesEaxKey";
            a.e = "type.googleapis.com/google.crypto.tink.KmsAeadKey";
            a.f = "type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey";
            a.g = "type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key";
            a.h = "type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key";
            G2 g20 = G2.T2();
            a.i = g20;
            a.j = g20;
            a.k = g20;
            a.a();
        }
        catch(GeneralSecurityException generalSecurityException0) {
            throw new ExceptionInInitializerError(generalSecurityException0);
        }
    }

    @Deprecated
    public static void a() throws GeneralSecurityException {
        a.b();
    }

    public static void b() throws GeneralSecurityException {
        f.e();
        w.b();
        g.s(true);
        r.t(true);
        if(b.b()) {
            return;
        }
        j.t(true);
        z.u(true);
        H.o(true);
        O.o(true);
        Q.o(true);
        T.n(true);
    }

    @Deprecated
    public static void c() throws GeneralSecurityException {
        a.b();
    }
}

