package androidx.core.view;

import androidx.lifecycle.Lifecycle.Event;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;

public final class w implements LifecycleEventObserver {
    public final MenuHostHelper a;
    public final MenuProvider b;

    public w(MenuHostHelper menuHostHelper0, MenuProvider menuProvider0) {
        this.a = menuHostHelper0;
        this.b = menuProvider0;
    }

    @Override  // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner0, Event lifecycle$Event0) {
        this.a.f(this.b, lifecycleOwner0, lifecycle$Event0);
    }
}

