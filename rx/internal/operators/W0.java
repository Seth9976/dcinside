package rx.internal.operators;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import rx.exceptions.d;
import rx.g.b;
import rx.i;
import rx.n;

public final class w0 implements b {
    static final class a extends n {
        final n f;
        final int g;
        List h;

        public a(n n0, int v) {
            this.f = n0;
            this.g = v;
            this.v(0L);
        }

        i Q() {
            class rx.internal.operators.w0.a.a implements i {
                final a a;

                @Override  // rx.i
                public void request(long v) {
                    int v1 = Long.compare(v, 0L);
                    if(v1 < 0) {
                        throw new IllegalArgumentException("n >= required but it was " + v);
                    }
                    if(v1 != 0) {
                        long v2 = rx.internal.operators.a.c(v, a.this.g);
                        a.this.v(v2);
                    }
                }
            }

            return new rx.internal.operators.w0.a.a(this);
        }

        @Override  // rx.h
        public void d() {
            List list0 = this.h;
            if(list0 != null) {
                this.f.onNext(list0);
            }
            this.f.d();
        }

        @Override  // rx.h
        public void onError(Throwable throwable0) {
            this.h = null;
            this.f.onError(throwable0);
        }

        @Override  // rx.h
        public void onNext(Object object0) {
            List list0 = this.h;
            if(list0 == null) {
                list0 = new ArrayList(this.g);
                this.h = list0;
            }
            list0.add(object0);
            if(list0.size() == this.g) {
                this.h = null;
                this.f.onNext(list0);
            }
        }
    }

    static final class rx.internal.operators.w0.b extends n {
        final class rx.internal.operators.w0.b.a extends AtomicBoolean implements i {
            final rx.internal.operators.w0.b a;
            private static final long b = 0xC844ACE906A44665L;

            @Override  // rx.i
            public void request(long v) {
                rx.internal.operators.w0.b w0$b0 = rx.internal.operators.w0.b.this;
                if(rx.internal.operators.a.g(w0$b0.k, v, w0$b0.j, w0$b0.f) && v != 0L) {
                    if(!this.get() && this.compareAndSet(false, true)) {
                        w0$b0.v(rx.internal.operators.a.a(rx.internal.operators.a.c(w0$b0.h, v - 1L), w0$b0.g));
                        return;
                    }
                    w0$b0.v(rx.internal.operators.a.c(w0$b0.h, v));
                }
            }
        }

        final n f;
        final int g;
        final int h;
        long i;
        final ArrayDeque j;
        final AtomicLong k;
        long l;

        public rx.internal.operators.w0.b(n n0, int v, int v1) {
            this.f = n0;
            this.g = v;
            this.h = v1;
            this.j = new ArrayDeque();
            this.k = new AtomicLong();
            this.v(0L);
        }

        i R() {
            return new rx.internal.operators.w0.b.a(this);
        }

        @Override  // rx.h
        public void d() {
            long v = this.l;
            if(v != 0L) {
                if(v > this.k.get()) {
                    d d0 = new d("More produced than requested? " + v);
                    this.f.onError(d0);
                    return;
                }
                this.k.addAndGet(-v);
            }
            rx.internal.operators.a.d(this.k, this.j, this.f);
        }

        @Override  // rx.h
        public void onError(Throwable throwable0) {
            this.j.clear();
            this.f.onError(throwable0);
        }

        @Override  // rx.h
        public void onNext(Object object0) {
            long v = this.i;
            if(v == 0L) {
                ArrayList arrayList0 = new ArrayList(this.g);
                this.j.offer(arrayList0);
            }
            this.i = v + 1L == ((long)this.h) ? 0L : v + 1L;
            for(Object object1: this.j) {
                ((List)object1).add(object0);
            }
            List list0 = (List)this.j.peek();
            if(list0 != null && list0.size() == this.g) {
                this.j.poll();
                ++this.l;
                this.f.onNext(list0);
            }
        }
    }

    static final class c extends n {
        final class rx.internal.operators.w0.c.a extends AtomicBoolean implements i {
            final c a;
            private static final long b = 0x2F9355307BC4D2B2L;

            @Override  // rx.i
            public void request(long v) {
                int v1 = Long.compare(v, 0L);
                if(v1 < 0) {
                    throw new IllegalArgumentException("n >= 0 required but it was " + v);
                }
                if(v1 != 0) {
                    c w0$c0 = c.this;
                    if(!this.get() && this.compareAndSet(false, true)) {
                        w0$c0.v(rx.internal.operators.a.a(rx.internal.operators.a.c(v, w0$c0.g), rx.internal.operators.a.c(w0$c0.h - w0$c0.g, v - 1L)));
                        return;
                    }
                    w0$c0.v(rx.internal.operators.a.c(v, w0$c0.h));
                }
            }
        }

        final n f;
        final int g;
        final int h;
        long i;
        List j;

        public c(n n0, int v, int v1) {
            this.f = n0;
            this.g = v;
            this.h = v1;
            this.v(0L);
        }

        i R() {
            return new rx.internal.operators.w0.c.a(this);
        }

        @Override  // rx.h
        public void d() {
            List list0 = this.j;
            if(list0 != null) {
                this.j = null;
                this.f.onNext(list0);
            }
            this.f.d();
        }

        @Override  // rx.h
        public void onError(Throwable throwable0) {
            this.j = null;
            this.f.onError(throwable0);
        }

        @Override  // rx.h
        public void onNext(Object object0) {
            long v = this.i;
            List list0 = this.j;
            if(v == 0L) {
                list0 = new ArrayList(this.g);
                this.j = list0;
            }
            this.i = v + 1L == ((long)this.h) ? 0L : v + 1L;
            if(list0 != null) {
                list0.add(object0);
                if(list0.size() == this.g) {
                    this.j = null;
                    this.f.onNext(list0);
                }
            }
        }
    }

    final int a;
    final int b;

    public w0(int v, int v1) {
        if(v <= 0) {
            throw new IllegalArgumentException("count must be greater than 0");
        }
        if(v1 <= 0) {
            throw new IllegalArgumentException("skip must be greater than 0");
        }
        this.a = v;
        this.b = v1;
    }

    public n a(n n0) {
        int v = this.b;
        int v1 = this.a;
        if(v == v1) {
            n n1 = new a(n0, v1);
            n0.q(n1);
            n0.X(((a)n1).Q());
            return n1;
        }
        if(v > v1) {
            n n2 = new c(n0, v1, v);
            n0.q(n2);
            n0.X(((c)n2).R());
            return n2;
        }
        n n3 = new rx.internal.operators.w0.b(n0, v1, v);
        n0.q(n3);
        n0.X(((rx.internal.operators.w0.b)n3).R());
        return n3;
    }

    @Override  // rx.functions.p
    public Object b(Object object0) {
        return this.a(((n)object0));
    }
}

