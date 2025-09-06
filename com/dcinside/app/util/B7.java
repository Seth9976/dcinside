package com.dcinside.app.util;

import rx.functions.p;

public final class b7 implements p {
    public final String a;

    public b7(String s) {
        this.a = s;
    }

    @Override  // rx.functions.p
    public final Object b(Object object0) {
        return uk.lz(this.a, ((String)object0));
    }
}

