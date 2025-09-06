package com.coupang.ads.tools;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider.Factory;
import androidx.lifecycle.k;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.coupang.ads.viewmodels.AdsRequest;
import kotlin.jvm.internal.L;
import y4.l;

public final class a implements Factory {
    @l
    private final AdsRequest b;

    public a(@l AdsRequest adsRequest0) {
        L.p(adsRequest0, "adsRequest");
        super();
        this.b = adsRequest0;
    }

    @Override  // androidx.lifecycle.ViewModelProvider$Factory
    public ViewModel a(Class class0, CreationExtras creationExtras0) {
        return k.b(this, class0, creationExtras0);
    }

    @Override  // androidx.lifecycle.ViewModelProvider$Factory
    @l
    public ViewModel b(@l Class class0) {
        L.p(class0, "modelClass");
        Object object0 = class0.getConstructor(AdsRequest.class).newInstance(this.b);
        L.o(object0, "modelClass.getConstructo…     adsRequest\n        )");
        return (ViewModel)object0;
    }

    @l
    public final AdsRequest c() {
        return this.b;
    }
}

