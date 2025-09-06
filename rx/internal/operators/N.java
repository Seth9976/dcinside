package rx.internal.operators;

import java.util.ArrayList;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import rx.b.J;
import rx.d;
import rx.g;
import rx.o;
import rx.plugins.c;
import rx.subscriptions.b;

public final class n implements J {
    static final class a extends rx.n {
        final d f;
        final b g;
        final boolean h;
        volatile boolean i;
        final AtomicReference j;
        final AtomicBoolean k;
        final AtomicInteger l;

        public a(d d0, int v, boolean z) {
            this.f = d0;
            this.h = z;
            this.g = new b();
            this.l = new AtomicInteger(1);
            this.k = new AtomicBoolean();
            this.j = new AtomicReference();
            if(v == 0x7FFFFFFF) {
                this.v(0x7FFFFFFFFFFFFFFFL);
                return;
            }
            this.v(((long)v));
        }

        Queue R() {
            Queue queue0 = (Queue)this.j.get();
            if(queue0 != null) {
                return queue0;
            }
            Queue queue1 = new ConcurrentLinkedQueue();
            return androidx.compose.animation.core.d.a(this.j, null, queue1) ? queue1 : ((Queue)this.j.get());
        }

        public void T(rx.b b0) {
            class rx.internal.operators.n.a.a implements d {
                o a;
                boolean b;
                final a c;

                @Override  // rx.d
                public void a(o o0) {
                    this.a = o0;
                    a.this.g.a(o0);
                }

                @Override  // rx.d
                public void d() {
                    if(this.b) {
                        return;
                    }
                    this.b = true;
                    a.this.g.e(this.a);
                    a.this.Y();
                    if(!a.this.i) {
                        a.this.v(1L);
                    }
                }

                @Override  // rx.d
                public void onError(Throwable throwable0) {
                    if(this.b) {
                        c.I(throwable0);
                        return;
                    }
                    this.b = true;
                    a.this.g.e(this.a);
                    a.this.R().offer(throwable0);
                    a.this.Y();
                    if(a.this.h && !a.this.i) {
                        a.this.v(1L);
                    }
                }
            }

            if(this.i) {
                return;
            }
            this.l.getAndIncrement();
            b0.G0(new rx.internal.operators.n.a.a(this));
        }

        void Y() {
            if(this.l.decrementAndGet() == 0) {
                Queue queue0 = (Queue)this.j.get();
                if(queue0 != null && !queue0.isEmpty()) {
                    Throwable throwable0 = n.c(queue0);
                    if(this.k.compareAndSet(false, true)) {
                        this.f.onError(throwable0);
                        return;
                    }
                    c.I(throwable0);
                    return;
                }
                this.f.d();
                return;
            }
            if(!this.h) {
                Queue queue1 = (Queue)this.j.get();
                if(queue1 != null && !queue1.isEmpty()) {
                    Throwable throwable1 = n.c(queue1);
                    if(this.k.compareAndSet(false, true)) {
                        this.f.onError(throwable1);
                        return;
                    }
                    c.I(throwable1);
                }
            }
        }

        @Override  // rx.h
        public void d() {
            if(this.i) {
                return;
            }
            this.i = true;
            this.Y();
        }

        @Override  // rx.h
        public void onError(Throwable throwable0) {
            if(this.i) {
                c.I(throwable0);
                return;
            }
            this.R().offer(throwable0);
            this.i = true;
            this.Y();
        }

        @Override  // rx.h
        public void onNext(Object object0) {
            this.T(((rx.b)object0));
        }
    }

    final g a;
    final int b;
    final boolean c;

    public n(g g0, int v, boolean z) {
        this.a = g0;
        this.b = v;
        this.c = z;
    }

    public void a(d d0) {
        a n$a0 = new a(d0, this.b, this.c);
        d0.a(n$a0);
        this.a.N6(n$a0);
    }

    @Override  // rx.functions.b
    public void b(Object object0) {
        this.a(((d)object0));
    }

    public static Throwable c(Queue queue0) {
        ArrayList arrayList0 = new ArrayList();
        Throwable throwable0;
        while((throwable0 = (Throwable)queue0.poll()) != null) {
            arrayList0.add(throwable0);
        }
        if(arrayList0.isEmpty()) {
            return null;
        }
        return arrayList0.size() == 1 ? ((Throwable)arrayList0.get(0)) : new rx.exceptions.b(arrayList0);
    }
}

