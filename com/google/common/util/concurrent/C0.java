package com.google.common.util.concurrent;

import J1.c;
import J1.d;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

@c
@d
@N
public abstract class c0 extends Y implements y0 {
    @Override  // com.google.common.util.concurrent.Y
    protected Object K() {
        return this.N();
    }

    @Override  // com.google.common.util.concurrent.Y
    protected ExecutorService M() {
        return this.N();
    }

    protected abstract y0 N();

    @Override  // com.google.common.util.concurrent.y0
    public t0 submit(Runnable runnable0) {
        return this.N().submit(runnable0);
    }

    @Override  // com.google.common.util.concurrent.y0
    public t0 submit(Runnable runnable0, @F0 Object object0) {
        return this.N().submit(runnable0, object0);
    }

    @Override  // com.google.common.util.concurrent.y0
    public t0 submit(Callable callable0) {
        return this.N().submit(callable0);
    }

    @Override  // com.google.common.util.concurrent.Y, com.google.common.util.concurrent.y0
    public Future submit(Runnable runnable0) {
        return this.submit(runnable0);
    }

    @Override  // com.google.common.util.concurrent.Y, com.google.common.util.concurrent.y0
    public Future submit(Runnable runnable0, @F0 Object object0) {
        return this.submit(runnable0, object0);
    }

    @Override  // com.google.common.util.concurrent.Y, com.google.common.util.concurrent.y0
    public Future submit(Callable callable0) {
        return this.submit(callable0);
    }
}

