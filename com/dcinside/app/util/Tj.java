package com.dcinside.app.util;

import com.dcinside.app.model.Q;
import kotlin.jvm.functions.Function1;

public final class tj implements Function1 {
    public final Q a;

    public tj(Q q0) {
        this.a = q0;
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        return uk.vy(this.a, ((String)object0));
    }
}

