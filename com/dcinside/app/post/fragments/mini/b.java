package com.dcinside.app.post.fragments.mini;

import kotlin.jvm.functions.Function1;
import rx.functions.p;

public final class b implements p {
    public final Function1 a;

    public b(Function1 function10) {
        this.a = function10;
    }

    @Override  // rx.functions.p
    public final Object b(Object object0) {
        return t.z0(this.a, object0);
    }
}

