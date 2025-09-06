package com.google.android.gms.flags.impl;

import android.content.SharedPreferences;
import android.util.Log;
import com.google.android.gms.internal.flags.zze;

public final class zzd extends zza {
    public static Integer zza(SharedPreferences sharedPreferences0, String s, Integer integer0) {
        try {
            return (Integer)zze.zza(new com.google.android.gms.flags.impl.zze(sharedPreferences0, s, integer0));
        }
        catch(Exception exception0) {
            String s1 = exception0.getMessage();
            Log.w("FlagDataUtils", (s1.length() == 0 ? new String("Flag value not available, returning default: ") : "Flag value not available, returning default: " + s1));
            return integer0;
        }
    }
}

