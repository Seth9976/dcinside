package com.google.android.gms.internal.ads;

import java.util.Comparator;

public final class zzsq implements Comparator {
    public final zzsy zza;

    public zzsq(zzsy zzsy0) {
        this.zza = zzsy0;
    }

    @Override
    public final int compare(Object object0, Object object1) {
        return this.zza.zza(object1) - this.zza.zza(object0);
    }
}

