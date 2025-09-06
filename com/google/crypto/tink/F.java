package com.google.crypto.tink;

import L1.a;
import com.google.crypto.tink.proto.r2;
import com.google.crypto.tink.shaded.protobuf.V;
import com.google.crypto.tink.shaded.protobuf.y0;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.Map;

public final class f {
    public static w a(r2 r20) throws GeneralSecurityException {
        return w.k(r20);
    }

    public static r2 b(w w0) {
        return w0.u();
    }

    @Deprecated
    public static final w c(byte[] arr_b) throws GeneralSecurityException {
        try {
            return w.k(r2.j3(arr_b, V.d()));
        }
        catch(y0 unused_ex) {
            throw new GeneralSecurityException("invalid keyset");
        }
    }

    public static w d(y y0) throws GeneralSecurityException, IOException {
        return w.k(y0.read());
    }

    @a
    public static w e(y y0, Map map0) throws GeneralSecurityException, IOException {
        return w.l(y0.read(), com.google.crypto.tink.monitoring.a.a().b(map0).c());
    }

    public static void f(w w0, z z0) throws IOException {
        z0.a(w0.u());
    }
}

