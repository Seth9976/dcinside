package rx.observables;

import java.util.concurrent.atomic.AtomicLong;
import rx.exceptions.c;
import rx.functions.b;
import rx.functions.q;
import rx.g.a;
import rx.h;
import rx.i;
import rx.n;
import rx.o;

public abstract class e implements a {
    static final class f extends AtomicLong implements h, i, o {
        private final n a;
        private final e b;
        private boolean c;
        private boolean d;
        private Object e;
        private static final long f = 0xCC23FDF7F684DBF8L;

        f(n n0, e e0, Object object0) {
            this.a = n0;
            this.b = e0;
            this.e = object0;
        }

        private void b() {
            try {
                this.b.s(this.e);
            }
            catch(Throwable throwable0) {
                c.e(throwable0);
                rx.plugins.c.I(throwable0);
            }
        }

        @Override  // rx.h
        public void d() {
            if(this.d) {
                throw new IllegalStateException("Terminal event already emitted.");
            }
            this.d = true;
            if(!this.a.j()) {
                this.a.d();
            }
        }

        private void f() {
            e e0 = this.b;
            n n0 = this.a;
            do {
                try {
                    this.c = false;
                    this.h(e0);
                }
                catch(Throwable throwable0) {
                    this.g(n0, throwable0);
                    return;
                }
            }
            while(!this.k());
        }

        private void g(n n0, Throwable throwable0) {
            if(this.d) {
                rx.plugins.c.I(throwable0);
                return;
            }
            this.d = true;
            n0.onError(throwable0);
            this.l();
        }

        private void h(e e0) {
            this.e = e0.r(this.e, this);
        }

        private void i(long v) {
            e e0 = this.b;
            n n0 = this.a;
            do {
                long v1 = v;
                do {
                    try {
                        this.c = false;
                        this.h(e0);
                    }
                    catch(Throwable throwable0) {
                        this.g(n0, throwable0);
                        return;
                    }
                    if(this.k()) {
                        return;
                    }
                    if(this.c) {
                        --v1;
                    }
                }
                while(v1 != 0L);
                v = this.addAndGet(-v);
            }
            while(v > 0L);
            this.k();
        }

        @Override  // rx.o
        public boolean j() {
            return this.get() < 0L;
        }

        private boolean k() {
            if(!this.d && this.get() >= -1L) {
                return false;
            }
            this.set(-1L);
            this.b();
            return true;
        }

        @Override  // rx.o
        public void l() {
            do {
                long v = this.get();
                if(this.compareAndSet(0L, -1L)) {
                    this.b();
                    return;
                }
            }
            while(!this.compareAndSet(v, -2L));
        }

        @Override  // rx.h
        public void onError(Throwable throwable0) {
            if(this.d) {
                throw new IllegalStateException("Terminal event already emitted.");
            }
            this.d = true;
            if(!this.a.j()) {
                this.a.onError(throwable0);
            }
        }

        @Override  // rx.h
        public void onNext(Object object0) {
            if(this.c) {
                throw new IllegalStateException("onNext called multiple times!");
            }
            this.c = true;
            this.a.onNext(object0);
        }

        @Override  // rx.i
        public void request(long v) {
            if(v > 0L && rx.internal.operators.a.b(this, v) == 0L) {
                if(v == 0x7FFFFFFFFFFFFFFFL) {
                    this.f();
                    return;
                }
                this.i(v);
            }
        }
    }

    static final class g extends e {
        private final rx.functions.o a;
        private final q b;
        private final b c;

        public g(rx.functions.o o0, q q0) {
            this(o0, q0, null);
        }

        g(rx.functions.o o0, q q0, b b0) {
            this.a = o0;
            this.b = q0;
            this.c = b0;
        }

        public g(q q0) {
            this(null, q0, null);
        }

        public g(q q0, b b0) {
            this(null, q0, b0);
        }

        @Override  // rx.observables.e
        public void b(Object object0) {
            super.a(((n)object0));
        }

        @Override  // rx.observables.e
        protected Object q() {
            return this.a == null ? null : this.a.call();
        }

        @Override  // rx.observables.e
        protected Object r(Object object0, h h0) {
            return this.b.p(object0, h0);
        }

        @Override  // rx.observables.e
        protected void s(Object object0) {
            b b0 = this.c;
            if(b0 != null) {
                b0.b(object0);
            }
        }
    }

    public final void a(n n0) {
        Object object0;
        try {
            object0 = this.q();
        }
        catch(Throwable throwable0) {
            c.e(throwable0);
            n0.onError(throwable0);
            return;
        }
        f e$f0 = new f(n0, this, object0);
        n0.q(e$f0);
        n0.X(e$f0);
    }

    @Override  // rx.functions.b
    public void b(Object object0) {
        this.a(((n)object0));
    }

    public static e c(rx.functions.o o0, rx.functions.c c0) {
        static final class rx.observables.e.a implements q {
            final rx.functions.c a;

            rx.observables.e.a(rx.functions.c c0) {
                this.a = c0;
                super();
            }

            public Object a(Object object0, h h0) {
                this.a.p(object0, h0);
                return object0;
            }

            @Override  // rx.functions.q
            public Object p(Object object0, Object object1) {
                return this.a(object0, ((h)object1));
            }
        }

        return new g(o0, new rx.observables.e.a(c0));
    }

    public static e d(rx.functions.o o0, rx.functions.c c0, b b0) {
        static final class rx.observables.e.b implements q {
            final rx.functions.c a;

            rx.observables.e.b(rx.functions.c c0) {
                this.a = c0;
                super();
            }

            public Object a(Object object0, h h0) {
                this.a.p(object0, h0);
                return object0;
            }

            @Override  // rx.functions.q
            public Object p(Object object0, Object object1) {
                return this.a(object0, ((h)object1));
            }
        }

        return new g(o0, new rx.observables.e.b(c0), b0);
    }

    public static e e(rx.functions.o o0, q q0) {
        return new g(o0, q0);
    }

    public static e j(rx.functions.o o0, q q0, b b0) {
        return new g(o0, q0, b0);
    }

    public static e l(b b0) {
        static final class rx.observables.e.c implements q {
            final b a;

            rx.observables.e.c(b b0) {
                this.a = b0;
                super();
            }

            public Void a(Void void0, h h0) {
                this.a.b(h0);
                return void0;
            }

            @Override  // rx.functions.q
            public Object p(Object object0, Object object1) {
                return this.a(((Void)object0), ((h)object1));
            }
        }

        return new g(new rx.observables.e.c(b0));
    }

    public static e o(b b0, rx.functions.a a0) {
        static final class d implements q {
            final b a;

            d(b b0) {
                this.a = b0;
                super();
            }

            public Void a(Void void0, h h0) {
                this.a.b(h0);
                return null;
            }

            @Override  // rx.functions.q
            public Object p(Object object0, Object object1) {
                return this.a(((Void)object0), ((h)object1));
            }
        }


        static final class rx.observables.e.e implements b {
            final rx.functions.a a;

            rx.observables.e.e(rx.functions.a a0) {
                this.a = a0;
                super();
            }

            public void a(Void void0) {
                this.a.call();
            }

            @Override  // rx.functions.b
            public void b(Object object0) {
                this.a(((Void)object0));
            }
        }

        return new g(new d(b0), new rx.observables.e.e(a0));
    }

    protected abstract Object q();

    protected abstract Object r(Object arg1, h arg2);

    protected void s(Object object0) {
    }
}

