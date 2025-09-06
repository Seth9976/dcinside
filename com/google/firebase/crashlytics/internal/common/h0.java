package com.google.firebase.crashlytics.internal.common;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.CountDownLatch;

public final class h0 implements Continuation {
    public final CountDownLatch a;

    public h0(CountDownLatch countDownLatch0) {
        this.a = countDownLatch0;
    }

    @Override  // com.google.android.gms.tasks.Continuation
    public final Object then(Task task0) {
        return i0.d(this.a, task0);
    }
}

