package com.dcinside.app.util;

import com.dcinside.app.model.Q;
import rx.functions.p;

public final class q2 implements p {
    public final String a;
    public final Q b;

    public q2(String s, Q q0) {
        this.a = s;
        this.b = q0;
    }

    @Override  // rx.functions.p
    public final Object b(Object object0) {
        return uk.wy(this.a, this.b, ((String)object0));
    }
}

