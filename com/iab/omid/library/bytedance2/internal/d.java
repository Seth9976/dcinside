package com.iab.omid.library.bytedance2.internal;

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

    private void a(boolean z) {
        if(this.b != z) {
            this.b = z;
            if(this.a) {
                this.b(z);
                a d$a0 = this.c;
                if(d$a0 != null) {
                    d$a0.a(z);
                }
            }
        }
    }

    private boolean a() {
        return this.b().importance == 100 || this.d();
    }

    public void a(@NonNull Context context0) {
        if(context0 instanceof Application) {
            ((Application)context0).registerActivityLifecycleCallbacks(this);
        }
    }

    public void a(a d$a0) {
        this.c = d$a0;
    }

    @VisibleForTesting
    ActivityManager.RunningAppProcessInfo b() {
        ActivityManager.RunningAppProcessInfo activityManager$RunningAppProcessInfo0 = new ActivityManager.RunningAppProcessInfo();
        ActivityManager.getMyMemoryState(activityManager$RunningAppProcessInfo0);
        return activityManager$RunningAppProcessInfo0;
    }

    protected void b(boolean z) {
    }

    public boolean c() {
        return this.b;
    }

    protected boolean d() {
        return false;
    }

    public void e() {
        this.a = true;
        boolean z = this.a();
        this.b = z;
        this.b(z);
    }

    public void f() {
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
        this.a(true);
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity0) {
        this.a(this.a());
    }
}

