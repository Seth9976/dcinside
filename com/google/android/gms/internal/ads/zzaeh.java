package com.google.android.gms.internal.ads;

final class zzaeh implements zzaeb {
    public final int zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;

    private zzaeh(int v, int v1, int v2, int v3, int v4, int v5) {
        this.zza = v;
        this.zzb = v2;
        this.zzc = v3;
        this.zzd = v4;
        this.zze = v5;
    }

    @Override  // com.google.android.gms.internal.ads.zzaeb
    public final int zza() {
        return 0x68727473;
    }

    public static zzaeh zzb(zzdy zzdy0) {
        int v = zzdy0.zzi();
        zzdy0.zzM(12);
        int v1 = zzdy0.zzi();
        int v2 = zzdy0.zzi();
        int v3 = zzdy0.zzi();
        zzdy0.zzM(4);
        int v4 = zzdy0.zzi();
        int v5 = zzdy0.zzi();
        zzdy0.zzM(8);
        return new zzaeh(v, v1, v2, v3, v4, v5);
    }
}

