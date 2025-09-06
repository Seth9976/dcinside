package com.dcinside.app.read;

import com.dcinside.app.read.holder.d;
import rx.functions.b;

public final class g implements b {
    public final d a;

    public g(d d0) {
        this.a = d0;
    }

    @Override  // rx.functions.b
    public final void b(Object object0) {
        this.a.s(((Boolean)object0).booleanValue());
    }
}

