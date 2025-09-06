package com.dcinside.app.backup;

import V.s;
import rx.functions.b;

public final class e implements b {
    public final BackupActivity a;
    public final boolean b;
    public final s c;
    public final boolean d;

    public e(BackupActivity backupActivity0, boolean z, s s0, boolean z1) {
        this.a = backupActivity0;
        this.b = z;
        this.c = s0;
        this.d = z1;
    }

    @Override  // rx.functions.b
    public final void b(Object object0) {
        BackupActivity.F2(this.a, this.b, this.c, this.d, ((Throwable)object0));
    }
}

