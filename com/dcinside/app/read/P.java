package com.dcinside.app.read;

import com.dcinside.app.read.holder.d;
import rx.functions.b;

public final class p implements b {
    public final d a;

    public p(d d0) {
        this.a = d0;
    }

    @Override  // rx.functions.b
    public final void b(Object object0) {
        this.a.t(((Boolean)object0));
    }
}

