package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;

public final class zzbbv {
    public static int zza(Context context0) {
        return zzbbv.zzf(context0, "crash_without_write");
    }

    public static int zzb(Context context0) {
        return zzbbv.zzf(context0, "init_without_write");
    }

    public static void zzc(Context context0) {
        zzbbv.zzg(context0, "crash_without_write");
    }

    public static void zzd(Context context0) {
        zzbbv.zzg(context0, "init_without_write");
    }

    public static void zze(Context context0) {
        SharedPreferences sharedPreferences0 = context0.getSharedPreferences("admob", 0);
        if(sharedPreferences0 == null) {
            return;
        }
        sharedPreferences0.edit().putInt("init_without_write", 0).putInt("crash_without_write", 0).commit();
    }

    private static int zzf(Context context0, String s) {
        SharedPreferences sharedPreferences0 = context0.getSharedPreferences("admob", 0);
        if(sharedPreferences0 == null) {
            return 0;
        }
        try {
            return sharedPreferences0.getInt(s, 0);
        }
        catch(ClassCastException unused_ex) {
            return 0;
        }
    }

    private static void zzg(Context context0, String s) {
        SharedPreferences sharedPreferences0 = context0.getSharedPreferences("admob", 0);
        if(sharedPreferences0 == null) {
            return;
        }
        int v = zzbbv.zzf(context0, s);
        sharedPreferences0.edit().putInt(s, v + 1).commit();
    }
}

