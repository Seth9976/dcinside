package com.google.crypto.tink.streamingaead;

import M1.b;
import com.google.crypto.tink.proto.G2;
import java.security.GeneralSecurityException;

public final class l {
    public static final String a;
    public static final String b;
    @Deprecated
    public static final G2 c;
    public static final G2 d;

    static {
        try {
            l.a = "type.googleapis.com/google.crypto.tink.AesCtrHmacStreamingKey";
            l.b = "type.googleapis.com/google.crypto.tink.AesGcmHkdfStreamingKey";
            l.c = G2.T2();
            l.d = G2.T2();
            l.a();
        }
        catch(GeneralSecurityException generalSecurityException0) {
            throw new ExceptionInInitializerError(generalSecurityException0);
        }
    }

    @Deprecated
    public static void a() throws GeneralSecurityException {
        l.b();
    }

    public static void b() throws GeneralSecurityException {
        q.d();
        if(b.b()) {
            return;
        }
        a.u(true);
        com.google.crypto.tink.streamingaead.b.u(true);
    }
}

