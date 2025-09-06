package com.coupang.ads.tools;

import A3.a;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider.Factory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import kotlin.D;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public final class b implements D {
    @l
    private final Class a;
    @l
    private final String b;
    @l
    private final a c;
    @l
    private final a d;
    @m
    private ViewModel e;

    public b(@l Class class0, @l String s, @l a a0, @l a a1) {
        L.p(class0, "viewModelClass");
        L.p(s, "key");
        L.p(a0, "storeProducer");
        L.p(a1, "factoryProducer");
        super();
        this.a = class0;
        this.b = s;
        this.c = a0;
        this.d = a1;
    }

    @l
    public ViewModel a() {
        ViewModel viewModel0 = this.e;
        if(viewModel0 == null) {
            Factory viewModelProvider$Factory0 = (Factory)this.d.invoke();
            ViewModelStore viewModelStore0 = (ViewModelStore)this.c.invoke();
            String s = this.a.getCanonicalName();
            if(s == null) {
                throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
            }
            viewModel0 = new ViewModelProvider(viewModelStore0, viewModelProvider$Factory0).b(this.b + ':' + s, this.a);
            this.e = viewModel0;
            L.o(viewModel0, "{\n                val fa…          }\n            }");
            return viewModel0;
        }
        return viewModel0;
    }

    @Override  // kotlin.D
    public Object getValue() {
        return this.a();
    }

    @Override  // kotlin.D
    public boolean isInitialized() {
        return this.e != null;
    }
}

