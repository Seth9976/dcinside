package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

public final class zzdgr implements zzher {
    private final zzhfj zza;

    public zzdgr(zzhfj zzhfj0) {
        this.zza = zzhfj0;
    }

    @Override  // com.google.android.gms.internal.ads.zzhfj, com.google.android.gms.internal.ads.zzhfi
    public final Object zzb() {
        Set set0 = ((zzdgo)this.zza).zza().zze() == null ? Collections.emptySet() : Collections.singleton("banner");
        zzhez.zzb(set0);
        return set0;
    }
}

