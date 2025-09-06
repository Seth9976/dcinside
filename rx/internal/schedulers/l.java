package rx.internal.schedulers;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import rx.b.J;
import rx.b;
import rx.functions.a;
import rx.functions.p;
import rx.h;
import rx.j;
import rx.o;

public class l extends j implements o {
    static final class c implements o {
        @Override  // rx.o
        public boolean j() {
            return false;
        }

        @Override  // rx.o
        public void l() {
        }
    }

    static class d extends g {
        private final a a;
        private final long b;
        private final TimeUnit c;

        public d(a a0, long v, TimeUnit timeUnit0) {
            this.a = a0;
            this.b = v;
            this.c = timeUnit0;
        }

        @Override  // rx.internal.schedulers.l$g
        protected o c(rx.j.a j$a0, rx.d d0) {
            return j$a0.d(new f(this.a, d0), this.b, this.c);
        }
    }

    static class e extends g {
        private final a a;

        public e(a a0) {
            this.a = a0;
        }

        @Override  // rx.internal.schedulers.l$g
        protected o c(rx.j.a j$a0, rx.d d0) {
            return j$a0.c(new f(this.a, d0));
        }
    }

    static class f implements a {
        private rx.d a;
        private a b;

        public f(a a0, rx.d d0) {
            this.b = a0;
            this.a = d0;
        }

        @Override  // rx.functions.a
        public void call() {
            try {
                this.b.call();
            }
            finally {
                this.a.d();
            }
        }
    }

    static abstract class g extends AtomicReference implements o {
        public g() {
            super(l.d);
        }

        private void b(rx.j.a j$a0, rx.d d0) {
            o o0 = (o)this.get();
            if(o0 == l.e) {
                return;
            }
            o o1 = l.d;
            if(o0 != o1) {
                return;
            }
            o o2 = this.c(j$a0, d0);
            if(!this.compareAndSet(o1, o2)) {
                o2.l();
            }
        }

        protected abstract o c(rx.j.a arg1, rx.d arg2);

        @Override  // rx.o
        public boolean j() {
            return ((o)this.get()).j();
        }

        @Override  // rx.o
        public void l() {
            o o1;
            o o0 = l.e;
            do {
                o1 = (o)this.get();
                if(o1 == l.e) {
                    return;
                }
            }
            while(!this.compareAndSet(o1, o0));
            if(o1 != l.d) {
                o1.l();
            }
        }
    }

    private final j a;
    private final h b;
    private final o c;
    static final o d;
    static final o e;

    static {
        l.d = new c();
        l.e = rx.subscriptions.f.e();
    }

    public l(p p0, j j0) {
        this.a = j0;
        rx.subjects.c c0 = rx.subjects.c.C7();
        this.b = new rx.observers.f(c0);
        this.c = ((b)p0.b(c0.R3())).n0();
    }

    @Override  // rx.j
    public rx.j.a a() {
        class rx.internal.schedulers.l.a implements p {
            final rx.j.a a;
            final l b;

            rx.internal.schedulers.l.a(rx.j.a j$a0) {
                this.a = j$a0;
                super();
            }

            public b a(g l$g0) {
                class rx.internal.schedulers.l.a.a implements J {
                    final g a;
                    final rx.internal.schedulers.l.a b;

                    rx.internal.schedulers.l.a.a(g l$g0) {
                        this.a = l$g0;
                        super();
                    }

                    public void a(rx.d d0) {
                        d0.a(this.a);
                        this.a.b(rx.internal.schedulers.l.a.this.a, d0);
                    }

                    @Override  // rx.functions.b
                    public void b(Object object0) {
                        this.a(((rx.d)object0));
                    }
                }

                return b.p(new rx.internal.schedulers.l.a.a(this, l$g0));
            }

            @Override  // rx.functions.p
            public Object b(Object object0) {
                return this.a(((g)object0));
            }
        }


        class rx.internal.schedulers.l.b extends rx.j.a {
            private final AtomicBoolean a;
            final rx.j.a b;
            final h c;
            final l d;

            rx.internal.schedulers.l.b(rx.j.a j$a0, h h0) {
                this.b = j$a0;
                this.c = h0;
                super();
                this.a = new AtomicBoolean();
            }

            @Override  // rx.j$a
            public o c(a a0) {
                o o0 = new e(a0);
                this.c.onNext(o0);
                return o0;
            }

            @Override  // rx.j$a
            public o d(a a0, long v, TimeUnit timeUnit0) {
                o o0 = new d(a0, v, timeUnit0);
                this.c.onNext(o0);
                return o0;
            }

            @Override  // rx.o
            public boolean j() {
                return this.a.get();
            }

            @Override  // rx.o
            public void l() {
                if(this.a.compareAndSet(false, true)) {
                    this.b.l();
                    this.c.d();
                }
            }
        }

        rx.j.a j$a0 = this.a.a();
        rx.internal.operators.g g0 = rx.internal.operators.g.C7();
        rx.observers.f f0 = new rx.observers.f(g0);
        rx.g g1 = g0.g3(new rx.internal.schedulers.l.a(this, j$a0));
        rx.j.a j$a1 = new rx.internal.schedulers.l.b(this, j$a0, f0);
        this.b.onNext(g1);
        return j$a1;
    }

    @Override  // rx.o
    public boolean j() {
        return this.c.j();
    }

    @Override  // rx.o
    public void l() {
        this.c.l();
    }
}

