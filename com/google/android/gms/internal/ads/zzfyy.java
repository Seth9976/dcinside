package com.google.android.gms.internal.ads;

import java.util.Comparator;

public abstract class zzfyy implements Comparator {
    @Override
    public abstract int compare(Object arg1, Object arg2);

    public zzfyy zza() {
        return new zzfzh(this);
    }

    public static zzfyy zzb(Comparator comparator0) {
        return new zzfwy(comparator0);
    }

    public static zzfyy zzc() {
        return zzfyw.zza;
    }
}

