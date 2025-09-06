package com.dcinside.app.util;

import A3.p;
import kotlin.jvm.functions.Function1;

public final class f1 implements Function1 {
    public final String a;

    public f1(String s) {
        this.a = s;
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        return uk.ip(this.a, ((p)object0));
    }
}

