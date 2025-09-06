package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

final class zzgwb extends zzgwc {
    final zzgwj zza;
    private int zzb;
    private final int zzc;

    zzgwb(zzgwj zzgwj0) {
        this.zza = zzgwj0;
        super();
        this.zzb = 0;
        this.zzc = zzgwj0.zzd();
    }

    @Override
    public final boolean hasNext() {
        return this.zzb < this.zzc;
    }

    @Override  // com.google.android.gms.internal.ads.zzgwe
    public final byte zza() {
        int v = this.zzb;
        if(v >= this.zzc) {
            throw new NoSuchElementException();
        }
        this.zzb = v + 1;
        return this.zza.zzb(v);
    }
}

