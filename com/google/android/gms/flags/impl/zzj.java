package com.google.android.gms.flags.impl;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.internal.flags.zze;

public final class zzj {
    private static SharedPreferences zzw;

    static {
    }

    public static SharedPreferences zza(Context context0) throws Exception {
        synchronized(SharedPreferences.class) {
            if(zzj.zzw == null) {
                zzj.zzw = (SharedPreferences)zze.zza(new zzk(context0));
            }
            return zzj.zzw;
        }
    }
}

