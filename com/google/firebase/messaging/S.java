package com.google.firebase.messaging;

import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;

public final class s implements SuccessContinuation {
    public final String a;

    public s(String s) {
        this.a = s;
    }

    @Override  // com.google.android.gms.tasks.SuccessContinuation
    public final Task then(Object object0) {
        return FirebaseMessaging.Y(this.a, ((m0)object0));
    }
}

