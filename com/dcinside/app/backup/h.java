package com.dcinside.app.backup;

import rx.functions.b;

public final class h implements b {
    public final BackupActivity a;
    public final int b;

    public h(BackupActivity backupActivity0, int v) {
        this.a = backupActivity0;
        this.b = v;
    }

    @Override  // rx.functions.b
    public final void b(Object object0) {
        BackupActivity.w2(this.a, this.b, ((Throwable)object0));
    }
}

