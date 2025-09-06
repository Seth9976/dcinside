package com.google.firebase.remoteconfig.internal;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;

public final class b implements Continuation {
    public final c a;
    public final Task b;
    public final Task c;
    public final long d;
    public final int e;

    public b(c c0, Task task0, Task task1, long v, int v1) {
        this.a = c0;
        this.b = task0;
        this.c = task1;
        this.d = v;
        this.e = v1;
    }

    @Override  // com.google.android.gms.tasks.Continuation
    public final Object then(Task task0) {
        return this.a.h(this.b, this.c, this.d, this.e, task0);
    }
}

