package com.bykv.vk.openvk.preload.geckox.utils;

import java.io.InputStream;
import java.security.MessageDigest;

public final class d {
    private static char[] a;

    static {
        d.a = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    }

    private static String a(byte[] arr_b, int v) {
        if(arr_b == null) {
            throw new NullPointerException("bytes is null");
        }
        if(v > arr_b.length) {
            throw new IndexOutOfBoundsException();
        }
        char[] arr_c = new char[v << 1];
        int v2 = 0;
        for(int v1 = 0; v1 < v; ++v1) {
            int v3 = arr_b[v1];
            int v4 = v2 + 1;
            char[] arr_c1 = d.a;
            arr_c[v2] = arr_c1[(v3 & 0xFF) >> 4];
            v2 += 2;
            arr_c[v4] = arr_c1[v3 & 15];
        }
        return new String(arr_c, 0, v << 1);
    }

    public static void a(InputStream inputStream0, String s) throws Exception {
        String s1;
        MessageDigest messageDigest0;
        if(s == null) {
            throw new RuntimeException("md5 check failed: md5 == null");
        }
        try {
            messageDigest0 = MessageDigest.getInstance("MD5");
        }
        catch(Exception exception0) {
            throw new RuntimeException("md5 check failed:" + exception0.getMessage(), exception0);
        }
        try {
            byte[] arr_b = new byte[0x1000];
            int v1;
            while((v1 = inputStream0.read(arr_b, 0, 0x1000)) != -1) {
                messageDigest0.update(arr_b, 0, v1);
            }
        }
        catch(Exception exception1) {
            throw new RuntimeException("md5 check failed:" + exception1.getMessage(), exception1);
        }
        finally {
            CloseableUtils.close(inputStream0);
        }
        try {
            byte[] arr_b1 = messageDigest0.digest();
            s1 = d.a(arr_b1, arr_b1.length);
        }
        catch(Exception exception2) {
            throw new RuntimeException("md5 check failed:" + exception2.getMessage(), exception2);
        }
        if(!s.equals(s1)) {
            throw new RuntimeException("md5 check failed file: local md5:" + s1 + " expect md5:" + s);
        }
    }
}

