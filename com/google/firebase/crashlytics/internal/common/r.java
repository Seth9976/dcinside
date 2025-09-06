package com.google.firebase.crashlytics.internal.common;

import java.util.Map;

public final class r implements Runnable {
    public final C a;
    public final Map b;

    public r(C c0, Map map0) {
        this.a = c0;
        this.b = map0;
    }

    @Override
    public final void run() {
        this.a.F(this.b);
    }
}

