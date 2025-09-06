package androidx.lifecycle;

import androidx.annotation.NonNull;

@Deprecated
class ReflectiveGenericLifecycleObserver implements LifecycleEventObserver {
    private final Object a;
    private final CallbackInfo b;

    ReflectiveGenericLifecycleObserver(Object object0) {
        this.a = object0;
        this.b = ClassesInfoCache.c.c(object0.getClass());
    }

    @Override  // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(@NonNull LifecycleOwner lifecycleOwner0, @NonNull Event lifecycle$Event0) {
        this.b.a(lifecycleOwner0, lifecycle$Event0, this.a);
    }
}

