package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

public final class zzi {
    private int zza;
    private int zzb;
    private int zzc;
    @Nullable
    private byte[] zzd;
    private int zze;
    private int zzf;

    public zzi() {
        this.zza = -1;
        this.zzb = -1;
        this.zzc = -1;
        this.zze = -1;
        this.zzf = -1;
    }

    zzi(zzk zzk0, zzj zzj0) {
        this.zza = zzk0.zzb;
        this.zzb = zzk0.zzc;
        this.zzc = zzk0.zzd;
        this.zzd = zzk0.zze;
        this.zze = zzk0.zzf;
        this.zzf = zzk0.zzg;
    }

    public final zzi zza(int v) {
        this.zzf = v;
        return this;
    }

    public final zzi zzb(int v) {
        this.zzb = v;
        return this;
    }

    public final zzi zzc(int v) {
        this.zza = v;
        return this;
    }

    public final zzi zzd(int v) {
        this.zzc = v;
        return this;
    }

    public final zzi zze(@Nullable byte[] arr_b) {
        this.zzd = arr_b;
        return this;
    }

    public final zzi zzf(int v) {
        this.zze = v;
        return this;
    }

    public final zzk zzg() {
        return new zzk(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, null);
    }
}

