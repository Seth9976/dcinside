package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.List;

public final class zzado implements zzacn {
    private final int zza;
    private final int zzb;
    private final String zzc;
    private int zzd;
    private int zze;
    private zzacq zzf;
    private zzadt zzg;

    public zzado(int v, int v1, String s) {
        this.zza = v;
        this.zzb = v1;
        this.zzc = s;
    }

    @Override  // com.google.android.gms.internal.ads.zzacn
    public final int zzb(zzaco zzaco0, zzadj zzadj0) throws IOException {
        switch(this.zze) {
            case 1: {
                zzadt zzadt0 = this.zzg;
                zzadt0.getClass();
                int v = zzadt0.zzf(zzaco0, 0x400, true);
                if(v == -1) {
                    this.zze = 2;
                    this.zzg.zzt(0L, 1, this.zzd, 0, null);
                    this.zzd = 0;
                    return 0;
                }
                this.zzd += v;
                return 0;
            }
            case 2: {
                return -1;
            }
            default: {
                throw new IllegalStateException();
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzacn
    public final zzacn zzc() {
        return this;
    }

    @Override  // com.google.android.gms.internal.ads.zzacn
    public final List zzd() {
        return zzfxn.zzn();
    }

    @Override  // com.google.android.gms.internal.ads.zzacn
    public final void zze(zzacq zzacq0) {
        this.zzf = zzacq0;
        zzadt zzadt0 = zzacq0.zzw(0x400, 4);
        this.zzg = zzadt0;
        zzz zzz0 = new zzz();
        zzz0.zzaa(this.zzc);
        zzadt0.zzm(zzz0.zzag());
        this.zzf.zzD();
        this.zzf.zzO(new zzadp(0x8000000000000001L));
        this.zze = 1;
    }

    @Override  // com.google.android.gms.internal.ads.zzacn
    public final void zzf(long v, long v1) {
        if(v != 0L && this.zze != 1) {
            return;
        }
        this.zze = 1;
        this.zzd = 0;
    }

    @Override  // com.google.android.gms.internal.ads.zzacn
    public final boolean zzi(zzaco zzaco0) throws IOException {
        zzcw.zzf(this.zza != -1 && this.zzb != -1);
        zzdy zzdy0 = new zzdy(this.zzb);
        ((zzacc)zzaco0).zzm(zzdy0.zzN(), 0, this.zzb, false);
        return zzdy0.zzq() == this.zza;
    }
}

