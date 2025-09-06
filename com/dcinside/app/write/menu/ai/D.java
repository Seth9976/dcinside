package com.dcinside.app.write.menu.ai;

import kotlin.jvm.functions.Function1;
import rx.functions.b;

public final class d implements b {
    public final Function1 a;

    public d(Function1 function10) {
        this.a = function10;
    }

    @Override  // rx.functions.b
    public final void b(Object object0) {
        AiImageHistoryActivity.v2(this.a, object0);
    }
}

