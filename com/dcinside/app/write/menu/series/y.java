package com.dcinside.app.write.menu.series;

import kotlin.jvm.functions.Function1;
import rx.functions.p;

public final class y implements p {
    public final Function1 a;

    public y(Function1 function10) {
        this.a = function10;
    }

    @Override  // rx.functions.p
    public final Object b(Object object0) {
        return SeriesManageActivity.M2(this.a, object0);
    }
}

