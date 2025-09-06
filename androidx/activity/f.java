package androidx.activity;

import androidx.lifecycle.Lifecycle.Event;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;

public final class f implements LifecycleEventObserver {
    public final OnBackPressedDispatcher a;
    public final ComponentActivity b;

    public f(OnBackPressedDispatcher onBackPressedDispatcher0, ComponentActivity componentActivity0) {
        this.a = onBackPressedDispatcher0;
        this.b = componentActivity0;
    }

    @Override  // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner0, Event lifecycle$Event0) {
        ComponentActivity.s0(this.a, this.b, lifecycleOwner0, lifecycle$Event0);
    }
}

