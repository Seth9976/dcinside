package com.google.android.gms.internal.ads;

import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.Map;

final class zzfwu extends AbstractCollection {
    final zzfww zza;

    zzfwu(zzfww zzfww0) {
        this.zza = zzfww0;
        super();
    }

    @Override
    public final void clear() {
        this.zza.clear();
    }

    @Override
    public final Iterator iterator() {
        zzfww zzfww0 = this.zza;
        Map map0 = zzfww0.zzl();
        return map0 != null ? map0.values().iterator() : new zzfwp(zzfww0);
    }

    @Override
    public final int size() {
        return this.zza.size();
    }
}

