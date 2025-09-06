package com.google.crypto.tink.hybrid.subtle;

import com.google.crypto.tink.aead.subtle.a;
import com.google.crypto.tink.j;
import com.google.crypto.tink.subtle.D;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.interfaces.RSAPrivateKey;
import javax.crypto.Cipher;

public final class c implements j {
    private final RSAPrivateKey a;
    private final String b;
    private final byte[] c;
    private final a d;

    public c(RSAPrivateKey rSAPrivateKey0, String s, byte[] arr_b, a a0) throws GeneralSecurityException {
        b.e(rSAPrivateKey0.getModulus());
        this.a = rSAPrivateKey0;
        this.c = arr_b;
        this.b = s;
        this.d = a0;
    }

    @Override  // com.google.crypto.tink.j
    public byte[] b(byte[] arr_b, byte[] arr_b1) throws GeneralSecurityException {
        int v = b.a(this.a.getModulus());
        if(arr_b.length < v) {
            throw new GeneralSecurityException(String.format("Ciphertext must be of at least size %d bytes, but got %d", v, ((int)arr_b.length)));
        }
        ByteBuffer byteBuffer0 = ByteBuffer.wrap(arr_b);
        byte[] arr_b2 = new byte[v];
        byteBuffer0.get(arr_b2);
        Cipher cipher0 = Cipher.getInstance("RSA/ECB/NoPadding");
        cipher0.init(2, this.a);
        byte[] arr_b3 = cipher0.doFinal(arr_b2);
        int v1 = this.d.b();
        byte[] arr_b4 = D.b(this.b, arr_b3, this.c, arr_b1, v1);
        com.google.crypto.tink.b b0 = this.d.a(arr_b4);
        byte[] arr_b5 = new byte[byteBuffer0.remaining()];
        byteBuffer0.get(arr_b5);
        return b0.b(arr_b5, b.a);
    }
}

