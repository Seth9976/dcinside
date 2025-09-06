package com.facebook.imagepipeline.producers;

import java.util.concurrent.Executor;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public final class C implements u0 {
    @l
    private final Executor a;

    public C(@m Executor executor0) {
        if(executor0 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        this.a = executor0;
    }

    @Override  // com.facebook.imagepipeline.producers.u0
    public void a(@l Runnable runnable0) {
        L.p(runnable0, "runnable");
    }

    @Override  // com.facebook.imagepipeline.producers.u0
    public void b() {
        throw new UnsupportedOperationException();
    }

    @Override  // com.facebook.imagepipeline.producers.u0
    public void c(@l Runnable runnable0) {
        L.p(runnable0, "runnable");
        this.a.execute(runnable0);
    }

    @Override  // com.facebook.imagepipeline.producers.u0
    public void d() {
        throw new UnsupportedOperationException();
    }

    @Override  // com.facebook.imagepipeline.producers.u0
    public boolean e() {
        return false;
    }
}

