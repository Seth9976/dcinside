package com.google.crypto.tink.util;

import O1.j;
import com.google.crypto.tink.subtle.C;
import java.util.Arrays;

@j
public final class a {
    private final byte[] a;

    private a(byte[] arr_b, int v, int v1) {
        byte[] arr_b1 = new byte[v1];
        this.a = arr_b1;
        System.arraycopy(arr_b, v, arr_b1, 0, v1);
    }

    public static a a(byte[] arr_b) {
        if(arr_b == null) {
            throw new NullPointerException("data must be non-null");
        }
        return a.b(arr_b, 0, arr_b.length);
    }

    public static a b(byte[] arr_b, int v, int v1) {
        if(arr_b == null) {
            throw new NullPointerException("data must be non-null");
        }
        return new a(arr_b, v, v1);
    }

    public int c() {
        return this.a.length;
    }

    public byte[] d() {
        byte[] arr_b = new byte[this.a.length];
        System.arraycopy(this.a, 0, arr_b, 0, this.a.length);
        return arr_b;
    }

    @Override
    public boolean equals(Object object0) {
        return object0 instanceof a ? Arrays.equals(((a)object0).a, this.a) : false;
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(this.a);
    }

    @Override
    public String toString() {
        return "Bytes(" + C.b(this.a) + ")";
    }
}

