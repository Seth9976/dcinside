package com.google.android.gms.internal.ads;

import android.view.View;
import com.google.android.gms.ads.internal.zzg;

final class zzejc implements zzg {
    final zzder zza;

    zzejc(zzejd zzejd0, zzder zzder0) {
        this.zza = zzder0;
        super();
    }

    @Override  // com.google.android.gms.ads.internal.zzg
    public final void zza(View view0) {
    }

    @Override  // com.google.android.gms.ads.internal.zzg
    public final void zzb() {
        this.zza.zzb().onAdClicked();
    }

    @Override  // com.google.android.gms.ads.internal.zzg
    public final void zzc() {
        this.zza.zzc().zza();
        this.zza.zzf().zza();
    }
}

