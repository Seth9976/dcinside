package io.reactivex.internal.operators.observable;

import io.reactivex.A;
import io.reactivex.B;
import io.reactivex.G;
import io.reactivex.I;
import io.reactivex.internal.util.k;
import io.reactivex.observers.e;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicReference;

public final class c implements Iterable {
    static final class a extends e implements Iterator {
        A b;
        final Semaphore c;
        final AtomicReference d;

        a() {
            this.c = new Semaphore(0);
            this.d = new AtomicReference();
        }

        public void d(A a0) {
            if(this.d.getAndSet(a0) == null) {
                this.c.release();
            }
        }

        @Override
        public boolean hasNext() {
            if(this.b != null && this.b.g()) {
                throw k.f(this.b.d());
            }
            if(this.b == null) {
                try {
                    io.reactivex.internal.util.e.b();
                    this.c.acquire();
                }
                catch(InterruptedException interruptedException0) {
                    this.dispose();
                    this.b = A.b(interruptedException0);
                    throw k.f(interruptedException0);
                }
                A a0 = (A)this.d.getAndSet(null);
                this.b = a0;
                if(a0.g()) {
                    throw k.f(a0.d());
                }
            }
            return this.b.h();
        }

        @Override
        public Object next() {
            if(!this.hasNext()) {
                throw new NoSuchElementException();
            }
            Object object0 = this.b.e();
            this.b = null;
            return object0;
        }

        @Override  // io.reactivex.I
        public void onComplete() {
        }

        @Override  // io.reactivex.I
        public void onError(Throwable throwable0) {
            io.reactivex.plugins.a.Y(throwable0);
        }

        @Override  // io.reactivex.I
        public void onNext(Object object0) {
            this.d(((A)object0));
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException("Read-only iterator.");
        }
    }

    final G a;

    public c(G g0) {
        this.a = g0;
    }

    @Override
    public Iterator iterator() {
        Iterator iterator0 = new a();
        B.P7(this.a).B3().d(((I)iterator0));
        return iterator0;
    }
}

