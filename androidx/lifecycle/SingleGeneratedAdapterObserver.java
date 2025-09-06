package androidx.lifecycle;

import kotlin.jvm.internal.L;
import y4.l;

public final class SingleGeneratedAdapterObserver implements LifecycleEventObserver {
    @l
    private final GeneratedAdapter a;

    public SingleGeneratedAdapterObserver(@l GeneratedAdapter generatedAdapter0) {
        L.p(generatedAdapter0, "generatedAdapter");
        super();
        this.a = generatedAdapter0;
    }

    @Override  // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(@l LifecycleOwner lifecycleOwner0, @l Event lifecycle$Event0) {
        L.p(lifecycleOwner0, "source");
        L.p(lifecycle$Event0, "event");
        this.a.a(lifecycleOwner0, lifecycle$Event0, false, null);
        this.a.a(lifecycleOwner0, lifecycle$Event0, true, null);
    }
}

