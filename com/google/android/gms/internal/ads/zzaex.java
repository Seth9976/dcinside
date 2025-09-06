package com.google.android.gms.internal.ads;

abstract class zzaex {
    protected final zzadt zza;

    protected zzaex(zzadt zzadt0) {
        this.zza = zzadt0;
    }

    protected abstract boolean zza(zzdy arg1) throws zzbc;

    protected abstract boolean zzb(zzdy arg1, long arg2) throws zzbc;

    // 去混淆评级： 低(20)
    public final boolean zzf(zzdy zzdy0, long v) throws zzbc {
        return this.zza(zzdy0) && this.zzb(zzdy0, v);
    }
}

