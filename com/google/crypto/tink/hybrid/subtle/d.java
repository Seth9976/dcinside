package com.google.crypto.tink.hybrid.subtle;

import com.google.crypto.tink.aead.subtle.a;
import com.google.crypto.tink.k;
import com.google.crypto.tink.subtle.D;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.interfaces.RSAPublicKey;
import javax.crypto.Cipher;

public final class d implements k {
    private final RSAPublicKey a;
    private final String b;
    private final byte[] c;
    private final a d;

    public d(RSAPublicKey rSAPublicKey0, String s, byte[] arr_b, a a0) throws GeneralSecurityException {
        b.e(rSAPublicKey0.getModulus());
        this.a = rSAPublicKey0;
        this.b = s;
        this.c = arr_b;
        this.d = a0;
    }

    @Override  // com.google.crypto.tink.k
    public byte[] a(byte[] arr_b, byte[] arr_b1) throws GeneralSecurityException {
        byte[] arr_b2 = b.d(this.a.getModulus());
        Cipher cipher0 = Cipher.getInstance("RSA/ECB/NoPadding");
        cipher0.init(1, this.a);
        byte[] arr_b3 = cipher0.doFinal(arr_b2);
        int v = this.d.b();
        byte[] arr_b4 = D.b(this.b, arr_b2, this.c, arr_b1, v);
        byte[] arr_b5 = this.d.a(arr_b4).a(arr_b, b.a);
        return ByteBuffer.allocate(arr_b3.length + arr_b5.length).put(arr_b3).put(arr_b5).array();
    }
}

