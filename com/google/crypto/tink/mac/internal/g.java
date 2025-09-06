package com.google.crypto.tink.mac.internal;

import com.google.crypto.tink.mac.l;
import com.google.crypto.tink.mac.n;
import com.google.crypto.tink.util.a;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

final class g implements l {
    private final a a;
    private final e b;

    g(n n0, byte[] arr_b) throws GeneralSecurityException {
        this.b = new e(n0);
        this.a = a.a(arr_b);
    }

    @Override  // com.google.crypto.tink.mac.l
    public void a(ByteBuffer byteBuffer0) {
        this.b.a(byteBuffer0);
    }

    @Override  // com.google.crypto.tink.mac.l
    public void b() throws GeneralSecurityException {
        a a0 = a.a(this.b.b());
        if(!this.a.equals(a0)) {
            throw new GeneralSecurityException("invalid MAC");
        }
    }
}

