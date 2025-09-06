package com.bytedance.sdk.openadsdk.core.SM.PjT;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.app.Application;
import android.os.Bundle;

public class PjT implements Application.ActivityLifecycleCallbacks {
    private static volatile PjT PjT;
    private final Zh Zh;

    static {
    }

    private PjT(Application application0) {
        this.Zh = Zh.PjT(application0);
    }

    public static PjT PjT(Application application0) {
        if(PjT.PjT == null) {
            Class class0 = PjT.class;
            __monitor_enter(class0);
            try {
                if(PjT.PjT == null) {
                    PjT.PjT = new PjT(application0);
                    application0.registerActivityLifecycleCallbacks(PjT.PjT);
                }
                __monitor_exit(class0);
                return PjT.PjT;
            }
            catch(Throwable throwable0) {
            }
            __monitor_exit(class0);
            throw throwable0;
        }
        return PjT.PjT;
    }

    public String PjT(String s, long v, int v1) {
        return this.Zh == null ? "null" : this.Zh.PjT(s, v, v1);
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity0, Bundle bundle0) {
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity0) {
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity0) {
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public void onActivityPostResumed(Activity activity0) {
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity0) {
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity0, Bundle bundle0) {
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity0) {
        Zh zh0 = this.Zh;
        if(zh0 != null) {
            zh0.PjT(activity0);
        }
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity0) {
        Zh zh0 = this.Zh;
        if(zh0 != null) {
            zh0.Zh(activity0);
        }
    }
}

