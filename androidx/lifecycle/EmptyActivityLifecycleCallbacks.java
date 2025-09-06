package androidx.lifecycle;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.os.Bundle;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public class EmptyActivityLifecycleCallbacks implements Application.ActivityLifecycleCallbacks {
    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public void onActivityCreated(@l Activity activity0, @m Bundle bundle0) {
        L.p(activity0, "activity");
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public void onActivityDestroyed(@l Activity activity0) {
        L.p(activity0, "activity");
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public void onActivityPaused(@l Activity activity0) {
        L.p(activity0, "activity");
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public void onActivityResumed(@l Activity activity0) {
        L.p(activity0, "activity");
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(@l Activity activity0, @l Bundle bundle0) {
        L.p(activity0, "activity");
        L.p(bundle0, "outState");
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public void onActivityStarted(@l Activity activity0) {
        L.p(activity0, "activity");
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public void onActivityStopped(@l Activity activity0) {
        L.p(activity0, "activity");
    }
}

