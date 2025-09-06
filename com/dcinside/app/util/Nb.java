package com.dcinside.app.util;

import rx.functions.p;

public final class nb implements p {
    public final String a;
    public final int b;

    public nb(String s, int v) {
        this.a = s;
        this.b = v;
    }

    @Override  // rx.functions.p
    public final Object b(Object object0) {
        return uk.km(this.a, this.b, ((String)object0));
    }
}

