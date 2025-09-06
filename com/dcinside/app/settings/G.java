package com.dcinside.app.settings;

import kotlin.jvm.functions.Function1;
import rx.functions.p;

public final class g implements p {
    public final Function1 a;

    public g(Function1 function10) {
        this.a = function10;
    }

    @Override  // rx.functions.p
    public final Object b(Object object0) {
        return FontSettingActivity.r2(this.a, object0);
    }
}

