package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

public final class zzaxl extends zzaxr {
    private final zzawk zzh;
    private long zzi;

    public zzaxl(zzawd zzawd0, String s, String s1, zzasc zzasc0, int v, int v1, zzawk zzawk0) {
        super(zzawd0, "IhZL/A+AP3q6BJHYZzhe50ZZY+joh9QA4Yw9iPAZ5epuj4PBIlbCfCRKNYc+Lpx6", "aH+LkkSrrb3t9z/9chsxYBmeH34qaSymsmB0IYlZ8kA=", zzasc0, v, 53);
        this.zzh = zzawk0;
        if(zzawk0 != null) {
            this.zzi = zzawk0.zza();
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzaxr
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        if(this.zzh != null) {
            long v = (long)(((Long)this.zze.invoke(null, this.zzi)));
            this.zzd.zzP(v);
        }
    }
}

