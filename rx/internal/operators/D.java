package rx.internal.operators;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;
import rx.f;
import rx.g;
import rx.n;

public final class d {
    static final class b implements Iterator {
        private final c a;
        private final g b;
        private Object c;
        private boolean d;
        private boolean e;
        private Throwable f;
        private boolean g;

        b(g g0, c d$c0) {
            this.d = true;
            this.e = true;
            this.b = g0;
            this.a = d$c0;
        }

        private boolean a() {
            try {
                if(!this.g) {
                    this.g = true;
                    this.a.Q(1);
                    this.b.i3().v5(this.a);
                }
                f f0 = this.a.R();
                if(f0.m()) {
                    this.e = false;
                    this.c = f0.h();
                    return true;
                }
                this.d = false;
                if(f0.k()) {
                    return false;
                }
                if(!f0.l()) {
                    throw new IllegalStateException("Should not reach here");
                }
                Throwable throwable0 = f0.g();
                this.f = throwable0;
                throw rx.exceptions.c.c(throwable0);
            }
            catch(InterruptedException interruptedException0) {
            }
            this.a.l();
            Thread.currentThread().interrupt();
            this.f = interruptedException0;
            throw rx.exceptions.c.c(interruptedException0);
        }

        @Override
        public boolean hasNext() {
            Throwable throwable0 = this.f;
            if(throwable0 != null) {
                throw rx.exceptions.c.c(throwable0);
            }
            return this.d ? !this.e || this.a() : false;
        }

        @Override
        public Object next() {
            Throwable throwable0 = this.f;
            if(throwable0 != null) {
                throw rx.exceptions.c.c(throwable0);
            }
            if(!this.hasNext()) {
                throw new NoSuchElementException("No more elements");
            }
            this.e = true;
            return this.c;
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException("Read only iterator");
        }
    }

    static final class c extends n {
        private final BlockingQueue f;
        final AtomicInteger g;

        c() {
            this.f = new ArrayBlockingQueue(1);
            this.g = new AtomicInteger();
        }

        void Q(int v) {
            this.g.set(v);
        }

        public f R() throws InterruptedException {
            this.Q(1);
            return (f)this.f.take();
        }

        @Override  // rx.h
        public void d() {
        }

        @Override  // rx.h
        public void onError(Throwable throwable0) {
        }

        @Override  // rx.h
        public void onNext(Object object0) {
            this.x(((f)object0));
        }

        public void x(f f0) {
            if(this.g.getAndSet(0) == 1 || !f0.m()) {
                while(!this.f.offer(f0)) {
                    f f1 = (f)this.f.poll();
                    if(f1 != null && !f1.m()) {
                        f0 = f1;
                    }
                }
            }
        }
    }

    private d() {
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
                c d$c0 = new c();
                return new b(this.a, d$c0);
            }
        }

        return new a(g0);
    }
}

