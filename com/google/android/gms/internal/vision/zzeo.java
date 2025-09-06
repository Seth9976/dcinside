package com.google.android.gms.internal.vision;

import java.util.NoSuchElementException;

final class zzeo extends zzfa {
    private boolean zza;
    private final Object zzb;

    zzeo(Object object0) {
        this.zzb = object0;
        super();
    }

    @Override
    public final boolean hasNext() {
        return !this.zza;
    }

    @Override
    public final Object next() {
        if(this.zza) {
            throw new NoSuchElementException();
        }
        this.zza = true;
        return this.zzb;
    }
}

