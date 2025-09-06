package com.google.android.gms.flags.impl;

import android.content.SharedPreferences;
import android.util.Log;
import com.google.android.gms.internal.flags.zze;

public final class zzf extends zza {
    public static Long zza(SharedPreferences sharedPreferences0, String s, Long long0) {
        try {
            return (Long)zze.zza(new zzg(sharedPreferences0, s, long0));
        }
        catch(Exception exception0) {
            String s1 = exception0.getMessage();
            Log.w("FlagDataUtils", (s1.length() == 0 ? new String("Flag value not available, returning default: ") : "Flag value not available, returning default: " + s1));
            return long0;
        }
    }
}

