package org.mp4parser.tools;

import java.io.UnsupportedEncodingException;

public final class Utf8 {
    public static String convert(byte[] arr_b) {
        if(arr_b != null) {
            try {
                return new String(arr_b, "UTF-8");
            }
            catch(UnsupportedEncodingException unsupportedEncodingException0) {
                throw new Error(unsupportedEncodingException0);
            }
        }
        return null;
    }

    public static byte[] convert(String s) [...] // 潜在的解密器

    public static int utf8StringLengthInBytes(String s) {
        if(s != null) {
            try {
                return s.getBytes("UTF-8").length;
            }
            catch(UnsupportedEncodingException unused_ex) {
                throw new RuntimeException();
            }
        }
        return 0;
    }
}

