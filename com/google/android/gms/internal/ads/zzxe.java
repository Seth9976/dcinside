package com.google.android.gms.internal.ads;

final class zzxe extends zzxo implements Comparable {
    private final int zze;
    private final int zzf;

    public zzxe(int v, zzbr zzbr0, int v1, zzxh zzxh0, int v2) {
        super(v, zzbr0, v1);
        this.zze = zzlk.zza(v2, zzxh0.zzO);
        this.zzf = this.zzd.zza();
    }

    @Override
    public final int compareTo(Object object0) {
        return this.zza(((zzxe)object0));
    }

    public final int zza(zzxe zzxe0) {
        return Integer.compare(this.zzf, zzxe0.zzf);
    }

    @Override  // com.google.android.gms.internal.ads.zzxo
    public final int zzb() {
        return this.zze;
    }

    @Override  // com.google.android.gms.internal.ads.zzxo
    public final boolean zzc(zzxo zzxo0) {
        zzxe zzxe0 = (zzxe)zzxo0;
        return false;
    }
}

