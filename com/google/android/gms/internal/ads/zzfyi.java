package com.google.android.gms.internal.ads;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Map;
import o3.a;

final class zzfyi extends AbstractCollection {
    final Map zza;

    zzfyi(Map map0) {
        this.zza = map0;
    }

    @Override
    public final void clear() {
        this.zza.clear();
    }

    @Override
    public final boolean contains(@a Object object0) {
        return this.zza.containsValue(object0);
    }

    @Override
    public final boolean isEmpty() {
        return this.zza.isEmpty();
    }

    @Override
    public final Iterator iterator() {
        return new zzfyf(this.zza.entrySet().iterator());
    }

    @Override
    public final boolean remove(@a Object object0) {
        try {
            return super.remove(object0);
        }
        catch(UnsupportedOperationException unused_ex) {
            for(Object object1: this.zza.entrySet()) {
                Map.Entry map$Entry0 = (Map.Entry)object1;
                if(zzfuk.zza(object0, map$Entry0.getValue())) {
                    Object object2 = map$Entry0.getKey();
                    this.zza.remove(object2);
                    return true;
                }
                if(false) {
                    break;
                }
            }
            return false;
        }
    }

    @Override
    public final boolean removeAll(Collection collection0) {
        try {
            if(collection0 == null) {
                throw null;
            }
            return super.removeAll(collection0);
        }
        catch(UnsupportedOperationException unused_ex) {
            HashSet hashSet0 = new HashSet();
            for(Object object0: this.zza.entrySet()) {
                Map.Entry map$Entry0 = (Map.Entry)object0;
                if(collection0.contains(map$Entry0.getValue())) {
                    hashSet0.add(map$Entry0.getKey());
                }
            }
            return this.zza.keySet().removeAll(hashSet0);
        }
    }

    @Override
    public final boolean retainAll(Collection collection0) {
        try {
            if(collection0 == null) {
                throw null;
            }
            return super.retainAll(collection0);
        }
        catch(UnsupportedOperationException unused_ex) {
            HashSet hashSet0 = new HashSet();
            for(Object object0: this.zza.entrySet()) {
                Map.Entry map$Entry0 = (Map.Entry)object0;
                if(collection0.contains(map$Entry0.getValue())) {
                    hashSet0.add(map$Entry0.getKey());
                }
            }
            return this.zza.keySet().retainAll(hashSet0);
        }
    }

    @Override
    public final int size() {
        return this.zza.size();
    }
}

