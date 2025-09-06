package com.google.android.gms.internal.ads;

import j..util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public final class zzhff implements zzher {
    private final List zza;
    private final List zzb;

    static {
        zzhes.zza(Collections.emptySet());
    }

    zzhff(List list0, List list1, zzhfd zzhfd0) {
        this.zza = list0;
        this.zzb = list1;
    }

    public static zzhfe zza(int v, int v1) {
        return new zzhfe(v, v1, null);
    }

    @Override  // com.google.android.gms.internal.ads.zzhfj, com.google.android.gms.internal.ads.zzhfi
    public final Object zzb() {
        return this.zzc();
    }

    public final Set zzc() {
        int v = this.zza.size();
        ArrayList arrayList0 = new ArrayList(this.zzb.size());
        int v1 = this.zzb.size();
        for(int v3 = 0; v3 < v1; ++v3) {
            Collection collection0 = (Collection)((zzhfa)this.zzb.get(v3)).zzb();
            v += collection0.size();
            arrayList0.add(collection0);
        }
        HashSet hashSet0 = zzheo.zza(v);
        int v4 = this.zza.size();
        for(int v5 = 0; v5 < v4; ++v5) {
            Object object0 = ((zzhfa)this.zza.get(v5)).zzb();
            object0.getClass();
            hashSet0.add(object0);
        }
        int v6 = arrayList0.size();
        for(int v2 = 0; v2 < v6; ++v2) {
            for(Object object1: ((Collection)arrayList0.get(v2))) {
                object1.getClass();
                hashSet0.add(object1);
            }
        }
        return DesugarCollections.unmodifiableSet(hashSet0);
    }
}

