package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzv;

final class zzfeu {
    private final long zza;
    private final zzfet zzb;
    private long zzc;
    private int zzd;
    private int zze;
    private int zzf;

    public zzfeu() {
        this.zzb = new zzfet();
        this.zzd = 0;
        this.zze = 0;
        this.zzf = 0;
        long v = zzv.zzC().currentTimeMillis();
        this.zza = v;
        this.zzc = v;
    }

    public final int zza() {
        return this.zzd;
    }

    public final long zzb() {
        return this.zza;
    }

    public final long zzc() {
        return this.zzc;
    }

    public final zzfet zzd() {
        zzfet zzfet0 = this.zzb.zza();
        this.zzb.zza = false;
        this.zzb.zzb = 0;
        return zzfet0;
    }

    public final String zze() {
        return "Created: " + this.zza + " Last accessed: " + this.zzc + " Accesses: " + this.zzd + "\nEntries retrieved: Valid: " + this.zze + " Stale: " + this.zzf;
    }

    public final void zzf() {
        this.zzc = zzv.zzC().currentTimeMillis();
        ++this.zzd;
    }

    public final void zzg() {
        ++this.zzf;
        ++this.zzb.zzb;
    }

    public final void zzh() {
        ++this.zze;
        this.zzb.zza = true;
    }
}

