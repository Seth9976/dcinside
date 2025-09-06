package com.google.crypto.tink.daead;

import O1.l;
import com.google.crypto.tink.proto.G2;
import java.security.GeneralSecurityException;

public final class b {
    public static final String a;
    @Deprecated
    public static final G2 b;
    @Deprecated
    public static final G2 c;

    static {
        try {
            b.a = "type.googleapis.com/google.crypto.tink.AesSivKey";
            b.b = G2.T2();
            b.c = G2.T2();
            b.b();
        }
        catch(GeneralSecurityException generalSecurityException0) {
            throw new ExceptionInInitializerError(generalSecurityException0);
        }
    }

    @l(imports = {"com.google.crypto.tink.daead.DeterministicAeadConfig"}, replacement = "DeterministicAeadConfig.register()")
    @Deprecated
    public static void a() throws GeneralSecurityException {
        b.b();
    }

    public static void b() throws GeneralSecurityException {
        e.e();
        if(M1.b.b()) {
            return;
        }
        a.p(true);
    }
}

