package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

public final class zzaxh extends zzaxr {
    private List zzh;
    private final Context zzi;

    public zzaxh(zzawd zzawd0, String s, String s1, zzasc zzasc0, int v, int v1, Context context0) {
        super(zzawd0, "fN18KlRCFMPT8X1qMJmuHpIW+XVsrRSfMnh+5QiArw3xyALVJ87b0VfJ0mW1R0L9", "GJYSDgYrAgCxY14XYxunZiSr8dTk91g66tw4qbpYxV8=", zzasc0, v, 0x1F);
        this.zzh = null;
        this.zzi = context0;
    }

    @Override  // com.google.android.gms.internal.ads.zzaxr
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        this.zzd.zzW(-1L);
        this.zzd.zzS(-1L);
        Context context0 = this.zzi == null ? this.zza.zzb() : this.zzi;
        if(this.zzh == null) {
            this.zzh = (List)this.zze.invoke(null, context0);
        }
        if(this.zzh != null && this.zzh.size() == 2) {
            synchronized(this.zzd) {
                long v1 = (long)(((Long)this.zzh.get(0)));
                this.zzd.zzW(v1);
                long v2 = (long)(((Long)this.zzh.get(1)));
                this.zzd.zzS(v2);
            }
        }
    }
}

