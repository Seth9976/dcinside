package com.google.android.gms.internal.ads;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import o3.a;

final class zzfws extends AbstractSet {
    final zzfww zza;

    zzfws(zzfww zzfww0) {
        this.zza = zzfww0;
        super();
    }

    @Override
    public final void clear() {
        this.zza.clear();
    }

    @Override
    public final boolean contains(@a Object object0) {
        return this.zza.containsKey(object0);
    }

    @Override
    public final Iterator iterator() {
        zzfww zzfww0 = this.zza;
        Map map0 = zzfww0.zzl();
        return map0 != null ? map0.keySet().iterator() : new zzfwn(zzfww0);
    }

    @Override
    public final boolean remove(@a Object object0) {
        Map map0 = this.zza.zzl();
        return map0 == null ? this.zza.zzy(object0) != zzfww.zzd : map0.keySet().remove(object0);
    }

    @Override
    public final int size() {
        return this.zza.size();
    }
}

