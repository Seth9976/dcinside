package com.dcinside.app.util;

import rx.functions.p;

public final class d5 implements p {
    public final String a;

    public d5(String s) {
        this.a = s;
    }

    @Override  // rx.functions.p
    public final Object b(Object object0) {
        return uk.kp(this.a, ((String)object0));
    }
}

