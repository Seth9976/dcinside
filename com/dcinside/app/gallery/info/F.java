package com.dcinside.app.gallery.info;

import kotlin.jvm.functions.Function1;
import rx.functions.p;

public final class f implements p {
    public final Function1 a;

    public f(Function1 function10) {
        this.a = function10;
    }

    @Override  // rx.functions.p
    public final Object b(Object object0) {
        return MajorInfoFragment.E0(this.a, object0);
    }
}

