package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

public final class zzaxj extends zzaxr {
    private final StackTraceElement[] zzh;

    public zzaxj(zzawd zzawd0, String s, String s1, zzasc zzasc0, int v, int v1, StackTraceElement[] arr_stackTraceElement) {
        super(zzawd0, "xFbi3+W8aerwW3eqFbTnh9hURu39XqgquwTPQwngps2D/g9L7GAvkI7gDJEB4z+M", "K8GEBKnLvE9ILfJGB5b9krvXjFIAigM9H8Mu/ozNfRc=", zzasc0, v, 45);
        this.zzh = arr_stackTraceElement;
    }

    @Override  // com.google.android.gms.internal.ads.zzaxr
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        int v = 1;
        StackTraceElement[] arr_stackTraceElement = this.zzh;
        if(arr_stackTraceElement != null) {
            zzavu zzavu0 = new zzavu(((String)this.zze.invoke(null, arr_stackTraceElement)));
            synchronized(this.zzd) {
                this.zzd.zzF(((long)zzavu0.zza));
                if(zzavu0.zzb.booleanValue()) {
                    zzasc zzasc1 = this.zzd;
                    if(!zzavu0.zzc.booleanValue()) {
                        v = 2;
                    }
                    zzasc1.zzac(v);
                }
                else {
                    this.zzd.zzac(3);
                }
            }
        }
    }
}

