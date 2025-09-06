package com.dcinside.app.util;

import A3.o;
import com.dcinside.app.model.V;
import kotlin.jvm.functions.Function1;

public final class se implements Function1 {
    public final V a;

    public se(V v0) {
        this.a = v0;
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        return uk.Hy(this.a, ((o)object0));
    }
}

