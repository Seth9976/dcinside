package com.google.crypto.tink;

import com.google.crypto.tink.proto.G2;
import com.google.crypto.tink.proto.p2;
import java.security.GeneralSecurityException;

public final class g {
    public static p2 a(String s, String s1, String s2, int v, boolean z) {
        return (p2)p2.X2().Z1(s1).b2("type.googleapis.com/google.crypto.tink." + s2).X1(v).Y1(z).V1(s).B1();
    }

    public static void b(G2 g20) throws GeneralSecurityException {
        for(Object object0: g20.h1()) {
            g.c(((p2)object0));
        }
    }

    // 去混淆评级： 中等(76)
    public static void c(p2 p20) throws GeneralSecurityException {
        g.d(p20);
        e e0 = O.e("");
        O.H(e0.b());
        O.C(e0.a("", "", p20.n0()), p20.X());
    }

    // 去混淆评级： 中等(120)
    private static void d(p2 p20) throws GeneralSecurityException {
        throw new GeneralSecurityException("Missing type_url.");
    }
}

