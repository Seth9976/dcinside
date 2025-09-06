package io.reactivex.internal.operators.flowable;

import io.reactivex.A;
import io.reactivex.internal.util.e;
import io.reactivex.internal.util.k;
import io.reactivex.l;
import io.reactivex.q;
import io.reactivex.subscribers.b;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicReference;

public final class c implements Iterable {
    static final class a extends b implements Iterator {
        final Semaphore b;
        final AtomicReference c;
        A d;

        a() {
            this.b = new Semaphore(0);
            this.c = new AtomicReference();
        }

        public void e(A a0) {
            if(this.c.getAndSet(a0) == null) {
                this.b.release();
            }
        }

        @Override
        public boolean hasNext() {
            if(this.d != null && this.d.g()) {
                throw k.f(this.d.d());
            }
            if((this.d == null || this.d.h()) && this.d == null) {
                try {
                    e.b();
                    this.b.acquire();
                }
                catch(InterruptedException interruptedException0) {
                    this.dispose();
                    this.d = A.b(interruptedException0);
                    throw k.f(interruptedException0);
                }
                A a0 = (A)this.c.getAndSet(null);
                this.d = a0;
                if(a0.g()) {
                    throw k.f(a0.d());
                }
            }
            return this.d.h();
        }

        @Override
        public Object next() {
            if(!this.hasNext() || !this.d.h()) {
                throw new NoSuchElementException();
            }
            Object object0 = this.d.e();
            this.d = null;
            return object0;
        }

        @Override  // org.reactivestreams.d
        public void onComplete() {
        }

        @Override  // org.reactivestreams.d
        public void onError(Throwable throwable0) {
            io.reactivex.plugins.a.Y(throwable0);
        }

        @Override  // org.reactivestreams.d
        public void onNext(Object object0) {
            this.e(((A)object0));
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException("Read-only iterator.");
        }
    }

    final org.reactivestreams.c a;

    public c(org.reactivestreams.c c0) {
        this.a = c0;
    }

    @Override
    public Iterator iterator() {
        Iterator iterator0 = new a();
        l.a3(this.a).N3().l6(((q)iterator0));
        return iterator0;
    }
}

