package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import j..util.Objects;

public final class zzamb implements zzamj {
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

    public zzamb() {
        throw null;
    }

    public zzamb(@Nullable String s, int v) {
        zzdx zzdx0 = new zzdx(new byte[0x80], 0x80);
        this.zza = zzdx0;
        this.zzb = new zzdy(zzdx0.zza);
        this.zzg = 0;
        this.zzm = 0x8000000000000001L;
        this.zzc = s;
        this.zzd = v;
    }

    @Override  // com.google.android.gms.internal.ads.zzamj
    public final void zza(zzdy zzdy0) {
        zzabl zzabl0;
        zzcw.zzb(this.zzf);
        while(zzdy0.zzb() > 0) {
            boolean z = true;
            switch(this.zzg) {
                case 0: {
                    while(zzdy0.zzb() > 0) {
                        if(this.zzi) {
                            int v2 = zzdy0.zzm();
                            if(v2 == 0x77) {
                                this.zzi = false;
                                this.zzg = 1;
                                this.zzb.zzN()[0] = 11;
                                this.zzb.zzN()[1] = 0x77;
                                this.zzh = 2;
                                break;
                            }
                            this.zzi = v2 == 11;
                        }
                        else {
                            this.zzi = zzdy0.zzm() == 11;
                        }
                    }
                    continue;
                }
                case 1: {
                    int v3 = Math.min(zzdy0.zzb(), 0x80 - this.zzh);
                    zzdy0.zzH(this.zzb.zzN(), this.zzh, v3);
                    int v4 = this.zzh + v3;
                    this.zzh = v4;
                    if(v4 != 0x80) {
                        continue;
                    }
                    this.zza.zzl(0);
                    zzabl0 = zzabn.zze(this.zza);
                    if(this.zzk == null || zzabl0.zzc != this.zzk.zzD || zzabl0.zzb != this.zzk.zzE || !Objects.equals(zzabl0.zza, this.zzk.zzo)) {
                        zzz zzz0 = new zzz();
                        zzz0.zzM(this.zze);
                        zzz0.zzaa(zzabl0.zza);
                        zzz0.zzz(zzabl0.zzc);
                        zzz0.zzab(zzabl0.zzb);
                        zzz0.zzQ(this.zzc);
                        zzz0.zzY(this.zzd);
                        zzz0.zzV(zzabl0.zzf);
                        if("audio/ac3".equals(zzabl0.zza)) {
                            zzz0.zzy(zzabl0.zzf);
                        }
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
            this.zzl = zzabl0.zzd;
            this.zzj = ((long)zzabl0.zze) * 1000000L / ((long)this.zzk.zzE);
            this.zzb.zzL(0);
            this.zzf.zzr(this.zzb, 0x80);
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

