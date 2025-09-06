package com.google.android.gms.internal.ads;

public final class zzade implements zzadm {
    private final zzdp zza;
    private final zzdp zzb;
    private long zzc;

    public zzade(long[] arr_v, long[] arr_v1, long v) {
        zzcw.zzd(arr_v.length == arr_v1.length);
        if(arr_v1.length <= 0 || arr_v1[0] <= 0L) {
            this.zza = new zzdp(arr_v1.length);
            this.zzb = new zzdp(arr_v1.length);
        }
        else {
            zzdp zzdp0 = new zzdp(arr_v1.length + 1);
            this.zza = zzdp0;
            zzdp zzdp1 = new zzdp(arr_v1.length + 1);
            this.zzb = zzdp1;
            zzdp0.zzc(0L);
            zzdp1.zzc(0L);
        }
        this.zza.zzd(arr_v);
        this.zzb.zzd(arr_v1);
        this.zzc = v;
    }

    @Override  // com.google.android.gms.internal.ads.zzadm
    public final long zza() {
        return this.zzc;
    }

    @Override  // com.google.android.gms.internal.ads.zzadm
    public final zzadk zzg(long v) {
        zzdp zzdp0 = this.zzb;
        if(zzdp0.zza() == 0) {
            return new zzadk(zzadn.zza, zzadn.zza);
        }
        int v1 = zzei.zzb(zzdp0, v, true, true);
        zzadn zzadn0 = new zzadn(this.zzb.zzb(v1), this.zza.zzb(v1));
        if(zzadn0.zzb != v) {
            return v1 == this.zzb.zza() - 1 ? new zzadk(zzadn0, zzadn0) : new zzadk(zzadn0, new zzadn(this.zzb.zzb(v1 + 1), this.zza.zzb(v1 + 1)));
        }
        return new zzadk(zzadn0, zzadn0);
    }

    @Override  // com.google.android.gms.internal.ads.zzadm
    public final boolean zzh() {
        return this.zzb.zza() > 0;
    }
}

