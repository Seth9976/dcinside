package com.dcinside.app.util;

import A3.o;
import kotlin.jvm.functions.Function1;

public final class sd implements Function1 {
    public final int a;

    public sd(int v) {
        this.a = v;
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        return uk.Fx(this.a, ((o)object0));
    }
}

