package com.google.firebase.messaging;

import android.content.Intent;
import com.google.android.gms.tasks.TaskCompletionSource;

public final class i implements Runnable {
    public final j a;
    public final Intent b;
    public final TaskCompletionSource c;

    public i(j j0, Intent intent0, TaskCompletionSource taskCompletionSource0) {
        this.a = j0;
        this.b = intent0;
        this.c = taskCompletionSource0;
    }

    @Override
    public final void run() {
        this.a.i(this.b, this.c);
    }
}

