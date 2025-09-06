package com.dcinside.app.util;

import A3.o;
import kotlin.jvm.functions.Function1;

public final class rk implements Function1 {
    public final CharSequence a;

    public rk(CharSequence charSequence0) {
        this.a = charSequence0;
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        return uk.ey(this.a, ((o)object0));
    }
}

