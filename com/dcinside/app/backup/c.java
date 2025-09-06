package com.dcinside.app.backup;

import rx.functions.a;

public final class c implements a {
    public final BackupActivity a;

    public c(BackupActivity backupActivity0) {
        this.a = backupActivity0;
    }

    @Override  // rx.functions.a
    public final void call() {
        BackupActivity.D2(this.a);
    }
}

