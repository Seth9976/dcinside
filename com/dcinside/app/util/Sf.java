package com.dcinside.app.util;

import A3.o;
import kotlin.jvm.functions.Function1;

public final class sf implements Function1 {
    public final String[] a;

    public sf(String[] arr_s) {
        this.a = arr_s;
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        return uk.fE(this.a, ((o)object0));
    }
}

