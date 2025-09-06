package com.dcinside.app.util;

import A3.o;
import kotlin.jvm.functions.Function1;

public final class l1 implements Function1 {
    public final String a;

    public l1(String s) {
        this.a = s;
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        return uk.Qs(this.a, ((o)object0));
    }
}

