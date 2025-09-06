package io.reactivex.internal.operators.observable;

import io.reactivex.G;
import io.reactivex.I;
import io.reactivex.disposables.c;
import io.reactivex.internal.disposables.d;
import io.reactivex.internal.util.e;
import io.reactivex.internal.util.k;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public final class b implements Iterable {
    static final class a extends AtomicReference implements I, c, Iterator {
        final io.reactivex.internal.queue.c a;
        final Lock b;
        final Condition c;
        volatile boolean d;
        volatile Throwable e;
        private static final long f = 0x5CEA3901B29DCB72L;

        a(int v) {
            this.a = new io.reactivex.internal.queue.c(v);
            ReentrantLock reentrantLock0 = new ReentrantLock();
            this.b = reentrantLock0;
            this.c = reentrantLock0.newCondition();
        }

        @Override  // io.reactivex.disposables.c
        public boolean a() {
            return d.c(((c)this.get()));
        }

        @Override  // io.reactivex.I
        public void b(c c0) {
            d.g(this, c0);
        }

        void c() {
            this.b.lock();
            try {
                this.c.signalAll();
            }
            finally {
                this.b.unlock();
            }
        }

        @Override  // io.reactivex.disposables.c
        public void dispose() {
            d.b(this);
            this.c();
        }

        @Override
        public boolean hasNext() {
            while(true) {
                if(this.a()) {
                    Throwable throwable0 = this.e;
                    if(throwable0 != null) {
                        throw k.f(throwable0);
                    }
                    return false;
                }
                boolean z = this.d;
                boolean z1 = this.a.isEmpty();
                if(z) {
                    Throwable throwable1 = this.e;
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
                try {
                    e.b();
                    this.b.lock();
                    try {
                        while(!this.d && this.a.isEmpty() && !this.a()) {
                            this.c.await();
                        }
                    }
                    finally {
                        this.b.unlock();
                    }
                    continue;
                }
                catch(InterruptedException interruptedException0) {
                }
                d.b(this);
                this.c();
                throw k.f(interruptedException0);
            }
            return true;
        }

        @Override
        public Object next() {
            if(!this.hasNext()) {
                throw new NoSuchElementException();
            }
            return this.a.poll();
        }

        @Override  // io.reactivex.I
        public void onComplete() {
            this.d = true;
            this.c();
        }

        @Override  // io.reactivex.I
        public void onError(Throwable throwable0) {
            this.e = throwable0;
            this.d = true;
            this.c();
        }

        @Override  // io.reactivex.I
        public void onNext(Object object0) {
            this.a.offer(object0);
            this.c();
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException("remove");
        }
    }

    final G a;
    final int b;

    public b(G g0, int v) {
        this.a = g0;
        this.b = v;
    }

    @Override
    public Iterator iterator() {
        Iterator iterator0 = new a(this.b);
        this.a.d(((I)iterator0));
        return iterator0;
    }
}

