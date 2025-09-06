package com.dcinside.app.write;

import kotlin.jvm.functions.Function1;
import rx.functions.b;

public final class c0 implements b {
    public final Function1 a;

    public c0(Function1 function10) {
        this.a = function10;
    }

    @Override  // rx.functions.b
    public final void b(Object object0) {
        PostWriteActivity.O5(this.a, object0);
    }
}

