package androidx.lifecycle;

import android.os.Bundle;
import androidx.annotation.MainThread;
import androidx.lifecycle.viewmodel.CreationExtras.Key;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.InitializerViewModelFactoryBuilder;
import androidx.savedstate.SavedStateRegistry.SavedStateProvider;
import androidx.savedstate.SavedStateRegistryOwner;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import y4.l;
import z3.f;
import z3.i;

@s0({"SMAP\nSavedStateHandleSupport.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SavedStateHandleSupport.kt\nandroidx/lifecycle/SavedStateHandleSupport\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 InitializerViewModelFactory.kt\nandroidx/lifecycle/viewmodel/InitializerViewModelFactoryKt\n*L\n1#1,225:1\n1#2:226\n31#3:227\n63#3,2:228\n*S KotlinDebug\n*F\n+ 1 SavedStateHandleSupport.kt\nandroidx/lifecycle/SavedStateHandleSupport\n*L\n109#1:227\n110#1:228,2\n*E\n"})
@i(name = "SavedStateHandleSupport")
public final class SavedStateHandleSupport {
    @l
    private static final String a = "androidx.lifecycle.internal.SavedStateHandlesVM";
    @l
    private static final String b = "androidx.lifecycle.internal.SavedStateHandlesProvider";
    @l
    @f
    public static final Key c;
    @l
    @f
    public static final Key d;
    @l
    @f
    public static final Key e;

    static {
        SavedStateHandleSupport.c = new SavedStateHandleSupport.SAVED_STATE_REGISTRY_OWNER_KEY.1();
        SavedStateHandleSupport.d = new SavedStateHandleSupport.VIEW_MODEL_STORE_OWNER_KEY.1();
        SavedStateHandleSupport.e = new SavedStateHandleSupport.DEFAULT_ARGS_KEY.1();
    }

    @MainThread
    @l
    public static final SavedStateHandle a(@l CreationExtras creationExtras0) {
        L.p(creationExtras0, "<this>");
        SavedStateRegistryOwner savedStateRegistryOwner0 = (SavedStateRegistryOwner)creationExtras0.a(SavedStateHandleSupport.c);
        if(savedStateRegistryOwner0 == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
        }
        ViewModelStoreOwner viewModelStoreOwner0 = (ViewModelStoreOwner)creationExtras0.a(SavedStateHandleSupport.d);
        if(viewModelStoreOwner0 == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
        }
        Bundle bundle0 = (Bundle)creationExtras0.a(SavedStateHandleSupport.e);
        String s = (String)creationExtras0.a(NewInstanceFactory.d);
        if(s == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_KEY`");
        }
        return SavedStateHandleSupport.b(savedStateRegistryOwner0, viewModelStoreOwner0, s, bundle0);
    }

    private static final SavedStateHandle b(SavedStateRegistryOwner savedStateRegistryOwner0, ViewModelStoreOwner viewModelStoreOwner0, String s, Bundle bundle0) {
        SavedStateHandlesProvider savedStateHandlesProvider0 = SavedStateHandleSupport.d(savedStateRegistryOwner0);
        SavedStateHandlesVM savedStateHandlesVM0 = SavedStateHandleSupport.e(viewModelStoreOwner0);
        SavedStateHandle savedStateHandle0 = (SavedStateHandle)savedStateHandlesVM0.c().get(s);
        if(savedStateHandle0 == null) {
            Bundle bundle1 = savedStateHandlesProvider0.b(s);
            savedStateHandle0 = SavedStateHandle.f.a(bundle1, bundle0);
            savedStateHandlesVM0.c().put(s, savedStateHandle0);
        }
        return savedStateHandle0;
    }

    @MainThread
    public static final void c(@l SavedStateRegistryOwner savedStateRegistryOwner0) {
        L.p(savedStateRegistryOwner0, "<this>");
        State lifecycle$State0 = savedStateRegistryOwner0.getLifecycle().b();
        if(lifecycle$State0 != State.b && lifecycle$State0 != State.c) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if(savedStateRegistryOwner0.getSavedStateRegistry().c("androidx.lifecycle.internal.SavedStateHandlesProvider") == null) {
            SavedStateHandlesProvider savedStateHandlesProvider0 = new SavedStateHandlesProvider(savedStateRegistryOwner0.getSavedStateRegistry(), ((ViewModelStoreOwner)savedStateRegistryOwner0));
            savedStateRegistryOwner0.getSavedStateRegistry().j("androidx.lifecycle.internal.SavedStateHandlesProvider", savedStateHandlesProvider0);
            savedStateRegistryOwner0.getLifecycle().a(new SavedStateHandleAttacher(savedStateHandlesProvider0));
        }
    }

    @l
    public static final SavedStateHandlesProvider d(@l SavedStateRegistryOwner savedStateRegistryOwner0) {
        L.p(savedStateRegistryOwner0, "<this>");
        SavedStateProvider savedStateRegistry$SavedStateProvider0 = savedStateRegistryOwner0.getSavedStateRegistry().c("androidx.lifecycle.internal.SavedStateHandlesProvider");
        SavedStateHandlesProvider savedStateHandlesProvider0 = savedStateRegistry$SavedStateProvider0 instanceof SavedStateHandlesProvider ? ((SavedStateHandlesProvider)savedStateRegistry$SavedStateProvider0) : null;
        if(savedStateHandlesProvider0 == null) {
            throw new IllegalStateException("enableSavedStateHandles() wasn\'t called prior to createSavedStateHandle() call");
        }
        return savedStateHandlesProvider0;
    }

    @l
    public static final SavedStateHandlesVM e(@l ViewModelStoreOwner viewModelStoreOwner0) {
        L.p(viewModelStoreOwner0, "<this>");
        InitializerViewModelFactoryBuilder initializerViewModelFactoryBuilder0 = new InitializerViewModelFactoryBuilder();
        initializerViewModelFactoryBuilder0.a(m0.d(SavedStateHandlesVM.class), androidx.lifecycle.SavedStateHandleSupport.savedStateHandlesVM.1.1.e);
        return (SavedStateHandlesVM)new ViewModelProvider(viewModelStoreOwner0, initializerViewModelFactoryBuilder0.b()).b("androidx.lifecycle.internal.SavedStateHandlesVM", SavedStateHandlesVM.class);

        final class androidx.lifecycle.SavedStateHandleSupport.savedStateHandlesVM.1.1 extends N implements Function1 {
            public static final androidx.lifecycle.SavedStateHandleSupport.savedStateHandlesVM.1.1 e;

            static {
                androidx.lifecycle.SavedStateHandleSupport.savedStateHandlesVM.1.1.e = new androidx.lifecycle.SavedStateHandleSupport.savedStateHandlesVM.1.1();
            }

            androidx.lifecycle.SavedStateHandleSupport.savedStateHandlesVM.1.1() {
                super(1);
            }

            @l
            public final SavedStateHandlesVM a(@l CreationExtras creationExtras0) {
                L.p(creationExtras0, "$this$initializer");
                return new SavedStateHandlesVM();
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((CreationExtras)object0));
            }
        }

    }
}

