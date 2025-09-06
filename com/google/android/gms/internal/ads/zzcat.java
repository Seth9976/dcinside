package com.google.android.gms.internal.ads;

final class zzcat implements Runnable {
    final zzcaw zza;

    zzcat(zzcaw zzcaw0) {
        this.zza = zzcaw0;
        super();
    }

    @Override
    public final void run() {
        zzcaw zzcaw0 = this.zza;
        if(zzcaw0.zzq != null) {
            zzcaw0.zzq.zzd();
            this.zza.zzq.zzi();
        }
    }
}

