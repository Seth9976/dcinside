package com.dcinside.app.settings.spoiler;

import kotlin.jvm.functions.Function1;
import rx.functions.p;

public final class a implements p {
    public final Function1 a;

    public a(Function1 function10) {
        this.a = function10;
    }

    @Override  // rx.functions.p
    public final Object b(Object object0) {
        return SpoilerSettingActivity.L1(this.a, object0);
    }
}

