package com.google.firebase.crashlytics.internal.common;

import com.google.firebase.crashlytics.internal.settings.k;

public final class s implements Runnable {
    public final C a;
    public final k b;

    public s(C c0, k k0) {
        this.a = c0;
        this.b = k0;
    }

    @Override
    public final void run() {
        this.a.z(this.b);
    }
}

