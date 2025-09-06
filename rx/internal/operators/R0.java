package rx.internal.operators;

import java.util.concurrent.atomic.AtomicBoolean;
import rx.exceptions.c;
import rx.functions.b;
import rx.functions.p;
import rx.g.a;
import rx.g;
import rx.n;
import rx.o;
import rx.observers.h;

public final class r0 implements a {
    static final class rx.internal.operators.r0.a extends AtomicBoolean implements rx.functions.a, o {
        private b a;
        private Object b;
        private static final long c = 4262875056400218316L;

        rx.internal.operators.r0.a(b b0, Object object0) {
            this.a = b0;
            this.b = object0;
            this.lazySet(false);
        }

        @Override  // rx.functions.a
        public void call() {
            if(this.compareAndSet(false, true)) {
                try {
                    this.a.b(this.b);
                    this.b = null;
                    this.a = null;
                }
                catch(Throwable throwable0) {
                    this.b = null;
                    this.a = null;
                    throw throwable0;
                }
            }
        }

        @Override  // rx.o
        public boolean j() {
            return this.get();
        }

        @Override  // rx.o
        public void l() {
            this.call();
        }
    }

    private final rx.functions.o a;
    private final p b;
    private final b c;
    private final boolean d;

    public r0(rx.functions.o o0, p p0, b b0, boolean z) {
        this.a = o0;
        this.b = p0;
        this.c = b0;
        this.d = z;
    }

    public void a(n n0) {
        g g1;
        g g0;
        rx.internal.operators.r0.a r0$a0;
        Object object0;
        try {
            object0 = this.a.call();
            r0$a0 = new rx.internal.operators.r0.a(this.c, object0);
            n0.q(r0$a0);
        }
        catch(Throwable throwable0) {
            c.f(throwable0, n0);
            return;
        }
        try {
            g0 = (g)this.b.b(object0);
            g1 = this.d ? g0.S1(r0$a0) : g0.K1(r0$a0);
        }
        catch(Throwable throwable1) {
            try {
                Throwable throwable2 = this.c(r0$a0);
                c.e(throwable1);
                c.e(throwable2);
                if(throwable2 != null) {
                    n0.onError(new rx.exceptions.b(new Throwable[]{throwable1, throwable2}));
                    return;
                }
                n0.onError(throwable1);
            }
            catch(Throwable throwable0) {
                c.f(throwable0, n0);
            }
            return;
        }
        try {
            g1.N6(h.f(n0));
            return;
        }
        catch(Throwable throwable3) {
            try {
                Throwable throwable4 = this.c(r0$a0);
                c.e(throwable3);
                c.e(throwable4);
                if(throwable4 != null) {
                    n0.onError(new rx.exceptions.b(new Throwable[]{throwable3, throwable4}));
                    return;
                }
                n0.onError(throwable3);
                return;
            }
            catch(Throwable throwable0) {
            }
        }
        c.f(throwable0, n0);
    }

    @Override  // rx.functions.b
    public void b(Object object0) {
        this.a(((n)object0));
    }

    private Throwable c(rx.functions.a a0) {
        try {
            a0.call();
            return null;
        }
        catch(Throwable throwable0) {
            return throwable0;
        }
    }
}

