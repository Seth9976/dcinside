package androidx.core.app;

import android.app.SharedElementCallback.OnSharedElementsReadyListener;

public final class b implements OnSharedElementsReadyListener {
    public final SharedElementCallback.OnSharedElementsReadyListener a;

    public b(SharedElementCallback.OnSharedElementsReadyListener sharedElementCallback$OnSharedElementsReadyListener0) {
        this.a = sharedElementCallback$OnSharedElementsReadyListener0;
    }

    @Override  // androidx.core.app.SharedElementCallback$OnSharedElementsReadyListener
    public final void a() {
        Api23Impl.a(this.a);
    }
}

