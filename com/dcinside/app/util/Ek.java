package com.dcinside.app.util;

import A3.o;
import com.dcinside.app.type.x;
import kotlin.jvm.functions.Function1;

public final class ek implements Function1 {
    public final x a;

    public ek(x x0) {
        this.a = x0;
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        return uk.iy(this.a, ((o)object0));
    }
}

