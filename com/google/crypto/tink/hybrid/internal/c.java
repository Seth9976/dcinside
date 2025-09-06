package com.google.crypto.tink.hybrid.internal;

import O1.j;
import com.google.crypto.tink.subtle.y;
import java.security.GeneralSecurityException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

@j
final class c implements h {
    private final String a;

    c(String s) {
        this.a = s;
    }

    @Override  // com.google.crypto.tink.hybrid.internal.h
    public byte[] a(byte[] arr_b, byte[] arr_b1, String s, byte[] arr_b2) throws GeneralSecurityException {
        return this.f(p.d(s, arr_b1, arr_b2), arr_b);
    }

    @Override  // com.google.crypto.tink.hybrid.internal.h
    public byte[] b() throws GeneralSecurityException {
        this.a.hashCode();
        switch(this.a) {
            case "HmacSha256": {
                return p.f;
            }
            case "HmacSha384": {
                return p.g;
            }
            case "HmacSha512": {
                return p.h;
            }
            default: {
                throw new GeneralSecurityException("Could not determine HPKE KDF ID");
            }
        }
    }

    @Override  // com.google.crypto.tink.hybrid.internal.h
    public byte[] c(byte[] arr_b, byte[] arr_b1, String s, byte[] arr_b2, String s1, byte[] arr_b3, int v) throws GeneralSecurityException {
        return this.e(this.f(p.d(s, arr_b1, arr_b3), arr_b), p.e(s1, arr_b2, arr_b3, v), v);
    }

    @Override  // com.google.crypto.tink.hybrid.internal.h
    public byte[] d(byte[] arr_b, byte[] arr_b1, String s, byte[] arr_b2, int v) throws GeneralSecurityException {
        return this.e(arr_b, p.e(s, arr_b1, arr_b2, v), v);
    }

    private byte[] e(byte[] arr_b, byte[] arr_b1, int v) throws GeneralSecurityException {
        Mac mac0 = (Mac)y.c.a(this.a);
        if(v > mac0.getMacLength() * 0xFF) {
            throw new GeneralSecurityException("size too large");
        }
        byte[] arr_b2 = new byte[v];
        mac0.init(new SecretKeySpec(arr_b, this.a));
        byte[] arr_b3 = new byte[0];
        int v2 = 0;
        for(int v1 = 1; true; ++v1) {
            mac0.update(arr_b3);
            mac0.update(arr_b1);
            mac0.update(((byte)v1));
            arr_b3 = mac0.doFinal();
            if(arr_b3.length + v2 >= v) {
                break;
            }
            System.arraycopy(arr_b3, 0, arr_b2, v2, arr_b3.length);
            v2 += arr_b3.length;
        }
        System.arraycopy(arr_b3, 0, arr_b2, v2, v - v2);
        return arr_b2;
    }

    private byte[] f(byte[] arr_b, byte[] arr_b1) throws GeneralSecurityException {
        Mac mac0 = (Mac)y.c.a(this.a);
        if(arr_b1 != null && arr_b1.length != 0) {
            mac0.init(new SecretKeySpec(arr_b1, this.a));
            return mac0.doFinal(arr_b);
        }
        mac0.init(new SecretKeySpec(new byte[mac0.getMacLength()], this.a));
        return mac0.doFinal(arr_b);
    }

    int g() throws GeneralSecurityException {
        return Mac.getInstance(this.a).getMacLength();
    }
}

