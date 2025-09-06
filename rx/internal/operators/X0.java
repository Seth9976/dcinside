package rx.internal.operators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import rx.exceptions.c;
import rx.functions.p;
import rx.g.b;
import rx.g;
import rx.n;

public final class x0 implements b {
    final class rx.internal.operators.x0.b extends n {
        final n f;
        final List g;
        boolean h;
        final rx.subscriptions.b i;
        final x0 j;

        public rx.internal.operators.x0.b(n n0) {
            this.f = n0;
            this.g = new LinkedList();
            rx.subscriptions.b b0 = new rx.subscriptions.b();
            this.i = b0;
            this.q(b0);
        }

        void Q(Object object0) {
            class a extends n {
                final List f;
                final rx.internal.operators.x0.b g;

                a(List list0) {
                    this.f = list0;
                    super();
                }

                @Override  // rx.h
                public void d() {
                    rx.internal.operators.x0.b.this.i.e(this);
                    rx.internal.operators.x0.b.this.x(this.f);
                }

                @Override  // rx.h
                public void onError(Throwable throwable0) {
                    rx.internal.operators.x0.b.this.onError(throwable0);
                }

                @Override  // rx.h
                public void onNext(Object object0) {
                    rx.internal.operators.x0.b.this.i.e(this);
                    rx.internal.operators.x0.b.this.x(this.f);
                }
            }

            g g0;
            ArrayList arrayList0 = new ArrayList();
            synchronized(this) {
                if(this.h) {
                    return;
                }
                this.g.add(arrayList0);
            }
            try {
                g0 = (g)x0.this.b.b(object0);
            }
            catch(Throwable throwable0) {
                c.f(throwable0, this);
                return;
            }
            a x0$b$a0 = new a(this, arrayList0);
            this.i.a(x0$b$a0);
            g0.N6(x0$b$a0);
        }

        @Override  // rx.h
        public void d() {
            try {
                synchronized(this) {
                    if(this.h) {
                        return;
                    }
                    this.h = true;
                    LinkedList linkedList0 = new LinkedList(this.g);
                    this.g.clear();
                }
                for(Object object0: linkedList0) {
                    this.f.onNext(((List)object0));
                }
            }
            catch(Throwable throwable0) {
                c.f(throwable0, this.f);
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
                this.g.clear();
            }
            this.f.onError(throwable0);
            this.l();
        }

        @Override  // rx.h
        public void onNext(Object object0) {
            synchronized(this) {
                for(Object object1: this.g) {
                    ((List)object1).add(object0);
                }
            }
        }

        void x(List list0) {
            synchronized(this) {
                if(this.h) {
                    return;
                }
                boolean z = false;
                Iterator iterator0 = this.g.iterator();
                while(iterator0.hasNext()) {
                    Object object0 = iterator0.next();
                    if(((List)object0) == list0) {
                        iterator0.remove();
                        z = true;
                        break;
                    }
                }
            }
            if(z) {
                this.f.onNext(list0);
            }
        }
    }

    final g a;
    final p b;

    public x0(g g0, p p0) {
        this.a = g0;
        this.b = p0;
    }

    public n a(n n0) {
        class rx.internal.operators.x0.a extends n {
            final rx.internal.operators.x0.b f;
            final x0 g;

            rx.internal.operators.x0.a(rx.internal.operators.x0.b x0$b0) {
                this.f = x0$b0;
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
                this.f.Q(object0);
            }
        }

        n n1 = new rx.internal.operators.x0.b(this, new rx.observers.g(n0));
        rx.internal.operators.x0.a x0$a0 = new rx.internal.operators.x0.a(this, ((rx.internal.operators.x0.b)n1));
        n0.q(x0$a0);
        n0.q(n1);
        this.a.N6(x0$a0);
        return n1;
    }

    @Override  // rx.functions.p
    public Object b(Object object0) {
        return this.a(((n)object0));
    }
}

