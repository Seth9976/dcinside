package com.dcinside.app.settings.image.setting;

import kotlin.jvm.functions.Function1;
import rx.functions.b;

public final class w implements b {
    public final Function1 a;

    public w(Function1 function10) {
        this.a = function10;
    }

    @Override  // rx.functions.b
    public final void b(Object object0) {
        DefaultImageSettingActivity.d3(this.a, object0);
    }
}

