package com.google.android.gms.internal.ads;

import java.util.List;

public final class zzamw implements zzamj {
    private final zzdy zza;
    private final zzdx zzb;
    private final zzdy zzc;
    private int zzd;
    private String zze;
    private zzadt zzf;
    private double zzg;
    private double zzh;
    private boolean zzi;
    private boolean zzj;
    private int zzk;
    private int zzl;
    private boolean zzm;
    private int zzn;
    private int zzo;
    private final zzamx zzp;
    private int zzq;
    private int zzr;
    private int zzs;
    private long zzt;
    private boolean zzu;

    public zzamw() {
        this.zzd = 0;
        this.zza = new zzdy(new byte[15], 2);
        this.zzb = new zzdx();
        this.zzc = new zzdy();
        this.zzp = new zzamx();
        this.zzq = 0x80000001;
        this.zzr = -1;
        this.zzt = -1L;
        this.zzj = true;
        this.zzm = true;
        this.zzg = -9223372036854776000.0;
        this.zzh = -9223372036854776000.0;
    }

    @Override  // com.google.android.gms.internal.ads.zzamj
    public final void zza(zzdy zzdy0) throws zzbc {
        int v5;
        int v4;
        zzcw.zzb(this.zzf);
    label_1:
        while(zzdy0.zzb() > 0) {
            switch(this.zzd) {
                case 0: {
                    int v8 = this.zzk;
                    if((v8 & 2) == 0) {
                        zzdy0.zzL(zzdy0.zze());
                    }
                    else {
                        if((v8 & 4) == 0) {
                            do {
                                if(zzdy0.zzb() <= 0) {
                                    continue label_1;
                                }
                                int v9 = this.zzl << 8;
                                this.zzl = v9;
                                int v10 = v9 | zzdy0.zzm();
                                this.zzl = v10;
                            }
                            while((v10 & 0xFFFFFF) != 0xC001A5);
                            zzdy0.zzL(zzdy0.zzd() - 3);
                            this.zzl = 0;
                        }
                        this.zzd = 1;
                    }
                    continue;
                }
                case 1: {
                    zzamw.zzf(zzdy0, this.zza, false);
                    zzdy zzdy1 = this.zza;
                    if(zzdy1.zzb() == 0) {
                        int v11 = zzdy1.zze();
                        this.zzb.zzk(zzdy1.zzN(), v11);
                        if(zzana.zzb(this.zzb, this.zzp)) {
                            this.zzn = 0;
                            this.zzo += this.zzp.zzc + v11;
                            this.zza.zzL(0);
                            this.zzf.zzr(this.zza, this.zza.zze());
                            this.zza.zzI(2);
                            this.zzc.zzI(this.zzp.zzc);
                            this.zzm = true;
                            this.zzd = 2;
                            continue;
                        }
                        else {
                            zzdy zzdy2 = this.zza;
                            if(zzdy2.zze() >= 15) {
                                continue;
                            }
                            zzdy2.zzK(zzdy2.zze() + 1);
                        }
                    }
                    break;
                }
                default: {
                    if(this.zzp.zza == 1 || this.zzp.zza == 17) {
                        zzamw.zzf(zzdy0, this.zzc, true);
                    }
                    int v = Math.min(zzdy0.zzb(), this.zzp.zzc - this.zzn);
                    this.zzf.zzr(zzdy0, v);
                    int v1 = this.zzn + v;
                    this.zzn = v1;
                    zzamx zzamx0 = this.zzp;
                    if(v1 != zzamx0.zzc) {
                        continue;
                    }
                    int v2 = zzamx0.zza;
                    if(v2 == 1) {
                        byte[] arr_b = this.zzc.zzN();
                        zzamy zzamy0 = zzana.zza(new zzdx(arr_b, arr_b.length));
                        this.zzq = zzamy0.zzb;
                        this.zzr = zzamy0.zzc;
                        long v3 = this.zzp.zzb;
                        if(this.zzt != v3) {
                            this.zzt = v3;
                            String s = zzamy0.zza == -1 ? "mhm1" : "mhm1" + String.format(".%02X", zzamy0.zza);
                            byte[] arr_b1 = zzamy0.zzd;
                            List list0 = null;
                            if(arr_b1 != null && arr_b1.length > 0) {
                                list0 = zzfxn.zzp(zzei.zzf, arr_b1);
                            }
                            zzz zzz0 = new zzz();
                            zzz0.zzM(this.zze);
                            zzz0.zzaa("audio/mhm1");
                            zzz0.zzab(this.zzq);
                            zzz0.zzA(s);
                            zzz0.zzN(list0);
                            zzab zzab0 = zzz0.zzag();
                            this.zzf.zzm(zzab0);
                        }
                        this.zzu = true;
                    }
                    else if(v2 == 17) {
                        byte[] arr_b2 = this.zzc.zzN();
                        zzdx zzdx0 = new zzdx(arr_b2, arr_b2.length);
                        if(zzdx0.zzp()) {
                            zzdx0.zzn(2);
                            v4 = zzdx0.zzd(13);
                        }
                        else {
                            v4 = 0;
                        }
                        this.zzs = v4;
                    }
                    else if(v2 == 2) {
                        if(this.zzu) {
                            this.zzj = false;
                            v5 = 1;
                        }
                        else {
                            v5 = 0;
                        }
                        int v6 = this.zzr - this.zzs;
                        double f = (double)this.zzq;
                        long v7 = Math.round(this.zzg);
                        if(this.zzi) {
                            this.zzi = false;
                            this.zzg = this.zzh;
                        }
                        else {
                            this.zzg += ((double)v6) * 1000000.0 / f;
                        }
                        this.zzf.zzt(v7, v5, this.zzo, 0, null);
                        this.zzu = false;
                        this.zzs = 0;
                        this.zzo = 0;
                    }
                    this.zzd = 1;
                    continue;
                }
            }
            this.zzm = false;
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
        this.zzk = v1;
        if(!this.zzj && (this.zzo != 0 || !this.zzm)) {
            this.zzi = true;
        }
        if(v != 0x8000000000000001L) {
            if(this.zzi) {
                this.zzh = (double)v;
                return;
            }
            this.zzg = (double)v;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzamj
    public final void zze() {
        this.zzd = 0;
        this.zzl = 0;
        this.zza.zzI(2);
        this.zzn = 0;
        this.zzo = 0;
        this.zzq = 0x80000001;
        this.zzr = -1;
        this.zzs = 0;
        this.zzt = -1L;
        this.zzu = false;
        this.zzi = false;
        this.zzm = true;
        this.zzj = true;
        this.zzg = -9223372036854776000.0;
        this.zzh = -9223372036854776000.0;
    }

    private static final void zzf(zzdy zzdy0, zzdy zzdy1, boolean z) {
        int v = zzdy0.zzd();
        int v1 = Math.min(zzdy0.zzb(), zzdy1.zzb());
        zzdy0.zzH(zzdy1.zzN(), zzdy1.zzd(), v1);
        zzdy1.zzM(v1);
        if(z) {
            zzdy0.zzL(v);
        }
    }
}

