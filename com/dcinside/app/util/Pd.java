package com.dcinside.app.util;

import A3.o;
import kotlin.jvm.functions.Function1;

public final class pd implements Function1 {
    public final String a;

    public pd(String s) {
        this.a = s;
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        return uk.Dx(this.a, ((o)object0));
    }
}

