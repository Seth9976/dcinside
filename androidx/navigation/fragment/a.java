package androidx.navigation.fragment;

import androidx.lifecycle.Lifecycle.Event;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;

public final class a implements LifecycleEventObserver {
    public final DialogFragmentNavigator a;

    public a(DialogFragmentNavigator dialogFragmentNavigator0) {
        this.a = dialogFragmentNavigator0;
    }

    @Override  // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner0, Event lifecycle$Event0) {
        DialogFragmentNavigator.p(this.a, lifecycleOwner0, lifecycle$Event0);
    }
}

