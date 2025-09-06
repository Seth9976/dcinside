package androidx.lifecycle;

import androidx.savedstate.SavedStateRegistry;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;

@s0({"SMAP\nSavedStateHandleController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SavedStateHandleController.kt\nandroidx/lifecycle/SavedStateHandleController\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,41:1\n1#2:42\n*E\n"})
public final class SavedStateHandleController implements LifecycleEventObserver {
    @l
    private final String a;
    @l
    private final SavedStateHandle b;
    private boolean c;

    public SavedStateHandleController(@l String s, @l SavedStateHandle savedStateHandle0) {
        L.p(s, "key");
        L.p(savedStateHandle0, "handle");
        super();
        this.a = s;
        this.b = savedStateHandle0;
    }

    public final void a(@l SavedStateRegistry savedStateRegistry0, @l Lifecycle lifecycle0) {
        L.p(savedStateRegistry0, "registry");
        L.p(lifecycle0, "lifecycle");
        if(this.c) {
            throw new IllegalStateException("Already attached to lifecycleOwner");
        }
        this.c = true;
        lifecycle0.a(this);
        savedStateRegistry0.j(this.a, this.b.o());
    }

    @l
    public final SavedStateHandle b() {
        return this.b;
    }

    public final boolean c() {
        return this.c;
    }

    @Override  // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(@l LifecycleOwner lifecycleOwner0, @l Event lifecycle$Event0) {
        L.p(lifecycleOwner0, "source");
        L.p(lifecycle$Event0, "event");
        if(lifecycle$Event0 == Event.ON_DESTROY) {
            this.c = false;
            lifecycleOwner0.getLifecycle().d(this);
        }
    }
}

