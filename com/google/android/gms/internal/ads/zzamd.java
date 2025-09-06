package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

public final class zzamd implements zzamj {
    private final zzdx zza;
    private final zzdy zzb;
    @Nullable
    private final String zzc;
    private final int zzd;
    private String zze;
    private zzadt zzf;
    private int zzg;
    private int zzh;
    private boolean zzi;
    private long zzj;
    private zzab zzk;
    private int zzl;
    private long zzm;

    public zzamd() {
        throw null;
    }

    public zzamd(@Nullable String s, int v) {
        zzdx zzdx0 = new zzdx(new byte[16], 16);
        this.zza = zzdx0;
        this.zzb = new zzdy(zzdx0.zza);
        this.zzg = 0;
        this.zzh = 0;
        this.zzi = false;
        this.zzm = 0x8000000000000001L;
        this.zzc = s;
        this.zzd = v;
    }

    @Override  // com.google.android.gms.internal.ads.zzamj
    public final void zza(zzdy zzdy0) {
        zzabo zzabo0;
        byte b;
        zzcw.zzb(this.zzf);
    label_1:
        while(zzdy0.zzb() > 0) {
            boolean z = true;
            switch(this.zzg) {
                case 0: {
                    while(true) {
                        if(zzdy0.zzb() <= 0) {
                            continue label_1;
                        }
                        if(this.zzi) {
                            int v2 = zzdy0.zzm();
                            this.zzi = v2 == 0xAC;
                            b = 0x40;
                            if(v2 == 0x40) {
                                break;
                            }
                            if(v2 == 65) {
                                v2 = 65;
                                break;
                            }
                        }
                        else {
                            this.zzi = zzdy0.zzm() == 0xAC;
                        }
                    }
                    this.zzg = 1;
                    zzdy zzdy1 = this.zzb;
                    zzdy1.zzN()[0] = -84;
                    if(v2 == 65) {
                        b = 65;
                    }
                    zzdy1.zzN()[1] = b;
                    this.zzh = 2;
                    continue;
                }
                case 1: {
                    int v3 = Math.min(zzdy0.zzb(), 16 - this.zzh);
                    zzdy0.zzH(this.zzb.zzN(), this.zzh, v3);
                    int v4 = this.zzh + v3;
                    this.zzh = v4;
                    if(v4 != 16) {
                        continue;
                    }
                    this.zza.zzl(0);
                    zzabo0 = zzabq.zza(this.zza);
                    if(this.zzk == null || this.zzk.zzD != 2 || zzabo0.zza != this.zzk.zzE || !"audio/ac4".equals(this.zzk.zzo)) {
                        zzz zzz0 = new zzz();
                        zzz0.zzM(this.zze);
                        zzz0.zzaa("audio/ac4");
                        zzz0.zzz(2);
                        zzz0.zzab(zzabo0.zza);
                        zzz0.zzQ(this.zzc);
                        zzz0.zzY(this.zzd);
                        zzab zzab0 = zzz0.zzag();
                        this.zzk = zzab0;
                        this.zzf.zzm(zzab0);
                    }
                    break;
                }
                default: {
                    int v = Math.min(zzdy0.zzb(), this.zzl - this.zzh);
                    this.zzf.zzr(zzdy0, v);
                    int v1 = this.zzh + v;
                    this.zzh = v1;
                    if(v1 != this.zzl) {
                        continue;
                    }
                    if(this.zzm == 0x8000000000000001L) {
                        z = false;
                    }
                    zzcw.zzf(z);
                    this.zzf.zzt(this.zzm, 1, this.zzl, 0, null);
                    this.zzm += this.zzj;
                    this.zzg = 0;
                    continue;
                }
            }
            this.zzl = zzabo0.zzb;
            this.zzj = ((long)zzabo0.zzc) * 1000000L / ((long)this.zzk.zzE);
            this.zzb.zzL(0);
            this.zzf.zzr(this.zzb, 16);
            this.zzg = 2;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzamj
    public final void zzb(zzacq zzacq0, zzanx zzanx0) {
        zzanx0.zzc();
        this.zze = zzanx0.zzb();
        this.zzf = zzacq0.zzw(zzanx0.zza(), 1);
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
        this.zzi = false;
        this.zzm = 0x8000000000000001L;
    }
}

