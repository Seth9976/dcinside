package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.os.Bundle;

final class zzavp implements zzavr {
    final Activity zza;
    final Bundle zzb;

    zzavp(zzavs zzavs0, Activity activity0, Bundle bundle0) {
        this.zza = activity0;
        this.zzb = bundle0;
        super();
    }

    @Override  // com.google.android.gms.internal.ads.zzavr
    public final void zza(Application.ActivityLifecycleCallbacks application$ActivityLifecycleCallbacks0) {
        application$ActivityLifecycleCallbacks0.onActivitySaveInstanceState(this.zza, this.zzb);
    }
}

