package com.dcinside.app.archive.edit;

import rx.functions.b;

public final class e implements b {
    public final ArchiveEditActivity a;

    public e(ArchiveEditActivity archiveEditActivity0) {
        this.a = archiveEditActivity0;
    }

    @Override  // rx.functions.b
    public final void b(Object object0) {
        ArchiveEditActivity.p2(this.a, ((Throwable)object0));
    }
}

