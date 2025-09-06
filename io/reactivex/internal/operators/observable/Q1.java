package io.reactivex.internal.operators.observable;

import io.reactivex.G;
import io.reactivex.I;
import io.reactivex.disposables.c;
import io.reactivex.internal.disposables.d;
import io.reactivex.internal.disposables.e;

public final class q1 extends a {
    static final class io.reactivex.internal.operators.observable.q1.a implements I, c {
        final I a;
        boolean b;
        c c;
        long d;

        io.reactivex.internal.operators.observable.q1.a(I i0, long v) {
            this.a = i0;
            this.d = v;
        }

        @Override  // io.reactivex.disposables.c
        public boolean a() {
            return this.c.a();
        }

        @Override  // io.reactivex.I
        public void b(c c0) {
            if(d.i(this.c, c0)) {
                this.c = c0;
                if(this.d == 0L) {
                    this.b = true;
                    c0.dispose();
                    e.d(this.a);
                    return;
                }
                this.a.b(this);
            }
        }

        @Override  // io.reactivex.disposables.c
        public void dispose() {
            this.c.dispose();
        }

        @Override  // io.reactivex.I
        public void onComplete() {
            if(!this.b) {
                this.b = true;
                this.c.dispose();
                this.a.onComplete();
            }
        }

        @Override  // io.reactivex.I
        public void onError(Throwable throwable0) {
            if(this.b) {
                io.reactivex.plugins.a.Y(throwable0);
                return;
            }
            this.b = true;
            this.c.dispose();
            this.a.onError(throwable0);
        }

        @Override  // io.reactivex.I
        public void onNext(Object object0) {
            if(!this.b) {
                long v = this.d;
                this.d = v - 1L;
                if(v > 0L) {
                    this.a.onNext(object0);
                    if(v - 1L == 0L) {
                        this.onComplete();
                    }
                }
            }
        }
    }

    final long b;

    public q1(G g0, long v) {
        super(g0);
        this.b = v;
    }

    @Override  // io.reactivex.B
    protected void I5(I i0) {
        io.reactivex.internal.operators.observable.q1.a q1$a0 = new io.reactivex.internal.operators.observable.q1.a(i0, this.b);
        this.a.d(q1$a0);
    }
}

