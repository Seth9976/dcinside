package com.google.firebase.messaging;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.Queue;

class r implements Application.ActivityLifecycleCallbacks {
    private final Queue a;
    private static final int b = 10;

    r() {
        this.a = new ArrayDeque(10);
    }

    // 检测为 Lambda 实现
    private void b(Intent intent0) [...]

    private void c(Intent intent0) {
        Bundle bundle0 = null;
        try {
            Bundle bundle1 = intent0.getExtras();
            if(bundle1 != null) {
                String s = O.h(bundle1);
                if(!TextUtils.isEmpty(s)) {
                    if(this.a.contains(s)) {
                        return;
                    }
                    this.a.add(s);
                }
                bundle0 = bundle1.getBundle("gcm.n.analytics_data");
            }
        }
        catch(RuntimeException runtimeException0) {
            Log.w("FirebaseMessaging", "Failed trying to get analytics data from Intent extras.", runtimeException0);
        }
        if(O.F(bundle0)) {
            O.x(bundle0);
        }
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    @SuppressLint({"ThreadPoolCreation"})
    public void onActivityCreated(Activity activity0, Bundle bundle0) {
        Intent intent0 = activity0.getIntent();
        if(intent0 == null) {
            return;
        }
        if(Build.VERSION.SDK_INT <= 25) {
            new Handler(Looper.getMainLooper()).post(() -> this.c(intent0));
            return;
        }
        this.c(intent0);
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
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity0) {
    }
}

