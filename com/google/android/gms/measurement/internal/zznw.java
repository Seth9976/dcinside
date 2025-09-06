package com.google.android.gms.measurement.internal;

import androidx.annotation.NonNull;
import java.util.Collections;
import java.util.Map;

final class zznw {
    private String zza;
    private Map zzb;
    @NonNull
    private zznt zzc;

    zznw(String s, zznt zznt0) {
        this.zza = s;
        this.zzc = zznt0;
    }

    zznw(String s, Map map0, zznt zznt0) {
        this.zza = s;
        this.zzb = map0;
        this.zzc = zznt0;
    }

    public final zznt zza() {
        return this.zzc;
    }

    public final String zzb() {
        return this.zza;
    }

    @NonNull
    public final Map zzc() {
        return this.zzb == null ? Collections.emptyMap() : this.zzb;
    }
}

