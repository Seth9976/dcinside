package com.dcinside.app.totalsearch;

import kotlin.jvm.functions.Function1;

public final class k implements Function1 {
    public final TotalSearchActivity a;

    public k(TotalSearchActivity totalSearchActivity0) {
        this.a = totalSearchActivity0;
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        return this.a.B2(((Boolean)object0).booleanValue());
    }
}

