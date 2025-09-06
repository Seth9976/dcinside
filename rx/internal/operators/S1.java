package rx.internal.operators;

import java.util.ArrayDeque;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import rx.functions.p;
import rx.g.b;
import rx.i;
import rx.j;
import rx.n;

public final class s1 implements b {
    static final class rx.internal.operators.s1.b extends n implements p {
        final n f;
        final long g;
        final j h;
        final int i;
        final AtomicLong j;
        final ArrayDeque k;
        final ArrayDeque l;

        public rx.internal.operators.s1.b(n n0, int v, long v1, j j0) {
            this.f = n0;
            this.i = v;
            this.g = v1;
            this.h = j0;
            this.j = new AtomicLong();
            this.k = new ArrayDeque();
            this.l = new ArrayDeque();
        }

        void Q(long v) {
            a.h(this.j, v, this.k, this.f, this);
        }

        @Override  // rx.functions.p
        public Object b(Object object0) {
            return x.e(object0);
        }

        @Override  // rx.h
        public void d() {
            this.x(this.h.b());
            this.l.clear();
            a.e(this.j, this.k, this.f, this);
        }

        @Override  // rx.h
        public void onError(Throwable throwable0) {
            this.k.clear();
            this.l.clear();
            this.f.onError(throwable0);
        }

        @Override  // rx.h
        public void onNext(Object object0) {
            if(this.i != 0) {
                long v = this.h.b();
                if(this.k.size() == this.i) {
                    this.k.poll();
                    this.l.poll();
                }
                this.x(v);
                Object object1 = x.j(object0);
                this.k.offer(object1);
                this.l.offer(v);
            }
        }

        protected void x(long v) {
            long v1 = v - this.g;
            while(true) {
                Long long0 = (Long)this.l.peek();
                if(long0 == null || ((long)long0) >= v1) {
                    break;
                }
                this.k.poll();
                this.l.poll();
            }
        }
    }

    final long a;
    final j b;
    final int c;

    public s1(int v, long v1, TimeUnit timeUnit0, j j0) {
        if(v < 0) {
            throw new IndexOutOfBoundsException("count could not be negative");
        }
        this.a = timeUnit0.toMillis(v1);
        this.b = j0;
        this.c = v;
    }

    public s1(long v, TimeUnit timeUnit0, j j0) {
        this.a = timeUnit0.toMillis(v);
        this.b = j0;
        this.c = -1;
    }

    public n a(n n0) {
        class rx.internal.operators.s1.a implements i {
            final rx.internal.operators.s1.b a;
            final s1 b;

            rx.internal.operators.s1.a(rx.internal.operators.s1.b s1$b0) {
                this.a = s1$b0;
                super();
            }

            @Override  // rx.i
            public void request(long v) {
                this.a.Q(v);
            }
        }

        n n1 = new rx.internal.operators.s1.b(n0, this.c, this.a, this.b);
        n0.q(n1);
        n0.X(new rx.internal.operators.s1.a(this, ((rx.internal.operators.s1.b)n1)));
        return n1;
    }

    @Override  // rx.functions.p
    public Object b(Object object0) {
        return this.a(((n)object0));
    }
}

