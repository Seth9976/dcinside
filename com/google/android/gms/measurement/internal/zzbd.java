package com.google.android.gms.measurement.internal;

import java.util.Iterator;

final class zzbd implements Iterator {
    private Iterator zza;
    private final zzbe zzb;

    zzbd(zzbe zzbe0) {
        this.zzb = zzbe0;
        super();
        this.zza = zzbe0.zza.keySet().iterator();
    }

    @Override
    public final boolean hasNext() {
        return this.zza.hasNext();
    }

    @Override
    public final Object next() {
        return this.zza.next();
    }

    @Override
    public final void remove() {
        throw new UnsupportedOperationException("Remove not supported");
    }
}

