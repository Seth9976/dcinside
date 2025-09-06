package rx.internal.operators;

import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicReference;
import rx.g.a;
import rx.g;
import rx.i;
import rx.n;
import rx.subscriptions.f;

public final class y implements a {
    static final class c extends n {
        private final n f;
        private final d g;
        private boolean h;

        c(long v, n n0, d y$d0) {
            this.f = n0;
            this.g = y$d0;
            this.v(v);
        }

        private boolean Q() {
            if(this.h) {
                return true;
            }
            if(this.g.get() == this) {
                this.h = true;
                return true;
            }
            if(this.g.compareAndSet(null, this)) {
                this.g.b(this);
                this.h = true;
                return true;
            }
            this.g.a();
            return false;
        }

        private void R(long v) {
            this.v(v);
        }

        @Override  // rx.h
        public void d() {
            if(this.Q()) {
                this.f.d();
            }
        }

        @Override  // rx.h
        public void onError(Throwable throwable0) {
            if(this.Q()) {
                this.f.onError(throwable0);
            }
        }

        @Override  // rx.h
        public void onNext(Object object0) {
            if(this.Q()) {
                this.f.onNext(object0);
            }
        }
    }

    static final class d extends AtomicReference {
        final Collection a;

        d() {
            this.a = new ConcurrentLinkedQueue();
        }

        public void a() {
            c y$c0 = (c)this.get();
            if(y$c0 != null) {
                this.b(y$c0);
            }
        }

        public void b(c y$c0) {
            for(Object object0: this.a) {
                c y$c1 = (c)object0;
                if(y$c1 != y$c0) {
                    y$c1.l();
                }
            }
            this.a.clear();
        }
    }

    final Iterable a;

    private y(Iterable iterable0) {
        this.a = iterable0;
    }

    public static a a(Iterable iterable0) {
        return new y(iterable0);
    }

    @Override  // rx.functions.b
    public void b(Object object0) {
        this.s(((n)object0));
    }

    public static a c(g g0, g g1) {
        ArrayList arrayList0 = new ArrayList();
        arrayList0.add(g0);
        arrayList0.add(g1);
        return y.a(arrayList0);
    }

    public static a d(g g0, g g1, g g2) {
        ArrayList arrayList0 = new ArrayList();
        arrayList0.add(g0);
        arrayList0.add(g1);
        arrayList0.add(g2);
        return y.a(arrayList0);
    }

    public static a e(g g0, g g1, g g2, g g3) {
        ArrayList arrayList0 = new ArrayList();
        arrayList0.add(g0);
        arrayList0.add(g1);
        arrayList0.add(g2);
        arrayList0.add(g3);
        return y.a(arrayList0);
    }

    public static a j(g g0, g g1, g g2, g g3, g g4) {
        ArrayList arrayList0 = new ArrayList();
        arrayList0.add(g0);
        arrayList0.add(g1);
        arrayList0.add(g2);
        arrayList0.add(g3);
        arrayList0.add(g4);
        return y.a(arrayList0);
    }

    public static a l(g g0, g g1, g g2, g g3, g g4, g g5) {
        ArrayList arrayList0 = new ArrayList();
        arrayList0.add(g0);
        arrayList0.add(g1);
        arrayList0.add(g2);
        arrayList0.add(g3);
        arrayList0.add(g4);
        arrayList0.add(g5);
        return y.a(arrayList0);
    }

    public static a o(g g0, g g1, g g2, g g3, g g4, g g5, g g6) {
        ArrayList arrayList0 = new ArrayList();
        arrayList0.add(g0);
        arrayList0.add(g1);
        arrayList0.add(g2);
        arrayList0.add(g3);
        arrayList0.add(g4);
        arrayList0.add(g5);
        arrayList0.add(g6);
        return y.a(arrayList0);
    }

    public static a q(g g0, g g1, g g2, g g3, g g4, g g5, g g6, g g7) {
        ArrayList arrayList0 = new ArrayList();
        arrayList0.add(g0);
        arrayList0.add(g1);
        arrayList0.add(g2);
        arrayList0.add(g3);
        arrayList0.add(g4);
        arrayList0.add(g5);
        arrayList0.add(g6);
        arrayList0.add(g7);
        return y.a(arrayList0);
    }

    public static a r(g g0, g g1, g g2, g g3, g g4, g g5, g g6, g g7, g g8) {
        ArrayList arrayList0 = new ArrayList();
        arrayList0.add(g0);
        arrayList0.add(g1);
        arrayList0.add(g2);
        arrayList0.add(g3);
        arrayList0.add(g4);
        arrayList0.add(g5);
        arrayList0.add(g6);
        arrayList0.add(g7);
        arrayList0.add(g8);
        return y.a(arrayList0);
    }

    public void s(n n0) {
        class rx.internal.operators.y.a implements rx.functions.a {
            final d a;
            final y b;

            rx.internal.operators.y.a(d y$d0) {
                this.a = y$d0;
                super();
            }

            @Override  // rx.functions.a
            public void call() {
                c y$c0 = (c)this.a.get();
                if(y$c0 != null) {
                    y$c0.l();
                }
                y.t(this.a.a);
            }
        }


        class b implements i {
            final d a;
            final y b;

            b(d y$d0) {
                this.a = y$d0;
                super();
            }

            @Override  // rx.i
            public void request(long v) {
                c y$c0 = (c)this.a.get();
                if(y$c0 != null) {
                    y$c0.R(v);
                    return;
                }
                for(Object object0: this.a.a) {
                    c y$c1 = (c)object0;
                    if(!y$c1.j()) {
                        if(this.a.get() == y$c1) {
                            y$c1.R(v);
                            return;
                        }
                        y$c1.R(v);
                    }
                }
            }
        }

        d y$d0 = new d();
        n0.q(f.a(new rx.internal.operators.y.a(this, y$d0)));
        for(Object object0: this.a) {
            if(n0.j()) {
                break;
            }
            c y$c0 = new c(0L, n0, y$d0);
            y$d0.a.add(y$c0);
            c y$c1 = (c)y$d0.get();
            if(y$c1 != null) {
                y$d0.b(y$c1);
                return;
            }
            ((g)object0).N6(y$c0);
        }
        if(n0.j()) {
            y.t(y$d0.a);
        }
        n0.X(new b(this, y$d0));
    }

    static void t(Collection collection0) {
        if(!collection0.isEmpty()) {
            for(Object object0: collection0) {
                ((c)object0).l();
            }
            collection0.clear();
        }
    }
}

