package androidx.activity.result;

import androidx.activity.result.contract.ActivityResultContract;
import androidx.lifecycle.Lifecycle.Event;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;

public final class c implements LifecycleEventObserver {
    public final ActivityResultRegistry a;
    public final String b;
    public final ActivityResultCallback c;
    public final ActivityResultContract d;

    public c(ActivityResultRegistry activityResultRegistry0, String s, ActivityResultCallback activityResultCallback0, ActivityResultContract activityResultContract0) {
        this.a = activityResultRegistry0;
        this.b = s;
        this.c = activityResultCallback0;
        this.d = activityResultContract0;
    }

    @Override  // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner0, Event lifecycle$Event0) {
        ActivityResultRegistry.n(this.a, this.b, this.c, this.d, lifecycleOwner0, lifecycle$Event0);
    }
}

