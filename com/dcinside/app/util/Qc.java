package com.dcinside.app.util;

import A3.o;
import kotlin.jvm.functions.Function1;

public final class qc implements Function1 {
    public final int a;

    public qc(int v) {
        this.a = v;
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        return uk.yz(this.a, ((o)object0));
    }
}

