package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;

public final class m implements Continuation {
    public final Context a;
    public final Intent b;
    public final boolean c;

    public m(Context context0, Intent intent0, boolean z) {
        this.a = context0;
        this.b = intent0;
        this.c = z;
    }

    @Override  // com.google.android.gms.tasks.Continuation
    public final Object then(Task task0) {
        return o.j(this.a, this.b, this.c, task0);
    }
}

