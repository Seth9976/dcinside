package com.dcinside.app.util;

import com.dcinside.app.type.m;
import kotlin.jvm.functions.Function1;

public final class t2 implements Function1 {
    public final m a;

    public t2(m m0) {
        this.a = m0;
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        return uk.ov(this.a, ((Function1)object0));
    }
}

