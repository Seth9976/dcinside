package io.reactivex.internal.operators.flowable;

import e3.d;
import f3.b;
import f3.o;
import io.reactivex.K;
import io.reactivex.N;
import io.reactivex.disposables.c;
import io.reactivex.internal.subscriptions.j;
import io.reactivex.l;
import java.util.concurrent.atomic.AtomicInteger;

public final class q1 extends K implements b {
    static final class a extends AtomicInteger implements c, io.reactivex.internal.operators.flowable.p1.b {
        final N a;
        final d b;
        final io.reactivex.internal.operators.flowable.p1.c c;
        final io.reactivex.internal.operators.flowable.p1.c d;
        final io.reactivex.internal.util.c e;
        Object f;
        Object g;
        private static final long h = -6178010334400373240L;

        a(N n0, int v, d d0) {
            this.a = n0;
            this.b = d0;
            this.c = new io.reactivex.internal.operators.flowable.p1.c(this, v);
            this.d = new io.reactivex.internal.operators.flowable.p1.c(this, v);
            this.e = new io.reactivex.internal.util.c();
        }

        @Override  // io.reactivex.disposables.c
        public boolean a() {
            return this.c.get() == j.a;
        }

        void b() {
            this.c.a();
            this.c.b();
            this.d.a();
            this.d.b();
        }

        @Override  // io.reactivex.internal.operators.flowable.p1$b
        public void c(Throwable throwable0) {
            if(this.e.a(throwable0)) {
                this.d();
                return;
            }
            io.reactivex.plugins.a.Y(throwable0);
        }

        @Override  // io.reactivex.internal.operators.flowable.p1$b
        public void d() {
            if(this.getAndIncrement() != 0) {
                return;
            }
            int v = 1;
            do {
                o o0 = this.c.e;
                o o1 = this.d.e;
                if(o0 == null || o1 == null) {
                    if(this.a()) {
                        this.c.b();
                        this.d.b();
                        return;
                    }
                    if(((Throwable)this.e.get()) != null) {
                        this.b();
                        Throwable throwable7 = this.e.c();
                        this.a.onError(throwable7);
                        return;
                    }
                }
                else {
                    while(true) {
                        if(this.a()) {
                            this.c.b();
                            this.d.b();
                            return;
                        }
                        if(((Throwable)this.e.get()) != null) {
                            this.b();
                            Throwable throwable0 = this.e.c();
                            this.a.onError(throwable0);
                            return;
                        }
                        boolean z = this.c.f;
                        Object object0 = this.f;
                        if(object0 == null) {
                            try {
                                object0 = o0.poll();
                                this.f = object0;
                            }
                            catch(Throwable throwable1) {
                                io.reactivex.exceptions.b.b(throwable1);
                                this.b();
                                this.e.a(throwable1);
                                Throwable throwable2 = this.e.c();
                                this.a.onError(throwable2);
                                return;
                            }
                        }
                        int v1 = 0;
                        int v2 = object0 == null ? 1 : 0;
                        boolean z1 = this.d.f;
                        Object object1 = this.g;
                        if(object1 == null) {
                            try {
                                object1 = o1.poll();
                                this.g = object1;
                            }
                            catch(Throwable throwable3) {
                                io.reactivex.exceptions.b.b(throwable3);
                                this.b();
                                this.e.a(throwable3);
                                Throwable throwable4 = this.e.c();
                                this.a.onError(throwable4);
                                return;
                            }
                        }
                        if(object1 == null) {
                            v1 = 1;
                        }
                        if(z && z1 && v2 != 0 && v1 != 0) {
                            this.a.onSuccess(Boolean.TRUE);
                            return;
                        }
                        if(z && z1 && v2 != v1) {
                            this.b();
                            this.a.onSuccess(Boolean.FALSE);
                            return;
                        }
                        if(v2 != 0 || v1 != 0) {
                            break;
                        }
                        try {
                            if(!this.b.a(object0, object1)) {
                                goto label_62;
                            }
                            goto label_65;
                        }
                        catch(Throwable throwable5) {
                            io.reactivex.exceptions.b.b(throwable5);
                            this.b();
                            this.e.a(throwable5);
                            Throwable throwable6 = this.e.c();
                            this.a.onError(throwable6);
                            return;
                        }
                    label_62:
                        this.b();
                        this.a.onSuccess(Boolean.FALSE);
                        return;
                    label_65:
                        this.f = null;
                        this.g = null;
                        this.c.c();
                        this.d.c();
                    }
                }
                v = this.addAndGet(-v);
            }
            while(v != 0);
        }

        @Override  // io.reactivex.disposables.c
        public void dispose() {
            this.c.a();
            this.d.a();
            if(this.getAndIncrement() == 0) {
                this.c.b();
                this.d.b();
            }
        }

        void e(org.reactivestreams.c c0, org.reactivestreams.c c1) {
            c0.e(this.c);
            c1.e(this.d);
        }
    }

    final org.reactivestreams.c a;
    final org.reactivestreams.c b;
    final d c;
    final int d;

    public q1(org.reactivestreams.c c0, org.reactivestreams.c c1, d d0, int v) {
        this.a = c0;
        this.b = c1;
        this.c = d0;
        this.d = v;
    }

    @Override  // io.reactivex.K
    public void c1(N n0) {
        a q1$a0 = new a(n0, this.d, this.c);
        n0.b(q1$a0);
        q1$a0.e(this.a, this.b);
    }

    @Override  // f3.b
    public l d() {
        return io.reactivex.plugins.a.P(new p1(this.a, this.b, this.c, this.d));
    }
}

