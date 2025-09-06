package com.dcinside.app.main.showgallery;

import kotlin.jvm.functions.Function1;
import rx.functions.b;

public final class h implements b {
    public final Function1 a;

    public h(Function1 function10) {
        this.a = function10;
    }

    @Override  // rx.functions.b
    public final void b(Object object0) {
        k.D0(this.a, object0);
    }
}

