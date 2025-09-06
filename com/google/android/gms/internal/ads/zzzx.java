package com.google.android.gms.internal.ads;

final class zzzx {
    final zzaah zza;
    private zzab zzb;

    zzzx(zzaah zzaah0, zzaag zzaag0) {
        this.zza = zzaah0;
        super();
    }

    public final void zza(zzcd zzcd0) {
        zzz zzz0 = new zzz();
        zzz0.zzaf(zzcd0.zzb);
        zzz0.zzK(zzcd0.zzc);
        zzz0.zzaa("video/raw");
        this.zzb = zzz0.zzag();
        for(Object object0: this.zza.zzj) {
            ((zzaac)object0).zzA(this.zza, zzcd0);
        }
    }

    public final void zzb(long v, long v1, boolean z) {
        if(z) {
            zzaah zzaah0 = this.zza;
            if(zzaah0.zzm != null) {
                for(Object object0: zzaah0.zzj) {
                    ((zzaac)object0).zzy(this.zza);
                }
            }
        }
        if(this.zza.zzk != null) {
            zzab zzab0 = this.zzb == null ? new zzz().zzag() : this.zzb;
            this.zza.zzk.zza(v1, this.zza.zzi.zzc(), zzab0, null);
        }
        zzcw.zzb(null);
        throw null;
    }
}

