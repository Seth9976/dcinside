package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

final class zzxm extends zzxo implements Comparable {
    private final int zze;
    private final boolean zzf;
    private final boolean zzg;
    private final boolean zzh;
    private final int zzi;
    private final int zzj;
    private final int zzk;
    private final int zzl;
    private final boolean zzm;

    public zzxm(int v, zzbr zzbr0, int v1, zzxh zzxh0, int v2, @Nullable String s) {
        super(v, zzbr0, v1);
        boolean z1;
        int v6;
        int v3 = 0;
        this.zzf = zzlk.zza(v2, false);
        this.zzg = 1 == (this.zzd.zze & 1);
        this.zzh = (this.zzd.zze & 2) != 0;
        zzfxn zzfxn0 = zzxh0.zzu.isEmpty() ? zzfxn.zzo("") : zzxh0.zzu;
        int v4;
        for(v4 = 0; true; ++v4) {
            if(v4 >= zzfxn0.size()) {
                v4 = 0x7FFFFFFF;
                v6 = 0;
                break;
            }
            String s1 = (String)zzfxn0.get(v4);
            int v5 = zzxt.zzc(this.zzd, s1, false);
            if(v5 > 0) {
                v6 = v5;
                break;
            }
        }
        this.zzi = v4;
        this.zzj = v6;
        int v7 = zzxt.zzb(this.zzd.zzf, zzxh0.zzv);
        this.zzk = v7;
        this.zzm = (this.zzd.zzf & 0x440) != 0;
        boolean z = zzxt.zzh(s) == null;
        int v8 = zzxt.zzc(this.zzd, s, z);
        this.zzl = v8;
        if(v6 > 0 || zzxh0.zzu.isEmpty() && v7 > 0) {
            z1 = true;
        }
        else if(!this.zzg && (!this.zzh || v8 <= 0)) {
            z1 = false;
        }
        else {
            z1 = true;
        }
        if(zzlk.zza(v2, zzxh0.zzO) && z1) {
            v3 = 1;
        }
        this.zze = v3;
    }

    @Override
    public final int compareTo(Object object0) {
        return this.zza(((zzxm)object0));
    }

    public final int zza(zzxm zzxm0) {
        zzfxc zzfxc0 = zzfxc.zzj().zzd(this.zzf, zzxm0.zzf);
        zzfyy zzfyy0 = zzfyy.zzc().zza();
        zzfxc zzfxc1 = zzfxc0.zzc(this.zzi, zzxm0.zzi, zzfyy0).zzb(this.zzj, zzxm0.zzj).zzb(this.zzk, zzxm0.zzk).zzd(this.zzg, zzxm0.zzg).zzc(Boolean.valueOf(this.zzh), Boolean.valueOf(zzxm0.zzh), (this.zzj == 0 ? zzfyy.zzc() : zzfyy.zzc().zza())).zzb(this.zzl, zzxm0.zzl);
        if(this.zzk == 0) {
            zzfxc1 = zzfxc1.zze(this.zzm, zzxm0.zzm);
        }
        return zzfxc1.zza();
    }

    @Override  // com.google.android.gms.internal.ads.zzxo
    public final int zzb() {
        return this.zze;
    }

    @Override  // com.google.android.gms.internal.ads.zzxo
    public final boolean zzc(zzxo zzxo0) {
        zzxm zzxm0 = (zzxm)zzxo0;
        return false;
    }
}

