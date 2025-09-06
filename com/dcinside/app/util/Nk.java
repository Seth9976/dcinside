package com.dcinside.app.util;

import A3.o;
import kotlin.jvm.functions.Function1;

public final class nk implements Function1 {
    public final int a;

    public nk(int v) {
        this.a = v;
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        return uk.Zx(this.a, ((o)object0));
    }
}

