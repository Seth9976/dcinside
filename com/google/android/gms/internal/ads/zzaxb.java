package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

public final class zzaxb extends zzaxr {
    private final zzavv zzh;

    public zzaxb(zzawd zzawd0, String s, String s1, zzasc zzasc0, int v, int v1, zzavv zzavv0) {
        super(zzawd0, "nIerOxKbHFkrAwaPfnOcaC2yUxDu3vgr+V6+Lz8BbuDzBx+zj9iucf6iyn5uQniV", "dvq2wU3xdgVVjZT9gC/0PMuBLs8WhmySJmrq8zzkkwM=", zzasc0, v, 94);
        this.zzh = zzavv0;
    }

    @Override  // com.google.android.gms.internal.ads.zzaxr
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        int v = (int)(((Integer)this.zze.invoke(null, this.zzh.zza())));
        synchronized(this.zzd) {
            this.zzd.zzae(zzasp.zza(v));
        }
    }
}

