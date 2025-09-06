package com.google.android.gms.internal.consent_sdk;

import java.util.NoSuchElementException;

final class zzdf extends zzdj {
    private final Object zza;
    private boolean zzb;

    zzdf(Object object0) {
        this.zza = object0;
    }

    @Override
    public final boolean hasNext() {
        return !this.zzb;
    }

    @Override
    public final Object next() {
        if(this.zzb) {
            throw new NoSuchElementException();
        }
        this.zzb = true;
        return this.zza;
    }
}

