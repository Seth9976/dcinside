package com.dcinside.app.push;

import kotlin.jvm.functions.Function1;
import rx.functions.b;

public final class t implements b {
    public final Function1 a;

    public t(Function1 function10) {
        this.a = function10;
    }

    @Override  // rx.functions.b
    public final void b(Object object0) {
        GalleryPushSettingActivity.A2(this.a, object0);
    }
}

