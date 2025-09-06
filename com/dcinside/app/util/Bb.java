package com.dcinside.app.util;

import com.dcinside.app.model.X;
import rx.functions.p;

public final class bb implements p {
    public final X a;

    public bb(X x0) {
        this.a = x0;
    }

    @Override  // rx.functions.p
    public final Object b(Object object0) {
        return uk.yl(this.a, ((String)object0));
    }
}

