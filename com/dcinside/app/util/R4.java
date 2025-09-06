package com.dcinside.app.util;

import rx.functions.p;

public final class r4 implements p {
    public final String a;
    public final String b;

    public r4(String s, String s1) {
        this.a = s;
        this.b = s1;
    }

    @Override  // rx.functions.p
    public final Object b(Object object0) {
        return uk.Em(this.a, this.b, ((String)object0));
    }
}

