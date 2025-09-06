package com.dcinside.app.backup;

import rx.functions.a;

public final class b implements a {
    public final BackupActivity a;

    public b(BackupActivity backupActivity0) {
        this.a = backupActivity0;
    }

    @Override  // rx.functions.a
    public final void call() {
        BackupActivity.C2(this.a);
    }
}

