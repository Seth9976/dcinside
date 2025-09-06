package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

public final class zzawt extends zzaxr {
    private static volatile Long zzh;
    private static final Object zzi;

    static {
        zzawt.zzi = new Object();
    }

    public zzawt(zzawd zzawd0, String s, String s1, zzasc zzasc0, int v, int v1) {
        super(zzawd0, "bOzndz3UfjWA1SOXZmjVl3/OkFAGVqfkIFIBgylpbuzJ4v1NDammFGLj1en8A5TJ", "UcBsIyWJ1ILWxlv+9MafJ7lcNPMojMcMoBQJnzvSyQQ=", zzasc0, v, 44);
    }

    @Override  // com.google.android.gms.internal.ads.zzaxr
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        if(zzawt.zzh == null) {
            Object object0 = zzawt.zzi;
            synchronized(object0) {
                if(zzawt.zzh == null) {
                    zzawt.zzh = (Long)this.zze.invoke(null, null);
                }
            }
        }
        synchronized(this.zzd) {
            this.zzd.zzo(((long)zzawt.zzh));
        }
    }
}

