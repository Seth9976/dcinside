package com.google.firebase.remoteconfig.internal;

import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;

public final class e implements SuccessContinuation {
    public final g a;
    public final boolean b;
    public final h c;

    public e(g g0, boolean z, h h0) {
        this.a = g0;
        this.b = z;
        this.c = h0;
    }

    @Override  // com.google.android.gms.tasks.SuccessContinuation
    public final Task then(Object object0) {
        return this.a.l(this.b, this.c, ((Void)object0));
    }
}

