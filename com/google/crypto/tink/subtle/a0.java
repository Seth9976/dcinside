package com.google.crypto.tink.subtle;

import com.google.crypto.tink.internal.z;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;

public final class a0 {
    static class a {
        static final int[] a;

        static {
            int[] arr_v = new int[com.google.crypto.tink.subtle.A.a.values().length];
            a.a = arr_v;
            try {
                arr_v[com.google.crypto.tink.subtle.A.a.a.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[com.google.crypto.tink.subtle.A.a.b.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[com.google.crypto.tink.subtle.A.a.c.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[com.google.crypto.tink.subtle.A.a.d.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[com.google.crypto.tink.subtle.A.a.e.ordinal()] = 5;
            }
            catch(NoSuchFieldError unused_ex) {
            }
        }
    }

    @Deprecated
    public static int a() {
        Integer integer0 = z.a();
        return integer0 == null ? -1 : ((int)integer0);
    }

    public static BigInteger b(byte[] arr_b) {
        return com.google.crypto.tink.internal.a.a(arr_b);
    }

    public static byte[] c(BigInteger bigInteger0, int v) throws GeneralSecurityException {
        return com.google.crypto.tink.internal.a.c(bigInteger0, v);
    }

    // 去混淆评级： 低(30)
    public static boolean d() {
        return true;
    }

    public static byte[] e(byte[] arr_b, int v, com.google.crypto.tink.subtle.A.a a$a0) throws GeneralSecurityException {
        String s = a0.g(a$a0);
        MessageDigest messageDigest0 = (MessageDigest)y.e.a(s);
        int v1 = messageDigest0.getDigestLength();
        byte[] arr_b1 = new byte[v];
        int v3 = 0;
        for(int v2 = 0; v2 <= (v - 1) / v1; ++v2) {
            messageDigest0.reset();
            messageDigest0.update(arr_b);
            messageDigest0.update(a0.c(BigInteger.valueOf(v2), 4));
            byte[] arr_b2 = messageDigest0.digest();
            System.arraycopy(arr_b2, 0, arr_b1, v3, Math.min(arr_b2.length, v - v3));
            v3 += arr_b2.length;
        }
        return arr_b1;
    }

    public static void f(ByteBuffer byteBuffer0, long v) throws GeneralSecurityException {
        if(0L > v || v >= 0x100000000L) {
            throw new GeneralSecurityException("Index out of range");
        }
        byteBuffer0.putInt(((int)v));
    }

    public static String g(com.google.crypto.tink.subtle.A.a a$a0) throws GeneralSecurityException {
        switch(a$a0) {
            case 1: {
                return "SHA-1";
            }
            case 2: {
                return "SHA-224";
            }
            case 3: {
                return "SHA-256";
            }
            case 4: {
                return "SHA-384";
            }
            case 5: {
                return "SHA-512";
            }
            default: {
                throw new GeneralSecurityException("Unsupported hash " + a$a0);
            }
        }
    }

    public static String h(com.google.crypto.tink.subtle.A.a a$a0) throws GeneralSecurityException {
        b0.h(a$a0);
        return a$a0 + "withECDSA";
    }

    public static String i(com.google.crypto.tink.subtle.A.a a$a0) throws GeneralSecurityException {
        b0.h(a$a0);
        return a$a0 + "withRSA";
    }
}

