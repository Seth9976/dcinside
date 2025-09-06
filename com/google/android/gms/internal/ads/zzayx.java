package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.app.Application;
import android.os.Bundle;
import com.google.android.gms.ads.internal.util.client.zzo;
import java.lang.ref.WeakReference;

final class zzayx implements Application.ActivityLifecycleCallbacks {
    private final Application zza;
    private final WeakReference zzb;
    private boolean zzc;

    public zzayx(Application application0, Application.ActivityLifecycleCallbacks application$ActivityLifecycleCallbacks0) {
        this.zzc = false;
        this.zzb = new WeakReference(application$ActivityLifecycleCallbacks0);
        this.zza = application0;
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity0, Bundle bundle0) {
        this.zza(new zzayp(this, activity0, bundle0));
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity0) {
        this.zza(new zzayv(this, activity0));
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity0) {
        this.zza(new zzays(this, activity0));
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity0) {
        this.zza(new zzayr(this, activity0));
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity0, Bundle bundle0) {
        this.zza(new zzayu(this, activity0, bundle0));
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity0) {
        this.zza(new zzayq(this, activity0));
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity0) {
        this.zza(new zzayt(this, activity0));
    }

    protected final void zza(zzayw zzayw0) {
        try {
            Application.ActivityLifecycleCallbacks application$ActivityLifecycleCallbacks0 = (Application.ActivityLifecycleCallbacks)this.zzb.get();
            if(application$ActivityLifecycleCallbacks0 != null) {
                zzayw0.zza(application$ActivityLifecycleCallbacks0);
                return;
            }
            if(!this.zzc) {
                this.zza.unregisterActivityLifecycleCallbacks(this);
                this.zzc = true;
            }
            return;
        }
        catch(Exception exception0) {
        }
        zzo.zzh("Error while dispatching lifecycle callback.", exception0);
    }
}

