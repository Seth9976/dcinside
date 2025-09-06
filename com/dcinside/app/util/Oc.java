package com.dcinside.app.util;

import A3.o;
import com.dcinside.app.model.Q;
import kotlin.jvm.functions.Function1;

public final class oc implements Function1 {
    public final Q a;

    public oc(Q q0) {
        this.a = q0;
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        return uk.wz(this.a, ((o)object0));
    }
}

