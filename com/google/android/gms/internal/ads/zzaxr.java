package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.Callable;

public abstract class zzaxr implements Callable {
    protected final zzawd zza;
    protected final String zzb;
    protected final String zzc;
    protected final zzasc zzd;
    protected Method zze;
    protected final int zzf;
    protected final int zzg;

    public zzaxr(zzawd zzawd0, String s, String s1, zzasc zzasc0, int v, int v1) {
        this.zza = zzawd0;
        this.zzb = s;
        this.zzc = s1;
        this.zzd = zzasc0;
        this.zzf = v;
        this.zzg = v1;
    }

    @Override
    public Object call() throws Exception {
        this.zzk();
        return null;
    }

    protected abstract void zza() throws IllegalAccessException, InvocationTargetException;

    public Void zzk() throws Exception {
        try {
            long v = System.nanoTime();
            Method method0 = this.zza.zzj(this.zzb, this.zzc);
            this.zze = method0;
            if(method0 != null) {
                this.zza();
                zzauu zzauu0 = this.zza.zzd();
                if(zzauu0 != null) {
                    int v1 = this.zzf;
                    if(v1 != 0x80000000) {
                        zzauu0.zzc(this.zzg, v1, (System.nanoTime() - v) / 1000L, null, null);
                    }
                }
            }
        }
        catch(IllegalAccessException | InvocationTargetException unused_ex) {
        }
        return null;
    }
}

