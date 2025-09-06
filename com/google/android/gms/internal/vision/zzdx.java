package com.google.android.gms.internal.vision;

import java.util.AbstractCollection;
import java.util.Iterator;

final class zzdx extends AbstractCollection {
    private final zzdp zza;

    zzdx(zzdp zzdp0) {
        this.zza = zzdp0;
        super();
    }

    @Override
    public final void clear() {
        this.zza.clear();
    }

    @Override
    public final Iterator iterator() {
        return this.zza.zzg();
    }

    @Override
    public final int size() {
        return this.zza.size();
    }
}

