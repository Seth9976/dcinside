package com.dcinside.app.util;

import com.dcinside.app.model.Q;
import rx.functions.p;

public final class hf implements p {
    public final Q a;

    public hf(Q q0) {
        this.a = q0;
    }

    @Override  // rx.functions.p
    public final Object b(Object object0) {
        return uk.ct(this.a, ((String)object0));
    }
}

