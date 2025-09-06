package com.google.firebase.crashlytics.internal.metadata;

import java.util.List;

public final class k implements Runnable {
    public final o a;
    public final List b;

    public k(o o0, List list0) {
        this.a = o0;
        this.b = list0;
    }

    @Override
    public final void run() {
        this.a.l(this.b);
    }
}

