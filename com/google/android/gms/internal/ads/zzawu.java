package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

public final class zzawu extends zzaxr {
    private final long zzh;

    public zzawu(zzawd zzawd0, String s, String s1, zzasc zzasc0, long v, int v1, int v2) {
        super(zzawd0, "y3qsDqWUxj+0NW9GzaLLQcml0WYfJuDlvc/LrtwTbAkNDXLpsSYbwYlOmoW50beE", "vyPJQ44Cs+DiV597MU4yHYF5mAH0rpjmfJE+rEowUe0=", zzasc0, v1, 25);
        this.zzh = v;
    }

    @Override  // com.google.android.gms.internal.ads.zzaxr
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        long v = (long)(((Long)this.zze.invoke(null, null)));
        synchronized(this.zzd) {
            this.zzd.zzt(v);
            long v2 = this.zzh;
            if(v2 != 0L) {
                this.zzd.zzT(v - v2);
                this.zzd.zzU(this.zzh);
            }
        }
    }
}

