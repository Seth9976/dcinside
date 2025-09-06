package com.dcinside.app.post.fragments.mini;

import kotlin.jvm.functions.Function1;
import rx.functions.b;

public final class z implements b {
    public final Function1 a;

    public z(Function1 function10) {
        this.a = function10;
    }

    @Override  // rx.functions.b
    public final void b(Object object0) {
        MiniJoinQuestionActivity.W1(this.a, object0);
    }
}

