package rx.internal.operators;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicReference;
import rx.exceptions.c;
import rx.f;
import rx.g;
import rx.n;

public final class b {
    static final class rx.internal.operators.b.b extends n implements Iterator {
        final Semaphore f;
        final AtomicReference g;
        f h;

        rx.internal.operators.b.b() {
            this.f = new Semaphore(0);
            this.g = new AtomicReference();
        }

        @Override  // rx.h
        public void d() {
        }

        @Override
        public boolean hasNext() {
            if(this.h != null && this.h.l()) {
                throw c.c(this.h.g());
            }
            if((this.h == null || !this.h.k()) && this.h == null) {
                try {
                    this.f.acquire();
                }
                catch(InterruptedException interruptedException0) {
                    this.l();
                    Thread.currentThread().interrupt();
                    this.h = f.d(interruptedException0);
                    throw c.c(interruptedException0);
                }
                f f0 = (f)this.g.getAndSet(null);
                this.h = f0;
                if(f0.l()) {
                    throw c.c(this.h.g());
                }
            }
            return !this.h.k();
        }

        @Override
        public Object next() {
            if(!this.hasNext() || !this.h.m()) {
                throw new NoSuchElementException();
            }
            Object object0 = this.h.h();
            this.h = null;
            return object0;
        }

        @Override  // rx.h
        public void onError(Throwable throwable0) {
        }

        @Override  // rx.h
        public void onNext(Object object0) {
            this.x(((f)object0));
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException("Read-only iterator.");
        }

        public void x(f f0) {
            if(this.g.getAndSet(f0) == null) {
                this.f.release();
            }
        }
    }

    private b() {
        throw new IllegalStateException("No instances!");
    }

    public static Iterable a(g g0) {
        static final class a implements Iterable {
            final g a;

            a(g g0) {
                this.a = g0;
                super();
            }

            @Override
            public Iterator iterator() {
                Iterator iterator0 = new rx.internal.operators.b.b();
                this.a.i3().v5(((n)iterator0));
                return iterator0;
            }
        }

        return new a(g0);
    }
}

