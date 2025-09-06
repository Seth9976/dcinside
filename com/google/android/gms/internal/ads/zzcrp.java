package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

public final class zzcrp {
    private final zzfca zza;
    private final zzfbo zzb;
    private final String zzc;

    public zzcrp(zzfca zzfca0, zzfbo zzfbo0, @Nullable String s) {
        this.zza = zzfca0;
        this.zzb = zzfbo0;
        if(s == null) {
            s = "com.google.ads.mediation.admob.AdMobAdapter";
        }
        this.zzc = s;
    }

    public final zzfbo zza() {
        return this.zzb;
    }

    public final zzfbr zzb() {
        return this.zza.zzb.zzb;
    }

    public final zzfca zzc() {
        return this.zza;
    }

    public final String zzd() {
        return this.zzc;
    }
}

