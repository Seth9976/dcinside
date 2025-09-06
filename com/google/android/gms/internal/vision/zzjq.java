package com.google.android.gms.internal.vision;

import java.util.Iterator;
import java.util.Map.Entry;

final class zzjq implements Iterator {
    private Iterator zza;

    public zzjq(Iterator iterator0) {
        this.zza = iterator0;
    }

    @Override
    public final boolean hasNext() {
        return this.zza.hasNext();
    }

    @Override
    public final Object next() {
        Object object0 = this.zza.next();
        return ((Map.Entry)object0).getValue() instanceof zzjp ? new zzjr(((Map.Entry)object0), null) : ((Map.Entry)object0);
    }

    @Override
    public final void remove() {
        this.zza.remove();
    }
}

