package com.google.android.gms.internal.ads;

import android.content.res.Configuration;
import android.content.res.Resources;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import j..util.Objects;

final class zzxd extends zzxo implements Comparable {
    private final int zze;
    private final boolean zzf;
    @Nullable
    private final String zzg;
    private final zzxh zzh;
    private final boolean zzi;
    private final int zzj;
    private final int zzk;
    private final int zzl;
    private final boolean zzm;
    private final int zzn;
    private final int zzo;
    private final boolean zzp;
    private final int zzq;
    private final int zzr;
    private final int zzs;
    private final int zzt;
    private final boolean zzu;
    private final boolean zzv;
    private final boolean zzw;

    public zzxd(int v, zzbr zzbr0, int v1, zzxh zzxh0, int v2, boolean z, zzfuo zzfuo0, int v3) {
        super(v, zzbr0, v1);
        int v14;
        boolean z1;
        int v10;
        int v9;
        int v7;
        this.zzh = zzxh0;
        int v4 = 1;
        int v5 = zzxh0.zzM ? 24 : 16;
        this.zzg = zzxt.zzh(this.zzd.zzd);
        this.zzi = zzlk.zza(v2, false);
        int v6;
        for(v6 = 0; true; ++v6) {
            v7 = 0x7FFFFFFF;
            if(v6 >= zzxh0.zzo.size()) {
                v6 = 0x7FFFFFFF;
                v9 = 0;
                break;
            }
            String s = (String)zzxh0.zzo.get(v6);
            int v8 = zzxt.zzc(this.zzd, s, false);
            if(v8 > 0) {
                v9 = v8;
                break;
            }
        }
        this.zzk = v6;
        this.zzj = v9;
        this.zzl = zzxt.zzb(this.zzd.zzf, 0);
        zzab zzab0 = this.zzd;
        this.zzm = zzab0.zzf == 0 || (zzab0.zzf & 1) != 0;
        this.zzp = 1 == (zzab0.zze & 1);
        String s1 = zzab0.zzo;
        if(s1 == null) {
            z1 = false;
        }
        else {
            switch(s1) {
                case "audio/ac4": {
                    v10 = 1;
                    break;
                }
                case "audio/eac3-joc": {
                    v10 = 0;
                    break;
                }
                case "audio/iamf": {
                    v10 = 2;
                    break;
                }
                default: {
                    v10 = -1;
                }
            }
            z1 = v10 != 0 && v10 != 1 && v10 != 2 ? false : true;
        }
        this.zzw = z1;
        this.zzq = zzab0.zzD;
        this.zzr = zzab0.zzE;
        this.zzs = zzab0.zzj;
        this.zzf = zzfuo0.zza(zzab0);
        Configuration configuration0 = Resources.getSystem().getConfiguration();
        String[] arr_s = zzei.zza < 24 ? new String[]{configuration0.locale.toLanguageTag()} : configuration0.getLocales().toLanguageTags().split(",", -1);
        for(int v11 = 0; v11 < arr_s.length; ++v11) {
            arr_s[v11] = zzei.zzE(arr_s[v11]);
        }
        int v12;
        for(v12 = 0; true; ++v12) {
            if(v12 >= arr_s.length) {
                v12 = 0x7FFFFFFF;
                v14 = 0;
                break;
            }
            int v13 = zzxt.zzc(this.zzd, arr_s[v12], false);
            if(v13 > 0) {
                v14 = v13;
                break;
            }
        }
        this.zzn = v12;
        this.zzo = v14;
        for(int v15 = 0; v15 < zzxh0.zzs.size(); ++v15) {
            String s2 = this.zzd.zzo;
            if(s2 != null && s2.equals(zzxh0.zzs.get(v15))) {
                v7 = v15;
                break;
            }
        }
        this.zzt = v7;
        this.zzu = (v2 & 0x180) == 0x80;
        this.zzv = (v2 & 0x40) == 0x40;
        zzxh zzxh1 = this.zzh;
        if(zzlk.zza(v2, zzxh1.zzO)) {
            boolean z2 = this.zzf;
            if(!z2 && !zzxh1.zzH) {
                v4 = 0;
            }
            else if(zzlk.zza(v2, false) && z2 && this.zzd.zzj != -1 && (zzxh1.zzQ || !z) && (v5 & v2) != 0) {
                v4 = 2;
            }
        }
        else {
            v4 = 0;
        }
        this.zze = v4;
    }

    @Override
    public final int compareTo(Object object0) {
        return this.zza(((zzxd)object0));
    }

    public final int zza(zzxd zzxd0) {
        zzfyy zzfyy0 = !this.zzf || !this.zzi ? zzxt.zzc.zza() : zzxt.zzc;
        zzfxc zzfxc0 = zzfxc.zzj().zzd(this.zzi, zzxd0.zzi);
        zzfyy zzfyy1 = zzfyy.zzc().zza();
        zzfxc zzfxc1 = zzfxc0.zzc(this.zzk, zzxd0.zzk, zzfyy1).zzb(this.zzj, zzxd0.zzj).zzb(this.zzl, zzxd0.zzl).zzd(this.zzp, zzxd0.zzp).zzd(this.zzm, zzxd0.zzm);
        zzfyy zzfyy2 = zzfyy.zzc().zza();
        zzfxc zzfxc2 = zzfxc1.zzc(this.zzn, zzxd0.zzn, zzfyy2).zzb(this.zzo, zzxd0.zzo).zzd(this.zzf, zzxd0.zzf);
        zzfyy zzfyy3 = zzfyy.zzc().zza();
        zzfxc zzfxc3 = zzfxc2.zzc(this.zzt, zzxd0.zzt, zzfyy3).zzd(this.zzu, zzxd0.zzu).zzd(this.zzv, zzxd0.zzv).zzd(this.zzw, zzxd0.zzw).zzc(this.zzq, zzxd0.zzq, zzfyy0).zzc(this.zzr, zzxd0.zzr, zzfyy0);
        if(Objects.equals(this.zzg, zzxd0.zzg)) {
            zzfxc3 = zzfxc3.zzc(this.zzs, zzxd0.zzs, zzfyy0);
        }
        return zzfxc3.zza();
    }

    @Override  // com.google.android.gms.internal.ads.zzxo
    public final int zzb() {
        return this.zze;
    }

    @Override  // com.google.android.gms.internal.ads.zzxo
    public final boolean zzc(zzxo zzxo0) {
        zzab zzab0 = this.zzd;
        int v = zzab0.zzD;
        if(v != -1) {
            zzab zzab1 = ((zzxd)zzxo0).zzd;
            if(v == zzab1.zzD && (zzab0.zzo != null && TextUtils.equals(zzab0.zzo, zzab1.zzo))) {
                int v1 = this.zzd.zzE;
                return v1 != -1 && v1 == ((zzxd)zzxo0).zzd.zzE && this.zzu == ((zzxd)zzxo0).zzu && this.zzv == ((zzxd)zzxo0).zzv;
            }
        }
        return false;
    }
}

