package com.google.common.util.concurrent;

import J1.c;
import J1.d;
import com.google.common.collect.a2;
import java.util.Collection;
import java.util.Deque;
import java.util.Queue;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.TimeUnit;
import o3.a;

@c
@d
@N
public abstract class V extends a2 implements BlockingDeque {
    @Override  // com.google.common.collect.a2
    protected Object K() {
        return this.z0();
    }

    @Override  // com.google.common.collect.a2
    protected Collection M() {
        return this.z0();
    }

    @Override
    public int drainTo(Collection collection0) {
        return this.z0().drainTo(collection0);
    }

    @Override
    public int drainTo(Collection collection0, int v) {
        return this.z0().drainTo(collection0, v);
    }

    @Override
    public boolean offer(Object object0, long v, TimeUnit timeUnit0) throws InterruptedException {
        return this.z0().offer(object0, v, timeUnit0);
    }

    @Override
    public boolean offerFirst(Object object0, long v, TimeUnit timeUnit0) throws InterruptedException {
        return this.z0().offerFirst(object0, v, timeUnit0);
    }

    @Override
    public boolean offerLast(Object object0, long v, TimeUnit timeUnit0) throws InterruptedException {
        return this.z0().offerLast(object0, v, timeUnit0);
    }

    @Override
    @a
    public Object poll(long v, TimeUnit timeUnit0) throws InterruptedException {
        return this.z0().poll(v, timeUnit0);
    }

    @Override
    @a
    public Object pollFirst(long v, TimeUnit timeUnit0) throws InterruptedException {
        return this.z0().pollFirst(v, timeUnit0);
    }

    @Override
    @a
    public Object pollLast(long v, TimeUnit timeUnit0) throws InterruptedException {
        return this.z0().pollLast(v, timeUnit0);
    }

    @Override
    public void put(Object object0) throws InterruptedException {
        this.z0().put(object0);
    }

    @Override
    public void putFirst(Object object0) throws InterruptedException {
        this.z0().putFirst(object0);
    }

    @Override
    public void putLast(Object object0) throws InterruptedException {
        this.z0().putLast(object0);
    }

    @Override
    public int remainingCapacity() {
        return this.z0().remainingCapacity();
    }

    @Override  // com.google.common.collect.a2
    protected Queue s0() {
        return this.z0();
    }

    @Override
    public Object take() throws InterruptedException {
        return this.z0().take();
    }

    @Override
    public Object takeFirst() throws InterruptedException {
        return this.z0().takeFirst();
    }

    @Override
    public Object takeLast() throws InterruptedException {
        return this.z0().takeLast();
    }

    @Override  // com.google.common.collect.a2
    protected Deque y0() {
        return this.z0();
    }

    protected abstract BlockingDeque z0();
}

