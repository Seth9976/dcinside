package com.google.crypto.tink.hybrid.subtle;

import com.google.crypto.tink.b;
import com.google.crypto.tink.i;
import java.security.GeneralSecurityException;

public class a {
    private final b a;
    private final i b;

    public a(b b0) {
        this.a = b0;
        this.b = null;
    }

    public a(i i0) {
        this.a = null;
        this.b = i0;
    }

    public byte[] a(byte[] arr_b, byte[] arr_b1) throws GeneralSecurityException {
        return this.a == null ? this.b.a(arr_b, arr_b1) : this.a.b(arr_b, arr_b1);
    }

    public byte[] b(byte[] arr_b, byte[] arr_b1) throws GeneralSecurityException {
        return this.a == null ? this.b.b(arr_b, arr_b1) : this.a.a(arr_b, arr_b1);
    }
}

