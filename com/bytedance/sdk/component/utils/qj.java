package com.bytedance.sdk.component.utils;

import java.io.UnsupportedEncodingException;

public class qj {
    private static final byte[] PjT;

    static {
        qj.PjT = new byte[]{86, 80, 56, 88};
    }

    public static boolean PjT(byte[] arr_b, int v) {
        try {
            boolean z = qj.PjT(arr_b, v + 12, qj.PjT);
            if(arr_b.length <= v + 20) {
                return false;
            }
            if((arr_b[v + 20] & 2) == 2) {
                return z;
            }
        }
        catch(Throwable unused_ex) {
        }
        return false;
    }

    private static boolean PjT(byte[] arr_b, int v, byte[] arr_b1) {
        if(arr_b1 == null || arr_b == null || arr_b1.length + v > arr_b.length) {
            return false;
        }
        for(int v1 = 0; v1 < arr_b1.length; ++v1) {
            if(arr_b[v1 + v] != arr_b1[v1]) {
                return false;
            }
        }
        return true;
    }

    private static byte[] PjT(String s) {
        try {
            return s.getBytes("ASCII");
        }
        catch(UnsupportedEncodingException unused_ex) {
            return new byte[1];
        }
    }
}

