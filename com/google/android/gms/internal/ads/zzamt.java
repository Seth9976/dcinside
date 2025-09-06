package com.google.android.gms.internal.ads;

public final class zzamt implements zzamj {
    private final zzdy zza;
    private zzadt zzb;
    private boolean zzc;
    private long zzd;
    private int zze;
    private int zzf;

    public zzamt() {
        this.zza = new zzdy(10);
        this.zzd = 0x8000000000000001L;
    }

    @Override  // com.google.android.gms.internal.ads.zzamj
    public final void zza(zzdy zzdy0) {
        zzcw.zzb(this.zzb);
        if(!this.zzc) {
            return;
        }
        int v = zzdy0.zzb();
        int v1 = this.zzf;
        if(v1 < 10) {
            int v2 = Math.min(v, 10 - v1);
            System.arraycopy(zzdy0.zzN(), zzdy0.zzd(), this.zza.zzN(), this.zzf, v2);
            if(this.zzf + v2 == 10) {
                this.zza.zzL(0);
                if(this.zza.zzm() == 73 && this.zza.zzm() == 68 && this.zza.zzm() == 51) {
                    this.zza.zzM(3);
                    this.zze = this.zza.zzl() + 10;
                    goto label_17;
                }
                zzdo.zzf("Id3Reader", "Discarding invalid ID3 tag");
                this.zzc = false;
                return;
            }
        }
    label_17:
        int v3 = Math.min(v, this.zze - this.zzf);
        this.zzb.zzr(zzdy0, v3);
        this.zzf += v3;
    }

    @Override  // com.google.android.gms.internal.ads.zzamj
    public final void zzb(zzacq zzacq0, zzanx zzanx0) {
        zzanx0.zzc();
        zzadt zzadt0 = zzacq0.zzw(zzanx0.zza(), 5);
        this.zzb = zzadt0;
        zzz zzz0 = new zzz();
        zzz0.zzM(zzanx0.zzb());
        zzz0.zzaa("application/id3");
        zzadt0.zzm(zzz0.zzag());
    }

    @Override  // com.google.android.gms.internal.ads.zzamj
    public final void zzc(boolean z) {
        zzcw.zzb(this.zzb);
        if(this.zzc && (this.zze != 0 && this.zzf == this.zze)) {
            zzcw.zzf(this.zzd != 0x8000000000000001L);
            this.zzb.zzt(this.zzd, 1, this.zze, 0, null);
            this.zzc = false;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzamj
    public final void zzd(long v, int v1) {
        if((v1 & 4) == 0) {
            return;
        }
        this.zzc = true;
        this.zzd = v;
        this.zze = 0;
        this.zzf = 0;
    }

    @Override  // com.google.android.gms.internal.ads.zzamj
    public final void zze() {
        this.zzc = false;
        this.zzd = 0x8000000000000001L;
    }
}

