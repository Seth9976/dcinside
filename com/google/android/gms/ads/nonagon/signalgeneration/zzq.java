package com.google.android.gms.ads.nonagon.signalgeneration;

import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.ads.query.QueryInfo;
import java.util.concurrent.atomic.AtomicBoolean;

public final class zzq {
    @Nullable
    private final QueryInfo zza;
    private final String zzb;
    private final long zzc;
    private final int zzd;
    private final AtomicBoolean zze;

    public zzq(@Nullable QueryInfo queryInfo0, String s, long v, int v1) {
        this.zze = new AtomicBoolean(false);
        this.zza = queryInfo0;
        this.zzb = s;
        this.zzc = v;
        this.zzd = v1;
    }

    public final int zza() {
        return this.zzd;
    }

    @Nullable
    public final QueryInfo zzb() {
        return this.zza;
    }

    public final String zzc() {
        return this.zzb;
    }

    public final void zzd() {
        this.zze.set(true);
    }

    public final boolean zze() {
        long v = zzv.zzC().currentTimeMillis();
        return this.zzc <= v;
    }

    public final boolean zzf() {
        return this.zze.get();
    }
}

