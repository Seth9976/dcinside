package com.google.firebase.messaging;

import com.google.android.gms.tasks.TaskCompletionSource;

public final class t implements Runnable {
    public final FirebaseMessaging a;
    public final TaskCompletionSource b;

    public t(FirebaseMessaging firebaseMessaging0, TaskCompletionSource taskCompletionSource0) {
        this.a = firebaseMessaging0;
        this.b = taskCompletionSource0;
    }

    @Override
    public final void run() {
        this.a.P(this.b);
    }
}

