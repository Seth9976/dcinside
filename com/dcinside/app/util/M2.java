package com.dcinside.app.util;

import A3.o;
import kotlin.jvm.functions.Function1;

public final class m2 implements Function1 {
    public final String a;

    public m2(String s) {
        this.a = s;
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        return uk.Oo(this.a, ((o)object0));
    }
}

