package com.google.crypto.tink.mac;

import M1.b;
import com.google.crypto.tink.proto.G2;
import java.security.GeneralSecurityException;

public final class w {
    public static final String a;
    @Deprecated
    public static final G2 b;
    @Deprecated
    public static final G2 c;
    @Deprecated
    public static final G2 d;

    static {
        try {
            w.a = "type.googleapis.com/google.crypto.tink.HmacKey";
            G2 g20 = G2.T2();
            w.b = g20;
            w.c = g20;
            w.d = g20;
            w.a();
        }
        catch(GeneralSecurityException generalSecurityException0) {
            throw new ExceptionInInitializerError(generalSecurityException0);
        }
    }

    @Deprecated
    public static void a() throws GeneralSecurityException {
        w.b();
    }

    public static void b() throws GeneralSecurityException {
        B.f();
        m.d();
        p.u(true);
        if(b.b()) {
            return;
        }
        c.q(true);
    }

    @Deprecated
    public static void c() throws GeneralSecurityException {
        w.b();
    }
}

