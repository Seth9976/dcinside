package rx.internal.operators;

import java.util.concurrent.atomic.AtomicInteger;
import rx.b.J;
import rx.b;
import rx.d;
import rx.o;

public final class l implements J {
    static final class a extends AtomicInteger implements d {
        final d a;
        final b[] b;
        int c;
        final F4.b d;
        private static final long e = -7965400327305809232L;

        public a(d d0, b[] arr_b) {
            this.a = d0;
            this.b = arr_b;
            this.d = new F4.b();
        }

        @Override  // rx.d
        public void a(o o0) {
            this.d.b(o0);
        }

        void b() {
            if(this.d.j()) {
                return;
            }
            if(this.getAndIncrement() != 0) {
                return;
            }
            b[] arr_b = this.b;
            do {
                if(this.d.j()) {
                    return;
                }
                int v = this.c;
                this.c = v + 1;
                if(v == arr_b.length) {
                    this.a.d();
                    return;
                }
                arr_b[v].G0(this);
            }
            while(this.decrementAndGet() != 0);
        }

        @Override  // rx.d
        public void d() {
            this.b();
        }

        @Override  // rx.d
        public void onError(Throwable throwable0) {
            this.a.onError(throwable0);
        }
    }

    final b[] a;

    public l(b[] arr_b) {
        this.a = arr_b;
    }

    public void a(d d0) {
        a l$a0 = new a(d0, this.a);
        d0.a(l$a0.d);
        l$a0.b();
    }

    @Override  // rx.functions.b
    public void b(Object object0) {
        this.a(((d)object0));
    }
}

