package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.common.base.H;

public final class zzcu {
    private static final ThreadLocal zza;

    static {
        zzcu.zza = new zzct();
    }

    public static SharedPreferences zza(Context context0, String s, int v, zzcm zzcm0) {
        SharedPreferences sharedPreferences1;
        SharedPreferences sharedPreferences0 = zzcf.zza().zza(s, zzcm0, zzcj.zzc).equals("") ? new zzcp() : null;
        if(sharedPreferences0 != null) {
            return sharedPreferences0;
        }
        ThreadLocal threadLocal0 = zzcu.zza;
        H.d(((Boolean)threadLocal0.get()).booleanValue());
        threadLocal0.set(Boolean.FALSE);
        try {
            sharedPreferences1 = context0.getSharedPreferences(s, 0);
        }
        catch(Throwable throwable0) {
            zzcu.zza.set(Boolean.TRUE);
            throw throwable0;
        }
        threadLocal0.set(Boolean.TRUE);
        return sharedPreferences1;
    }
}

