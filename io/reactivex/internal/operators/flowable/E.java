package io.reactivex.internal.operators.flowable;

import io.reactivex.A;
import io.reactivex.internal.util.k;
import io.reactivex.l;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;
import org.reactivestreams.c;

public final class e implements Iterable {
    static final class a implements Iterator {
        private final b a;
        private final c b;
        private Object c;
        private boolean d;
        private boolean e;
        private Throwable f;
        private boolean g;

        a(c c0, b e$b0) {
            this.d = true;
            this.e = true;
            this.b = c0;
            this.a = e$b0;
        }

        private boolean a() {
            try {
                if(!this.g) {
                    this.g = true;
                    this.a.f();
                    l.a3(this.b).N3().l6(this.a);
                }
                A a0 = this.a.h();
                if(a0.h()) {
                    this.e = false;
                    this.c = a0.e();
                    return true;
                }
                this.d = false;
                if(a0.f()) {
                    return false;
                }
                if(!a0.g()) {
                    throw new IllegalStateException("Should not reach here");
                }
                Throwable throwable0 = a0.d();
                this.f = throwable0;
                throw k.f(throwable0);
            }
            catch(InterruptedException interruptedException0) {
            }
            this.a.dispose();
            this.f = interruptedException0;
            throw k.f(interruptedException0);
        }

        @Override
        public boolean hasNext() {
            Throwable throwable0 = this.f;
            if(throwable0 != null) {
                throw k.f(throwable0);
            }
            return this.d ? !this.e || this.a() : false;
        }

        @Override
        public Object next() {
            Throwable throwable0 = this.f;
            if(throwable0 != null) {
                throw k.f(throwable0);
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

    static final class b extends io.reactivex.subscribers.b {
        private final BlockingQueue b;
        final AtomicInteger c;

        b() {
            this.b = new ArrayBlockingQueue(1);
            this.c = new AtomicInteger();
        }

        public void e(A a0) {
            if(this.c.getAndSet(0) == 1 || !a0.h()) {
                while(!this.b.offer(a0)) {
                    A a1 = (A)this.b.poll();
                    if(a1 != null && !a1.h()) {
                        a0 = a1;
                    }
                }
            }
        }

        void f() {
            this.c.set(1);
        }

        public A h() throws InterruptedException {
            this.f();
            io.reactivex.internal.util.e.b();
            return (A)this.b.take();
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
    }

    final c a;

    public e(c c0) {
        this.a = c0;
    }

    @Override
    public Iterator iterator() {
        b e$b0 = new b();
        return new a(this.a, e$b0);
    }
}

