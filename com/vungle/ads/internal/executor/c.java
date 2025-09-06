package com.vungle.ads.internal.executor;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.L;
import y4.l;

public final class c implements ThreadFactory {
    @l
    private final AtomicInteger atomicInteger;
    @l
    private final String name;
    private final ThreadFactory threadFactory;

    public c(@l String s) {
        L.p(s, "name");
        super();
        this.name = s;
        this.threadFactory = Executors.defaultThreadFactory();
        this.atomicInteger = new AtomicInteger(0);
    }

    @l
    public final String getName() {
        return this.name;
    }

    @Override
    @l
    public Thread newThread(@l Runnable runnable0) {
        L.p(runnable0, "r");
        Thread thread0 = this.threadFactory.newThread(runnable0);
        thread0.setName(this.name + "-th-" + this.atomicInteger.incrementAndGet());
        L.o(thread0, "t");
        return thread0;
    }
}

