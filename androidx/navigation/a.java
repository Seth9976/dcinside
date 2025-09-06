package androidx.navigation;

import androidx.lifecycle.Lifecycle.Event;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;

public final class a implements LifecycleEventObserver {
    public final NavController a;

    public a(NavController navController0) {
        this.a = navController0;
    }

    @Override  // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner0, Event lifecycle$Event0) {
        NavController.T(this.a, lifecycleOwner0, lifecycle$Event0);
    }
}

