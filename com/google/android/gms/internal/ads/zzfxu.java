package com.google.android.gms.internal.ads;

import java.util.Iterator;
import o3.a;

final class zzfxu extends zzfvo {
    final Iterator zza;
    final zzfuo zzb;

    zzfxu(Iterator iterator0, zzfuo zzfuo0) {
        this.zza = iterator0;
        this.zzb = zzfuo0;
        super();
    }

    @Override  // com.google.android.gms.internal.ads.zzfvo
    @a
    protected final Object zza() {
        while(this.zza.hasNext()) {
            Object object0 = this.zza.next();
            if(this.zzb.zza(object0)) {
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

