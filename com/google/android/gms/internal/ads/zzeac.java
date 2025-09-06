package com.google.android.gms.internal.ads;

import j..util.Objects;

public final class zzeac {
    private final zzdzy zza;
    private final zzgcs zzb;

    public zzeac(zzdzy zzdzy0, zzgcs zzgcs0) {
        this.zza = zzdzy0;
        this.zzb = zzgcs0;
    }

    public final void zza(zzffr zzffr0) {
        Objects.requireNonNull(this.zza);
        zzeaa zzeaa0 = new zzeaa(this.zza);
        zzgch.zzr(this.zzb.zzb(zzeaa0), new zzeab(this, zzffr0), this.zzb);
    }
}

