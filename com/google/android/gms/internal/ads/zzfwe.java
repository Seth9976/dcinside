package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.ListIterator;

final class zzfwe extends zzfwc implements ListIterator {
    final zzfwf zzd;

    zzfwe(zzfwf zzfwf0) {
        this.zzd = zzfwf0;
        super(zzfwf0);
    }

    public zzfwe(zzfwf zzfwf0, int v) {
        this.zzd = zzfwf0;
        super(zzfwf0, ((List)zzfwf0.zzb).listIterator(v));
    }

    @Override
    public final void add(Object object0) {
        this.zza();
        ((ListIterator)this.zza).add(object0);
        ++this.zzd.zzf.zzb;
        if(this.zzd.isEmpty()) {
            this.zzd.zza();
        }
    }

    @Override
    public final boolean hasPrevious() {
        this.zza();
        return ((ListIterator)this.zza).hasPrevious();
    }

    @Override
    public final int nextIndex() {
        this.zza();
        return ((ListIterator)this.zza).nextIndex();
    }

    @Override
    public final Object previous() {
        this.zza();
        return ((ListIterator)this.zza).previous();
    }

    @Override
    public final int previousIndex() {
        this.zza();
        return ((ListIterator)this.zza).previousIndex();
    }

    @Override
    public final void set(Object object0) {
        this.zza();
        ((ListIterator)this.zza).set(object0);
    }
}

