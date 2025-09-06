package com.google.android.gms.internal.ads;

public final class zzanc implements zzank {
    private zzab zza;
    private zzef zzb;
    private zzadt zzc;

    public zzanc(String s) {
        zzz zzz0 = new zzz();
        zzz0.zzaa(s);
        this.zza = zzz0.zzag();
    }

    @Override  // com.google.android.gms.internal.ads.zzank
    public final void zza(zzdy zzdy0) {
        zzcw.zzb(this.zzb);
        long v = this.zzb.zze();
        long v1 = this.zzb.zzf();
        if(v != 0x8000000000000001L && v1 != 0x8000000000000001L) {
            zzab zzab0 = this.zza;
            if(v1 != zzab0.zzt) {
                zzz zzz0 = zzab0.zzb();
                zzz0.zzae(v1);
                zzab zzab1 = zzz0.zzag();
                this.zza = zzab1;
                this.zzc.zzm(zzab1);
            }
            int v2 = zzdy0.zzb();
            this.zzc.zzr(zzdy0, v2);
            this.zzc.zzt(v, 1, v2, 0, null);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzank
    public final void zzb(zzef zzef0, zzacq zzacq0, zzanx zzanx0) {
        this.zzb = zzef0;
        zzanx0.zzc();
        zzadt zzadt0 = zzacq0.zzw(zzanx0.zza(), 5);
        this.zzc = zzadt0;
        zzadt0.zzm(this.zza);
    }
}

