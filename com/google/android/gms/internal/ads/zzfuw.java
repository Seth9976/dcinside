package com.google.android.gms.internal.ads;

import java.util.Iterator;

final class zzfuw implements zzfvb {
    final zzfua zza;

    zzfuw(zzfua zzfua0) {
        this.zza = zzfua0;
        super();
    }

    @Override  // com.google.android.gms.internal.ads.zzfvb
    public final Iterator zza(zzfvc zzfvc0, CharSequence charSequence0) {
        return new zzfuv(this, zzfvc0, charSequence0, this.zza.zza(charSequence0));
    }
}

