package io.reactivex.internal.operators.flowable;

import io.reactivex.disposables.c;
import io.reactivex.internal.subscriptions.j;
import io.reactivex.internal.util.k;
import io.reactivex.l;
import io.reactivex.q;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.reactivestreams.e;

public final class b implements Iterable {
    static final class a extends AtomicReference implements c, q, Runnable, Iterator {
        final io.reactivex.internal.queue.b a;
        final long b;
        final long c;
        final Lock d;
        final Condition e;
        long f;
        volatile boolean g;
        volatile Throwable h;
        private static final long i = 0x5CEA3901B29DCB72L;

        a(int v) {
            this.a = new io.reactivex.internal.queue.b(v);
            this.b = (long)v;
            this.c = (long)(v - (v >> 2));
            ReentrantLock reentrantLock0 = new ReentrantLock();
            this.d = reentrantLock0;
            this.e = reentrantLock0.newCondition();
        }

        @Override  // io.reactivex.disposables.c
        public boolean a() {
            return this.get() == j.a;
        }

        void b() {
            this.d.lock();
            try {
                this.e.signalAll();
            }
            finally {
                this.d.unlock();
            }
        }

        @Override  // io.reactivex.disposables.c
        public void dispose() {
            j.a(this);
            this.b();
        }

        @Override  // io.reactivex.q
        public void g(e e0) {
            j.i(this, e0, this.b);
        }

        @Override
        public boolean hasNext() {
            while(true) {
                if(this.a()) {
                    Throwable throwable0 = this.h;
                    if(throwable0 != null) {
                        throw k.f(throwable0);
                    }
                    return false;
                }
                boolean z = this.g;
                boolean z1 = this.a.isEmpty();
                if(z) {
                    Throwable throwable1 = this.h;
                    if(throwable1 != null) {
                        throw k.f(throwable1);
                    }
                    if(z1) {
                        return false;
                    }
                }
                if(!z1) {
                    break;
                }
                io.reactivex.internal.util.e.b();
                this.d.lock();
                try {
                    while(!this.g && this.a.isEmpty() && !this.a()) {
                        this.e.await();
                    }
                }
                catch(InterruptedException interruptedException0) {
                    this.run();
                    throw k.f(interruptedException0);
                }
                finally {
                    this.d.unlock();
                }
            }
            return true;
        }

        @Override
        public Object next() {
            if(!this.hasNext()) {
                throw new NoSuchElementException();
            }
            Object object0 = this.a.poll();
            long v = this.f + 1L;
            if(v == this.c) {
                this.f = 0L;
                ((e)this.get()).request(v);
                return object0;
            }
            this.f = v;
            return object0;
        }

        @Override  // org.reactivestreams.d
        public void onComplete() {
            this.g = true;
            this.b();
        }

        @Override  // org.reactivestreams.d
        public void onError(Throwable throwable0) {
            this.h = throwable0;
            this.g = true;
            this.b();
        }

        @Override  // org.reactivestreams.d
        public void onNext(Object object0) {
            if(!this.a.offer(object0)) {
                j.a(this);
                this.onError(new io.reactivex.exceptions.c("Queue full?!"));
                return;
            }
            this.b();
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException("remove");
        }

        @Override
        public void run() {
            j.a(this);
            this.b();
        }
    }

    final l a;
    final int b;

    public b(l l0, int v) {
        this.a = l0;
        this.b = v;
    }

    @Override
    public Iterator iterator() {
        Iterator iterator0 = new a(this.b);
        this.a.l6(((q)iterator0));
        return iterator0;
    }
}

