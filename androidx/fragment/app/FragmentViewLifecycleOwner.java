package androidx.fragment.app;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle.Event;
import androidx.lifecycle.Lifecycle.State;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.SavedStateHandleSupport;
import androidx.lifecycle.SavedStateViewModelFactory;
import androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory;
import androidx.lifecycle.ViewModelProvider.Factory;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.MutableCreationExtras;
import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.SavedStateRegistryController;
import androidx.savedstate.SavedStateRegistryOwner;

class FragmentViewLifecycleOwner implements HasDefaultViewModelProviderFactory, ViewModelStoreOwner, SavedStateRegistryOwner {
    private final Fragment a;
    private final ViewModelStore b;
    private Factory c;
    private LifecycleRegistry d;
    private SavedStateRegistryController e;

    FragmentViewLifecycleOwner(@NonNull Fragment fragment0, @NonNull ViewModelStore viewModelStore0) {
        this.d = null;
        this.e = null;
        this.a = fragment0;
        this.b = viewModelStore0;
    }

    void a(@NonNull Event lifecycle$Event0) {
        this.d.l(lifecycle$Event0);
    }

    void b() {
        if(this.d == null) {
            this.d = new LifecycleRegistry(this);
            SavedStateRegistryController savedStateRegistryController0 = SavedStateRegistryController.a(this);
            this.e = savedStateRegistryController0;
            savedStateRegistryController0.c();
            SavedStateHandleSupport.c(this);
        }
    }

    boolean c() {
        return this.d != null;
    }

    void d(@Nullable Bundle bundle0) {
        this.e.d(bundle0);
    }

    void e(@NonNull Bundle bundle0) {
        this.e.e(bundle0);
    }

    void f(@NonNull State lifecycle$State0) {
        this.d.s(lifecycle$State0);
    }

    @Override  // androidx.lifecycle.HasDefaultViewModelProviderFactory
    @CallSuper
    @NonNull
    public CreationExtras getDefaultViewModelCreationExtras() {
        Application application0;
        for(Context context0 = this.a.requireContext().getApplicationContext(); true; context0 = ((ContextWrapper)context0).getBaseContext()) {
            application0 = null;
            if(!(context0 instanceof ContextWrapper)) {
                break;
            }
            if(context0 instanceof Application) {
                application0 = (Application)context0;
                break;
            }
        }
        CreationExtras creationExtras0 = new MutableCreationExtras();
        if(application0 != null) {
            ((MutableCreationExtras)creationExtras0).c(AndroidViewModelFactory.i, application0);
        }
        ((MutableCreationExtras)creationExtras0).c(SavedStateHandleSupport.c, this);
        ((MutableCreationExtras)creationExtras0).c(SavedStateHandleSupport.d, this);
        if(this.a.getArguments() != null) {
            ((MutableCreationExtras)creationExtras0).c(SavedStateHandleSupport.e, this.a.getArguments());
        }
        return creationExtras0;
    }

    @Override  // androidx.lifecycle.HasDefaultViewModelProviderFactory
    @NonNull
    public Factory getDefaultViewModelProviderFactory() {
        Application application0;
        Factory viewModelProvider$Factory0 = this.a.getDefaultViewModelProviderFactory();
        if(!viewModelProvider$Factory0.equals(this.a.mDefaultFactory)) {
            this.c = viewModelProvider$Factory0;
            return viewModelProvider$Factory0;
        }
        if(this.c == null) {
            for(Context context0 = this.a.requireContext().getApplicationContext(); true; context0 = ((ContextWrapper)context0).getBaseContext()) {
                application0 = null;
                if(!(context0 instanceof ContextWrapper)) {
                    break;
                }
                if(context0 instanceof Application) {
                    application0 = (Application)context0;
                    break;
                }
            }
            this.c = new SavedStateViewModelFactory(application0, this, this.a.getArguments());
        }
        return this.c;
    }

    @Override  // androidx.lifecycle.LifecycleOwner
    @NonNull
    public Lifecycle getLifecycle() {
        this.b();
        return this.d;
    }

    @Override  // androidx.savedstate.SavedStateRegistryOwner
    @NonNull
    public SavedStateRegistry getSavedStateRegistry() {
        this.b();
        return this.e.b();
    }

    @Override  // androidx.lifecycle.ViewModelStoreOwner
    @NonNull
    public ViewModelStore getViewModelStore() {
        this.b();
        return this.b;
    }
}

