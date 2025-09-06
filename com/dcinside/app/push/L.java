package com.dcinside.app.push;

import kotlin.jvm.functions.Function1;
import rx.functions.p;

public final class l implements p {
    public final Function1 a;

    public l(Function1 function10) {
        this.a = function10;
    }

    @Override  // rx.functions.p
    public final Object b(Object object0) {
        return GalleryPushSettingActivity.j2(this.a, object0);
    }
}

