package com.google.firebase.crashlytics.internal.common;

import com.google.firebase.crashlytics.internal.settings.k;

public final class q implements Runnable {
    public final C a;
    public final k b;

    public q(C c0, k k0) {
        this.a = c0;
        this.b = k0;
    }

    @Override
    public final void run() {
        this.a.y(this.b);
    }
}

