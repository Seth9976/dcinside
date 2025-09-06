package rx.internal.operators;

import java.util.concurrent.atomic.AtomicLong;
import rx.g.b;
import rx.i;
import rx.n;
import rx.plugins.c;

public final class q1 implements b {
    final int a;

    public q1(int v) {
        if(v < 0) {
            throw new IllegalArgumentException("limit >= 0 required but it was " + v);
        }
        this.a = v;
    }

    public n a(n n0) {
        class a extends n {
            int f;
            boolean g;
            final n h;
            final q1 i;

            a(n n0) {
                this.h = n0;
                super();
            }

            @Override  // rx.n
            public void X(i i0) {
                class rx.internal.operators.q1.a.a implements i {
                    final AtomicLong a;
                    final i b;
                    final a c;

                    rx.internal.operators.q1.a.a(i i0) {
                        this.b = i0;
                        super();
                        this.a = new AtomicLong(0L);
                    }

                    @Override  // rx.i
                    public void request(long v) {
                        if(v > 0L && !a.this.g) {
                            while(true) {
                                long v1 = this.a.get();
                                long v2 = Math.min(v, ((long)q1.this.a) - v1);
                                if(v2 == 0L) {
                                    break;
                                }
                                if(this.a.compareAndSet(v1, v1 + v2)) {
                                    this.b.request(v2);
                                    return;
                                }
                            }
                        }
                    }
                }

                rx.internal.operators.q1.a.a q1$a$a0 = new rx.internal.operators.q1.a.a(this, i0);
                this.h.X(q1$a$a0);
            }

            @Override  // rx.h
            public void d() {
                if(!this.g) {
                    this.g = true;
                    this.h.d();
                }
            }

            @Override  // rx.h
            public void onError(Throwable throwable0) {
                if(!this.g) {
                    try {
                        this.g = true;
                        this.h.onError(throwable0);
                    }
                    finally {
                        this.l();
                    }
                    return;
                }
                c.I(throwable0);
            }

            @Override  // rx.h
            public void onNext(Object object0) {
                if(!this.j()) {
                    int v = this.f;
                    this.f = v + 1;
                    int v1 = q1.this.a;
                    if(v < v1) {
                        this.h.onNext(object0);
                        if(v + 1 == v1 && !this.g) {
                            try {
                                this.g = true;
                                this.h.d();
                            }
                            finally {
                                this.l();
                            }
                        }
                    }
                }
            }
        }

        n n1 = new a(this, n0);
        if(this.a == 0) {
            n0.d();
            n1.l();
        }
        n0.q(n1);
        return n1;
    }

    @Override  // rx.functions.p
    public Object b(Object object0) {
        return this.a(((n)object0));
    }
}

