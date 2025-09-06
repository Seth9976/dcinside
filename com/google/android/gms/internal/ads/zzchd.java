package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;

public final class zzchd implements zzher {
    private final zzhfj zza;

    public zzchd(zzhfj zzhfj0) {
        this.zza = zzhfj0;
    }

    @Override  // com.google.android.gms.internal.ads.zzhfj, com.google.android.gms.internal.ads.zzhfi
    public final Object zzb() {
        ApplicationInfo applicationInfo0 = ((zzche)this.zza).zza().getApplicationInfo();
        zzhez.zzb(applicationInfo0);
        return applicationInfo0;
    }
}

