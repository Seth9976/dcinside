package com.google.crypto.tink.streamingaead;

import com.google.crypto.tink.G;
import com.google.crypto.tink.H;
import com.google.crypto.tink.O;
import com.google.crypto.tink.Q;
import java.security.GeneralSecurityException;

public class q implements H {
    private static final q a;

    static {
        q.a = new q();
    }

    @Override  // com.google.crypto.tink.H
    public Class a() {
        return Q.class;
    }

    @Override  // com.google.crypto.tink.H
    public Class b() {
        return Q.class;
    }

    @Override  // com.google.crypto.tink.H
    public Object c(G g0) throws GeneralSecurityException {
        return this.e(g0);
    }

    public static void d() throws GeneralSecurityException {
        O.H(q.a);
    }

    public Q e(G g0) throws GeneralSecurityException {
        return new n(g0);
    }
}

