package io.reactivex.internal.operators.observable;

import e3.d;
import io.reactivex.B;
import io.reactivex.G;
import io.reactivex.I;
import io.reactivex.disposables.c;
import java.util.concurrent.atomic.AtomicInteger;

public final class d1 extends B {
    static final class a extends AtomicInteger implements c {
        final I a;
        final d b;
        final io.reactivex.internal.disposables.a c;
        final G d;
        final G e;
        final b[] f;
        volatile boolean g;
        Object h;
        Object i;
        private static final long j = -6178010334400373240L;

        a(I i0, int v, G g0, G g1, d d0) {
            this.a = i0;
            this.d = g0;
            this.e = g1;
            this.b = d0;
            b[] arr_d1$b = new b[2];
            this.f = arr_d1$b;
            arr_d1$b[0] = new b(this, 0, v);
            arr_d1$b[1] = new b(this, 1, v);
            this.c = new io.reactivex.internal.disposables.a(2);
        }

        @Override  // io.reactivex.disposables.c
        public boolean a() {
            return this.g;
        }

        void b(io.reactivex.internal.queue.c c0, io.reactivex.internal.queue.c c1) {
            this.g = true;
            c0.clear();
            c1.clear();
        }

        void c() {
            if(this.getAndIncrement() != 0) {
                return;
            }
            b d1$b0 = this.f[0];
            io.reactivex.internal.queue.c c0 = d1$b0.b;
            b d1$b1 = this.f[1];
            io.reactivex.internal.queue.c c1 = d1$b1.b;
            int v = 1;
            while(true) {
                if(this.g) {
                    c0.clear();
                    c1.clear();
                    return;
                }
                boolean z = d1$b0.d;
                if(z) {
                    Throwable throwable0 = d1$b0.e;
                    if(throwable0 != null) {
                        this.b(c0, c1);
                        this.a.onError(throwable0);
                        return;
                    }
                }
                boolean z1 = d1$b1.d;
                if(z1) {
                    Throwable throwable1 = d1$b1.e;
                    if(throwable1 != null) {
                        this.b(c0, c1);
                        this.a.onError(throwable1);
                        return;
                    }
                }
                if(this.h == null) {
                    this.h = c0.poll();
                }
                int v1 = this.h == null ? 1 : 0;
                if(this.i == null) {
                    this.i = c1.poll();
                }
                Object object0 = this.i;
                int v2 = object0 == null ? 1 : 0;
                if(z && z1 && v1 != 0 && v2 != 0) {
                    this.a.onNext(Boolean.TRUE);
                    this.a.onComplete();
                    return;
                }
                if(z && z1 && v1 != v2) {
                    this.b(c0, c1);
                    this.a.onNext(Boolean.FALSE);
                    this.a.onComplete();
                    return;
                }
                if(v1 == 0 && v2 == 0) {
                    try {
                        if(!this.b.a(this.h, object0)) {
                            goto label_49;
                        }
                        goto label_53;
                    }
                    catch(Throwable throwable2) {
                        io.reactivex.exceptions.b.b(throwable2);
                        this.b(c0, c1);
                        this.a.onError(throwable2);
                        return;
                    }
                label_49:
                    this.b(c0, c1);
                    this.a.onNext(Boolean.FALSE);
                    this.a.onComplete();
                    return;
                label_53:
                    this.h = null;
                    this.i = null;
                }
                if(v1 != 0 || v2 != 0) {
                    v = this.addAndGet(-v);
                    if(v == 0) {
                        break;
                    }
                }
            }
        }

        boolean d(c c0, int v) {
            return this.c.c(v, c0);
        }

        @Override  // io.reactivex.disposables.c
        public void dispose() {
            if(!this.g) {
                this.g = true;
                this.c.dispose();
                if(this.getAndIncrement() == 0) {
                    this.f[0].b.clear();
                    this.f[1].b.clear();
                }
            }
        }

        void e() {
            this.d.d(this.f[0]);
            this.e.d(this.f[1]);
        }
    }

    static final class b implements I {
        final a a;
        final io.reactivex.internal.queue.c b;
        final int c;
        volatile boolean d;
        Throwable e;

        b(a d1$a0, int v, int v1) {
            this.a = d1$a0;
            this.c = v;
            this.b = new io.reactivex.internal.queue.c(v1);
        }

        @Override  // io.reactivex.I
        public void b(c c0) {
            this.a.d(c0, this.c);
        }

        @Override  // io.reactivex.I
        public void onComplete() {
            this.d = true;
            this.a.c();
        }

        @Override  // io.reactivex.I
        public void onError(Throwable throwable0) {
            this.e = throwable0;
            this.d = true;
            this.a.c();
        }

        @Override  // io.reactivex.I
        public void onNext(Object object0) {
            this.b.offer(object0);
            this.a.c();
        }
    }

    final G a;
    final G b;
    final d c;
    final int d;

    public d1(G g0, G g1, d d0, int v) {
        this.a = g0;
        this.b = g1;
        this.c = d0;
        this.d = v;
    }

    @Override  // io.reactivex.B
    public void I5(I i0) {
        a d1$a0 = new a(i0, this.d, this.a, this.b, this.c);
        i0.b(d1$a0);
        d1$a0.e();
    }
}

