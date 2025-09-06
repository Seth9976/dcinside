package com.google.android.gms.internal.ads;

import h4.m;
import java.util.ArrayList;
import java.util.Arrays;

public final class zzamq implements zzamj {
    private final zzann zza;
    private final zzanb zzb;
    private final zzanb zzc;
    private final zzanb zzd;
    private long zze;
    private final boolean[] zzf;
    private String zzg;
    private zzadt zzh;
    private zzamp zzi;
    private boolean zzj;
    private long zzk;
    private boolean zzl;
    private final zzdy zzm;

    public zzamq(zzann zzann0, boolean z, boolean z1) {
        this.zza = zzann0;
        this.zzf = new boolean[3];
        this.zzb = new zzanb(7, 0x80);
        this.zzc = new zzanb(8, 0x80);
        this.zzd = new zzanb(6, 0x80);
        this.zzk = 0x8000000000000001L;
        this.zzm = new zzdy();
    }

    @Override  // com.google.android.gms.internal.ads.zzamj
    public final void zza(zzdy zzdy0) {
        int v9;
        zzcw.zzb(this.zzh);
        int v = zzdy0.zzd();
        int v1 = zzdy0.zze();
        byte[] arr_b = zzdy0.zzN();
        this.zze += (long)zzdy0.zzb();
        this.zzh.zzr(zzdy0, zzdy0.zzb());
        int v2;
        while((v2 = zzfk.zza(arr_b, v, v1, this.zzf)) != v1) {
            int v3 = arr_b[v2 + 3] & 0x1F;
            int v4 = v2 - v;
            if(v4 > 0) {
                this.zzf(arr_b, v, v2);
            }
            int v5 = v1 - v2;
            long v6 = this.zze - ((long)v5);
            int v7 = v4 >= 0 ? 0 : -v4;
            long v8 = this.zzk;
            if(this.zzj) {
                v9 = v2 + 3;
            }
            else {
                this.zzb.zzd(v7);
                this.zzc.zzd(v7);
                if(this.zzj) {
                    v9 = v2 + 3;
                    zzanb zzanb0 = this.zzb;
                    if(zzanb0.zze()) {
                        zzfj zzfj1 = zzfk.zzf(zzanb0.zza, 4, zzanb0.zzb);
                        this.zza.zze(zzfj1.zzm);
                        this.zzi.zzc(zzfj1);
                        this.zzb.zzb();
                    }
                    else {
                        zzanb zzanb1 = this.zzc;
                        if(zzanb1.zze()) {
                            zzfi zzfi1 = zzfk.zze(zzanb1.zza, 4, zzanb1.zzb);
                            this.zzi.zzb(zzfi1);
                            this.zzc.zzb();
                        }
                    }
                }
                else if(!this.zzb.zze() || !this.zzc.zze()) {
                    v9 = v2 + 3;
                }
                else {
                    ArrayList arrayList0 = new ArrayList();
                    arrayList0.add(Arrays.copyOf(this.zzb.zza, this.zzb.zzb));
                    arrayList0.add(Arrays.copyOf(this.zzc.zza, this.zzc.zzb));
                    zzfj zzfj0 = zzfk.zzf(this.zzb.zza, 4, this.zzb.zzb);
                    zzfi zzfi0 = zzfk.zze(this.zzc.zza, 4, this.zzc.zzb);
                    v9 = v2 + 3;
                    zzadt zzadt0 = this.zzh;
                    zzz zzz0 = new zzz();
                    zzz0.zzM(this.zzg);
                    zzz0.zzaa("video/avc");
                    zzz0.zzA(zzcy.zzc(zzfj0.zza, zzfj0.zzb, zzfj0.zzc));
                    zzz0.zzaf(zzfj0.zze);
                    zzz0.zzK(zzfj0.zzf);
                    zzi zzi0 = new zzi();
                    zzi0.zzc(zzfj0.zzj);
                    zzi0.zzb(zzfj0.zzk);
                    zzi0.zzd(zzfj0.zzl);
                    zzi0.zzf(zzfj0.zzh + 8);
                    zzi0.zza(zzfj0.zzi + 8);
                    zzz0.zzB(zzi0.zzg());
                    zzz0.zzW(zzfj0.zzg);
                    zzz0.zzN(arrayList0);
                    zzz0.zzS(zzfj0.zzm);
                    zzadt0.zzm(zzz0.zzag());
                    this.zzj = true;
                    this.zzi.zzc(zzfj0);
                    this.zzi.zzb(zzfi0);
                    this.zzb.zzb();
                    this.zzc.zzb();
                }
            }
            if(this.zzd.zzd(v7)) {
                int v10 = zzfk.zzb(this.zzd.zza, this.zzd.zzb);
                this.zzm.zzJ(this.zzd.zza, v10);
                this.zzm.zzL(4);
                this.zza.zza(v8, this.zzm);
            }
            if(this.zzi.zzf(v6, v5, this.zzj)) {
                this.zzl = false;
            }
            long v11 = this.zzk;
            if(!this.zzj) {
                this.zzb.zzc(v3);
                this.zzc.zzc(v3);
            }
            this.zzd.zzc(v3);
            this.zzi.zze(v6, v3, v11, this.zzl);
            v = v9;
        }
        this.zzf(arr_b, v, v1);
    }

    @Override  // com.google.android.gms.internal.ads.zzamj
    public final void zzb(zzacq zzacq0, zzanx zzanx0) {
        zzanx0.zzc();
        this.zzg = zzanx0.zzb();
        zzadt zzadt0 = zzacq0.zzw(zzanx0.zza(), 2);
        this.zzh = zzadt0;
        this.zzi = new zzamp(zzadt0, false, false);
        this.zza.zzb(zzacq0, zzanx0);
    }

    @Override  // com.google.android.gms.internal.ads.zzamj
    public final void zzc(boolean z) {
        zzcw.zzb(this.zzh);
        if(z) {
            this.zza.zzc();
            this.zzi.zza(this.zze);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzamj
    public final void zzd(long v, int v1) {
        this.zzk = v;
        this.zzl |= (v1 & 2) != 0;
    }

    @Override  // com.google.android.gms.internal.ads.zzamj
    public final void zze() {
        this.zze = 0L;
        this.zzl = false;
        this.zzk = 0x8000000000000001L;
        zzfk.zzh(this.zzf);
        this.zzb.zzb();
        this.zzc.zzb();
        this.zzd.zzb();
        this.zza.zzc();
        zzamp zzamp0 = this.zzi;
        if(zzamp0 != null) {
            zzamp0.zzd();
        }
    }

    @m({"sampleReader"})
    private final void zzf(byte[] arr_b, int v, int v1) {
        if(!this.zzj) {
            this.zzb.zza(arr_b, v, v1);
            this.zzc.zza(arr_b, v, v1);
        }
        this.zzd.zza(arr_b, v, v1);
    }
}

