package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

final class zzfyu extends zzfvp {
    final transient zzfvf zza;

    zzfyu(Map map0, zzfvf zzfvf0) {
        super(map0);
        this.zza = zzfvf0;
    }

    @Override  // com.google.android.gms.internal.ads.zzfvp
    protected final Collection zza() {
        return (List)this.zza.zza();
    }

    @Override  // com.google.android.gms.internal.ads.zzfwg
    final Map zzj() {
        return this.zzk();
    }

    @Override  // com.google.android.gms.internal.ads.zzfwg
    final Set zzl() {
        return this.zzm();
    }
}

