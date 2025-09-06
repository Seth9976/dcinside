package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Collections;

public final class zzamu implements zzamj {
    @Nullable
    private final String zza;
    private final int zzb;
    private final zzdy zzc;
    private final zzdx zzd;
    private zzadt zze;
    private String zzf;
    private zzab zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private long zzl;
    private boolean zzm;
    private int zzn;
    private int zzo;
    private int zzp;
    private boolean zzq;
    private long zzr;
    private int zzs;
    private long zzt;
    private int zzu;
    @Nullable
    private String zzv;

    public zzamu(@Nullable String s, int v) {
        this.zza = s;
        this.zzb = v;
        zzdy zzdy0 = new zzdy(0x400);
        this.zzc = zzdy0;
        byte[] arr_b = zzdy0.zzN();
        this.zzd = new zzdx(arr_b, arr_b.length);
        this.zzl = 0x8000000000000001L;
    }

    @Override  // com.google.android.gms.internal.ads.zzamj
    public final void zza(zzdy zzdy0) throws zzbc {
        int v9;
        int v4;
        int v3;
        zzcw.zzb(this.zze);
        while(zzdy0.zzb() > 0) {
            boolean z = true;
            switch(this.zzh) {
                case 0: {
                    if(zzdy0.zzm() != 86) {
                        continue;
                    }
                    this.zzh = 1;
                    continue;
                }
                case 1: {
                    int v11 = zzdy0.zzm();
                    if((v11 & 0xE0) == 0xE0) {
                        this.zzk = v11;
                        this.zzh = 2;
                    }
                    else {
                        if(v11 == 86) {
                            continue;
                        }
                        this.zzh = 0;
                    }
                    continue;
                }
                case 2: {
                    int v12 = (this.zzk & 0xFFFFFF1F) << 8 | zzdy0.zzm();
                    this.zzj = v12;
                    zzdy zzdy1 = this.zzc;
                    if(v12 > zzdy1.zzN().length) {
                        zzdy1.zzI(v12);
                        byte[] arr_b1 = this.zzc.zzN();
                        this.zzd.zzk(arr_b1, arr_b1.length);
                    }
                    break;
                }
                default: {
                    int v = Math.min(zzdy0.zzb(), this.zzj - this.zzi);
                    zzdy0.zzH(this.zzd.zza, this.zzi, v);
                    int v1 = this.zzi + v;
                    this.zzi = v1;
                    if(v1 != this.zzj) {
                        continue;
                    }
                    this.zzd.zzl(0);
                    zzdx zzdx0 = this.zzd;
                    if(!zzdx0.zzp()) {
                        this.zzm = true;
                        int v2 = zzdx0.zzd(1);
                        if(v2 == 1) {
                            v3 = zzdx0.zzd(1);
                            v4 = 1;
                        }
                        else {
                            v4 = v2;
                            v3 = 0;
                        }
                        this.zzn = v3;
                        if(v3 != 0) {
                            throw zzbc.zza(null, null);
                        }
                        if(v4 == 1) {
                            zzamu.zzg(zzdx0);
                            v4 = 1;
                        }
                        if(!zzdx0.zzp()) {
                            throw zzbc.zza(null, null);
                        }
                        this.zzo = zzdx0.zzd(6);
                        if(zzdx0.zzd(4) != 0 || zzdx0.zzd(3) != 0) {
                            throw zzbc.zza(null, null);
                        }
                        if(v4 == 0) {
                            int v5 = this.zzf(zzdx0);
                            zzdx0.zzl(zzdx0.zzc());
                            byte[] arr_b = new byte[(v5 + 7) / 8];
                            zzdx0.zzh(arr_b, 0, v5);
                            zzz zzz0 = new zzz();
                            zzz0.zzM(this.zzf);
                            zzz0.zzaa("audio/mp4a-latm");
                            zzz0.zzA(this.zzv);
                            zzz0.zzz(this.zzu);
                            zzz0.zzab(this.zzs);
                            zzz0.zzN(Collections.singletonList(arr_b));
                            zzz0.zzQ(this.zza);
                            zzz0.zzY(this.zzb);
                            zzab zzab0 = zzz0.zzag();
                            if(!zzab0.equals(this.zzg)) {
                                this.zzg = zzab0;
                                this.zzt = 1024000000L / ((long)zzab0.zzE);
                                this.zze.zzm(zzab0);
                            }
                        }
                        else {
                            zzdx0.zzn(((int)zzamu.zzg(zzdx0)) - this.zzf(zzdx0));
                        }
                        int v6 = zzdx0.zzd(3);
                        this.zzp = v6;
                        switch(v6) {
                            case 0: {
                                zzdx0.zzn(8);
                                break;
                            }
                            case 1: {
                                zzdx0.zzn(9);
                                break;
                            }
                            case 3: 
                            case 4: 
                            case 5: {
                                zzdx0.zzn(6);
                                break;
                            }
                            case 6: 
                            case 7: {
                                zzdx0.zzn(1);
                                break;
                            }
                            default: {
                                throw new IllegalStateException();
                            }
                        }
                        boolean z1 = zzdx0.zzp();
                        this.zzq = z1;
                        this.zzr = 0L;
                        if(z1) {
                            if(v4 == 1) {
                                this.zzr = zzamu.zzg(zzdx0);
                            }
                            else {
                                do {
                                    boolean z2 = zzdx0.zzp();
                                    this.zzr = (this.zzr << 8) + ((long)zzdx0.zzd(8));
                                }
                                while(z2);
                            }
                        }
                        if(zzdx0.zzp()) {
                            zzdx0.zzn(8);
                        }
                        goto label_77;
                    }
                    else if(this.zzm) {
                    label_77:
                        if(this.zzn != 0 || this.zzo != 0 || this.zzp != 0) {
                            throw zzbc.zza(null, null);
                        }
                        for(int v7 = 0; true; v7 = v9) {
                            int v8 = zzdx0.zzd(8);
                            v9 = v7 + v8;
                            if(v8 != 0xFF) {
                                break;
                            }
                        }
                        int v10 = zzdx0.zzc();
                        if((v10 & 7) == 0) {
                            this.zzc.zzL(v10 >> 3);
                        }
                        else {
                            zzdx0.zzh(this.zzc.zzN(), 0, v9 * 8);
                            this.zzc.zzL(0);
                        }
                        this.zze.zzr(this.zzc, v9);
                        if(this.zzl == 0x8000000000000001L) {
                            z = false;
                        }
                        zzcw.zzf(z);
                        this.zze.zzt(this.zzl, 1, v9, 0, null);
                        this.zzl += this.zzt;
                        if(this.zzq) {
                            zzdx0.zzn(((int)this.zzr));
                        }
                    }
                    this.zzh = 0;
                    continue;
                }
            }
            this.zzi = 0;
            this.zzh = 3;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzamj
    public final void zzb(zzacq zzacq0, zzanx zzanx0) {
        zzanx0.zzc();
        this.zze = zzacq0.zzw(zzanx0.zza(), 1);
        this.zzf = zzanx0.zzb();
    }

    @Override  // com.google.android.gms.internal.ads.zzamj
    public final void zzc(boolean z) {
    }

    @Override  // com.google.android.gms.internal.ads.zzamj
    public final void zzd(long v, int v1) {
        this.zzl = v;
    }

    @Override  // com.google.android.gms.internal.ads.zzamj
    public final void zze() {
        this.zzh = 0;
        this.zzl = 0x8000000000000001L;
        this.zzm = false;
    }

    private final int zzf(zzdx zzdx0) throws zzbc {
        zzabi zzabi0 = zzabk.zzb(zzdx0, true);
        this.zzv = zzabi0.zzc;
        this.zzs = zzabi0.zza;
        this.zzu = zzabi0.zzb;
        return 0;
    }

    private static long zzg(zzdx zzdx0) {
        return (long)zzdx0.zzd((zzdx0.zzd(2) + 1) * 8);
    }
}

