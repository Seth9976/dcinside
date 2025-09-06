package com.google.android.gms.internal.ads;

import android.util.Pair;
import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.Collections;

public final class zzaml implements zzamj {
    private static final double[] zza;
    private String zzb;
    private zzadt zzc;
    @Nullable
    private final zzaoa zzd;
    @Nullable
    private final zzdy zze;
    @Nullable
    private final zzanb zzf;
    private final boolean[] zzg;
    private final zzamk zzh;
    private long zzi;
    private boolean zzj;
    private boolean zzk;
    private long zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private boolean zzp;
    private boolean zzq;

    static {
        zzaml.zza = new double[]{23.976024, 24.0, 25.0, 29.97003, 30.0, 50.0, 59.94006, 60.0};
    }

    public zzaml() {
        throw null;
    }

    zzaml(@Nullable zzaoa zzaoa0) {
        zzdy zzdy0;
        this.zzd = zzaoa0;
        this.zzg = new boolean[4];
        this.zzh = new zzamk(0x80);
        if(zzaoa0 == null) {
            zzdy0 = null;
            this.zzf = null;
        }
        else {
            this.zzf = new zzanb(0xB2, 0x80);
            zzdy0 = new zzdy();
        }
        this.zze = zzdy0;
        this.zzm = 0x8000000000000001L;
        this.zzo = 0x8000000000000001L;
    }

