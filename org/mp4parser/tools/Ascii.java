package org.mp4parser.tools;

import java.io.UnsupportedEncodingException;

public final class Ascii {
    public static String convert(byte[] arr_b) {
        if(arr_b != null) {
            try {
                return new String(arr_b, "us-ascii");
            }
            catch(UnsupportedEncodingException unsupportedEncodingException0) {
                throw new Error(unsupportedEncodingException0);
            }
        }
        return null;
    }

    public static byte[] convert(String s) {
        if(s != null) {
            try {
                return s.getBytes("us-ascii");
            }
            catch(UnsupportedEncodingException unsupportedEncodingException0) {
                throw new Error(unsupportedEncodingException0);
            }
        }
        return null;
    }
}

