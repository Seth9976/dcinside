package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Arrays;

final class zzajm {
    private final zzajn zza;
    private final zzdy zzb;
    private int zzc;
    private int zzd;
    private boolean zze;

    zzajm() {
        this.zza = new zzajn();
        this.zzb = new zzdy(new byte[0xFE01], 0);
        this.zzc = -1;
    }

    public final zzdy zza() {
        return this.zzb;
    }

    public final zzajn zzb() {
        return this.zza;
    }

    public final void zzc() {
        this.zza.zza();
        this.zzb.zzI(0);
        this.zzc = -1;
        this.zze = false;
    }

    public final void zzd() {
        zzdy zzdy0 = this.zzb;
        if(zzdy0.zzN().length == 0xFE01) {
            return;
        }
        zzdy0.zzJ(Arrays.copyOf(zzdy0.zzN(), Math.max(0xFE01, zzdy0.zze())), this.zzb.zze());
    }

    public final boolean zze(zzaco zzaco0) throws IOException {
        if(this.zze) {
            this.zze = false;
            this.zzb.zzI(0);
        }
        while(true) {
            boolean z = true;
            if(this.zze) {
                break;
            }
            int v = this.zzc;
            if(v < 0) {
                if(this.zza.zzc(zzaco0, -1L) && this.zza.zzb(zzaco0, true)) {
                    int v1 = this.zza.zzd;
                    if((this.zza.zza & 1) != 1 || this.zzb.zze() != 0) {
                        v = 0;
                    }
                    else {
                        v1 += this.zzf(0);
                        v = this.zzd;
                    }
                    if(!zzacr.zze(zzaco0, v1)) {
                        return false;
                    }
                    this.zzc = v;
                    goto label_19;
                }
                return false;
            }
        label_19:
            int v2 = this.zzf(v);
            int v3 = this.zzc + this.zzd;
            if(v2 > 0) {
                this.zzb.zzF(this.zzb.zze() + v2);
                if(!zzacr.zzd(zzaco0, this.zzb.zzN(), this.zzb.zze(), v2)) {
                    return false;
                }
                this.zzb.zzK(this.zzb.zze() + v2);
                if(this.zza.zzf[v3 - 1] == 0xFF) {
                    z = false;
                }
                this.zze = z;
            }
            if(v3 == this.zza.zzc) {
                v3 = -1;
            }
            this.zzc = v3;
        }
        return true;
    }

    private final int zzf(int v) {
        int v1 = 0;
        this.zzd = 0;
        do {
            int v2 = this.zzd;
            int v3 = v + v2;
            zzajn zzajn0 = this.zza;
            if(v3 >= zzajn0.zzc) {
                break;
            }
            this.zzd = v2 + 1;
            int v4 = zzajn0.zzf[v3];
            v1 += v4;
        }
        while(v4 == 0xFF);
        return v1;
    }
}

