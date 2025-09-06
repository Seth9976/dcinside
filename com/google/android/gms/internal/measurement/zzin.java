package com.google.android.gms.internal.measurement;

import java.util.NoSuchElementException;

final class zzin extends zzip {
    private int zza;
    private final int zzb;
    private final zzik zzc;

    zzin(zzik zzik0) {
        this.zzc = zzik0;
        super();
        this.zza = 0;
        this.zzb = zzik0.zzb();
    }

    @Override
    public final boolean hasNext() {
        return this.zza < this.zzb;
    }

    @Override  // com.google.android.gms.internal.measurement.zziq
    public final byte zza() {
        int v = this.zza;
        if(v >= this.zzb) {
            throw new NoSuchElementException();
        }
        this.zza = v + 1;
        return this.zzc.zzb(v);
    }
}

