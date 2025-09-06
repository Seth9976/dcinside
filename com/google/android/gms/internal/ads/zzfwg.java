package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;
import o3.a;

abstract class zzfwg extends zzfwj implements Serializable {
    private final transient Map zza;
    private transient int zzb;

    protected zzfwg(Map map0) {
        zzfun.zze(map0.isEmpty());
        this.zza = map0;
    }

    abstract Collection zza();

    Collection zzb(Collection collection0) {
        throw null;
    }

    Collection zzc(Object object0, Collection collection0) {
        throw null;
    }

    @Override  // com.google.android.gms.internal.ads.zzfyl
    public final int zze() {
        return this.zzb;
    }

    @Override  // com.google.android.gms.internal.ads.zzfwj
    final Collection zzf() {
        return new zzfwi(this);
    }

    @Override  // com.google.android.gms.internal.ads.zzfwj
    final Iterator zzg() {
        return new zzfvq(this);
    }

    final List zzh(Object object0, List list0, @a zzfwd zzfwd0) {
        return list0 instanceof RandomAccess ? new zzfvz(this, object0, list0, zzfwd0) : new zzfwf(this, object0, list0, zzfwd0);
    }

    @Override  // com.google.android.gms.internal.ads.zzfwj
    Map zzj() {
        throw null;
    }

    final Map zzk() {
        Map map0 = this.zza;
        if(map0 instanceof NavigableMap) {
            return new zzfvx(this, ((NavigableMap)map0));
        }
        return map0 instanceof SortedMap ? new zzfwa(this, ((SortedMap)map0)) : new zzfvt(this, map0);
    }

    @Override  // com.google.android.gms.internal.ads.zzfwj
    Set zzl() {
        throw null;
    }

    final Set zzm() {
        Map map0 = this.zza;
        if(map0 instanceof NavigableMap) {
            return new zzfvy(this, ((NavigableMap)map0));
        }
        return map0 instanceof SortedMap ? new zzfwb(this, ((SortedMap)map0)) : new zzfvw(this, map0);
    }

    static void zzo(zzfwg zzfwg0, Object object0) {
        Object object1;
        try {
            object1 = zzfwg0.zza.remove(object0);
        }
        catch(ClassCastException | NullPointerException unused_ex) {
            object1 = null;
        }
        if(((Collection)object1) != null) {
            ((Collection)object1).clear();
            zzfwg0.zzb -= ((Collection)object1).size();
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzfyl
    public final void zzp() {
        for(Object object0: this.zza.values()) {
            ((Collection)object0).clear();
        }
        this.zza.clear();
        this.zzb = 0;
    }

    @Override  // com.google.android.gms.internal.ads.zzfwj
    public final boolean zzq(Object object0, Object object1) {
        Collection collection0 = (Collection)this.zza.get(object0);
        if(collection0 == null) {
            Collection collection1 = this.zza();
            if(!collection1.add(object1)) {
                throw new AssertionError("New Collection violated the Collection spec");
            }
            ++this.zzb;
            this.zza.put(object0, collection1);
            return true;
        }
        if(collection0.add(object1)) {
            ++this.zzb;
            return true;
        }
        return false;
    }
}

