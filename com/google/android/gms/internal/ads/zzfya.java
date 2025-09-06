package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

final class zzfya extends AbstractList implements Serializable, RandomAccess {
    final List zza;
    final zzfuc zzb;

    zzfya(List list0, zzfuc zzfuc0) {
        list0.getClass();
        this.zza = list0;
        this.zzb = zzfuc0;
    }

    @Override
    public final Object get(int v) {
        Object object0 = this.zza.get(v);
        return this.zzb.apply(object0);
    }

    @Override
    public final boolean isEmpty() {
        return this.zza.isEmpty();
    }

    @Override
    public final Iterator iterator() {
        return this.listIterator();
    }

    @Override
    public final ListIterator listIterator(int v) {
        return new zzfxz(this, this.zza.listIterator(v));
    }

    @Override
    public final Object remove(int v) {
        Object object0 = this.zza.remove(v);
        return this.zzb.apply(object0);
    }

    @Override
    protected final void removeRange(int v, int v1) {
        this.zza.subList(v, v1).clear();
    }

    @Override
    public final int size() {
        return this.zza.size();
    }
}

