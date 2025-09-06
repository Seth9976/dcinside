package com.google.firebase.crashlytics.internal.common;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;

public final class d0 implements Continuation {
    public final f0 a;

    public d0(f0 f00) {
        this.a = f00;
    }

    @Override  // com.google.android.gms.tasks.Continuation
    public final Object then(Task task0) {
        return Boolean.valueOf(this.a.u(task0));
    }
}

