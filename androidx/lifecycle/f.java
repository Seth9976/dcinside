package androidx.lifecycle;

import kotlinx.coroutines.I0;

public final class f implements LifecycleEventObserver {
    public final LifecycleController a;
    public final I0 b;

    public f(LifecycleController lifecycleController0, I0 i00) {
        this.a = lifecycleController0;
        this.b = i00;
    }

    @Override  // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner0, Event lifecycle$Event0) {
        LifecycleController.d(this.a, this.b, lifecycleOwner0, lifecycle$Event0);
    }
}

