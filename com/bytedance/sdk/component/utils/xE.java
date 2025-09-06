package com.bytedance.sdk.component.utils;

import java.security.MessageDigest;

public class xE {
    private static final char[] PjT;

    static {
        xE.PjT = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    }

    public static String PjT(String s) {
        if(s != null) {
            try {
                if(s.length() != 0) {
                    MessageDigest messageDigest0 = MessageDigest.getInstance("MD5");
                    messageDigest0.update(s.getBytes("UTF-8"));
                    return xE.PjT(messageDigest0.digest());
                }
                return null;
            }
            catch(Exception unused_ex) {
            }
        }
        return null;
    }

    public static String PjT(byte[] arr_b) {
        if(arr_b == null) {
            throw new NullPointerException("bytes is null");
        }
        return xE.PjT(arr_b, 0, arr_b.length);
    }

    public static String PjT(byte[] arr_b, int v, int v1) {
        if(arr_b == null) {
            throw new NullPointerException("bytes is null");
        }
        if(v < 0 || v + v1 > arr_b.length) {
            throw new IndexOutOfBoundsException();
        }
        char[] arr_c = new char[v1 * 2];
        int v3 = 0;
        for(int v2 = 0; v2 < v1; ++v2) {
            int v4 = arr_b[v2 + v];
            int v5 = v3 + 1;
            arr_c[v3] = xE.PjT[(v4 & 0xFF) >> 4];
            v3 += 2;
            arr_c[v5] = xE.PjT[v4 & 15];
        }
        return new String(arr_c, 0, v1 * 2);
    }
}

