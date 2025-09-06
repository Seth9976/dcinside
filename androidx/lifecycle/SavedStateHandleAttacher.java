package androidx.lifecycle;

import kotlin.jvm.internal.L;
import y4.l;

public final class SavedStateHandleAttacher implements LifecycleEventObserver {
    @l
    private final SavedStateHandlesProvider a;

    public SavedStateHandleAttacher(@l SavedStateHandlesProvider savedStateHandlesProvider0) {
        L.p(savedStateHandlesProvider0, "provider");
        super();
        this.a = savedStateHandlesProvider0;
    }

    @Override  // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(@l LifecycleOwner lifecycleOwner0, @l Event lifecycle$Event0) {
        L.p(lifecycleOwner0, "source");
        L.p(lifecycle$Event0, "event");
        if(lifecycle$Event0 != Event.ON_CREATE) {
            throw new IllegalStateException(("Next event must be ON_CREATE, it was " + lifecycle$Event0).toString());
        }
        lifecycleOwner0.getLifecycle().d(this);
        this.a.d();
    }
}

