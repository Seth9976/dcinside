package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zzbw;
import com.google.android.gms.ads.internal.zzv;

final class zzbjd implements zzgcd {
    final zzcex zza;

    zzbjd(zzcex zzcex0) {
        this.zza = zzcex0;
        super();
    }

    @Override  // com.google.android.gms.internal.ads.zzgcd
    public final void zza(Throwable throwable0) {
        zzv.zzp().zzw(throwable0, "DefaultGmsgHandlers.attributionReportingManager");
    }

    @Override  // com.google.android.gms.internal.ads.zzgcd
    public final void zzb(Object object0) {
        com.google.android.gms.ads.internal.util.client.zzv zzv0 = this.zza.zzD() == null ? null : this.zza.zzD().zzax;
        new zzbw(this.zza.getContext(), this.zza.zzn().afmaVersion, ((String)object0), null, zzv0).zzb();
    }
}

