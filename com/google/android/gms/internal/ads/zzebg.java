package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

public final class zzebg implements Callable {
    public final zzebk zza;

    public zzebg(zzebk zzebk0) {
        this.zza = zzebk0;
    }

    @Override
    public final Object call() {
        return this.zza.getWritableDatabase();
    }
}

