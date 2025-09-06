package androidx.lifecycle;

import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.ViewModelInitializer;
import kotlin.jvm.internal.L;
import y4.l;
import z3.n;

public final class k {
    static {
    }

    @l
    public static ViewModel a(Factory viewModelProvider$Factory0, @l Class class0) {
        L.p(class0, "modelClass");
        throw new UnsupportedOperationException("Factory.create(String) is unsupported.  This Factory requires `CreationExtras` to be passed into `create` method.");
    }

    @l
    public static ViewModel b(Factory viewModelProvider$Factory0, @l Class class0, @l CreationExtras creationExtras0) {
        L.p(class0, "modelClass");
        L.p(creationExtras0, "extras");
        return viewModelProvider$Factory0.b(class0);
    }

    @l
    @n
    public static Factory c(@l ViewModelInitializer[] arr_viewModelInitializer) {
        return Factory.a.a(arr_viewModelInitializer);
    }
}

