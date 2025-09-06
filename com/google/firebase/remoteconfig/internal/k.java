package com.google.firebase.remoteconfig.internal;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import java.util.Date;

public final class k implements Continuation {
    public final n a;
    public final Date b;

    public k(n n0, Date date0) {
        this.a = n0;
        this.b = date0;
    }

    @Override  // com.google.android.gms.tasks.Continuation
    public final Object then(Task task0) {
        return this.a.y(this.b, task0);
    }
}

