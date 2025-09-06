package com.google.firebase.remoteconfig.internal;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import java.util.Map;

public final class l implements Continuation {
    public final n a;
    public final Map b;

    public l(n n0, Map map0) {
        this.a = n0;
        this.b = map0;
    }

    @Override  // com.google.android.gms.tasks.Continuation
    public final Object then(Task task0) {
        return this.a.z(this.b, task0);
    }
}

