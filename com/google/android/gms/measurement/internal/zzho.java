package com.google.android.gms.measurement.internal;

import androidx.collection.LruCache;
import com.google.android.gms.common.internal.Preconditions;

final class zzho extends LruCache {
    private final zzhl zza;

    zzho(zzhl zzhl0, int v) {
        this.zza = zzhl0;
        super(20);
    }

    @Override  // androidx.collection.LruCache
    protected final Object create(Object object0) {
        Preconditions.checkNotEmpty(((String)object0));
        return zzhl.zza(this.zza, ((String)object0));
    }
}

