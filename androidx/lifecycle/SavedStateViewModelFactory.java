package androidx.lifecycle;

import android.annotation.SuppressLint;
import android.app.Application;
import android.os.Bundle;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.SavedStateRegistryOwner;
import java.lang.reflect.Constructor;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public final class SavedStateViewModelFactory extends OnRequeryFactory implements Factory {
    @m
    private Application b;
    @l
    private final Factory c;
    @m
    private Bundle d;
    @m
    private Lifecycle e;
    @m
    private SavedStateRegistry f;

    public SavedStateViewModelFactory() {
        this.c = new AndroidViewModelFactory();
    }

    public SavedStateViewModelFactory(@m Application application0, @l SavedStateRegistryOwner savedStateRegistryOwner0) {
        L.p(savedStateRegistryOwner0, "owner");
        this(application0, savedStateRegistryOwner0, null);
    }

    @SuppressLint({"LambdaLast"})
    public SavedStateViewModelFactory(@m Application application0, @l SavedStateRegistryOwner savedStateRegistryOwner0, @m Bundle bundle0) {
        L.p(savedStateRegistryOwner0, "owner");
        super();
        this.f = savedStateRegistryOwner0.getSavedStateRegistry();
        this.e = savedStateRegistryOwner0.getLifecycle();
        this.d = bundle0;
        this.b = application0;
        this.c = application0 == null ? new AndroidViewModelFactory() : AndroidViewModelFactory.f.b(application0);
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
        if(creationExtras0.a(SavedStateHandleSupport.c) != null && creationExtras0.a(SavedStateHandleSupport.d) != null) {
            Application application0 = (Application)creationExtras0.a(AndroidViewModelFactory.i);
            boolean z = AndroidViewModel.class.isAssignableFrom(class0);
            Constructor constructor0 = !z || application0 == null ? SavedStateViewModelFactoryKt.c(class0, SavedStateViewModelFactoryKt.b) : SavedStateViewModelFactoryKt.c(class0, SavedStateViewModelFactoryKt.a);
            if(constructor0 == null) {
                return this.c.a(class0, creationExtras0);
            }
            return !z || application0 == null ? SavedStateViewModelFactoryKt.d(class0, constructor0, new Object[]{SavedStateHandleSupport.a(creationExtras0)}) : SavedStateViewModelFactoryKt.d(class0, constructor0, new Object[]{application0, SavedStateHandleSupport.a(creationExtras0)});
        }
        if(this.e == null) {
            throw new IllegalStateException("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
        }
        return this.d(s, class0);
    }

    @Override  // androidx.lifecycle.ViewModelProvider$Factory
    @l
    public ViewModel b(@l Class class0) {
        L.p(class0, "modelClass");
        String s = class0.getCanonicalName();
        if(s == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        return this.d(s, class0);
    }

    @Override  // androidx.lifecycle.ViewModelProvider$OnRequeryFactory
    @RestrictTo({Scope.b})
    public void c(@l ViewModel viewModel0) {
        L.p(viewModel0, "viewModel");
        if(this.e != null) {
            SavedStateRegistry savedStateRegistry0 = this.f;
            L.m(savedStateRegistry0);
            Lifecycle lifecycle0 = this.e;
            L.m(lifecycle0);
            LegacySavedStateHandleController.a(viewModel0, savedStateRegistry0, lifecycle0);
        }
    }

    @l
    public final ViewModel d(@l String s, @l Class class0) {
        ViewModel viewModel0;
        L.p(s, "key");
        L.p(class0, "modelClass");
        Lifecycle lifecycle0 = this.e;
        if(lifecycle0 == null) {
            throw new UnsupportedOperationException("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
        boolean z = AndroidViewModel.class.isAssignableFrom(class0);
        Constructor constructor0 = !z || this.b == null ? SavedStateViewModelFactoryKt.c(class0, SavedStateViewModelFactoryKt.b) : SavedStateViewModelFactoryKt.c(class0, SavedStateViewModelFactoryKt.a);
        if(constructor0 == null) {
            return this.b == null ? NewInstanceFactory.b.a().b(class0) : this.c.b(class0);
        }
        SavedStateRegistry savedStateRegistry0 = this.f;
        L.m(savedStateRegistry0);
        SavedStateHandleController savedStateHandleController0 = LegacySavedStateHandleController.b(savedStateRegistry0, lifecycle0, s, this.d);
        if(z) {
            Application application0 = this.b;
            if(application0 == null) {
                viewModel0 = SavedStateViewModelFactoryKt.d(class0, constructor0, new Object[]{savedStateHandleController0.b()});
            }
            else {
                L.m(application0);
                viewModel0 = SavedStateViewModelFactoryKt.d(class0, constructor0, new Object[]{application0, savedStateHandleController0.b()});
            }
        }
        else {
            viewModel0 = SavedStateViewModelFactoryKt.d(class0, constructor0, new Object[]{savedStateHandleController0.b()});
        }
        viewModel0.setTagIfAbsent("androidx.lifecycle.savedstate.vm.tag", savedStateHandleController0);
        return viewModel0;
    }
}

