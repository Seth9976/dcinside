package com.dcinside.app.util;

import rx.functions.p;

public final class jh implements p {
    public final String a;
    public final int b;

    public jh(String s, int v) {
        this.a = s;
        this.b = v;
    }

    @Override  // rx.functions.p
    public final Object b(Object object0) {
        return uk.Ix(this.a, this.b, ((String)object0));
    }
}

