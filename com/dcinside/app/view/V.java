package com.dcinside.app.view;

import kotlin.jvm.functions.Function1;
import rx.functions.b;

public final class v implements b {
    public final Function1 a;

    public v(Function1 function10) {
        this.a = function10;
    }

    @Override  // rx.functions.b
    public final void b(Object object0) {
        PostReadFooterView.B0(this.a, object0);
    }
}

