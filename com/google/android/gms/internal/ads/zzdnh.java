package com.google.android.gms.internal.ads;

import j..util.Objects;

public final class zzdnh {
    private final zzcvr zza;
    private final zzcxa zzb;
    private final zzcxn zzc;
    private final zzcxz zzd;
    private final zzdap zze;
    private final zzfbo zzf;
    private final zzfbr zzg;
    private final zzcmk zzh;

    public zzdnh(zzcvr zzcvr0, zzcxa zzcxa0, zzcxn zzcxn0, zzcxz zzcxz0, zzdap zzdap0, zzfbo zzfbo0, zzfbr zzfbr0, zzcmk zzcmk0) {
        this.zza = zzcvr0;
        this.zzb = zzcxa0;
        this.zzc = zzcxn0;
        this.zzd = zzcxz0;
        this.zze = zzdap0;
        this.zzf = zzfbo0;
        this.zzg = zzfbr0;
        this.zzh = zzcmk0;
    }

    public final void zza(zzdnl zzdnl0) {
        zzdmy zzdmy0 = zzdnl0.zza;
        Objects.requireNonNull(this.zzb);
        zzdng zzdng0 = new zzdng(this.zzb);
        zzdmy0.zzh(this.zza, this.zzc, this.zzd, this.zze, zzdng0);
        zzdnl0.zzh(this.zzf, this.zzg, this.zzh);
    }
}

