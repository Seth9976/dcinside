package rx.internal.operators;

import F4.b;
import java.util.concurrent.atomic.AtomicBoolean;
import rx.b.J;
import rx.c;
import rx.d;
import rx.functions.n;
import rx.o;

public final class j implements J {
    static final class a extends AtomicBoolean implements c, o {
        final d a;
        final b b;
        private static final long c = 0x4CDF8D3365236ED1L;

        public a(d d0) {
            this.a = d0;
            this.b = new b();
        }

        @Override  // rx.c
        public void a(n n0) {
            this.c(new F4.a(n0));
        }

        @Override  // rx.c
        public void c(o o0) {
            this.b.d(o0);
        }

        @Override  // rx.c
        public void d() {
            if(this.compareAndSet(false, true)) {
                try {
                    this.a.d();
                }
                finally {
                    this.b.l();
                }
            }
        }

        @Override  // rx.o
        public boolean j() {
            return this.get();
        }

        @Override  // rx.o
        public void l() {
            if(this.compareAndSet(false, true)) {
                this.b.l();
            }
        }

        @Override  // rx.c
        public void onError(Throwable throwable0) {
            if(this.compareAndSet(false, true)) {
                try {
                    this.a.onError(throwable0);
                }
                finally {
                    this.b.l();
                }
                return;
            }
            rx.plugins.c.I(throwable0);
        }
    }

    final rx.functions.b a;

    public j(rx.functions.b b0) {
        this.a = b0;
    }

    public void a(d d0) {
        a j$a0 = new a(d0);
        d0.a(j$a0);
        try {
            this.a.b(j$a0);
        }
        catch(Throwable throwable0) {
            rx.exceptions.c.e(throwable0);
            j$a0.onError(throwable0);
        }
    }

    @Override  // rx.functions.b
    public void b(Object object0) {
        this.a(((d)object0));
    }
}

