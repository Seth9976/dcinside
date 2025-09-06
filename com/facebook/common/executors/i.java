package com.facebook.common.executors;

import java.util.concurrent.atomic.AtomicInteger;
import k1.n.a;
import k1.n;
import o3.h;

@n(a.a)
public abstract class i implements Runnable {
    protected final AtomicInteger a;
    protected static final int b = 0;
    protected static final int c = 1;
    protected static final int d = 2;
    protected static final int e = 3;
    protected static final int f = 4;

    public i() {
        this.a = new AtomicInteger(0);
    }

    public void a() {
        if(this.a.compareAndSet(0, 2)) {
            this.d();
        }
    }

    protected void b(@h Object object0) {
    }

    @h
    protected abstract Object c() throws Exception;

    protected void d() {
    }

    protected void e(Exception exception0) {
    }

    protected void f(@h Object object0) {
    }

    @Override
    public final void run() {
        Object object0;
        if(!this.a.compareAndSet(0, 1)) {
            return;
        }
        try {
            object0 = this.c();
        }
        catch(Exception exception0) {
            this.a.set(4);
            this.e(exception0);
            return;
        }
        this.a.set(3);
        try {
            this.f(object0);
        }
        finally {
            this.b(object0);
        }
    }
}

