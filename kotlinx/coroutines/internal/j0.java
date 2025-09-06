package kotlinx.coroutines.internal;

import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock;
import java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.s0;

@s0({"SMAP\nExceptionsConstructor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExceptionsConstructor.kt\nkotlinx/coroutines/internal/WeakMapCtorCache\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,112:1\n1#2:113\n*E\n"})
final class j0 extends l {
    @y4.l
    public static final j0 a;
    @y4.l
    private static final ReentrantReadWriteLock b;
    @y4.l
    private static final WeakHashMap c;

    static {
        j0.a = new j0();
        j0.b = new ReentrantReadWriteLock();
        j0.c = new WeakHashMap();
    }

    @Override  // kotlinx.coroutines.internal.l
    @y4.l
    public Function1 a(@y4.l Class class0) {
        Function1 function10;
        Function1 function12;
        Function1 function11;
        ReentrantReadWriteLock reentrantReadWriteLock0 = j0.b;
        ReentrantReadWriteLock.ReadLock reentrantReadWriteLock$ReadLock0 = reentrantReadWriteLock0.readLock();
        reentrantReadWriteLock$ReadLock0.lock();
        try {
            function10 = (Function1)j0.c.get(class0);
        }
        finally {
            reentrantReadWriteLock$ReadLock0.unlock();
        }
        if(function10 != null) {
            return function10;
        }
        ReentrantReadWriteLock.ReadLock reentrantReadWriteLock$ReadLock1 = reentrantReadWriteLock0.readLock();
        int v2 = reentrantReadWriteLock0.getWriteHoldCount() == 0 ? reentrantReadWriteLock0.getReadHoldCount() : 0;
        for(int v3 = 0; v3 < v2; ++v3) {
            reentrantReadWriteLock$ReadLock1.unlock();
        }
        ReentrantReadWriteLock.WriteLock reentrantReadWriteLock$WriteLock0 = reentrantReadWriteLock0.writeLock();
        reentrantReadWriteLock$WriteLock0.lock();
        try {
            WeakHashMap weakHashMap0 = j0.c;
            function11 = (Function1)weakHashMap0.get(class0);
            if(function11 == null) {
                function12 = q.b(class0);
                weakHashMap0.put(class0, function12);
                goto label_33;
            }
            goto label_39;
        }
        catch(Throwable throwable0) {
            for(int v1 = 0; v1 < v2; ++v1) {
                reentrantReadWriteLock$ReadLock1.lock();
            }
            reentrantReadWriteLock$WriteLock0.unlock();
            throw throwable0;
        }
    label_33:
        while(v1 < v2) {
            reentrantReadWriteLock$ReadLock1.lock();
            ++v1;
        }
        reentrantReadWriteLock$WriteLock0.unlock();
        return function12;
    label_39:
        while(v1 < v2) {
            reentrantReadWriteLock$ReadLock1.lock();
            ++v1;
        }
        reentrantReadWriteLock$WriteLock0.unlock();
        return function11;
    }
}

