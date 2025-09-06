package com.dcinside.app.util;

import kotlin.jvm.functions.Function1;

public final class bc implements Function1 {
    public final String a;
    public final String b;

    public bc(String s, String s1) {
        this.a = s;
        this.b = s1;
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        return uk.Tx(this.a, this.b, ((String)object0));
    }
}

