package com.google.android.gms.internal.ads;

import j..util.DesugarCollections;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Map;

public final class zzhev extends zzhen {
    static {
        zzhes.zza(Collections.emptyMap());
    }

    zzhev(Map map0, zzhet zzhet0) {
        super(map0);
    }

    @Override  // com.google.android.gms.internal.ads.zzhfj, com.google.android.gms.internal.ads.zzhfi
    public final Object zzb() {
        return this.zzd();
    }

    public static zzheu zzc(int v) {
        return new zzheu(v, null);
    }

    public final Map zzd() {
        LinkedHashMap linkedHashMap0 = zzheo.zzb(this.zza().size());
        for(Object object0: this.zza().entrySet()) {
            linkedHashMap0.put(((Map.Entry)object0).getKey(), ((zzhfa)((Map.Entry)object0).getValue()).zzb());
        }
        return DesugarCollections.unmodifiableMap(linkedHashMap0);
    }
}

