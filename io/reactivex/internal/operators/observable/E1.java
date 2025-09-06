package io.reactivex.internal.operators.observable;

import f3.d;
import io.reactivex.B;
import io.reactivex.G;
import io.reactivex.I;
import io.reactivex.K;
import io.reactivex.N;
import io.reactivex.disposables.c;
import java.util.concurrent.atomic.AtomicInteger;

public final class e1 extends K implements d {
    static final class a extends AtomicInteger implements c {
        final N a;
        final e3.d b;
        final io.reactivex.internal.disposables.a c;
        final G d;
        final G e;
        final b[] f;
        volatile boolean g;
        Object h;
        Object i;
        private static final long j = -6178010334400373240L;

        a(N n0, int v, G g0, G g1, e3.d d0) {
            this.a = n0;
            this.d = g0;
            this.e = g1;
            this.b = d0;
            b[] arr_e1$b = new b[2];
            this.f = arr_e1$b;
            arr_e1$b[0] = new b(this, 0, v);
            arr_e1$b[1] = new b(this, 1, v);
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
            b e1$b0 = this.f[0];
            io.reactivex.internal.queue.c c0 = e1$b0.b;
            b e1$b1 = this.f[1];
            io.reactivex.internal.queue.c c1 = e1$b1.b;
            int v = 1;
            while(true) {
                if(this.g) {
                    c0.clear();
                    c1.clear();
                    return;
                }
                boolean z = e1$b0.d;
                if(z) {
                    Throwable throwable0 = e1$b0.e;
                    if(throwable0 != null) {
                        this.b(c0, c1);
                        this.a.onError(throwable0);
                        return;
                    }
                }
                boolean z1 = e1$b1.d;
                if(z1) {
                    Throwable throwable1 = e1$b1.e;
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
                    this.a.onSuccess(Boolean.TRUE);
                    return;
                }
                if(z && z1 && v1 != v2) {
                    this.b(c0, c1);
                    this.a.onSuccess(Boolean.FALSE);
                    return;
                }
                if(v1 == 0 && v2 == 0) {
                    try {
                        if(!this.b.a(this.h, object0)) {
                            goto label_47;
                        }
                        goto label_50;
                    }
                    catch(Throwable throwable2) {
                        io.reactivex.exceptions.b.b(throwable2);
                        this.b(c0, c1);
                        this.a.onError(throwable2);
                        return;
                    }
                label_47:
                    this.b(c0, c1);
                    this.a.onSuccess(Boolean.FALSE);
                    return;
                label_50:
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

        b(a e1$a0, int v, int v1) {
            this.a = e1$a0;
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
    final e3.d c;
    final int d;

    public e1(G g0, G g1, e3.d d0, int v) {
        this.a = g0;
        this.b = g1;
        this.c = d0;
        this.d = v;
    }

    @Override  // f3.d
    public B c() {
        return io.reactivex.plugins.a.R(new d1(this.a, this.b, this.c, this.d));
    }

    @Override  // io.reactivex.K
    public void c1(N n0) {
        a e1$a0 = new a(n0, this.d, this.a, this.b, this.c);
        n0.b(e1$a0);
        e1$a0.e();
    }
}

