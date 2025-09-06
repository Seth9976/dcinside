package com.google.android.gms.internal.ads;

import java.nio.ShortBuffer;
import java.util.Arrays;

final class zzcj {
    private final int zza;
    private final int zzb;
    private final float zzc;
    private final float zzd;
    private final float zze;
    private final int zzf;
    private final int zzg;
    private final int zzh;
    private final short[] zzi;
    private short[] zzj;
    private int zzk;
    private short[] zzl;
    private int zzm;
    private short[] zzn;
    private int zzo;
    private int zzp;
    private int zzq;
    private int zzr;
    private int zzs;
    private int zzt;
    private int zzu;
    private int zzv;
    private double zzw;

    public zzcj(int v, int v1, float f, float f1, int v2) {
        this.zza = v;
        this.zzb = v1;
        this.zzc = f;
        this.zzd = f1;
        this.zze = ((float)v) / ((float)v2);
        this.zzf = v / 400;
        this.zzg = v / 65;
        int v3 = v / 65 + v / 65;
        this.zzh = v3;
        this.zzi = new short[v3];
        int v4 = v3 * v1;
        this.zzj = new short[v4];
        this.zzl = new short[v4];
        this.zzn = new short[v4];
    }

    public final int zza() {
        int v = this.zzm * this.zzb;
        return v + v;
    }

    public final int zzb() {
        int v = this.zzk * this.zzb;
        return v + v;
    }

    public final void zzc() {
        this.zzk = 0;
        this.zzm = 0;
        this.zzo = 0;
        this.zzp = 0;
        this.zzq = 0;
        this.zzr = 0;
        this.zzs = 0;
        this.zzt = 0;
        this.zzu = 0;
        this.zzv = 0;
        this.zzw = 0.0;
    }

    public final void zzd(ShortBuffer shortBuffer0) {
        int v = Math.min(shortBuffer0.remaining() / this.zzb, this.zzm);
        shortBuffer0.put(this.zzl, 0, this.zzb * v);
        int v1 = this.zzm - v;
        this.zzm = v1;
        System.arraycopy(this.zzl, v * this.zzb, this.zzl, 0, v1 * this.zzb);
    }

    public final void zze() {
        int v4;
        int v = this.zzk;
        int v1 = this.zzm + ((int)((((double)(v - this.zzr)) / ((double)(this.zzc / this.zzd)) + ((double)this.zzr) + this.zzw + ((double)this.zzo)) / ((double)(this.zze * this.zzd)) + 0.5));
        this.zzw = 0.0;
        this.zzj = this.zzl(this.zzj, v, this.zzh + this.zzh + v);
        for(int v2 = 0; true; ++v2) {
            int v3 = this.zzb;
            v4 = this.zzh + this.zzh;
            if(v2 >= v4 * v3) {
                break;
            }
            this.zzj[v3 * v + v2] = 0;
        }
        this.zzk += v4;
        this.zzk();
        if(this.zzm > v1) {
            this.zzm = v1;
        }
        this.zzk = 0;
        this.zzr = 0;
        this.zzo = 0;
    }

    public final void zzf(ShortBuffer shortBuffer0) {
        int v = shortBuffer0.remaining() / this.zzb;
        int v1 = this.zzb * v;
        short[] arr_v = this.zzl(this.zzj, this.zzk, v);
        this.zzj = arr_v;
        shortBuffer0.get(arr_v, this.zzk * this.zzb, (v1 + v1) / 2);
        this.zzk += v;
        this.zzk();
    }

    private final int zzg(short[] arr_v, int v, int v1, int v2) {
        int v3 = 1;
        int v4 = 0xFF;
        int v5 = 0;
        int v6 = 0;
        while(v1 <= v2) {
            int v8 = 0;
            for(int v7 = 0; v7 < v1; ++v7) {
                int v9 = this.zzb * v;
                v8 += Math.abs(arr_v[v9 + v7] - arr_v[v9 + v1 + v7]);
            }
            int v10 = v8 * v5;
            int v11 = v3 * v1;
            if(v10 < v11) {
                v3 = v8;
            }
            if(v10 < v11) {
                v5 = v1;
            }
            int v12 = v8 * v4;
            int v13 = v6 * v1;
            if(v12 > v13) {
                v6 = v8;
            }
            if(v12 > v13) {
                v4 = v1;
            }
            ++v1;
        }
        this.zzu = v3 / v5;
        this.zzv = v6 / v4;
        return v5;
    }

