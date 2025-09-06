package androidx.activity;

import androidx.lifecycle.Lifecycle.Event;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;

public final class b implements LifecycleEventObserver {
    public final ComponentActivity a;

    public b(ComponentActivity componentActivity0) {
        this.a = componentActivity0;
    }

    @Override  // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner0, Event lifecycle$Event0) {
        ComponentActivity.n0(this.a, lifecycleOwner0, lifecycle$Event0);
    }
}

