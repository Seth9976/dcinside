package org.bson.internal;

import java.util.UUID;
import org.bson.T;
import org.bson.h;
import org.bson.q;
import org.bson.r0;

public final class k {
    static class a {
        static final int[] a;

        static {
            int[] arr_v = new int[r0.values().length];
            a.a = arr_v;
            try {
                arr_v[r0.c.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[r0.d.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[r0.e.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[r0.b.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
        }
    }

    public static UUID a(byte[] arr_b, byte b, r0 r00) {
        if(arr_b.length != 16) {
            throw new T(String.format("Expected length to be 16, not %d.", ((int)arr_b.length)));
        }
        if(b == q.e.a()) {
            switch(r00) {
                case 1: {
                    k.d(arr_b, 0, 4);
                    k.d(arr_b, 4, 2);
                    k.d(arr_b, 6, 2);
                    break;
                }
                case 2: {
                    k.d(arr_b, 0, 8);
                    k.d(arr_b, 8, 8);
                    return new UUID(k.c(arr_b, 0), k.c(arr_b, 8));
                }
                case 3: {
                    break;
                }
                case 4: {
                    throw new h("Can not decode a subtype 3 (UUID legacy) BSON binary when the decoder is configured to use the standard UUID representation");
                }
                default: {
                    throw new h("Unexpected UUID representation: " + r00);
                }
            }
        }
        return new UUID(k.c(arr_b, 0), k.c(arr_b, 8));
    }

    public static byte[] b(UUID uUID0, r0 r00) {
        byte[] arr_b = new byte[16];
        k.e(arr_b, 0, uUID0.getMostSignificantBits());
        k.e(arr_b, 8, uUID0.getLeastSignificantBits());
        int v = a.a[r00.ordinal()];
        switch(v) {
            case 1: {
                k.d(arr_b, 0, 4);
                k.d(arr_b, 4, 2);
                k.d(arr_b, 6, 2);
                break;
            }
            case 2: {
                k.d(arr_b, 0, 8);
                k.d(arr_b, 8, 8);
                return arr_b;
            label_9:
                if(v != 3 && v != 4) {
                    throw new h("Unexpected UUID representation: " + r00);
                }
                break;
            }
            default: {
                goto label_9;
            }
        }
        return arr_b;
    }

    private static long c(byte[] arr_b, int v) {
        return (((long)arr_b[v]) & 0xFFL) << 56 | (((long)arr_b[v + 7]) & 0xFFL | (((long)arr_b[v + 6]) & 0xFFL) << 8 | (((long)arr_b[v + 5]) & 0xFFL) << 16 | (((long)arr_b[v + 4]) & 0xFFL) << 24 | (((long)arr_b[v + 3]) & 0xFFL) << 0x20 | (((long)arr_b[v + 2]) & 0xFFL) << 40 | (((long)arr_b[v + 1]) & 0xFFL) << 0x30);
    }

    private static void d(byte[] arr_b, int v, int v1) {
        for(int v2 = v1 + v - 1; v < v2; --v2) {
            byte b = arr_b[v];
            arr_b[v] = arr_b[v2];
            arr_b[v2] = b;
            ++v;
        }
    }

    private static void e(byte[] arr_b, int v, long v1) {
        arr_b[v + 7] = (byte)(((int)(v1 & 0xFFL)));
        arr_b[v + 6] = (byte)(((int)(v1 >> 8 & 0xFFL)));
        arr_b[v + 5] = (byte)(((int)(v1 >> 16 & 0xFFL)));
        arr_b[v + 4] = (byte)(((int)(v1 >> 24 & 0xFFL)));
        arr_b[v + 3] = (byte)(((int)(v1 >> 0x20 & 0xFFL)));
        arr_b[v + 2] = (byte)(((int)(v1 >> 40 & 0xFFL)));
        arr_b[v + 1] = (byte)(((int)(v1 >> 0x30 & 0xFFL)));
        arr_b[v] = (byte)(((int)(v1 >> 56 & 0xFFL)));
    }
}

