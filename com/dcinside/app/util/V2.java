package com.dcinside.app.util;

import com.dcinside.app.type.m;
import kotlin.jvm.functions.Function1;

public final class v2 implements Function1 {
    public final m a;
    public final String b;

    public v2(m m0, String s) {
        this.a = m0;
        this.b = s;
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        return uk.qv(this.a, this.b, ((Function1)object0));
    }
}

