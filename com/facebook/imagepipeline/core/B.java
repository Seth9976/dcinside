package com.facebook.imagepipeline.core;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

public final class b implements p {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }
    }

    @l
    private final Executor a;
    @l
    private final Executor b;
    @l
    private final Executor c;
    @l
    private final Executor d;
    @l
    private final ScheduledExecutorService e;
    @l
    public static final a f = null;
    private static final int g = 2;
    private static final int h = 1;

    static {
        b.f = new a(null);
    }

    public b(int v) {
        ExecutorService executorService0 = Executors.newFixedThreadPool(2, new r0(10, "FrescoIoBoundExecutor", true));
        L.o(executorService0, "newFixedThreadPool(...)");
        this.a = executorService0;
        ExecutorService executorService1 = Executors.newFixedThreadPool(v, new r0(10, "FrescoDecodeExecutor", true));
        L.o(executorService1, "newFixedThreadPool(...)");
        this.b = executorService1;
        ExecutorService executorService2 = Executors.newFixedThreadPool(v, new r0(10, "FrescoBackgroundExecutor", true));
        L.o(executorService2, "newFixedThreadPool(...)");
        this.c = executorService2;
        ExecutorService executorService3 = Executors.newFixedThreadPool(1, new r0(10, "FrescoLightWeightBackgroundExecutor", true));
        L.o(executorService3, "newFixedThreadPool(...)");
        this.d = executorService3;
        ScheduledExecutorService scheduledExecutorService0 = Executors.newScheduledThreadPool(v, new r0(10, "FrescoBackgroundExecutor", true));
        L.o(scheduledExecutorService0, "newScheduledThreadPool(...)");
        this.e = scheduledExecutorService0;
    }

    @Override  // com.facebook.imagepipeline.core.p
    @l
    public Executor a() {
        return this.d;
    }

    @Override  // com.facebook.imagepipeline.core.p
    @l
    public Executor b() {
        return this.c;
    }

    @Override  // com.facebook.imagepipeline.core.p
    @l
    public Executor c() {
        return this.a;
    }

    @Override  // com.facebook.imagepipeline.core.p
    @l
    public Executor d() {
        return this.a;
    }

    @Override  // com.facebook.imagepipeline.core.p
    @l
    public Executor e() {
        return this.a;
    }

    @Override  // com.facebook.imagepipeline.core.p
    @m
    public ScheduledExecutorService f() {
        return this.e;
    }

    @Override  // com.facebook.imagepipeline.core.p
    @l
    public Executor g() {
        return this.b;
    }
}

