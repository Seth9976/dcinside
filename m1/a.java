package M1;

import com.google.crypto.tink.daead.b;
import com.google.crypto.tink.hybrid.c;
import com.google.crypto.tink.prf.l;
import com.google.crypto.tink.proto.G2;
import com.google.crypto.tink.signature.y;
import java.security.GeneralSecurityException;

public final class a {
    @Deprecated
    public static final G2 a;
    @Deprecated
    public static final G2 b;
    @Deprecated
    public static final G2 c;

    static {
        try {
            a.a = G2.T2();
            a.b = G2.T2();
            a.c = G2.T2();
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
        b.b();
        c.b();
        l.a();
        y.b();
        com.google.crypto.tink.streamingaead.l.b();
    }
}

