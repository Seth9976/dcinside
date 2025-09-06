package com.google.firebase.remoteconfig.internal;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import java.util.Date;
import java.util.Map;

public final class j implements Continuation {
    public final n a;
    public final Task b;
    public final Task c;
    public final Date d;
    public final Map e;

    public j(n n0, Task task0, Task task1, Date date0, Map map0) {
        this.a = n0;
        this.b = task0;
        this.c = task1;
        this.d = date0;
        this.e = map0;
    }

    @Override  // com.google.android.gms.tasks.Continuation
    public final Object then(Task task0) {
        return this.a.x(this.b, this.c, this.d, this.e, task0);
    }
}

