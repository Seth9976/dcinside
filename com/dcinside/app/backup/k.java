package com.dcinside.app.backup;

import rx.functions.b;

public final class k implements b {
    public final BackupActivity a;

    public k(BackupActivity backupActivity0) {
        this.a = backupActivity0;
    }

    @Override  // rx.functions.b
    public final void b(Object object0) {
        BackupActivity.q2(this.a, ((Throwable)object0));
    }
}

