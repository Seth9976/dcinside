package rx.internal.operators;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import rx.exceptions.c;
import rx.g;
import rx.internal.util.m;
import rx.n;

public final class f {
    public static final class a extends n implements Iterator {
        private final BlockingQueue f;
        private rx.f g;
        private int h;
        static final int i;

        static {
            a.i = m.d * 3 / 4;
        }

        public a() {
            this.f = new LinkedBlockingQueue();
        }

        private rx.f Q() {
            try {
                rx.f f0 = (rx.f)this.f.poll();
                return f0 == null ? ((rx.f)this.f.take()) : f0;
            }
            catch(InterruptedException interruptedException0) {
                this.l();
                throw c.c(interruptedException0);
            }
        }

        @Override  // rx.h
        public void d() {
        }

        @Override
        public boolean hasNext() {
            if(this.g == null) {
                this.g = this.Q();
                int v = this.h + 1;
                this.h = v;
                if(v >= a.i) {
                    this.v(((long)v));
                    this.h = 0;
                }
            }
            if(this.g.l()) {
                throw c.c(this.g.g());
            }
            return !this.g.k();
        }

        @Override
        public Object next() {
            if(!this.hasNext()) {
                throw new NoSuchElementException();
            }
            Object object0 = this.g.h();
            this.g = null;
            return object0;
        }

        @Override  // rx.h
        public void onError(Throwable throwable0) {
            rx.f f0 = rx.f.d(throwable0);
            this.f.offer(f0);
        }

        @Override  // rx.h
        public void onNext(Object object0) {
            this.x(((rx.f)object0));
        }

        @Override  // rx.n
        public void onStart() {
            this.v(((long)m.d));
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException("Read-only iterator");
        }

        public void x(rx.f f0) {
            this.f.offer(f0);
        }
    }

    private f() {
        throw new IllegalStateException("No instances!");
    }

    public static Iterator a(g g0) {
        Iterator iterator0 = new a();
        g0.i3().v5(((n)iterator0));
        return iterator0;
    }
}

