package com.dcinside.app.backup;

import V.s;
import rx.functions.b;

public final class v implements b {
    public final BackupActivity a;
    public final s b;
    public final boolean c;

    public v(BackupActivity backupActivity0, s s0, boolean z) {
        this.a = backupActivity0;
        this.b = s0;
        this.c = z;
    }

    @Override  // rx.functions.b
    public final void b(Object object0) {
        m.h(this.a, this.b, this.c, ((Throwable)object0));
    }
}

