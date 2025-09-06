package androidx.savedstate;

import androidx.lifecycle.Lifecycle.Event;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;

public final class a implements LifecycleEventObserver {
    public final SavedStateRegistry a;

    public a(SavedStateRegistry savedStateRegistry0) {
        this.a = savedStateRegistry0;
    }

    @Override  // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner0, Event lifecycle$Event0) {
        SavedStateRegistry.f(this.a, lifecycleOwner0, lifecycle$Event0);
    }
}

