package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;

final class zzts {
    private final Map zza;
    private final Map zzb;
    private zzfx zzc;

    public zzts(zzacs zzacs0, zzakd zzakd0) {
        this.zza = new HashMap();
        this.zzb = new HashMap();
    }

    public final void zza(zzfx zzfx0) {
        if(zzfx0 != this.zzc) {
            this.zzc = zzfx0;
            this.zza.clear();
            this.zzb.clear();
        }
    }
}

