package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import o3.a;

final class zzfvx extends zzfwa implements NavigableMap {
    final zzfwg zzc;

    zzfvx(zzfwg zzfwg0, NavigableMap navigableMap0) {
        this.zzc = zzfwg0;
        super(zzfwg0, navigableMap0);
    }

    @Override
    @a
    public final Map.Entry ceilingEntry(Object object0) {
        Map.Entry map$Entry0 = ((NavigableMap)(((SortedMap)this.zza))).ceilingEntry(object0);
        return map$Entry0 == null ? null : this.zza(map$Entry0);
    }

    @Override
    @a
    public final Object ceilingKey(Object object0) {
        return ((NavigableMap)(((SortedMap)this.zza))).ceilingKey(object0);
    }

    @Override
    public final NavigableSet descendingKeySet() {
        return (NavigableSet)((zzfwa)this.descendingMap()).super.zzh();
    }

    @Override
    public final NavigableMap descendingMap() {
        NavigableMap navigableMap0 = ((NavigableMap)(((SortedMap)this.zza))).descendingMap();
        return new zzfvx(this.zzc, navigableMap0);
    }

    @Override
    @a
    public final Map.Entry firstEntry() {
        Map.Entry map$Entry0 = ((NavigableMap)(((SortedMap)this.zza))).firstEntry();
        return map$Entry0 == null ? null : this.zza(map$Entry0);
    }

    @Override
    @a
    public final Map.Entry floorEntry(Object object0) {
        Map.Entry map$Entry0 = ((NavigableMap)(((SortedMap)this.zza))).floorEntry(object0);
        return map$Entry0 == null ? null : this.zza(map$Entry0);
    }

    @Override
    @a
    public final Object floorKey(Object object0) {
        return ((NavigableMap)(((SortedMap)this.zza))).floorKey(object0);
    }

    @Override
    public final NavigableMap headMap(Object object0, boolean z) {
        NavigableMap navigableMap0 = ((NavigableMap)(((SortedMap)this.zza))).headMap(object0, z);
        return new zzfvx(this.zzc, navigableMap0);
    }

    @Override  // com.google.android.gms.internal.ads.zzfwa
    public final SortedMap headMap(Object object0) {
        return this.headMap(object0, false);
    }

    @Override
    @a
    public final Map.Entry higherEntry(Object object0) {
        Map.Entry map$Entry0 = ((NavigableMap)(((SortedMap)this.zza))).higherEntry(object0);
        return map$Entry0 == null ? null : this.zza(map$Entry0);
    }

    @Override
    @a
    public final Object higherKey(Object object0) {
        return ((NavigableMap)(((SortedMap)this.zza))).higherKey(object0);
    }

    @Override  // com.google.android.gms.internal.ads.zzfwa
    public final Set keySet() {
        return (NavigableSet)super.zzh();
    }

    @Override
    @a
    public final Map.Entry lastEntry() {
        Map.Entry map$Entry0 = ((NavigableMap)(((SortedMap)this.zza))).lastEntry();
        return map$Entry0 == null ? null : this.zza(map$Entry0);
    }

    @Override
    @a
    public final Map.Entry lowerEntry(Object object0) {
        Map.Entry map$Entry0 = ((NavigableMap)(((SortedMap)this.zza))).lowerEntry(object0);
        return map$Entry0 == null ? null : this.zza(map$Entry0);
    }

    @Override
    @a
    public final Object lowerKey(Object object0) {
        return ((NavigableMap)(((SortedMap)this.zza))).lowerKey(object0);
    }

    @Override
    public final NavigableSet navigableKeySet() {
        return (NavigableSet)super.zzh();
    }

    @Override
    @a
    public final Map.Entry pollFirstEntry() {
        return this.zzc(this.entrySet().iterator());
    }

    @Override
    @a
    public final Map.Entry pollLastEntry() {
        return this.zzc(this.descendingMap().entrySet().iterator());
    }

    @Override
    public final NavigableMap subMap(Object object0, boolean z, Object object1, boolean z1) {
        NavigableMap navigableMap0 = ((NavigableMap)(((SortedMap)this.zza))).subMap(object0, z, object1, z1);
        return new zzfvx(this.zzc, navigableMap0);
    }

    @Override  // com.google.android.gms.internal.ads.zzfwa
    public final SortedMap subMap(Object object0, Object object1) {
        return this.subMap(object0, true, object1, false);
    }

    @Override
    public final NavigableMap tailMap(Object object0, boolean z) {
        NavigableMap navigableMap0 = ((NavigableMap)(((SortedMap)this.zza))).tailMap(object0, z);
        return new zzfvx(this.zzc, navigableMap0);
    }

    @Override  // com.google.android.gms.internal.ads.zzfwa
    public final SortedMap tailMap(Object object0) {
        return this.tailMap(object0, true);
    }

    @a
    final Map.Entry zzc(Iterator iterator0) {
        if(!iterator0.hasNext()) {
            return null;
        }
        Object object0 = iterator0.next();
        Collection collection0 = this.zzc.zza();
        collection0.addAll(((Collection)((Map.Entry)object0).getValue()));
        iterator0.remove();
        return new zzfxj(((Map.Entry)object0).getKey(), this.zzc.zzb(collection0));
    }

    final NavigableSet zzd() {
        return new zzfvy(this.zzc, ((NavigableMap)(((SortedMap)this.zza))));
    }

    @Override  // com.google.android.gms.internal.ads.zzfwa
    final Set zze() {
        return this.zzd();
    }

    @Override  // com.google.android.gms.internal.ads.zzfwa
    final SortedMap zzf() {
        return (NavigableMap)(((SortedMap)this.zza));
    }

    @Override  // com.google.android.gms.internal.ads.zzfwa
    final SortedSet zzg() {
        return this.zzd();
    }

    @Override  // com.google.android.gms.internal.ads.zzfwa
    public final SortedSet zzh() {
        return (NavigableSet)super.zzh();
    }
}

