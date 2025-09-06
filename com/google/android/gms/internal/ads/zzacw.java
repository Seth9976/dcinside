package com.google.android.gms.internal.ads;

public final class zzacw implements zzadm {
    private final zzacy zza;
    private final long zzb;

    public zzacw(zzacy zzacy0, long v) {
        this.zza = zzacy0;
        this.zzb = v;
    }

    @Override  // com.google.android.gms.internal.ads.zzadm
    public final long zza() {
        return this.zza.zza();
    }

    private final zzadn zzb(long v, long v1) {
        return new zzadn(v * 1000000L / ((long)this.zza.zze), this.zzb + v1);
    }

    @Override  // com.google.android.gms.internal.ads.zzadm
    public final zzadk zzg(long v) {
        zzcw.zzb(this.zza.zzk);
        long[] arr_v = this.zza.zzk.zza;
        long[] arr_v1 = this.zza.zzk.zzb;
        int v1 = zzei.zzd(arr_v, this.zza.zzb(v), true, false);
        long v2 = 0L;
        long v3 = v1 == -1 ? 0L : arr_v[v1];
        if(v1 != -1) {
            v2 = arr_v1[v1];
        }
        zzadn zzadn0 = this.zzb(v3, v2);
        return zzadn0.zzb == v || v1 == arr_v.length - 1 ? new zzadk(zzadn0, zzadn0) : new zzadk(zzadn0, this.zzb(arr_v[v1 + 1], arr_v1[v1 + 1]));
    }

    @Override  // com.google.android.gms.internal.ads.zzadm
    public final boolean zzh() {
        return true;
    }
}

