package com.dcinside.app.util;

import A3.o;
import kotlin.jvm.functions.Function1;

public final class ik implements Function1 {
    public final String a;

    public ik(String s) {
        this.a = s;
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        return uk.ly(this.a, ((o)object0));
    }
}

