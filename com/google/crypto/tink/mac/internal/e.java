package com.google.crypto.tink.mac.internal;

import com.google.crypto.tink.a;
import com.google.crypto.tink.l;
import com.google.crypto.tink.mac.k;
import com.google.crypto.tink.mac.n;
import com.google.crypto.tink.mac.q.d;
import com.google.crypto.tink.subtle.h;
import com.google.crypto.tink.subtle.y;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

@a
final class e implements k {
    private final Mac a;
    private final n b;
    private boolean c;
    private static final byte[] d;

    static {
        e.d = new byte[]{0};
    }

    e(n n0) throws GeneralSecurityException {
        this.c = false;
        String s = e.c(n0);
        Mac mac0 = (Mac)y.c.a(s);
        this.a = mac0;
        mac0.init(new SecretKeySpec(n0.h().e(l.a()), "HMAC"));
        this.b = n0;
    }

    @Override  // com.google.crypto.tink.mac.k
    public void a(ByteBuffer byteBuffer0) {
        if(this.c) {
            throw new IllegalStateException("Cannot update after computing the MAC tag. Please create a new object.");
        }
        this.a.update(byteBuffer0);
    }

    @Override  // com.google.crypto.tink.mac.k
    public byte[] b() throws GeneralSecurityException {
        if(this.c) {
            throw new IllegalStateException("Cannot compute after already computing the MAC tag. Please create a new object.");
        }
        if(this.b.i().g() == d.d) {
            this.a(ByteBuffer.wrap(e.d));
        }
        this.c = true;
        return h.d(new byte[][]{this.b.d().d(), Arrays.copyOf(this.a.doFinal(), this.b.i().c())});
    }

    private static String c(n n0) {
        return "HMAC" + n0.i().d();
    }
}

