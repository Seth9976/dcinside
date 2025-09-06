package com.google.android.gms.internal.ads;

final class zzaey extends zzaex {
    private final zzdy zzb;
    private final zzdy zzc;
    private int zzd;
    private boolean zze;
    private boolean zzf;
    private int zzg;

    public zzaey(zzadt zzadt0) {
        super(zzadt0);
        this.zzb = new zzdy(zzfk.zza);
        this.zzc = new zzdy(4);
    }

    @Override  // com.google.android.gms.internal.ads.zzaex
    protected final boolean zza(zzdy zzdy0) throws zzaew {
        int v = zzdy0.zzm();
        if((v & 15) != 7) {
            throw new zzaew("Video format not supported: " + (v & 15));
        }
        this.zzg = v >> 4;
        return v >> 4 != 5;
    }

    @Override  // com.google.android.gms.internal.ads.zzaex
    protected final boolean zzb(zzdy zzdy0, long v) throws zzbc {
        int v4;
        int v1 = zzdy0.zzm();
        long v2 = (long)zzdy0.zzh();
        if(v1 == 0) {
            if(!this.zze) {
                zzdy zzdy1 = new zzdy(new byte[zzdy0.zzb()]);
                zzdy0.zzH(zzdy1.zzN(), 0, zzdy0.zzb());
                zzabr zzabr0 = zzabr.zza(zzdy1);
                this.zzd = zzabr0.zzb;
                zzz zzz0 = new zzz();
                zzz0.zzaa("video/avc");
                zzz0.zzA(zzabr0.zzl);
                zzz0.zzaf(zzabr0.zzc);
                zzz0.zzK(zzabr0.zzd);
                zzz0.zzW(zzabr0.zzk);
                zzz0.zzN(zzabr0.zza);
                zzab zzab0 = zzz0.zzag();
                this.zza.zzm(zzab0);
                this.zze = true;
                return false;
            }
        }
        else if(v1 == 1 && this.zze) {
            int v3 = this.zzg == 1 ? 1 : 0;
            if(this.zzf) {
                v4 = v3;
            label_26:
                byte[] arr_b = this.zzc.zzN();
                arr_b[0] = 0;
                arr_b[1] = 0;
                arr_b[2] = 0;
                int v5 = 4 - this.zzd;
                int v6;
                for(v6 = 0; zzdy0.zzb() > 0; v6 = v6 + 4 + v7) {
                    zzdy0.zzH(this.zzc.zzN(), v5, this.zzd);
                    this.zzc.zzL(0);
                    int v7 = this.zzc.zzp();
                    this.zzb.zzL(0);
                    this.zza.zzr(this.zzb, 4);
                    this.zza.zzr(zzdy0, v7);
                }
                this.zza.zzt(v + v2 * 1000L, v4, v6, 0, null);
                this.zzf = true;
                return true;
            }
            else if(v3 != 0) {
                v4 = 1;
                goto label_26;
            }
        }
        return false;
    }
}

