package androidx.lifecycle;

import kotlin.jvm.internal.L;
import y4.l;

public final class CompositeGeneratedAdaptersObserver implements LifecycleEventObserver {
    @l
    private final GeneratedAdapter[] a;

    public CompositeGeneratedAdaptersObserver(@l GeneratedAdapter[] arr_generatedAdapter) {
        L.p(arr_generatedAdapter, "generatedAdapters");
        super();
        this.a = arr_generatedAdapter;
    }

    @Override  // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(@l LifecycleOwner lifecycleOwner0, @l Event lifecycle$Event0) {
        L.p(lifecycleOwner0, "source");
        L.p(lifecycle$Event0, "event");
        MethodCallsLogger methodCallsLogger0 = new MethodCallsLogger();
        GeneratedAdapter[] arr_generatedAdapter = this.a;
        for(int v1 = 0; v1 < arr_generatedAdapter.length; ++v1) {
            arr_generatedAdapter[v1].a(lifecycleOwner0, lifecycle$Event0, false, methodCallsLogger0);
        }
        GeneratedAdapter[] arr_generatedAdapter1 = this.a;
        for(int v = 0; v < arr_generatedAdapter1.length; ++v) {
            arr_generatedAdapter1[v].a(lifecycleOwner0, lifecycle$Event0, true, methodCallsLogger0);
        }
    }
}

