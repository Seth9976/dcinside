package com.google.android.gms.internal.ads;

public final class zzalx {
    public static float zza(String s) throws NumberFormatException {
        if(!s.endsWith("%")) {
            throw new NumberFormatException("Percentages must end with %");
        }
        return Float.parseFloat(s.substring(0, s.length() - 1)) / 100.0f;
    }

    public static long zzb(String s) throws NumberFormatException {
        String[] arr_s = s.split("\\.", 2);
        String[] arr_s1 = arr_s[0].split(":", -1);
        long v1 = 0L;
        for(int v = 0; v < arr_s1.length; ++v) {
            v1 = v1 * 60L + Long.parseLong(arr_s1[v]);
        }
        return (arr_s.length == 2 ? v1 * 1000L + Long.parseLong(arr_s[1]) : v1 * 1000L) * 1000L;
    }
}

