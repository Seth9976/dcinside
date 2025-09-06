package com.google.firebase.crashlytics.internal.concurrency;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;

public final class i implements Continuation {
    public final SuccessContinuation a;

    public i(SuccessContinuation successContinuation0) {
        this.a = successContinuation0;
    }

    @Override  // com.google.android.gms.tasks.Continuation
    public final Object then(Task task0) {
        return j.p(this.a, task0);
    }
}

