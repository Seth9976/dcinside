package com.google.firebase.crashlytics.internal.concurrency;

import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.atomic.AtomicBoolean;

public final class a implements Continuation {
    public final TaskCompletionSource a;
    public final AtomicBoolean b;
    public final CancellationTokenSource c;

    public a(TaskCompletionSource taskCompletionSource0, AtomicBoolean atomicBoolean0, CancellationTokenSource cancellationTokenSource0) {
        this.a = taskCompletionSource0;
        this.b = atomicBoolean0;
        this.c = cancellationTokenSource0;
    }

    @Override  // com.google.android.gms.tasks.Continuation
    public final Object then(Task task0) {
        return b.b(this.a, this.b, this.c, task0);
    }
}

