package com.google.android.gms.internal.ads;

final class zzcas implements Runnable {
    final int zza;
    final int zzb;
    final zzcaw zzc;

    zzcas(zzcaw zzcaw0, int v, int v1) {
        this.zza = v;
        this.zzb = v1;
        this.zzc = zzcaw0;
        super();
    }

    @Override
    public final void run() {
        zzcaw zzcaw0 = this.zzc;
        if(zzcaw0.zzq != null) {
            zzcaw0.zzq.zzj(this.zza, this.zzb);
        }
    }
}

