package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

final class zzut implements zzxv {
    private final zzxv zza;
    private final zzbr zzb;

    public zzut(zzxv zzxv0, zzbr zzbr0) {
        this.zza = zzxv0;
        this.zzb = zzbr0;
    }

    @Override
    public final boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof zzut ? this.zza.equals(((zzut)object0).zza) && this.zzb.equals(((zzut)object0).zzb) : false;
    }

    @Override
    public final int hashCode() {
        return (this.zzb.hashCode() + 0x20F) * 0x1F + this.zza.hashCode();
    }

    @Override  // com.google.android.gms.internal.ads.zzxz
    public final int zza(int v) {
        return this.zza.zza(v);
    }

    @Override  // com.google.android.gms.internal.ads.zzxv
    public final int zzb() {
        return this.zza.zzb();
    }

    @Override  // com.google.android.gms.internal.ads.zzxz
    public final int zzc(int v) {
        return this.zza.zzc(v);
    }

    @Override  // com.google.android.gms.internal.ads.zzxz
    public final int zzd() {
        return this.zza.zzd();
    }

    @Override  // com.google.android.gms.internal.ads.zzxz
    public final zzab zze(int v) {
        int v1 = this.zza.zza(v);
        return this.zzb.zzb(v1);
    }

    @Override  // com.google.android.gms.internal.ads.zzxv
    public final zzab zzf() {
        int v = this.zza.zzb();
        return this.zzb.zzb(v);
    }

    @Override  // com.google.android.gms.internal.ads.zzxz
    public final zzbr zzg() {
        return this.zzb;
    }
}

