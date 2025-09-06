package com.bytedance.sdk.component.cr;

import android.text.TextUtils;
import android.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class PjT {
    private static String PjT;

    public static String PjT(String s) [...] // 潜在的解密器

    @Deprecated
    public static String PjT(String s, String s1) {
        try {
            SecretKeySpec secretKeySpec0 = new SecretKeySpec(s1.getBytes(), "AES");
            if(TextUtils.isEmpty(PjT.PjT)) {
                PjT.PjT = "AES/ECB/PKCS5Padding";
            }
            Cipher cipher0 = Cipher.getInstance(PjT.PjT);
            cipher0.init(1, secretKeySpec0);
            return Base64.encodeToString(cipher0.doFinal(s.getBytes("utf-8")), 0);
        }
        catch(Throwable unused_ex) {
        }
        return null;
    }

    public static String PjT(String s, String s1, String s2) {
        SecretKeySpec secretKeySpec0 = new SecretKeySpec(s2.getBytes(), "AES");
        try {
            Cipher cipher0 = Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher0.init(1, secretKeySpec0, new IvParameterSpec(s1.getBytes()));
            return Base64.encodeToString(cipher0.doFinal(s.getBytes("utf-8")), 0);
        }
        catch(Throwable throwable0) {
            throwable0.getMessage();
            return null;
        }
    }

    public static byte[] PjT(byte[] arr_b, int[] arr_v) {
        if(arr_b != null && arr_b.length != 0 && arr_v != null && arr_v.length != 0) {
            byte[] arr_b1 = new byte[arr_b.length];
            for(int v = 0; v < arr_b.length; ++v) {
                arr_b1[v] = (byte)(arr_b[v] ^ arr_v[v % arr_v.length]);
            }
            return arr_b1;
        }
        return arr_b;
    }

    @Deprecated
    public static String Zh(String s, String s1) {
        if(TextUtils.isEmpty(s)) {
            return null;
        }
        try {
            byte[] arr_b = Base64.decode(s, 0);
            SecretKeySpec secretKeySpec0 = new SecretKeySpec(s1.getBytes(), "AES");
            if(TextUtils.isEmpty(PjT.PjT)) {
                PjT.PjT = "AES/ECB/PKCS5Padding";
            }
            Cipher cipher0 = Cipher.getInstance(PjT.PjT);
            cipher0.init(2, secretKeySpec0);
            return new String(cipher0.doFinal(arr_b));
        }
        catch(Exception unused_ex) {
            return null;
        }
    }

    public static String Zh(String s, String s1, String s2) {
        if(TextUtils.isEmpty(s)) {
            return null;
        }
        try {
            byte[] arr_b = Base64.decode(s, 0);
            SecretKeySpec secretKeySpec0 = new SecretKeySpec(s2.getBytes(), "AES");
            Cipher cipher0 = Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher0.init(2, secretKeySpec0, new IvParameterSpec(s1.getBytes()));
            return new String(cipher0.doFinal(arr_b));
        }
        catch(Throwable throwable0) {
            throwable0.getMessage();
            return null;
        }
    }
}

