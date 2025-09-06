package com.google.android.gms.internal.ads;

public final class zzeag {
    private long zza;
    private int zzb;
    private long zzc;
    private long zzd;
    private long zze;
    private final Object zzf;
    private final Object zzg;
    private final Object zzh;
    private final Object zzi;
    private final Object zzj;

    public zzeag() {
        this.zza = 0L;
        this.zzb = 0;
        this.zzc = 0L;
        this.zzd = 0L;
        this.zze = 0L;
        this.zzf = new Object();
        this.zzg = new Object();
        this.zzh = new Object();
        this.zzi = new Object();
        this.zzj = new Object();
    }

    public final int zza() {
        synchronized(this.zzg) {
        }
        return this.zzb;
    }

    public final long zzb() {
        synchronized(this) {
        }
        return this.zze;
    }

    public final long zzc() {
        synchronized(this) {
        }
        return this.zzd;
    }

    public final long zzd() {
        synchronized(this) {
        }
        return this.zza;
    }

    public final long zze() {
        synchronized(this.zzh) {
        }
        return this.zzc;
    }

    public final void zzf(long v) {
        synchronized(this) {
            synchronized(this.zzj) {
                this.zze = v;
            }
        }
    }

    public final void zzg(long v) {
        synchronized(this) {
            synchronized(this.zzi) {
                this.zzd = v;
            }
        }
    }

    public final void zzh(long v) {
        synchronized(this) {
            synchronized(this.zzf) {
                this.zza = v;
            }
        }
    }

    public final void zzi(int v) {
        synchronized(this.zzg) {
            this.zzb = v;
        }
    }

    public final void zzj(long v) {
        synchronized(this.zzh) {
            this.zzc = v;
        }
    }
}

