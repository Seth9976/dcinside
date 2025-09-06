package com.bykv.vk.openvk.PjT.PjT.PjT.XX;

import android.text.TextUtils;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class c {
    private static final MessageDigest a;
    private static final char[] b;

    static {
        c.a = c.c();
        c.b = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    }

    public static String a(String s) {
        byte[] arr_b1;
        MessageDigest messageDigest0 = c.a;
        if(messageDigest0 != null && !TextUtils.isEmpty(s)) {
            byte[] arr_b = s.getBytes(Charset.forName("UTF-8"));
            synchronized(c.class) {
                arr_b1 = messageDigest0.digest(arr_b);
            }
            return c.b(arr_b1);
        }
        return "";
    }

    public static String b(byte[] arr_b) {
        if(arr_b != null && arr_b.length != 0) {
            char[] arr_c = new char[arr_b.length << 1];
            int v1 = 0;
            for(int v = 0; v < arr_b.length; ++v) {
                int v2 = arr_b[v];
                int v3 = v1 + 1;
                arr_c[v1] = c.b[(v2 & 0xF0) >> 4];
                v1 += 2;
                arr_c[v3] = c.b[v2 & 15];
            }
            return new String(arr_c);
        }
        return null;
    }

    private static MessageDigest c() {
        try {
            return MessageDigest.getInstance("md5");
        }
        catch(NoSuchAlgorithmException unused_ex) {
            return null;
        }
    }
}

