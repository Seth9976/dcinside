package com.dcinside.app.perform;

import kotlin.jvm.functions.Function1;
import rx.n;

public final class a implements rx.g.a {
    public final e a;
    public final Function1 b;
    public final com.dcinside.app.perform.e.a c;

    public a(e e0, Function1 function10, com.dcinside.app.perform.e.a e$a0) {
        this.a = e0;
        this.b = function10;
        this.c = e$a0;
    }

    @Override  // rx.functions.b
    public final void b(Object object0) {
        e.k(this.a, this.b, this.c, ((n)object0));
    }
}

