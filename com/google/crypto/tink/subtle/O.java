package com.google.crypto.tink.subtle;

import com.google.crypto.tink.j;
import java.security.GeneralSecurityException;
import java.security.interfaces.ECPrivateKey;
import java.util.Arrays;

public final class o implements j {
    private final ECPrivateKey a;
    private final q b;
    private final String c;
    private final byte[] d;
    private final d e;
    private final n f;
    private static final byte[] g;

    static {
        o.g = new byte[0];
    }

    public o(ECPrivateKey eCPrivateKey0, byte[] arr_b, String s, d w$d0, n n0) throws GeneralSecurityException {
        this.a = eCPrivateKey0;
        this.b = new q(eCPrivateKey0);
        this.d = arr_b;
        this.c = s;
        this.e = w$d0;
        this.f = n0;
    }

    @Override  // com.google.crypto.tink.j
    public byte[] b(byte[] arr_b, byte[] arr_b1) throws GeneralSecurityException {
        int v = w.g(this.a.getParams().getCurve(), this.e);
        if(arr_b.length < v) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        byte[] arr_b2 = Arrays.copyOfRange(arr_b, 0, v);
        int v1 = this.f.a();
        byte[] arr_b3 = this.b.a(arr_b2, this.c, this.d, arr_b1, v1, this.e);
        return this.f.b(arr_b3).a(Arrays.copyOfRange(arr_b, v, arr_b.length), o.g);
    }
}

