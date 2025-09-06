package com.dcinside.app.write.temp;

import kotlin.jvm.functions.Function1;
import rx.functions.b;

public final class h implements b {
    public final Function1 a;

    public h(Function1 function10) {
        this.a = function10;
    }

    @Override  // rx.functions.b
    public final void b(Object object0) {
        PostTempActivity.n2(this.a, object0);
    }
}

