package com.dcinside.app.write.menu.ai;

import kotlin.jvm.functions.Function1;
import rx.functions.p;

public final class a0 implements p {
    public final Function1 a;

    public a0(Function1 function10) {
        this.a = function10;
    }

    @Override  // rx.functions.p
    public final Object b(Object object0) {
        return AiPromptLoadActivity.c2(this.a, object0);
    }
}

