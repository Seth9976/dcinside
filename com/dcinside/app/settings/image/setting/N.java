package com.dcinside.app.settings.image.setting;

import kotlin.jvm.functions.Function1;
import rx.functions.b;

public final class n implements b {
    public final Function1 a;

    public n(Function1 function10) {
        this.a = function10;
    }

    @Override  // rx.functions.b
    public final void b(Object object0) {
        DefaultImageSettingActivity.H2(this.a, object0);
    }
}

