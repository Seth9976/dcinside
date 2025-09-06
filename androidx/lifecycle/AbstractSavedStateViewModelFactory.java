package androidx.lifecycle;

import android.os.Bundle;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.SavedStateRegistryOwner;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

public abstract class AbstractSavedStateViewModelFactory extends OnRequeryFactory implements Factory {
    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }
    }

    @m
    private SavedStateRegistry b;
    @m
    private Lifecycle c;
    @m
    private Bundle d;
    @l
    public static final Companion e = null;
    @l
    public static final String f = "androidx.lifecycle.savedstate.vm.tag";

    static {
        AbstractSavedStateViewModelFactory.e = new Companion(null);
    }

    public AbstractSavedStateViewModelFactory() {
    }

    public AbstractSavedStateViewModelFactory(@l SavedStateRegistryOwner savedStateRegistryOwner0, @m Bundle bundle0) {
        L.p(savedStateRegistryOwner0, "owner");
        super();
        this.b = savedStateRegistryOwner0.getSavedStateRegistry();
        this.c = savedStateRegistryOwner0.getLifecycle();
        this.d = bundle0;
    }

    @Override  // androidx.lifecycle.ViewModelProvider$Factory
    @l
    public ViewModel a(@l Class class0, @l CreationExtras creationExtras0) {
        L.p(class0, "modelClass");
        L.p(creationExtras0, "extras");
        String s = (String)creationExtras0.a(NewInstanceFactory.d);
        if(s == null) {
            throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
        }
        return this.b == null ? this.e(s, class0, SavedStateHandleSupport.a(creationExtras0)) : this.d(s, class0);
    }

    @Override  // androidx.lifecycle.ViewModelProvider$Factory
    @l
    public ViewModel b(@l Class class0) {
        L.p(class0, "modelClass");
        String s = class0.getCanonicalName();
        if(s == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        if(this.c == null) {
            throw new UnsupportedOperationException("AbstractSavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
        return this.d(s, class0);
    }

    @Override  // androidx.lifecycle.ViewModelProvider$OnRequeryFactory
    @RestrictTo({Scope.b})
    public void c(@l ViewModel viewModel0) {
        L.p(viewModel0, "viewModel");
        SavedStateRegistry savedStateRegistry0 = this.b;
        if(savedStateRegistry0 != null) {
            L.m(savedStateRegistry0);
            Lifecycle lifecycle0 = this.c;
            L.m(lifecycle0);
            LegacySavedStateHandleController.a(viewModel0, savedStateRegistry0, lifecycle0);
        }
    }

    private final ViewModel d(String s, Class class0) {
        SavedStateRegistry savedStateRegistry0 = this.b;
        L.m(savedStateRegistry0);
        Lifecycle lifecycle0 = this.c;
        L.m(lifecycle0);
        SavedStateHandleController savedStateHandleController0 = LegacySavedStateHandleController.b(savedStateRegistry0, lifecycle0, s, this.d);
        ViewModel viewModel0 = this.e(s, class0, savedStateHandleController0.b());
        viewModel0.setTagIfAbsent("androidx.lifecycle.savedstate.vm.tag", savedStateHandleController0);
        return viewModel0;
    }

    @l
    protected abstract ViewModel e(@l String arg1, @l Class arg2, @l SavedStateHandle arg3);
}

