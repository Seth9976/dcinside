package com.dcinside.app.util;

import A3.o;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

public final class il implements OnCompleteListener {
    public final o a;

    public il(o o0) {
        this.a = o0;
    }

    @Override  // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task0) {
        jl.c(this.a, task0);
    }
}

