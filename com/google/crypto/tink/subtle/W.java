package com.google.crypto.tink.subtle;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPrivateKeySpec;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.EllipticCurve;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.Arrays;
import javax.crypto.KeyAgreement;

public final class w {
    static class a {
        static final int[] a;
        static final int[] b;

        static {
            int[] arr_v = new int[b.values().length];
            a.b = arr_v;
            try {
                arr_v[b.a.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.b[b.b.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.b[b.c.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            int[] arr_v1 = new int[d.values().length];
            a.a = arr_v1;
            try {
                arr_v1[d.a.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[d.c.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[d.b.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
        }
    }

    public static enum b {
        NIST_P256,
        NIST_P384,
        NIST_P521;

    }

    public static enum c {
        IEEE_P1363,
        DER;

    }

    public static enum d {
        UNCOMPRESSED,
        COMPRESSED,
        DO_NOT_USE_CRUNCHY_UNCOMPRESSED;

    }

    protected static BigInteger A(BigInteger bigInteger0, BigInteger bigInteger1) throws GeneralSecurityException {
        BigInteger bigInteger4;
        if(bigInteger1.signum() != 1) {
            throw new InvalidAlgorithmParameterException("p must be positive");
        }
        int v = 0;
        BigInteger bigInteger2 = bigInteger0.mod(bigInteger1);
        BigInteger bigInteger3 = BigInteger.ZERO;
        if(bigInteger2.equals(bigInteger3)) {
            return bigInteger3;
        }
        if(bigInteger1.testBit(0) && bigInteger1.testBit(1)) {
            bigInteger4 = bigInteger2.modPow(bigInteger1.add(BigInteger.ONE).shiftRight(2), bigInteger1);
        }
        else if(!bigInteger1.testBit(0) || bigInteger1.testBit(1)) {
            bigInteger4 = null;
        }
        else {
            BigInteger bigInteger5 = BigInteger.ONE;
            BigInteger bigInteger6 = bigInteger1.subtract(bigInteger5).shiftRight(1);
            while(true) {
                BigInteger bigInteger7 = bigInteger5.multiply(bigInteger5).subtract(bigInteger2).mod(bigInteger1);
                if(bigInteger7.equals(BigInteger.ZERO)) {
                    return bigInteger5;
                }
                BigInteger bigInteger8 = bigInteger7.modPow(bigInteger6, bigInteger1);
                BigInteger bigInteger9 = BigInteger.ONE;
                if(bigInteger8.add(bigInteger9).equals(bigInteger1)) {
                    BigInteger bigInteger10 = bigInteger1.add(bigInteger9).shiftRight(1);
                    int v1 = bigInteger10.bitLength() - 2;
                    BigInteger bigInteger11 = bigInteger5;
                    while(v1 >= 0) {
                        BigInteger bigInteger12 = bigInteger11.multiply(bigInteger9);
                        bigInteger11 = bigInteger11.multiply(bigInteger11).add(bigInteger9.multiply(bigInteger9).mod(bigInteger1).multiply(bigInteger7)).mod(bigInteger1);
                        BigInteger bigInteger13 = bigInteger12.add(bigInteger12).mod(bigInteger1);
                        if(bigInteger10.testBit(v1)) {
                            BigInteger bigInteger14 = bigInteger11.multiply(bigInteger5).add(bigInteger13.multiply(bigInteger7)).mod(bigInteger1);
                            bigInteger9 = bigInteger5.multiply(bigInteger13).add(bigInteger11).mod(bigInteger1);
                            bigInteger11 = bigInteger14;
                        }
                        else {
                            bigInteger9 = bigInteger13;
                        }
                        --v1;
                    }
                    bigInteger4 = bigInteger11;
                    goto label_42;
                }
                if(!bigInteger8.equals(bigInteger9)) {
                    throw new InvalidAlgorithmParameterException("p is not prime");
                }
                bigInteger5 = bigInteger5.add(bigInteger9);
                ++v;
                if(v == 0x80 && !bigInteger1.isProbablePrime(80)) {
                    break;
                }
            }
            throw new InvalidAlgorithmParameterException("p is not prime");
        }
    label_42:
        if(bigInteger4 != null && bigInteger4.multiply(bigInteger4).mod(bigInteger1).compareTo(bigInteger2) != 0) {
            throw new GeneralSecurityException("Could not find a modular square root");
        }
        return bigInteger4;
    }

    public static ECPoint B(b w$b0, d w$d0, byte[] arr_b) throws GeneralSecurityException {
        return w.C(w.l(w$b0).getCurve(), w$d0, arr_b);
    }

    public static ECPoint C(EllipticCurve ellipticCurve0, d w$d0, byte[] arr_b) throws GeneralSecurityException {
        int v = w.i(ellipticCurve0);
        boolean z = false;
        switch(w$d0) {
            case 1: {
                if(arr_b.length != v * 2 + 1) {
                    throw new GeneralSecurityException("invalid point size");
                }
                if(arr_b[0] != 4) {
                    throw new GeneralSecurityException("invalid point format");
                }
                ECPoint eCPoint0 = new ECPoint(new BigInteger(1, Arrays.copyOfRange(arr_b, 1, v + 1)), new BigInteger(1, Arrays.copyOfRange(arr_b, v + 1, arr_b.length)));
                com.google.crypto.tink.internal.c.b(eCPoint0, ellipticCurve0);
                return eCPoint0;
            }
            case 2: {
                if(arr_b.length != v * 2) {
                    throw new GeneralSecurityException("invalid point size");
                }
                ECPoint eCPoint1 = new ECPoint(new BigInteger(1, Arrays.copyOfRange(arr_b, 0, v)), new BigInteger(1, Arrays.copyOfRange(arr_b, v, arr_b.length)));
                com.google.crypto.tink.internal.c.b(eCPoint1, ellipticCurve0);
                return eCPoint1;
            }
            case 3: {
                BigInteger bigInteger0 = w.s(ellipticCurve0);
                if(arr_b.length != v + 1) {
                    throw new GeneralSecurityException("compressed point has wrong length");
                }
                int v1 = arr_b[0];
                if(v1 != 2) {
                    if(v1 != 3) {
                        throw new GeneralSecurityException("invalid format");
                    }
                    z = true;
                }
                BigInteger bigInteger1 = new BigInteger(1, Arrays.copyOfRange(arr_b, 1, arr_b.length));
                if(bigInteger1.signum() == -1 || bigInteger1.compareTo(bigInteger0) >= 0) {
                    throw new GeneralSecurityException("x is out of range");
                }
                return new ECPoint(bigInteger1, w.w(bigInteger1, z, ellipticCurve0));
            }
            default: {
                throw new GeneralSecurityException("invalid format:" + w$d0);
            }
        }
    }

    public static byte[] D(b w$b0, d w$d0, ECPoint eCPoint0) throws GeneralSecurityException {
        return w.E(w.l(w$b0).getCurve(), w$d0, eCPoint0);
    }

    public static byte[] E(EllipticCurve ellipticCurve0, d w$d0, ECPoint eCPoint0) throws GeneralSecurityException {
        int v = 2;
        com.google.crypto.tink.internal.c.b(eCPoint0, ellipticCurve0);
        int v1 = w.i(ellipticCurve0);
        switch(w$d0) {
            case 1: {
                int v2 = v1 * 2 + 1;
                byte[] arr_b = new byte[v2];
                byte[] arr_b1 = com.google.crypto.tink.internal.a.b(eCPoint0.getAffineX());
                byte[] arr_b2 = com.google.crypto.tink.internal.a.b(eCPoint0.getAffineY());
                System.arraycopy(arr_b2, 0, arr_b, v2 - arr_b2.length, arr_b2.length);
                System.arraycopy(arr_b1, 0, arr_b, v1 + 1 - arr_b1.length, arr_b1.length);
                arr_b[0] = 4;
                return arr_b;
            }
            case 2: {
                byte[] arr_b3 = new byte[v1 * 2];
                byte[] arr_b4 = com.google.crypto.tink.internal.a.b(eCPoint0.getAffineX());
                if(arr_b4.length > v1) {
                    arr_b4 = Arrays.copyOfRange(arr_b4, arr_b4.length - v1, arr_b4.length);
                }
                byte[] arr_b5 = com.google.crypto.tink.internal.a.b(eCPoint0.getAffineY());
                if(arr_b5.length > v1) {
                    arr_b5 = Arrays.copyOfRange(arr_b5, arr_b5.length - v1, arr_b5.length);
                }
                System.arraycopy(arr_b5, 0, arr_b3, v1 * 2 - arr_b5.length, arr_b5.length);
                System.arraycopy(arr_b4, 0, arr_b3, v1 - arr_b4.length, arr_b4.length);
                return arr_b3;
            }
            case 3: {
                byte[] arr_b6 = new byte[v1 + 1];
                byte[] arr_b7 = com.google.crypto.tink.internal.a.b(eCPoint0.getAffineX());
                System.arraycopy(arr_b7, 0, arr_b6, v1 + 1 - arr_b7.length, arr_b7.length);
                if(eCPoint0.getAffineY().testBit(0)) {
                    v = 3;
                }
                arr_b6[0] = (byte)v;
                return arr_b6;
            }
            default: {
                throw new GeneralSecurityException("invalid format:" + w$d0);
            }
        }
    }

    private static byte[] F(byte[] arr_b) {
        int v = 0;
        int v1;
        for(v1 = 0; v1 < arr_b.length && arr_b[v1] == 0; ++v1) {
        }
        if(v1 == arr_b.length) {
            v1 = arr_b.length - 1;
        }
        if((arr_b[v1] & 0x80) == 0x80) {
            v = 1;
        }
        byte[] arr_b1 = new byte[arr_b.length - v1 + v];
        System.arraycopy(arr_b, v1, arr_b1, v, arr_b.length - v1);
        return arr_b1;
    }

    public static void G(ECPublicKey eCPublicKey0, ECPrivateKey eCPrivateKey0) throws GeneralSecurityException {
        w.H(eCPublicKey0, eCPrivateKey0);
        com.google.crypto.tink.internal.c.b(eCPublicKey0.getW(), eCPrivateKey0.getParams().getCurve());
    }

    static void H(ECPublicKey eCPublicKey0, ECPrivateKey eCPrivateKey0) throws GeneralSecurityException {
        try {
            if(!w.y(eCPublicKey0.getParams(), eCPrivateKey0.getParams())) {
                throw new GeneralSecurityException("invalid public key spec");
            }
        }
        catch(IllegalArgumentException | NullPointerException illegalArgumentException0) {
            throw new GeneralSecurityException(illegalArgumentException0);
        }
    }

    private static void I(byte[] arr_b, ECPrivateKey eCPrivateKey0) throws GeneralSecurityException {
        EllipticCurve ellipticCurve0 = eCPrivateKey0.getParams().getCurve();
        BigInteger bigInteger0 = new BigInteger(1, arr_b);
        if(bigInteger0.signum() == -1 || bigInteger0.compareTo(w.s(ellipticCurve0)) >= 0) {
            throw new GeneralSecurityException("shared secret is out of range");
        }
        w.w(bigInteger0, true, ellipticCurve0);
    }

    static void a(ECPublicKey eCPublicKey0) throws GeneralSecurityException {
        com.google.crypto.tink.internal.c.b(eCPublicKey0.getW(), eCPublicKey0.getParams().getCurve());
    }

    public static byte[] b(ECPrivateKey eCPrivateKey0, ECPublicKey eCPublicKey0) throws GeneralSecurityException {
        w.H(eCPublicKey0, eCPrivateKey0);
        return w.c(eCPrivateKey0, eCPublicKey0.getW());
    }

    public static byte[] c(ECPrivateKey eCPrivateKey0, ECPoint eCPoint0) throws GeneralSecurityException {
        com.google.crypto.tink.internal.c.b(eCPoint0, eCPrivateKey0.getParams().getCurve());
        ECPublicKeySpec eCPublicKeySpec0 = new ECPublicKeySpec(eCPoint0, eCPrivateKey0.getParams());
        PublicKey publicKey0 = ((KeyFactory)y.h.a("EC")).generatePublic(eCPublicKeySpec0);
        KeyAgreement keyAgreement0 = (KeyAgreement)y.f.a("ECDH");
        keyAgreement0.init(eCPrivateKey0);
        try {
            keyAgreement0.doPhase(publicKey0, true);
            byte[] arr_b = keyAgreement0.generateSecret();
            w.I(arr_b, eCPrivateKey0);
            return arr_b;
        }
        catch(IllegalStateException illegalStateException0) {
            throw new GeneralSecurityException(illegalStateException0);
        }
    }

    public static ECPoint d(EllipticCurve ellipticCurve0, d w$d0, byte[] arr_b) throws GeneralSecurityException {
        return w.C(ellipticCurve0, w$d0, arr_b);
    }

    public static byte[] e(byte[] arr_b, int v) throws GeneralSecurityException {
        if(!w.z(arr_b)) {
            throw new GeneralSecurityException("Invalid DER encoding");
        }
        byte[] arr_b1 = new byte[v];
        int v1 = 1;
        int v2 = (arr_b[1] & 0xFF) < 0x80 ? 2 : 3;
        int v3 = arr_b[v2 + 1];
        int v4 = arr_b[v2 + 2] == 0 ? 1 : 0;
        System.arraycopy(arr_b, v2 + 2 + v4, arr_b1, v / 2 - v3 + v4, v3 - v4);
        int v5 = v2 + v3 + 3;
        int v6 = arr_b[v5];
        if(arr_b[v5 + 1] != 0) {
            v1 = 0;
        }
        System.arraycopy(arr_b, v5 + 1 + v1, arr_b1, v - v6 + v1, v6 - v1);
        return arr_b1;
    }

    public static byte[] f(byte[] arr_b) throws GeneralSecurityException {
        int v1;
        byte[] arr_b3;
        if(arr_b.length % 2 != 0 || arr_b.length == 0 || arr_b.length > 0x84) {
            throw new GeneralSecurityException("Invalid IEEE_P1363 encoding");
        }
        byte[] arr_b1 = w.F(Arrays.copyOf(arr_b, arr_b.length / 2));
        byte[] arr_b2 = w.F(Arrays.copyOfRange(arr_b, arr_b.length / 2, arr_b.length));
        int v = arr_b1.length + 4 + arr_b2.length;
        if(v >= 0x80) {
            arr_b3 = new byte[v + 3];
            arr_b3[0] = 0x30;
            arr_b3[1] = (byte)0x81;
            arr_b3[2] = (byte)v;
            v1 = 3;
        }
        else {
            arr_b3 = new byte[v + 2];
            arr_b3[0] = 0x30;
            arr_b3[1] = (byte)v;
            v1 = 2;
        }
        arr_b3[v1] = 2;
        arr_b3[v1 + 1] = (byte)arr_b1.length;
        System.arraycopy(arr_b1, 0, arr_b3, v1 + 2, arr_b1.length);
        int v2 = v1 + 2 + arr_b1.length;
        arr_b3[v2] = 2;
        arr_b3[v2 + 1] = (byte)arr_b2.length;
        System.arraycopy(arr_b2, 0, arr_b3, v2 + 2, arr_b2.length);
        return arr_b3;
    }

    public static int g(EllipticCurve ellipticCurve0, d w$d0) throws GeneralSecurityException {
        int v = w.i(ellipticCurve0);
        int v1 = a.a[w$d0.ordinal()];
        switch(v1) {
            case 1: {
                return v * 2 + 1;
            }
            case 2: {
                return v * 2;
            }
            default: {
                if(v1 != 3) {
                    throw new GeneralSecurityException("unknown EC point format");
                }
                return v + 1;
            }
        }
    }

    public static int h(EllipticCurve ellipticCurve0) throws GeneralSecurityException {
        return w.s(ellipticCurve0).subtract(BigInteger.ONE).bitLength();
    }

    public static int i(EllipticCurve ellipticCurve0) throws GeneralSecurityException {
        return (w.h(ellipticCurve0) + 7) / 8;
    }

    public static KeyPair j(b w$b0) throws GeneralSecurityException {
        return w.k(w.l(w$b0));
    }

    public static KeyPair k(ECParameterSpec eCParameterSpec0) throws GeneralSecurityException {
        KeyPairGenerator keyPairGenerator0 = (KeyPairGenerator)y.g.a("EC");
        keyPairGenerator0.initialize(eCParameterSpec0);
        return keyPairGenerator0.generateKeyPair();
    }

    public static ECParameterSpec l(b w$b0) throws NoSuchAlgorithmException {
        switch(w$b0) {
            case 1: {
                return w.t();
            }
            case 2: {
                return w.u();
            }
            case 3: {
                return w.v();
            }
            default: {
                throw new NoSuchAlgorithmException("curve not implemented:" + w$b0);
            }
        }
    }

    public static ECPrivateKey m(b w$b0, byte[] arr_b) throws GeneralSecurityException {
        ECParameterSpec eCParameterSpec0 = w.l(w$b0);
        ECPrivateKeySpec eCPrivateKeySpec0 = new ECPrivateKeySpec(com.google.crypto.tink.internal.a.a(arr_b), eCParameterSpec0);
        return (ECPrivateKey)((KeyFactory)y.h.a("EC")).generatePrivate(eCPrivateKeySpec0);
    }

    public static ECPrivateKey n(byte[] arr_b) throws GeneralSecurityException {
        return (ECPrivateKey)((KeyFactory)y.h.a("EC")).generatePrivate(new PKCS8EncodedKeySpec(arr_b));
    }

    public static ECPublicKey o(b w$b0, d w$d0, byte[] arr_b) throws GeneralSecurityException {
        return w.q(w.l(w$b0), w$d0, arr_b);
    }

    public static ECPublicKey p(b w$b0, byte[] arr_b, byte[] arr_b1) throws GeneralSecurityException {
        ECParameterSpec eCParameterSpec0 = w.l(w$b0);
        ECPoint eCPoint0 = new ECPoint(new BigInteger(1, arr_b), new BigInteger(1, arr_b1));
        com.google.crypto.tink.internal.c.b(eCPoint0, eCParameterSpec0.getCurve());
        ECPublicKeySpec eCPublicKeySpec0 = new ECPublicKeySpec(eCPoint0, eCParameterSpec0);
        return (ECPublicKey)((KeyFactory)y.h.a("EC")).generatePublic(eCPublicKeySpec0);
    }

    public static ECPublicKey q(ECParameterSpec eCParameterSpec0, d w$d0, byte[] arr_b) throws GeneralSecurityException {
        ECPublicKeySpec eCPublicKeySpec0 = new ECPublicKeySpec(w.C(eCParameterSpec0.getCurve(), w$d0, arr_b), eCParameterSpec0);
        return (ECPublicKey)((KeyFactory)y.h.a("EC")).generatePublic(eCPublicKeySpec0);
    }

    public static ECPublicKey r(byte[] arr_b) throws GeneralSecurityException {
        return (ECPublicKey)((KeyFactory)y.h.a("EC")).generatePublic(new X509EncodedKeySpec(arr_b));
    }

    public static BigInteger s(EllipticCurve ellipticCurve0) throws GeneralSecurityException {
        return com.google.crypto.tink.internal.c.d(ellipticCurve0);
    }

    public static ECParameterSpec t() {
        return com.google.crypto.tink.internal.c.a;
    }

    public static ECParameterSpec u() {
        return com.google.crypto.tink.internal.c.b;
    }

    public static ECParameterSpec v() {
        return com.google.crypto.tink.internal.c.c;
    }

    public static BigInteger w(BigInteger bigInteger0, boolean z, EllipticCurve ellipticCurve0) throws GeneralSecurityException {
        BigInteger bigInteger1 = w.s(ellipticCurve0);
        BigInteger bigInteger2 = ellipticCurve0.getA();
        BigInteger bigInteger3 = ellipticCurve0.getB();
        BigInteger bigInteger4 = w.A(bigInteger0.multiply(bigInteger0).add(bigInteger2).multiply(bigInteger0).add(bigInteger3).mod(bigInteger1), bigInteger1);
        return z == bigInteger4.testBit(0) ? bigInteger4 : bigInteger1.subtract(bigInteger4).mod(bigInteger1);
    }

    public static boolean x(ECParameterSpec eCParameterSpec0) {
        return com.google.crypto.tink.internal.c.i(eCParameterSpec0);
    }

    public static boolean y(ECParameterSpec eCParameterSpec0, ECParameterSpec eCParameterSpec1) {
        return com.google.crypto.tink.internal.c.j(eCParameterSpec0, eCParameterSpec1);
    }

    public static boolean z(byte[] arr_b) {
        int v1;
        if(arr_b.length < 8) {
            return false;
        }
        if(arr_b[0] != 0x30) {
            return false;
        }
        int v = arr_b[1] & 0xFF;
        if(v == 0x81) {
            v = arr_b[2] & 0xFF;
            if(v < 0x80) {
                return false;
            }
            v1 = 2;
        }
        else if(v != 0x80 && v <= 0x81) {
            v1 = 1;
        }
        else {
            return false;
        }
        if(v != arr_b.length - 1 - v1) {
            return false;
        }
        if(arr_b[v1 + 1] != 2) {
            return false;
        }
        int v2 = arr_b[v1 + 2] & 0xFF;
        int v3 = v1 + 3 + v2;
        if(v3 + 1 >= arr_b.length) {
            return false;
        }
        if(v2 == 0) {
            return false;
        }
        int v4 = arr_b[v1 + 3];
        if((v4 & 0xFF) >= 0x80) {
            return false;
        }
        if(v2 > 1 && v4 == 0 && (arr_b[v1 + 4] & 0xFF) < 0x80) {
            return false;
        }
        if(arr_b[v1 + 3 + v2] != 2) {
            return false;
        }
        int v5 = arr_b[v3 + 1] & 0xFF;
        if(v3 + 2 + v5 != arr_b.length) {
            return false;
        }
        if(v5 == 0) {
            return false;
        }
        int v6 = arr_b[v1 + 5 + v2];
        return (v6 & 0xFF) < 0x80 ? v5 <= 1 || v6 != 0 || (arr_b[v1 + 6 + v2] & 0xFF) >= 0x80 : false;
    }
}

