package com.dcinside.app.archive.util;

import com.dcinside.app.internal.t;
import rx.functions.a;

public final class i implements a {
    public final v a;
    public final t b;

    public i(v v0, t t0) {
        this.a = v0;
        this.b = t0;
    }

    @Override  // rx.functions.a
    public final void call() {
        u.O(this.a, this.b);
    }
}

