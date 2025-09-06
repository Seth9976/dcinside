package com.google.android.gms.measurement.internal;

import androidx.annotation.Nullable;
import com.google.android.gms.internal.measurement.zzfy.zzj;
import java.util.Map;

public final class zzoj {
    private long zza;
    private zzj zzb;
    private String zzc;
    private Map zzd;
    private zznt zze;

    private zzoj(long v, zzj zzfy$zzj0, String s, Map map0, zznt zznt0) {
        this.zza = v;
        this.zzb = zzfy$zzj0;
        this.zzc = s;
        this.zzd = map0;
        this.zze = zznt0;
    }

    zzoj(long v, zzj zzfy$zzj0, String s, Map map0, zznt zznt0, zzol zzol0) {
        this(v, zzfy$zzj0, s, map0, zznt0);
    }

    public final long zza() {
        return this.zza;
    }

    public final zznw zzb() {
        return new zznw(this.zzc, this.zzd, this.zze);
    }

    @Nullable
    public final zzj zzc() {
        return this.zzb;
    }

    public final String zzd() {
        return this.zzc;
    }

    public final Map zze() {
        return this.zzd;
    }
}

