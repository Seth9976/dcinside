package com.dcinside.app.image;

import kotlin.jvm.functions.Function1;
import rx.functions.p;

public final class x implements p {
    public final Function1 a;

    public x(Function1 function10) {
        this.a = function10;
    }

    @Override  // rx.functions.p
    public final Object b(Object object0) {
        return ImageViewerActivity.m3(this.a, object0);
    }
}

