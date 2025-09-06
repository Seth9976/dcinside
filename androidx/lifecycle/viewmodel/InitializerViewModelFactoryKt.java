package androidx.lifecycle.viewmodel;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider.Factory;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.m0;
import y4.l;

public final class InitializerViewModelFactoryKt {
    public static final void a(InitializerViewModelFactoryBuilder initializerViewModelFactoryBuilder0, Function1 function10) {
        L.p(initializerViewModelFactoryBuilder0, "<this>");
        L.p(function10, "initializer");
        L.y(4, "VM");
        initializerViewModelFactoryBuilder0.a(m0.d(ViewModel.class), function10);
    }

    @l
    public static final Factory b(@l Function1 function10) {
        L.p(function10, "builder");
        InitializerViewModelFactoryBuilder initializerViewModelFactoryBuilder0 = new InitializerViewModelFactoryBuilder();
        function10.invoke(initializerViewModelFactoryBuilder0);
        return initializerViewModelFactoryBuilder0.b();
    }
}

