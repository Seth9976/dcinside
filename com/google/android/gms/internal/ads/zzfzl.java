package com.google.android.gms.internal.ads;

import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.SortedSet;
import o3.a;

final class zzfzl extends zzfzk implements SortedSet {
    zzfzl(SortedSet sortedSet0, zzfuo zzfuo0) {
        super(sortedSet0, zzfuo0);
    }

    @Override
    @a
    public final Comparator comparator() {
        return ((SortedSet)this.zza).comparator();
    }

    @Override
    public final Object first() {
        Iterator iterator0 = this.zza.iterator();
        iterator0.getClass();
        zzfuo zzfuo0 = this.zzb;
        zzfuo0.getClass();
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            if(zzfuo0.zza(object0)) {
                return object0;
            }
            if(false) {
                break;
            }
        }
        throw new NoSuchElementException();
    }

    @Override
    public final SortedSet headSet(Object object0) {
        return new zzfzl(((SortedSet)this.zza).headSet(object0), this.zzb);
    }

    @Override
    public final Object last() {
        Object object0;
        for(SortedSet sortedSet0 = (SortedSet)this.zza; true; sortedSet0 = sortedSet0.headSet(object0)) {
            object0 = sortedSet0.last();
            if(this.zzb.zza(object0)) {
                break;
            }
        }
        return object0;
    }

    @Override
    public final SortedSet subSet(Object object0, Object object1) {
        return new zzfzl(((SortedSet)this.zza).subSet(object0, object1), this.zzb);
    }

    @Override
    public final SortedSet tailSet(Object object0) {
        return new zzfzl(((SortedSet)this.zza).tailSet(object0), this.zzb);
    }
}

