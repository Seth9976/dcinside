package com.dcinside.app.backup;

import rx.functions.b;

public final class s implements b {
    public final BackupActivity a;

    public s(BackupActivity backupActivity0) {
        this.a = backupActivity0;
    }

    @Override  // rx.functions.b
    public final void b(Object object0) {
        c.n(this.a, ((Throwable)object0));
    }
}

