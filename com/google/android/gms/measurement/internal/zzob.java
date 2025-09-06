package com.google.android.gms.measurement.internal;

import java.util.Map;

final class zzob implements zzgu {
    private final String zza;
    private final zzoj zzb;
    private final zznv zzc;

    zzob(zznv zznv0, String s, zzoj zzoj0) {
        this.zza = s;
        this.zzb = zzoj0;
        this.zzc = zznv0;
        super();
    }

    @Override  // com.google.android.gms.measurement.internal.zzgu
    public final void zza(String s, int v, Throwable throwable0, byte[] arr_b, Map map0) {
        this.zzc.zza(this.zza, v, throwable0, arr_b, this.zzb);
    }
}

