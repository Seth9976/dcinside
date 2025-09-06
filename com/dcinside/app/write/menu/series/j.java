package com.dcinside.app.write.menu.series;

import kotlin.jvm.functions.Function1;
import rx.functions.b;

public final class j implements b {
    public final Function1 a;

    public j(Function1 function10) {
        this.a = function10;
    }

    @Override  // rx.functions.b
    public final void b(Object object0) {
        SeriesListActivity.f2(this.a, object0);
    }
}

