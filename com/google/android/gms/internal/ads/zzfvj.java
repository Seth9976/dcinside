package com.google.android.gms.internal.ads;

import java.io.Serializable;

public final class zzfvj {
    public static zzfvf zza(zzfvf zzfvf0) {
        if(!(zzfvf0 instanceof zzfvi) && !(zzfvf0 instanceof zzfvg)) {
            return zzfvf0 instanceof Serializable ? new zzfvg(zzfvf0) : new zzfvi(zzfvf0);
        }
        return zzfvf0;
    }
}

