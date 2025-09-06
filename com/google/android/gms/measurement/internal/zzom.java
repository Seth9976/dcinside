package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzfy.zzj;
import java.util.Map;

final class zzom {
    private long zza;
    private zzj zzb;
    private String zzc;
    private Map zzd;
    private zznt zze;

    public final zzoj zza() {
        return new zzoj(this.zza, this.zzb, this.zzc, this.zzd, this.zze, null);
    }

    public final zzom zza(long v) {
        this.zza = v;
        return this;
    }

    public final zzom zza(zzj zzfy$zzj0) {
        this.zzb = zzfy$zzj0;
        return this;
    }

    public final zzom zza(zznt zznt0) {
        this.zze = zznt0;
        return this;
    }

    public final zzom zza(String s) {
        this.zzc = s;
        return this;
    }

    public final zzom zza(Map map0) {
        this.zzd = map0;
        return this;
    }
}

