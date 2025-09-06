package androidx.core.view;

import androidx.lifecycle.Lifecycle.Event;
import androidx.lifecycle.Lifecycle.State;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;

public final class v implements LifecycleEventObserver {
    public final MenuHostHelper a;
    public final State b;
    public final MenuProvider c;

    public v(MenuHostHelper menuHostHelper0, State lifecycle$State0, MenuProvider menuProvider0) {
        this.a = menuHostHelper0;
        this.b = lifecycle$State0;
        this.c = menuProvider0;
    }

    @Override  // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner0, Event lifecycle$Event0) {
        this.a.g(this.b, this.c, lifecycleOwner0, lifecycle$Event0);
    }
}

