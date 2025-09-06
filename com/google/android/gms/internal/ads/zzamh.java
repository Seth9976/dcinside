package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import h4.m;
import j..util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

public final class zzamh implements zzamj {
    private final zzdy zza;
    private final AtomicInteger zzb;
    @Nullable
    private final String zzc;
    private final int zzd;
    private String zze;
    private zzadt zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private long zzj;
    private zzab zzk;
    private int zzl;
    private int zzm;
    private int zzn;
    private int zzo;
    private long zzp;

    public zzamh(@Nullable String s, int v, int v1) {
        this.zza = new zzdy(new byte[v1]);
        this.zzg = 0;
        this.zzp = 0x8000000000000001L;
        this.zzb = new AtomicInteger();
        this.zzn = -1;
        this.zzo = -1;
        this.zzc = s;
        this.zzd = v;
    }

    // This method was un-flattened
    @Override  // com.google.android.gms.internal.ads.zzamj
    public final void zza(zzdy zzdy0) throws zzbc {
        int v15;
        int v12;
        int v11;
        int v10;
        zzcw.zzb(this.zzf);
        while(zzdy0.zzb() > 0) {
            int v = this.zzg;
            if(v == 0) {
                while(zzdy0.zzb() > 0) {
                    int v13 = this.zzi << 8;
                    this.zzi = v13;
                    int v14 = v13 | zzdy0.zzm();
                    this.zzi = v14;
                    switch(v14) {
                        case 0xF21B4140: 
                        case 1078008818: {
                            v15 = 3;
                            this.zzm = 3;
                            goto label_110;
                        }
                        case 0x25205864: 
                        case 0x64582025: {
                            v15 = 2;
                            this.zzm = 2;
                            goto label_110;
                        }
                        case 0xE842C471: 
                        case 1908687592: {
                            break;
                        }
                        case 0xFE7F0180: 
                        case 0xFF1F00E8: 
                        case 0x1FFFE800: 
                        case 0x7FFE8001: {
                            v15 = 1;
                            this.zzm = 1;
                            goto label_110;
                        }
                        default: {
                            this.zzm = 0;
                            continue;
                        }
                    }
                    v15 = 4;
                    this.zzm = 4;
                label_110:
                    byte[] arr_b1 = this.zza.zzN();
                    int v16 = this.zzi;
                    arr_b1[0] = (byte)(v16 >> 24 & 0xFF);
                    arr_b1[1] = (byte)(v16 >> 16 & 0xFF);
                    arr_b1[2] = (byte)(v16 >> 8 & 0xFF);
                    arr_b1[3] = (byte)(v16 & 0xFF);
                    this.zzh = 4;
                    this.zzi = 0;
                    if(v15 == 3 || v15 == 4) {
                        this.zzg = 4;
                    }
                    else if(v15 == 1) {
                        this.zzg = 1;
                    }
                    else {
                        this.zzg = 2;
                    }
                    break;
                }
            }
            else {
                switch(v) {
                    case 1: {
                        if(!this.zzg(zzdy0, this.zza.zzN(), 18)) {
                            break;
                        }
                        byte[] arr_b = this.zza.zzN();
                        if(this.zzk == null) {
                            zzab zzab0 = zzacm.zzc(arr_b, this.zze, this.zzc, this.zzd, null);
                            this.zzk = zzab0;
                            this.zzf.zzm(zzab0);
                        }
                        int v9 = arr_b[0];
                        switch(v9) {
                            case -2: {
                                v10 = ((arr_b[4] & 3) << 12 | (arr_b[7] & 0xFF) << 4 | (arr_b[6] & 0xF0) >> 4) + 1;
                                break;
                            }
                            case -1: {
                                v10 = (((arr_b[7] & 3) << 12 | (arr_b[6] & 0xFF) << 4 | (arr_b[9] & 60) >> 2) + 1) * 16 / 14;
                                break;
                            }
                            case 0x1F: {
                                v10 = (((arr_b[8] & 60) >> 2 | ((3 & arr_b[6]) << 12 | (arr_b[7] & 0xFF) << 4)) + 1) * 16 / 14;
                                break;
                            }
                            default: {
                                v10 = ((arr_b[5] & 3) << 12 | (arr_b[6] & 0xFF) << 4 | (arr_b[7] & 0xF0) >> 4) + 1;
                            }
                        }
                        this.zzl = v10;
                        switch(v9) {
                            case -2: {
                                v11 = (arr_b[5] & 1) << 6;
                                v12 = arr_b[4] & 0xFC;
                                break;
                            }
                            case -1: {
                                v11 = (arr_b[4] & 7) << 4;
                                v12 = arr_b[7] & 60;
                                break;
                            }
                            case 0x1F: {
                                v11 = (arr_b[5] & 7) << 4;
                                v12 = arr_b[6] & 60;
                                break;
                            }
                            default: {
                                v11 = (arr_b[4] & 1) << 6;
                                v12 = arr_b[5] & 0xFC;
                            }
                        }
                        this.zzj = (long)zzgaq.zzb(zzei.zzt(((v12 >> 2 | v11) + 1) * 0x20, this.zzk.zzE));
                        this.zza.zzL(0);
                        this.zzf.zzr(this.zza, 18);
                        this.zzg = 6;
                        break;
                    }
                    case 2: {
                        if(!this.zzg(zzdy0, this.zza.zzN(), 7)) {
                            break;
                        }
                        this.zzn = zzacm.zza(this.zza.zzN());
                        this.zzg = 3;
                        break;
                    }
                    default: {
                        long v1 = 0L;
                        switch(v) {
                            case 3: {
                                if(!this.zzg(zzdy0, this.zza.zzN(), this.zzn)) {
                                    break;
                                }
                                zzack zzack0 = zzacm.zzd(this.zza.zzN());
                                this.zzf(zzack0);
                                this.zzl = zzack0.zzd;
                                long v4 = zzack0.zze;
                                if(v4 != 0x8000000000000001L) {
                                    v1 = v4;
                                }
                                this.zzj = v1;
                                this.zza.zzL(0);
                                this.zzf.zzr(this.zza, this.zzn);
                                this.zzg = 6;
                                break;
                            }
                            case 4: {
                                if(!this.zzg(zzdy0, this.zza.zzN(), 6)) {
                                    break;
                                }
                                int v5 = zzacm.zzb(this.zza.zzN());
                                this.zzo = v5;
                                int v6 = this.zzh;
                                if(v6 > v5) {
                                    int v7 = v6 - v5;
                                    this.zzh = v6 - v7;
                                    zzdy0.zzL(zzdy0.zzd() - v7);
                                }
                                this.zzg = 5;
                                break;
                            }
                            case 5: {
                                if(!this.zzg(zzdy0, this.zza.zzN(), this.zzo)) {
                                    break;
                                }
                                zzack zzack1 = zzacm.zze(this.zza.zzN(), this.zzb);
                                if(this.zzm == 3) {
                                    this.zzf(zzack1);
                                }
                                this.zzl = zzack1.zzd;
                                long v8 = zzack1.zze;
                                if(v8 != 0x8000000000000001L) {
                                    v1 = v8;
                                }
                                this.zzj = v1;
                                this.zza.zzL(0);
                                this.zzf.zzr(this.zza, this.zzo);
                                this.zzg = 6;
                                break;
                            }
                            default: {
                                int v2 = Math.min(zzdy0.zzb(), this.zzl - this.zzh);
                                this.zzf.zzr(zzdy0, v2);
                                int v3 = this.zzh + v2;
                                this.zzh = v3;
                                if(v3 != this.zzl) {
                                    break;
                                }
                                zzcw.zzf(this.zzp != 0x8000000000000001L);
                                this.zzf.zzt(this.zzp, (this.zzm == 4 ? 0 : 1), this.zzl, 0, null);
                                this.zzp += this.zzj;
                                this.zzg = 0;
                            }
                        }
                    }
                }
            }
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
        this.zzp = v;
    }

    @Override  // com.google.android.gms.internal.ads.zzamj
    public final void zze() {
        this.zzg = 0;
        this.zzh = 0;
        this.zzi = 0;
        this.zzp = 0x8000000000000001L;
        this.zzb.set(0);
    }

    @m({"output"})
    private final void zzf(zzack zzack0) {
        if(zzack0.zzb != 0x80000001 && (zzack0.zzc != -1 && (this.zzk == null || zzack0.zzc != this.zzk.zzD || zzack0.zzb != this.zzk.zzE || !Objects.equals(zzack0.zza, this.zzk.zzo)))) {
            zzz zzz0 = this.zzk == null ? new zzz() : this.zzk.zzb();
            zzz0.zzM(this.zze);
            zzz0.zzaa(zzack0.zza);
            zzz0.zzz(zzack0.zzc);
            zzz0.zzab(zzack0.zzb);
            zzz0.zzQ(this.zzc);
            zzz0.zzY(this.zzd);
            zzab zzab0 = zzz0.zzag();
            this.zzk = zzab0;
            this.zzf.zzm(zzab0);
        }
    }

    private final boolean zzg(zzdy zzdy0, byte[] arr_b, int v) {
        int v1 = Math.min(zzdy0.zzb(), v - this.zzh);
        zzdy0.zzH(arr_b, this.zzh, v1);
        int v2 = this.zzh + v1;
        this.zzh = v2;
        return v2 == v;
    }
}

