package com.google.android.gms.internal.ads;

import java.util.Comparator;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import o3.a;

class zzfwa extends zzfvt implements SortedMap {
    @a
    SortedSet zzd;
    final zzfwg zze;

    zzfwa(zzfwg zzfwg0, SortedMap sortedMap0) {
        this.zze = zzfwg0;
        super(zzfwg0, sortedMap0);
    }

    @Override
    @a
    public final Comparator comparator() {
        return this.zzf().comparator();
    }

    @Override
    public final Object firstKey() {
        return this.zzf().firstKey();
    }

    @Override
    public SortedMap headMap(Object object0) {
        SortedMap sortedMap0 = this.zzf().headMap(object0);
        return new zzfwa(this.zze, sortedMap0);
    }

    @Override  // com.google.android.gms.internal.ads.zzfvt
    public Set keySet() {
        return this.zzh();
    }

    @Override
    public final Object lastKey() {
        return this.zzf().lastKey();
    }

    @Override
    public SortedMap subMap(Object object0, Object object1) {
        SortedMap sortedMap0 = this.zzf().subMap(object0, object1);
        return new zzfwa(this.zze, sortedMap0);
    }

    @Override
    public SortedMap tailMap(Object object0) {
        SortedMap sortedMap0 = this.zzf().tailMap(object0);
        return new zzfwa(this.zze, sortedMap0);
    }

    @Override  // com.google.android.gms.internal.ads.zzfyj
    Set zze() {
        return this.zzg();
    }

    SortedMap zzf() {
        return (SortedMap)this.zza;
    }

    SortedSet zzg() {
        SortedMap sortedMap0 = this.zzf();
        return new zzfwb(this.zze, sortedMap0);
    }

    public SortedSet zzh() {
        SortedSet sortedSet0 = this.zzd;
        if(sortedSet0 == null) {
            sortedSet0 = this.zzg();
            this.zzd = sortedSet0;
        }
        return sortedSet0;
    }
}

