package io.reactivex.internal.operators.observable;

import io.reactivex.G;
import io.reactivex.I;
import io.reactivex.disposables.c;
import io.reactivex.internal.disposables.d;
import java.util.ArrayDeque;

public final class r1 extends a {
    static final class io.reactivex.internal.operators.observable.r1.a extends ArrayDeque implements I, c {
        final I a;
        final int b;
        c c;
        volatile boolean d;
        private static final long e = 7240042530241604978L;

        io.reactivex.internal.operators.observable.r1.a(I i0, int v) {
            this.a = i0;
            this.b = v;
        }

        @Override  // io.reactivex.disposables.c
        public boolean a() {
            return this.d;
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
            if(!this.d) {
                this.d = true;
                this.c.dispose();
            }
        }

        @Override  // io.reactivex.I
        public void onComplete() {
            I i0 = this.a;
            while(true) {
                if(this.d) {
                    return;
                }
                Object object0 = this.poll();
                if(object0 == null) {
                    if(!this.d) {
                        i0.onComplete();
                    }
                    return;
                }
                i0.onNext(object0);
            }
        }

        @Override  // io.reactivex.I
        public void onError(Throwable throwable0) {
            this.a.onError(throwable0);
        }

        @Override  // io.reactivex.I
        public void onNext(Object object0) {
            if(this.b == this.size()) {
                this.poll();
            }
            this.offer(object0);
        }
    }

    final int b;

    public r1(G g0, int v) {
        super(g0);
        this.b = v;
    }

    @Override  // io.reactivex.B
    public void I5(I i0) {
        io.reactivex.internal.operators.observable.r1.a r1$a0 = new io.reactivex.internal.operators.observable.r1.a(i0, this.b);
        this.a.d(r1$a0);
    }
}

