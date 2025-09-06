package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;

final class zzah implements Iterator {
    private int zza;
    private final zzaf zzb;

    zzah(zzaf zzaf0) {
        this.zzb = zzaf0;
        super();
        this.zza = 0;
    }

    @Override
    public final boolean hasNext() {
        return this.zza < this.zzb.zzb();
    }

    @Override
    public final Object next() {
        if(this.zza >= this.zzb.zzb()) {
            throw new NoSuchElementException("Out of bounds index: " + this.zza);
        }
        int v = this.zza;
        this.zza = v + 1;
        return this.zzb.zza(v);
    }
}

