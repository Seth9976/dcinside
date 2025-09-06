package com.dcinside.app.backup.process;

import A3.s;
import rx.functions.u;

public final class b implements u {
    public final s a;

    public b(s s0) {
        this.a = s0;
    }

    @Override  // rx.functions.u
    public final Object k(Object object0, Object object1, Object object2, Object object3, Object object4, Object object5) {
        return AutoBackupWorker.k(this.a, object0, object1, object2, object3, object4, object5);
    }
}

