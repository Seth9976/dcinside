package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

public final class zzami implements zzamj {
    private final List zza;
    private final zzadt[] zzb;
    private boolean zzc;
    private int zzd;
    private int zze;
    private long zzf;

    public zzami(List list0) {
        this.zza = list0;
        this.zzb = new zzadt[list0.size()];
        this.zzf = 0x8000000000000001L;
    }

    @Override  // com.google.android.gms.internal.ads.zzamj
    public final void zza(zzdy zzdy0) {
        if(this.zzc && (this.zzd != 2 || this.zzf(zzdy0, 0x20)) && (this.zzd != 1 || this.zzf(zzdy0, 0))) {
            int v1 = zzdy0.zzd();
            int v2 = zzdy0.zzb();
            zzadt[] arr_zzadt = this.zzb;
            for(int v = 0; v < arr_zzadt.length; ++v) {
                zzadt zzadt0 = arr_zzadt[v];
                zzdy0.zzL(v1);
                zzadt0.zzr(zzdy0, v2);
            }
            this.zze += v2;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzamj
    public final void zzb(zzacq zzacq0, zzanx zzanx0) {
        for(int v = 0; v < this.zzb.length; ++v) {
            zzanu zzanu0 = (zzanu)this.zza.get(v);
            zzanx0.zzc();
            zzadt zzadt0 = zzacq0.zzw(zzanx0.zza(), 3);
            zzz zzz0 = new zzz();
            zzz0.zzM(zzanx0.zzb());
            zzz0.zzaa("application/dvbsubs");
            zzz0.zzN(Collections.singletonList(zzanu0.zzb));
            zzz0.zzQ(zzanu0.zza);
            zzadt0.zzm(zzz0.zzag());
            this.zzb[v] = zzadt0;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzamj
    public final void zzc(boolean z) {
        if(this.zzc) {
            zzcw.zzf(this.zzf != 0x8000000000000001L);
            zzadt[] arr_zzadt = this.zzb;
            for(int v = 0; v < arr_zzadt.length; ++v) {
                arr_zzadt[v].zzt(this.zzf, 1, this.zze, 0, null);
            }
            this.zzc = false;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzamj
    public final void zzd(long v, int v1) {
        if((v1 & 4) == 0) {
            return;
        }
        this.zzc = true;
        this.zzf = v;
        this.zze = 0;
        this.zzd = 2;
    }

    @Override  // com.google.android.gms.internal.ads.zzamj
    public final void zze() {
        this.zzc = false;
        this.zzf = 0x8000000000000001L;
    }

    private final boolean zzf(zzdy zzdy0, int v) {
        if(zzdy0.zzb() == 0) {
            return false;
        }
        if(zzdy0.zzm() != v) {
            this.zzc = false;
        }
        --this.zzd;
        return this.zzc;
    }
}

