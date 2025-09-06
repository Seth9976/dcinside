package androidx.lifecycle.viewmodel;

import androidx.lifecycle.ViewModelProvider.Factory;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.reflect.d;
import y4.l;
import z3.b;

@ViewModelFactoryDsl
@s0({"SMAP\nInitializerViewModelFactory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InitializerViewModelFactory.kt\nandroidx/lifecycle/viewmodel/InitializerViewModelFactoryBuilder\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,115:1\n37#2,2:116\n*S KotlinDebug\n*F\n+ 1 InitializerViewModelFactory.kt\nandroidx/lifecycle/viewmodel/InitializerViewModelFactoryBuilder\n*L\n54#1:116,2\n*E\n"})
public final class InitializerViewModelFactoryBuilder {
    @l
    private final List a;

    public InitializerViewModelFactoryBuilder() {
        this.a = new ArrayList();
    }

    public final void a(@l d d0, @l Function1 function10) {
        L.p(d0, "clazz");
        L.p(function10, "initializer");
        ViewModelInitializer viewModelInitializer0 = new ViewModelInitializer(b.e(d0), function10);
        this.a.add(viewModelInitializer0);
    }

    @l
    public final Factory b() {
        ViewModelInitializer[] arr_viewModelInitializer = (ViewModelInitializer[])this.a.toArray(new ViewModelInitializer[0]);
        return new InitializerViewModelFactory(((ViewModelInitializer[])Arrays.copyOf(arr_viewModelInitializer, arr_viewModelInitializer.length)));
    }
}

