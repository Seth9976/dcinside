package com.google.android.gms.internal.ads;

import java.io.IOException;

final class zzajn {
    public int zza;
    public long zzb;
    public int zzc;
    public int zzd;
    public int zze;
    public final int[] zzf;
    private final zzdy zzg;

    zzajn() {
        this.zzf = new int[0xFF];
        this.zzg = new zzdy(0xFF);
    }

    public final void zza() {
        this.zza = 0;
        this.zzb = 0L;
        this.zzc = 0;
        this.zzd = 0;
        this.zze = 0;
    }

    public final boolean zzb(zzaco zzaco0, boolean z) throws IOException {
        this.zza();
        this.zzg.zzI(27);
        if(zzacr.zzc(zzaco0, this.zzg.zzN(), 0, 27, z) && this.zzg.zzu() == 0x4F676753L) {
            if(this.zzg.zzm() != 0) {
                if(!z) {
                    throw zzbc.zzc("unsupported bit stream revision");
                }
                return false;
            }
            this.zza = this.zzg.zzm();
            this.zzb = this.zzg.zzr();
            this.zzg.zzs();
            this.zzg.zzs();
            this.zzg.zzs();
            int v1 = this.zzg.zzm();
            this.zzc = v1;
            this.zzd = v1 + 27;
            this.zzg.zzI(v1);
            if(zzacr.zzc(zzaco0, this.zzg.zzN(), 0, this.zzc, z)) {
                for(int v = 0; v < this.zzc; ++v) {
                    this.zzf[v] = this.zzg.zzm();
                    this.zze += this.zzf[v];
                }
                return true;
            }
        }
        return false;
    }

    public final boolean zzc(zzaco zzaco0, long v) throws IOException {
        zzcw.zzd(zzaco0.zzf() == zzaco0.zze());
        this.zzg.zzI(4);
        while(true) {
            int v1 = Long.compare(v, -1L);
            if(v1 != 0 && zzaco0.zzf() + 4L >= v || !zzacr.zzc(zzaco0, this.zzg.zzN(), 0, 4, true)) {
                break;
            }
            this.zzg.zzL(0);
            if(this.zzg.zzu() == 0x4F676753L) {
                zzaco0.zzj();
                return true;
            }
            zzaco0.zzk(1);
        }
        while((v1 == 0 || zzaco0.zzf() < v) && zzaco0.zzc(1) != -1) {
        }
        return false;
    }
}

