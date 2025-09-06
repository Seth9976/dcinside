package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;

final class zzavo implements zzavr {
    final Activity zza;

    zzavo(zzavs zzavs0, Activity activity0) {
        this.zza = activity0;
        super();
    }

    @Override  // com.google.android.gms.internal.ads.zzavr
    public final void zza(Application.ActivityLifecycleCallbacks application$ActivityLifecycleCallbacks0) {
        application$ActivityLifecycleCallbacks0.onActivityStopped(this.zza);
    }
}

