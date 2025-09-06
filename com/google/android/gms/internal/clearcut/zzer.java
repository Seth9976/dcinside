package com.google.android.gms.internal.clearcut;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map.Entry;

class zzer extends AbstractSet {
    private final zzei zzos;

    private zzer(zzei zzei0) {
        this.zzos = zzei0;
        super();
    }

    zzer(zzei zzei0, zzej zzej0) {
        this(zzei0);
    }

    @Override
    public boolean add(Object object0) {
        if(!this.contains(((Map.Entry)object0))) {
            Comparable comparable0 = (Comparable)((Map.Entry)object0).getKey();
            Object object1 = ((Map.Entry)object0).getValue();
            this.zzos.zza(comparable0, object1);
            return true;
        }
        return false;
    }

    @Override
    public void clear() {
        this.zzos.clear();
    }

    @Override
    public boolean contains(Object object0) {
        Object object1 = ((Map.Entry)object0).getKey();
        Object object2 = this.zzos.get(object1);
        Object object3 = ((Map.Entry)object0).getValue();
        return object2 == object3 || object2 != null && object2.equals(object3);
    }

    @Override
    public Iterator iterator() {
        return new zzeq(this.zzos, null);
    }

    @Override
    public boolean remove(Object object0) {
        if(this.contains(((Map.Entry)object0))) {
            Object object1 = ((Map.Entry)object0).getKey();
            this.zzos.remove(object1);
            return true;
        }
        return false;
    }

    @Override
    public int size() {
        return this.zzos.size();
    }
}

