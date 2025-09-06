package org.mp4parser.tools;

import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;

public class Hex {
    private static final char[] DIGITS;

    static {
        Hex.DIGITS = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    }

    public static byte[] decodeHex(String s) {
        ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
        for(int v = 0; v < s.length(); v += 2) {
            byteArrayOutputStream0.write(Integer.parseInt(s.substring(v, v + 2), 16));
        }
        return byteArrayOutputStream0.toByteArray();
    }

    public static String encodeHex(ByteBuffer byteBuffer0) {
        ByteBuffer byteBuffer1 = byteBuffer0.duplicate();
        StringBuilder stringBuilder0 = new StringBuilder();
        while(byteBuffer1.remaining() > 0) {
            int v = byteBuffer1.get();
            stringBuilder0.append(Hex.DIGITS[(v & 0xF0) >>> 4]);
            stringBuilder0.append(Hex.DIGITS[v & 15]);
        }
        return stringBuilder0.toString();
    }

    public static String encodeHex(byte[] arr_b) {
        return Hex.encodeHex(arr_b, 0);
    }

    public static String encodeHex(byte[] arr_b, int v) {
        char[] arr_c = new char[(arr_b.length << 1) + (v <= 0 ? 0 : arr_b.length / v)];
        int v2 = 0;
        for(int v1 = 0; v1 < arr_b.length; ++v1) {
            if(v > 0 && v1 % v == 0 && v2 > 0) {
                arr_c[v2] = '-';
                ++v2;
            }
            int v3 = v2 + 1;
            int v4 = arr_b[v1];
            arr_c[v2] = Hex.DIGITS[(v4 & 0xF0) >>> 4];
            v2 += 2;
            arr_c[v3] = Hex.DIGITS[v4 & 15];
        }
        return new String(arr_c);
    }
}

