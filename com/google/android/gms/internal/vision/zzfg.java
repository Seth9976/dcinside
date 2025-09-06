package com.google.android.gms.internal.vision;

import j..util.concurrent.ConcurrentHashMap;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.List;
import java.util.Vector;

final class zzfg {
    private final ConcurrentHashMap zza;
    private final ReferenceQueue zzb;

    zzfg() {
        this.zza = new ConcurrentHashMap(16, 0.75f, 10);
        this.zzb = new ReferenceQueue();
    }

    public final List zza(Throwable throwable0, boolean z) {
        for(Reference reference0 = this.zzb.poll(); reference0 != null; reference0 = this.zzb.poll()) {
            this.zza.remove(reference0);
        }
        zzff zzff0 = new zzff(throwable0, null);
        List list0 = (List)this.zza.get(zzff0);
        if(!z) {
            return list0;
        }
        if(list0 != null) {
            return list0;
        }
        List list1 = new Vector(2);
        zzff zzff1 = new zzff(throwable0, this.zzb);
        List list2 = (List)this.zza.putIfAbsent(zzff1, list1);
        return list2 == null ? list1 : list2;
    }
}

