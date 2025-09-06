package com.google.android.gms.flags.impl;

import android.content.SharedPreferences;
import android.util.Log;
import com.google.android.gms.internal.flags.zze;

public final class zzb extends zza {
    public static Boolean zza(SharedPreferences sharedPreferences0, String s, Boolean boolean0) {
        try {
            return (Boolean)zze.zza(new zzc(sharedPreferences0, s, boolean0));
        }
        catch(Exception exception0) {
            String s1 = exception0.getMessage();
            Log.w("FlagDataUtils", (s1.length() == 0 ? new String("Flag value not available, returning default: ") : "Flag value not available, returning default: " + s1));
            return boolean0;
        }
    }
}

