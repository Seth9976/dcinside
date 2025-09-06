package com.google.firebase.crashlytics.internal.concurrency;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Callable;

public final class f implements Continuation {
    public final Callable a;

    public f(Callable callable0) {
        this.a = callable0;
    }

    @Override  // com.google.android.gms.tasks.Continuation
    public final Object then(Task task0) {
        return j.m(this.a, task0);
    }
}

