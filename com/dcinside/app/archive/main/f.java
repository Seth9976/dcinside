package com.dcinside.app.archive.main;

import rx.functions.b;

public final class f implements b {
    public final ArchiveMainActivity a;

    public f(ArchiveMainActivity archiveMainActivity0) {
        this.a = archiveMainActivity0;
    }

    @Override  // rx.functions.b
    public final void b(Object object0) {
        ArchiveMainActivity.d2(this.a, ((Throwable)object0));
    }
}

