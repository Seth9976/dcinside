package com.google.crypto.tink.hybrid;

import M1.b;
import com.google.crypto.tink.aead.a;
import com.google.crypto.tink.hybrid.internal.n;
import com.google.crypto.tink.proto.G2;
import java.security.GeneralSecurityException;

public final class c {
    public static final String a;
    public static final String b;
    @Deprecated
    public static final G2 c;
    @Deprecated
    public static final G2 d;
    @Deprecated
    public static final G2 e;

    static {
        try {
            c.a = "type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey";
            c.b = "type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey";
            c.c = G2.T2();
            c.d = G2.T2();
            c.e = G2.T2();
            c.a();
        }
        catch(GeneralSecurityException generalSecurityException0) {
            throw new ExceptionInInitializerError(generalSecurityException0);
        }
    }

    @Deprecated
    public static void a() throws GeneralSecurityException {
        c.b();
    }

    public static void b() throws GeneralSecurityException {
        f.e();
        i.d();
        a.b();
        if(b.b()) {
            return;
        }
        com.google.crypto.tink.hybrid.a.y(true);
        n.r(true);
    }
}

