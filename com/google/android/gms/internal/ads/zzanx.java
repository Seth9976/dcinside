package com.google.android.gms.internal.ads;

public final class zzanx {
    private final String zza;
    private final int zzb;
    private final int zzc;
    private int zzd;
    private String zze;

    public zzanx(int v, int v1, int v2) {
        this.zza = v == 0x80000000 ? "" : v + "/";
        this.zzb = v1;
        this.zzc = v2;
        this.zzd = 0x80000000;
        this.zze = "";
    }

    public final int zza() {
        this.zzd();
        return this.zzd;
    }

    public final String zzb() {
        this.zzd();
        return this.zze;
    }

    public final void zzc() {
        int v = this.zzd == 0x80000000 ? this.zzb : this.zzd + this.zzc;
        this.zzd = v;
        this.zze = this.zza + v;
    }

    private final void zzd() {
        if(this.zzd == 0x80000000) {
            throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
        }
    }
}

