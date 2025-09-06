package com.google.common.util.concurrent;

import J1.c;
import J1.d;
import O1.a;
import com.google.common.collect.q2;
import java.util.Collection;
import java.util.Queue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

@c
@d
@N
public abstract class W extends q2 implements BlockingQueue {
    @Override  // com.google.common.collect.q2
    protected Object K() {
        return this.y0();
    }

    @Override  // com.google.common.collect.q2
    protected Collection M() {
        return this.y0();
    }

    @Override
    @a
    public int drainTo(Collection collection0) {
        return this.y0().drainTo(collection0);
    }

    @Override
    @a
    public int drainTo(Collection collection0, int v) {
        return this.y0().drainTo(collection0, v);
    }

    @Override
    @a
    public boolean offer(Object object0, long v, TimeUnit timeUnit0) throws InterruptedException {
        return this.y0().offer(object0, v, timeUnit0);
    }

    @Override
    @a
    @o3.a
    public Object poll(long v, TimeUnit timeUnit0) throws InterruptedException {
        return this.y0().poll(v, timeUnit0);
    }

    @Override
    public void put(Object object0) throws InterruptedException {
        this.y0().put(object0);
    }

    @Override
    public int remainingCapacity() {
        return this.y0().remainingCapacity();
    }

    @Override  // com.google.common.collect.q2
    protected Queue s0() {
        return this.y0();
    }

    @Override
    @a
    public Object take() throws InterruptedException {
        return this.y0().take();
    }

    protected abstract BlockingQueue y0();
}

