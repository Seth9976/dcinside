package com.dcinside.app.util;

import A3.o;
import kotlin.jvm.functions.Function1;

public final class y0 implements Function1 {
    public final boolean a;
    public final String b;

    public y0(boolean z, String s) {
        this.a = z;
        this.b = s;
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        return uk.SD(this.a, this.b, ((o)object0));
    }
}

