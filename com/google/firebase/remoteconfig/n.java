package com.google.firebase.remoteconfig;

import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;

public final class n implements SuccessContinuation {
    public final p a;

    public n(p p0) {
        this.a = p0;
    }

    @Override  // com.google.android.gms.tasks.SuccessContinuation
    public final Task then(Object object0) {
        return this.a.F(((Void)object0));
    }
}

