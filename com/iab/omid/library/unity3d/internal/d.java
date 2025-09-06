package com.iab.omid.library.unity3d.internal;

import android.app.Activity;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.app.ActivityManager;
import android.app.Application.ActivityLifecycleCallbacks;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;

public class d implements Application.ActivityLifecycleCallbacks {
    public interface a {
        void a(boolean arg1);
    }

    private boolean a;
    protected boolean b;
    private a c;

    public void a(@NonNull Context context0) {
        if(context0 instanceof Application) {
            ((Application)context0).registerActivityLifecycleCallbacks(this);
        }
    }

    public void b(a d$a0) {
        this.c = d$a0;
    }

    private void c(boolean z) {
        if(this.b != z) {
            this.b = z;
            if(this.a) {
                this.f(z);
                a d$a0 = this.c;
                if(d$a0 != null) {
                    d$a0.a(z);
                }
            }
        }
    }

    // 去混淆评级： 低(20)
    private boolean d() {
        return this.e().importance == 100 || this.h();
    }

    @VisibleForTesting
    ActivityManager.RunningAppProcessInfo e() {
        ActivityManager.RunningAppProcessInfo activityManager$RunningAppProcessInfo0 = new ActivityManager.RunningAppProcessInfo();
        ActivityManager.getMyMemoryState(activityManager$RunningAppProcessInfo0);
        return activityManager$RunningAppProcessInfo0;
    }

    protected void f(boolean z) {
    }

    public boolean g() {
        return this.b;
    }

    protected boolean h() {
        return false;
    }

    public void i() {
        this.a = true;
        boolean z = this.d();
        this.b = z;
        this.f(z);
    }

    public void j() {
        this.a = false;
        this.c = null;
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
    public void onActivityResumed(Activity activity0) {
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity0, Bundle bundle0) {
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity0) {
        this.c(true);
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity0) {
        this.c(this.d());
    }
}

