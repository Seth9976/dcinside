package kotlin.concurrent;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock;
import java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.internal.f;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import z3.i;

@s0({"SMAP\nLocks.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Locks.kt\nkotlin/concurrent/LocksKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,74:1\n1#2:75\n*E\n"})
@i(name = "LocksKt")
public final class a {
    @f
    private static final Object a(ReentrantReadWriteLock reentrantReadWriteLock0, A3.a a0) {
        L.p(reentrantReadWriteLock0, "<this>");
        L.p(a0, "action");
        ReentrantReadWriteLock.ReadLock reentrantReadWriteLock$ReadLock0 = reentrantReadWriteLock0.readLock();
        reentrantReadWriteLock$ReadLock0.lock();
        try {
            return a0.invoke();
        }
        finally {
            reentrantReadWriteLock$ReadLock0.unlock();
        }
    }

    @f
    private static final Object b(Lock lock0, A3.a a0) {
        L.p(lock0, "<this>");
        L.p(a0, "action");
        lock0.lock();
        try {
            return a0.invoke();
        }
        finally {
            lock0.unlock();
        }
    }

    @f
    private static final Object c(ReentrantReadWriteLock reentrantReadWriteLock0, A3.a a0) {
        L.p(reentrantReadWriteLock0, "<this>");
        L.p(a0, "action");
        ReentrantReadWriteLock.ReadLock reentrantReadWriteLock$ReadLock0 = reentrantReadWriteLock0.readLock();
        int v1 = reentrantReadWriteLock0.getWriteHoldCount() == 0 ? reentrantReadWriteLock0.getReadHoldCount() : 0;
        for(int v2 = 0; v2 < v1; ++v2) {
            reentrantReadWriteLock$ReadLock0.unlock();
        }
        ReentrantReadWriteLock.WriteLock reentrantReadWriteLock$WriteLock0 = reentrantReadWriteLock0.writeLock();
        reentrantReadWriteLock$WriteLock0.lock();
        try {
            return a0.invoke();
        }
        finally {
            for(int v = 0; v < v1; ++v) {
                reentrantReadWriteLock$ReadLock0.lock();
            }
            reentrantReadWriteLock$WriteLock0.unlock();
        }
    }
}

