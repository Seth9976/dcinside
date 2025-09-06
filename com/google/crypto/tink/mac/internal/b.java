package com.google.crypto.tink.mac.internal;

import com.google.crypto.tink.a;
import com.google.crypto.tink.l;
import com.google.crypto.tink.mac.d.c;
import com.google.crypto.tink.mac.k;
import com.google.crypto.tink.subtle.h;
import com.google.crypto.tink.subtle.y;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

@a
final class b implements k {
    private final Cipher a;
    private final com.google.crypto.tink.mac.a b;
    private final byte[] c;
    private final byte[] d;
    private final ByteBuffer e;
    private final ByteBuffer f;
    private final ByteBuffer g;
    private boolean h;
    private static final byte[] i;

    static {
        b.i = new byte[]{0};
    }

    b(com.google.crypto.tink.mac.a a0) throws GeneralSecurityException {
        this.h = false;
        this.b = a0;
        Cipher cipher0 = (Cipher)y.b.a("AES/ECB/NoPadding");
        this.a = cipher0;
        cipher0.init(1, new SecretKeySpec(a0.h().e(l.a()), "AES"));
        byte[] arr_b = com.google.crypto.tink.mac.internal.a.b(cipher0.doFinal(new byte[16]));
        this.c = arr_b;
        this.d = com.google.crypto.tink.mac.internal.a.b(arr_b);
        this.e = ByteBuffer.allocate(16);
        this.f = ByteBuffer.allocate(16);
        this.g = ByteBuffer.allocate(16);
    }

    @Override  // com.google.crypto.tink.mac.k
    public void a(ByteBuffer byteBuffer0) throws GeneralSecurityException {
        if(this.h) {
            throw new IllegalStateException("Can not update after computing the MAC tag. Please create a new object.");
        }
        if(this.e.remaining() != 16) {
            int v = Math.min(this.e.remaining(), byteBuffer0.remaining());
            for(int v1 = 0; v1 < v; ++v1) {
                int v2 = byteBuffer0.get();
                this.e.put(((byte)v2));
            }
        }
        if(this.e.remaining() == 0 && byteBuffer0.remaining() > 0) {
            this.e.rewind();
            this.c(this.e);
            this.e.rewind();
        }
        while(byteBuffer0.remaining() > 16) {
            this.c(byteBuffer0);
        }
        this.e.put(byteBuffer0);
    }

    @Override  // com.google.crypto.tink.mac.k
    public byte[] b() throws GeneralSecurityException {
        if(this.h) {
            throw new IllegalStateException("Can not compute after computing the MAC tag. Please create a new object.");
        }
        if(this.b.i().f() == c.d) {
            this.a(ByteBuffer.wrap(b.i));
        }
        this.h = true;
        byte[] arr_b = this.e.remaining() <= 0 ? h.h(this.e.array(), 0, this.c, 0, 16) : h.i(com.google.crypto.tink.mac.internal.a.a(Arrays.copyOf(this.e.array(), this.e.position())), this.d);
        byte[] arr_b1 = this.b.d().d();
        byte[] arr_b2 = h.i(arr_b, this.f.array());
        return h.d(new byte[][]{arr_b1, Arrays.copyOf(this.a.doFinal(arr_b2), this.b.i().c())});
    }

    private void c(ByteBuffer byteBuffer0) throws GeneralSecurityException {
        this.g.rewind();
        this.f.rewind();
        h.g(this.g, this.f, byteBuffer0, 16);
        this.g.rewind();
        this.f.rewind();
        this.a.doFinal(this.g, this.f);
    }
}

