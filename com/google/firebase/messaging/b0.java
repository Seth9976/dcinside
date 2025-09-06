package com.google.firebase.messaging;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;

public final class b0 implements Continuation {
    public final c0 a;
    public final String b;

    public b0(c0 c00, String s) {
        this.a = c00;
        this.b = s;
    }

    @Override  // com.google.android.gms.tasks.Continuation
    public final Object then(Task task0) {
        return this.a.c(this.b, task0);
    }
}