    @Override  // com.google.android.gms.internal.ads.zzamj
    public final void zza(zzdy zzdy0) {
        int v19;
        float f;
        int v13;
        int v12;
        int v8;
        zzcw.zzb(this.zzc);
        int v = zzdy0.zzd();
        int v1 = zzdy0.zze();
        byte[] arr_b = zzdy0.zzN();
        this.zzi += (long)zzdy0.zzb();
        this.zzc.zzr(zzdy0, zzdy0.zzb());
        int v2;
        while((v2 = zzfk.zza(arr_b, v, v1, this.zzg)) != v1) {
            int v3 = zzdy0.zzN()[v2 + 3] & 0xFF;
            int v4 = v2 - v;
            if(this.zzk) {
                v8 = v2 + 3;
            }
            else {
                if(v4 > 0) {
                    this.zzh.zza(arr_b, v, v2);
                }
                if(this.zzh.zzc(v3, (v4 >= 0 ? 0 : -v4))) {
                    zzamk zzamk0 = this.zzh;
                    String s = this.zzb;
                    s.getClass();
                    byte[] arr_b1 = Arrays.copyOf(zzamk0.zzc, zzamk0.zza);
                    int v5 = arr_b1[4] & 0xFF;
                    int v6 = arr_b1[5];
                    int v7 = arr_b1[6] & 0xFF;
                    v8 = v2 + 3;
                    int v9 = (v6 & 0xFF) >> 4 | v5 << 4;
                    int v10 = (arr_b1[7] & 0xF0) >> 4;
                    int v11 = (v6 & 15) << 8 | v7;
                    if(v10 == 2) {
                        v12 = v11 * 4;
                        v13 = v9 * 3;
                    }
                    else {
                        switch(v10) {
                            case 3: {
                                v12 = v11 * 16;
                                v13 = v9 * 9;
                                break;
                            }
                            case 4: {
                                v12 = v11 * 0x79;
                                v13 = v9 * 100;
                                break;
                            }
                            default: {
                                f = 1.0f;
                                goto label_38;
                            }
                        }
                    }
                    f = ((float)v12) / ((float)v13);
                label_38:
                    zzz zzz0 = new zzz();
                    zzz0.zzM(s);
                    zzz0.zzaa("video/mpeg2");
                    zzz0.zzaf(v9);
                    zzz0.zzK(v11);
                    zzz0.zzW(f);
                    zzz0.zzN(Collections.singletonList(arr_b1));
                    zzab zzab0 = zzz0.zzag();
                    int v14 = (arr_b1[7] & 15) - 1;
                    long v15 = 0L;
                    if(v14 >= 0 && v14 < 8) {
                        double f1 = zzaml.zza[v14];
                        int v16 = arr_b1[zzamk0.zzb + 9];
                        int v17 = (v16 & 0x60) >> 5;
                        int v18 = v16 & 0x1F;
                        if(v17 != v18) {
                            f1 *= (((double)v17) + 1.0) / ((double)(v18 + 1));
                        }
                        v15 = (long)(1000000.0 / f1);
                    }
                    Pair pair0 = Pair.create(zzab0, v15);
                    this.zzc.zzm(((zzab)pair0.first));
                    this.zzl = (long)(((Long)pair0.second));
                    this.zzk = true;
                }
            }
            zzanb zzanb0 = this.zzf;
            if(zzanb0 != null) {
                if(v4 > 0) {
                    zzanb0.zza(arr_b, v, v2);
                    v19 = 0;
                }
                else {
                    v19 = -v4;
                }
                if(this.zzf.zzd(v19)) {
                    int v20 = zzfk.zzb(this.zzf.zza, this.zzf.zzb);
                    this.zze.zzJ(this.zzf.zza, v20);
                    this.zzd.zza(this.zzo, this.zze);
                }
                if(v3 == 0xB2) {
                    if(zzdy0.zzN()[v2 + 2] == 1) {
                        this.zzf.zzc(0xB2);
                    }
                    v3 = 0xB2;
                }
            }
            switch(v3) {
                case 0: 
                case 0xB3: {
                    int v21 = v1 - v2;
                    if(this.zzq && this.zzk) {
                        long v22 = this.zzo;
                        if(v22 != 0x8000000000000001L) {
                            this.zzc.zzt(v22, ((int)this.zzp), ((int)(this.zzi - this.zzn)) - v21, v21, null);
                        }
                    }
                    if(!this.zzj || this.zzq) {
                        this.zzn = this.zzi - ((long)v21);
                        long v23 = this.zzm;
                        if(v23 == 0x8000000000000001L) {
                            v23 = this.zzo == 0x8000000000000001L ? 0x8000000000000001L : this.zzo + this.zzl;
                        }
                        this.zzo = v23;
                        this.zzp = false;
                        this.zzm = 0x8000000000000001L;
                        this.zzj = true;
                    }
                    this.zzq = v3 == 0;
                    break;
                }
                case 0xB8: {
                    this.zzp = true;
                }
            }
            v = v8;
        }
        if(!this.zzk) {
            this.zzh.zza(arr_b, v, v1);
        }
        zzanb zzanb1 = this.zzf;
        if(zzanb1 != null) {
            zzanb1.zza(arr_b, v, v1);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzamj
    public final void zzb(zzacq zzacq0, zzanx zzanx0) {
        zzanx0.zzc();
        this.zzb = zzanx0.zzb();
        this.zzc = zzacq0.zzw(zzanx0.zza(), 2);
        zzaoa zzaoa0 = this.zzd;
        if(zzaoa0 != null) {
            zzaoa0.zzb(zzacq0, zzanx0);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzamj
    public final void zzc(boolean z) {
        zzcw.zzb(this.zzc);
        if(z) {
            this.zzc.zzt(this.zzo, ((int)this.zzp), ((int)(this.zzi - this.zzn)), 0, null);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzamj
    public final void zzd(long v, int v1) {
        this.zzm = v;
    }

    @Override  // com.google.android.gms.internal.ads.zzamj
    public final void zze() {
        zzfk.zzh(this.zzg);
        this.zzh.zzb();
        zzanb zzanb0 = this.zzf;
        if(zzanb0 != null) {
            zzanb0.zzb();
        }
        this.zzi = 0L;
        this.zzj = false;
        this.zzm = 0x8000000000000001L;
        this.zzo = 0x8000000000000001L;
    }
}

