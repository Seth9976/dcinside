package com.dcinside.app.util;

import A3.o;
import kotlin.jvm.functions.Function1;

public final class ri implements Function1 {
    public final int[] a;

    public ri(int[] arr_v) {
        this.a = arr_v;
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        return uk.nw(this.a, ((o)object0));
    }
}

