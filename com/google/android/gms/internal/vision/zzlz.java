package com.google.android.gms.internal.vision;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

public final class zzlz extends AbstractList implements zzjv, RandomAccess {
    private final zzjv zza;

    public zzlz(zzjv zzjv0) {
        this.zza = zzjv0;
    }

    @Override
    public final Object get(int v) {
        return (String)this.zza.get(v);
    }

    @Override
    public final Iterator iterator() {
        return new zzmb(this);
    }

    @Override
    public final ListIterator listIterator(int v) {
        return new zzly(this, v);
    }

    @Override
    public final int size() {
        return this.zza.size();
    }

    @Override  // com.google.android.gms.internal.vision.zzjv
    public final void zza(zzht zzht0) {
        throw new UnsupportedOperationException();
    }

    @Override  // com.google.android.gms.internal.vision.zzjv
    public final Object zzb(int v) {
        return this.zza.zzb(v);
    }

    @Override  // com.google.android.gms.internal.vision.zzjv
    public final List zzd() {
        return this.zza.zzd();
    }

    @Override  // com.google.android.gms.internal.vision.zzjv
    public final zzjv zze() {
        return this;
    }
}

