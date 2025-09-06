package com.google.firebase.remoteconfig;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;

public final class m implements Continuation {
    public final Task a;

    public m(Task task0) {
        this.a = task0;
    }

    @Override  // com.google.android.gms.tasks.Continuation
    public final Object then(Task task0) {
        return p.C(this.a, task0);
    }
}

