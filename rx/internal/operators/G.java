package rx.internal.operators;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicReference;
import jeb.synthetic.FIN;
import rx.h;
import rx.n;
import rx.subjects.f;

public final class g extends f {
    static final class a implements h {
        @Override  // rx.h
        public void d() {
        }

        @Override  // rx.h
        public void onError(Throwable throwable0) {
        }

        @Override  // rx.h
        public void onNext(Object object0) {
        }
    }

    static final class b implements rx.g.a {
        final c a;

        public b(c g$c0) {
            this.a = g$c0;
        }

        public void a(n n0) {
            class rx.internal.operators.g.b.a implements rx.functions.a {
                final b a;

                @Override  // rx.functions.a
                public void call() {
                    b.this.a.set(g.d);
                }
            }

            int v;
            boolean z;
            if(this.a.a(null, n0)) {
                n0.q(rx.subscriptions.f.a(new rx.internal.operators.g.b.a(this)));
                synchronized(this.a.a) {
                    c g$c0 = this.a;
                    if(g$c0.b) {
                        z = false;
                    }
                    else {
                        z = true;
                        g$c0.b = true;
                    }
                }
                if(z) {
                    while(true) {
                        Object object1 = this.a.c.poll();
                        if(object1 == null) {
                            Object object2 = this.a.a;
                            synchronized(object2) {
                                v = FIN.finallyOpen$NT();
                                if(this.a.c.isEmpty()) {
                                    break;
                                }
                                FIN.finallyCodeBegin$NT(v);
                            }
                            FIN.finallyCodeEnd$NT(v);
                        }
                        else {
                            x.a(((h)this.a.get()), object1);
                        }
                    }
                    this.a.b = false;
                    FIN.finallyExec$NT(v);
                }
            }
            else {
                n0.onError(new IllegalStateException("Only one subscriber allowed!"));
            }
        }

        @Override  // rx.functions.b
        public void b(Object object0) {
            this.a(((n)object0));
        }
    }

    static final class c extends AtomicReference {
        final Object a;
        boolean b;
        final ConcurrentLinkedQueue c;
        private static final long d = 8026705089538090368L;

        c() {
            this.a = new Object();
            this.c = new ConcurrentLinkedQueue();
        }

        boolean a(h h0, h h1) {
            return this.compareAndSet(h0, h1);
        }
    }

    final c b;
    private boolean c;
    static final h d;

    static {
        g.d = new a();
    }

    private g(c g$c0) {
        super(new b(g$c0));
        this.b = g$c0;
    }

    @Override  // rx.subjects.f
    public boolean A7() {
        synchronized(this.b.a) {
            return this.b.get() != null;
        }
    }

    public static g C7() {
        return new g(new c());
    }

    private void D7(Object object0) {
        synchronized(this.b.a) {
            this.b.c.add(object0);
            if(this.b.get() != null) {
                c g$c0 = this.b;
                if(!g$c0.b) {
                    this.c = true;
                    g$c0.b = true;
                }
            }
        }
        if(this.c) {
            Object object2;
            while((object2 = this.b.c.poll()) != null) {
                x.a(((h)this.b.get()), object2);
            }
        }
    }

    @Override  // rx.h
    public void d() {
        if(this.c) {
            ((h)this.b.get()).d();
            return;
        }
        this.D7(x.b());
    }

    @Override  // rx.h
    public void onError(Throwable throwable0) {
        if(this.c) {
            ((h)this.b.get()).onError(throwable0);
            return;
        }
        this.D7(x.c(throwable0));
    }

    @Override  // rx.h
    public void onNext(Object object0) {
        if(this.c) {
            ((h)this.b.get()).onNext(object0);
            return;
        }
        this.D7(x.j(object0));
    }
}

