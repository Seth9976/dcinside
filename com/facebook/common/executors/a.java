package com.facebook.common.executors;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.TimeUnit;
import k1.n.a;
import k1.n;

@n(a.a)
public class com.facebook.common.executors.a extends AbstractExecutorService {
    private static final com.facebook.common.executors.a a;

    static {
        com.facebook.common.executors.a.a = new com.facebook.common.executors.a();
    }

    public static com.facebook.common.executors.a a() {
        return com.facebook.common.executors.a.a;
    }

    @Override
    public boolean awaitTermination(long v, TimeUnit timeUnit0) throws InterruptedException {
        return true;
    }

    @Override
    public void execute(Runnable runnable0) {
        runnable0.run();
    }

    @Override
    public boolean isShutdown() {
        return false;
    }

    @Override
    public boolean isTerminated() {
        return false;
    }

    @Override
    public void shutdown() {
    }

    @Override
    public List shutdownNow() {
        return Collections.emptyList();
    }
}

