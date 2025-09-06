package com.google.android.gms.internal.ads;

import android.view.View;
import com.google.android.gms.ads.internal.zzg;

final class zzeit implements zzg {
    final zzcab zza;
    final zzfca zzb;
    final zzfbo zzc;
    final zzeiz zzd;
    final zzeiu zze;

    zzeit(zzeiu zzeiu0, zzcab zzcab0, zzfca zzfca0, zzfbo zzfbo0, zzeiz zzeiz0) {
        this.zza = zzcab0;
        this.zzb = zzfca0;
        this.zzc = zzfbo0;
        this.zzd = zzeiz0;
        this.zze = zzeiu0;
        super();
    }

    @Override  // com.google.android.gms.ads.internal.zzg
    public final void zza(View view0) {
        Object object0 = this.zze.zzd.zza(this.zzb, this.zzc, view0, this.zzd);
        this.zza.zzc(object0);
    }

    @Override  // com.google.android.gms.ads.internal.zzg
    public final void zzb() {
    }

    @Override  // com.google.android.gms.ads.internal.zzg
    public final void zzc() {
    }
}

