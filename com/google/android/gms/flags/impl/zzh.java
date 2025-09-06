package com.google.android.gms.flags.impl;

import android.content.SharedPreferences;
import android.util.Log;
import com.google.android.gms.internal.flags.zze;

public final class zzh extends zza {
    public static String zza(SharedPreferences sharedPreferences0, String s, String s1) {
        try {
            return (String)zze.zza(new zzi(sharedPreferences0, s, s1));
        }
        catch(Exception exception0) {
            String s2 = exception0.getMessage();
            Log.w("FlagDataUtils", (s2.length() == 0 ? new String("Flag value not available, returning default: ") : "Flag value not available, returning default: " + s2));
            return s1;
        }
    }
}

