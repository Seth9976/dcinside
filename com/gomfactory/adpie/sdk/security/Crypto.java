package com.gomfactory.adpie.sdk.security;

import android.util.Base64;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Locale;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Crypto {
    private static String IV = "7UjM8iKl";
    private static String KEY = "zaq1XSW2cde3VFR4bgt5NHY6";
    public static final String TAG = "Crypto";
    private static String algorithm = "DESede";
    private static String transformation = "DESede/CFB8/NoPadding";

    static {
    }

    public static String decrypt(String s) {
        try {
            byte[] arr_b = new byte[24];
            for(int v = 0; v < 24; ++v) {
                arr_b[v] = (byte)"zaq1XSW2cde3VFR4bgt5NHY6".charAt(v);
            }
            SecretKeySpec secretKeySpec0 = new SecretKeySpec(arr_b, "DESede");
            IvParameterSpec ivParameterSpec0 = new IvParameterSpec("7UjM8iKl".getBytes());
            Cipher cipher0 = Cipher.getInstance("DESede/CFB8/NoPadding");
            cipher0.init(2, secretKeySpec0, ivParameterSpec0);
            return s == null ? null : new String(cipher0.doFinal(Base64.decode(s.getBytes(), 8)), "UTF8");
        }
        catch(Exception unused_ex) {
            return null;
        }
    }

    public static String encrypt(String s) {
        try {
            Cipher cipher0 = Cipher.getInstance("DESede/CFB8/NoPadding");
            byte[] arr_b = new byte[24];
            for(int v = 0; v < 24; ++v) {
                arr_b[v] = (byte)"zaq1XSW2cde3VFR4bgt5NHY6".charAt(v);
            }
            cipher0.init(1, new SecretKeySpec(arr_b, "DESede"), new IvParameterSpec("7UjM8iKl".getBytes()));
            return s == null ? null : new String(Base64.encode(cipher0.doFinal(s.getBytes("UTF8")), 8), "UTF-8");
        }
        catch(Exception unused_ex) {
            return null;
        }
    }

    public static String getMD5(String s) {
        try {
            MessageDigest messageDigest0 = MessageDigest.getInstance("MD5");
            messageDigest0.update(s.getBytes(), 0, s.length());
            byte[] arr_b = messageDigest0.digest();
            String s1 = "";
            for(int v = 0; v < arr_b.length; ++v) {
                int v1 = arr_b[v] & 0xFF;
                if(v1 <= 15) {
                    s1 = s1 + "0";
                }
                s1 = s1 + Integer.toHexString(v1);
            }
            return s1.toUpperCase();
        }
        catch(NoSuchAlgorithmException unused_ex) {
            return "";
        }
    }

    public static String sha1(String s) {
        StringBuilder stringBuilder0 = new StringBuilder();
        try {
            MessageDigest messageDigest0 = MessageDigest.getInstance("SHA-1");
            byte[] arr_b = s.getBytes("UTF-8");
            messageDigest0.update(arr_b, 0, arr_b.length);
            byte[] arr_b1 = messageDigest0.digest();
            for(int v = 0; v < arr_b1.length; ++v) {
                stringBuilder0.append(String.format("%02X", ((byte)arr_b1[v])));
            }
            return stringBuilder0.toString().toLowerCase(Locale.US);
        }
        catch(Exception unused_ex) {
            return "";
        }
    }
}

