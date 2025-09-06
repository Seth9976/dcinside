package com.dcinside.app.settings.block.post;

import kotlin.jvm.functions.Function1;
import rx.functions.p;

public final class a implements p {
    public final Function1 a;

    public a(Function1 function10) {
        this.a = function10;
    }

    @Override  // rx.functions.p
    public final Object b(Object object0) {
        return BlockItemAddActivity.f2(this.a, object0);
    }
}

