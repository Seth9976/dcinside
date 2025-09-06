package androidx.lifecycle;

import y4.l;

public interface LifecycleEventObserver extends LifecycleObserver {
    void onStateChanged(@l LifecycleOwner arg1, @l Event arg2);
}

