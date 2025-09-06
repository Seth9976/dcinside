package com.google.android.gms.internal.ads;

final class zzxf implements Comparable {
    private final boolean zza;
    private final boolean zzb;

    public zzxf(zzab zzab0, int v) {
        this.zza = 1 == (zzab0.zze & 1);
        this.zzb = zzlk.zza(v, false);
    }

    @Override
    public final int compareTo(Object object0) {
        return this.zza(((zzxf)object0));
    }

    public final int zza(zzxf zzxf0) {
        return zzfxc.zzj().zzd(this.zzb, zzxf0.zzb).zzd(this.zza, zzxf0.zza).zza();
    }
}

