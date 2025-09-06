package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import j..util.Objects;

final class zzxr extends zzxo {
    private final boolean zze;
    private final zzxh zzf;
    private final boolean zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final int zzj;
    private final int zzk;
    private final int zzl;
    private final int zzm;
    private final int zzn;
    private final int zzo;
    private final boolean zzp;
    private final int zzq;
    private final int zzr;
    private final boolean zzs;
    private final boolean zzt;
    private final int zzu;

    public zzxr(int v, zzbr zzbr0, int v1, zzxh zzxh0, int v2, @Nullable String s, int v3, boolean z) {
        super(v, zzbr0, v1);
        int v12;
        int v9;
        int v7;
        boolean z2;
        boolean z1;
        this.zzf = zzxh0;
        int v4 = 1;
        int v5 = zzxh0.zzF ? 24 : 16;
        if(z) {
            float f = this.zzd.zzx;
            z1 = f == -1.0f || f <= 2147483648.0f;
        }
        else {
            z1 = false;
        }
        this.zze = z1;
        if(z) {
            zzab zzab0 = this.zzd;
            if(zzab0.zzv != -1 && zzab0.zzv < 0) {
                z2 = false;
            }
            else if((zzab0.zzw == -1 || zzab0.zzw >= 0) && (zzab0.zzx == -1.0f || zzab0.zzx >= 0.0f) && (zzab0.zzj == -1 || zzab0.zzj >= 0)) {
                z2 = true;
            }
            else {
                z2 = false;
            }
        }
        else {
            z2 = false;
        }
        this.zzg = z2;
        this.zzh = zzlk.zza(v2, false);
        this.zzi = this.zzd.zzx != -1.0f && this.zzd.zzx >= 10.0f;
        this.zzj = this.zzd.zzj;
        this.zzk = this.zzd.zza();
        int v6;
        for(v6 = 0; true; ++v6) {
            v7 = 0x7FFFFFFF;
            if(v6 >= zzxh0.zzm.size()) {
                v6 = 0x7FFFFFFF;
                v9 = 0;
                break;
            }
            String s1 = (String)zzxh0.zzm.get(v6);
            int v8 = zzxt.zzc(this.zzd, s1, false);
            if(v8 > 0) {
                v9 = v8;
                break;
            }
        }
        this.zzm = v6;
        this.zzn = v9;
        this.zzo = zzxt.zzb(this.zzd.zzf, 0);
        int v10 = this.zzd.zzf;
        this.zzp = v10 == 0 || (v10 & 1) != 0;
        boolean z3 = zzxt.zzh(s) == null;
        this.zzq = zzxt.zzc(this.zzd, s, z3);
        for(int v11 = 0; v11 < zzxh0.zzl.size(); ++v11) {
            String s2 = this.zzd.zzo;
            if(s2 != null && s2.equals(zzxh0.zzl.get(v11))) {
                v7 = v11;
                break;
            }
        }
        this.zzl = v7;
        this.zzs = (v2 & 0x180) == 0x80;
        this.zzt = (v2 & 0x40) == 0x40;
        zzab zzab1 = this.zzd;
        String s3 = zzab1.zzo;
        if(s3 == null) {
            v12 = 0;
        }
        else {
            v12 = 4;
            switch(s3) {
                case "video/av01": {
                    break;
                }
                case "video/avc": {
                    v12 = 1;
                    break;
                }
                case "video/dolby-vision": {
                    v12 = 5;
                    break;
                }
                case "video/hevc": {
                    v12 = 3;
                    break;
                }
                case "video/x-vnd.on2.vp9": {
                    v12 = 2;
                    break;
                }
                default: {
                    v12 = 0;
                }
            }
        }
        this.zzu = v12;
        if((zzab1.zzf & 0x4000) == 0) {
            zzxh zzxh1 = this.zzf;
            if(zzlk.zza(v2, zzxh1.zzO)) {
                boolean z4 = this.zze;
                if(!z4 && !zzxh1.zzD) {
                    v4 = 0;
                }
                else if(zzlk.zza(v2, false) && this.zzg && z4 && zzab1.zzj != -1 && (v5 & v2) != 0) {
                    v4 = 2;
                }
            }
            else {
                v4 = 0;
            }
        }
        else {
            v4 = 0;
        }
        this.zzr = v4;
    }

    public static int zza(zzxr zzxr0, zzxr zzxr1) {
        zzfyy zzfyy0;
        if(zzxr0.zze && zzxr0.zzh) {
            zzfyy0 = zzxt.zzc;
            return zzfxc.zzj().zzc(zzxr0.zzk, zzxr1.zzk, zzfyy0).zzc(zzxr0.zzj, zzxr1.zzj, zzfyy0).zza();
        }
        zzfyy0 = zzxt.zzc.zza();
        return zzfxc.zzj().zzc(zzxr0.zzk, zzxr1.zzk, zzfyy0).zzc(zzxr0.zzj, zzxr1.zzj, zzfyy0).zza();
    }

    @Override  // com.google.android.gms.internal.ads.zzxo
    public final int zzb() {
        return this.zzr;
    }

    @Override  // com.google.android.gms.internal.ads.zzxo
    public final boolean zzc(zzxo zzxo0) {
        return Objects.equals(this.zzd.zzo, ((zzxr)zzxo0).zzd.zzo) && this.zzs == ((zzxr)zzxo0).zzs && this.zzt == ((zzxr)zzxo0).zzt;
    }

    public static int zzd(zzxr zzxr0, zzxr zzxr1) {
        zzfxc zzfxc0 = zzfxc.zzj().zzd(zzxr0.zzh, zzxr1.zzh);
        zzfyy zzfyy0 = zzfyy.zzc().zza();
        zzfxc zzfxc1 = zzfxc0.zzc(zzxr0.zzm, zzxr1.zzm, zzfyy0).zzb(zzxr0.zzn, zzxr1.zzn).zzb(zzxr0.zzo, zzxr1.zzo).zzd(zzxr0.zzp, zzxr1.zzp).zzb(zzxr0.zzq, zzxr1.zzq).zzd(zzxr0.zzi, zzxr1.zzi).zzd(zzxr0.zze, zzxr1.zze).zzd(zzxr0.zzg, zzxr1.zzg);
        zzfyy zzfyy1 = zzfyy.zzc().zza();
        zzfxc zzfxc2 = zzfxc1.zzc(zzxr0.zzl, zzxr1.zzl, zzfyy1).zzd(zzxr0.zzs, zzxr1.zzs).zzd(zzxr0.zzt, zzxr1.zzt);
        if(zzxr0.zzs && zzxr0.zzt) {
            zzfxc2 = zzfxc2.zzb(zzxr0.zzu, zzxr1.zzu);
        }
        return zzfxc2.zza();
    }
}

