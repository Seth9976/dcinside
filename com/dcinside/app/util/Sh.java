package com.dcinside.app.util;

import kotlin.jvm.functions.Function1;

public final class sh implements Function1 {
    public final boolean a;

    public sh(boolean z) {
        this.a = z;
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        return uk.Tp(this.a, ((Function1)object0));
    }
}

