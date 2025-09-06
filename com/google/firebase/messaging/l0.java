package com.google.firebase.messaging;

import android.content.Context;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;

public final class l0 implements Callable {
    public final Context a;
    public final ScheduledExecutorService b;
    public final FirebaseMessaging c;
    public final Q d;
    public final K e;

    public l0(Context context0, ScheduledExecutorService scheduledExecutorService0, FirebaseMessaging firebaseMessaging0, Q q0, K k0) {
        this.a = context0;
        this.b = scheduledExecutorService0;
        this.c = firebaseMessaging0;
        this.d = q0;
        this.e = k0;
    }

    @Override
    public final Object call() {
        return m0.k(this.a, this.b, this.c, this.d, this.e);
    }
}

