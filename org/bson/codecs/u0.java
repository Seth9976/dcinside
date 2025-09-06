package org.bson.codecs;

final class u0 {
    public static void a(byte[] arr_b, int v, int v1) {
        for(int v2 = v1 + v - 1; v < v2; --v2) {
            byte b = arr_b[v];
            arr_b[v] = arr_b[v2];
            arr_b[v2] = b;
            ++v;
        }
    }
}

