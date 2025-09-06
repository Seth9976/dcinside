package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

public final class zzaxi extends zzaxr {
    private final boolean zzh;

    public zzaxi(zzawd zzawd0, String s, String s1, zzasc zzasc0, int v, int v1) {
        super(zzawd0, "dX06Fls5idqgQp2Q0AyXumriu5IrYF5E5esfObgzR5ftEXiNsSl4lbLxJh6DOYsi", "dGJd9fIaxgnbA6Dc4nB6tFRdL3cXJ8ToAbabnjV7KZM=", zzasc0, v, 61);
        this.zzh = zzawd0.zzs();
    }

    @Override  // com.google.android.gms.internal.ads.zzaxr
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        long v = (long)(((Long)this.zze.invoke(null, this.zza.zzb(), Boolean.valueOf(this.zzh))));
        synchronized(this.zzd) {
            this.zzd.zzE(v);
        }
    }
}

