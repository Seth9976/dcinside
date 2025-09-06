package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.app.Application;
import android.os.Bundle;
import java.lang.ref.WeakReference;

final class zzavs implements Application.ActivityLifecycleCallbacks {
    private final Application zza;
    private final WeakReference zzb;
    private boolean zzc;

    public zzavs(Application application0, Application.ActivityLifecycleCallbacks application$ActivityLifecycleCallbacks0) {
        this.zzc = false;
        this.zzb = new WeakReference(application$ActivityLifecycleCallbacks0);
        this.zza = application0;
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity0, Bundle bundle0) {
        this.zza(new zzavk(this, activity0, bundle0));
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity0) {
        this.zza(new zzavq(this, activity0));
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity0) {
        this.zza(new zzavn(this, activity0));
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity0) {
        this.zza(new zzavm(this, activity0));
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity0, Bundle bundle0) {
        this.zza(new zzavp(this, activity0, bundle0));
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity0) {
        this.zza(new zzavl(this, activity0));
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity0) {
        this.zza(new zzavo(this, activity0));
    }

    protected final void zza(zzavr zzavr0) {
        try {
            Application.ActivityLifecycleCallbacks application$ActivityLifecycleCallbacks0 = (Application.ActivityLifecycleCallbacks)this.zzb.get();
            if(application$ActivityLifecycleCallbacks0 != null) {
                zzavr0.zza(application$ActivityLifecycleCallbacks0);
                return;
            }
            if(!this.zzc) {
                this.zza.unregisterActivityLifecycleCallbacks(this);
                this.zzc = true;
            }
        }
        catch(Exception unused_ex) {
        }
    }
}

