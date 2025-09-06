package com.google.android.gms.internal.ads;

final class zzanr implements zzank {
    final zzant zza;
    private final zzdx zzb;

    public zzanr(zzant zzant0) {
        this.zza = zzant0;
        super();
        this.zzb = new zzdx(new byte[4], 4);
    }

    @Override  // com.google.android.gms.internal.ads.zzank
    public final void zza(zzdy zzdy0) {
        if(zzdy0.zzm() == 0 && (zzdy0.zzm() & 0x80) != 0) {
            zzdy0.zzM(6);
            int v = zzdy0.zzb();
            for(int v1 = 0; v1 < v / 4; ++v1) {
                zzdy0.zzG(this.zzb, 4);
                int v2 = this.zzb.zzd(16);
                this.zzb.zzn(3);
                if(v2 == 0) {
                    this.zzb.zzn(13);
                }
                else {
                    int v3 = this.zzb.zzd(13);
                    if(this.zza.zzg.get(v3) == null) {
                        this.zza.zzg.put(v3, new zzanl(new zzans(this.zza, v3)));
                        ++this.zza.zzm;
                    }
                }
            }
            this.zza.zzg.remove(0);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzank
    public final void zzb(zzef zzef0, zzacq zzacq0, zzanx zzanx0) {
    }
}

