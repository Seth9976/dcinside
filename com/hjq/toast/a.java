package com.hjq.toast;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.app.Application;
import android.os.Bundle;

final class a implements Application.ActivityLifecycleCallbacks {
    private Activity a;
    @SuppressLint({"StaticFieldLeak"})
    private static volatile a b;

    public Activity a() {
        return this.a;
    }

    public static a b() {
        if(a.b == null) {
            Class class0 = a.class;
            synchronized(class0) {
                if(a.b == null) {
                    a.b = new a();
                }
            }
        }
        return a.b;
    }

    public void c(Application application0) {
        if(application0 == null) {
            return;
        }
        application0.registerActivityLifecycleCallbacks(this);
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity0, Bundle bundle0) {
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity0) {
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity0) {
        if(this.a != activity0) {
            return;
        }
        this.a = null;
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity0) {
        this.a = activity0;
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity0, Bundle bundle0) {
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity0) {
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity0) {
    }
}

