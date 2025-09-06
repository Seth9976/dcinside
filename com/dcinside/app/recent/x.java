package com.dcinside.app.recent;

import com.dcinside.app.base.g;
import rx.functions.b;

public final class x implements b {
    public final g a;

    public x(g g0) {
        this.a = g0;
    }

    @Override  // rx.functions.b
    public final void b(Object object0) {
        RecentView.c0(this.a, ((Throwable)object0));
    }
}

