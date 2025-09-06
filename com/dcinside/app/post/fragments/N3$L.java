package com.dcinside.app.post.fragments;

import kotlin.S0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;

final class N3.L extends N implements Function1 {
    final N3 e;

    N3.L(N3 n30) {
        this.e = n30;
        super(1);
    }

    public final void a(Boolean boolean0) {
        L.m(boolean0);
        this.e.B6(boolean0.booleanValue());
    }

    @Override  // kotlin.jvm.functions.Function1
    public Object invoke(Object object0) {
        this.a(((Boolean)object0));
        return S0.a;
    }
}

