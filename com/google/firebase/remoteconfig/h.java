package com.google.firebase.remoteconfig;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;

public final class h implements Continuation {
    public final p a;

    public h(p p0) {
        this.a = p0;
    }

    @Override  // com.google.android.gms.tasks.Continuation
    public final Object then(Task task0) {
        return Boolean.valueOf(this.a.J(task0));
    }
}

