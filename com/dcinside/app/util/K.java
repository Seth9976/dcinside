package com.dcinside.app.util;

import java.util.List;
import rx.k.t;
import rx.m;

public final class k implements t {
    public final String a;
    public final List b;

    public k(String s, List list0) {
        this.a = s;
        this.b = list0;
    }

    @Override  // rx.functions.b
    public final void b(Object object0) {
        n.R(this.a, this.b, ((m)object0));
    }
}