    private final void zzh(short[] arr_v, int v, int v1) {
        short[] arr_v1 = this.zzl(this.zzl, this.zzm, v1);
        this.zzl = arr_v1;
        System.arraycopy(arr_v, v * this.zzb, arr_v1, this.zzm * this.zzb, v1 * this.zzb);
        this.zzm += v1;
    }

    private final void zzi(short[] arr_v, int v, int v1) {
        int v6;
        for(int v2 = 0; v2 < this.zzh / v1; ++v2) {
            int v4 = 0;
            for(int v3 = 0; true; ++v3) {
                int v5 = this.zzb;
                v6 = v5 * v1;
                if(v3 >= v6) {
                    break;
                }
                v4 += arr_v[v5 * v + v6 * v2 + v3];
            }
            this.zzi[v2] = (short)(v4 / v6);
        }
    }

    private static void zzj(int v, int v1, short[] arr_v, int v2, short[] arr_v1, int v3, short[] arr_v2, int v4) {
        for(int v5 = 0; v5 < v1; ++v5) {
            int v6 = v3 * v1 + v5;
            int v7 = v4 * v1 + v5;
            int v8 = v2 * v1 + v5;
            for(int v9 = 0; v9 < v; ++v9) {
                arr_v[v8] = (short)((arr_v1[v6] * (v - v9) + arr_v2[v7] * v9) / v);
                v8 += v1;
                v6 += v1;
                v7 += v1;
            }
        }
    }

