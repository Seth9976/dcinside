package rx.internal.operators;

import java.util.ArrayList;
import java.util.List;
import rx.functions.o;
import rx.g.b;
import rx.g;
import rx.n;
import rx.observers.h;

public final class v0 implements b {
    final class c extends n {
        final n f;
        List g;
        boolean h;
        final v0 i;

        public c(n n0) {
            this.f = n0;
            this.g = new ArrayList(v00.b);
        }

        @Override  // rx.h
        public void d() {
            List list0;
            try {
                synchronized(this) {
                    if(this.h) {
                        return;
                    }
                    this.h = true;
                    list0 = this.g;
                    this.g = null;
                }
                this.f.onNext(list0);
            }
            catch(Throwable throwable0) {
                rx.exceptions.c.f(throwable0, this.f);
                return;
            }
            this.f.d();
            this.l();
        }

        @Override  // rx.h
        public void onError(Throwable throwable0) {
            synchronized(this) {
                if(this.h) {
                    return;
                }
                this.h = true;
                this.g = null;
            }
            this.f.onError(throwable0);
            this.l();
        }

        @Override  // rx.h
        public void onNext(Object object0) {
            synchronized(this) {
                if(this.h) {
                    return;
                }
                this.g.add(object0);
            }
        }

        void x() {
            List list0;
            synchronized(this) {
                if(!this.h) {
                    list0 = this.g;
                    this.g = new ArrayList(v0.this.b);
                    goto label_8;
                }
                return;
            }
        label_8:
            try {
                this.f.onNext(list0);
            }
            catch(Throwable throwable1) {
                this.l();
                synchronized(this) {
                    if(this.h) {
                        return;
                    }
                    this.h = true;
                }
                rx.exceptions.c.f(throwable1, this.f);
            }
        }
    }

    final o a;
    final int b;

    public v0(o o0, int v) {
        this.a = o0;
        this.b = v;
    }

    public v0(g g0, int v) {
        class a implements o {
            final g a;
            final v0 b;

            a(g g0) {
                this.a = g0;
                super();
            }

            public g a() {
                return this.a;
            }

            @Override  // rx.functions.o
            public Object call() {
                return this.a();
            }
        }

        this.a = new a(this, g0);
        this.b = v;
    }

    public n a(n n0) {
        class rx.internal.operators.v0.b extends n {
            final c f;
            final v0 g;

            rx.internal.operators.v0.b(c v0$c0) {
                this.f = v0$c0;
                super();
            }

            @Override  // rx.h
            public void d() {
                this.f.d();
            }

            @Override  // rx.h
            public void onError(Throwable throwable0) {
                this.f.onError(throwable0);
            }

            @Override  // rx.h
            public void onNext(Object object0) {
                this.f.x();
            }
        }

        g g0;
        try {
            g0 = (g)this.a.call();
        }
        catch(Throwable throwable0) {
            rx.exceptions.c.f(throwable0, n0);
            return h.d();
        }
        n n1 = new c(this, new rx.observers.g(n0));
        rx.internal.operators.v0.b v0$b0 = new rx.internal.operators.v0.b(this, ((c)n1));
        n0.q(v0$b0);
        n0.q(n1);
        g0.N6(v0$b0);
        return n1;
    }

    @Override  // rx.functions.p
    public Object b(Object object0) {
        return this.a(((n)object0));
    }
}

