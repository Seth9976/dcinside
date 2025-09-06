package rx.internal.operators;

import java.util.NoSuchElementException;
import rx.functions.q;
import rx.g.a;
import rx.g;
import rx.i;
import rx.n;
import rx.plugins.c;

public final class c0 implements a {
    static final class b extends n {
        final n f;
        final q g;
        Object h;
        boolean i;
        static final Object j;

        static {
            b.j = new Object();
        }

        public b(n n0, q q0) {
            this.f = n0;
            this.g = q0;
            this.h = b.j;
            this.v(0L);
        }

        @Override  // rx.h
        public void d() {
            if(this.i) {
                return;
            }
            this.i = true;
            Object object0 = this.h;
            if(object0 != b.j) {
                this.f.onNext(object0);
                this.f.d();
                return;
            }
            NoSuchElementException noSuchElementException0 = new NoSuchElementException();
            this.f.onError(noSuchElementException0);
        }

        @Override  // rx.h
        public void onError(Throwable throwable0) {
            if(!this.i) {
                this.i = true;
                this.f.onError(throwable0);
                return;
            }
            c.I(throwable0);
        }

        @Override  // rx.h
        public void onNext(Object object0) {
            if(this.i) {
                return;
            }
            Object object1 = this.h;
            if(object1 == b.j) {
                this.h = object0;
                return;
            }
            try {
                this.h = this.g.p(object1, object0);
            }
            catch(Throwable throwable0) {
                rx.exceptions.c.e(throwable0);
                this.l();
                this.onError(throwable0);
            }
        }

        void x(long v) {
            int v1 = Long.compare(v, 0L);
            if(v1 < 0) {
                throw new IllegalArgumentException("n >= 0 required but it was " + v);
            }
            if(v1 != 0) {
                this.v(0x7FFFFFFFFFFFFFFFL);
            }
        }
    }

    final g a;
    final q b;

    public c0(g g0, q q0) {
        this.a = g0;
        this.b = q0;
    }

    public void a(n n0) {
        class rx.internal.operators.c0.a implements i {
            final b a;
            final c0 b;

            rx.internal.operators.c0.a(b c0$b0) {
                this.a = c0$b0;
                super();
            }

            @Override  // rx.i
            public void request(long v) {
                this.a.x(v);
            }
        }

        b c0$b0 = new b(n0, this.b);
        n0.q(c0$b0);
        n0.X(new rx.internal.operators.c0.a(this, c0$b0));
        this.a.N6(c0$b0);
    }

    @Override  // rx.functions.b
    public void b(Object object0) {
        this.a(((n)object0));
    }
}

