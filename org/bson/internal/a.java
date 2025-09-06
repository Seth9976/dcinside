package org.bson.internal;

public final class a {
    private static final int a = 3;
    private static final int b = 4;
    private static final int c = 0x3F;
    private static final byte d = 61;
    private static final byte[] e;
    private static final int[] f;

    static {
        a.e = new byte[]{65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 0x4F, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 0x6F, 0x70, 0x71, 0x72, 0x73, 0x74, 0x75, 0x76, 0x77, 120, 0x79, 0x7A, 0x30, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 0x2F};
        a.f = new int[0x80];
        for(int v = 0; true; ++v) {
            byte[] arr_b = a.e;
            if(v >= arr_b.length) {
                break;
            }
            a.f[arr_b[v]] = v;
        }
    }

    private static String a(byte[] arr_b) {
        return new String(arr_b, 0, 0, arr_b.length);
    }

    public static byte[] b(String s) {
        int v1;
        if(s.endsWith("==")) {
            v1 = 2;
        }
        else {
            v1 = s.endsWith("=") ? 1 : 0;
        }
        int v2 = s.length() * 3 / 4 - v1;
        byte[] arr_b = new byte[v2];
        int v3 = 0;
        for(int v = 0; v < s.length(); v += 4) {
            int[] arr_v = a.f;
            int v4 = arr_v[s.charAt(v)];
            int v5 = arr_v[s.charAt(v + 1)];
            arr_b[v3] = (byte)((v4 << 2 | v5 >> 4) & 0xFF);
            if(v3 + 1 >= v2) {
                return arr_b;
            }
            int v6 = arr_v[s.charAt(v + 2)];
            int v7 = v3 + 2;
            arr_b[v3 + 1] = (byte)((v5 << 4 | v6 >> 2) & 0xFF);
            if(v7 >= v2) {
                return arr_b;
            }
            v3 += 3;
            arr_b[v7] = (byte)((arr_v[s.charAt(v + 3)] | v6 << 6) & 0xFF);
        }
        return arr_b;
    }

    public static String c(byte[] arr_b) {
        byte[] arr_b1 = new byte[arr_b.length / 3 * 4 + (arr_b.length % 3 == 0 ? 0 : 4)];
        int v1 = 0;
        int v2 = 0;
        int v3 = 0;
        for(int v = 0; v < arr_b.length; ++v) {
            int v4 = arr_b[v];
            v1 = (v1 + 1) % 3;
            if(v4 < 0) {
                v4 += 0x100;
            }
            v3 = (v3 << 8) + v4;
            if(v1 == 0) {
                arr_b1[v2] = a.e[v3 >> 18 & 0x3F];
                arr_b1[v2 + 1] = a.e[v3 >> 12 & 0x3F];
                int v5 = v2 + 3;
                arr_b1[v2 + 2] = a.e[v3 >> 6 & 0x3F];
                v2 += 4;
                arr_b1[v5] = a.e[v3 & 0x3F];
            }
        }
        switch(v1) {
            case 1: {
                arr_b1[v2] = a.e[v3 >> 2 & 0x3F];
                arr_b1[v2 + 1] = a.e[v3 << 4 & 0x3F];
                arr_b1[v2 + 2] = 61;
                arr_b1[v2 + 3] = 61;
                return a.a(arr_b1);
            }
            case 2: {
                arr_b1[v2] = a.e[v3 >> 10 & 0x3F];
                arr_b1[v2 + 1] = a.e[v3 >> 4 & 0x3F];
                arr_b1[v2 + 2] = a.e[v3 << 2 & 0x3F];
                arr_b1[v2 + 3] = 61;
                return a.a(arr_b1);
            }
            default: {
                return a.a(arr_b1);
            }
        }
    }
}

