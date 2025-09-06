package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.zzv;

@Deprecated
public final class zzbcs {
    public static boolean zza(@Nullable zzbda zzbda0, @Nullable zzbcx zzbcx0, String[] arr_s) {
        if(zzbcx0 == null) {
            return false;
        }
        zzbda0.zze(zzbcx0, zzv.zzC().elapsedRealtime(), arr_s);
        return true;
    }
}

