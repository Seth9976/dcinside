package com.google.common.collect;

import J1.b;
import J1.c;
import J1.d;
import O1.a;
import com.google.common.base.H;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Deque;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.TimeUnit;

@b(emulated = true)
@C1
public final class g4 {
    @c
    @d
    @a
    public static int a(BlockingQueue blockingQueue0, Collection collection0, int v, long v1, TimeUnit timeUnit0) throws InterruptedException {
        H.E(collection0);
        long v2 = System.nanoTime();
        long v3 = timeUnit0.toNanos(v1);
        int v4 = 0;
        while(v4 < v) {
            v4 += blockingQueue0.drainTo(collection0, v - v4);
            if(v4 < v) {
                Object object0 = blockingQueue0.poll(v2 + v3 - System.nanoTime(), TimeUnit.NANOSECONDS);
                if(object0 == null) {
                    break;
                }
                collection0.add(object0);
                ++v4;
            }
        }
        return v4;
    }

    @c
    @d
    @a
    public static int b(BlockingQueue blockingQueue0, Collection collection0, int v, long v1, TimeUnit timeUnit0) {
        Object object0;
        H.E(collection0);
        long v2 = System.nanoTime();
        long v3 = timeUnit0.toNanos(v1);
        int v4 = 0;
        boolean z = false;
        try {
            while(v4 < v) {
                v4 += blockingQueue0.drainTo(collection0, v - v4);
                if(v4 < v) {
                    while(true) {
                        try {
                            object0 = blockingQueue0.poll(v2 + v3 - System.nanoTime(), TimeUnit.NANOSECONDS);
                            break;
                        }
                        catch(InterruptedException unused_ex) {
                            z = true;
                        }
                    }
                    if(object0 == null) {
                        break;
                    }
                    collection0.add(object0);
                    ++v4;
                }
            }
            return v4;
        }
        finally {
            if(z) {
                Thread.currentThread().interrupt();
            }
        }
    }

    @c
    @d
    public static ArrayBlockingQueue c(int v) {
        return new ArrayBlockingQueue(v);
    }

    public static ArrayDeque d() {
        return new ArrayDeque();
    }

    public static ArrayDeque e(Iterable iterable0) {
        if(iterable0 instanceof Collection) {
            return new ArrayDeque(((Collection)iterable0));
        }
        ArrayDeque arrayDeque0 = new ArrayDeque();
        p3.a(arrayDeque0, iterable0);
        return arrayDeque0;
    }

    @c
    @d
    public static ConcurrentLinkedQueue f() {
        return new ConcurrentLinkedQueue();
    }

    @c
    @d
    public static ConcurrentLinkedQueue g(Iterable iterable0) {
        if(iterable0 instanceof Collection) {
            return new ConcurrentLinkedQueue(((Collection)iterable0));
        }
        ConcurrentLinkedQueue concurrentLinkedQueue0 = new ConcurrentLinkedQueue();
        p3.a(concurrentLinkedQueue0, iterable0);
        return concurrentLinkedQueue0;
    }

    @c
    @d
    public static LinkedBlockingDeque h() {
        return new LinkedBlockingDeque();
    }

    @c
    @d
    public static LinkedBlockingDeque i(int v) {
        return new LinkedBlockingDeque(v);
    }

    @c
    @d
    public static LinkedBlockingDeque j(Iterable iterable0) {
        if(iterable0 instanceof Collection) {
            return new LinkedBlockingDeque(((Collection)iterable0));
        }
        LinkedBlockingDeque linkedBlockingDeque0 = new LinkedBlockingDeque();
        p3.a(linkedBlockingDeque0, iterable0);
        return linkedBlockingDeque0;
    }

    @c
    @d
    public static LinkedBlockingQueue k() {
        return new LinkedBlockingQueue();
    }

    @c
    @d
    public static LinkedBlockingQueue l(int v) {
        return new LinkedBlockingQueue(v);
    }

    @c
    @d
    public static LinkedBlockingQueue m(Iterable iterable0) {
        if(iterable0 instanceof Collection) {
            return new LinkedBlockingQueue(((Collection)iterable0));
        }
        LinkedBlockingQueue linkedBlockingQueue0 = new LinkedBlockingQueue();
        p3.a(linkedBlockingQueue0, iterable0);
        return linkedBlockingQueue0;
    }

    @c
    @d
    public static PriorityBlockingQueue n() {
        return new PriorityBlockingQueue();
    }

    @c
    @d
    public static PriorityBlockingQueue o(Iterable iterable0) {
        if(iterable0 instanceof Collection) {
            return new PriorityBlockingQueue(((Collection)iterable0));
        }
        PriorityBlockingQueue priorityBlockingQueue0 = new PriorityBlockingQueue();
        p3.a(priorityBlockingQueue0, iterable0);
        return priorityBlockingQueue0;
    }

    public static PriorityQueue p() {
        return new PriorityQueue();
    }

    public static PriorityQueue q(Iterable iterable0) {
        if(iterable0 instanceof Collection) {
            return new PriorityQueue(((Collection)iterable0));
        }
        PriorityQueue priorityQueue0 = new PriorityQueue();
        p3.a(priorityQueue0, iterable0);
        return priorityQueue0;
    }

    @c
    @d
    public static SynchronousQueue r() {
        return new SynchronousQueue();
    }

    public static Deque s(Deque deque0) {
        return V4.i(deque0, null);
    }

    public static Queue t(Queue queue0) {
        return V4.t(queue0, null);
    }
}

