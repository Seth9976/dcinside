package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashMap;

public final class zzfek {
    private final HashMap zza;

    public zzfek() {
        this.zza = new HashMap();
    }

    public final zzfej zza(zzfea zzfea0, Context context0, zzfds zzfds0, zzfeq zzfeq0) {
        zzfej zzfej0 = (zzfej)this.zza.get(zzfea0);
        if(zzfej0 == null) {
            zzfdx zzfdx0 = new zzfdx(zzfed.zza(zzfea0, context0));
            zzfej zzfej1 = new zzfej(zzfdx0, new zzfes(zzfdx0, zzfds0, zzfeq0));
            this.zza.put(zzfea0, zzfej1);
            return zzfej1;
        }
        return zzfej0;
    }
}

