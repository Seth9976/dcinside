package com.hjq.toast;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.app.Application;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.WindowManager;

final class u implements Application.ActivityLifecycleCallbacks {
    private Activity a;
    private Application b;
    private m c;

    u(Activity activity0) {
        this.a = activity0;
    }

    u(Application application0) {
        this.b = application0;
    }

    public WindowManager a() {
        Activity activity0 = this.a;
        if(activity0 != null) {
            return activity0.isDestroyed() ? null : this.a.getWindowManager();
        }
        return this.b == null ? null : ((WindowManager)this.b.getSystemService("window"));
    }

    void b(m m0) {
        this.c = m0;
        Activity activity0 = this.a;
        if(activity0 == null) {
            return;
        }
        if(Build.VERSION.SDK_INT >= 29) {
            activity0.registerActivityLifecycleCallbacks(this);
            return;
        }
        activity0.getApplication().registerActivityLifecycleCallbacks(this);
    }

    void c() {
        this.c = null;
        Activity activity0 = this.a;
        if(activity0 == null) {
            return;
        }
        if(Build.VERSION.SDK_INT >= 29) {
            activity0.unregisterActivityLifecycleCallbacks(this);
            return;
        }
        activity0.getApplication().unregisterActivityLifecycleCallbacks(this);
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity0, Bundle bundle0) {
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity0) {
        if(this.a != activity0) {
            return;
        }
        m m0 = this.c;
        if(m0 != null) {
            m0.g();
        }
        this.c();
        this.a = null;
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity0) {
        if(this.a != activity0) {
            return;
        }
        m m0 = this.c;
        if(m0 == null) {
            return;
        }
        m0.g();
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity0) {
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