    private final void zzk() {
        long v34;
        int v32;
        int v31;
        int v30;
        int v22;
        int v19;
        int v16;
        int v6;
        double f = (double)(this.zzc / this.zzd);
        int v = this.zzm;
        if(Double.compare(f, 1.00001) > 0 || f < 0.99999) {
            int v1 = this.zzk;
            if(v1 >= this.zzh) {
                int v2 = 0;
                do {
                    int v3 = this.zzr;
                    if(v3 > 0) {
                        int v4 = Math.min(this.zzh, v3);
                        this.zzh(this.zzj, v2, v4);
                        this.zzr -= v4;
                        v2 += v4;
                    }
                    else {
                        short[] arr_v = this.zzj;
                        int v5 = this.zza <= 4000 ? 1 : this.zza / 4000;
                        if(this.zzb != 1 || v5 != 1) {
                            this.zzi(arr_v, v2, v5);
                            int v7 = this.zzg(this.zzi, 0, this.zzf / v5, this.zzg / v5);
                            if(v5 == 1) {
                                v6 = v7;
                            }
                            else {
                                int v8 = v7 * v5;
                                int v9 = this.zzf;
                                int v10 = v8 - v5 * 4;
                                if(v10 >= v9) {
                                    v9 = v10;
                                }
                                int v11 = v8 + v5 * 4;
                                int v12 = this.zzg;
                                if(v11 > v12) {
                                    v11 = v12;
                                }
                                if(this.zzb == 1) {
                                    v6 = this.zzg(arr_v, v2, v9, v11);
                                }
                                else {
                                    this.zzi(arr_v, v2, 1);
                                    v6 = this.zzg(this.zzi, 0, v9, v11);
                                }
                            }
                        }
                        else {
                            v6 = this.zzg(arr_v, v2, this.zzf, this.zzg);
                        }
                        int v13 = this.zzu;
                        int v14 = this.zzv;
                        if(v13 == 0) {
                            v16 = v6;
                        }
                        else {
                            int v15 = this.zzs;
                            if(v15 != 0 && v14 <= v13 * 3 && v13 + v13 > this.zzt * 3) {
                                v16 = v15;
                            }
                        }
                        int v17 = v2 + v16;
                        this.zzt = v13;
                        this.zzs = v6;
                        if(Double.compare(f, 1.0) > 0) {
                            short[] arr_v1 = this.zzj;
                            if(f >= 2.0) {
                                double f1 = ((double)v16) / (f - 1.0) + this.zzw;
                                int v18 = (int)Math.round(f1);
                                this.zzw = f1 - ((double)v18);
                                v19 = v18;
                            }
                            else {
                                double f2 = ((double)v16) * (2.0 - f) / (f - 1.0) + this.zzw;
                                int v20 = (int)Math.round(f2);
                                this.zzr = v20;
                                this.zzw = f2 - ((double)v20);
                                v19 = v16;
                            }
                            short[] arr_v2 = this.zzl(this.zzl, this.zzm, v19);
                            this.zzl = arr_v2;
                            zzcj.zzj(v19, this.zzb, arr_v2, this.zzm, arr_v1, v2, arr_v1, v17);
                            this.zzm += v19;
                            v2 += v16 + v19;
                        }
                        else {
                            short[] arr_v3 = this.zzj;
                            if(f < 0.5) {
                                double f3 = ((double)v16) * f / (1.0 - f) + this.zzw;
                                int v21 = (int)Math.round(f3);
                                this.zzw = f3 - ((double)v21);
                                v22 = v21;
                            }
                            else {
                                double f4 = ((double)v16) * (f + f - 1.0) / (1.0 - f) + this.zzw;
                                int v23 = (int)Math.round(f4);
                                this.zzr = v23;
                                this.zzw = f4 - ((double)v23);
                                v22 = v16;
                            }
                            int v24 = v16 + v22;
                            short[] arr_v4 = this.zzl(this.zzl, this.zzm, v24);
                            this.zzl = arr_v4;
                            System.arraycopy(arr_v3, v2 * this.zzb, arr_v4, this.zzm * this.zzb, this.zzb * v16);
                            zzcj.zzj(v22, this.zzb, this.zzl, this.zzm + v16, arr_v3, v17, arr_v3, v2);
                            this.zzm += v24;
                            v2 += v22;
                        }
                    }
                }
                while(this.zzh + v2 <= v1);
                int v25 = this.zzk - v2;
                System.arraycopy(this.zzj, v2 * this.zzb, this.zzj, 0, this.zzb * v25);
                this.zzk = v25;
            }
        }
        else {
            this.zzh(this.zzj, 0, this.zzk);
            this.zzk = 0;
        }
        float f5 = this.zze * this.zzd;
        if(f5 != 1.0f && this.zzm != v) {
            long v26 = (long)this.zza;
            long v27 = (long)(((float)this.zza) / f5);
            while(v27 != 0L && v26 != 0L && v27 % 2L == 0L && v26 % 2L == 0L) {
                v27 /= 2L;
                v26 /= 2L;
            }
            int v28 = this.zzm - v;
            short[] arr_v5 = this.zzl(this.zzn, this.zzo, v28);
            this.zzn = arr_v5;
            System.arraycopy(this.zzl, v * this.zzb, arr_v5, this.zzo * this.zzb, this.zzb * v28);
            this.zzm = v;
            this.zzo += v28;
            for(int v29 = 0; true; ++v29) {
                v30 = this.zzo;
                v31 = v30 - 1;
                if(v29 >= v31) {
                    break;
                }
                while(true) {
                    v32 = this.zzp + 1;
                    long v33 = (long)v32;
                    v34 = (long)this.zzq;
                    if(v33 * v27 <= v34 * v26) {
                        break;
                    }
                    this.zzl = this.zzl(this.zzl, this.zzm, 1);
                    for(int v35 = 0; true; ++v35) {
                        int v36 = this.zzb;
                        if(v35 >= v36) {
                            break;
                        }
                        int v37 = v29 * v36 + v35;
                        long v38 = ((long)(this.zzp + 1)) * v27;
                        long v39 = v38 - ((long)this.zzp) * v27;
                        long v40 = v38 - ((long)this.zzq) * v26;
                        this.zzl[this.zzm * v36 + v35] = (short)(((int)((v40 * ((long)this.zzn[v37]) + (v39 - v40) * ((long)this.zzn[v37 + v36])) / v39)));
                    }
                    ++this.zzq;
                    ++this.zzm;
                }
                this.zzp = v32;
                if(v33 == v26) {
                    this.zzp = 0;
                    zzcw.zzf(v34 == v27);
                    this.zzq = 0;
                }
            }
            if(v31 != 0) {
                System.arraycopy(this.zzn, v31 * this.zzb, this.zzn, 0, (v30 - v31) * this.zzb);
                this.zzo -= v31;
            }
        }
    }

    private final short[] zzl(short[] arr_v, int v, int v1) {
        int v2 = arr_v.length / this.zzb;
        return v + v1 > v2 ? Arrays.copyOf(arr_v, (v2 * 3 / 2 + v1) * this.zzb) : arr_v;
    }
}

