package com.dcinside.app.bookmark;

import rx.functions.b;

public final class l implements b {
    public final v a;
    public final J b;

    public l(v v0, J j0) {
        this.a = v0;
        this.b = j0;
    }

    @Override  // rx.functions.b
    public final void b(Object object0) {
        v.s(this.a, this.b, ((Throwable)object0));
    }
}

