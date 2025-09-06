package com.google.android.gms.internal.ads;

import java.util.Iterator;

final class zzheh implements Iterator {
    int zza;
    final zzhei zzb;

    zzheh(zzhei zzhei0) {
        this.zzb = zzhei0;
        super();
        this.zza = 0;
    }

    @Override
    public final boolean hasNext() {
        return this.zza < this.zzb.zza.size() || this.zzb.zzb.hasNext();
    }

    @Override
    public final Object next() {
        if(this.zza < this.zzb.zza.size()) {
            int v = this.zza;
            this.zza = v + 1;
            return this.zzb.zza.get(v);
        }
        Object object0 = this.zzb.zzb.next();
        this.zzb.zza.add(object0);
        return this.next();
    }

    @Override
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}

