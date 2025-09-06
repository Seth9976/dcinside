package com.google.firebase.installations;

import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.installations.local.d;

class n implements t {
    private final u a;
    private final TaskCompletionSource b;

    public n(u u0, TaskCompletionSource taskCompletionSource0) {
        this.a = u0;
        this.b = taskCompletionSource0;
    }

    @Override  // com.google.firebase.installations.t
    public boolean a(Exception exception0) {
        this.b.trySetException(exception0);
        return true;
    }

    @Override  // com.google.firebase.installations.t
    public boolean b(d d0) {
        if(d0.k() && !this.a.f(d0)) {
            p p0 = p.a().b(d0.b()).d(d0.c()).c(d0.h()).a();
            this.b.setResult(p0);
            return true;
        }
        return false;
    }
}

