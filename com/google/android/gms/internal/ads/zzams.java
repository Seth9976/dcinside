package com.google.android.gms.internal.ads;

import h4.m;
import java.util.Collections;

public final class zzams implements zzamj {
    private final zzann zza;
    private String zzb;
    private zzadt zzc;
    private zzamr zzd;
    private boolean zze;
    private final boolean[] zzf;
    private final zzanb zzg;
    private final zzanb zzh;
    private final zzanb zzi;
    private final zzanb zzj;
    private final zzanb zzk;
    private long zzl;
    private long zzm;
    private final zzdy zzn;

    public zzams(zzann zzann0) {
        this.zza = zzann0;
        this.zzf = new boolean[3];
        this.zzg = new zzanb(0x20, 0x80);
        this.zzh = new zzanb(33, 0x80);
        this.zzi = new zzanb(34, 0x80);
        this.zzj = new zzanb(39, 0x80);
        this.zzk = new zzanb(40, 0x80);
        this.zzm = 0x8000000000000001L;
        this.zzn = new zzdy();
    }

    @Override  // com.google.android.gms.internal.ads.zzamj
    public final void zza(zzdy zzdy0) {
        int v12;
        byte[] arr_b2;
        int v11;
        int v9;
        zzcw.zzb(this.zzc);
        while(zzdy0.zzb() > 0) {
            int v = zzdy0.zzd();
            int v1 = zzdy0.zze();
            byte[] arr_b = zzdy0.zzN();
            this.zzl += (long)zzdy0.zzb();
            this.zzc.zzr(zzdy0, zzdy0.zzb());
            while(v < v1) {
                int v2 = zzfk.zza(arr_b, v, v1, this.zzf);
                if(v2 != v1) {
                    int v3 = arr_b[v2 + 3] & 0x7E;
                    int v4 = v2 - v;
                    if(v4 > 0) {
                        this.zzf(arr_b, v, v2);
                    }
                    int v5 = v1 - v2;
                    long v6 = this.zzl - ((long)v5);
                    int v7 = v4 >= 0 ? 0 : -v4;
                    long v8 = this.zzm;
                    this.zzd.zzb(v6, v5, this.zze);
                    if(this.zze) {
                        v11 = v1;
                        arr_b2 = arr_b;
                        v9 = v2 + 3;
                        v12 = v5;
                    }
                    else {
                        this.zzg.zzd(v7);
                        this.zzh.zzd(v7);
                        this.zzi.zzd(v7);
                        zzanb zzanb0 = this.zzg;
                        if(zzanb0.zze()) {
                            zzanb zzanb1 = this.zzh;
                            if(zzanb1.zze()) {
                                zzanb zzanb2 = this.zzi;
                                if(zzanb2.zze()) {
                                    String s = this.zzb;
                                    v9 = v2 + 3;
                                    int v10 = zzanb0.zzb;
                                    v11 = v1;
                                    byte[] arr_b1 = new byte[zzanb1.zzb + v10 + zzanb2.zzb];
                                    arr_b2 = arr_b;
                                    System.arraycopy(zzanb0.zza, 0, arr_b1, 0, v10);
                                    v12 = v5;
                                    System.arraycopy(zzanb1.zza, 0, arr_b1, zzanb0.zzb, zzanb1.zzb);
                                    System.arraycopy(zzanb2.zza, 0, arr_b1, zzanb0.zzb + zzanb1.zzb, zzanb2.zzb);
                                    String s1 = null;
                                    zzfe zzfe0 = zzfk.zzc(zzanb1.zza, 3, zzanb1.zzb, null);
                                    zzez zzez0 = zzfe0.zza;
                                    if(zzez0 != null) {
                                        s1 = zzcy.zzd(zzez0.zza, zzez0.zzb, zzez0.zzc, zzez0.zzd, zzez0.zze, zzez0.zzf);
                                    }
                                    zzz zzz0 = new zzz();
                                    zzz0.zzM(s);
                                    zzz0.zzaa("video/hevc");
                                    zzz0.zzA(s1);
                                    zzz0.zzaf(zzfe0.zzd);
                                    zzz0.zzK(zzfe0.zze);
                                    zzi zzi0 = new zzi();
                                    zzi0.zzc(zzfe0.zzh);
                                    zzi0.zzb(zzfe0.zzi);
                                    zzi0.zzd(zzfe0.zzj);
                                    zzi0.zzf(zzfe0.zzb + 8);
                                    zzi0.zza(zzfe0.zzc + 8);
                                    zzz0.zzB(zzi0.zzg());
                                    zzz0.zzW(zzfe0.zzf);
                                    zzz0.zzS(zzfe0.zzg);
                                    zzz0.zzN(Collections.singletonList(arr_b1));
                                    zzab zzab0 = zzz0.zzag();
                                    this.zzc.zzm(zzab0);
                                    zzfun.zzl(zzab0.zzq != -1);
                                    this.zza.zze(zzab0.zzq);
                                    this.zze = true;
                                }
                            }
                        }
                    }
                    if(this.zzj.zzd(v7)) {
                        int v13 = zzfk.zzb(this.zzj.zza, this.zzj.zzb);
                        this.zzn.zzJ(this.zzj.zza, v13);
                        this.zzn.zzM(5);
                        this.zza.zza(v8, this.zzn);
                    }
                    if(this.zzk.zzd(v7)) {
                        int v14 = zzfk.zzb(this.zzk.zza, this.zzk.zzb);
                        this.zzn.zzJ(this.zzk.zza, v14);
                        this.zzn.zzM(5);
                        this.zza.zza(v8, this.zzn);
                    }
                    this.zzd.zze(v6, v12, v3 >> 1, this.zzm, this.zze);
                    if(!this.zze) {
                        this.zzg.zzc(v3 >> 1);
                        this.zzh.zzc(v3 >> 1);
                        this.zzi.zzc(v3 >> 1);
                    }
                    this.zzj.zzc(v3 >> 1);
                    this.zzk.zzc(v3 >> 1);
                    v = v9;
                    v1 = v11;
                    arr_b = arr_b2;
                    continue;
                }
                this.zzf(arr_b, v, v1);
                return;
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzamj
    public final void zzb(zzacq zzacq0, zzanx zzanx0) {
        zzanx0.zzc();
        this.zzb = zzanx0.zzb();
        zzadt zzadt0 = zzacq0.zzw(zzanx0.zza(), 2);
        this.zzc = zzadt0;
        this.zzd = new zzamr(zzadt0);
        this.zza.zzb(zzacq0, zzanx0);
    }

    @Override  // com.google.android.gms.internal.ads.zzamj
    public final void zzc(boolean z) {
        zzcw.zzb(this.zzc);
        if(z) {
            this.zza.zzc();
            this.zzd.zza(this.zzl);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzamj
    public final void zzd(long v, int v1) {
        this.zzm = v;
    }

    @Override  // com.google.android.gms.internal.ads.zzamj
    public final void zze() {
        this.zzl = 0L;
        this.zzm = 0x8000000000000001L;
        zzfk.zzh(this.zzf);
        this.zzg.zzb();
        this.zzh.zzb();
        this.zzi.zzb();
        this.zzj.zzb();
        this.zzk.zzb();
        this.zza.zzc();
        zzamr zzamr0 = this.zzd;
        if(zzamr0 != null) {
            zzamr0.zzd();
        }
    }

    @m({"sampleReader"})
    private final void zzf(byte[] arr_b, int v, int v1) {
        this.zzd.zzc(arr_b, v, v1);
        if(!this.zze) {
            this.zzg.zza(arr_b, v, v1);
            this.zzh.zza(arr_b, v, v1);
            this.zzi.zza(arr_b, v, v1);
        }
        this.zzj.zza(arr_b, v, v1);
        this.zzk.zza(arr_b, v, v1);
    }
}

