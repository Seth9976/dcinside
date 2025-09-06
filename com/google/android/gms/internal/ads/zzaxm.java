package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

public final class zzaxm extends zzaxr {
    private static volatile Long zzh;
    private static final Object zzi;

    static {
        zzaxm.zzi = new Object();
    }

    public zzaxm(zzawd zzawd0, String s, String s1, zzasc zzasc0, int v, int v1) {
        super(zzawd0, "ggyMimGcgIX1dP+eCc2eG2r/GzpvQNgutarsMV1JGh7vOdAlwvnhksZv1ggLA3MH", "V8AFkrWTqIFMlH2T0HF0GHt49h/FZu+6Sm1YbAzJ62A=", zzasc0, v, 33);
    }

    @Override  // com.google.android.gms.internal.ads.zzaxr
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        if(zzaxm.zzh == null) {
            Object object0 = zzaxm.zzi;
            synchronized(object0) {
                if(zzaxm.zzh == null) {
                    zzaxm.zzh = (Long)this.zze.invoke(null, null);
                }
            }
        }
        synchronized(this.zzd) {
            this.zzd.zzV(((long)zzaxm.zzh));
        }
    }
}

