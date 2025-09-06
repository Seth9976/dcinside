package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.initialization.InitializationStatus;
import java.util.HashMap;
import java.util.Map;

public final class zzem implements InitializationStatus {
    public final zzex zza;

    public zzem(zzex zzex0) {
        this.zza = zzex0;
    }

    @Override  // com.google.android.gms.ads.initialization.InitializationStatus
    public final Map getAdapterStatusMap() {
        Map map0 = new HashMap();
        map0.put("com.google.android.gms.ads.MobileAds", new zzet(this.zza));
        return map0;
    }
}

