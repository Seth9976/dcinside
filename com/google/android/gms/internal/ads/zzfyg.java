package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Map;
import o3.a;

abstract class zzfyg extends zzfzm {
    @Override
    public final void clear() {
        this.zza().clear();
    }

    @Override
    public boolean contains(@a Object object0) {
        if(object0 instanceof Map.Entry) {
            Object object1 = ((Map.Entry)object0).getKey();
            Object object2 = zzfyk.zza(this.zza(), object1);
            return zzfuk.zza(object2, ((Map.Entry)object0).getValue()) && (object2 != null || this.zza().containsKey(object1));
        }
        return false;
    }

    @Override
    public final boolean isEmpty() {
        return this.zza().isEmpty();
    }

    // 去混淆评级： 低(20)
    @Override
    public boolean remove(@a Object object0) {
        return !this.contains(object0) || !(object0 instanceof Map.Entry) ? false : this.zza().keySet().remove(((Map.Entry)object0).getKey());
    }

    @Override  // com.google.android.gms.internal.ads.zzfzm
    public final boolean removeAll(Collection collection0) {
        try {
            if(collection0 == null) {
                throw null;
            }
            return zzfzp.zze(this, collection0);
        }
        catch(UnsupportedOperationException unused_ex) {
            return zzfzp.zzf(this, collection0.iterator());
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzfzm
    public final boolean retainAll(Collection collection0) {
        int v1;
        try {
            if(collection0 == null) {
                throw null;
            }
            return super.retainAll(collection0);
        }
        catch(UnsupportedOperationException unused_ex) {
            int v = collection0.size();
            if(v < 3) {
                zzfwk.zza(v, "expectedSize");
                v1 = v + 1;
            }
            else {
                v1 = v >= 0x40000000 ? 0x7FFFFFFF : ((int)Math.ceil(((double)v) / 0.75));
            }
            HashSet hashSet0 = new HashSet(v1);
            for(Object object0: collection0) {
                if(this.contains(object0) && object0 instanceof Map.Entry) {
                    hashSet0.add(((Map.Entry)object0).getKey());
                }
            }
            return this.zza().keySet().retainAll(hashSet0);
        }
    }

    @Override
    public final int size() {
        return this.zza().size();
    }

    abstract Map zza();
}

