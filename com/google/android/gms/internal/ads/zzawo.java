package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

public final class zzawo extends zzaxr {
    public zzawo(zzawd zzawd0, String s, String s1, zzasc zzasc0, int v, int v1) {
        super(zzawd0, "3Zd6ToP6YGdtLSvr/9LlH3RQ74jHr5f7QlQE5jiIZQZu/jwK9FxbxcEE4M1niHI2", "5EH0wgVOsOOfycPFtjiDLlWMUl1WsId7lt7tllT9vVA=", zzasc0, v, 89);
    }

    @Override  // com.google.android.gms.internal.ads.zzaxr
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        String s = (String)this.zze.invoke(null, null);
        synchronized(this.zzd) {
            this.zzd.zzg(s);
        }
    }
}

