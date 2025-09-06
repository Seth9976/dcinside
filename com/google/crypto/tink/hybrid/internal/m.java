package com.google.crypto.tink.hybrid.internal;

import com.google.crypto.tink.proto.A1;
import com.google.crypto.tink.proto.v1;
import com.google.crypto.tink.proto.w1;
import com.google.crypto.tink.proto.x1;
import java.security.GeneralSecurityException;
import java.util.Arrays;

final class m {
    static d a(A1 a10) throws GeneralSecurityException {
        if(a10.R() == v1.c) {
            return new a(16);
        }
        if(a10.R() == v1.d) {
            return new a(0x20);
        }
        if(a10.R() != v1.e) {
            throw new IllegalArgumentException("Unrecognized HPKE AEAD identifier");
        }
        return new b();
    }

    static d b(byte[] arr_b) throws GeneralSecurityException {
        if(Arrays.equals(arr_b, p.i)) {
            return new a(16);
        }
        if(Arrays.equals(arr_b, p.j)) {
            return new a(0x20);
        }
        if(!Arrays.equals(arr_b, p.k)) {
            throw new IllegalArgumentException("Unrecognized HPKE AEAD identifier");
        }
        return new b();
    }

    static h c(A1 a10) {
        if(a10.c1() == w1.c) {
            return new c("HmacSha256");
        }
        if(a10.c1() == w1.d) {
            return new c("HmacSha384");
        }
        if(a10.c1() != w1.e) {
            throw new IllegalArgumentException("Unrecognized HPKE KDF identifier");
        }
        return new c("HmacSha512");
    }

    static h d(byte[] arr_b) {
        if(Arrays.equals(arr_b, p.f)) {
            return new c("HmacSha256");
        }
        if(Arrays.equals(arr_b, p.g)) {
            return new c("HmacSha384");
        }
        if(!Arrays.equals(arr_b, p.h)) {
            throw new IllegalArgumentException("Unrecognized HPKE KDF identifier");
        }
        return new c("HmacSha512");
    }

    static i e(A1 a10) throws GeneralSecurityException {
        if(a10.Y0() == x1.c) {
            return new s(new c("HmacSha256"));
        }
        if(a10.Y0() == x1.d) {
            return q.f(com.google.crypto.tink.subtle.w.b.a);
        }
        if(a10.Y0() == x1.e) {
            return q.f(com.google.crypto.tink.subtle.w.b.b);
        }
        if(a10.Y0() != x1.f) {
            throw new IllegalArgumentException("Unrecognized HPKE KEM identifier");
        }
        return q.f(com.google.crypto.tink.subtle.w.b.c);
    }

    static i f(byte[] arr_b) throws GeneralSecurityException {
        if(Arrays.equals(arr_b, p.b)) {
            return new s(new c("HmacSha256"));
        }
        if(Arrays.equals(arr_b, p.c)) {
            return q.f(com.google.crypto.tink.subtle.w.b.a);
        }
        if(Arrays.equals(arr_b, p.d)) {
            return q.f(com.google.crypto.tink.subtle.w.b.b);
        }
        if(!Arrays.equals(arr_b, p.e)) {
            throw new IllegalArgumentException("Unrecognized HPKE KEM identifier");
        }
        return q.f(com.google.crypto.tink.subtle.w.b.c);
    }
}

