package io.reactivex.internal.util;

import e3.a;
import e3.g;
import java.util.concurrent.CountDownLatch;

public final class f extends CountDownLatch implements a, g {
    public Throwable a;

    public f() {
        super(1);
    }

    public void a(Throwable throwable0) {
        this.a = throwable0;
        this.countDown();
    }

    @Override  // e3.g
    public void accept(Object object0) throws Exception {
        this.a(((Throwable)object0));
    }

    @Override  // e3.a
    public void run() {
        this.countDown();
    }
}

