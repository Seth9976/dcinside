package com.dcinside.app.util;

import A3.o;
import com.dcinside.app.model.X;
import kotlin.jvm.functions.Function1;

public final class l9 implements Function1 {
    public final X a;

    public l9(X x0) {
        this.a = x0;
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        return uk.ul(this.a, ((o)object0));
    }
}

