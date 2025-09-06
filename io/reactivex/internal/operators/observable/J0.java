package io.reactivex.internal.operators.observable;

import e3.g;
import io.reactivex.B;
import io.reactivex.I;
import io.reactivex.disposables.c;
import io.reactivex.exceptions.b;
import io.reactivex.internal.disposables.e;
import io.reactivex.k;
import java.util.concurrent.Callable;

public final class j0 extends B {
    static final class a implements c, k {
        final I a;
        final e3.c b;
        final g c;
        Object d;
        volatile boolean e;
        boolean f;
        boolean g;

        a(I i0, e3.c c0, g g0, Object object0) {
            this.a = i0;
            this.b = c0;
            this.c = g0;
            this.d = object0;
        }

        @Override  // io.reactivex.disposables.c
        public boolean a() {
            return this.e;
        }

        @Override  // io.reactivex.disposables.c
        public void dispose() {
            this.e = true;
        }

        private void f(Object object0) {
            try {
                this.c.accept(object0);
            }
            catch(Throwable throwable0) {
                b.b(throwable0);
                io.reactivex.plugins.a.Y(throwable0);
            }
        }

        public void g() {
            Object object0 = this.d;
            if(this.e) {
                this.d = null;
                this.f(object0);
                return;
            }
            e3.c c0 = this.b;
            while(true) {
                if(this.e) {
                    this.d = null;
                    this.f(object0);
                    return;
                }
                try {
                    this.g = false;
                    object0 = c0.apply(object0, this);
                    if(!this.f) {
                        continue;
                    }
                    goto label_21;
                }
                catch(Throwable throwable0) {
                }
                break;
            }
            b.b(throwable0);
            this.d = null;
            this.e = true;
            this.onError(throwable0);
            this.f(object0);
            return;
        label_21:
            this.e = true;
            this.d = null;
            this.f(object0);
        }

        @Override  // io.reactivex.k
        public void onComplete() {
            if(!this.f) {
                this.f = true;
                this.a.onComplete();
            }
        }

        @Override  // io.reactivex.k
        public void onError(Throwable throwable0) {
            if(this.f) {
                io.reactivex.plugins.a.Y(throwable0);
                return;
            }
            if(throwable0 == null) {
                throwable0 = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            this.f = true;
            this.a.onError(throwable0);
        }

        @Override  // io.reactivex.k
        public void onNext(Object object0) {
            if(!this.f) {
                if(this.g) {
                    this.onError(new IllegalStateException("onNext already called in this generate turn"));
                    return;
                }
                if(object0 == null) {
                    this.onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
                    return;
                }
                this.g = true;
                this.a.onNext(object0);
            }
        }
    }

    final Callable a;
    final e3.c b;
    final g c;

    public j0(Callable callable0, e3.c c0, g g0) {
        this.a = callable0;
        this.b = c0;
        this.c = g0;
    }

    @Override  // io.reactivex.B
    public void I5(I i0) {
        Object object0;
        try {
            object0 = this.a.call();
        }
        catch(Throwable throwable0) {
            b.b(throwable0);
            e.g(throwable0, i0);
            return;
        }
        a j0$a0 = new a(i0, this.b, this.c, object0);
        i0.b(j0$a0);
        j0$a0.g();
    }
}

