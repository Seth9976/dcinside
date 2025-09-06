package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.Map;

final class zzoc implements zzgu {
    private final String zza;
    private final List zzb;
    private final zznv zzc;

    zzoc(zznv zznv0, String s, List list0) {
        this.zza = s;
        this.zzb = list0;
        this.zzc = zznv0;
        super();
    }

    @Override  // com.google.android.gms.measurement.internal.zzgu
    public final void zza(String s, int v, Throwable throwable0, byte[] arr_b, Map map0) {
        this.zzc.zza(true, v, throwable0, arr_b, this.zza, this.zzb);
    }
}

