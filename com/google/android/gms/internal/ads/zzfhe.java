package com.google.android.gms.internal.ads;

final class zzfhe implements zzgcd {
    final zzfhh zza;
    final zzfgw zzb;
    final boolean zzc;

    zzfhe(zzfhh zzfhh0, zzfgw zzfgw0, boolean z) {
        this.zza = zzfhh0;
        this.zzb = zzfgw0;
        this.zzc = z;
        super();
    }

    @Override  // com.google.android.gms.internal.ads.zzgcd
    public final void zza(Throwable throwable0) {
        zzfgw zzfgw0 = this.zzb;
        if(zzfgw0.zzk()) {
            zzfgw0.zzh(throwable0);
            zzfgw0.zzg(false);
            this.zza.zza(zzfgw0);
            if(this.zzc) {
                this.zza.zzh();
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzgcd
    public final void zzb(Object object0) {
        this.zzb.zzg(true);
        this.zza.zza(this.zzb);
        if(this.zzc) {
            this.zza.zzh();
        }
    }
}

