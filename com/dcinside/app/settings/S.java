package com.dcinside.app.settings;

import kotlin.jvm.functions.Function1;
import rx.functions.p;

public final class s implements p {
    public final Function1 a;

    public s(Function1 function10) {
        this.a = function10;
    }

    @Override  // rx.functions.p
    public final Object b(Object object0) {
        return NotificationSettingActivity.C2(this.a, object0);
    }
}

