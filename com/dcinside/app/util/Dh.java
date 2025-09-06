package com.dcinside.app.util;

import A3.o;
import kotlin.jvm.functions.Function1;

public final class dh implements Function1 {
    public final int a;

    public dh(int v) {
        this.a = v;
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        return uk.Pv(this.a, ((o)object0));
    }
}

