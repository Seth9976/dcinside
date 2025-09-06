package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.initialization.InitializationStatus;
import java.util.Map;

public final class zzblw implements InitializationStatus {
    private final Map zza;

    public zzblw(Map map0) {
        this.zza = map0;
    }

    @Override  // com.google.android.gms.ads.initialization.InitializationStatus
    public final Map getAdapterStatusMap() {
        return this.zza;
    }
}

