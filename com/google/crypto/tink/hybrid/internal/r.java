package com.google.crypto.tink.hybrid.internal;

import O1.j;
import com.google.crypto.tink.subtle.w.b;
import com.google.crypto.tink.subtle.w.d;
import com.google.crypto.tink.subtle.w;
import com.google.crypto.tink.util.a;
import java.security.GeneralSecurityException;

@j
final class r implements l {
    private final a a;
    private final a b;

    private r(byte[] arr_b, byte[] arr_b1) {
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

    static r c(byte[] arr_b, byte[] arr_b1, b w$b0) throws GeneralSecurityException {
        w.G(w.o(w$b0, d.a, arr_b1), w.m(w$b0, arr_b));
        return new r(arr_b, arr_b1);
    }
}

