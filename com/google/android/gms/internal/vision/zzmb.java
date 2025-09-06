package com.google.android.gms.internal.vision;

import java.util.Iterator;

final class zzmb implements Iterator {
    private Iterator zza;
    private final zzlz zzb;

    zzmb(zzlz zzlz0) {
        this.zzb = zzlz0;
        super();
        this.zza = zzlz0.zza.iterator();
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
        throw new UnsupportedOperationException();
    }
}

