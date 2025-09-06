package com.google.firebase.remoteconfig;

import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.remoteconfig.internal.n.a;

public final class o implements SuccessContinuation {
    @Override  // com.google.android.gms.tasks.SuccessContinuation
    public final Task then(Object object0) {
        return p.D(((a)object0));
    }
}

