package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zze;

final class zzbnh implements zzcaf {
    final zzbnr zza;
    final zzfgw zzb;
    final zzbns zzc;

    zzbnh(zzbns zzbns0, zzbnr zzbnr0, zzfgw zzfgw0) {
        this.zza = zzbnr0;
        this.zzb = zzfgw0;
        this.zzc = zzbns0;
        super();
    }

    @Override  // com.google.android.gms.internal.ads.zzcaf
    public final void zza(Object object0) {
        zzbmn zzbmn0 = (zzbmn)object0;
        zze.zza("loadNewJavascriptEngine (success): Trying to acquire lock");
        synchronized(this.zzc.zza) {
            zze.zza("loadNewJavascriptEngine (success): Lock acquired");
            this.zzc.zzi = 0;
            if(this.zzc.zzh != null && this.zza != this.zzc.zzh) {
                zze.zza("New JS engine is loaded, marking previous one as destroyable.");
                this.zzc.zzh.zzb();
            }
            this.zzc.zzh = this.zza;
            if(((Boolean)zzbee.zzd.zze()).booleanValue()) {
                zzbns zzbns0 = this.zzc;
                if(zzbns0.zze != null) {
                    this.zzb.zzg(true);
                    zzbns0.zze.zzb(this.zzb.zzm());
                }
            }
        }
        zze.zza("loadNewJavascriptEngine (success): Lock released");
    }
}

