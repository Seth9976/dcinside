package rx.internal.operators;

import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import rx.exceptions.c;
import rx.functions.y;
import rx.k.t;
import rx.k;
import rx.m;
import rx.subscriptions.b;

public final class d2 {
    private d2() {
        throw new IllegalStateException("No instances!");
    }

    public static k a(k[] arr_k, y y0) {
        static final class a implements t {
            final k[] a;
            final y b;

            a(k[] arr_k, y y0) {
                this.a = arr_k;
                this.b = y0;
                super();
            }

            public void a(m m0) {
                class rx.internal.operators.d2.a.a extends m {
                    final Object[] b;
                    final int c;
                    final AtomicInteger d;
                    final m e;
                    final AtomicBoolean f;
                    final a g;

                    rx.internal.operators.d2.a.a(Object[] arr_object, int v, AtomicInteger atomicInteger0, m m0, AtomicBoolean atomicBoolean0) {
                        this.b = arr_object;
                        this.c = v;
                        this.d = atomicInteger0;
                        this.e = m0;
                        this.f = atomicBoolean0;
                        super();
                    }

                    @Override  // rx.m
                    public void e(Object object0) {
                        Object object1;
                        this.b[this.c] = object0;
                        if(this.d.decrementAndGet() == 0) {
                            try {
                                object1 = a.this.b.call(this.b);
                            }
                            catch(Throwable throwable0) {
                                c.e(throwable0);
                                this.onError(throwable0);
                                return;
                            }
                            this.e.e(object1);
                        }
                    }

                    @Override  // rx.m
                    public void onError(Throwable throwable0) {
                        if(this.f.compareAndSet(false, true)) {
                            this.e.onError(throwable0);
                            return;
                        }
                        rx.plugins.c.I(throwable0);
                    }
                }

                if(this.a.length == 0) {
                    m0.onError(new NoSuchElementException("Can\'t zip 0 Singles."));
                    return;
                }
                AtomicInteger atomicInteger0 = new AtomicInteger(this.a.length);
                AtomicBoolean atomicBoolean0 = new AtomicBoolean();
                Object[] arr_object = new Object[this.a.length];
                b b0 = new b();
                m0.c(b0);
                for(int v = 0; v < this.a.length && !b0.j() && !atomicBoolean0.get(); ++v) {
                    rx.internal.operators.d2.a.a d2$a$a0 = new rx.internal.operators.d2.a.a(this, arr_object, v, atomicInteger0, m0, atomicBoolean0);
                    b0.a(d2$a$a0);
                    if(b0.j() || atomicBoolean0.get()) {
                        break;
                    }
                    this.a[v].j0(d2$a$a0);
                }
            }

            @Override  // rx.functions.b
            public void b(Object object0) {
                this.a(((m)object0));
            }
        }

        return k.n(new a(arr_k, y0));
    }
}

