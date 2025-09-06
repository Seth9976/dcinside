package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.zzv;

final class zzcmj implements zzgcd {
    final zzfja zza;
    final String zzb;
    final zzv zzc;
    final zzcmk zzd;

    zzcmj(zzcmk zzcmk0, zzfja zzfja0, String s, zzv zzv0) {
        this.zza = zzfja0;
        this.zzb = s;
        this.zzc = zzv0;
        this.zzd = zzcmk0;
        super();
    }

    @Override  // com.google.android.gms.internal.ads.zzgcd
    public final void zza(Throwable throwable0) {
        this.zzd.zzg.zza(new zzcmh(this, throwable0, this.zza, this.zzb, this.zzc));
    }

    @Override  // com.google.android.gms.internal.ads.zzgcd
    public final void zzb(Object object0) {
        this.zzd.zzg.zza(new zzcmi(this.zza, ((String)object0), this.zzc));
    }
}

