package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import o3.j;

public final class zzdnx implements zzbkg {
    private final zzcxa zza;
    @Nullable
    private final zzbwi zzb;
    private final String zzc;
    private final String zzd;

    public zzdnx(zzcxa zzcxa0, zzfbo zzfbo0) {
        this.zza = zzcxa0;
        this.zzb = zzfbo0.zzl;
        this.zzc = zzfbo0.zzj;
        this.zzd = zzfbo0.zzk;
    }

    @Override  // com.google.android.gms.internal.ads.zzbkg
    @j
    public final void zza(zzbwi zzbwi0) {
        int v;
        String s;
        zzbwi zzbwi1 = this.zzb;
        if(zzbwi1 != null) {
            zzbwi0 = zzbwi1;
        }
        if(zzbwi0 == null) {
            v = 1;
            s = "";
        }
        else {
            s = zzbwi0.zza;
            v = zzbwi0.zzb;
        }
        zzbvt zzbvt0 = new zzbvt(s, v);
        this.zza.zzd(zzbvt0, this.zzc, this.zzd);
    }

    @Override  // com.google.android.gms.internal.ads.zzbkg
    public final void zzb() {
        this.zza.zze();
    }

    @Override  // com.google.android.gms.internal.ads.zzbkg
    public final void zzc() {
        this.zza.zzf();
    }
}

