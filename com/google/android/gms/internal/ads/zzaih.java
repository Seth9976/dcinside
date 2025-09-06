package com.google.android.gms.internal.ads;

final class zzaih implements zzaid {
    private final zzdy zza;
    private final int zzb;
    private final int zzc;
    private int zzd;
    private int zze;

    public zzaih(zzeo zzeo0) {
        this.zza = zzeo0.zza;
        zzeo0.zza.zzL(12);
        this.zzc = zzeo0.zza.zzp() & 0xFF;
        this.zzb = zzeo0.zza.zzp();
    }

    @Override  // com.google.android.gms.internal.ads.zzaid
    public final int zza() {
        return -1;
    }

    @Override  // com.google.android.gms.internal.ads.zzaid
    public final int zzb() {
        return this.zzb;
    }

    @Override  // com.google.android.gms.internal.ads.zzaid
    public final int zzc() {
        int v = this.zzc;
        if(v == 8) {
            return this.zza.zzm();
        }
        if(v == 16) {
            return this.zza.zzq();
        }
        int v1 = this.zzd;
        this.zzd = v1 + 1;
        if(v1 % 2 == 0) {
            int v2 = this.zza.zzm();
            this.zze = v2;
            return (v2 & 0xF0) >> 4;
        }
        return this.zze & 15;
    }
}

