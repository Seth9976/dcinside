package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;

final class zzayq implements zzayw {
    final Activity zza;

    zzayq(zzayx zzayx0, Activity activity0) {
        this.zza = activity0;
        super();
    }

    @Override  // com.google.android.gms.internal.ads.zzayw
    public final void zza(Application.ActivityLifecycleCallbacks application$ActivityLifecycleCallbacks0) {
        application$ActivityLifecycleCallbacks0.onActivityStarted(this.zza);
    }
}

