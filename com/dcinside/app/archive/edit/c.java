package com.dcinside.app.archive.edit;

import rx.functions.b;

public final class c implements b {
    public final ArchiveEditActivity a;

    public c(ArchiveEditActivity archiveEditActivity0) {
        this.a = archiveEditActivity0;
    }

    @Override  // rx.functions.b
    public final void b(Object object0) {
        ArchiveEditActivity.l2(this.a, ((Throwable)object0));
    }
}

