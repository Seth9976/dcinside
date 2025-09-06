package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzr;
import java.util.concurrent.Callable;

public final class zzhp implements Callable {
    private zzhl zza;

    public zzhp(zzhl zzhl0) {
        this.zza = zzhl0;
    }

    @Override
    public final Object call() {
        return new zzr(this.zza.zzb);
    }
}

