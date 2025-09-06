package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.AbstractSequentialList;
import java.util.List;
import java.util.ListIterator;

final class zzfyc extends AbstractSequentialList implements Serializable {
    final List zza;
    final zzfuc zzb;

    zzfyc(List list0, zzfuc zzfuc0) {
        list0.getClass();
        this.zza = list0;
        this.zzb = zzfuc0;
    }

    @Override
    public final boolean isEmpty() {
        return this.zza.isEmpty();
    }

    @Override
    public final ListIterator listIterator(int v) {
        return new zzfyb(this, this.zza.listIterator(v));
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

