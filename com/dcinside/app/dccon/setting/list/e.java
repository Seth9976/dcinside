package com.dcinside.app.dccon.setting.list;

import kotlin.jvm.functions.Function1;
import rx.functions.p;

public final class e implements p {
    public final Function1 a;

    public e(Function1 function10) {
        this.a = function10;
    }

    @Override  // rx.functions.p
    public final Object b(Object object0) {
        return DcconListSettingActivity.a2(this.a, object0);
    }
}

