package com.dcinside.app.read.reply.more;

import kotlin.jvm.functions.Function1;

public final class b implements rx.functions.b {
    public final Function1 a;

    public b(Function1 function10) {
        this.a = function10;
    }

    @Override  // rx.functions.b
    public final void b(Object object0) {
        f.N(this.a, object0);
    }
}

