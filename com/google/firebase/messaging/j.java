package com.google.firebase.messaging;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;

public final class J implements Continuation {
    public final K a;

    public J(K k0) {
        this.a = k0;
    }

    @Override  // com.google.android.gms.tasks.Continuation
    public final Object then(Task task0) {
        return this.a.j(task0);
    }
}

