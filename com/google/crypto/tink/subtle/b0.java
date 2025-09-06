package com.google.crypto.tink.subtle;

import com.google.crypto.tink.config.internal.c;
import java.io.File;
import java.io.IOException;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Locale;
import java.util.regex.Pattern;

public final class b0 {
    static class a {
        static final int[] a;

        static {
            int[] arr_v = new int[com.google.crypto.tink.subtle.A.a.values().length];
            a.a = arr_v;
            try {
                arr_v[com.google.crypto.tink.subtle.A.a.c.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[com.google.crypto.tink.subtle.A.a.d.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[com.google.crypto.tink.subtle.A.a.e.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
        }
    }

    private static final String a = "type.googleapis.com/";
    private static final int b = 0x800;
    private static final String c = "([0-9a-zA-Z\\-\\.\\_~])+";
    private static final Pattern d;
    private static final Pattern e;

    static {
        b0.d = Pattern.compile("^projects/([0-9a-zA-Z\\-\\.\\_~])+/locations/([0-9a-zA-Z\\-\\.\\_~])+/keyRings/([0-9a-zA-Z\\-\\.\\_~])+/cryptoKeys/([0-9a-zA-Z\\-\\.\\_~])+$", 2);
        b0.e = Pattern.compile("^projects/([0-9a-zA-Z\\-\\.\\_~])+/locations/([0-9a-zA-Z\\-\\.\\_~])+/keyRings/([0-9a-zA-Z\\-\\.\\_~])+/cryptoKeys/([0-9a-zA-Z\\-\\.\\_~])+/cryptoKeyVersions/([0-9a-zA-Z\\-\\.\\_~])+$", 2);
    }

    public static void a(int v) throws InvalidAlgorithmParameterException {
        if(v != 16 && v != 0x20) {
            throw new InvalidAlgorithmParameterException(String.format("invalid key size %d; only 128-bit and 256-bit AES keys are supported", ((int)(v * 8))));
        }
    }

    public static void b(String s) throws GeneralSecurityException {
        if(!b0.d.matcher(s).matches()) {
            throw b0.e.matcher(s).matches() ? new GeneralSecurityException("Invalid Google Cloud KMS Key URI. The URI must point to a CryptoKey, not a CryptoKeyVersion") : new GeneralSecurityException("Invalid Google Cloud KMS Key URI. The URI must point to a CryptoKey in the format projects/*/locations/*/keyRings/*/cryptoKeys/*. See https://cloud.google.com/kms/docs/reference/rest/v1/projects.locations.keyRings.cryptoKeys#CryptoKey");
        }
    }

    public static void c(File file0) throws IOException {
        if(!file0.exists()) {
            throw new IOException(String.format("Error: %s doesn\'t exist, please choose another file\n", file0));
        }
    }

    public static String d(String s, String s1) {
        if(!s1.toLowerCase(Locale.US).startsWith(s)) {
            throw new IllegalArgumentException(String.format("key URI must start with %s", s));
        }
        return s1.substring(s.length());
    }

    public static void e(File file0) throws IOException {
        if(file0.exists()) {
            throw new IOException(String.format("%s exists, please choose another file\n", file0));
        }
    }

    public static void f(int v) throws GeneralSecurityException {
        if(v < 0x800) {
            throw new GeneralSecurityException(String.format("Modulus size is %d; only modulus size >= 2048-bit is supported", v));
        }
        if(c.e() && (v != 0x800 && v != 0xC00)) {
            throw new GeneralSecurityException(String.format("Modulus size is %d; only modulus size of 2048- or 3072-bit is supported in FIPS mode.", v));
        }
    }

    public static void g(BigInteger bigInteger0) throws GeneralSecurityException {
        if(!bigInteger0.testBit(0)) {
            throw new GeneralSecurityException("Public exponent must be odd.");
        }
        if(bigInteger0.compareTo(BigInteger.valueOf(0x10000L)) <= 0) {
            throw new GeneralSecurityException("Public exponent must be greater than 65536.");
        }
    }

    public static void h(com.google.crypto.tink.subtle.A.a a$a0) throws GeneralSecurityException {
        switch(a$a0) {
            case 1: 
            case 2: 
            case 3: {
                return;
            }
            default: {
                throw new GeneralSecurityException("Unsupported hash: " + a$a0.name());
            }
        }
    }

    public static void i(String s) throws GeneralSecurityException {
        if(!s.startsWith("type.googleapis.com/")) {
            throw new GeneralSecurityException(String.format("Error: type URL %s is invalid; it must start with %s.\n", s, "type.googleapis.com/"));
        }
        if(s.length() == 20) {
            throw new GeneralSecurityException(String.format("Error: type URL %s is invalid; it has no message name.\n", s));
        }
    }

    public static void j(int v, int v1) throws GeneralSecurityException {
        if(v < 0 || v > v1) {
            throw new GeneralSecurityException(String.format("key has version %d; only keys with version in range [0..%d] are supported", v, v1));
        }
    }
}

