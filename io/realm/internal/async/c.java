package io.realm.internal.async;

import io.realm.N0;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;

public final class c implements N0 {
    private final Future a;
    private final ThreadPoolExecutor b;
    private volatile boolean c;

    public c(Future future0, ThreadPoolExecutor threadPoolExecutor0) {
        this.c = false;
        this.a = future0;
        this.b = threadPoolExecutor0;
    }

    @Override  // io.realm.N0
    public void cancel() {
        this.a.cancel(true);
        this.c = true;
        this.b.getQueue().remove(this.a);
    }

    @Override  // io.realm.N0
    public boolean isCancelled() {
        return this.c;
    }
}

