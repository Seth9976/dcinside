package com.google.android.gms.internal.ads;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;
import o3.a;

class zzfwb extends zzfvw implements SortedSet {
    final zzfwg zzc;

    zzfwb(zzfwg zzfwg0, SortedMap sortedMap0) {
        this.zzc = zzfwg0;
        super(zzfwg0, sortedMap0);
    }

    @Override
    @a
    public final Comparator comparator() {
        return this.zza().comparator();
    }

    @Override
    public final Object first() {
        return this.zza().firstKey();
    }

    @Override
    public SortedSet headSet(Object object0) {
        SortedMap sortedMap0 = this.zza().headMap(object0);
        return new zzfwb(this.zzc, sortedMap0);
    }

    @Override
    public final Object last() {
        return this.zza().lastKey();
    }

    @Override
    public SortedSet subSet(Object object0, Object object1) {
        SortedMap sortedMap0 = this.zza().subMap(object0, object1);
        return new zzfwb(this.zzc, sortedMap0);
    }

    @Override
    public SortedSet tailSet(Object object0) {
        SortedMap sortedMap0 = this.zza().tailMap(object0);
        return new zzfwb(this.zzc, sortedMap0);
    }

    SortedMap zza() {
        return (SortedMap)this.zzd;
    }
}

