package com.google.android.gms.internal.measurement;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map.Entry;

class zzmb extends AbstractSet {
    private final zzlv zza;

    private zzmb(zzlv zzlv0) {
        this.zza = zzlv0;
        super();
    }

    zzmb(zzlv zzlv0, zzme zzme0) {
        this(zzlv0);
    }

    @Override
    public boolean add(Object object0) {
        if(!this.contains(((Map.Entry)object0))) {
            Comparable comparable0 = (Comparable)((Map.Entry)object0).getKey();
            Object object1 = ((Map.Entry)object0).getValue();
            this.zza.zza(comparable0, object1);
            return true;
        }
        return false;
    }

    @Override
    public void clear() {
        this.zza.clear();
    }

    @Override
    public boolean contains(Object object0) {
        Object object1 = ((Map.Entry)object0).getKey();
        Object object2 = this.zza.get(object1);
        Object object3 = ((Map.Entry)object0).getValue();
        return object2 == object3 || object2 != null && object2.equals(object3);
    }

    @Override
    public Iterator iterator() {
        return new zzmc(this.zza, null);
    }

    @Override
    public boolean remove(Object object0) {
        if(this.contains(((Map.Entry)object0))) {
            Object object1 = ((Map.Entry)object0).getKey();
            this.zza.remove(object1);
            return true;
        }
        return false;
    }

    @Override
    public int size() {
        return this.zza.size();
    }
}

