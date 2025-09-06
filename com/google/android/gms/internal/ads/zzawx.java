package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

public final class zzawx extends zzaxr {
    private final zzawe zzh;

    public zzawx(zzawd zzawd0, String s, String s1, zzasc zzasc0, int v, int v1, zzawe zzawe0) {
        super(zzawd0, "e9GN1ULeRXoIWzbGPleyg0VqwusIk+Y8UB0jj4l1lcVfEVgEFoeRxD7pvq3YAOeu", "j+KOJWcuW5eAeYurIvI/WDWaxjjVmMhwZuok18XlZ7Q=", zzasc0, v, 85);
        this.zzh = zzawe0;
    }

    @Override  // com.google.android.gms.internal.ads.zzaxr
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        long[] arr_v = (long[])this.zze.invoke(null, this.zzh.zzd(), this.zzh.zzh(), this.zzh.zzb(), this.zzh.zzf());
        synchronized(this.zzd) {
            this.zzd.zzv(arr_v[0]);
            this.zzd.zzu(arr_v[1]);
        }
    }
}

