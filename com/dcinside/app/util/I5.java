package com.dcinside.app.util;

import A3.o;
import kotlin.jvm.functions.Function1;

public final class i5 implements Function1 {
    public final String a;

    public i5(String s) {
        this.a = s;
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        return uk.uD(this.a, ((o)object0));
    }
}

