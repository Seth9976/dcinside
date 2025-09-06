package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zze;

final class zzbni implements zzcad {
    final zzbnr zza;
    final zzfgw zzb;
    final zzbns zzc;

    zzbni(zzbns zzbns0, zzbnr zzbnr0, zzfgw zzfgw0) {
        this.zza = zzbnr0;
        this.zzb = zzfgw0;
        this.zzc = zzbns0;
        super();
    }

    @Override  // com.google.android.gms.internal.ads.zzcad
    public final void zza() {
        zze.zza("loadNewJavascriptEngine (failure): Trying to acquire lock");
        synchronized(this.zzc.zza) {
            zze.zza("loadNewJavascriptEngine (failure): Lock acquired");
            this.zzc.zzi = 1;
            zze.zza("Failed loading new engine. Marking new engine destroyable.");
            this.zza.zzb();
            if(((Boolean)zzbee.zzd.zze()).booleanValue()) {
                zzbns zzbns0 = this.zzc;
                if(zzbns0.zze != null) {
                    this.zzb.zzc("Failed loading new engine");
                    this.zzb.zzg(false);
                    zzbns0.zze.zzb(this.zzb.zzm());
                }
            }
        }
        zze.zza("loadNewJavascriptEngine (failure): Lock released");
    }
}

