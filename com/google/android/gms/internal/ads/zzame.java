package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.List;

public final class zzame implements zzacn {
    private final zzamf zza;
    private final zzdy zzb;
    private final zzdy zzc;
    private final zzdx zzd;
    private zzacq zze;
    private long zzf;
    private long zzg;
    private boolean zzh;
    private boolean zzi;

    public zzame() {
        throw null;
    }

    public zzame(int v) {
        this.zza = new zzamf(true, null, 0);
        this.zzb = new zzdy(0x800);
        this.zzg = -1L;
        zzdy zzdy0 = new zzdy(10);
        this.zzc = zzdy0;
        byte[] arr_b = zzdy0.zzN();
        this.zzd = new zzdx(arr_b, arr_b.length);
    }

    @Override  // com.google.android.gms.internal.ads.zzacn
    public final int zzb(zzaco zzaco0, zzadj zzadj0) throws IOException {
        zzcw.zzb(this.zze);
        int v = zzaco0.zza(this.zzb.zzN(), 0, 0x800);
        if(!this.zzi) {
            this.zze.zzO(new zzadl(0x8000000000000001L, 0L));
            this.zzi = true;
        }
        if(v == -1) {
            return -1;
        }
        this.zzb.zzL(0);
        this.zzb.zzK(v);
        if(!this.zzh) {
            this.zza.zzd(this.zzf, 4);
            this.zzh = true;
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
        this.zze = zzacq0;
        zzanx zzanx0 = new zzanx(0x80000000, 0, 1);
        this.zza.zzb(zzacq0, zzanx0);
        zzacq0.zzD();
    }

    @Override  // com.google.android.gms.internal.ads.zzacn
    public final void zzf(long v, long v1) {
        this.zzh = false;
        this.zza.zze();
        this.zzf = v1;
    }

    @Override  // com.google.android.gms.internal.ads.zzacn
    public final boolean zzi(zzaco zzaco0) throws IOException {
        int v = 0;
        while(true) {
            ((zzacc)zzaco0).zzm(this.zzc.zzN(), 0, 10, false);
            this.zzc.zzL(0);
            if(this.zzc.zzo() != 4801587) {
                break;
            }
            this.zzc.zzM(3);
            int v1 = this.zzc.zzl();
            v += v1 + 10;
            ((zzacc)zzaco0).zzl(v1, false);
        }
        zzaco0.zzj();
        ((zzacc)zzaco0).zzl(v, false);
        if(this.zzg == -1L) {
            this.zzg = (long)v;
        }
        int v2 = v;
        int v3 = 0;
        int v4 = 0;
        do {
            ((zzacc)zzaco0).zzm(this.zzc.zzN(), 0, 2, false);
            this.zzc.zzL(0);
            if(zzamf.zzf(this.zzc.zzq())) {
                ++v3;
                if(v3 >= 4 && v4 > 0xBC) {
                    return true;
                }
                ((zzacc)zzaco0).zzm(this.zzc.zzN(), 0, 4, false);
                this.zzd.zzl(14);
                int v5 = this.zzd.zzd(13);
                if(v5 <= 6) {
                    ++v2;
                    zzaco0.zzj();
                    ((zzacc)zzaco0).zzl(v2, false);
                    v3 = 0;
                    v4 = 0;
                }
                else {
                    ((zzacc)zzaco0).zzl(v5 - 6, false);
                    v4 += v5;
                }
            }
            else {
                ++v2;
                zzaco0.zzj();
                ((zzacc)zzaco0).zzl(v2, false);
                v3 = 0;
                v4 = 0;
            }
        }
        while(v2 - v < 0x2000);
        return false;
    }
}

