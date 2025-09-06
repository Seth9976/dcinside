package com.google.android.gms.internal.vision;

import java.util.List;

abstract class zzju {
    private static final zzju zza;
    private static final zzju zzb;

    static {
        zzju.zza = new zzjw(null);
        zzju.zzb = new zzjz(null);
    }

    private zzju() {
    }

    zzju(zzjx zzjx0) {
    }

    static zzju zza() {
        return zzju.zza;
    }

    abstract List zza(Object arg1, long arg2);

    abstract void zza(Object arg1, Object arg2, long arg3);

    static zzju zzb() {
        return zzju.zzb;
    }

    abstract void zzb(Object arg1, long arg2);
}

