package com.dcinside.app.archive.main;

import kotlin.jvm.functions.Function1;

public final class b implements rx.functions.b {
    public final Function1 a;

    public b(Function1 function10) {
        this.a = function10;
    }

    @Override  // rx.functions.b
    public final void b(Object object0) {
        ArchiveMainActivity.i2(this.a, object0);
    }
}

