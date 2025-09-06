package com.dcinside.app.write;

import kotlin.jvm.functions.Function1;
import rx.functions.b;

public final class z0 implements b {
    public final Function1 a;

    public z0(Function1 function10) {
        this.a = function10;
    }

    @Override  // rx.functions.b
    public final void b(Object object0) {
        PostWriteActivity.T5(this.a, object0);
    }
}

