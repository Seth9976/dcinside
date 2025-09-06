package com.google.android.gms.internal.ads;

import android.os.SystemClock;

public final class zzhv {
    private final long zza;
    private final long zzb;
    private long zzc;
    private long zzd;
    private long zze;
    private long zzf;
    private long zzg;
    private long zzh;
    private float zzi;
    private float zzj;
    private float zzk;
    private long zzl;
    private long zzm;
    private long zzn;

    zzhv(float f, float f1, long v, float f2, long v1, long v2, float f3, zzhu zzhu0) {
        this.zza = v1;
        this.zzb = v2;
        this.zzc = 0x8000000000000001L;
        this.zzd = 0x8000000000000001L;
        this.zzf = 0x8000000000000001L;
        this.zzg = 0x8000000000000001L;
        this.zzj = 0.97f;
        this.zzi = 1.03f;
        this.zzk = 1.0f;
        this.zzl = 0x8000000000000001L;
        this.zze = 0x8000000000000001L;
        this.zzh = 0x8000000000000001L;
        this.zzm = 0x8000000000000001L;
        this.zzn = 0x8000000000000001L;
    }

    public final float zza(long v, long v1) {
        long v6;
        float f = 1.0f;
        if(this.zzc != 0x8000000000000001L) {
            long v2 = v - v1;
            long v3 = this.zzm;
            if(v3 == 0x8000000000000001L) {
                this.zzm = v2;
                this.zzn = 0L;
            }
            else {
                long v4 = Math.max(v2, zzhv.zzf(v3, v2, 0.999f));
                this.zzm = v4;
                this.zzn = zzhv.zzf(this.zzn, Math.abs(v2 - v4), 0.999f);
            }
            if(this.zzl != 0x8000000000000001L && SystemClock.elapsedRealtime() - this.zzl < 1000L) {
                return this.zzk;
            }
            this.zzl = SystemClock.elapsedRealtime();
            long v5 = this.zzm + this.zzn * 3L;
            if(this.zzh > v5) {
                long[] arr_v = {v5, this.zze, this.zzh - (((long)((this.zzk - 1.0f) * 1000000.0f)) + ((long)((this.zzi - 1.0f) * 1000000.0f)))};
                v6 = arr_v[0];
                for(int v7 = 1; v7 < 3; ++v7) {
                    long v8 = arr_v[v7];
                    if(v8 > v6) {
                        v6 = v8;
                    }
                }
                this.zzh = v6;
            }
            else {
                v6 = Math.max(this.zzh, Math.min(v - ((long)(Math.max(0.0f, this.zzk - 1.0f) / 1.000000E-07f)), v5));
                this.zzh = v6;
                long v9 = this.zzg;
                if(v9 != 0x8000000000000001L && v6 > v9) {
                    this.zzh = v9;
                    v6 = v9;
                }
            }
            long v10 = v - v6;
            if(Math.abs(v10) < this.zza) {
                this.zzk = 1.0f;
                return 1.0f;
            }
            f = Math.max(this.zzj, Math.min(((float)v10) * 1.000000E-07f + 1.0f, this.zzi));
            this.zzk = f;
        }
        return f;
    }

    public final long zzb() {
        return this.zzh;
    }

    public final void zzc() {
        long v = this.zzh;
        if(v == 0x8000000000000001L) {
            return;
        }
        long v1 = v + this.zzb;
        this.zzh = v1;
        long v2 = this.zzg;
        if(v2 != 0x8000000000000001L && v1 > v2) {
            this.zzh = v2;
        }
        this.zzl = 0x8000000000000001L;
    }

    public final void zzd(zzal zzal0) {
        this.zzc = 0x8000000000000001L;
        this.zzf = 0x8000000000000001L;
        this.zzg = 0x8000000000000001L;
        this.zzj = 0.97f;
        this.zzi = 1.03f;
        this.zzg();
    }

    public final void zze(long v) {
        this.zzd = v;
        this.zzg();
    }

    private static long zzf(long v, long v1, float f) {
        return (long)(((float)v) * 0.999f + ((float)v1) * 0.001f);
    }

    private final void zzg() {
        long v1;
        long v = this.zzc;
        if(v == 0x8000000000000001L) {
            v1 = 0x8000000000000001L;
        }
        else {
            v1 = this.zzd;
            if(v1 == 0x8000000000000001L) {
                long v2 = this.zzf;
                if(v2 != 0x8000000000000001L && v < v2) {
                    v = v2;
                }
                v1 = this.zzg;
                if(v1 == 0x8000000000000001L || v <= v1) {
                    v1 = v;
                }
            }
        }
        if(this.zze == v1) {
            return;
        }
        this.zze = v1;
        this.zzh = v1;
        this.zzm = 0x8000000000000001L;
        this.zzn = 0x8000000000000001L;
        this.zzl = 0x8000000000000001L;
    }
}

