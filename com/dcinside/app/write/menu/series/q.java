package com.dcinside.app.write.menu.series;

import kotlin.jvm.functions.Function1;
import rx.functions.b;

public final class q implements b {
    public final Function1 a;

    public q(Function1 function10) {
        this.a = function10;
    }

    @Override  // rx.functions.b
    public final void b(Object object0) {
        SeriesManageActivity.w2(this.a, object0);
    }
}

