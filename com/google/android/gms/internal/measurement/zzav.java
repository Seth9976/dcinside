package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;

final class zzav implements Iterator {
    private int zza;
    private final zzas zzb;

    zzav(zzas zzas0) {
        this.zzb = zzas0;
        super();
        this.zza = 0;
    }

    @Override
    public final boolean hasNext() {
        return this.zza < this.zzb.zza.length();
    }

    @Override
    public final Object next() {
        if(this.zza >= this.zzb.zza.length()) {
            throw new NoSuchElementException();
        }
        int v = this.zza;
        this.zza = v + 1;
        return new zzas(String.valueOf(v));
    }
}

