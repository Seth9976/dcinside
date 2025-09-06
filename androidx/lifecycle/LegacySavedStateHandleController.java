package androidx.lifecycle;

import android.os.Bundle;
import androidx.savedstate.SavedStateRegistry.AutoRecreated;
import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.SavedStateRegistryOwner;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;
import z3.n;

public final class LegacySavedStateHandleController {
    public static final class OnRecreation implements AutoRecreated {
        @Override  // androidx.savedstate.SavedStateRegistry$AutoRecreated
        public void a(@l SavedStateRegistryOwner savedStateRegistryOwner0) {
            L.p(savedStateRegistryOwner0, "owner");
            if(!(savedStateRegistryOwner0 instanceof ViewModelStoreOwner)) {
                throw new IllegalStateException("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner");
            }
            ViewModelStore viewModelStore0 = ((ViewModelStoreOwner)savedStateRegistryOwner0).getViewModelStore();
            SavedStateRegistry savedStateRegistry0 = savedStateRegistryOwner0.getSavedStateRegistry();
            for(Object object0: viewModelStore0.c()) {
                ViewModel viewModel0 = viewModelStore0.b(((String)object0));
                L.m(viewModel0);
                LegacySavedStateHandleController.a(viewModel0, savedStateRegistry0, savedStateRegistryOwner0.getLifecycle());
            }
            if(!viewModelStore0.c().isEmpty()) {
                savedStateRegistry0.k(OnRecreation.class);
            }
        }
    }

    @l
    public static final LegacySavedStateHandleController a = null;
    @l
    public static final String b = "androidx.lifecycle.savedstate.vm.tag";

    static {
        LegacySavedStateHandleController.a = new LegacySavedStateHandleController();
    }

    @n
    public static final void a(@l ViewModel viewModel0, @l SavedStateRegistry savedStateRegistry0, @l Lifecycle lifecycle0) {
        L.p(viewModel0, "viewModel");
        L.p(savedStateRegistry0, "registry");
        L.p(lifecycle0, "lifecycle");
        SavedStateHandleController savedStateHandleController0 = (SavedStateHandleController)viewModel0.getTag("androidx.lifecycle.savedstate.vm.tag");
        if(savedStateHandleController0 != null && !savedStateHandleController0.c()) {
            savedStateHandleController0.a(savedStateRegistry0, lifecycle0);
            LegacySavedStateHandleController.a.c(savedStateRegistry0, lifecycle0);
        }
    }

    @l
    @n
    public static final SavedStateHandleController b(@l SavedStateRegistry savedStateRegistry0, @l Lifecycle lifecycle0, @m String s, @m Bundle bundle0) {
        L.p(savedStateRegistry0, "registry");
        L.p(lifecycle0, "lifecycle");
        L.m(s);
        Bundle bundle1 = savedStateRegistry0.b(s);
        SavedStateHandleController savedStateHandleController0 = new SavedStateHandleController(s, SavedStateHandle.f.a(bundle1, bundle0));
        savedStateHandleController0.a(savedStateRegistry0, lifecycle0);
        LegacySavedStateHandleController.a.c(savedStateRegistry0, lifecycle0);
        return savedStateHandleController0;
    }

    private final void c(SavedStateRegistry savedStateRegistry0, Lifecycle lifecycle0) {
        State lifecycle$State0 = lifecycle0.b();
        if(lifecycle$State0 != State.b && !lifecycle$State0.b(State.d)) {
            lifecycle0.a(new LifecycleEventObserver() {
                @Override  // androidx.lifecycle.LifecycleEventObserver
                public void onStateChanged(@l LifecycleOwner lifecycleOwner0, @l Event lifecycle$Event0) {
                    L.p(lifecycleOwner0, "source");
                    L.p(lifecycle$Event0, "event");
                    if(lifecycle$Event0 == Event.ON_START) {
                        savedStateRegistry0.d(this);
                        this.b.k(OnRecreation.class);
                    }
                }
            });
            return;
        }
        savedStateRegistry0.k(OnRecreation.class);
    }
}

