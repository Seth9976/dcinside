package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import o3.a;

final class zzfzj extends zzfzn {
    final Set zza;
    final Set zzb;

    zzfzj(Set set0, Set set1) {
        this.zza = set0;
        this.zzb = set1;
        super(null);
    }

    // 去混淆评级： 低(20)
    @Override
    public final boolean contains(@a Object object0) {
        return this.zza.contains(object0) && this.zzb.contains(object0);
    }

    // 去混淆评级： 低(20)
    @Override
    public final boolean containsAll(Collection collection0) {
        return this.zza.containsAll(collection0) && this.zzb.containsAll(collection0);
    }

    @Override
    public final boolean isEmpty() {
        return Collections.disjoint(this.zzb, this.zza);
    }

    @Override  // com.google.android.gms.internal.ads.zzfzn
    public final Iterator iterator() {
        return this.zza();
    }

    @Override
    public final int size() {
        int v = 0;
        for(Object object0: this.zza) {
            if(this.zzb.contains(object0)) {
                ++v;
            }
        }
        return v;
    }

    @Override  // com.google.android.gms.internal.ads.zzfzn
    public final zzfzt zza() {
        return new zzfzi(this, this.zza, this.zzb);
    }
}

