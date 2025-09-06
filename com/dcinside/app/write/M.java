package com.dcinside.app.write;

import kotlin.jvm.functions.Function1;
import rx.functions.b;

public final class m implements b {
    public final Function1 a;

    public m(Function1 function10) {
        this.a = function10;
    }

    @Override  // rx.functions.b
    public final void b(Object object0) {
        PostWriteActivity.W6(this.a, object0);
    }
}

