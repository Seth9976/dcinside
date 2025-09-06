package io.reactivex.internal.operators.observable;

import e3.r;
import io.reactivex.G;
import io.reactivex.I;
import io.reactivex.disposables.c;
import io.reactivex.exceptions.b;
import io.reactivex.internal.disposables.d;

public final class v1 extends a {
    static final class io.reactivex.internal.operators.observable.v1.a implements I, c {
        final I a;
        final r b;
        c c;
        boolean d;

        io.reactivex.internal.operators.observable.v1.a(I i0, r r0) {
            this.a = i0;
            this.b = r0;
        }

        @Override  // io.reactivex.disposables.c
        public boolean a() {
            return this.c.a();
        }

        @Override  // io.reactivex.I
        public void b(c c0) {
            if(d.i(this.c, c0)) {
                this.c = c0;
                this.a.b(this);
            }
        }

        @Override  // io.reactivex.disposables.c
        public void dispose() {
            this.c.dispose();
        }

        @Override  // io.reactivex.I
        public void onComplete() {
            if(!this.d) {
                this.d = true;
                this.a.onComplete();
            }
        }

        @Override  // io.reactivex.I
        public void onError(Throwable throwable0) {
            if(!this.d) {
                this.d = true;
                this.a.onError(throwable0);
                return;
            }
            io.reactivex.plugins.a.Y(throwable0);
        }

        @Override  // io.reactivex.I
        public void onNext(Object object0) {
            if(!this.d) {
                this.a.onNext(object0);
                try {
                    if(this.b.test(object0)) {
                        goto label_9;
                    }
                }
                catch(Throwable throwable0) {
                    b.b(throwable0);
                    this.c.dispose();
                    this.onError(throwable0);
                }
                return;
            label_9:
                this.d = true;
                this.c.dispose();
                this.a.onComplete();
            }
        }
    }

    final r b;

    public v1(G g0, r r0) {
        super(g0);
        this.b = r0;
    }

    @Override  // io.reactivex.B
    public void I5(I i0) {
        io.reactivex.internal.operators.observable.v1.a v1$a0 = new io.reactivex.internal.operators.observable.v1.a(i0, this.b);
        this.a.d(v1$a0);
    }
}

