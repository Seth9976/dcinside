package com.google.firebase.remoteconfig.internal;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;

public final class s implements Continuation {
    public final u a;
    public final Task b;
    public final Task c;

    public s(u u0, Task task0, Task task1) {
        this.a = u0;
        this.b = task0;
        this.c = task1;
    }

    @Override  // com.google.android.gms.tasks.Continuation
    public final Object then(Task task0) {
        return this.a.t(this.b, this.c, task0);
    }
}

