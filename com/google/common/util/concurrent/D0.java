package com.google.common.util.concurrent;

import J1.d;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

@d
@N
abstract class d0 implements Lock {
    abstract Lock a();

    @Override
    public void lock() {
        this.a().lock();
    }

    @Override
    public void lockInterruptibly() throws InterruptedException {
        this.a().lockInterruptibly();
    }

    @Override
    public Condition newCondition() {
        return this.a().newCondition();
    }

    @Override
    public boolean tryLock() {
        return this.a().tryLock();
    }

    @Override
    public boolean tryLock(long v, TimeUnit timeUnit0) throws InterruptedException {
        return this.a().tryLock(v, timeUnit0);
    }

    @Override
    public void unlock() {
        this.a().unlock();
    }
}

