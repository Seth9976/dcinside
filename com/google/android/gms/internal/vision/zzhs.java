package com.google.android.gms.internal.vision;

import java.util.NoSuchElementException;

final class zzhs extends zzhu {
    private int zza;
    private final int zzb;
    private final zzht zzc;

    zzhs(zzht zzht0) {
        this.zzc = zzht0;
        super();
        this.zza = 0;
        this.zzb = zzht0.zza();
    }

    @Override
    public final boolean hasNext() {
        return this.zza < this.zzb;
    }

    @Override  // com.google.android.gms.internal.vision.zzhy
    public final byte zza() {
        int v = this.zza;
        if(v >= this.zzb) {
            throw new NoSuchElementException();
        }
        this.zza = v + 1;
        return this.zzc.zzb(v);
    }
}

