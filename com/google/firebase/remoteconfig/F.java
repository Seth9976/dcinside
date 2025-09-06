package com.google.firebase.remoteconfig;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;

public final class f implements Continuation {
    public final p a;
    public final Task b;
    public final Task c;

    public f(p p0, Task task0, Task task1) {
        this.a = p0;
        this.b = task0;
        this.c = task1;
    }

    @Override  // com.google.android.gms.tasks.Continuation
    public final Object then(Task task0) {
        return this.a.B(this.b, this.c, task0);
    }
}

