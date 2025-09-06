package com.dcinside.app.archive.edit;

import kotlin.jvm.functions.Function1;

public final class b implements rx.functions.b {
    public final Function1 a;

    public b(Function1 function10) {
        this.a = function10;
    }

    @Override  // rx.functions.b
    public final void b(Object object0) {
        ArchiveEditActivity.k2(this.a, object0);
    }
}

