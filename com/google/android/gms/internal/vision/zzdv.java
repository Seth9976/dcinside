package com.google.android.gms.internal.vision;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

final class zzdv extends AbstractSet {
    private final zzdp zza;

    zzdv(zzdp zzdp0) {
        this.zza = zzdp0;
        super();
    }

    @Override
    public final void clear() {
        this.zza.clear();
    }

    @Override
    public final boolean contains(Object object0) {
        return this.zza.containsKey(object0);
    }

    @Override
    public final Iterator iterator() {
        return this.zza.zze();
    }

    @Override
    public final boolean remove(@NullableDecl Object object0) {
        Map map0 = this.zza.zzb();
        return map0 == null ? this.zza.zzb(object0) != zzdp.zzd : map0.keySet().remove(object0);
    }

    @Override
    public final int size() {
        return this.zza.size();
    }
}

