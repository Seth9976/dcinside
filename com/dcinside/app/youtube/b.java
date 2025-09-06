package com.dcinside.app.youtube;

import kotlin.jvm.functions.Function1;
import rx.functions.p;

public final class b implements p {
    public final Function1 a;

    public b(Function1 function10) {
        this.a = function10;
    }

    @Override  // rx.functions.p
    public final Object b(Object object0) {
        return YoutubeSearchActivity.q2(this.a, object0);
    }
}

