package com.google.firebase.installations;

import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.installations.local.d;

class o implements t {
    final TaskCompletionSource a;

    public o(TaskCompletionSource taskCompletionSource0) {
        this.a = taskCompletionSource0;
    }

    @Override  // com.google.firebase.installations.t
    public boolean a(Exception exception0) {
        return false;
    }

    @Override  // com.google.firebase.installations.t
    public boolean b(d d0) {
        if(!d0.l() && !d0.k() && !d0.i()) {
            return false;
        }
        String s = d0.d();
        this.a.trySetResult(s);
        return true;
    }
}

