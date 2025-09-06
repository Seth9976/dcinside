package com.google.firebase.crashlytics.internal.concurrency;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;

public final class c implements Continuation {
    public final Runnable a;

    public c(Runnable runnable0) {
        this.a = runnable0;
    }

    @Override  // com.google.android.gms.tasks.Continuation
    public final Object then(Task task0) {
        return j.l(this.a, task0);
    }
}

