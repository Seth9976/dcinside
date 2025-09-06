package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.SortedMap;
import java.util.SortedSet;
import o3.a;

final class zzfvy extends zzfwb implements NavigableSet {
    final zzfwg zzb;

    zzfvy(zzfwg zzfwg0, NavigableMap navigableMap0) {
        this.zzb = zzfwg0;
        super(zzfwg0, navigableMap0);
    }

    @Override
    @a
    public final Object ceiling(Object object0) {
        return ((NavigableMap)(((SortedMap)this.zzd))).ceilingKey(object0);
    }

    @Override
    public final Iterator descendingIterator() {
        return this.descendingSet().iterator();
    }

    @Override
    public final NavigableSet descendingSet() {
        NavigableMap navigableMap0 = ((NavigableMap)(((SortedMap)this.zzd))).descendingMap();
        return new zzfvy(this.zzb, navigableMap0);
    }

    @Override
    @a
    public final Object floor(Object object0) {
        return ((NavigableMap)(((SortedMap)this.zzd))).floorKey(object0);
    }

    @Override
    public final NavigableSet headSet(Object object0, boolean z) {
        NavigableMap navigableMap0 = ((NavigableMap)(((SortedMap)this.zzd))).headMap(object0, z);
        return new zzfvy(this.zzb, navigableMap0);
    }

    @Override  // com.google.android.gms.internal.ads.zzfwb
    public final SortedSet headSet(Object object0) {
        return this.headSet(object0, false);
    }

    @Override
    @a
    public final Object higher(Object object0) {
        return ((NavigableMap)(((SortedMap)this.zzd))).higherKey(object0);
    }

    @Override
    @a
    public final Object lower(Object object0) {
        return ((NavigableMap)(((SortedMap)this.zzd))).lowerKey(object0);
    }

    @Override
    @a
    public final Object pollFirst() {
        return zzfxx.zza(this.iterator());
    }

    @Override
    @a
    public final Object pollLast() {
        return zzfxx.zza(this.descendingIterator());
    }

    @Override
    public final NavigableSet subSet(Object object0, boolean z, Object object1, boolean z1) {
        NavigableMap navigableMap0 = ((NavigableMap)(((SortedMap)this.zzd))).subMap(object0, z, object1, z1);
        return new zzfvy(this.zzb, navigableMap0);
    }

    @Override  // com.google.android.gms.internal.ads.zzfwb
    public final SortedSet subSet(Object object0, Object object1) {
        return this.subSet(object0, true, object1, false);
    }

    @Override
    public final NavigableSet tailSet(Object object0, boolean z) {
        NavigableMap navigableMap0 = ((NavigableMap)(((SortedMap)this.zzd))).tailMap(object0, z);
        return new zzfvy(this.zzb, navigableMap0);
    }

    @Override  // com.google.android.gms.internal.ads.zzfwb
    public final SortedSet tailSet(Object object0) {
        return this.tailSet(object0, true);
    }

    @Override  // com.google.android.gms.internal.ads.zzfwb
    final SortedMap zza() {
        return (NavigableMap)(((SortedMap)this.zzd));
    }
}

