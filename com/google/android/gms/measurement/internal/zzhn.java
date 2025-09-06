package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzm;
import java.util.concurrent.Callable;

public final class zzhn implements Callable {
    private zzhl zza;
    private String zzb;

    public zzhn(zzhl zzhl0, String s) {
        this.zza = zzhl0;
        this.zzb = s;
    }

    @Override
    public final Object call() {
        return new zzm("internal.remoteConfig", new zzhq(this.zza, this.zzb));
    }
}

