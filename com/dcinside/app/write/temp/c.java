package com.dcinside.app.write.temp;

import kotlin.jvm.functions.Function1;
import rx.functions.b;

public final class c implements b {
    public final Function1 a;

    public c(Function1 function10) {
        this.a = function10;
    }

    @Override  // rx.functions.b
    public final void b(Object object0) {
        PostTempActivity.g2(this.a, object0);
    }
}

