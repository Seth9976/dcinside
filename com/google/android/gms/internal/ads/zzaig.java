package com.google.android.gms.internal.ads;

final class zzaig implements zzaid {
    private final int zza;
    private final int zzb;
    private final zzdy zzc;

    public zzaig(zzeo zzeo0, zzab zzab0) {
        zzdy zzdy0 = zzeo0.zza;
        this.zzc = zzdy0;
        zzdy0.zzL(12);
        int v = zzdy0.zzp();
        if("audio/raw".equals(zzab0.zzo)) {
            int v1 = zzei.zzk(zzab0.zzF) * zzab0.zzD;
            if(v == 0 || v % v1 != 0) {
                zzdo.zzf("BoxParsers", "Audio sample size mismatch. stsd sample size: " + v1 + ", stsz sample size: " + v);
                v = v1;
            }
        }
        if(v == 0) {
            v = -1;
        }
        this.zza = v;
        this.zzb = zzdy0.zzp();
    }

    @Override  // com.google.android.gms.internal.ads.zzaid
    public final int zza() {
        return this.zza;
    }

    @Override  // com.google.android.gms.internal.ads.zzaid
    public final int zzb() {
        return this.zzb;
    }

    @Override  // com.google.android.gms.internal.ads.zzaid
    public final int zzc() {
        return this.zza == -1 ? this.zzc.zzp() : this.zza;
    }
}

