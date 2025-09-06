package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

public final class zzdq {
    private int zza;
    private int zzb;
    private long[] zzc;
    private int zzd;

    public zzdq() {
        throw null;
    }

    public zzdq(int v) {
        this.zza = 0;
        this.zzb = 0;
        this.zzc = new long[16];
        this.zzd = 15;
    }

    public final long zza() {
        if(this.zzb == 0) {
            throw new NoSuchElementException();
        }
        return this.zzc[this.zza];
    }

    public final long zzb() {
        int v = this.zzb;
        if(v == 0) {
            throw new NoSuchElementException();
        }
        int v1 = this.zza;
        this.zza = this.zzd & v1 + 1;
        this.zzb = v - 1;
        return this.zzc[v1];
    }

    public final void zzc() {
        this.zza = 0;
        this.zzb = 0;
    }

    public final boolean zzd() {
        return this.zzb == 0;
    }
}

