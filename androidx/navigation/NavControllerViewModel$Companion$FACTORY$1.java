package androidx.navigation;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider.Factory;
import androidx.lifecycle.k;
import androidx.lifecycle.viewmodel.CreationExtras;
import kotlin.jvm.internal.L;
import y4.l;

public final class NavControllerViewModel.Companion.FACTORY.1 implements Factory {
    @Override  // androidx.lifecycle.ViewModelProvider$Factory
    public ViewModel a(Class class0, CreationExtras creationExtras0) {
        return k.b(this, class0, creationExtras0);
    }

    @Override  // androidx.lifecycle.ViewModelProvider$Factory
    @l
    public ViewModel b(@l Class class0) {
        L.p(class0, "modelClass");
        return new NavControllerViewModel();
    }
}

