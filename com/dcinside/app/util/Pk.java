package com.dcinside.app.util;

import A3.o;
import com.dcinside.app.response.PostHead;
import kotlin.jvm.functions.Function1;

public final class pk implements Function1 {
    public final PostHead a;

    public pk(PostHead postHead0) {
        this.a = postHead0;
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        return uk.cy(this.a, ((o)object0));
    }
}

