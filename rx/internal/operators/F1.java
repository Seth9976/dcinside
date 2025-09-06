package rx.internal.operators;

import java.util.Queue;
import java.util.concurrent.atomic.AtomicLong;
import rx.exceptions.c;
import rx.functions.o;
import rx.functions.q;
import rx.g.b;
import rx.h;
import rx.i;
import rx.internal.util.unsafe.G;
import rx.n;

public final class f1 implements b {
    static final class d implements h, i {
        final n a;
        final Queue b;
        boolean c;
        boolean d;
        long e;
        final AtomicLong f;
        volatile i g;
        volatile boolean h;
        Throwable i;

        public d(Object object0, n n0) {
            this.a = n0;
            G g0 = new G();
            this.b = g0;
            g0.offer(x.j(object0));
            this.f = new AtomicLong();
        }

        public void X(i i0) {
            i0.getClass();
            synchronized(this.f) {
                if(this.g == null) {
                    long v1 = this.e == 0x7FFFFFFFFFFFFFFFL ? this.e : this.e - 1L;
                    this.e = 0L;
                    this.g = i0;
                    if(v1 > 0L) {
                        i0.request(v1);
                    }
                    this.f();
                    return;
                }
            }
            throw new IllegalStateException("Can\'t set more than one Producer!");
        }

        boolean b(boolean z, boolean z1, n n0) {
            if(n0.j()) {
                return true;
            }
            if(z) {
                Throwable throwable0 = this.i;
                if(throwable0 != null) {
                    n0.onError(throwable0);
                    return true;
                }
                if(z1) {
                    n0.d();
                    return true;
                }
            }
            return false;
        }

        @Override  // rx.h
        public void d() {
            this.h = true;
            this.f();
        }

        void f() {
            synchronized(this) {
                if(this.c) {
                    this.d = true;
                    return;
                }
                this.c = true;
            }
            this.g();
        }

        void g() {
            n n0 = this.a;
            Queue queue0 = this.b;
            AtomicLong atomicLong0 = this.f;
            long v = atomicLong0.get();
            while(true) {
                if(this.b(this.h, queue0.isEmpty(), n0)) {
                    return;
                }
                long v1;
                for(v1 = 0L; v1 != v; ++v1) {
                    boolean z = this.h;
                    Object object0 = queue0.poll();
                    if(this.b(z, object0 == null, n0)) {
                        return;
                    }
                    if(object0 == null) {
                        break;
                    }
                    Object object1 = x.e(object0);
                    try {
                        n0.onNext(object1);
                    }
                    catch(Throwable throwable0) {
                        c.g(throwable0, n0, object1);
                        return;
                    }
                }
                if(v1 != 0L && v != 0x7FFFFFFFFFFFFFFFL) {
                    v = a.i(atomicLong0, v1);
                }
                synchronized(this) {
                    if(!this.d) {
                        this.c = false;
                        return;
                    }
                    this.d = false;
                }
            }
        }

        @Override  // rx.h
        public void onError(Throwable throwable0) {
            this.i = throwable0;
            this.h = true;
            this.f();
        }

        @Override  // rx.h
        public void onNext(Object object0) {
            Object object1 = x.j(object0);
            this.b.offer(object1);
            this.f();
        }

        @Override  // rx.i
        public void request(long v) {
            int v1 = Long.compare(v, 0L);
            if(v1 < 0) {
                throw new IllegalArgumentException("n >= required but it was " + v);
            }
            if(v1 != 0) {
                a.b(this.f, v);
                i i0 = this.g;
                if(i0 == null) {
                    synchronized(this.f) {
                        i0 = this.g;
                        if(i0 == null) {
                            this.e = a.a(this.e, v);
                        }
                    }
                }
                if(i0 != null) {
                    i0.request(v);
                }
                this.f();
            }
        }
    }

    private final o a;
    final q b;
    private static final Object c;

    static {
        f1.c = new Object();
    }

    public f1(Object object0, q q0) {
        class rx.internal.operators.f1.a implements o {
            final Object a;

            rx.internal.operators.f1.a(Object object0) {
            }

            @Override  // rx.functions.o
            public Object call() {
                return this.a;
            }
        }

        this(new rx.internal.operators.f1.a(object0), q0);
    }

    public f1(o o0, q q0) {
        this.a = o0;
        this.b = q0;
    }

    public f1(q q0) {
        this(f1.c, q0);
    }

    public n a(n n0) {
        class rx.internal.operators.f1.b extends n {
            boolean f;
            Object g;
            final n h;
            final f1 i;

            rx.internal.operators.f1.b(n n0, n n1) {
                this.h = n1;
                super(n0);
            }

            @Override  // rx.h
            public void d() {
                this.h.d();
            }

            @Override  // rx.h
            public void onError(Throwable throwable0) {
                this.h.onError(throwable0);
            }

            @Override  // rx.h
            public void onNext(Object object0) {
                if(this.f) {
                    try {
                        object0 = f1.this.b.p(this.g, object0);
                    }
                    catch(Throwable throwable0) {
                        c.g(throwable0, this.h, object0);
                        return;
                    }
                }
                else {
                    this.f = true;
                }
                this.g = object0;
                this.h.onNext(object0);
            }
        }


        class rx.internal.operators.f1.c extends n {
            private Object f;
            final Object g;
            final d h;
            final f1 i;

            rx.internal.operators.f1.c(Object object0, d f1$d0) {
                this.g = object0;
                this.h = f1$d0;
                super();
                this.f = object0;
            }

            @Override  // rx.n
            public void X(i i0) {
                this.h.X(i0);
            }

            @Override  // rx.h
            public void d() {
                this.h.d();
            }

            @Override  // rx.h
            public void onError(Throwable throwable0) {
                this.h.onError(throwable0);
            }

            @Override  // rx.h
            public void onNext(Object object0) {
                Object object1;
                try {
                    object1 = f1.this.b.p(this.f, object0);
                }
                catch(Throwable throwable0) {
                    c.g(throwable0, this, object0);
                    return;
                }
                this.f = object1;
                this.h.onNext(object1);
            }
        }

        Object object0 = this.a.call();
        if(object0 == f1.c) {
            return new rx.internal.operators.f1.b(this, n0, n0);
        }
        d f1$d0 = new d(object0, n0);
        n n1 = new rx.internal.operators.f1.c(this, object0, f1$d0);
        n0.q(n1);
        n0.X(f1$d0);
        return n1;
    }

    @Override  // rx.functions.p
    public Object b(Object object0) {
        return this.a(((n)object0));
    }
}

