package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzx;
import java.util.concurrent.Callable;

public final class zzhm implements Callable {
    private zzhl zza;
    private String zzb;

    public zzhm(zzhl zzhl0, String s) {
        this.zza = zzhl0;
        this.zzb = s;
    }

    @Override
    public final Object call() {
        return new zzx("internal.appMetadata", new zzhk(this.zza, this.zzb));
    }
}

