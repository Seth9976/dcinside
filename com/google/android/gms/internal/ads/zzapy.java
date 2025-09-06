package com.google.android.gms.internal.ads;

import android.util.Log;
import java.util.Locale;

public final class zzapy {
    public static final String zza = "Volley";
    public static final boolean zzb;
    private static final String zzc;

    static {
        zzapy.zzb = Log.isLoggable("Volley", 2);
        zzapy.zzc = "com.google.android.gms.internal.ads.zzapy";
    }

    public static void zza(String s, Object[] arr_object) {
        Log.d("Volley", zzapy.zze(s, arr_object));
    }

    public static void zzb(String s, Object[] arr_object) {
        Log.e("Volley", zzapy.zze(s, arr_object));
    }

    public static void zzc(Throwable throwable0, String s, Object[] arr_object) {
        Log.e("Volley", zzapy.zze(s, arr_object), throwable0);
    }

    public static void zzd(String s, Object[] arr_object) {
        if(zzapy.zzb) {
            Log.v("Volley", zzapy.zze(s, arr_object));
        }
    }

    private static String zze(String s, Object[] arr_object) {
        String s1 = String.format(Locale.US, s, arr_object);
        StackTraceElement[] arr_stackTraceElement = new Throwable().fillInStackTrace().getStackTrace();
        for(int v = 2; v < arr_stackTraceElement.length; ++v) {
            if(!arr_stackTraceElement[v].getClassName().equals(zzapy.zzc)) {
                String s2 = arr_stackTraceElement[v].getClassName();
                String s3 = s2.substring(s2.lastIndexOf(46) + 1);
                String s4 = s3.substring(s3.lastIndexOf(36) + 1) + "." + arr_stackTraceElement[v].getMethodName();
                return String.format(Locale.US, "[%d] %s: %s", Thread.currentThread().getId(), s4, s1);
            }
        }
        return String.format(Locale.US, "[%d] %s: %s", Thread.currentThread().getId(), "<unknown>", s1);
    }
}

