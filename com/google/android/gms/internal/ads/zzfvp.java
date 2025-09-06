package com.google.android.gms.internal.ads;

import j..util.DesugarCollections;
import java.util.Collection;
import java.util.List;
import java.util.Map;

class zzfvp extends zzfwg implements zzfxy {
    protected zzfvp(Map map0) {
        super(map0);
    }

    @Override  // com.google.android.gms.internal.ads.zzfwg
    Collection zza() {
        throw null;
    }

    @Override  // com.google.android.gms.internal.ads.zzfwg
    final Collection zzb(Collection collection0) {
        return DesugarCollections.unmodifiableList(((List)collection0));
    }

    @Override  // com.google.android.gms.internal.ads.zzfwg
    final Collection zzc(Object object0, Collection collection0) {
        return this.zzh(object0, ((List)collection0), null);
    }
}

