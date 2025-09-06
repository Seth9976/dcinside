package com.google.firebase.messaging;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

public final class q0 implements OnCompleteListener {
    public final a a;

    public q0(a u0$a0) {
        this.a = u0$a0;
    }

    @Override  // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task0) {
        r0.b(this.a, task0);
    }
}

