package com.google.firebase.remoteconfig.internal;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import java.util.Map;

public final class i implements Continuation {
    public final n a;
    public final long b;
    public final Map c;

    public i(n n0, long v, Map map0) {
        this.a = n0;
        this.b = v;
        this.c = map0;
    }

    @Override  // com.google.android.gms.tasks.Continuation
    public final Object then(Task task0) {
        return this.a.v(this.b, this.c, task0);
    }
}

