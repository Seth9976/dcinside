package com.dcinside.app.write.menu.setting;

import kotlin.jvm.functions.Function1;
import rx.functions.b;

public final class j implements b {
    public final Function1 a;

    public j(Function1 function10) {
        this.a = function10;
    }

    @Override  // rx.functions.b
    public final void b(Object object0) {
        PostAutoDeleteActivity.W1(this.a, object0);
    }
}

