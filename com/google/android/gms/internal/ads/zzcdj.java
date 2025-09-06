package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;

final class zzcdj {
    private final ArrayList zza;
    private long zzb;

    zzcdj() {
        this.zza = new ArrayList();
    }

    final long zza() {
        Iterator iterator0 = this.zza.iterator();
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            for(Object object1: ((zzgl)object0).zze().entrySet()) {
                Map.Entry map$Entry0 = (Map.Entry)object1;
                try {
                    if(!"content-length".equalsIgnoreCase(((String)map$Entry0.getKey()))) {
                        continue;
                    }
                    long v = Long.parseLong(((String)((List)map$Entry0.getValue()).get(0)));
                    this.zzb = Math.max(this.zzb, v);
                }
                catch(RuntimeException unused_ex) {
                }
            }
            iterator0.remove();
        }
        return this.zzb;
    }

    final void zzb(zzgl zzgl0) {
        this.zza.add(zzgl0);
    }
}

