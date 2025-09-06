package com.google.android.gms.internal.ads;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

final class zzfyn extends zzfyr {
    final Comparator zza;

    zzfyn(Comparator comparator0) {
        this.zza = comparator0;
        super();
    }

    @Override  // com.google.android.gms.internal.ads.zzfyr
    final Map zza() {
        return new TreeMap(this.zza);
    }
}

