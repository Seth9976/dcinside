package rx.internal.operators;

import java.util.ArrayDeque;
import java.util.concurrent.atomic.AtomicLong;
import rx.functions.p;
import rx.g.b;
import rx.i;
import rx.n;

public final class r1 implements b {
    static final class rx.internal.operators.r1.b extends n implements p {
        final n f;
        final AtomicLong g;
        final ArrayDeque h;
        final int i;

        public rx.internal.operators.r1.b(n n0, int v) {
            this.f = n0;
            this.i = v;
            this.g = new AtomicLong();
            this.h = new ArrayDeque();
        }

        @Override  // rx.functions.p
        public Object b(Object object0) {
            return x.e(object0);
        }

        @Override  // rx.h
        public void d() {
            a.e(this.g, this.h, this.f, this);
        }

        @Override  // rx.h
        public void onError(Throwable throwable0) {
            this.h.clear();
            this.f.onError(throwable0);
        }

        @Override  // rx.h
        public void onNext(Object object0) {
            if(this.h.size() == this.i) {
                this.h.poll();
            }
            Object object1 = x.j(object0);
            this.h.offer(object1);
        }

        void x(long v) {
            if(v > 0L) {
                a.h(this.g, v, this.h, this.f, this);
            }
        }
    }

    final int a;

    public r1(int v) {
        if(v < 0) {
            throw new IndexOutOfBoundsException("count cannot be negative");
        }
        this.a = v;
    }

    public n a(n n0) {
        class rx.internal.operators.r1.a implements i {
            final rx.internal.operators.r1.b a;
            final r1 b;

            rx.internal.operators.r1.a(rx.internal.operators.r1.b r1$b0) {
                this.a = r1$b0;
                super();
            }

            @Override  // rx.i
            public void request(long v) {
                this.a.x(v);
            }
        }

        n n1 = new rx.internal.operators.r1.b(n0, this.a);
        n0.q(n1);
        n0.X(new rx.internal.operators.r1.a(this, ((rx.internal.operators.r1.b)n1)));
        return n1;
    }

    @Override  // rx.functions.p
    public Object b(Object object0) {
        return this.a(((n)object0));
    }
}

