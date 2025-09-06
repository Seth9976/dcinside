package com.google.android.gms.internal.ads;

final class zzcau implements Runnable {
    final zzcaw zza;

    zzcau(zzcaw zzcaw0) {
        this.zza = zzcaw0;
        super();
    }

    @Override
    public final void run() {
        zzcaw zzcaw0 = this.zza;
        if(zzcaw0.zzq != null) {
            if(!zzcaw0.zzr) {
                zzcaw0.zzq.zzg();
                zzcaw.zzk(this.zza, true);
            }
            this.zza.zzq.zze();
        }
    }
}

