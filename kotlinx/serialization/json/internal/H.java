package kotlinx.serialization.json.internal;

import kotlin.x0;

public final class h {
    public static String a(long v, int v1) {
        int v2 = Long.compare(v, 0L);
        if(v2 == 0) {
            return "0";
        }
        if(v2 > 0) {
            return Long.toString(v, v1);
        }
        if(v1 < 2 || v1 > 36) {
            v1 = 10;
        }
        int v3 = 0x40;
        char[] arr_c = new char[0x40];
        if((v1 & v1 - 1) == 0) {
            int v4 = Integer.numberOfTrailingZeros(v1);
            do {
                --v3;
                arr_c[v3] = Character.forDigit(((int)v) & v1 - 1, v1);
                v >>>= v4;
            }
            while(v != 0L);
            return new String(arr_c, v3, 0x40 - v3);
        }
        long v5 = (v1 & 1) == 0 ? (v >>> 1) / ((long)(v1 >>> 1)) : x0.a(v, v1);
        arr_c[0x3F] = Character.forDigit(((int)(v - v5 * ((long)v1))), v1);
        v3 = 0x3F;
        while(v5 > 0L) {
            --v3;
            arr_c[v3] = Character.forDigit(((int)(v5 % ((long)v1))), v1);
            v5 /= (long)v1;
        }
        return new String(arr_c, v3, 0x40 - v3);
    }
}

