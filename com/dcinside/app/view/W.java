package com.dcinside.app.view;

import kotlin.jvm.functions.Function1;
import rx.functions.p;

public final class w implements p {
    public final Function1 a;

    public w(Function1 function10) {
        this.a = function10;
    }

    @Override  // rx.functions.p
    public final Object b(Object object0) {
        return PostReadFooterView.w0(this.a, object0);
    }
}

