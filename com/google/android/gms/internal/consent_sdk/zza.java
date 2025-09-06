package com.google.android.gms.internal.consent_sdk;

import android.app.Application;
import android.content.Context;
import androidx.annotation.GuardedBy;

public abstract class zza {
    @GuardedBy("AppComponent.class")
    private static zza zza;

    public static zza zza(Context context0) {
        synchronized(zza.class) {
            if(zza.zza == null) {
                zzai zzai0 = new zzai(null);
                zzai0.zzb(((Application)context0.getApplicationContext()));
                zza.zza = zzai0.zza();
            }
            return zza.zza;
        }
    }

    public abstract zzj zzb();

    public abstract zzbn zzc();
}

