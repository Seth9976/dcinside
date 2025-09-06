package com.google.android.gms.internal.ads;

final class zzajj implements zzajo {
    private final zzacy zza;
    private final zzacx zzb;
    private long zzc;
    private long zzd;

    public zzajj(zzacy zzacy0, zzacx zzacx0) {
        this.zza = zzacy0;
        this.zzb = zzacx0;
        this.zzc = -1L;
        this.zzd = -1L;
    }

    public final void zza(long v) {
        this.zzc = v;
    }

    @Override  // com.google.android.gms.internal.ads.zzajo
    public final long zzd(zzaco zzaco0) {
        long v = this.zzd;
        if(v >= 0L) {
            this.zzd = -1L;
            return -(v + 2L);
        }
        return -1L;
    }

    @Override  // com.google.android.gms.internal.ads.zzajo
    public final zzadm zze() {
        zzcw.zzf(this.zzc != -1L);
        return new zzacw(this.zza, this.zzc);
    }

    @Override  // com.google.android.gms.internal.ads.zzajo
    public final void zzg(long v) {
        this.zzd = this.zzb.zza[zzei.zzd(this.zzb.zza, v, true, true)];
    }
}

