package androidx.lifecycle;

import y4.l;

public interface DefaultLifecycleObserver extends LifecycleObserver {
    void m(@l LifecycleOwner arg1);

    void n(@l LifecycleOwner arg1);

    void onDestroy(@l LifecycleOwner arg1);

    void onStart(@l LifecycleOwner arg1);

    void onStop(@l LifecycleOwner arg1);

    void r(@l LifecycleOwner arg1);
}

