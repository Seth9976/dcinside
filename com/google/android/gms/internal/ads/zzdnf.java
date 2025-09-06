package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbe;

final class zzdnf implements zzgcd {
    final zzfbo zza;
    final zzfbr zzb;
    final zzcmk zzc;
    final zzdnl zzd;

    zzdnf(zzdnl zzdnl0, zzfbo zzfbo0, zzfbr zzfbr0, zzcmk zzcmk0) {
        this.zza = zzfbo0;
        this.zzb = zzfbr0;
        this.zzc = zzcmk0;
        this.zzd = zzdnl0;
        super();
    }

    @Override  // com.google.android.gms.internal.ads.zzgcd
    public final void zza(Throwable throwable0) {
    }

    @Override  // com.google.android.gms.internal.ads.zzgcd
    public final void zzb(Object object0) {
        ((zzcex)object0).zzW(this.zza, this.zzb);
        zzcgp zzcgp0 = ((zzcex)object0).zzN();
        if(((Boolean)zzbe.zzc().zza(zzbcl.zzjX)).booleanValue() && zzcgp0 != null) {
            zzcgp0.zzK(this.zzc, this.zzd.zzi, this.zzd.zzj);
            zzcgp0.zzM(this.zzc, this.zzd.zzi, this.zzd.zzd);
        }
        if(((Boolean)zzbe.zzc().zza(zzbcl.zzmQ)).booleanValue() && zzcgp0 != null) {
            zzcgp0.zzN(this.zza);
        }
    }
}

