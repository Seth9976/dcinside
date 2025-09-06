package rx.internal.operators;

import rx.b.J;
import rx.b;
import rx.d;
import rx.exceptions.c;
import rx.functions.p;
import rx.k;
import rx.m;
import rx.o;

public final class i implements J {
    static final class a extends m implements d {
        final d b;
        final p c;

        public a(d d0, p p0) {
            this.b = d0;
            this.c = p0;
        }

        @Override  // rx.d
        public void a(o o0) {
            this.c(o0);
        }

        @Override  // rx.d
        public void d() {
            this.b.d();
        }

        @Override  // rx.m
        public void e(Object object0) {
            b b0;
            try {
                b0 = (b)this.c.b(object0);
            }
            catch(Throwable throwable0) {
                c.e(throwable0);
                this.onError(throwable0);
                return;
            }
            if(b0 == null) {
                this.onError(new NullPointerException("The mapper returned a null Completable"));
                return;
            }
            b0.q0(this);
        }

        @Override  // rx.m, rx.d
        public void onError(Throwable throwable0) {
            this.b.onError(throwable0);
        }
    }

    final k a;
    final p b;

    public i(k k0, p p0) {
        this.a = k0;
        this.b = p0;
    }

    public void a(d d0) {
        a i$a0 = new a(d0, this.b);
        d0.a(i$a0);
        this.a.j0(i$a0);
    }

    @Override  // rx.functions.b
    public void b(Object object0) {
        this.a(((d)object0));
    }
}

