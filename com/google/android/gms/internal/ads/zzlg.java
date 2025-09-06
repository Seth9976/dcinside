package com.google.android.gms.internal.ads;

final class zzlg extends zztu {
    private final zzbp zzc;

    zzlg(zzlh zzlh0, zzbq zzbq0) {
        super(zzbq0);
        this.zzc = new zzbp();
    }

    @Override  // com.google.android.gms.internal.ads.zztu
    public final zzbo zzd(int v, zzbo zzbo0, boolean z) {
        zzbo zzbo1 = this.zzb.zzd(v, zzbo0, z);
        if(this.zzb.zze(zzbo1.zzc, this.zzc, 0L).zzb()) {
            zzbo1.zzi(zzbo0.zza, zzbo0.zzb, zzbo0.zzc, zzbo0.zzd, 0L, zzb.zza, true);
            return zzbo1;
        }
        zzbo1.zzf = true;
        return zzbo1;
    }
}

