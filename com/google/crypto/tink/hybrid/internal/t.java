package com.google.crypto.tink.hybrid.internal;

import O1.j;
import com.google.crypto.tink.subtle.c0;
import com.google.crypto.tink.util.a;
import java.security.GeneralSecurityException;

@j
final class t implements l {
    private final a a;
    private final a b;

    private t(byte[] arr_b, byte[] arr_b1) {
        this.a = a.a(arr_b);
        this.b = a.a(arr_b1);
    }

    @Override  // com.google.crypto.tink.hybrid.internal.l
    public a a() {
        return this.b;
    }

    @Override  // com.google.crypto.tink.hybrid.internal.l
    public a b() {
        return this.a;
    }

    static t c(byte[] arr_b) throws GeneralSecurityException {
        return new t(arr_b, c0.c(arr_b));
    }
}

