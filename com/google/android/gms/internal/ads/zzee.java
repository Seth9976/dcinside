package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Arrays;

public final class zzee {
    private long[] zza;
    private Object[] zzb;
    private int zzc;
    private int zzd;

    public zzee() {
        throw null;
    }

    public zzee(int v) {
        this.zza = new long[10];
        this.zzb = new Object[10];
    }

    public final int zza() {
        synchronized(this) {
        }
        return this.zzd;
    }

    @Nullable
    public final Object zzb() {
        synchronized(this) {
            return this.zzd == 0 ? null : this.zzf();
        }
    }

    @Nullable
    public final Object zzc(long v) {
        synchronized(this) {
            Object object0;
            for(object0 = null; this.zzd > 0 && v - this.zza[this.zzc] >= 0L; object0 = this.zzf()) {
            }
            return object0;
        }
    }

    public final void zzd(long v, Object object0) {
        synchronized(this) {
            if(this.zzd > 0 && v <= this.zza[(this.zzc + this.zzd - 1) % this.zzb.length]) {
                this.zze();
            }
            int v2 = this.zzb.length;
            if(this.zzd >= v2) {
                int v3 = v2 + v2;
                long[] arr_v = new long[v3];
                Object[] arr_object = new Object[v3];
                int v4 = v2 - this.zzc;
                System.arraycopy(this.zza, this.zzc, arr_v, 0, v4);
                System.arraycopy(this.zzb, this.zzc, arr_object, 0, v4);
                int v5 = this.zzc;
                if(v5 > 0) {
                    System.arraycopy(this.zza, 0, arr_v, v4, v5);
                    System.arraycopy(this.zzb, 0, arr_object, v4, this.zzc);
                }
                this.zza = arr_v;
                this.zzb = arr_object;
                this.zzc = 0;
            }
            int v6 = this.zzd;
            Object[] arr_object1 = this.zzb;
            int v7 = (this.zzc + v6) % arr_object1.length;
            this.zza[v7] = v;
            arr_object1[v7] = object0;
            this.zzd = v6 + 1;
        }
    }

    public final void zze() {
        synchronized(this) {
            this.zzc = 0;
            this.zzd = 0;
            Arrays.fill(this.zzb, null);
        }
    }

    @Nullable
    private final Object zzf() {
        zzcw.zzf(this.zzd > 0);
        Object[] arr_object = this.zzb;
        int v = this.zzc;
        Object object0 = arr_object[v];
        arr_object[v] = null;
        this.zzc = (v + 1) % arr_object.length;
        --this.zzd;
        return object0;
    }
}

