package com.google.crypto.tink.subtle;

import java.math.BigInteger;

final class t {
    static class a {
    }

    static class b {
        private BigInteger a;
        private BigInteger b;

        private b() {
        }

        b(a t$a0) {
        }
    }

    static final long[] a;
    static final long[] b;
    static final long[] c;
    static final com.google.crypto.tink.subtle.s.a[][] d;
    static final com.google.crypto.tink.subtle.s.a[] e;
    private static final BigInteger f;
    private static final BigInteger g;
    private static final BigInteger h;
    private static final BigInteger i;

    static {
        BigInteger bigInteger0 = BigInteger.valueOf(2L).pow(0xFF).subtract(BigInteger.valueOf(19L));
        t.f = bigInteger0;
        BigInteger bigInteger1 = BigInteger.valueOf(0xFFFFFFFFFFFE24BFL).multiply(BigInteger.valueOf(0x1DB42L).modInverse(bigInteger0)).mod(bigInteger0);
        t.g = bigInteger1;
        BigInteger bigInteger2 = BigInteger.valueOf(2L).multiply(bigInteger1).mod(bigInteger0);
        t.h = bigInteger2;
        BigInteger bigInteger3 = BigInteger.valueOf(2L).modPow(bigInteger0.subtract(BigInteger.ONE).divide(BigInteger.valueOf(4L)), bigInteger0);
        t.i = bigInteger3;
        b t$b0 = new b(null);
        t$b0.b = BigInteger.valueOf(4L).multiply(BigInteger.valueOf(5L).modInverse(bigInteger0)).mod(bigInteger0);
        t$b0.a = t.c(t$b0.b);
        t.a = B.c(t.d(bigInteger1));
        t.b = B.c(t.d(bigInteger2));
        t.c = B.c(t.d(bigInteger3));
        t.d = new com.google.crypto.tink.subtle.s.a[0x20][8];
        b t$b1 = t$b0;
        for(int v1 = 0; v1 < 0x20; ++v1) {
            b t$b2 = t$b1;
            for(int v2 = 0; v2 < 8; ++v2) {
                com.google.crypto.tink.subtle.s.a[] arr_s$a = t.d[v1];
                arr_s$a[v2] = t.b(t$b2);
                t$b2 = t.a(t$b2, t$b1);
            }
            for(int v3 = 0; v3 < 8; ++v3) {
                t$b1 = t.a(t$b1, t$b1);
            }
        }
        b t$b3 = t.a(t$b0, t$b0);
        t.e = new com.google.crypto.tink.subtle.s.a[8];
        for(int v = 0; v < 8; ++v) {
            t.e[v] = t.b(t$b0);
            t$b0 = t.a(t$b0, t$b3);
        }
    }

    private static b a(b t$b0, b t$b1) {
        b t$b2 = new b(null);
        BigInteger bigInteger0 = t$b0.a.multiply(t$b1.a).multiply(t$b0.b).multiply(t$b1.b);
        BigInteger bigInteger1 = t.g.multiply(bigInteger0).mod(t.f);
        BigInteger bigInteger2 = t$b0.a.multiply(t$b1.b).add(t$b1.a.multiply(t$b0.b));
        BigInteger bigInteger3 = BigInteger.ONE;
        t$b2.a = bigInteger2.multiply(bigInteger3.add(bigInteger1).modInverse(t.f)).mod(t.f);
        t$b2.b = t$b0.b.multiply(t$b1.b).add(t$b0.a.multiply(t$b1.a)).multiply(bigInteger3.subtract(bigInteger1).modInverse(t.f)).mod(t.f);
        return t$b2;
    }

    private static com.google.crypto.tink.subtle.s.a b(b t$b0) {
        return new com.google.crypto.tink.subtle.s.a(B.c(t.d(t$b0.b.add(t$b0.a).mod(t.f))), B.c(t.d(t$b0.b.subtract(t$b0.a).mod(t.f))), B.c(t.d(t.h.multiply(t$b0.a).multiply(t$b0.b).mod(t.f))));
    }

    private static BigInteger c(BigInteger bigInteger0) {
        BigInteger bigInteger1 = bigInteger0.pow(2);
        BigInteger bigInteger2 = BigInteger.ONE;
        BigInteger bigInteger3 = bigInteger1.subtract(bigInteger2);
        BigInteger bigInteger4 = bigInteger0.pow(2);
        BigInteger bigInteger5 = t.g.multiply(bigInteger4).add(bigInteger2);
        BigInteger bigInteger6 = t.f;
        BigInteger bigInteger7 = bigInteger3.multiply(bigInteger5.modInverse(bigInteger6));
        BigInteger bigInteger8 = bigInteger7.modPow(bigInteger6.add(BigInteger.valueOf(3L)).divide(BigInteger.valueOf(8L)), bigInteger6);
        if(!bigInteger8.pow(2).subtract(bigInteger7).mod(bigInteger6).equals(BigInteger.ZERO)) {
            bigInteger8 = bigInteger8.multiply(t.i).mod(bigInteger6);
        }
        return bigInteger8.testBit(0) ? bigInteger6.subtract(bigInteger8) : bigInteger8;
    }

    private static byte[] d(BigInteger bigInteger0) {
        byte[] arr_b = new byte[0x20];
        byte[] arr_b1 = bigInteger0.toByteArray();
        System.arraycopy(arr_b1, 0, arr_b, 0x20 - arr_b1.length, arr_b1.length);
        for(int v = 0; v < 16; ++v) {
            byte b = arr_b[v];
            arr_b[v] = arr_b[0x1F - v];
            arr_b[0x1F - v] = b;
        }
        return arr_b;
    }
}

