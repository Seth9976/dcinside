package com.google.android.gms.internal.measurement;

import java.util.Iterator;

final class zzma extends zzmb {
    private final zzlv zza;

    private zzma(zzlv zzlv0) {
        this.zza = zzlv0;
        super(zzlv0, null);
    }

    zzma(zzlv zzlv0, zzme zzme0) {
        this(zzlv0);
    }

    @Override  // com.google.android.gms.internal.measurement.zzmb
    public final Iterator iterator() {
        return new zzlx(this.zza, null);
    }
}

