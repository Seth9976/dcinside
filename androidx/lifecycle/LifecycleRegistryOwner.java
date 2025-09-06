package androidx.lifecycle;

import androidx.annotation.NonNull;

@Deprecated
public interface LifecycleRegistryOwner extends LifecycleOwner {
    @Override  // androidx.lifecycle.LifecycleOwner
    @NonNull
    Lifecycle getLifecycle();

    @NonNull
    LifecycleRegistry getLifecycle();
}

