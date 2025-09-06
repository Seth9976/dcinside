package com.google.crypto.tink.mac.internal;

import com.google.crypto.tink.mac.l;
import com.google.crypto.tink.util.a;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

final class d implements l {
    private final a a;
    private final b b;

    d(com.google.crypto.tink.mac.a a0, byte[] arr_b) throws GeneralSecurityException {
        this.b = new b(a0);
        this.a = a.a(arr_b);
    }

    @Override  // com.google.crypto.tink.mac.l
    public void a(ByteBuffer byteBuffer0) throws GeneralSecurityException {
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

