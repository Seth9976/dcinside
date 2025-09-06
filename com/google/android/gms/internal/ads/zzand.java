package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

public final class zzand implements zzany {
    private final zzamj zza;
    private final zzdx zzb;
    private int zzc;
    private int zzd;
    private zzef zze;
    private boolean zzf;
    private boolean zzg;
    private boolean zzh;
    private int zzi;
    private int zzj;
    private boolean zzk;

    public zzand(zzamj zzamj0) {
        this.zza = zzamj0;
        this.zzb = new zzdx(new byte[10], 10);
        this.zzc = 0;
    }

    @Override  // com.google.android.gms.internal.ads.zzany
    public final void zza(zzdy zzdy0, int v) throws zzbc {
        long v19;
        int v18;
        int v8;
        zzcw.zzb(this.zze);
        if((v & 1) != 0) {
            switch(this.zzc) {
                case 0: 
                case 1: {
                    break;
                }
                case 2: {
                    zzdo.zzf("PesReader", "Unexpected start indicator reading extended header");
                    break;
                }
                default: {
                    int v1 = this.zzj;
                    if(v1 != -1) {
                        zzdo.zzf("PesReader", "Unexpected start indicator: expected " + v1 + " more bytes");
                    }
                    this.zza.zzc(zzdy0.zze() == 0);
                }
            }
            this.zze(1);
        }
        int v2 = v;
        while(zzdy0.zzb() > 0) {
            switch(this.zzc) {
                case 0: {
                    zzdy0.zzM(zzdy0.zzb());
                    continue;
                }
                case 1: {
                    if(!this.zzf(zzdy0, this.zzb.zza, 9)) {
                        continue;
                    }
                    this.zzb.zzl(0);
                    int v7 = this.zzb.zzd(24);
                    if(v7 == 1) {
                        this.zzb.zzn(8);
                        int v9 = this.zzb.zzd(16);
                        this.zzb.zzn(5);
                        this.zzk = this.zzb.zzp();
                        this.zzb.zzn(2);
                        this.zzf = this.zzb.zzp();
                        this.zzg = this.zzb.zzp();
                        this.zzb.zzn(6);
                        int v10 = this.zzb.zzd(8);
                        this.zzi = v10;
                        if(v9 == 0) {
                            this.zzj = -1;
                        }
                        else {
                            int v11 = v9 - 3 - v10;
                            this.zzj = v11;
                            if(v11 < 0) {
                                zzdo.zzf("PesReader", "Found negative packet payload size: " + v11);
                                this.zzj = -1;
                            }
                        }
                        v8 = 2;
                    }
                    else {
                        zzdo.zzf("PesReader", "Unexpected start code prefix: " + v7);
                        this.zzj = -1;
                        v8 = 0;
                    }
                    this.zze(v8);
                    continue;
                }
                case 2: {
                    if(!this.zzf(zzdy0, this.zzb.zza, Math.min(10, this.zzi)) || !this.zzf(zzdy0, null, this.zzi)) {
                        continue;
                    }
                    this.zzb.zzl(0);
                    if(this.zzf) {
                        this.zzb.zzn(4);
                        long v12 = (long)this.zzb.zzd(3);
                        this.zzb.zzn(1);
                        int v13 = this.zzb.zzd(15) << 15;
                        this.zzb.zzn(1);
                        long v14 = (long)this.zzb.zzd(15);
                        this.zzb.zzn(1);
                        if(this.zzh || !this.zzg) {
                            v18 = v13;
                        }
                        else {
                            this.zzb.zzn(4);
                            long v15 = ((long)this.zzb.zzd(3)) << 30;
                            this.zzb.zzn(1);
                            int v16 = this.zzb.zzd(15);
                            this.zzb.zzn(1);
                            long v17 = (long)this.zzb.zzd(15);
                            this.zzb.zzn(1);
                            v18 = v13;
                            this.zze.zzb(v15 | ((long)(v16 << 15)) | v17);
                            this.zzh = true;
                        }
                        v19 = this.zze.zzb(v12 << 30 | ((long)v18) | v14);
                    }
                    else {
                        v19 = 0x8000000000000001L;
                    }
                    break;
                }
                default: {
                    int v3 = zzdy0.zzb();
                    int v4 = this.zzj == -1 ? 0 : v3 - this.zzj;
                    if(v4 > 0) {
                        v3 -= v4;
                        zzdy0.zzK(zzdy0.zzd() + v3);
                    }
                    this.zza.zza(zzdy0);
                    int v5 = this.zzj;
                    if(v5 == -1) {
                        continue;
                    }
                    int v6 = v5 - v3;
                    this.zzj = v6;
                    if(v6 != 0) {
                        continue;
                    }
                    this.zza.zzc(false);
                    this.zze(1);
                    continue;
                }
            }
            v2 |= (this.zzk ? 4 : 0);
            this.zza.zzd(v19, v2);
            this.zze(3);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzany
    public final void zzb(zzef zzef0, zzacq zzacq0, zzanx zzanx0) {
        this.zze = zzef0;
        this.zza.zzb(zzacq0, zzanx0);
    }

    @Override  // com.google.android.gms.internal.ads.zzany
    public final void zzc() {
        this.zzc = 0;
        this.zzd = 0;
        this.zzh = false;
        this.zza.zze();
    }

    public final boolean zzd(boolean z) {
        return this.zzc == 3 && this.zzj == -1;
    }

    private final void zze(int v) {
        this.zzc = v;
        this.zzd = 0;
    }

    private final boolean zzf(zzdy zzdy0, @Nullable byte[] arr_b, int v) {
        int v1 = Math.min(zzdy0.zzb(), v - this.zzd);
        if(v1 <= 0) {
            return true;
        }
        if(arr_b == null) {
            zzdy0.zzM(v1);
        }
        else {
            zzdy0.zzH(arr_b, this.zzd, v1);
        }
        int v2 = this.zzd + v1;
        this.zzd = v2;
        return v2 == v;
    }
}

