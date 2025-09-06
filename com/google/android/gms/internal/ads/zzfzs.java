package com.google.android.gms.internal.ads;

import java.util.ListIterator;

abstract class zzfzs extends zzfzr implements ListIterator {
    zzfzs(ListIterator listIterator0) {
        super(listIterator0);
    }

    @Override
    public final void add(Object object0) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final boolean hasPrevious() {
        return ((ListIterator)this.zzb).hasPrevious();
    }

    @Override
    public final int nextIndex() {
        return ((ListIterator)this.zzb).nextIndex();
    }

    @Override
    public final Object previous() {
        return this.zza(((ListIterator)this.zzb).previous());
    }

    @Override
    public final int previousIndex() {
        return ((ListIterator)this.zzb).previousIndex();
    }

    @Override
    public final void set(Object object0) {
        throw new UnsupportedOperationException();
    }
}

