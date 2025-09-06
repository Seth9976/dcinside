package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzs;

public final class zzcgr {
    public final int zza;
    public final int zzb;
    private final int zzc;

    private zzcgr(int v, int v1, int v2) {
        this.zzc = v;
        this.zzb = v1;
        this.zza = v2;
    }

    public static zzcgr zza() {
        return new zzcgr(0, 0, 0);
    }

    public static zzcgr zzb(int v, int v1) {
        return new zzcgr(1, v, v1);
    }

    public static zzcgr zzc(zzs zzs0) {
        if(zzs0.zzd) {
            return new zzcgr(3, 0, 0);
        }
        if(zzs0.zzi) {
            return new zzcgr(2, 0, 0);
        }
        return zzs0.zzh ? new zzcgr(0, 0, 0) : new zzcgr(1, zzs0.zzf, zzs0.zzc);
    }

    public static zzcgr zzd() {
        return new zzcgr(5, 0, 0);
    }

    public static zzcgr zze() {
        return new zzcgr(4, 0, 0);
    }

    public final boolean zzf() {
        return this.zzc == 0;
    }

    public final boolean zzg() {
        return this.zzc == 2;
    }

    public final boolean zzh() {
        return this.zzc == 5;
    }

    public final boolean zzi() {
        return this.zzc == 3;
    }

    public final boolean zzj() {
        return this.zzc == 4;
    }
}

