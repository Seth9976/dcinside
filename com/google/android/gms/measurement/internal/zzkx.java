package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zznm;

final class zzkx implements Runnable {
    private final zzje zza;
    private final long zzb;
    private final long zzc;
    private final boolean zzd;
    private final zzje zze;
    private final zzjq zzf;

    zzkx(zzjq zzjq0, zzje zzje0, long v, long v1, boolean z, zzje zzje1) {
        this.zza = zzje0;
        this.zzb = v;
        this.zzc = v1;
        this.zzd = z;
        this.zze = zzje1;
        this.zzf = zzjq0;
        super();
    }

    @Override
    public final void run() {
        this.zzf.zza(this.zza);
        if(!zznm.zza() || !this.zzf.zze().zza(zzbh.zzcx)) {
            this.zzf.zza(this.zzb, false);
        }
        zzjq.zza(this.zzf, this.zza, this.zzc, true, this.zzd);
        zzjq.zza(this.zzf, this.zza, this.zze);
    }
}

