package com.dcinside.app.settings;

import kotlin.jvm.functions.Function1;
import rx.functions.b;

public final class a0 implements b {
    public final Function1 a;

    public a0(Function1 function10) {
        this.a = function10;
    }

    @Override  // rx.functions.b
    public final void b(Object object0) {
        ScreenSettingActivity.E2(this.a, object0);
    }
}

