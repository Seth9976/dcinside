package com.google.firebase.remoteconfig.internal;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;

public final class t implements Continuation {
    public final u a;
    public final Task b;

    public t(u u0, Task task0) {
        this.a = u0;
        this.b = task0;
    }

    @Override  // com.google.android.gms.tasks.Continuation
    public final Object then(Task task0) {
        return this.a.s(this.b, task0);
    }
}

