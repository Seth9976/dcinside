package com.google.android.gms.internal.ads;

import java.util.Iterator;

final class zzfuu implements zzfvb {
    final zzfty zza;

    zzfuu(zzfty zzfty0) {
        this.zza = zzfty0;
        super();
    }

    @Override  // com.google.android.gms.internal.ads.zzfvb
    public final Iterator zza(zzfvc zzfvc0, CharSequence charSequence0) {
        return new zzfut(this, zzfvc0, charSequence0, this.zza);
    }
}

