package com.dcinside.app.util;

import A3.o;
import kotlin.jvm.functions.Function1;

public final class rg implements Function1 {
    public final String a;

    public rg(String s) {
        this.a = s;
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        return uk.Gq(this.a, ((o)object0));
    }
}

