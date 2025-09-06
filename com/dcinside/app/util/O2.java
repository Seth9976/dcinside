package com.dcinside.app.util;

import A3.o;
import kotlin.jvm.functions.Function1;

public final class o2 implements Function1 {
    public final String[] a;

    public o2(String[] arr_s) {
        this.a = arr_s;
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        return uk.Qo(this.a, ((o)object0));
    }
}

