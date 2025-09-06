package com.facebook.imagepipeline.producers;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.L;
import y4.l;

public final class v0 implements u0 {
    @l
    private final Executor a;
    private boolean b;
    @l
    private final Deque c;

    public v0(@l Executor executor0) {
        L.p(executor0, "executor");
        super();
        this.a = executor0;
        this.c = new ArrayDeque();
    }

    @Override  // com.facebook.imagepipeline.producers.u0
    public void a(@l Runnable runnable0) {
        synchronized(this) {
            L.p(runnable0, "runnable");
            this.c.remove(runnable0);
        }
    }

    @Override  // com.facebook.imagepipeline.producers.u0
    public void b() {
        synchronized(this) {
            this.b = true;
        }
    }

    @Override  // com.facebook.imagepipeline.producers.u0
    public void c(@l Runnable runnable0) {
        synchronized(this) {
            L.p(runnable0, "runnable");
            if(this.b) {
                this.c.add(runnable0);
            }
            else {
                this.a.execute(runnable0);
            }
        }
    }

    @Override  // com.facebook.imagepipeline.producers.u0
    public void d() {
        synchronized(this) {
            this.b = false;
            this.f();
        }
    }

    @Override  // com.facebook.imagepipeline.producers.u0
    public boolean e() {
        synchronized(this) {
        }
        return this.b;
    }

    private final void f() {
        while(!this.c.isEmpty()) {
            Runnable runnable0 = (Runnable)this.c.pop();
            this.a.execute(runnable0);
        }
        this.c.clear();
    }
}

