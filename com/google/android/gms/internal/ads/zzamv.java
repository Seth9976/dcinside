package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

public final class zzamv implements zzamj {
    private final zzdy zza;
    private final zzadf zzb;
    @Nullable
    private final String zzc;
    private final int zzd;
    private zzadt zze;
    private String zzf;
    private int zzg;
    private int zzh;
    private boolean zzi;
    private boolean zzj;
    private long zzk;
    private int zzl;
    private long zzm;

    public zzamv() {
        throw null;
    }

    public zzamv(@Nullable String s, int v) {
        this.zzg = 0;
        zzdy zzdy0 = new zzdy(4);
        this.zza = zzdy0;
        zzdy0.zzN()[0] = -1;
        this.zzb = new zzadf();
        this.zzm = 0x8000000000000001L;
        this.zzc = s;
        this.zzd = v;
    }

    @Override  // com.google.android.gms.internal.ads.zzamj
    public final void zza(zzdy zzdy0) {
        zzcw.zzb(this.zze);
    label_1:
        while(zzdy0.zzb() > 0) {
            boolean z = true;
            switch(this.zzg) {
                case 0: {
                    byte[] arr_b = zzdy0.zzN();
                    int v2 = zzdy0.zzd();
                    int v3 = zzdy0.zze();
                    while(v2 < v3) {
                        int v4 = arr_b[v2];
                        boolean z1 = this.zzj && (v4 & 0xE0) == 0xE0;
                        this.zzj = (v4 & 0xFF) == 0xFF;
                        if(z1) {
                            zzdy0.zzL(v2 + 1);
                            this.zzj = false;
                            this.zza.zzN()[1] = arr_b[v2];
                            this.zzh = 2;
                            this.zzg = 1;
                            continue label_1;
                        }
                        ++v2;
                    }
                    zzdy0.zzL(v3);
                    continue;
                }
                case 1: {
                    int v5 = Math.min(zzdy0.zzb(), 4 - this.zzh);
                    zzdy0.zzH(this.zza.zzN(), this.zzh, v5);
                    int v6 = this.zzh + v5;
                    this.zzh = v6;
                    if(v6 < 4) {
                        continue;
                    }
                    this.zza.zzL(0);
                    int v7 = this.zza.zzg();
                    if(!this.zzb.zza(v7)) {
                        this.zzh = 0;
                        this.zzg = 1;
                        continue;
                    }
                    zzadf zzadf0 = this.zzb;
                    this.zzl = zzadf0.zzc;
                    if(!this.zzi) {
                        this.zzk = ((long)zzadf0.zzg) * 1000000L / ((long)zzadf0.zzd);
                        zzz zzz0 = new zzz();
                        zzz0.zzM(this.zzf);
                        zzz0.zzaa(this.zzb.zzb);
                        zzz0.zzR(0x1000);
                        zzz0.zzz(this.zzb.zze);
                        zzz0.zzab(this.zzb.zzd);
                        zzz0.zzQ(this.zzc);
                        zzz0.zzY(this.zzd);
                        zzab zzab0 = zzz0.zzag();
                        this.zze.zzm(zzab0);
                        this.zzi = true;
                    }
                    break;
                }
                default: {
                    int v = Math.min(zzdy0.zzb(), this.zzl - this.zzh);
                    this.zze.zzr(zzdy0, v);
                    int v1 = this.zzh + v;
                    this.zzh = v1;
                    if(v1 < this.zzl) {
                        continue;
                    }
                    if(this.zzm == 0x8000000000000001L) {
                        z = false;
                    }
                    zzcw.zzf(z);
                    this.zze.zzt(this.zzm, 1, this.zzl, 0, null);
                    this.zzm += this.zzk;
                    this.zzh = 0;
                    this.zzg = 0;
                    continue;
                }
            }
            this.zza.zzL(0);
            this.zze.zzr(this.zza, 4);
            this.zzg = 2;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzamj
    public final void zzb(zzacq zzacq0, zzanx zzanx0) {
        zzanx0.zzc();
        this.zzf = zzanx0.zzb();
        this.zze = zzacq0.zzw(zzanx0.zza(), 1);
    }

    @Override  // com.google.android.gms.internal.ads.zzamj
    public final void zzc(boolean z) {
    }

    @Override  // com.google.android.gms.internal.ads.zzamj
    public final void zzd(long v, int v1) {
        this.zzm = v;
    }

    @Override  // com.google.android.gms.internal.ads.zzamj
    public final void zze() {
        this.zzg = 0;
        this.zzh = 0;
        this.zzj = false;
        this.zzm = 0x8000000000000001L;
    }
}

