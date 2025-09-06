package com.google.android.gms.internal.consent_sdk;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.os.Bundle;
import androidx.annotation.Nullable;

final class zzay implements Application.ActivityLifecycleCallbacks {
    final zzbb zza;
    private final Activity zzb;

    public zzay(zzbb zzbb0, Activity activity0) {
        this.zza = zzbb0;
        super();
        this.zzb = activity0;
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity0, @Nullable Bundle bundle0) {
        zzbb zzbb0 = this.zza;
        if(zzbb0.zzg != null && zzbb0.zza) {
            zzbb0.zzg.setOwnerActivity(activity0);
            zzbb zzbb1 = this.zza;
            if(zzbb1.zzc != null) {
                zzbb1.zzc.zza(activity0);
            }
            zzay zzay0 = (zzay)this.zza.zzl.getAndSet(null);
            if(zzay0 != null) {
                zzay0.zzb();
                zzay zzay1 = new zzay(this.zza, activity0);
                this.zza.zzb.registerActivityLifecycleCallbacks(zzay1);
                this.zza.zzl.set(zzay1);
            }
            zzbb zzbb2 = this.zza;
            if(zzbb2.zzg != null) {
                zzbb2.zzg.show();
            }
        }
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity0) {
        if(activity0 != this.zzb) {
            return;
        }
        if(activity0.isChangingConfigurations()) {
            zzbb zzbb0 = this.zza;
            if(zzbb0.zza && zzbb0.zzg != null) {
                zzbb0.zzg.dismiss();
                return;
            }
        }
        zzg zzg0 = new zzg(3, "Activity is destroyed.");
        this.zza.zzh(zzg0);
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity0) {
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity0) {
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity0, Bundle bundle0) {
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity0) {
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity0) {
    }

    private final void zzb() {
        this.zza.zzb.unregisterActivityLifecycleCallbacks(this);
    }
}

