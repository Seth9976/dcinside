package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Set;
import o3.a;

final class zzfzi extends zzfvo {
    final Iterator zza;
    final Set zzb;
    final Set zzc;

    zzfzi(zzfzj zzfzj0, Set set0, Set set1) {
        this.zzb = set0;
        this.zzc = set1;
        super();
        this.zza = set0.iterator();
    }

    @Override  // com.google.android.gms.internal.ads.zzfvo
    @a
    protected final Object zza() {
        while(this.zza.hasNext()) {
            Object object0 = this.zza.next();
            if(this.zzc.contains(object0)) {
                return object0;
            }
            if(false) {
                break;
            }
        }
        this.zzb();
        return null;
    }
}

