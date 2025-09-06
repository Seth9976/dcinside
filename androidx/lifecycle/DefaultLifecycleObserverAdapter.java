package androidx.lifecycle;

import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public final class DefaultLifecycleObserverAdapter implements LifecycleEventObserver {
    public final class WhenMappings {
        public static final int[] a;

        static {
            int[] arr_v = new int[Event.values().length];
            try {
                arr_v[Event.ON_CREATE.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[Event.ON_START.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[Event.ON_RESUME.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[Event.ON_PAUSE.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[Event.ON_STOP.ordinal()] = 5;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[Event.ON_DESTROY.ordinal()] = 6;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[Event.ON_ANY.ordinal()] = 7;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            WhenMappings.a = arr_v;
        }
    }

    @l
    private final DefaultLifecycleObserver a;
    @m
    private final LifecycleEventObserver b;

    public DefaultLifecycleObserverAdapter(@l DefaultLifecycleObserver defaultLifecycleObserver0, @m LifecycleEventObserver lifecycleEventObserver0) {
        L.p(defaultLifecycleObserver0, "defaultLifecycleObserver");
        super();
        this.a = defaultLifecycleObserver0;
        this.b = lifecycleEventObserver0;
    }

    @Override  // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(@l LifecycleOwner lifecycleOwner0, @l Event lifecycle$Event0) {
        L.p(lifecycleOwner0, "source");
        L.p(lifecycle$Event0, "event");
        switch(lifecycle$Event0) {
            case 1: {
                this.a.r(lifecycleOwner0);
                break;
            }
            case 2: {
                this.a.onStart(lifecycleOwner0);
                break;
            }
            case 3: {
                this.a.m(lifecycleOwner0);
                break;
            }
            case 4: {
                this.a.n(lifecycleOwner0);
                break;
            }
            case 5: {
                this.a.onStop(lifecycleOwner0);
                break;
            }
            case 6: {
                this.a.onDestroy(lifecycleOwner0);
                break;
            }
            case 7: {
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
            }
        }
        LifecycleEventObserver lifecycleEventObserver0 = this.b;
        if(lifecycleEventObserver0 != null) {
            lifecycleEventObserver0.onStateChanged(lifecycleOwner0, lifecycle$Event0);
        }
    }
}

