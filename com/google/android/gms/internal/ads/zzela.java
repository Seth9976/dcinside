package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbl;

public final class zzela {
    private final zzdiq zza;
    private final zzekn zzb;
    private final zzcvw zzc;

    public zzela(zzdiq zzdiq0, zzdrw zzdrw0) {
        this.zza = zzdiq0;
        zzekn zzekn0 = new zzekn(zzdrw0);
        this.zzb = zzekn0;
        this.zzc = new zzekz(zzekn0, zzdiq0.zzg());
    }

    public final zzcvw zza() {
        return this.zzc;
    }

    public final zzcxh zzb() {
        return this.zzb;
    }

    public final zzdgl zzc() {
        zzbl zzbl0 = this.zzb.zzg();
        return new zzdgl(this.zza, zzbl0);
    }

    public final zzekn zzd() {
        return this.zzb;
    }

    public final void zze(zzbl zzbl0) {
        this.zzb.zzj(zzbl0);
    }
}

