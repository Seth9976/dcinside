package com.google.android.gms.internal.ads;

import java.util.Arrays;

final class zzzi {
    private long zza;
    private long zzb;
    private long zzc;
    private long zzd;
    private long zze;
    private long zzf;
    private final boolean[] zzg;
    private int zzh;

    public zzzi() {
        this.zzg = new boolean[15];
    }

    public final long zza() {
        return this.zze == 0L ? 0L : this.zzf / this.zze;
    }

    public final long zzb() {
        return this.zzf;
    }

    public final void zzc(long v) {
        long v1 = this.zzd;
        if(v1 == 0L) {
            this.zza = v;
        }
        else if(v1 == 1L) {
            long v2 = v - this.zza;
            this.zzb = v2;
            this.zzf = v2;
            this.zze = 1L;
        }
        else {
            long v3 = v - this.zzc;
            if(Long.compare(Math.abs(v3 - this.zzb), 1000000L) <= 0) {
                ++this.zze;
                this.zzf += v3;
                boolean[] arr_z = this.zzg;
                if(arr_z[((int)(v1 % 15L))]) {
                    arr_z[((int)(v1 % 15L))] = false;
                    --this.zzh;
                }
            }
            else {
                boolean[] arr_z1 = this.zzg;
                if(!arr_z1[((int)(v1 % 15L))]) {
                    arr_z1[((int)(v1 % 15L))] = true;
                    ++this.zzh;
                }
            }
        }
        ++this.zzd;
        this.zzc = v;
    }

    public final void zzd() {
        this.zzd = 0L;
        this.zze = 0L;
        this.zzf = 0L;
        this.zzh = 0;
        Arrays.fill(this.zzg, false);
    }

    public final boolean zze() {
        return this.zzd == 0L ? false : this.zzg[((int)((this.zzd - 1L) % 15L))];
    }

    public final boolean zzf() {
        return this.zzd > 15L && this.zzh == 0;
    }
}

