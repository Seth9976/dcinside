package rx.internal.operators;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Map;
import rx.exceptions.c;
import rx.functions.p;
import rx.functions.q;
import rx.g.a;
import rx.g;
import rx.n;
import rx.o;
import rx.subscriptions.e;

public final class T implements a {
    final class rx.internal.operators.T.a extends HashMap {
        final class rx.internal.operators.T.a.a extends n {
            final class rx.internal.operators.T.a.a.a extends n {
                final int f;
                boolean g;
                final rx.internal.operators.T.a.a h;

                public rx.internal.operators.T.a.a.a(int v) {
                    this.g = true;
                    this.f = v;
                }

                @Override  // rx.h
                public void d() {
                    if(this.g) {
                        this.g = false;
                        rx.internal.operators.T.a.a.this.x(this.f, this);
                    }
                }

                @Override  // rx.h
                public void onError(Throwable throwable0) {
                    rx.internal.operators.T.a.a.this.onError(throwable0);
                }

                @Override  // rx.h
                public void onNext(Object object0) {
                    this.d();
                }
            }

            final rx.internal.operators.T.a f;

            @Override  // rx.h
            public void d() {
                synchronized(rx.internal.operators.T.a.this) {
                    boolean z = true;
                    rx.internal.operators.T.a.this.c = true;
                    if(!rx.internal.operators.T.a.this.e && !rx.internal.operators.T.a.this.isEmpty()) {
                        z = false;
                    }
                }
                if(z) {
                    rx.internal.operators.T.a.this.b.d();
                    rx.internal.operators.T.a.this.b.l();
                    return;
                }
                rx.internal.operators.T.a.this.a.e(this);
            }

            @Override  // rx.h
            public void onError(Throwable throwable0) {
                rx.internal.operators.T.a.this.b.onError(throwable0);
                rx.internal.operators.T.a.this.b.l();
            }

            @Override  // rx.h
            public void onNext(Object object0) {
                int v1;
                synchronized(rx.internal.operators.T.a.this) {
                    v1 = rx.internal.operators.T.a.this.d;
                    rx.internal.operators.T.a.this.d = v1 + 1;
                    rx.internal.operators.T.a.this.put(v1, object0);
                    int v2 = rx.internal.operators.T.a.this.f;
                }
                try {
                    g g0 = (g)T.this.c.b(object0);
                    rx.internal.operators.T.a.a.a t$a$a$a0 = new rx.internal.operators.T.a.a.a(this, v1);
                    rx.internal.operators.T.a.this.a.a(t$a$a$a0);
                    g0.N6(t$a$a$a0);
                    ArrayList arrayList0 = new ArrayList();
                    synchronized(rx.internal.operators.T.a.this) {
                        for(Object object1: rx.internal.operators.T.a.this.g.entrySet()) {
                            Map.Entry map$Entry0 = (Map.Entry)object1;
                            if(((int)(((Integer)map$Entry0.getKey()))) < v2) {
                                arrayList0.add(map$Entry0.getValue());
                            }
                        }
                    }
                    for(Object object2: arrayList0) {
                        Object object3 = T.this.e.p(object0, object2);
                        rx.internal.operators.T.a.this.b.onNext(object3);
                    }
                }
                catch(Throwable throwable0) {
                    c.f(throwable0, this);
                }
            }

            protected void x(int v, o o0) {
                synchronized(rx.internal.operators.T.a.this) {
                    boolean z = rx.internal.operators.T.a.this.remove(v) != null && rx.internal.operators.T.a.this.isEmpty() && rx.internal.operators.T.a.this.c;
                }
                if(z) {
                    rx.internal.operators.T.a.this.b.d();
                    rx.internal.operators.T.a.this.b.l();
                    return;
                }
                rx.internal.operators.T.a.this.a.e(o0);
            }
        }

        final class b extends n {
            final class rx.internal.operators.T.a.b.a extends n {
                final int f;
                boolean g;
                final b h;

                public rx.internal.operators.T.a.b.a(int v) {
                    this.g = true;
                    this.f = v;
                }

                @Override  // rx.h
                public void d() {
                    if(this.g) {
                        this.g = false;
                        b.this.x(this.f, this);
                    }
                }

