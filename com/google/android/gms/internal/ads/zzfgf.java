package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.t0;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ScheduledExecutorService;

public abstract class zzfgf {
    private static final t0 zza;
    private final zzgcs zzb;
    private final ScheduledExecutorService zzc;
    private final zzfgg zzd;

    static {
        zzfgf.zza = zzgch.zzh(null);
    }

    public zzfgf(zzgcs zzgcs0, ScheduledExecutorService scheduledExecutorService0, zzfgg zzfgg0) {
        this.zzb = zzgcs0;
        this.zzc = scheduledExecutorService0;
        this.zzd = zzfgg0;
    }

    public final zzffv zza(Object object0, t0[] arr_t0) {
        return new zzffv(this, object0, Arrays.asList(arr_t0), null);
    }

    public final zzfgd zzb(Object object0, t0 t00) {
        return new zzfgd(this, object0, null, t00, Collections.singletonList(t00), t00, null);
    }

    protected abstract String zzf(Object arg1);
}

