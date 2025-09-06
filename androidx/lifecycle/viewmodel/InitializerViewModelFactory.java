package androidx.lifecycle.viewmodel;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider.Factory;
import androidx.lifecycle.k;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;

@s0({"SMAP\nInitializerViewModelFactory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InitializerViewModelFactory.kt\nandroidx/lifecycle/viewmodel/InitializerViewModelFactory\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,115:1\n13579#2,2:116\n*S KotlinDebug\n*F\n+ 1 InitializerViewModelFactory.kt\nandroidx/lifecycle/viewmodel/InitializerViewModelFactory\n*L\n105#1:116,2\n*E\n"})
public final class InitializerViewModelFactory implements Factory {
    @l
    private final ViewModelInitializer[] b;

    public InitializerViewModelFactory(@l ViewModelInitializer[] arr_viewModelInitializer) {
        L.p(arr_viewModelInitializer, "initializers");
        super();
        this.b = arr_viewModelInitializer;
    }

    @Override  // androidx.lifecycle.ViewModelProvider$Factory
    @l
    public ViewModel a(@l Class class0, @l CreationExtras creationExtras0) {
        L.p(class0, "modelClass");
        L.p(creationExtras0, "extras");
        ViewModelInitializer[] arr_viewModelInitializer = this.b;
        ViewModel viewModel0 = null;
        for(int v = 0; v < arr_viewModelInitializer.length; ++v) {
            ViewModelInitializer viewModelInitializer0 = arr_viewModelInitializer[v];
            if(L.g(viewModelInitializer0.a(), class0)) {
                Object object0 = viewModelInitializer0.b().invoke(creationExtras0);
                viewModel0 = object0 instanceof ViewModel ? ((ViewModel)object0) : null;
            }
        }
        if(viewModel0 == null) {
            throw new IllegalArgumentException("No initializer set for given class " + class0.getName());
        }
        return viewModel0;
    }

    @Override  // androidx.lifecycle.ViewModelProvider$Factory
    public ViewModel b(Class class0) {
        return k.a(this, class0);
    }
}

