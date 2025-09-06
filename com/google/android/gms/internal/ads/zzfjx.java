package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.common.util.Clock;

public final class zzfjx {
    @Nullable
    private final Object zza;
    private final long zzb;
    private final Clock zzc;
    private final long zzd;

    public zzfjx(@Nullable Object object0, Clock clock0) {
        this.zza = object0;
        this.zzc = clock0;
        this.zzb = clock0.currentTimeMillis();
        this.zzd = ((long)(((Long)zzbe.zzc().zza(zzbcl.zzA)))) * 1000L;
    }

    public final long zza() {
        long v = Math.min(Math.max(((long)(((Long)zzbe.zzc().zza(zzbcl.zzv)))), -900000L), 10000L);
        long v1 = this.zzc.currentTimeMillis();
        return this.zzd + v - (v1 - this.zzb);
    }

    @Nullable
    public final Object zzb() {
        return this.zza;
    }

    public final boolean zzc() {
        return this.zzc.currentTimeMillis() >= this.zzb + this.zzd;
    }
}

