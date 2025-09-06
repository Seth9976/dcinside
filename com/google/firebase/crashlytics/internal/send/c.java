package com.google.firebase.crashlytics.internal.send;

import java.util.concurrent.CountDownLatch;

public final class c implements Runnable {
    public final e a;
    public final CountDownLatch b;

    public c(e e0, CountDownLatch countDownLatch0) {
        this.a = e0;
        this.b = countDownLatch0;
    }

    @Override
    public final void run() {
        this.a.m(this.b);
    }
}

