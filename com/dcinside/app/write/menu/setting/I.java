package com.dcinside.app.write.menu.setting;

import kotlin.jvm.functions.Function1;
import rx.functions.p;

public final class i implements p {
    public final Function1 a;

    public i(Function1 function10) {
        this.a = function10;
    }

    @Override  // rx.functions.p
    public final Object b(Object object0) {
        return PostAutoDeleteActivity.V1(this.a, object0);
    }
}

