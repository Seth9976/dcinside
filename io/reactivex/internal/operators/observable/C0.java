package io.reactivex.internal.operators.observable;

import e3.o;
import io.reactivex.G;
import io.reactivex.I;
import io.reactivex.disposables.c;
import io.reactivex.exceptions.b;
import io.reactivex.internal.disposables.d;
import java.util.Iterator;

public final class c0 extends a {
    static final class io.reactivex.internal.operators.observable.c0.a implements I, c {
        final I a;
        final o b;
        c c;

        io.reactivex.internal.operators.observable.c0.a(I i0, o o0) {
            this.a = i0;
            this.b = o0;
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
            this.c = d.a;
        }

        @Override  // io.reactivex.I
        public void onComplete() {
            d d0 = d.a;
            if(this.c == d0) {
                return;
            }
            this.c = d0;
            this.a.onComplete();
        }

        @Override  // io.reactivex.I
        public void onError(Throwable throwable0) {
            d d0 = d.a;
            if(this.c == d0) {
                io.reactivex.plugins.a.Y(throwable0);
                return;
            }
            this.c = d0;
            this.a.onError(throwable0);
        }

        @Override  // io.reactivex.I
        public void onNext(Object object0) {
            Object object2;
            I i0;
            Iterator iterator0;
            if(this.c == d.a) {
                return;
            }
            try {
                iterator0 = ((Iterable)this.b.apply(object0)).iterator();
                i0 = this.a;
            }
            catch(Throwable throwable0) {
                b.b(throwable0);
                this.c.dispose();
                this.onError(throwable0);
                return;
            }
            while(true) {
                try {
                    if(!iterator0.hasNext()) {
                        break;
                    }
                }
                catch(Throwable throwable1) {
                    b.b(throwable1);
                    this.c.dispose();
                    this.onError(throwable1);
                    return;
                }
                try {
                    Object object1 = iterator0.next();
                    object2 = io.reactivex.internal.functions.b.g(object1, "The iterator returned a null value");
                }
                catch(Throwable throwable2) {
                    b.b(throwable2);
                    this.c.dispose();
                    this.onError(throwable2);
                    return;
                }
                i0.onNext(object2);
            }
        }
    }

    final o b;

    public c0(G g0, o o0) {
        super(g0);
        this.b = o0;
    }

    @Override  // io.reactivex.B
    protected void I5(I i0) {
        io.reactivex.internal.operators.observable.c0.a c0$a0 = new io.reactivex.internal.operators.observable.c0.a(i0, this.b);
        this.a.d(c0$a0);
    }
}

