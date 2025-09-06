package com.dcinside.app.archive.folder;

import kotlin.jvm.functions.Function1;
import rx.functions.b;

public final class a implements b {
    public final Function1 a;

    public a(Function1 function10) {
        this.a = function10;
    }

    @Override  // rx.functions.b
    public final void b(Object object0) {
        ArchiveFolderActivity.R1(this.a, object0);
    }
}

