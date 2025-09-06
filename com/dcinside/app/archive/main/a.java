package com.dcinside.app.archive.main;

import kotlin.jvm.functions.Function1;
import rx.functions.b;

public final class a implements b {
    public final Function1 a;

    public a(Function1 function10) {
        this.a = function10;
    }

    @Override  // rx.functions.b
    public final void b(Object object0) {
        ArchiveMainActivity.h2(this.a, object0);
    }
}

