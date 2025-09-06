package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.List;

public final class zzamc implements zzacn {
    private final zzamd zza;
    private final zzdy zzb;
    private boolean zzc;

    public zzamc() {
        this.zza = new zzamd(null, 0);
        this.zzb = new zzdy(0x4000);
    }

    @Override  // com.google.android.gms.internal.ads.zzacn
    public final int zzb(zzaco zzaco0, zzadj zzadj0) throws IOException {
        int v = zzaco0.zza(this.zzb.zzN(), 0, 0x4000);
        if(v == -1) {
            return -1;
        }
        this.zzb.zzL(0);
        this.zzb.zzK(v);
        if(!this.zzc) {
            this.zza.zzd(0L, 4);
            this.zzc = true;
        }
        this.zza.zza(this.zzb);
        return 0;
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
        zzanx zzanx0 = new zzanx(0x80000000, 0, 1);
        this.zza.zzb(zzacq0, zzanx0);
        zzacq0.zzD();
        zzacq0.zzO(new zzadl(0x8000000000000001L, 0L));
    }

    @Override  // com.google.android.gms.internal.ads.zzacn
    public final void zzf(long v, long v1) {
        this.zzc = false;
        this.zza.zze();
    }

    @Override  // com.google.android.gms.internal.ads.zzacn
    public final boolean zzi(zzaco zzaco0) throws IOException {
        int v6;
        int v4;
        int v3;
        zzdy zzdy0 = new zzdy(10);
        int v = 0;
        while(true) {
            ((zzacc)zzaco0).zzm(zzdy0.zzN(), 0, 10, false);
            zzdy0.zzL(0);
            if(zzdy0.zzo() != 4801587) {
                break;
            }
            zzdy0.zzM(3);
            int v1 = zzdy0.zzl();
            v += v1 + 10;
            ((zzacc)zzaco0).zzl(v1, false);
        }
        zzaco0.zzj();
        ((zzacc)zzaco0).zzl(v, false);
        int v2 = v;
        while(true) {
            v3 = 0;
        label_14:
            v4 = 7;
            ((zzacc)zzaco0).zzm(zzdy0.zzN(), 0, 7, false);
            zzdy0.zzL(0);
            int v5 = zzdy0.zzq();
            if(v5 == 0xAC40 || v5 == 44097) {
                break;
            }
            zzaco0.zzj();
            ++v2;
            if(v2 - v < 0x2000) {
                ((zzacc)zzaco0).zzl(v2, false);
                continue;
            }
            return false;
        }
        ++v3;
        if(v3 >= 4) {
            return true;
        }
        byte[] arr_b = zzdy0.zzN();
        if(arr_b.length < 7) {
            v6 = -1;
        }
        else {
            int v7 = (arr_b[2] & 0xFF) << 8 | arr_b[3] & 0xFF;
            if(v7 == 0xFFFF) {
                v7 = (arr_b[4] & 0xFF) << 16 | (arr_b[5] & 0xFF) << 8 | arr_b[6] & 0xFF;
            }
            else {
                v4 = 4;
            }
            if(v5 == 44097) {
                v4 += 2;
            }
            v6 = v7 + v4;
        }
        if(v6 != -1) {
            ((zzacc)zzaco0).zzl(v6 - 7, false);
            goto label_14;
        }
        return false;
    }
}

