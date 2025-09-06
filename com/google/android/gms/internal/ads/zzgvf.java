package com.google.android.gms.internal.ads;

public final class zzgvf {
    public static byte[] zza(String s) {
        if(s.length() % 2 != 0) {
            throw new IllegalArgumentException("Expected a string of even length");
        }
        int v = s.length();
        byte[] arr_b = new byte[v / 2];
        for(int v1 = 0; v1 < v / 2; ++v1) {
            int v2 = v1 + v1;
            int v3 = Character.digit(s.charAt(v2), 16);
            int v4 = Character.digit(s.charAt(v2 + 1), 16);
            if(v3 == -1 || v4 == -1) {
                throw new IllegalArgumentException("input is not hexadecimal");
            }
            arr_b[v1] = (byte)(v3 * 16 + v4);
        }
        return arr_b;
    }
}

