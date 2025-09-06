package com.google.android.gms.internal.ads;

import java.util.Set;
import o3.a;

final class zzgbk extends zzgbi {
    private zzgbk() {
        throw null;
    }

    zzgbk(zzgbl zzgbl0) {
        super(null);
    }

    @Override  // com.google.android.gms.internal.ads.zzgbi
    final int zza(zzgbm zzgbm0) {
        synchronized(zzgbm0) {
            int v1 = zzgbm0.remaining;
            zzgbm0.remaining = v1 - 1;
            return v1 - 1;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzgbi
    final void zzb(zzgbm zzgbm0, @a Set set0, Set set1) {
        synchronized(zzgbm0) {
            if(zzgbm0.seenExceptions == null) {
                zzgbm0.seenExceptions = set1;
            }
        }
    }
}

