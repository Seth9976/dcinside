package com.google.android.gms.internal.ads;

import android.app.AppOpsManager.OnOpActiveChangedListener;

final class zzawl implements AppOpsManager.OnOpActiveChangedListener {
    final zzawm zza;

    zzawl(zzawm zzawm0) {
        this.zza = zzawm0;
        super();
    }

    @Override  // android.app.AppOpsManager$OnOpActiveChangedListener
    public final void onOpActiveChanged(String s, int v, String s1, boolean z) {
        if(z) {
            this.zza.zzb = System.currentTimeMillis();
            this.zza.zze = true;
            return;
        }
        long v1 = System.currentTimeMillis();
        if(this.zza.zzc > 0L) {
            zzawm zzawm0 = this.zza;
            if(v1 >= zzawm0.zzc) {
                zzawm0.zzd = v1 - zzawm0.zzc;
            }
        }
        this.zza.zze = false;
    }
}

