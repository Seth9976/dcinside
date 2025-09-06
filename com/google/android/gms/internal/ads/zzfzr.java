package com.google.android.gms.internal.ads;

import java.util.Iterator;

abstract class zzfzr implements Iterator {
    final Iterator zzb;

    zzfzr(Iterator iterator0) {
        iterator0.getClass();
        this.zzb = iterator0;
    }

    @Override
    public final boolean hasNext() {
        return this.zzb.hasNext();
    }

    @Override
    public final Object next() {
        Object object0 = this.zzb.next();
        return this.zza(object0);
    }

    @Override
    public final void remove() {
        this.zzb.remove();
    }

    abstract Object zza(Object arg1);
}

