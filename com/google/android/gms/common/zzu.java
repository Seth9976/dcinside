package com.google.android.gms.common;

import java.util.concurrent.Callable;

final class zzu extends zzw {
    private final Callable zze;

    zzu(Callable callable0, zzv zzv0) {
        super(false, 1, 5, null, null, null);
        this.zze = callable0;
    }

    @Override  // com.google.android.gms.common.zzw
    final String zza() {
        try {
            return (String)this.zze.call();
        }
        catch(Exception exception0) {
            throw new RuntimeException(exception0);
        }
    }
}

