package com.google.android.gms.internal.ads;

final class zzaec implements zzadm {
    final zzaef zza;
    private final long zzb;

    public zzaec(zzaef zzaef0, long v) {
        this.zza = zzaef0;
        super();
        this.zzb = v;
    }

    @Override  // com.google.android.gms.internal.ads.zzadm
    public final long zza() {
        return this.zzb;
    }

    @Override  // com.google.android.gms.internal.ads.zzadm
    public final zzadk zzg(long v) {
        zzadk zzadk0 = this.zza.zzi[0].zza(v);
        for(int v1 = 1; true; ++v1) {
            zzaef zzaef0 = this.zza;
            if(v1 >= zzaef0.zzi.length) {
                break;
            }
            zzadk zzadk1 = zzaef0.zzi[v1].zza(v);
            if(zzadk1.zza.zzc < zzadk0.zza.zzc) {
                zzadk0 = zzadk1;
            }
        }
        return zzadk0;
    }

    @Override  // com.google.android.gms.internal.ads.zzadm
    public final boolean zzh() {
        return true;
    }
}

