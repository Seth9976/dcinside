package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.zzv;

final class zzdhy implements zzgcd {
    final String zza;
    final zzdia zzb;

    zzdhy(zzdia zzdia0, String s, boolean z) {
        this.zza = "Google";
        this.zzb = zzdia0;
        super();
    }

    @Override  // com.google.android.gms.internal.ads.zzgcd
    public final void zza(Throwable throwable0) {
        if(((Boolean)zzbe.zzc().zza(zzbcl.zzfm)).booleanValue()) {
            zzv.zzp().zzv(throwable0, "omid native display exp");
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzgcd
    public final void zzb(Object object0) {
        this.zzb.zze.zzT(((zzcex)object0));
        zzcab zzcab0 = this.zzb.zze.zzp();
        zzecr zzecr0 = this.zzb.zzf(this.zza, true);
        if(zzecr0 != null && zzcab0 != null) {
            zzcab0.zzc(zzecr0);
            return;
        }
        if(zzcab0 != null) {
            zzcab0.cancel(false);
        }
    }
}

