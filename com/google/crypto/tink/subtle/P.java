package com.google.crypto.tink.subtle;

import com.google.crypto.tink.k;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.interfaces.ECPublicKey;

public final class p implements k {
    private final r a;
    private final String b;
    private final byte[] c;
    private final d d;
    private final n e;
    private static final byte[] f;

    static {
        p.f = new byte[0];
    }

    public p(ECPublicKey eCPublicKey0, byte[] arr_b, String s, d w$d0, n n0) throws GeneralSecurityException {
        w.a(eCPublicKey0);
        this.a = new r(eCPublicKey0);
        this.c = arr_b;
        this.b = s;
        this.d = w$d0;
        this.e = n0;
    }

    @Override  // com.google.crypto.tink.k
    public byte[] a(byte[] arr_b, byte[] arr_b1) throws GeneralSecurityException {
        int v = this.e.a();
        a r$a0 = this.a.a(this.b, this.c, arr_b1, v, this.d);
        byte[] arr_b2 = r$a0.b();
        byte[] arr_b3 = this.e.b(arr_b2).b(arr_b, p.f);
        byte[] arr_b4 = r$a0.a();
        return ByteBuffer.allocate(arr_b4.length + arr_b3.length).put(arr_b4).put(arr_b3).array();
    }
}

