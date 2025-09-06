package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

public final class zzaxn extends zzaxr {
    public zzaxn(zzawd zzawd0, String s, String s1, zzasc zzasc0, int v, int v1) {
        super(zzawd0, "rKSUjmRV/NKsFlHbU0cho8FUC8WVx3Rlxhld5Ju7IE8ltyxUVL0g87xJ7LkJDCm6", "KIfx7EUeWhnA+aC9P4Mk2uzmdiZwzAWUKm+DIiGxj24=", zzasc0, v, 0x30);
    }

    @Override  // com.google.android.gms.internal.ads.zzaxr
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        this.zzd.zzag(3);
        boolean z = ((Boolean)this.zze.invoke(null, this.zza.zzb())).booleanValue();
        synchronized(this.zzd) {
            if(z) {
                this.zzd.zzag(2);
            }
            else {
                this.zzd.zzag(1);
            }
        }
    }
}

