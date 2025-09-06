package com.google.firebase.remoteconfig.internal;

import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;

public final class m implements SuccessContinuation {
    public final a a;

    public m(a n$a0) {
        this.a = n$a0;
    }

    @Override  // com.google.android.gms.tasks.SuccessContinuation
    public final Task then(Object object0) {
        return n.w(this.a, ((h)object0));
    }
}

