package com.google.android.gms.internal.ads;

import android.os.Looper;
import android.util.DisplayMetrics;

public final class zzawg {
    public static final int zza;
    private static final char[] zzb;

    static {
        zzawg.zzb = "0123456789abcdef".toCharArray();
    }

    public static long zza(double f, int v, DisplayMetrics displayMetrics0) {
        return Math.round(f / ((double)displayMetrics0.density));
    }

    public static String zzb(byte[] arr_b) {
        char[] arr_c = new char[arr_b.length + arr_b.length];
        for(int v = 0; v < arr_b.length; ++v) {
            int v1 = arr_b[v];
            int v2 = v + v;
            arr_c[v2] = zzawg.zzb[(v1 & 0xFF) >>> 4];
            arr_c[v2 + 1] = zzawg.zzb[v1 & 15];
        }
        return new String(arr_c);
    }

    public static boolean zzc() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    public static boolean zzd(String s) [...] // 潜在的解密器

    public static boolean zze(DisplayMetrics displayMetrics0) {
        return displayMetrics0 != null && displayMetrics0.density != 0.0f;
    }

    public static byte[] zzf(String s) {
        int v = s.length();
        if(v % 2 != 0) {
            throw new IllegalArgumentException("String must be of even-length");
        }
        byte[] arr_b = new byte[v / 2];
        for(int v1 = 0; v1 < v; v1 += 2) {
            arr_b[v1 / 2] = (byte)((Character.digit(s.charAt(v1), 16) << 4) + Character.digit(s.charAt(v1 + 1), 16));
        }
        return arr_b;
    }
}

