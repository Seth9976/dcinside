package com.google.crypto.tink.util;

import L1.a;
import O1.j;
import com.google.crypto.tink.P;
import com.google.crypto.tink.subtle.L;
import java.security.MessageDigest;

@a
@j
public final class d {
    private final com.google.crypto.tink.util.a a;

    private d(com.google.crypto.tink.util.a a0) {
        this.a = a0;
    }

    public static d a(byte[] arr_b, P p0) {
        if(p0 == null) {
            throw new NullPointerException("SecretKeyAccess required");
        }
        return new d(com.google.crypto.tink.util.a.a(arr_b));
    }

    public boolean b(d d0) {
        return MessageDigest.isEqual(this.a.d(), d0.a.d());
    }

    public static d c(int v) {
        return new d(com.google.crypto.tink.util.a.a(L.c(v)));
    }

    public int d() {
        return this.a.c();
    }

    public byte[] e(P p0) {
        if(p0 == null) {
            throw new NullPointerException("SecretKeyAccess required");
        }
        return this.a.d();
    }
}

