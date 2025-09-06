package com.dcinside.app.realm;

import com.dcinside.app.base.g;
import rx.functions.b;

public final class n0 implements b {
    public final g a;

    public n0(g g0) {
        this.a = g0;
    }

    @Override  // rx.functions.b
    public final void b(Object object0) {
        a.t(this.a, ((Throwable)object0));
    }
}

