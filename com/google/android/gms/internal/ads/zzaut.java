package com.google.android.gms.internal.ads;

final class zzaut implements Runnable {
    final zzauu zza;

    zzaut(zzauu zzauu0) {
        this.zza = zzauu0;
        super();
    }

    @Override
    public final void run() {
        boolean z1;
        boolean z;
        if(this.zza.zzb != null) {
            return;
        }
        synchronized(zzauu.zzc) {
            if(this.zza.zzb != null) {
                return;
            }
            try {
                z = false;
                z1 = false;
                z1 = ((Boolean)zzbcl.zzcF.zze()).booleanValue();
            }
            catch(IllegalStateException unused_ex) {
            }
            if(z1) {
                try {
                    zzauu.zza = zzfpk.zzb(this.zza.zze.zza, "ADSHIELD", null);
                label_15:
                    z = z1;
                }
                catch(Throwable unused_ex) {
                }
            }
            else {
                goto label_15;
            }
            this.zza.zzb = Boolean.valueOf(z);
            zzauu.zzc.open();
        }
    }
}

