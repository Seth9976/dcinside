package com.facebook.common.util;

import android.util.Base64;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import k1.n.a;
import k1.n;

@n(a.a)
public class e {
    static final byte[] a = null;
    private static final int b = 0x1000;

    static {
        e.a = new byte[]{0x30, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};
    }

    public static String a(byte[] arr_b) throws UnsupportedEncodingException {
        StringBuilder stringBuilder0 = new StringBuilder(arr_b.length);
        for(int v = 0; v < arr_b.length; ++v) {
            int v1 = arr_b[v];
            stringBuilder0.append(((char)e.a[(v1 & 0xFF) >>> 4]));
            stringBuilder0.append(((char)e.a[v1 & 15]));
        }
        return stringBuilder0.toString();
    }

    private static String b(InputStream inputStream0, String s) throws IOException {
        try {
            MessageDigest messageDigest0 = MessageDigest.getInstance(s);
            byte[] arr_b = new byte[0x1000];
            int v;
            while((v = inputStream0.read(arr_b)) > 0) {
                messageDigest0.update(arr_b, 0, v);
            }
            return e.a(messageDigest0.digest());
        }
        catch(NoSuchAlgorithmException noSuchAlgorithmException0) {
        }
        catch(UnsupportedEncodingException unsupportedEncodingException0) {
            throw new RuntimeException(unsupportedEncodingException0);
        }
        throw new RuntimeException(noSuchAlgorithmException0);
    }

    private static String c(byte[] arr_b, String s) {
        try {
            MessageDigest messageDigest0 = MessageDigest.getInstance(s);
            messageDigest0.update(arr_b, 0, arr_b.length);
            return e.a(messageDigest0.digest());
        }
        catch(NoSuchAlgorithmException noSuchAlgorithmException0) {
            throw new RuntimeException(noSuchAlgorithmException0);
        }
        catch(UnsupportedEncodingException unsupportedEncodingException0) {
            throw new RuntimeException(unsupportedEncodingException0);
        }
    }

    public static String d(InputStream inputStream0) throws IOException {
        return e.b(inputStream0, "MD5");
    }

    public static String e(String s) {
        try {
            return e.f(s.getBytes("utf-8"));
        }
        catch(UnsupportedEncodingException unsupportedEncodingException0) {
            throw new RuntimeException(unsupportedEncodingException0);
        }
    }

    public static String f(byte[] arr_b) {
        return e.c(arr_b, "MD5");
    }

    public static String g(String s) {
        try {
            return e.h(s.getBytes("utf-8"));
        }
        catch(UnsupportedEncodingException unsupportedEncodingException0) {
            throw new RuntimeException(unsupportedEncodingException0);
        }
    }

    public static String h(byte[] arr_b) {
        return e.c(arr_b, "SHA-1");
    }

    public static String i(byte[] arr_b) {
        try {
            MessageDigest messageDigest0 = MessageDigest.getInstance("SHA-1");
            messageDigest0.update(arr_b, 0, arr_b.length);
            return Base64.encodeToString(messageDigest0.digest(), 11);
        }
        catch(NoSuchAlgorithmException noSuchAlgorithmException0) {
            throw new RuntimeException(noSuchAlgorithmException0);
        }
    }

    public static String j(byte[] arr_b) {
        return e.c(arr_b, "SHA-256");
    }
}