                @Override  // rx.h
                public void onError(Throwable throwable0) {
                    b.this.onError(throwable0);
                }

                @Override  // rx.h
                public void onNext(Object object0) {
                    this.d();
                }
            }

            final rx.internal.operators.T.a f;

            @Override  // rx.h
            public void d() {
                synchronized(rx.internal.operators.T.a.this) {
                    boolean z = true;
                    rx.internal.operators.T.a.this.e = true;
                    if(!rx.internal.operators.T.a.this.c && !rx.internal.operators.T.a.this.g.isEmpty()) {
                        z = false;
                    }
                }
                if(z) {
                    rx.internal.operators.T.a.this.b.d();
                    rx.internal.operators.T.a.this.b.l();
                    return;
                }
                rx.internal.operators.T.a.this.a.e(this);
            }

            @Override  // rx.h
            public void onError(Throwable throwable0) {
                rx.internal.operators.T.a.this.b.onError(throwable0);
                rx.internal.operators.T.a.this.b.l();
            }

            @Override  // rx.h
            public void onNext(Object object0) {
                int v1;
                synchronized(rx.internal.operators.T.a.this) {
                    v1 = rx.internal.operators.T.a.this.f;
                    rx.internal.operators.T.a.this.f = v1 + 1;
                    rx.internal.operators.T.a.this.g.put(v1, object0);
                    int v2 = rx.internal.operators.T.a.this.d;
                }
                e e0 = new e();
                rx.internal.operators.T.a.this.a.a(e0);
                try {
                    g g0 = (g)T.this.d.b(object0);
                    rx.internal.operators.T.a.b.a t$a$b$a0 = new rx.internal.operators.T.a.b.a(this, v1);
                    rx.internal.operators.T.a.this.a.a(t$a$b$a0);
                    g0.N6(t$a$b$a0);
                    ArrayList arrayList0 = new ArrayList();
                    synchronized(rx.internal.operators.T.a.this) {
                        for(Object object1: rx.internal.operators.T.a.this.entrySet()) {
                            Map.Entry map$Entry0 = (Map.Entry)object1;
                            if(((int)(((Integer)map$Entry0.getKey()))) < v2) {
                                arrayList0.add(map$Entry0.getValue());
                            }
                        }
                    }
                    for(Object object2: arrayList0) {
                        Object object3 = T.this.e.p(object2, object0);
                        rx.internal.operators.T.a.this.b.onNext(object3);
                    }
                }
                catch(Throwable throwable0) {
                    c.f(throwable0, this);
                }
            }

            void x(int v, o o0) {
                synchronized(rx.internal.operators.T.a.this) {
                    boolean z = rx.internal.operators.T.a.this.g.remove(v) != null && rx.internal.operators.T.a.this.g.isEmpty() && rx.internal.operators.T.a.this.e;
                }
                if(z) {
                    rx.internal.operators.T.a.this.b.d();
                    rx.internal.operators.T.a.this.b.l();
                    return;
                }
                rx.internal.operators.T.a.this.a.e(o0);
            }
        }

        final rx.subscriptions.b a;
        final n b;
        boolean c;
        int d;
        boolean e;
        int f;
        final Map g;
        final T h;
        private static final long i = 0x3074E6F3404B26C4L;

        public rx.internal.operators.T.a(n n0) {
            this.b = n0;
            this.a = new rx.subscriptions.b();
            this.g = new HashMap();
        }

        HashMap a() [...] // Inlined contents

        public void b() {
            this.b.q(this.a);
            rx.internal.operators.T.a.a t$a$a0 = new rx.internal.operators.T.a.a(this);
            b t$a$b0 = new b(this);
            this.a.a(t$a$a0);
            this.a.a(t$a$b0);
            T.this.a.N6(t$a$a0);
            T.this.b.N6(t$a$b0);
        }
    }

    final g a;
    final g b;
    final p c;
    final p d;
    final q e;

    public T(g g0, g g1, p p0, p p1, q q0) {
        this.a = g0;
        this.b = g1;
        this.c = p0;
        this.d = p1;
        this.e = q0;
    }

    public void a(n n0) {
        new rx.internal.operators.T.a(this, new rx.observers.g(n0)).b();
    }

    @Override  // rx.functions.b
    public void b(Object object0) {
        this.a(((n)object0));
    }
}

